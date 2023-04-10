package pages.production;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import pages.BasePage;

public class SettingsPage extends BasePage {


    public SettingsPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());

    ////////LOGIN//////////////
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    ////////SETTINGS//////////////

    @FindBy(how = How.CSS, using = "#settings-tab > span > span:nth-child(1)")
    public WebElement settingsTab;

    @FindBy(how = How.CSS, using = "#security-tab > span > span:nth-child(1)")
    public WebElement passwordTab;
    @FindBy(how = How.CSS, using = "#Password")
    public WebElement resetPasswordTextField;

    @FindBy(how = How.CSS, using = "#saveChangesBtn")
    public WebElement saveResetPassword;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body")
    public WebElement passwordChangedMessage;

    @FindBy(how = How.CSS, using = "#security-tab-content > div > div > h5")
    public WebElement validateTextChangePassword;

    @FindBy(how = How.CSS, using = "#CurrentPassword")
    public WebElement currentPassword;

    @FindBy(how = How.CSS, using = "#social-tab > span > span:nth-child(1)")
    public WebElement socialTab;

    @FindBy(how = How.CSS, using = "#website")
    public WebElement websiteInput;

    @FindBy(how = How.CSS, using = "#linkedin")
    public WebElement linkedinInput;

    @FindBy(how = How.CSS, using = "#facebook")
    public WebElement facebookInput;
    @FindBy(how = How.CSS, using = "#instagram")
    public WebElement instagramInput;
    @FindBy(how = How.CSS, using = "#youtube")
    public WebElement youtubeInput;
    @FindBy(how = How.CSS, using = "#twitter")
    public WebElement twitterInput;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body")
    public WebElement urlsAddedMessage;

    @FindBy(how = How.CSS, using = "#NameOnCard")
    public WebElement nameOnCardInput;

    @FindBy(how = How.CSS, using = "#CardNumber")
    public WebElement cardNumberInput;

    @FindBy(how = How.CSS, using = "#ExpirationDate")
    public WebElement expirationDateInput;

    @FindBy(how = How.CSS, using = "#CVV")
    public WebElement cvvInput;

    @FindBy(how = How.CSS, using = "#payment-tab-content > div:nth-child(2) > div > div:nth-child(3) > div.col-lg-6.d-flex.align-items-center > a > span")
    public WebElement addCardBtn;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div:nth-child(1) > div > div.iziToast-body > div.iziToast-texts")
    public WebElement cardAlreadyExists;

    @FindBy(how = How.CSS, using = "#notifications-tab > span > span:nth-child(1)")
    public WebElement notificationsTab;

    @FindBy(how = How.CSS, using = "#notifications-tab-content > div:nth-child(1) > div > div > div > div > label.switch.switch-settings.ml-auto > span")
    public WebElement emailNotificationsBtn;

    @FindBy(how = How.CSS, using = "#container-sms-notifications > div > div:nth-child(1) > div > div > label.switch.switch-settings.ml-auto > span")
    public WebElement smsNotificationsBtn;

    @FindBy(how = How.CSS, using = "#container-whatsapp-notifications > div > div:nth-child(1) > div > div > label.switch.switch-settings.ml-auto > span")
    public WebElement whatsappNotificationsBtn;

    @FindBy(how = How.CSS, using = "#save-info-notifications")
    public WebElement notificationSaveChanges;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body > div.iziToast-texts > p")
    public WebElement saveChangesPopUp;

    @FindBy(how = How.CSS, using = "#country-code")
    public WebElement countryCodeInputONE;

    @FindBy(how = How.CSS, using = "#area-code")
    public WebElement areaCodeInputONE;

    @FindBy(how = How.CSS, using = "#phone-number")
    public WebElement phoneNumberONE;

    @FindBy(how = How.CSS, using = "#chk-terms-conditions")
    public WebElement termsAndConditionsCheckbox;

    @FindBy(how = How.CSS, using = "#country-code-whatsapp")
    public WebElement countryCodeInputTWO;

    @FindBy(how = How.CSS, using = "#area-code-whatsapp")
    public WebElement areaCodeInputTWO;

    @FindBy(how = How.CSS, using = "#phone-number-whatsapp")
    public WebElement phoneNumberTWO;

    @FindBy(how = How.CSS, using = "#shipping-tab > span > span:nth-child(1)")
    public WebElement shippingTab;

    @FindBy(how = How.CSS, using = "#linkNewInternationalAddress > span")
    public WebElement addNewAddressBtn;

    @FindBy(how = How.CSS, using = "#Name-international")
    public WebElement fullNameTextFieldInput;

    @FindBy(how = How.CSS, using = "#PhoneNumber-location-address-international")
    public WebElement phoneNumberTextFieldInput;

    @FindBy(how = How.CSS, using = "#location-address-international")
    public WebElement addressTextFieldInput;

    @FindBy(how = How.CSS, using = "#Country-location-address-international")
    public WebElement countryTextFieldInput;

    @FindBy(how = How.CSS, using = "#locality-location-address-international")
    public WebElement cityTextFieldInput;

    @FindBy(how = How.CSS, using = "#StateNameLong-location-address-international")
    public WebElement stateNameLocationTextFieldInput;

    @FindBy(how = How.CSS, using = "#ZipCode-location-address-international")
    public WebElement zipCodeInput;

    @FindBy(how = How.CSS, using = "#addInternationalAddress")
    public WebElement saveAddressBtn;

    @FindBy(how = How.CSS, using = "#editInternationalAddress")
    public WebElement editSaveAddressBtn;

    @FindBy(how = How.CSS, using = "#international-address > div > div > div > div:nth-child(2) > button.cl-primary.edit-international-address.bg-transparent.border-0.mr-3")
    public WebElement editAddressBtn;

    @FindBy(how = How.CSS, using = "#international-address > div > div > div > div:nth-child(2) > button.cl-primary.delete-international-address.bg-transparent.border-0")
    public WebElement deleteAddressBtn;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement confirmDelete;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div")
    public WebElement deleteAddressPopUp;

    @FindBy(how = How.CSS, using = "#profile-tab-content > div:nth-child(1) > div > h5")
    public WebElement personalInformationText;

    @FindBy(how = How.CSS, using = "#FirstName")
    public WebElement firstNameInput;

    @FindBy(how = How.CSS, using = "#LastName")
    public WebElement lastNameInput;

    @FindBy(how = How.CSS, using = "#DisplayName")
    public WebElement usernameInput;

    @FindBy(how = How.CSS, using = "#PhoneNumber")
    public WebElement phoneNumberInput;

    @FindBy(how = How.CSS, using = "#Email")
    public WebElement emailTextFieldInput;

    public void emailText(){
        fluentWait(getDriver(),emailTextFieldInput);
        emailTextFieldInput.clear();
        emailTextFieldInput.sendKeys("gastongenaud@7r1ck.com");
    }

    public void setFrameText() {
        getDriver().switchTo().frame(0);
        try {
            WebElement textFieldBio = getDriver().findElement(By.cssSelector("body"));
            textFieldBio.sendKeys("Test");
        } catch (Exception e) {
            wait(3);
            WebElement textFieldBio = getDriver().findElement(By.cssSelector("body"));
            textFieldBio.sendKeys("Test");
        }
        getDriver().switchTo().defaultContent();
    }

    public void phoneNumberTxt() {
        fluentWait(getDriver(), phoneNumberInput);
        phoneNumberInput.sendKeys("123123123");
    }

    public void usernameTxt() {
        fluentWait(getDriver(), usernameInput);
        usernameInput.sendKeys("gastontrick");
    }

    public void lastNameTxt() {
        fluentWait(getDriver(), lastNameInput);
        lastNameInput.sendKeys("Automation");
    }

    public void firstNameTxt() {
        fluentWait(getDriver(), firstNameInput);
        firstNameInput.clear();
        firstNameInput.sendKeys("Testing");

    }

    public void validatePersonalInformationText() {
        fluentWait(getDriver(), personalInformationText);
        Assert.assertTrue(personalInformationText.isDisplayed());
    }

    public void deleteAddressSuccessfulPopUp() {
        fluentWait(getDriver(), deleteAddressPopUp);
        Assert.assertTrue(deleteAddressPopUp.isDisplayed());
    }

    public void confirmDeleteAddress() {
        fluentWait(getDriver(), confirmDelete);
        waitForWebElementAndClick(confirmDelete);
    }

    public void deleteAddress() {
        fluentWait(getDriver(), deleteAddressBtn);
        waitForWebElementAndClick(deleteAddressBtn);
    }

    public void editSaveAddress() {
        fluentWait(getDriver(), editSaveAddressBtn);
        waitForWebElementAndClick(editSaveAddressBtn);
    }


    public void editAddressTxt() {
        fluentWait(getDriver(), zipCodeInput);
        zipCodeInput.clear();
        zipCodeInput.sendKeys("94120");
    }

    public void editAddress() {
        fluentWait(getDriver(), editAddressBtn);
        waitForWebElementAndClick(editAddressBtn);
    }


    public void saveAddress() {
        fluentWait(getDriver(), saveAddressBtn);
        waitForWebElementAndClick(saveAddressBtn);
    }

    public void enterFullName() {
        fluentWait(getDriver(), fullNameTextFieldInput);
        fullNameTextFieldInput.sendKeys("Automation Test");
    }

    public void enterPhoneNumber() {
        fluentWait(getDriver(), phoneNumberTextFieldInput);
        phoneNumberTextFieldInput.sendKeys("123123123");
    }

    public void enterAddress() {
        fluentWait(getDriver(), addressTextFieldInput);
        addressTextFieldInput.sendKeys("344 Alabama Street");
    }

    public void enterCountry() {
        fluentWait(getDriver(), countryTextFieldInput);
        countryTextFieldInput.sendKeys("Estados Unidos");
    }

    public void enterCity() {
        fluentWait(getDriver(), cityTextFieldInput);
        cityTextFieldInput.sendKeys("San Francisco");
    }

    public void enterStateName() {
        fluentWait(getDriver(), cityTextFieldInput);
        stateNameLocationTextFieldInput.sendKeys("California");
    }

    public void enterZipCode() {
        fluentWait(getDriver(), zipCodeInput);
        zipCodeInput.sendKeys("94110");
    }


    public void addAddress() {
        try {
            fluentWait(getDriver(), addNewAddressBtn);
            waitForWebElementAndClick(addNewAddressBtn);
            retryingFindClick(addNewAddressBtn);
        } catch (Exception e) {
            fluentWait(getDriver(), addNewAddressBtn);
            waitForWebElementAndClick(addNewAddressBtn);
            retryingFindClick(addNewAddressBtn);
        }
    }

    public void dashboardShippingTab() {
        fluentWait(getDriver(), shippingTab);
        waitForWebElementAndClick(shippingTab);
    }

    public void phoneNumberTxtTWO() {
        fluentWait(getDriver(), phoneNumberTWO);
        phoneNumberTWO.sendKeys("123123123");
    }

    public void areaCodeTxtTWO() {
        fluentWait(getDriver(), areaCodeInputTWO);
        areaCodeInputTWO.sendKeys("123");
    }

    public void countryCodeTxtTWO() {
        fluentWait(getDriver(), countryCodeInputTWO);
        countryCodeInputTWO.sendKeys("+1");
    }

    public void termsAndConditions() {
        fluentWait(getDriver(), termsAndConditionsCheckbox);
        waitForWebElementAndClick(termsAndConditionsCheckbox);
//        retryingFindClick(termsAndConditionsCheckbox);
    }

    public void phoneNumberTxtONE() {
        fluentWait(getDriver(), phoneNumberONE);
        phoneNumberONE.sendKeys("123123123");
    }

    public void areaCodeTxtONE() {
        fluentWait(getDriver(), areaCodeInputONE);
        areaCodeInputONE.sendKeys("123");
    }

    public void countryCodeTxtONE() {
        fluentWait(getDriver(), countryCodeInputONE);
        countryCodeInputONE.sendKeys("+1");
    }

    public void saveChangesMessagePopUp() {
        fluentWait(getDriver(), saveChangesPopUp);
        Assert.assertTrue(saveChangesPopUp.isDisplayed());
    }

    public void saveChangesNotification() {
        fluentWait(getDriver(), notificationSaveChanges);
        waitForWebElementAndClick(notificationSaveChanges);
    }

    public void whatsappNotificationCheckbox() {
        fluentWait(getDriver(), whatsappNotificationsBtn);
        waitForWebElementAndClick(whatsappNotificationsBtn);
//        retryingFindClick(whatsappNotificationsBtn);
    }

    public void smsNotificationsCheckbox() {
        fluentWait(getDriver(), smsNotificationsBtn);
        waitForWebElementAndClick(smsNotificationsBtn);
//        retryingFindClick(smsNotificationsBtn);
    }

    public void emailNotificationsCheckbox() {
        fluentWait(getDriver(), emailNotificationsBtn);
        waitForWebElementAndClick(emailNotificationsBtn);
//        retryingFindClick(emailNotificationsBtn);
    }

    public void dashboardNotificationsTab() {
        fluentWait(getDriver(), notificationsTab);
        waitForWebElementAndClick(notificationsTab);

    }

    public void cardExists() {
        fluentWait(getDriver(), cardAlreadyExists);
        Assert.assertTrue(cardAlreadyExists.isDisplayed());
    }

    public void addCreditCardButton() {
        fluentWait(getDriver(), addCardBtn);
        waitForWebElementAndClick(addCardBtn);
    }

    public void cvvTextField() {
        fluentWait(getDriver(), cvvInput);
        cvvInput.sendKeys("123");
    }

    public void expirationDateTextField() {
        fluentWait(getDriver(), expirationDateInput);
        expirationDateInput.sendKeys("0329");
    }

    public void cardNumberTextField() {
        fluentWait(getDriver(), cardNumberInput);
        cardNumberInput.sendKeys("424242424242");
    }

    public void nameOnCardTextField() {
        fluentWait(getDriver(), nameOnCardInput);
        nameOnCardInput.sendKeys("Test Production");
    }


    public void urlsAddedPopUp() {
        fluentWait(getDriver(), urlsAddedMessage);
        Assert.assertTrue(urlsAddedMessage.isDisplayed());
    }

    public void linkedinTextField() {
        fluentWait(getDriver(), linkedinInput);
        linkedinInput.sendKeys("https://www.google.com/");
    }

    public void facebookTextField() {
        fluentWait(getDriver(), facebookInput);
        facebookInput.sendKeys("https://www.google.com/");
    }

    public void instagramTextField() {
        fluentWait(getDriver(), instagramInput);
        instagramInput.sendKeys("https://www.google.com/");
    }

    public void youtubeTextField() {
        fluentWait(getDriver(), youtubeInput);
        youtubeInput.sendKeys("https://www.google.com/");
    }

    public void websiteTextField() {
        fluentWait(getDriver(), websiteInput);
        websiteInput.sendKeys("https://www.google.com/");
    }

    public void twitterTextField() {
        fluentWait(getDriver(), twitterInput);
        twitterInput.sendKeys("https://www.google.com/");
    }

    public void dashboardSocialTab() {
        fluentWait(getDriver(), socialTab);
        waitForWebElementAndClick(socialTab);

    }

    public void currentPasswordTextField() {
        fluentWait(getDriver(), currentPassword);
        waitForWebElementAndClick(currentPassword);
        currentPassword.sendKeys("#NcUzbusYqu667gq");
    }

    public void textChangePasswordValidate() {
        fluentWait(getDriver(), validateTextChangePassword);
        validateTextChangePassword.isDisplayed();
    }

    public void passwordChangedPopUp() {
        fluentWait(getDriver(), passwordChangedMessage);
        Assert.assertTrue(passwordChangedMessage.isDisplayed());
    }

    public void saveChangesPassword() {
        fluentWait(getDriver(), saveResetPassword);
        waitForWebElementAndClick(saveResetPassword);
    }

    public void resetPassword() {
        fluentWait(getDriver(), resetPasswordTextField);
        waitForWebElementAndClick(resetPasswordTextField);
        resetPasswordTextField.sendKeys("#NcUzbusYqu667gq");
    }

    public void dashboardPasswordTab() {
        fluentWait(getDriver(), passwordTab);
        waitForWebElementAndClick(passwordTab);
    }

    public void dashboardSettingsTab() {
        fluentWait(getDriver(), settingsTab);
        waitForWebElementAndClick(settingsTab);
    }
}