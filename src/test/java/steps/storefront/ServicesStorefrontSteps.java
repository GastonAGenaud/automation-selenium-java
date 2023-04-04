package steps.storefront;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.storefront.ServicesStorefrontPage;

import java.io.IOException;

public class ServicesStorefrontSteps extends BasePage {

    private ServicesStorefrontPage _page;

    public ServicesStorefrontSteps() {

        this._page = new ServicesStorefrontPage();
    }


    @Given("SVC I login and go to user profile")
    public void SvcILoginAndGoToUserProfile() throws IOException {
        _page.setHomePage();
        _page.goToLoginPage();
        _page.loginWithGastonUserSVC();
    }

    @When("SVC I select the profile Button")
    public void SvcISelectTheProfileButton() {
        _page.goToProfile();
    }

    @Then("SVC I see the user Storefront")
    public void SvcISeeTheUserStorefront() {
        Assert.assertEquals(true, _page.profileStorefront());
    }

    @When("SVC I select the Change cover picture Button")
    public void SvcISelectTheChangeCoverPictureButton() {
        _page.goToProfile();
        _page.loadCoverPicture();
    }

    @Then("SVC I see the new Cover Image")
    public void SvcISeeTheNewCoverImage() {
        Assert.assertEquals(true, _page.profileStorefront());
    }

    @When("SVC I validate the settings button")
    public void SvcIValidateTheSettingsButton() {
        _page.goToSettings();
    }

    @And("SVC I validate the Profile first name text field")
    public void SvcIValidateTheProfileFirstNameTextField() {
        _page.firstName();
    }

    @And("SVC I validate the Profile last name text field")
    public void SvcIValidateTheProfileLastNameTextField() {
        _page.lastName();
    }

    @And("SVC I validate the Profile username text field")
    public void SvcIValidateTheProfileUsernameTextField() {
        _page.username();
    }

    @And("SVC I validate the Profile email text field")
    public void SvcIValidateTheProfileEmailTextField() {
        _page.email();
    }

    @And("SVC I validate the Profile phone number text field")
    public void SvcIValidateTheProfilePhoneNumberTextField() {
        _page.phoneNumber();
    }

    @And("SVC I validate the Profile bio text field")
    public void SvcIValidateTheProfileBioTextField() {
        _page.bioEdition();
    }

    @Then("SVC I validate user Profile info")
    public void SvcIValidateUserProfileInfo() {
        Assert.assertEquals(true, _page.profileAvatar());
    }

//    @When("SVC I validate the settings button")
//    public void SvcIValidateTheSettingsButton() {
//        _page.goToSettings();
//    }
}