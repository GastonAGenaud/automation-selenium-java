package driver;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
    static WebDriver driver;
    @BeforeSuite
    @Before
    public static void setup() {
        if (webDriver.get() == null) {
             webDriver.set(createDriver());
            driver = webDriver.get();
        }
    }


    public static WebDriver getDriver() {
        setup();
        return driver;
    }

    private static WebDriver createDriver() {
        WebDriver driver;
        if (getBrowserType() == "chrome") {
            if (getHeadlessMode()) {
                ChromeOptions options = new ChromeOptions();
                options.setHeadless(true);
                driver = new ChromeDriver(options);
            }
            else {
                driver = new ChromeDriver();
            }
        } else if (getBrowserType() == "firefox") {
            driver = new FirefoxDriver();

        }
        else {
            if (getHeadlessMode()) {
                ChromeOptions options = new ChromeOptions();
                options.setHeadless(true);
                options.addArguments("--window-size=1920,1080");
                driver = new ChromeDriver(options);
            }
            else {
                driver = new ChromeDriver();
            }
        }

        driver.manage().window().maximize();
        return driver;
    }

    public static String getBrowserType() {
        String browserType = null;

        try {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
            properties.load(file);
            browserType = properties.getProperty("browser").toLowerCase().trim();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return browserType;
    }

    public static Boolean getHeadlessMode() {
        String headless = null;
        Boolean result = false;

        try {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
            properties.load(file);
            headless = properties.getProperty("headless").toLowerCase().trim();
            result = Boolean.parseBoolean(headless);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public static String getPassword() {
        String password = null;

        try {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
            properties.load(file);
            password = properties.getProperty("password");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return password;
    }
    public static String getUrl() {
        String url = null;

        try {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
            properties.load(file);
            url = properties.getProperty("url");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return url;
    }
    public static void cleanupDriver() {
        webDriver.get().quit();
        webDriver.remove();

    }
}
