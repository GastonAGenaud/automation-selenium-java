package pages.signup;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import static java.lang.Math.random;

public class OHESignupPage extends BasePage {


    public OHESignupPage() {
        super();
    }


    Actions actions = new Actions(getDriver());
    String rdm = Long.toString(System.currentTimeMillis());
    String randomStr = RandomStringUtils.randomAlphabetic(20);
    String randomEmail = rdm + Long.toString((int) random() * 1200);

    @FindBy(xpath = "//button[contains(string(),'%s')]")
    public WebElement buttonWithText;
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement pricingBtn;

    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailTextField;
    @FindBy(how = How.CSS, using = "#username")
    public WebElement usernameTextField;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordTextField;
    @FindBy(how = How.CSS, using = "#signup-button")
    public WebElement signupBtn;
    @FindBy(how = How.CSS, using = "#welcome > div > div > div > button > span")
    public WebElement closeBtnWindow;
    @FindBy(how = How.CSS, using = "#welcome > div > div > div > h4")
    public WebElement welcomeText;

    @FindBy(how = How.CSS, using = "#navbar-nav > ul > li:nth-child(5)")
    public WebElement headerSignUpBtn;

    @FindBy(how = How.CSS, using = "#RXJyb3JQbGVhc2UlMjByZW1vdmUlMjBhbnklMjBzcGVjaWFsJTIwY2hhcmFjdGVycyUyMGZyb20lMjB5b3VyJTIwdXNlcm5hbWUucmVk > div.iziToast-body > div.iziToast-texts")
    public WebElement lastErrorValidate;

    @FindBy(how = How.CSS, using = "#imSellerSelector > div > label > div > div")
    public WebElement imSellerBtn;
    @FindBy(xpath = "//div[@class='iziToast-texts']")
    public WebElement errorMessageSignUp;

    @FindBy(xpath = "//div[@class='iziToast-body']")
    public WebElement errorMessage2;

    @FindBy(how = How.CSS, using = "#seller-buyer-button")
    public WebElement nextBtn;

    @FindBy(how = How.CSS, using = "#\\35 4")
    public WebElement howOld;

    @FindBy(how = How.CSS, using = "#\\35 5")
    public WebElement howMuch;

    @FindBy(how = How.CSS, using = "#\\35 6")
    public WebElement agreeTerms;

    @FindBy(how = How.CSS, using = "#\\35 7")
    public WebElement whereAreYou;

    @FindBy(how = How.CSS, using = "#submit-button")
    public WebElement submitBtn;

    @FindBy(xpath = "//h2[contains(text(), 'You haven’t created any listings yet')]")
    public WebElement validateFirstText;


    public void goToSignUp() {
        getDriver().navigate().to(baseUrlOHE);
    }

    public void emailTextField(String text) {
        String id = rdm + Long.toString((int) random() * 1200);
        fluentWait(getDriver(), emailTextField);
        waitForWebElementAndClick(emailTextField);
        emailTextField.sendKeys(text + id + "@7r1ck.com");
    }

    public void userNameTextField(String text) {
        String id = rdm + Long.toString((int) random() * 1200);
        fluentWait(getDriver(), usernameTextField);
        waitForWebElementAndClick(usernameTextField);
        usernameTextField.sendKeys(text + "AutomationTest123");
    }

    public void passwordTextField() {
        fluentWait(getDriver(), passwordTextField);
        waitForWebElementAndClick(passwordTextField);
        passwordTextField.sendKeys("Hola123!");
        passwordTextField.clear();
        passwordTextField.sendKeys("Hola123!");
    }

    public void signUpBtn() {
        waitForVisibility(signupBtn);
        waitForClickability(signupBtn);
        fluentWait(getDriver(), signupBtn);
        waitForWebElementAndClick(signupBtn);
    }

    public boolean welcomeText() {
        fluentWait(getDriver(), welcomeText);
        boolean result = welcomeText.isDisplayed();
        return result;
    }

    public void headerSignUpButton() {
        fluentWait(getDriver(), headerSignUpBtn);
        waitForWebElementAndClick(headerSignUpBtn);
    }

    public boolean validateTextFirst() {
        fluentWait(getDriver(), validateFirstText);
        boolean result = validateFirstText.isDisplayed();
        return result;
    }


    public boolean validateLastError() {
        try {
            fluentWaitElementDisappears(getDriver(), lastErrorValidate);
            boolean result = lastErrorValidate.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(4);

            boolean result = lastErrorValidate.isDisplayed();
            return result;
        }
    }


    public void submitButton() {
        fluentWait(getDriver(), submitBtn);
        waitForWebElementAndClick(submitBtn);
    }

    public void whereAreYouFrom() {
        fluentWaitStrict(getDriver(), whereAreYou);
        waitForWebElementAndClick(whereAreYou);
        whereAreYou.sendKeys("test");
    }

    public void termsAndConditions() {
        fluentWait(getDriver(), agreeTerms);
        waitForWebElementAndClick(agreeTerms);
        agreeTerms.sendKeys("Yes");
    }

    public void howMuchSell() {
        waitForVisibility(howMuch);
        waitForClickability(howMuch);
        fluentWaitStrict(getDriver(), howMuch);
        waitForWebElementAndClick(howMuch);
        howMuch.sendKeys("test");
    }

    public void completeFormSignUp() {
        fluentWait(getDriver(), howOld);
        waitForWebElementAndClick(howOld);
        //fluentWaitElementDisappears(getDriver(),errorMessageSignUp);
        howOld.sendKeys("18");
        howMuch.sendKeys("test");
        agreeTerms.sendKeys("Yes");
        whereAreYou.sendKeys("test");
        fluentWait(getDriver(), submitBtn);
        waitForWebElementAndClick(submitBtn);
//        retryingFindClick(submitBtn);
        validateTextFirst();
        getDriver().navigate().to(url + "/Listing/Detail/619");


    }

    public void nextButton() {
        fluentWaitStrict(getDriver(), nextBtn);
        waitForWebElementAndClick(nextBtn);
    }

    public void imSellerButton() {
        try {
            actions.moveToElement(errorMessageSignUp).build().perform();
            fluentWaitElementDisappears(getDriver(), errorMessageSignUp);
            fluentWait(getDriver(), imSellerBtn);
            waitForWebElementAndClick(imSellerBtn);
        } catch (Exception e) {
            wait(4);
            fluentWait(getDriver(), imSellerBtn);
            waitForWebElementAndClick(imSellerBtn);
            retryingFindClick(imSellerBtn);
        }
    }

    public void CreateAnAccountListingDetailsPROD(String text) {
        getDriver().navigate().to(UrlDevServices);

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


    }

    public void CloseWindow() {
        try {
            fluentWait(getDriver(), closeBtnWindow);
            waitForWebElementAndClick(closeBtnWindow);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), closeBtnWindow);
            waitForWebElementAndClick(closeBtnWindow);
        }
    }
}