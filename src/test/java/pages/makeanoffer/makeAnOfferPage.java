package pages.makeanoffer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import static java.lang.Math.random;

public class makeAnOfferPage extends BasePage {


    public makeAnOfferPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());

    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;

    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;

    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;

    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div.d-flex.flex-wrap.align-items-center.justify-content-start > a")
    public WebElement makeAnOfferBtn;

    @FindBy(how = How.CSS, using = "#offer-message")
    public WebElement makeAnOfferMessageTextField;

    @FindBy(how = How.CSS, using = "#offer-img-1")
    public WebElement addImageToOfferBtn;

    @FindBy(how = How.CSS, using = "#offer-price")
    public WebElement proposedPriceTextField;

    @FindBy(how = How.CSS, using = "#deliver-date")
    public WebElement deliverDateTextField;

    @FindBy(how = How.CSS, using = "#offer-submit")
    public WebElement makeAnOfferSendBtn;

    @FindBy(how = How.CSS, using = "#wants-header-text-customize")
    public WebElement headerRequestBtn;

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

    @FindBy(how = How.CSS, using = "#dashboard > div > div > div:nth-child(2) > div.card-header.pb-3.px-0 > h5 > a > span")
    public WebElement chatVerify;
    @FindBy(how = How.CSS, using = "#welcome > div > div > div > button")
    public WebElement welcomeClose;

    @FindBy(how = How.CSS, using = "#imSellerSelector > div > label > div > div")
    public WebElement imSellerBtn;

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
        fluentWaitStrict(getDriver(),howMuch);
        waitForWebElementAndClick(howMuch);
        howMuch.sendKeys("test");
    }

    public void howOldAreYou() {
        fluentWaitStrict(getDriver(), howOld);
        waitForWebElementAndClick(howOld);
        howOld.sendKeys("18");
        wait(4);
    }

    public void nextButton() {
        fluentWaitStrict(getDriver(), nextBtn);
        waitForWebElementAndClick(nextBtn);
    }

    public void imSellerButton() {
        fluentWaitStrict(getDriver(), imSellerBtn);
        waitForWebElementAndClick(imSellerBtn);

    }

    public void setWelcomeClose() {
        fluentWait(getDriver(), welcomeClose);
        waitForWebElementAndClick(welcomeClose);
    }

    String randomEmail = rdm + Long.toString((int) random() * 1200);


    public void setHomePage() {
        getDriver().navigate().to(url);
    }

    public void goToLoginPage() {
        getDriver().navigate().to(url + "/Account/Login");
    }

    public void goToDashboard() {
        getDriver().navigate().to(url + "/dashboard");
    }

    public void goToBrowseListing() {
        getDriver().navigate().to(url + "/Listing/Browse");
    }

    public void selectItemBtn() {
        getDriver().navigate().to(url + "/Listing/Detail/619");

    }


    public void selectMakeAnOfferBtn() {
        fluentWait(getDriver(), makeAnOfferBtn);
        waitForWebElementAndClick(makeAnOfferBtn);
    }

    public void selectMakeAnOfferMessageTextField() {
        fluentWait(getDriver(), makeAnOfferMessageTextField);
        waitForWebElementAndClick(makeAnOfferMessageTextField);
        makeAnOfferMessageTextField.sendKeys("Test Asleep(3000);utomation");
    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";

    public void selectAddImageToOffer() {
        addImageToOfferBtn.sendKeys(EV_RESULT_FILE_PATH);

    }

    public void selectProposedPriceTextField() {
        fluentWait(getDriver(), proposedPriceTextField);
        waitForWebElementAndClick(proposedPriceTextField);
        proposedPriceTextField.sendKeys("100");
    }

    public void selectDeliverDateTextField() {
        fluentWait(getDriver(), deliverDateTextField);
        waitForWebElementAndClick(deliverDateTextField);
        deliverDateTextField.clear();
        deliverDateTextField.sendKeys("05052022");
    }

    public void selectMakeAnOfferSendButton() {
        waitForVisibility(makeAnOfferSendBtn);
        waitForClickability(makeAnOfferSendBtn);
        fluentWait(getDriver(), makeAnOfferSendBtn);
        waitForWebElementAndClick(makeAnOfferSendBtn);

    }

    public void selectInboxButton() {
        getDriver().navigate().to(url + "/Chat/GetInbox");
    }


    public void headerRequest() {
        fluentWait(getDriver(), headerRequestBtn);
        waitForWebElementAndClick(headerRequestBtn);

    }


    public void yourEmailFieldFunction(String text) {
        waitForVisibility(newEmailBtn);
        waitForClickability(newEmailBtn);
        fluentWait(getDriver(), newEmailBtn);
        waitForWebElementAndClick(newEmailBtn);
        newEmailBtn.sendKeys(text + randomEmail + "auto@trick.com");

    }


    public void signUpNowButton() {
        waitForVisibility(signUpNowBtn);
        waitForClickability(signUpNowBtn);
        fluentWait(getDriver(), signUpNowBtn);
        waitForWebElementAndClick(signUpNowBtn);
    }

    public void newUsernameButton(String text) {
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.clear();
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(text + randomEmail + "Auto");
    }

    public void setNewPasswordButton() {
        fluentWait(getDriver(), newPasswordBtn);
        waitForWebElementAndClick(newPasswordBtn);
        newPasswordBtn.sendKeys("uX$Z2Z4Ye3z2&A");
        newPasswordBtn.clear();
        newPasswordBtn.sendKeys("uX$Z2Z4Ye3z2&A");
    }

    public void signUpButton() {
        fluentWait(getDriver(), signUpBtn);
        waitForWebElementAndClick(signUpBtn);
    }

    public boolean offerChatVerify() {
        boolean result = chatVerify.isDisplayed();
        return result;
    }

}