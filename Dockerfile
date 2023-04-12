FROM ubuntu:latest
LABEL maintainer="Gaston Genaud <gastongenaud@7r1ck.com>"

ARG ENVIRONMENT='staging'
ARG SUITE='services'
ARG SCOPE='@MMRS'
# Update repositories and install dependencies
RUN apt-get update && \
    apt-get install -y wget curl unzip ssh && \
    apt-get install -y openjdk-8-jdk && \
    apt-get install -y maven && \
    apt-get install -y libx11-xcb1 libxrandr2 libasound2 libpangocairo-1.0-0 libatk1.0-0 libatk-bridge2.0-0 libgtk-3-0 libdrm2 libgbm1 xvfb

RUN apt-get install -y gnupg
RUN apt-get install -y zip
RUN apt-get update && apt-get install -y git

# Download and install Google Chrome
RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - && \
    echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google-chrome.list && \
    apt-get update && \
    apt-get install -y google-chrome-stable

# Set up environment variables for Selenium
ENV DISPLAY=:99
ENV DBUS_SESSION_BUS_ADDRESS=/dev/null

# Expose the SSH port
EXPOSE 2222
# Expose ports for Selenium
EXPOSE 4444 9515 5900

# Set the working directory and copy the source code
WORKDIR /test-automation
COPY . /test-automation

# Set the working directory and clone the repo
WORKDIR /test-automation
RUN  git config --global user.email "6423b4365534b0bf7442c27d@bots.bitbucket.org"

RUN sed -i "s/(@SCOPE)/(${SCOPE})/g" ./src/test/java/runner/Runner.java
RUN cat ./src/test/java/runner/Runner.java

# Download and set up ChromeDriver
RUN CHROME_DRIVER_VERSION=`curl -sS chromedriver.storage.googleapis.com/LATEST_RELEASE` && \
    wget -q -O /tmp/chromedriver_linux64.zip https://chromedriver.storage.googleapis.com/$CHROME_DRIVER_VERSION/chromedriver_linux64.zip && \
    unzip /tmp/chromedriver_linux64.zip chromedriver -d /usr/local/bin/ && \
    rm /tmp/chromedriver_linux64.zip

# Download and set up Selenium
RUN wget -q https://selenium-release.storage.googleapis.com/3.9/selenium-server-standalone-3.9.0.jar

# Set up Maven
ENV MAVEN_HOME=/usr/share/maven
ENV PATH=${MAVEN_HOME}/bin:${PATH}
# Install and set up Java
RUN apt-get install -y openjdk-18-jdk

# Install Node.js and Firebase CLI
RUN curl -fsSL https://deb.nodesource.com/setup_16.x | bash - && \
    apt-get install -y nodejs && \
    npm install -g firebase-tools

ENV FIREBASE_TOKEN=1//0hO2VR0eCdzdvCgYIARAAGBESNwF-L9IrHlwBVIqRMI1vzlucSpIKASjBCf0h-x5ZhkrpHgmAWsq7EdL78USHvPt84WIEc9EoATU

RUN apt-get install -y dos2unix
RUN dos2unix upload_to_bitbucket.sh deploy_to_firebase_products_pre-staging.sh deploy_to_firebase_services_pre-staging.sh deploy_to_firebase_products_staging.sh deploy_to_firebase_services_staging.sh

RUN chmod +x upload_to_bitbucket.sh
RUN chmod +x deploy_to_firebase_products_pre-staging.sh
RUN chmod +x deploy_to_firebase_services_pre-staging.sh
RUN chmod +x deploy_to_firebase_products_staging.sh
RUN chmod +x deploy_to_firebase_services_staging.sh
# Set up Xvfb
ENV DISPLAY=:99
RUN Xvfb :99 -screen 0 1024x768x16 &


# Run the test and upload the firebase report
#CMD ["bash", "-c", "mvn -f /test-automation/pom.xml clean test -Denv=staging; ls; ./deploy_to_firebase_products_pre-staging.sh"]
CMD ["bash", "-c", "mvn -f /test-automation/pom.xml clean test -Denv=${ENVIRONMENT} -Dsuite=${SUITE} ; ls; ./deploy_to_firebase_${SUITE}_${ENVIRONMENT}.sh && ./upload_to_bitbucket.sh"]