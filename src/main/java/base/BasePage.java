package base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    private long LOAD_TIMEOUT = 25;

    protected BasePage (WebDriver driver) {
        this.driver = driver;

    }
    private void setTimeOutValue() {
        try {
            LOAD_TIMEOUT = Long.parseLong(System.getProperty("LOAD_TIMEOUT"));
        }catch (Exception e) {
            // continue with the default value, I personally prefer 25secs as 30secs is very close to Gateway(502) error, just curious, do you think the same QA Automation of lamansys?
        }
    }

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitForInvisibility(WebElement element) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = getWait();
        wait.until(d -> {
            try {
                return !element.isDisplayed();
            } catch (StaleElementReferenceException | NoSuchElementException e) {
                return true;
            }
        });
        DriverManager.setTimeouts(driver);
    }

    public boolean isElementVisible(WebElement element) {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
            return element.isDisplayed();
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
            return false;
        }finally {
            DriverManager.setTimeouts(driver);
        }
    }
    public WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
    }


}
