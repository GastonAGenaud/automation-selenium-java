package pages.makeanoffer;

import org.openqa.selenium.Keys;
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

    @FindBy(xpath = "/html/body/div[4]/main/div[6]/div/div/div/div[3]/div[3]/div/button")
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

    @FindBy(how = How.CSS, using = "#rowchat-container > section.d-none.d-lg-block.col-lg-3 > div")
    public WebElement chatVerify;
    @FindBy(how = How.CSS, using = "#welcome > div > div > div > button")
    public WebElement welcomeClose;

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

    @FindBy(how = How.CSS, using = "#RXJyb3JQbGVhc2UlMjByZW1vdmUlMjBhbnklMjBzcGVjaWFsJTIwY2hhcmFjdGVycyUyMGZyb20lMjB5b3VyJTIwdXNlcm5hbWUucmVk > div.iziToast-body > div.iziToast-texts")
    public WebElement lastErrorValidate;

    @FindBy(xpath = "//h2[contains(text(), 'You haven’t created any listings yet')]")
    public WebElement validateFirstText;

    public boolean validateTextFirst(){
        fluentWait(getDriver(), validateFirstText);
        boolean result = validateFirstText.isDisplayed();
        return result;
    }




    public boolean validateLastError() {
        try {
            fluentWaitElementDisappears(getDriver(), lastErrorValidate);
            boolean result = lastErrorValidate.isDisplayed();
            return result;
        }catch (Exception e){
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
        getDriver().navigate().refresh();
       try {
           fluentWait(getDriver(), makeAnOfferBtn);
           waitForWebElementAndClick(makeAnOfferBtn);
           fluentWait(getDriver(), makeAnOfferMessageTextField);
       }catch (Exception e){
           wait(3);
           fluentWait(getDriver(), makeAnOfferBtn);
           waitForWebElementAndClick(makeAnOfferBtn);
       }

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
        fluentWaitStrict(getDriver(), deliverDateTextField);
        waitForWebElementAndClick(deliverDateTextField);
        deliverDateTextField.clear();
        deliverDateTextField.sendKeys("05-05-2023");
        deliverDateTextField.clear();
        deliverDateTextField.sendKeys("05-05-2023");
        deliverDateTextField.sendKeys(Keys.ENTER);
    }

    public void selectMakeAnOfferSendButton() {
        try {
            actions.moveToElement(makeAnOfferSendBtn);
            fluentWaitStrict(getDriver(), makeAnOfferSendBtn);
            waitForWebElementAndClick(makeAnOfferSendBtn);
            waitForWebElementAndClick(makeAnOfferSendBtn);
            waitForWebElementAndClick(makeAnOfferSendBtn);
            //retryingFindClick(makeAnOfferSendBtn);
//            fluentWait(getDriver(), chatVerify);
        }catch(Exception e){
            wait(4);
            fluentWaitStrict(getDriver(), makeAnOfferSendBtn);
            waitForWebElementAndClick(makeAnOfferSendBtn);
            //retryingFindClick(makeAnOfferSendBtn);
        }

//        while(makeAnOfferSendBtn.isDisplayed()){
//            //waitForWebElementAndClick(makeAnOfferSendBtn);
//            try{
//                waitForWebElementAndClick(makeAnOfferMessageTextField);
//                wait(4);
//                waitForWebElementAndClick(makeAnOfferSendBtn);
//            }catch (ElementClickInterceptedException e){
//
//            }
//        };

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
        fluentWait(getDriver(), chatVerify);
        boolean result = chatVerify.isDisplayed();
        return result;
    }

}