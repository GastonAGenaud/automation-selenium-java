package steps.listing;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.listing.ServicesListingDetailsPage;


public class ServicesListingDetailsSteps extends BasePage {

    private ServicesListingDetailsPage _page;

    public ServicesListingDetailsSteps() {

        this._page = new ServicesListingDetailsPage();

    }

    @Given("SVC I go to the listing details page on OHE")
    public void SvCiGoToTheListingDetailsPageOnOHE() {
        _page.setHomePage();
        _page.goToLoginPage();
        _page.loginWithGastonUserSVC();
    }

    @When("SVC select the seller name")
    public void SvCselectTheSellerName() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
    }

    @Then("SVC see the seller storefront profile")
    public void SvCseeTheSellerStorefrontProfile() {
        _page.providerText();
    }

    @When("SVC select the send message button")
    public void SvCselectTheSendMessageButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.sendMessageButton();
        _page.sendMessageTextBox();

    }

    @Then("SVC see that it redirects me to the chat page")
    public void SvCseeThatItRedirectsMeToTheChatPage() {
        _page.fromBoxSend();
    }

    @When("SVC I select the Hire Button")
    public void SvCiSelectTheHireButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.hireButton();
    }

    @Then("SVC I validate Hire Button")
    public void SvCiValidateHireButton() {
        Assert.assertEquals(true, _page.hireTxt());
    }

    @When("SVC I select the Service information button")
    public void SvCiSelectTheServiceInformationButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.serviceInfoButton();
    }

    @Then("SVC I validate Service information sector")
    public void SvCiValidateServiceInformationSector() {
        Assert.assertEquals(true, _page.serviceInfoTxt());
    }

    @When("SVC I select the Availability button")
    public void SvCiSelectTheAvailabilityButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.availabilityButton();
    }

    @Then("SVC I validate Availability sector")
    public void SvCiValidateAvailabilitySector() {
        Assert.assertEquals(true, _page.availabilityTxt());
    }


    @When("SVC I select the Flat rate services button")
    public void SvCiSelectTheFlatRateServicesButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.flatRateServicesButton();
    }


    @Then("SVC I validate Flat rate services sector")
    public void SvCiValidateFlatRateServicesSector() {
        Assert.assertEquals(true, _page.flatRateServicesTxt());
    }

    @When("SVC I select the Media button")
    public void SvCiSelectTheMediaButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.mediaButton();
    }

    @Then("SVC I validate Media sector")
    public void SvCiValidateMediaSector() {
        Assert.assertEquals(true, _page.mediaTxt());
    }

    @When("SVC I select the Review button")
    public void SvCiSelectTheReviewButton() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        _page.reviewsButton();
    }

    @Then("SVC I validate Review sector")
    public void SvCiValidateReviewSector() {
        Assert.assertEquals(true, _page.reviewTxt());
    }

    @Then("SVC I validate Work sector")
    public void SvCiValidateWorkSector() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        Assert.assertEquals(true, _page.workTxt());
    }

    @Then("SVC I validate Education sector")
    public void SvCiValidateEducationSector() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        Assert.assertEquals(true, _page.educationTxt());
    }

    @Then("SVC I validate Bio sector")
    public void SvCiValidateBioSector() {
        _page.BrowseClassesButton();
        _page.exampleItemButton();
        Assert.assertEquals(true, _page.bioTxt());

    }


}