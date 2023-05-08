package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.SettingDevPage;

import java.io.IOException;

public class SettingsDevSteps extends BasePage {
    private SettingDevPage _page;

    public SettingsDevSteps() {

        this._page = new SettingDevPage();
    }

    @When("go to Settings Serv")
    public void goToSettingsServ() {
        _page.goToSettingServ();
    }

    @And("go to Cashout")
    public void goToCashout() {
        _page.goToCashoutServ();
    }

    @Then("valid than connect to Stripe")
    public void validThanConnectToStripe() {
        Assert.assertEquals("Pending", _page.validConnectStipe());
    }

    @And("enter profile information Serv")
    public void enterProfileInformationServ() {
        _page.enterFirstName();
        _page.enterLastName();
        _page.enterUsername();
        _page.enterEmail();
        _page.enterPhoneNumber();
        _page.saveChanges();
    }

    @Then("valid to save profile information")
    public void validToSaveProfileInformation() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @Then("select Payment Section")
    public void selectPaymentSection() {
        _page.selectPayment();
    }

    @And("Add new Credit Card")
    public void addNewCreditCard() {
        _page.nameOnCardField();
        _page.cardNumberField();
        _page.expDateField();
        _page.securityCode();
        _page.addCreditCard();
    }

    @When("valid that the new credit card has been created")
    public void validThatTheNewCreditCardHasBeenCreated() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @And("delete Credit Card")
    public void deleteCreditCard() {
        _page.deleteCreditCard();
    }

    @And("valid that the credit card has been erased")
    public void validThatTheCreditCardHasBeenErased() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @Then("select Password section")
    public void selectPasswordSection() {
        _page.selectPassword();
    }

    @And("add New password")
    public void addNewPassword() {
        _page.newPasswordField();
        _page.saveChanges();
    }

    @When("valid if the password has been changed")
    public void validIfThePasswordHasBeenChanged() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @Then("select Notifications Section")
    public void selectNotificationsSection() {
        _page.selectNotifications();
    }

    @And("activate notifications")
    public void activateNotifications() {
        _page.activateSMSNotifications();
        _page.countryCodeField();
        _page.areaCode();
        _page.phoneNumberField();
        _page.acceptTermsAndConditions();
        _page.saveChangesNotifications();
    }

    @When("valid to activate notifications")
    public void validToActivateNotifications() {
        Assert.assertEquals("Success!", _page.validSaveProfile());
    }

    @And("desactive notifications")
    public void desactiveNotifications() {
        _page.desactiveNotificationCheckout();
        _page.saveChangesNotifications();
    }

    @And("valid to desactive notofications")
    public void validToDesactiveNotofications() {
        Assert.assertEquals("Success!", _page.validSaveProfile());
    }

    @Then("select Addresses Section")
    public void selectAddressesSection() {
        _page.selectAddressesSections();
    }

    @And("add New Address")
    public void addNewAddress() {
        _page.addressLineField();
        _page.cityField();
        _page.stateField();
        _page.zIPField();
        _page.nameThisAddress();
        _page.addAddress();
    }

    @When("valid that the new address has been created")
    public void validThatTheNewAddressHasBeenCreated() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @And("select Edit Addresses")
    public void selectEditAddresses() {
        _page.selectEdit();
        _page.editAddress();
        _page.acceptEditAddress();
    }

    @And("valid that the address has been edited")
    public void validThatTheAddressHasBeenEdited() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @And("select Delete Address saved")
    public void selectDeleteAddressSaved() {
        _page.deleteSavedAddress();
        _page.confirmDeleteAddress();
    }

    @And("valid that the address has been erased")
    public void validThatTheAddressHasBeenErased() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @When("validate Location sector Serv")
    public void validateLocationSectorServ() {
        Assert.assertTrue(_page.enterLocation());
        Assert.assertTrue(_page.enterRadius());
    }
}
