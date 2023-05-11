package steps.development;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.development.SettingsPage;

import java.io.IOException;

public class SettingsSteps extends BasePage {

    private SettingsPage _page;

    public SettingsSteps() {

        this._page = new SettingsPage();

    }

    //@Before
    public void testSignup() throws IOException {
      _page.loginWithGastonUserDevProducts();
      _page.loginWithDevProd();
    }

    @And("go to dashboard")
    public void goToDashboard() {
        getDriver().navigate().to(UrlDevProducts + "/dashboard");
    }

    @When("I select settings")
    public void iSelectSettings() {
        _page.dashboardSettingsTab();
    }

    @And("select password tab")
    public void selectPasswordTab() {
        _page.dashboardPasswordTab();
    }

    @And("change password completing New Password TextField")
    public void changePasswordCompletingNewPasswordTextField() {
        _page.currentPasswordTextField();
        _page.resetPassword();
    }

    @And("select Save Changes")
    public void selectSaveChanges() {
        _page.saveChangesPassword();
    }

    @Then("I valid change password")
    public void iValidChangePassword() {
        _page.textChangePasswordValidate();
        _page.passwordChangedPopUp();
    }

    @Given("I login with Gaston User in development products")
    public void iloginWithGastonUserDevProducts() throws IOException {
        _page.loginWithGastonUserDevProducts();
    }

    @Given("I login with Gaston User in development products using cookies")
    public void loginWithGastonUserStepsDevProducts() {
        try {
            getDriver().manage().deleteAllCookies();
            ProdHomePage();
            sessionManager.usePreviousLoggedInSession(environment + "-" + suiteName + "-" + "GastonUser");

            getDriver().navigate().refresh();
            sessionManager.usePreviousLoggedInSession(environment + "-" + suiteName + "-" + "GastonUser");
        } catch (Exception e) {
            wait(3);

            getDriver().manage().deleteAllCookies();
            ProdHomePage();
            sessionManager.usePreviousLoggedInSession(environment + "-" + suiteName + "-" + "GastonUser");

            getDriver().navigate().refresh();
            sessionManager.usePreviousLoggedInSession(environment + "-" + suiteName + "-" + "GastonUser");
        }
    }

    @And("select Social tab")
    public void selectSocialTab() {
        _page.dashboardSocialTab();
    }

    @And("complete Website TextField")
    public void completeWebsiteTextField() {
        _page.websiteTextField();
    }

    @And("complete Facebook TextField")
    public void completeFacebookTextField() {
        _page.facebookTextField();
    }

    @And("complete Twitter TextField")
    public void completeTwitterTextField() {
        _page.twitterTextField();
    }

    @And("complete Instagram TextField")
    public void completeInstagramTextField() {
        _page.instagramTextField();
    }

    @And("complete Linkedin TextField")
    public void completeLinkedinTextField() {
        _page.linkedinTextField();
    }

    @And("complete Youtube TextField")
    public void completeYoutubeTextField() {
        _page.youtubeTextField();
        _page.twitterTextField();
    }

    @Then("I valid add social profile urls")
    public void iValidAddSocialProfileUrls() {
        _page.urlsAddedPopUp();
    }

    @And("complete Name on card TextField")
    public void completeNameOnCardTextField() {
        _page.nameOnCardTextField();
    }

    @And("complete Card number TextField")
    public void completeCardNumberTextField() {
        _page.cardNumberTextField();
    }

    @And("complete Expiration Date TextField")
    public void completeExpirationDateTextField() {
        _page.expirationDateTextField();
    }

    @And("complete Security Code TextField")
    public void completeSecurityCodeTextField() {
        _page.cvvTextField();
    }

    @And("select Add Credit Card button")
    public void selectAddCreditCardButton() {
        _page.addCreditCardButton();
    }

    @Then("I validate Add credit card")
    public void iValidateAddCreditCard() {
        _page.cardExists();
    }

    @And("select Notifications Tab")
    public void selectNotificationsTab() {
        _page.dashboardNotificationsTab();
    }

    @And("select Email Notifications checkbox")
    public void selectEmailNotificationsCheckbox() {
        _page.emailNotificationsCheckbox();
    }

