package steps.storefront;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.storefront.OhStorefrontPage;

import java.io.IOException;

public class OhStorefrontSteps extends BasePage {

    private OhStorefrontPage _page;

    public OhStorefrontSteps() {

        this._page = new OhStorefrontPage();
    }

    @Given("I login and go to user profile")
    public void iLoginAndGoToUserProfile(){
        _page.setHomePage();
        _page.goToLoginPage();
        _page.login();
    }

    @When("I select the profile Button")
    public void iSelectTheProfileButton() {
        _page.goToProfile();
    }

    @Then("I see the user Storefront")
    public void iSeeTheUserStorefront() {
        Assert.assertEquals(true, _page.profileStorefront());
    }

    @When("I select the Change cover picture Button")
    public void iSelectTheChangeCoverPictureButton() {
        _page.goToProfile();
        _page.loadCoverPicture();
    }

    @Then("I see the new Cover Image")
    public void iSeeTheNewCoverImage() {
        Assert.assertEquals(true, _page.profileStorefront());
    }

    @When("I validate the settings Button")
    public void iValidateTheSettingsButton() {
        _page.goToSettings();
    }

    @And("I validate the Profile first name text field")
    public void iValidateTheProfileFirstNameTextField() {
        _page.firstName();
    }

    @And("I validate the Profile last name text field")
    public void iValidateTheProfileLastNameTextField() {
        _page.lastName();
    }

    @And("I validate the Profile username text field")
    public void iValidateTheProfileUsernameTextField() {
        _page.username();
    }

    @And("I validate the Profile email text field")
    public void iValidateTheProfileEmailTextField() {
        _page.email();
    }

    @And("I validate the Profile phone number text field")
    public void iValidateTheProfilePhoneNumberTextField() {
        _page.phoneNumber();
    }

    @And("I validate the Profile bio text field")
    public void iValidateTheProfileBioTextField() {
        _page.bioEdition();
    }

    @Then("I validate user Profile info")
    public void iValidateUserProfileInfo() {
        Assert.assertEquals(true, _page.profileAvatar());
    }

    @When("I validate the settings button OHE")
    public void iValidateTheSettingsButtonOHE() {
        _page.goToSettings();
    }
}