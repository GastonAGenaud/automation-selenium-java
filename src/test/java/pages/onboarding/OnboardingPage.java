package pages.onboarding;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import static java.lang.Math.random;

public class OnboardingPage extends BasePage {


    public OnboardingPage() {
        super();
    }

    Actions actions = new Actions(getDriver());
    String rdm = Long.toString(System.currentTimeMillis());

    @FindBy(how = How.CSS, using = "#eael-toggle-container-99425d1 > div.eael-toggle-content-wrap.primary > div.eael-toggle-primary-wrap > div > section.elementor-section.elementor-top-section.elementor-element.elementor-element-05058f0.elementor-section-stretched.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-20.elementor-top-column.elementor-element.elementor-element-2a7c594 > div > div.elementor-element.elementor-element-719b3f6.elementor-align-left.elementor-tablet-align-left.elementor-mobile-align-left.elementor-widget.elementor-widget-button > div > div > a")
    public WebElement buildBtn;
    @FindBy(how = How.CSS, using = "#eael-toggle-container-99425d1 > div.eael-toggle-content-wrap.primary > div.eael-toggle-primary-wrap > div > section.elementor-section.elementor-top-section.elementor-element.elementor-element-05058f0.elementor-section-stretched.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-20.elementor-top-column.elementor-element.elementor-element-7cfd907 > div > div.elementor-element.elementor-element-28f2c5c.elementor-align-left.elementor-tablet-align-left.elementor-mobile-align-left.elementor-widget.elementor-widget-button > div > div > a")
    public WebElement launchBtn;
    @FindBy(xpath = "/html/body/div[3]/section[1]/div/div/div/div[4]/div/div/div[2]/div[1]/div/section[2]/div/div[4]/div/div[8]/div/div/a/span/span")
    public WebElement specializeStartMyTrialBtn;

    @FindBy(how = How.CSS, using = "#\\31  > div:nth-child(1) > h2")
    public WebElement letsCreateYourMarketplace;
    @FindBy(how = How.CSS, using = "#eael-toggle-container-99425d1 > div.eael-toggle-content-wrap.primary > div.eael-toggle-primary-wrap > div > section.elementor-section.elementor-top-section.elementor-element.elementor-element-05058f0.elementor-section-stretched.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default > div > div.elementor-column.elementor-col-20.elementor-top-column.elementor-element.elementor-element-99ce2ca > div > div.elementor-element.elementor-element-dcb16c6.elementor-align-left.elementor-tablet-align-left.elementor-mobile-align-left.elementor-widget.elementor-widget-button > div > div > a")
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
    @FindBy(how = How.CSS, using = "#go-to-second-step")
    public WebElement nextBtn;
    @FindBy(how = How.CSS, using = "#\\32  > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(1) > div")
    public WebElement productsBtn;
    @FindBy(how = How.CSS, using = "#\\32  > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(2) > div > div")
    public WebElement servicesBtn;