    @And("select SMS Notifications checkbox")
    public void selectSMSNotificationsCheckbox() {
        _page.smsNotificationsCheckbox();
    }

    @And("select WhatsApp Notifications checkbox")
    public void selectWhatsAppNotificationsCheckbox() {
        _page.whatsappNotificationCheckbox();
    }

    @Then("I validate Activate Notifications")
    public void iValidateActivateNotifications() {
        _page.saveChangesMessagePopUp();
    }

    @And("complete Phone number TextField ONE")
    public void completePhoneNumberTextFieldONE() {
        _page.countryCodeTxtONE();
        _page.areaCodeTxtONE();
        _page.phoneNumberTxtONE();
        _page.termsAndConditions();
    }

    @And("complete Phone number TextField TWO")
    public void completePhoneNumberTextFieldTWO() {
        _page.countryCodeTxtTWO();
        _page.areaCodeTxtTWO();
        _page.phoneNumberTxtTWO();
    }

    @Then("I validate Deactivate Notifications")
    public void iValidateDeactivateNotifications() {
        _page.saveChangesMessagePopUp();
    }

    @And("select Shipping Tab")
    public void selectShippingTab() {
        _page.dashboardShippingTab();
    }

    @And("select Add New address")
    public void selectAddNewAddress() {
        _page.addAddress();
    }

    @And("complete Full Name TextField")
    public void completeFullNameTextField() {
        _page.enterFullName();
    }

    @And("complete Phone Number TextField")
    public void completePhoneNumberTextField() {
        _page.enterPhoneNumber();
    }

    @And("complete Country TextField")
    public void completeCountryTextField() {
        _page.enterCountry();
    }

    @And("complete State-Province-Region TextField")
    public void completeStateProvinceRegionTextField() {
        _page.enterStateName();
    }

    @And("complete City TextField")
    public void completeCityTextField() {
        _page.enterCity();
    }

    @And("complete ZIP-Postal Code TextField")
    public void completeZIPPostalCodeTextField() {
        _page.enterZipCode();
    }

    @And("select Save Button")
    public void selectSaveButton() {
        _page.saveAddress();
    }

    @And("select Edit Save Button")
    public void selectEditSaveButton() {
        _page.editSaveAddress();
    }

    @Then("I validate Add Address option")
    public void iValidateAddAddressOption() {
        _page.saveChangesMessagePopUp();
    }

    @Then("I validate Edit Address option")
    public void iValidateEditAddressOption() {
        _page.saveChangesMessagePopUp();
    }

    @And("complete Address Line")
    public void completeAddressLine() {
        _page.enterAddress();
    }

    @And("select Edit Address button")
    public void selectEditAddressButton() {
        _page.editAddress();
    }

    @And("Edit Zip Text")
    public void editZipText() {
        _page.editAddressTxt();
    }

    @And("select Delete Address")
    public void selectDeleteAddress() {
        _page.deleteAddress();
    }

    @And("select Delete Confirm")
    public void selectDeleteConfirm() {
        _page.confirmDeleteAddress();
    }

    @Then("I validate delete Address")
    public void iValidateDeleteAddress() {
        _page.deleteAddressSuccessfulPopUp();
    }

    @And("see Personal Information")
    public void seePersonalInformation() {
        _page.validatePersonalInformationText();
    }

    @And("I complete First Name TextField")
    public void iCompleteFirstNameTextField() {
        _page.firstNameTxt();
    }

    @And("complete Last name TextField")
    public void completeLastNameTextField() {
        _page.lastNameTxt();
    }

    @And("complete User Name TextField")
    public void completeUserNameTextField() {
        _page.usernameTxt();
    }

    @And("I complete Phone number TextField")
    public void iCompletePhoneNumberTextField() {
        _page.phoneNumberTxt();
    }

    @And("complete Bio TextField")
    public void completeBioTextField() {
        _page.setFrameText();
    }

    @Then("valid Fill in profile information")
    public void validFillInProfileInformation() {
        _page.saveChangesMessagePopUp();
    }

    @And("I complete E-Mail TextField")
    public void iCompleteEMailTextField() {
        _page.emailText();
    }
}




