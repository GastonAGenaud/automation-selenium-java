package base;

import com.google.inject.Provider;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.time.Duration;


public interface DriverManager extends Provider<WebDriver> {

	long IMPLICIT_WAIT_TIMEOUT = 25;
	Logger LOG = LoggerFactory.getLogger(DriverManager.class.getName());

	 void setup();
     WebDriver createDriver() throws MalformedURLException;
     WebDriver get();
     void quitDriver();

     static void setTimeouts(WebDriver driver) {
    	 long impTimeout= getImplicitWaitTimeout();
    	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(impTimeout));
    	 	LOG.debug("Using implicit wait timeout: " + impTimeout);
     }

     static long getImplicitWaitTimeout() {
     	long timeout = IMPLICIT_WAIT_TIMEOUT;
     	try {
     		timeout = Long.parseLong(System.getProperty("IMPLICIT_WAIT_TIMEOUT"));
     	}catch (Exception e) {
     		// continue with the default value,
     	}
     	return timeout;
     }

}
