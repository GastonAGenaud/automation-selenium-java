FROM ubuntu:latest
LABEL maintainer="Gaston Genaud <gastongenaud@7r1ck.com>"

# Update repositories and install dependencies
RUN apt-get update && \
    apt-get install -y wget curl unzip ssh && \
    apt-get install -y openjdk-8-jdk && \
    apt-get install -y maven && \
    apt-get install -y libx11-xcb1 libxrandr2 libasound2 libpangocairo-1.0-0 libatk1.0-0 libatk-bridge2.0-0 libgtk-3-0 libdrm2 libgbm1 xvfb

RUN apt-get install -y gnupg

# Download and install Google Chrome
RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - && \
    echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google-chrome.list && \
    apt-get update && \
    apt-get install -y google-chrome-stable

# Set up environment variables for Selenium
ENV DISPLAY=:99
ENV DBUS_SESSION_BUS_ADDRESS=/dev/null

# Copy the SSH public key and set up SSH
COPY key.pub /root/.ssh/authorized_keys
RUN chmod 0600 /root/.ssh/authorized_keys && \
    mkdir /run/sshd && \
    sed -i 's/#PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config && \
    echo "root:root" | chpasswd

# Expose the SSH port
EXPOSE 22
# Expose ports for Selenium
EXPOSE 4444 9515 5900

# Set the working directory and copy the source code
WORKDIR /test-automation
COPY . /test-automation

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
RUN chmod +x deploy_to_firebase.sh  

# Set up Xvfb
ENV DISPLAY=:99
RUN Xvfb :99 -screen 0 1024x768x16 &

# Run the test and upload the firebase report
CMD ["bash", "-c", "mvn -f /test-automation/pom.xml clean test -Denv=pre-staging && ls && ./deploy_to_firebase.sh"]
