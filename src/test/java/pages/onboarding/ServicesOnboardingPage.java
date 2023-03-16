package pages.onboarding;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import static java.lang.Math.random;

public class ServicesOnboardingPage extends BasePage {


    public ServicesOnboardingPage() {
        super();
    }

    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement pricingBtn;
    @FindBy(xpath = "/html/body/div[2]/section[1]/div/div/div/section/div/div[2]/div/div/div/div[1]/div[3]/a")
    public WebElement optimizeStartMyTrialBtn;
    @FindBy(xpath = "/html/body/div[2]/section[1]/div/div/div/section/div/div[3]/div/div/div/div/div[3]/a")
    public WebElement specializeStartMyTrialBtn;
    @FindBy(xpath = "/html/body/div[2]/section[1]/div/div/div/section/div/div[1]/div/div/div/div/div[3]/a")
    public WebElement visualizeStartMyTrialBtn;
    @FindBy(how = How.CSS, using = "#\\31  > div:nth-child(1) > h2")
    public WebElement letsCreateYourMarketplace;
    @FindBy(xpath = "/html/body/div[2]/section[1]/div/div/div/section/div/div[4]/div/div/div/div/div[3]/a")
    public WebElement customizeStartMyTrialBtn;
    @FindBy(how = How.CSS, using = "body > section.inner-banner > div > div > div > div > h1")
    public WebElement bookYourMeeting;
    @FindBy(how = How.CSS, using = "#owner-name")
    public WebElement yourNameField;
    @FindBy(how = How.CSS, using = "#owner-email")
    public WebElement yourEmailField;
    @FindBy(how = How.CSS, using = "#owner-phone")
    public WebElement yourPhoneNumberField;
    @FindBy(how = How.CSS, using = "#owner-site-name")
    public WebElement yourMarketplaceField;
    @FindBy(how = How.CSS, using = "#app-form > div > div:nth-child(5) > div.d-flex.justify-content-center.align-items-center.margin__top__btns > button")
    public WebElement nextBtn;
    @FindBy(how = How.CSS, using = "#\\32  > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(1) > div > div")
    public WebElement productsBtn;
    @FindBy(how = How.CSS, using = "#\\32  > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(2) > div > div")
    public WebElement servicesBtn;
    @FindBy(how = How.CSS, using = "#\\32  > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(3) > div > div")
    public WebElement rentalsBtn;
    @FindBy(how = How.CSS, using = "#\\32  > div:nth-child(2) > div > div:nth-child(2) > div > div > button.btn.btn-secondary.btn__onboarding")
    public WebElement nextSteps2Btn;
    @FindBy(how = How.CSS, using = "#card-number")
    public WebElement cardNumberField;
    @FindBy(how = How.CSS, using = "#card-name")
    public WebElement nameCardField;
    @FindBy(how = How.CSS, using = "#expiry-date")
    public WebElement expiryDateField;
    @FindBy(how = How.CSS, using = "#card-cvc")
    public WebElement cvcCardField;
    @FindBy(how = How.CSS, using = "#checkout-form > div > div.col-lg-4.p-4.px-lg-3 > button")
    public WebElement savePaymentBtn;
    @FindBy(how = How.CSS, using = "#password-register")
    public WebElement passwordAdminField;
    @FindBy(how = How.CSS, using = "#\\30  > div.d-flex.justify-content-end > button")
    public WebElement submitBtn;
    @FindBy(how = How.CSS, using = "#goToAdmin")
    public WebElement adminPanelBtn;
    @FindBy(xpath = "/html/body/div[1]/div[6]/div/div[6]/div/div/div[3]/input")
    public WebElement fullNameField;
    @FindBy(how = How.CSS, using = "#input-95771 > input")
    public WebElement emailAddressField;
    @FindBy(how = How.CSS, using = "#input-23729 > input")
    public WebElement phoneNumberField;
    @FindBy(how = How.CSS, using = "#root > form > span:nth-child(4) > div > div.CardNumberField-input-wrapper > span > input")
    public WebElement creditCardNumberField;
    @FindBy(how = How.CSS, using = "#root > form > span:nth-child(4) > span > input")
    public WebElement expiryCardField;
    @FindBy(how = How.CSS, using = "#root > form > span:nth-child(4) > span > input")
    public WebElement cvcCodeField;
    @FindBy(how = How.CSS, using = "#tmp_button-31077 > a > span.elButtonMain")
    public WebElement startMyMarketPlaceNowBtn;
    @FindBy(how = How.CSS, using = "#app-form > div > div:nth-child(5) > div.margin__md.d-flex.align-items-center > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement checkBoxContacted;
    @FindBy(how = How.CSS, using = "#data-title")
    public WebElement welcomeAdminPanelText;
    @FindBy(how = How.CSS, using = "#order-declined-message")
    public WebElement errorMessage;
    @FindBy(how = How.CSS, using = "#RXJyb3JUaGVyZSUyMHdhcyUyMGElMjBwcm9ibGVtLiUyMFBsZWFzZSUyQyUyMGNvbnRhY3QlMjB3aXRoJTIwdGhlJTIwc2l0ZSUyMGFkbWluaXN0cmF0b3IucmVk > div.iziToast-body > div.iziToast-texts > p")
    public WebElement marketPlaceError;

    @FindBy(how = How.CSS, using = "#goToAdmin")
    public WebElement marketPlaceCreateBtn;


    public String visualizeResult() {
        String result =
                letsCreateYourMarketplace.getText();
        return result;
    }

    public String calendar() {
        String result =
                bookYourMeeting.getText();
        return result;
    }

    public String adminPanelConfirm() {
        String result = welcomeAdminPanelText.getText();
        return result;
    }

    public boolean adminPanelTrue() {
        boolean result = welcomeAdminPanelText.isDisplayed();
        return result;
    }

    public boolean errorMessageConfirm() {
        fluentWait(getDriver(), errorMessage);
        boolean result = errorMessage.isDisplayed();
        return result;
    }

    public boolean productsErrorText() {
        boolean result = marketPlaceError.isDisplayed();
        return result;
    }

    public boolean marketPlaceCreateConfirm() {
        fluentWait(getDriver(), marketPlaceCreateBtn);
        boolean result = marketPlaceCreateBtn.isDisplayed();
        return result;
    }

    public void goToPricing() {
        fluentWait(getDriver(), pricingBtn);
        waitForWebElementAndClick(pricingBtn);
        waitForVisibility(pricingBtn);
        waitToLoad();
    }

    public void selectOptimizePlan() {
        waitForVisibility(optimizeStartMyTrialBtn);
        fluentWait(getDriver(), optimizeStartMyTrialBtn);
        waitForWebElementAndClick(optimizeStartMyTrialBtn);
    }

    public void yourNameFieldFunction() {
        waitForVisibility(yourEmailField);
        fluentWait(getDriver(), yourNameField);
        waitForWebElementAndClick(yourEmailField);
        yourNameField.sendKeys("Test Automation");
    }

    public void yourEmailFieldFunction(String text) {
        String id = rdm + Long.toString((int) random() * 1200);
        fluentWait(getDriver(), yourEmailField);
        waitForWebElementAndClick(yourNameField);
        yourEmailField.sendKeys(text + "automation2@7r1ck.com");
    }

    public void yourPhoneNumberFieldFunction() {
        fluentWait(getDriver(), yourPhoneNumberField);
        waitForWebElementAndClick(yourPhoneNumberField);
        yourPhoneNumberField.sendKeys("3513261149");
    }

    public void checkBoxContactedFunction() {
        fluentWait(getDriver(), checkBoxContacted);
        waitForWebElementAndClick(checkBoxContacted);
    }

    public void yourMarketplaceFieldFunction(String text) {
        String id = rdm + Long.toString((int) random() * 1200);
        fluentWait(getDriver(), yourMarketplaceField);
        waitForWebElementAndClick(yourMarketplaceField);
        yourMarketplaceField.sendKeys(text + "AutomationTesting" + id);
    }

    public void nextButtonFirstScreenFunction() {
        fluentWait(getDriver(), nextBtn);
        waitForWebElementAndClick(nextBtn);
    }

    public void chooseProductMarketplace() {
        fluentWait(getDriver(), productsBtn);
        waitForWebElementAndClick(productsBtn);
    }

    public void nextButtonSecondScreenFunction() {
        fluentWait(getDriver(), nextSteps2Btn);
        waitForWebElementAndClick(nextSteps2Btn);
    }

    public void cardNumberFieldFunction() {
        waitForVisibility(cardNumberField);
        fluentWait(getDriver(), cardNumberField);
        waitForWebElementAndClick(cardNumberField);
        cardNumberField.sendKeys("4111 1111 1111 1111");
    }

    public void nameCardFieldForProductForm() {
        fluentWait(getDriver(), nameCardField);
        waitForWebElementAndClick(nameCardField);
        nameCardField.sendKeys("Test Automation");
    }

    public void expiryDateFieldFunction() {
        fluentWait(getDriver(), expiryDateField);
        waitForWebElementAndClick(expiryDateField);
        expiryDateField.sendKeys("02/26");
    }

    public void cvcCardFieldFunction() {
        fluentWait(getDriver(), cvcCardField);
        waitForWebElementAndClick(cvcCardField);
        cvcCardField.sendKeys("111");
    }

    public void setSavePaymentFunction() {
        fluentWait(getDriver(), savePaymentBtn);
        waitForWebElementAndClick(savePaymentBtn);
    }

    public void adminPanelStepFunction() {
        waitForVisibility(adminPanelBtn);
        fluentWait(getDriver(), adminPanelBtn);
        waitForWebElementAndClick(adminPanelBtn);

        fluentWait(getDriver(), passwordAdminField);
        passwordAdminField.sendKeys("123456789Test");

        fluentWait(getDriver(), submitBtn);
        waitForWebElementAndClick(submitBtn);
    }

    // Service form
    public void chooseServiceMarketplace() {
        fluentWait(getDriver(), servicesBtn);
        waitForWebElementAndClick(servicesBtn);
    }

    public void fullNameFieldFunction() {
        fluentWait(getDriver(), fullNameField);
        waitForWebElementAndClick(fullNameField);
        fullNameField.sendKeys("Test Automation");
    }

    public void emailAddressFieldFunction() {
        fluentWait(getDriver(), emailAddressField);
        waitForWebElementAndClick(emailAddressField);
        emailAddressField.sendKeys(rdm + "automation@7r1ck.com");
    }

    public void phoneNumberFieldFunction() {
        fluentWait(getDriver(), phoneNumberField);
        waitForWebElementAndClick(phoneNumberField);
        phoneNumberField.sendKeys("3513261149");
    }

    public void creditCardNumberFieldFunction() {
        fluentWait(getDriver(), creditCardNumberField);
        waitForWebElementAndClick(creditCardNumberField);
        creditCardNumberField.sendKeys("4111 1111 1111 1111");
    }

    public void expiryCardFieldFunction() {
        fluentWait(getDriver(), expiryCardField);
        waitForWebElementAndClick(expiryCardField);
        expiryCardField.sendKeys("02/26");
    }

    public void cvcCodeFieldFunction() {
        fluentWait(getDriver(), cvcCodeField);
        cvcCodeField.sendKeys("111");
    }

    public void startMyMarketPlaceNow() {
        fluentWait(getDriver(), startMyMarketPlaceNowBtn);
        waitForWebElementAndClick(startMyMarketPlaceNowBtn);
    }


}