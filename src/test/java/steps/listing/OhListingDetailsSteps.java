package steps.listing;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pages.BasePage;
import pages.listing.OhListingDetailsPage;


public class OhListingDetailsSteps extends BasePage {

    private OhListingDetailsPage _page;

    public OhListingDetailsSteps() {

        this._page = new OhListingDetailsPage();
    }
    @Given("I go to the listing details page on OHE")
    public void iGoToTheListingDetailsPageOnOHE() {
        _page.setHomePage();
        _page.goToLoginPage();
        _page.login();
    }

    @When("select the seller name")
    public void selectTheSellerName() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
    }

    @Then("see the seller storefront profile")
    public void seeTheSellerStorefrontProfile() {
        _page.providerText();
    }

    @When("select the send message button")
    public void selectTheSendMessageButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.sendMessageButton();
        _page.sendMessageTextBox();

    }

    @Then("see that it redirects me to the chat page")
    public void seeThatItRedirectsMeToTheChatPage() {
        _page.fromBoxSend();
    }

    @When("I select the Hire Button")
    public void iSelectTheHireButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.hireButton();
    }

    @Then("I validate Hire Button")
    public void iValidateHireButton() {
        Assert.assertEquals(true, _page.hireTxt());
    }

    @When("I select the Service information button")
    public void iSelectTheServiceInformationButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.serviceInfoButton();
    }

    @Then("I validate Service information sector")
    public void iValidateServiceInformationSector() {
        Assert.assertEquals(true, _page.serviceInfoTxt());
    }

    @When("I select the Availability button")
    public void iSelectTheAvailabilityButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.availabilityButton();
    }

    @Then("I validate Availability sector")
    public void iValidateAvailabilitySector() {
        Assert.assertEquals(true, _page.availabilityTxt());
    }

    @When("I select the Flat rate services button")
    public void iSelectTheFlatRateServicesButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.flatRateServicesButton();
    }

    @Then("I validate Flat rate services sector")
    public void iValidateFlatRateServicesSector() {
        Assert.assertEquals(true, _page.flatRateServicesTxt());
    }

    @When("I select the Media button")
    public void iSelectTheMediaButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.mediaButton();
    }

    @Then("I validate Media sector")
    public void iValidateMediaSector() {
        Assert.assertEquals(true, _page.mediaTxt());
    }

    @When("I select the Review button")
    public void iSelectTheReviewButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.reviewsButton();
    }
    @Then("I validate Review sector")
    public void iValidateReviewSector() {
        Assert.assertEquals(true, _page.reviewTxt());
    }

    @Then("I validate Work sector")
    public void iValidateWorkSector() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        Assert.assertEquals(true, _page.workTxt());
    }

    @Then("I validate Education sector")
    public void iValidateEducationSector() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        Assert.assertEquals(true, _page.educationTxt());
    }

    @Then("I validate Bio sector")
    public void iValidateBioSector() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        Assert.assertEquals(true, _page.bioTxt());
    }

}
