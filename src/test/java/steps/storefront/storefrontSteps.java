package steps.storefront;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;
import pages.storefront.storefrontPage;


public class storefrontSteps extends BasePage {

    private storefrontPage _page;

    public storefrontSteps() {

        this._page = new storefrontPage();

    }


    @When("I select the profile button")
    public void iSelectTheProfileButton() {
        _page.setProfilePage();
    }

    @Then("I see the user storefront")
    public void iSeeTheUserStorefront() {
        Assert.assertEquals(true, _page.profileStorefront());
    }

    @And("I select the Change cover picture button")
    public void iSelectTheChangeCoverPictureButton() {
        //_page.goToProfile();
        _page.loadCoverPicture();
    }

    @Then("I see the new cover image")
    public void iSeeTheNewCoverImage() {
        Assert.assertEquals(true, _page.profileStorefront());
    }


    @When("I validate the settings button")
    public void iValidateTheSettingsButton() {
        _page.goToSettings();
    }

    @And("I validate the profile first name text field")
    public void iValidateTheProfileFirstNameTextField() {
        _page.firstName();
    }

    @And("I validate the profile last name text field")
    public void iValidateTheProfileLastNameTextField() {
        _page.lastName();
    }

    @And("I validate the profile username text field")
    public void iValidateTheProfileUsernameTextField() {
        _page.username();
    }

    @And("I validate the profile email text field")
    public void iValidateTheProfileEmailTextField() {
        _page.email();
    }

    @And("I validate the profile phone number text field")
    public void iValidateTheProfilePhoneNumberTextField() {
        _page.phoneNumber();
    }

    @And("I validate the profile bio text field")
    public void iValidateTheProfileBioTextField() {
        _page.setFrameText();
    }


    @Then("I validate user profile info")
    public void iValidateUserProfileInfo() {
        Assert.assertEquals(true, _page.profileAvatar());
    }

    @When("I select social button")
    public void iSelectSocialButton() {
        _page.goToSettings();
        _page.socialButton();
    }

    @And("I validate the web site text field")
    public void iValidateTheWebSiteTextField() {
        _page.webSite();
    }

    @And("I validate the facebook text field")
    public void iValidateTheFacebookTextField() {
        _page.facebook();
    }

    @And("I validate the twitter text field")
    public void iValidateTheTwitterTextField() {
        _page.twitter();
    }

    @And("I validate the instagram text field")
    public void iValidateTheInstagramTextField() {
        _page.instagram();
    }

    @And("I validate the linkedin text field")
    public void iValidateTheLinkedinTextField() {
        _page.linkedin();
    }

    @And("I validate the youtube text field")
    public void iValidateTheYoutubeTextField() {
        _page.youtube();
    }

    @Then("I validate the profile social media")
    public void iValidateTheProfileSocialMedia() {
        Assert.assertEquals("You on the web", _page.socialConfirmText());
    }
}