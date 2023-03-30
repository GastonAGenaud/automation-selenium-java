package pages;

import EnvironmentManager.Environment;
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

import java.io.IOException;
import java.time.Duration;

import static java.lang.Math.random;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }

    ;

    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    @FindBy(id = "loader")
    public WebElement loader;

    @FindBy(how = How.CSS, using = "#signup-header-text-customize")
    public WebElement signUpNowBtn;
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement newEmailBtn;
    @FindBy(how = How.CSS, using = "#username")
    public WebElement newUsernameBtn;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement newPasswordBtn;
    @FindBy(how = How.CSS, using = "#signup-button")
    public WebElement signUpBtn;

    @FindBy(how = How.CSS, using = "#buyer > div > div:nth-child(1) > div.card.card-dashboard.min-h-16.mb-3 > div > div.flex-column.text-center > a")
    public WebElement mySettingsValidateText;

    public boolean validatingSettingsText() {
        fluentWait(getDriver(), mySettingsValidateText);
        boolean result = mySettingsValidateText.isDisplayed();
        return result;
    }


    public SessionManager sessionManager = new SessionManager(getDriver());
    public String password = Environment.getProperty("password");
    public String email = Environment.getProperty("email");
    public String url = Environment.getProperty("url");
    public String baseUrlOHE = Environment.getProperty("baseUrlOHE");
    public String UrlSVC = Environment.getProperty("UrlSVC");
    public String urlServicesProd = Environment.getProperty("UrlServicesProd");
    public String UrlProduct = "https://mtreborn-automation-products.azurewebsites.net/listing/detail/740";
    String randomStr = RandomStringUtils.randomAlphabetic(20);
    public String rdm = Long.toString(System.currentTimeMillis());

    String randomEmail = rdm + Long.toString((int) random() * 1200);

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
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);

        wait.until(webDriver -> element.isDisplayed());
    }

    public void fluentWaitElementDisappears(WebDriver driver, WebElement element) {
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);

        wait.until(webDriver -> !element.isDisplayed());
    }

    public void fluentWaitStrict(WebDriver driver, WebElement element) {
        wait(5);
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);

        wait.until(webDriver -> element.isDisplayed() && element.isEnabled());

    }

    protected boolean loaded(WebElement element) {
        WebDriverWait wait = getWait();
        return wait.until((ExpectedCondition<Boolean>) wd ->
                element.isDisplayed());
    }

    public void waitToLoad() {
        getWait().until(d -> ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));
    }

    public void waitForClickability(WebElement element) {
        // TODO: change access modifier to private or throw exception because in now is hiding wrong behavior with wrongs locators
        WebDriverWait wait = getWait();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            System.out.println("Element is not ready to be clicked" + e.getMessage());
        }
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


    public void getHomePageOWL() {
        getDriver().navigate().to(baseUrlOHE);
    }


    public void getLoginPage() {
        wait(2);
        getDriver().navigate().to(url + "Account/Login");
    }

    public void getLoginPageOWL() {
        getDriver().navigate().to(baseUrlOHE + "Account/Login");
    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";


    public void login3() {
        getDriver().navigate().to(url + "/Account/Login");
        fluentWaitStrict(getDriver(), emailLoginInput);
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("Gaston2NoBorrar@hotmail.com");
        fluentWait(getDriver(), passwordLoginInput);
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("#NcUzbusYqu667gq");
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
    }

    public void login() {
        getDriver().navigate().to(baseUrlOHE + "Account/Login");
        fluentWaitStrict(getDriver(), emailLoginInput);
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("dev@mymarketplacebuilder.com");

        fluentWait(getDriver(), passwordLoginInput);
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("uX$Z2Z4^Ye3z,2&A");

        waitForWebElementAndClick(logInBtn);
    }

    public void loginDevSVC() {
        getDriver().navigate().to(UrlSVC + "Account/Login");
        fluentWaitStrict(getDriver(), emailLoginInput);
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("dev@mymarketplacebuilder.com");

        fluentWait(getDriver(), passwordLoginInput);
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("uX$Z2Z4^Ye3z,2&A");

        waitForWebElementAndClick(logInBtn);
    }

    public void loginWithGastonUserSVC() {
        getDriver().navigate().to(UrlSVC + "Account/Login");
        fluentWaitStrict(getDriver(), emailLoginInput);
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("gastongenaud@7r1ck.com");

        fluentWait(getDriver(), passwordLoginInput);
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("#NcUzbusYqu667gq");

        waitForWebElementAndClick(logInBtn);
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
        getHomePageOWL();
        getLoginPageOWL();
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("matias@mymarketplacebuilder.com");
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("Test1234!");
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
        //retryingFindClick(logInBtn);
        wait(2);
        sessionManager.storeSessionFile("MatiasUser-data-session");
        wait(5);
        getDriver().manage().deleteAllCookies();
        getHomePageOWL();
        getDriver().navigate().refresh();
    }

    public void loginWithDevOwl() throws IOException {
        getHomePageOWL();
        getLoginPageOWL();
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("dev@mymarketplacebuilder.com");
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("uX$Z2Z4^Ye3z,2&A");
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
        //retryingFindClick(logInBtn);
        wait(2);
        sessionManager.storeSessionFile("DevUserOwl-data-session");
        wait(5);
        getDriver().manage().deleteAllCookies();
        getHomePageOWL();
        getDriver().navigate().refresh();
    }

    public void loginWithGastonNoBorrar() throws IOException {
        //  getHomePage();
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

    public void CreateAnAccountListingDetails(String text) {
        getDriver().navigate().to(url);

        waitForVisibility(signUpNowBtn);
        fluentWaitStrict(getDriver(), signUpNowBtn);
        fluentWait(getDriver(), signUpNowBtn);
        waitForWebElementAndClick(signUpNowBtn);

        fluentWaitStrict(getDriver(), newEmailBtn);
        fluentWait(getDriver(), newEmailBtn);
        waitForWebElementAndClick(newEmailBtn);

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), newEmailBtn);
        waitForWebElementAndClick(newEmailBtn);
        newEmailBtn.sendKeys(text + randomEmail + "auto@trick.com");

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.clear();
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), newPasswordBtn);
        fluentWait(getDriver(), newPasswordBtn);
        waitForWebElementAndClick(newPasswordBtn);
        newPasswordBtn.click();

        fluentWaitStrict(getDriver(), newPasswordBtn);
        fluentWait(getDriver(), newPasswordBtn);
        waitForWebElementAndClick(newPasswordBtn);
        newPasswordBtn.sendKeys("asdasdasq21231@A");
        newPasswordBtn.clear();
        newPasswordBtn.sendKeys("asdasdasq21231@A");

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), signUpBtn);
        fluentWait(getDriver(), signUpBtn);
        waitForWebElementAndClick(signUpBtn);

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.clear();
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), signUpBtn);
        fluentWait(getDriver(), signUpBtn);
        waitForWebElementAndClick(signUpBtn);


        wait(4);
        //welcomeClose.click();

    }

    public boolean retryingFindClick(WebElement element) {
        boolean result = false;
        int attempts = 0;
        while (attempts < 2) {
            try {
                wait(7);
                element.click();
                result = true;
                break;
            } catch (StaleElementReferenceException e) {
            }
            attempts++;
        }
        return result;
    }

    public void CreateAnAccountListingDetailsOHE(String text) {
        getDriver().navigate().to(baseUrlOHE);

        waitForVisibility(signUpNowBtn);
        fluentWaitStrict(getDriver(), signUpNowBtn);
        fluentWait(getDriver(), signUpNowBtn);
        waitForWebElementAndClick(signUpNowBtn);

        fluentWaitStrict(getDriver(), newEmailBtn);
        fluentWait(getDriver(), newEmailBtn);
        waitForWebElementAndClick(newEmailBtn);

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), newEmailBtn);
        waitForWebElementAndClick(newEmailBtn);
        newEmailBtn.sendKeys(text + randomEmail + "auto@trick.com");

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.clear();
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), newPasswordBtn);
        fluentWait(getDriver(), newPasswordBtn);
        waitForWebElementAndClick(newPasswordBtn);
        newPasswordBtn.click();

        fluentWaitStrict(getDriver(), newPasswordBtn);
        fluentWait(getDriver(), newPasswordBtn);
        waitForWebElementAndClick(newPasswordBtn);
        newPasswordBtn.sendKeys("asdasdasq21231@A");

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(randomStr);

        wait(4);
        //welcomeClose.click();

    }

    public void CreateAnAccountListingDetailsSVC(String text) {
        getDriver().navigate().to(UrlSVC);

        waitForVisibility(signUpNowBtn);
        fluentWaitStrict(getDriver(), signUpNowBtn);
        fluentWait(getDriver(), signUpNowBtn);
        waitForWebElementAndClick(signUpNowBtn);

        fluentWaitStrict(getDriver(), newEmailBtn);
        fluentWait(getDriver(), newEmailBtn);
        waitForWebElementAndClick(newEmailBtn);

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), newEmailBtn);
        waitForWebElementAndClick(newEmailBtn);
        newEmailBtn.sendKeys(text + randomEmail + "auto@trick.com");

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.clear();
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), newPasswordBtn);
        fluentWait(getDriver(), newPasswordBtn);
        waitForWebElementAndClick(newPasswordBtn);
        newPasswordBtn.click();

        fluentWaitStrict(getDriver(), newPasswordBtn);
        fluentWait(getDriver(), newPasswordBtn);
        waitForWebElementAndClick(newPasswordBtn);
        newPasswordBtn.sendKeys("asdasdasq21231@A");

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(randomStr);

        wait(4);
        //welcomeClose.click();

    }

}

