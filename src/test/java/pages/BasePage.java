package pages;

import SessionManager.SessionManager;
import driver.DriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import EnvironmentManager.Environment;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }


    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }

    public SessionManager sessionManager = new SessionManager(getDriver());
    String password = Environment.getProperty("password");
    String email = Environment.getProperty("email");
    String url = Environment.getProperty("url");

    ///// Selector ////

    public void navigateTo(String url) {
        getDriver().get(url);
    }

    public void waitForInvisibility(WebElement element) {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = getWait();
        wait.until(d -> {
            try {
                return !element.isDisplayed();
            } catch (StaleElementReferenceException | NoSuchElementException e) {
                return true;
            }
        });
    }

    public void waitForVisibility(WebElement element) {
        try {
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            getWait().until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    try {
                        return element.isDisplayed();
                    } catch (NoSuchElementException | StaleElementReferenceException ignored) {
                        return false;
                    }
                }

                public String toString() {
                    return "visibility of " + element;
                }
            });
        } finally {
        }
    }

    public void fluentWait(WebDriver driver, WebElement element) {
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        wait.until(webDriver -> element.isDisplayed());
    }

    public String generateRandomNumber(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    public String generateRandomString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    public void sendKeys(By by, String textToType) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textToType);
    }

    public void sendKeys(WebElement element, String textToType) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);
    }

    public void waitFor(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public void waitFor(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement findSpanByText(String text) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        By messageLocator = By.xpath(String.format("//*[starts-with(text(), '%s')]", text));
        wait.until(ExpectedConditions.presenceOfElementLocated(messageLocator));
        return getDriver().findElement(messageLocator);
    }

    public void waitForWebElementAndClick(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void waitForWebElementAndClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait;
    }

    public void getHomePage() {
        getDriver().navigate().to(url);
    }

    public void getLoginPage() {
        getDriver().navigate().to(url + "Account/Login");
    }


    public void loginWithMakeAnOffer() throws IOException {
        getHomePage();
        getLoginPage();
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("makeanoffer@automation.com");
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("Automation123@");
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
        wait(7);
        sessionManager.storeSessionFile("makeAnOffer");
        wait(7);
        getDriver().manage().deleteAllCookies();
        getHomePage();
        getDriver().manage().deleteAllCookies();
        getDriver().navigate().refresh();
    }

    public void loginWithGastonUser() throws IOException {
        getHomePage();
        getLoginPage();
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("gastongenaud@7r1ck.com");
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("#NcUzbusYqu667gq");
        wait(2);
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
        wait(7);
        sessionManager.storeSessionFile("GastonUser");
        wait(7);
        getDriver().manage().deleteAllCookies();
        getHomePage();
        getDriver().manage().deleteAllCookies();
        getDriver().navigate().refresh();
    }

    public void loginWithDev() throws IOException {
        getHomePage();
        getLoginPage();
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("dev@mymarketplacebuilder.com");
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("uX$Z2Z4^Ye3z,2&A");
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
        wait(7);
        sessionManager.storeSessionFile("DevUser");
        wait(7);
        getDriver().manage().deleteAllCookies();
        getHomePage();
        getDriver().manage().deleteAllCookies();
        getDriver().navigate().refresh();
    }

    public void loginWithGoodWillUser() throws IOException {
        getHomePage();
        getLoginPage();
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("portsaintlucie@yopmail.com");
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("Test123@");
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
        wait(2);
        sessionManager.storeSessionFile("GoodWillUser-data-session");
        wait(5);
        getDriver().manage().deleteAllCookies();
        getHomePage();
        getDriver().manage().deleteAllCookies();
        getDriver().navigate().refresh();
    }

    public void loginWithMatiasOwl() throws IOException {
        getHomePage();
        getLoginPage();
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("matias@mymarketplacebuilder.com");
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("Test1234!");
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
        wait(2);
        sessionManager.storeSessionFile("MatiasUser-data-session");
        wait(5);
        getDriver().manage().deleteAllCookies();
        getHomePage();
        getDriver().navigate().refresh();
    }

    public void loginWithGastonNoBorrar() throws IOException {
        getHomePage();
        getLoginPage();
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("Gaston2NoBorrar@hotmail.com");
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("#NcUzbusYqu667gq");
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
        wait(2);
        sessionManager.storeSessionFile("GastonNoBorrarUser-data-session");
        wait(5);
        getDriver().manage().deleteAllCookies();
        getHomePage();
        getDriver().navigate().refresh();
    }


    /////SIGN UP/////

    public void gwCreateAnAccountListingDetails() {

    }

    public void CreateAnAccountListingDetails() {

    }


}

