package pages.developmentServices;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;


public class SettingDevPage extends BasePage {
    public SettingDevPage() {
        super();
    }

    @FindBy(how = How.CSS, using = "#settings-tab > span > span:nth-child(1)")
    public WebElement mySettingsProd;
    @FindBy(how = How.CSS, using = "#cashout-tab > span")
    public WebElement cashoutProd;
    @FindBy(how = How.CSS, using = "#container-stripe > div > a > span")
    public WebElement pendingProd;
    @FindBy(how = How.CSS, using = "#FirstName")
    public WebElement firstNameProd;
    @FindBy(how = How.CSS, using = "#LastName")
    public WebElement LastNameProd;
    @FindBy(how = How.CSS, using = "#DisplayName")
    public WebElement userNameProd;
    @FindBy(how = How.CSS, using = "#Email")
    public WebElement emailProd;
    @FindBy(how = How.CSS, using = "#PhoneNumber")
    public WebElement phoneNumberProd;
    @FindBy(how = How.CSS, using = "#saveChangesBtn")
    public WebElement SaveChangesBtnProd;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body > div.iziToast-texts > strong")
    public WebElement successText;
    @FindBy(how = How.CSS, using = "#payment-tab > span > span:nth-child(1)")
    public WebElement paymentSection;
    @FindBy(how = How.CSS, using = "#NameOnCard")
    public WebElement nameOnCardTextField;
    @FindBy(how = How.CSS, using = "#CardNumber")
    public WebElement cardOnNumberTextField;
    @FindBy(how = How.CSS, using = "#ExpirationDate")
    public WebElement expDateTextField;
    @FindBy(how = How.CSS, using = "#CVV")
    public WebElement securityCodeTextField;
    @FindBy(how = How.CSS, using = "#payment-tab-content > div:nth-child(2) > div > div:nth-child(3) > div.col-lg-6.d-flex.align-items-center > a > span")
    public WebElement addCreditCardBtn;
    @FindBy(how = How.CSS, using = "#creditCards > div > div > div.d-flex.justify-content-between.align-content-center.w-100 > div > a")
    public WebElement deleteBtn;
    @FindBy(how = How.CSS, using = "#security-tab > span > span:nth-child(1)")
    public WebElement passwordSection;
    @FindBy(how = How.CSS, using = "#Password")
    public WebElement newPasswordTextField;
    @FindBy(how = How.CSS, using = "#notifications-tab > span > span:nth-child(1)")
    public WebElement notificationsSection;
    @FindBy(how = How.CSS, using = "#container-sms-notifications > div > div:nth-child(1) > div > div > label.switch.switch-settings.ml-auto > span")
    public WebElement onSMSNotification;
    @FindBy(how = How.CSS, using = "#country-code")
    public WebElement countryCodeTextField;
    @FindBy(how = How.CSS, using = "#area-code")
    public WebElement areaCodeTextField;
    @FindBy(how = How.CSS, using = "#phone-number")
    public WebElement phoneNumberTextField;
    @FindBy(how = How.CSS, using = "#chk-terms-conditions")
    public WebElement checkoutAcceptTyC;
    @FindBy(how = How.CSS, using = "#save-info-notifications")
    public WebElement saveChangesBtnServProd;
    @FindBy(how = How.CSS, using = "#addresses-tab > span > span:nth-child(1)")
    public WebElement addressesSection;
    @FindBy(how = How.CSS, using = "#location-address")
    public WebElement addresLineTexField;
    @FindBy(how = How.CSS, using = "#locality-location-address")
    public WebElement cityTexField;
    @FindBy(how = How.CSS, using = "#StateNameLong-location-address")
    public WebElement stateTexField;
    @FindBy(how = How.CSS, using = "#ZipCode-location-address")
    public WebElement zIPTexField;
    @FindBy(how = How.CSS, using = "#Name")
    public WebElement nameAddressTexField;
    @FindBy(how = How.CSS, using = "#editName")
    public WebElement editNameAddressTexField;
    @FindBy(how = How.CSS, using = "#addresses-tab-content > div.card.card-settings.mt-4.work-experience.px-3.px-sm-3.px-md-4.px-lg-5 > div > div:nth-child(3) > div.col-lg-4.d-flex.align-items-center > a > span")
    public WebElement addAddressBtn;
    @FindBy(how = How.CSS, using = "#address > div > div > div > div:nth-child(2) > a.cl-primary.mr-3")
    public WebElement editAddressBtn;
    @FindBy(how = How.CSS, using = "#edit-address > div > div > div > div:nth-child(3) > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement acceptEditBtn;
    @FindBy(how = How.CSS, using = "#address > div > div > div > div:nth-child(2) > a:nth-child(2)")
    public WebElement deleteAddressBtn;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement acceptDeleteBtn;
    @FindBy(how = How.CSS, using = "#location")
    public WebElement enterALocationField;
    @FindBy(how = How.CSS, using = "#radius")
    public WebElement enterARadius;

    public void goToSettingServ() {
        try {
            fluentWait(getDriver(), mySettingsProd);
            waitForWebElementAndClick(mySettingsProd);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), mySettingsProd);
            waitForWebElementAndClick(mySettingsProd);
        }
    }

    public void goToCashoutServ() {
        try {
            fluentWait(getDriver(), cashoutProd);
            waitForWebElementAndClick(cashoutProd);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), cashoutProd);
            waitForWebElementAndClick(cashoutProd);
        }
    }

    public String validConnectStipe() {
        fluentWait(getDriver(), pendingProd);
        String result = pendingProd.getText();
        return result;
    }

    public void enterFirstName() {
        try {
            fluentWait(getDriver(), firstNameProd);
            waitForWebElementAndClick(firstNameProd);
            firstNameProd.clear();
            firstNameProd.sendKeys("Gaston");
            firstNameProd.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), firstNameProd);
            waitForWebElementAndClick(firstNameProd);
            firstNameProd.clear();
            firstNameProd.sendKeys("Gaston");
            firstNameProd.sendKeys(Keys.ENTER);
        }

    }

    public void enterLastName() {
        try {
            fluentWait(getDriver(), LastNameProd);
            waitForWebElementAndClick(LastNameProd);
            LastNameProd.clear();
            LastNameProd.sendKeys("Genaud");
            LastNameProd.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), LastNameProd);
            waitForWebElementAndClick(LastNameProd);
            LastNameProd.clear();
            LastNameProd.sendKeys("Genaud");
            LastNameProd.sendKeys(Keys.ENTER);
        }
    }

    public void enterPhoneNumber() {
        try {
            fluentWait(getDriver(), phoneNumberProd);
            waitForWebElementAndClick(phoneNumberProd);
            phoneNumberProd.clear();
            phoneNumberProd.sendKeys("123456789");
            phoneNumberProd.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), phoneNumberProd);
            waitForWebElementAndClick(phoneNumberProd);
            phoneNumberProd.clear();
            phoneNumberProd.sendKeys("123456789");
            phoneNumberProd.sendKeys(Keys.ENTER);
        }
    }

    public void enterUsername() {
        try {
            fluentWait(getDriver(), userNameProd);
            waitForWebElementAndClick(userNameProd);
            userNameProd.clear();
            userNameProd.sendKeys("GastonUserProd");
            userNameProd.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), userNameProd);
            waitForWebElementAndClick(userNameProd);
            userNameProd.clear();
            userNameProd.sendKeys("GastonUserProd");
            userNameProd.sendKeys(Keys.ENTER);
        }
    }

    public void enterEmail() {
        try {
            fluentWait(getDriver(), emailProd);
            waitForWebElementAndClick(emailProd);
            emailProd.clear();
            emailProd.sendKeys("gastongenaud@7r1ck.com");
            emailProd.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), emailProd);
            waitForWebElementAndClick(emailProd);
            emailProd.clear();
            emailProd.sendKeys("gastongenaud@7r1ck.com");
            emailProd.sendKeys(Keys.ENTER);
        }
    }


    public void saveChanges() {
        try {
            fluentWait(getDriver(), SaveChangesBtnProd);
            waitForWebElementAndClick(SaveChangesBtnProd);
            retryingFindClick(SaveChangesBtnProd);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), SaveChangesBtnProd);
            waitForWebElementAndClick(SaveChangesBtnProd);
        }

    }

    public String validSaveProfile() {
        try {
            fluentWait(getDriver(), successText);
            String result = successText.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), successText);
            String result = successText.getText();
            return result;
        }

    }

    public void selectPayment() {
        try {
            fluentWait(getDriver(), paymentSection);
            waitForWebElementAndClick(paymentSection);


        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), paymentSection);
            waitForWebElementAndClick(paymentSection);

        }

    }


    public void nameOnCardField() {
        try {
            fluentWait(getDriver(), nameOnCardTextField);
            waitForWebElementAndClick(nameOnCardTextField);
            nameOnCardTextField.sendKeys("Automation");
            nameOnCardTextField.sendKeys(Keys.ENTER);

        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), nameOnCardTextField);
            waitForWebElementAndClick(nameOnCardTextField);
            nameOnCardTextField.sendKeys("Automation");
            nameOnCardTextField.sendKeys(Keys.ENTER);
        }
    }

    public void cardNumberField() {
        try {
            fluentWait(getDriver(), cardOnNumberTextField);
            waitForWebElementAndClick(cardOnNumberTextField);
            cardOnNumberTextField.sendKeys("4242424242424242");
            cardOnNumberTextField.sendKeys(Keys.ENTER);

        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), cardOnNumberTextField);
            waitForWebElementAndClick(cardOnNumberTextField);
            cardOnNumberTextField.sendKeys("4242424242424242");
            cardOnNumberTextField.sendKeys(Keys.ENTER);
        }
    }

    public void expDateField() {
        try {
            fluentWait(getDriver(), expDateTextField);
            waitForWebElementAndClick(expDateTextField);
            expDateTextField.sendKeys("01/25");
            expDateTextField.sendKeys(Keys.ENTER);

        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), expDateTextField);
            waitForWebElementAndClick(expDateTextField);
            expDateTextField.sendKeys("01/25");
            expDateTextField.sendKeys(Keys.ENTER);
        }
    }

    public void securityCode() {
        try {
            fluentWait(getDriver(), securityCodeTextField);
            waitForWebElementAndClick(securityCodeTextField);
            securityCodeTextField.sendKeys("111");
            securityCodeTextField.sendKeys(Keys.ENTER);

        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), securityCodeTextField);
            waitForWebElementAndClick(securityCodeTextField);
            securityCodeTextField.sendKeys("111");
            securityCodeTextField.sendKeys(Keys.ENTER);
        }
    }

    public void addCreditCard() {
        try {
            fluentWait(getDriver(), addCreditCardBtn);
            waitForWebElementAndClick(addCreditCardBtn);


        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addCreditCardBtn);
            waitForWebElementAndClick(addCreditCardBtn);

        }
    }

    public void deleteCreditCard() {
        try {
            fluentWait(getDriver(), deleteBtn);
            waitForWebElementAndClick(deleteBtn);


        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), deleteBtn);
            waitForWebElementAndClick(deleteBtn);

        }
    }

    public void selectPassword() {
        try {
            fluentWait(getDriver(), passwordSection);
            waitForWebElementAndClick(passwordSection);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), passwordSection);
            waitForWebElementAndClick(passwordSection);
        }
    }

    public void newPasswordField() {
        try {
            fluentWait(getDriver(), newPasswordTextField);
            waitForWebElementAndClick(newPasswordTextField);
            newPasswordTextField.sendKeys("#NcUzbusYqu667gq");
            newPasswordTextField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), newPasswordTextField);
            waitForWebElementAndClick(newPasswordTextField);
            newPasswordTextField.sendKeys("#NcUzbusYqu667gq");
            newPasswordTextField.sendKeys(Keys.ENTER);
        }

    }

    public void selectNotifications() {
        try {
            fluentWait(getDriver(), notificationsSection);
            waitForWebElementAndClick(notificationsSection);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), notificationsSection);
            waitForWebElementAndClick(notificationsSection);
        }
    }

    public void activateSMSNotifications() {
        try {
            fluentWait(getDriver(), onSMSNotification);
            waitForWebElementAndClick(onSMSNotification);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), onSMSNotification);
            waitForWebElementAndClick(onSMSNotification);
        }
    }

    public void countryCodeField() {
        try {
            fluentWait(getDriver(), countryCodeTextField);
            waitForWebElementAndClick(countryCodeTextField);
            countryCodeTextField.sendKeys("+54");
            countryCodeTextField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), countryCodeTextField);
            waitForWebElementAndClick(countryCodeTextField);
            countryCodeTextField.sendKeys("+54");
            countryCodeTextField.sendKeys(Keys.ENTER);
        }
    }

    public void areaCode() {
        try {
            fluentWait(getDriver(), areaCodeTextField);
            waitForWebElementAndClick(areaCodeTextField);
            areaCodeTextField.sendKeys("351");
            areaCodeTextField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), areaCodeTextField);
            waitForWebElementAndClick(areaCodeTextField);
            areaCodeTextField.sendKeys("351");
            areaCodeTextField.sendKeys(Keys.ENTER);
        }
    }

    public void phoneNumberField() {
        try {
            fluentWait(getDriver(), phoneNumberTextField);
            waitForWebElementAndClick(phoneNumberTextField);
            phoneNumberTextField.sendKeys("2286803");
            phoneNumberTextField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), phoneNumberTextField);
            waitForWebElementAndClick(phoneNumberTextField);
            phoneNumberTextField.sendKeys("2286803");
            phoneNumberTextField.sendKeys(Keys.ENTER);
        }
    }

    public void acceptTermsAndConditions() {
        try {
            fluentWait(getDriver(), checkoutAcceptTyC);
            waitForWebElementAndClick(checkoutAcceptTyC);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), checkoutAcceptTyC);
            waitForWebElementAndClick(checkoutAcceptTyC);
        }

    }

    public void saveChangesNotifications() {
        try {
            fluentWait(getDriver(), saveChangesBtnServProd);
            waitForWebElementAndClick(saveChangesBtnServProd);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), saveChangesBtnServProd);
            waitForWebElementAndClick(saveChangesBtnServProd);
        }
    }

    public void desactiveNotificationCheckout() {
        try {
            fluentWait(getDriver(), onSMSNotification);
            waitForWebElementAndClick(onSMSNotification);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), onSMSNotification);
            waitForWebElementAndClick(onSMSNotification);
        }
    }

    public void selectAddressesSections() {
        try {
            fluentWait(getDriver(), addressesSection);
            waitForWebElementAndClick(addressesSection);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addressesSection);
            waitForWebElementAndClick(addressesSection);
        }
    }

    public void addressLineField() {
        try {
            fluentWait(getDriver(), addresLineTexField);
            waitForWebElementAndClick(addresLineTexField);
            addresLineTexField.sendKeys("723 Felspar Street");
            addresLineTexField.sendKeys(Keys.ESCAPE);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addresLineTexField);
            waitForWebElementAndClick(addresLineTexField);
            addresLineTexField.sendKeys("723 Felspar Street");
        }
    }

    public void cityField() {
        try {
            fluentWait(getDriver(), cityTexField);
            waitForWebElementAndClick(cityTexField);
            cityTexField.sendKeys("San Diego");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), cityTexField);
            waitForWebElementAndClick(cityTexField);
            cityTexField.sendKeys("San Diego");
        }
    }

    public void stateField() {
        try {
            fluentWait(getDriver(), stateTexField);
            waitForWebElementAndClick(stateTexField);
            stateTexField.sendKeys("California");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), stateTexField);
            waitForWebElementAndClick(stateTexField);
            stateTexField.sendKeys("California");
        }
    }

    public void zIPField() {
        try {
            fluentWait(getDriver(), zIPTexField);
            waitForWebElementAndClick(zIPTexField);
            zIPTexField.sendKeys("92109");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), zIPTexField);
            waitForWebElementAndClick(zIPTexField);
            zIPTexField.sendKeys("92109");

        }
    }

    public void nameThisAddress() {
        try {
            fluentWait(getDriver(), nameAddressTexField);
            waitForWebElementAndClick(nameAddressTexField);
            nameAddressTexField.sendKeys("Automation");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), nameAddressTexField);
            waitForWebElementAndClick(nameAddressTexField);
            nameAddressTexField.sendKeys("Automation");
        }
    }

    public void addAddress() {
        try {
            fluentWait(getDriver(), addAddressBtn);
            waitForWebElementAndClick(addAddressBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addAddressBtn);
            waitForWebElementAndClick(addAddressBtn);
        }
    }

    public void selectEdit() {
        try {
            fluentWait(getDriver(), editAddressBtn);
            waitForWebElementAndClick(editAddressBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), editAddressBtn);
            waitForWebElementAndClick(editAddressBtn);
        }
    }

    public void editAddress() {
        try {
            fluentWait(getDriver(), editNameAddressTexField);
            waitForWebElementAndClick(editNameAddressTexField);
            editNameAddressTexField.sendKeys(" Edit");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), editNameAddressTexField);
            waitForWebElementAndClick(editNameAddressTexField);
            editNameAddressTexField.sendKeys(" Edit");
        }
    }

    public void acceptEditAddress() {
        try {
            fluentWait(getDriver(), acceptEditBtn);
            waitForWebElementAndClick(acceptEditBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), acceptEditBtn);
            waitForWebElementAndClick(acceptEditBtn);
        }
    }

    public void deleteSavedAddress() {
        try {
            fluentWait(getDriver(), deleteAddressBtn);
            waitForWebElementAndClick(deleteAddressBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), deleteAddressBtn);
            waitForWebElementAndClick(deleteAddressBtn);
        }
    }

    public void confirmDeleteAddress() {
        try {
            fluentWait(getDriver(), acceptDeleteBtn);
            waitForWebElementAndClick(acceptDeleteBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), acceptDeleteBtn);
            waitForWebElementAndClick(acceptDeleteBtn);
        }
    }

    public boolean enterLocation() {
        fluentWait(getDriver(), enterALocationField);
        Boolean result = enterALocationField.isDisplayed();
        return result;
    }

    public boolean enterRadius() {
        fluentWait(getDriver(), enterARadius);
        Boolean result = enterARadius.isDisplayed();
        return result;
    }
}