    @FindBy(how = How.CSS, using = "#\\32  > div:nth-child(2) > div > div:nth-child(2) > div > div > button.btn.btn-secondary.btn__onboarding")
    public WebElement nextSteps2Btn;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/input")
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
    @FindBy(how = How.CSS, using = "#expiry-date")
    public WebElement expiryCardField;
    @FindBy(how = How.CSS, using = "#card-cvc")
    public WebElement cvcCodeField;
    @FindBy(how = How.CSS, using = "#tmp_button-31077 > a > span.elButtonMain")
    public WebElement startMyMarketPlaceNowBtn;
    @FindBy(how = How.CSS, using = "#app-form > div > div:nth-child(5) > div.margin__md.d-flex.align-items-center > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement checkBoxContacted;

    @FindBy(how = How.CSS, using = "#\\34  > div > div > div > div > div > div > div > div > div > p.font__congrats--title")
    public WebElement congratsTitle;

    @FindBy(how = How.CSS, using = "#card-name")
    public WebElement cardNameField;
    @FindBy(how = How.CSS, using = "#goToAdmin")
    public WebElement marketPlaceCreateBtn;

    public void setCardNameField() {
        fluentWait(getDriver(), cardNameField);
        waitForWebElementAndClick(cardNameField);
        cardNameField.sendKeys("Testing Card");
    }

    public String visualizeResult() {
        fluentWait(getDriver(), letsCreateYourMarketplace);
        String result = letsCreateYourMarketplace.getText();
        return result;
    }

    public String calendar() {
        fluentWait(getDriver(), bookYourMeeting);
        String result = bookYourMeeting.getText();
        return result;
    }


    public boolean congratsTitleConfirm() {
        fluentWait(getDriver(), bookYourMeeting);
        boolean result = congratsTitle.isDisplayed();
        return result;
    }


    public boolean marketPlaceCreateConfirm() {
        try {
            fluentWaitStrict(getDriver(), bookYourMeeting);
            boolean result = marketPlaceCreateBtn.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(4);
            fluentWaitStrict(getDriver(), marketPlaceCreateBtn);
            boolean result = marketPlaceCreateBtn.isDisplayed();
            return result;
        }

    }

    public void selectBuild() {
        fluentWait(getDriver(), buildBtn);
        waitForWebElementAndClick(buildBtn);
    }

    public void selectLaunch() {
        fluentWait(getDriver(), launchBtn);
        waitForWebElementAndClick(launchBtn);
    }

    public void yourNameFieldFunction() {
        fluentWait(getDriver(), nextBtn);
        waitForWebElementAndClick(nextBtn);
        fluentWait(getDriver(), yourNameField);
        yourNameField.sendKeys("Test Automation");
    }

    public void yourEmailFieldFunction(String text) {
        String id = rdm + Long.toString((int) random() * 1200);
        fluentWait(getDriver(), yourEmailField);
        waitForWebElementAndClick(yourEmailField);
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
        ;
        yourMarketplaceField.sendKeys(text + "AutomationTesting" + id);
    }

    public void nextButtonFirstScreenFunction() {
        waitForClickability(nextBtn);
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
        fluentWait(getDriver(), cardNumberField);
        waitForWebElementAndClick(cardNumberField);
        cardNumberField.sendKeys("4242 4242 4242 4242");
        cardNumberField.clear();
        cardNumberField.sendKeys("4242 4242 4242 4242");
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
        try {
            fluentWait(getDriver(), savePaymentBtn);
            waitForWebElementAndClick(savePaymentBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), savePaymentBtn);
            waitForWebElementAndClick(savePaymentBtn);
        }

    }

    public void adminPanelStepFunction() {
        waitForVisibility(adminPanelBtn);
        fluentWait(getDriver(), adminPanelBtn);
        waitForWebElementAndClick(adminPanelBtn);
        fluentWait(getDriver(), passwordAdminField);
        waitForWebElementAndClick(passwordAdminField);
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
        waitForWebElementAndClick(cvcCodeField);
        cvcCodeField.sendKeys("111");
    }

    public void startMyMarketPlaceNow() {
        fluentWait(getDriver(), startMyMarketPlaceNowBtn);
        waitForWebElementAndClick(startMyMarketPlaceNowBtn);
    }

    public void customizeStartMyTrialBtn() {
        fluentWait(getDriver(), customizeStartMyTrialBtn);
        waitForWebElementAndClick(customizeStartMyTrialBtn);
    }

    public void specializeStartMyTrialBtn() {
        fluentWaitStrict(getDriver(), specializeStartMyTrialBtn);
        waitForWebElementAndClick(specializeStartMyTrialBtn);
    }

    public void selectLaunchBtn() {
        waitForVisibility(launchBtn);
        fluentWait(getDriver(), launchBtn);
        waitForWebElementAndClick(launchBtn);
    }

}