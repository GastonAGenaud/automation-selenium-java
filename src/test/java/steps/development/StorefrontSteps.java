package steps.development;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.testng.Assert;
import pages.BasePage;
import pages.development.StorefrontPage;


public class StorefrontSteps extends BasePage {

    private StorefrontPage _page;

    public StorefrontSteps() {

        this._page = new StorefrontPage();

    }


    @When("PROD I select the profile button")
    public void prodiSelectTheProfileButton() {
        _page.setProfilePage();
    }

    @Then("PROD I see the user storefront")
    public void prodiSeeTheUserStorefront() {
        Assert.assertEquals(true, _page.profileStorefront());
    }

    @And("PROD I select the Change cover picture button")
    public void prodiSelectTheChangeCoverPictureButton() {
        //_page.goToProfile();
        _page.loadCoverPicture();
    }

    @Then("PROD I see the new cover image")
    public void prodiSeeTheNewCoverImage() {
        Assert.assertEquals(true, _page.profileStorefront());
    }


    @When("PROD I validate the settings button")
    public void prodiValidateTheSettingsButton() {
        _page.goToSettings();
    }

    @And("PROD I validate the profile first name text field")
    public void prodiValidateTheProfileFirstNameTextField() {
        _page.firstName();
    }

    @And("PROD I validate the profile last name text field")
    public void prodiValidateTheProfileLastNameTextField() {
        _page.lastName();
    }

    @And("PROD I validate the profile username text field")
    public void prodiValidateTheProfileUsernameTextField() {
        _page.username();
    }

    @And("PROD I validate the profile email text field")
    public void prodiValidateTheProfileEmailTextField() {
        _page.email();
    }

    @And("PROD I validate the profile phone number text field")
    public void prodiValidateTheProfilePhoneNumberTextField() {
        _page.phoneNumber();
    }

    @And("PROD I validate the profile bio text field")
    public void prodiValidateTheProfileBioTextField() {
        _page.setFrameText();
    }


    @Then("PROD I validate user profile info")
    public void prodiValidateUserProfileInfo() {
        Assert.assertEquals(true, _page.profileAvatar());
    }

    @When("PROD I select social button")
    public void prodiSelectSocialButton() {
        _page.goToSettings();
        _page.socialButton();
    }

    @And("PROD I validate the web site text field")
    public void prodiValidateTheWebSiteTextField() {
        _page.webSite();
    }

    @And("PROD I validate the facebook text field")
    public void prodiValidateTheFacebookTextField() {
        _page.facebook();
    }

    @And("PROD I validate the twitter text field")
    public void prodiValidateTheTwitterTextField() {
        _page.twitter();
    }

    @And("PROD I validate the instagram text field")
    public void prodiValidateTheInstagramTextField() {
        _page.instagram();
    }

    @And("PROD I validate the linkedin text field")
    public void prodiValidateTheLinkedinTextField() {
        _page.linkedin();
    }

    @And("PROD I validate the youtube text field")
    public void prodiValidateTheYoutubeTextField() {
        _page.youtube();
    }

    @Then("PROD I validate the profile social media")
    public void prodiValidateTheProfileSocialMedia() {
        Assert.assertEquals("You on the web", _page.socialConfirmText());
    }
}