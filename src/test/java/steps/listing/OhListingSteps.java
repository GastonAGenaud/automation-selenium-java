package steps.listing;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.listing.OhListingPage;

public class OhListingSteps extends BasePage {

    private OhListingPage _page;

    public OhListingSteps() {

        this._page = new OhListingPage();
    }
    @Given("I login and I go to Dashboard")
    public void iLoginAndGoToDashboard() {
        _page.setHomePage();
        _page.goToLoginPage();
        _page.login();
        _page.goToDashboardPage();
    }

    @And("I validate the My Listings button")
    public void iValidateTheMyListingsButton() {
        _page.myListingButton();
    }

    @When("I validate add new listing button")
    public void iValidateTheAddNewListingButton() {
        _page.addNewListing();
    }

    @And("I validate listing name text field")
    public void iValidateTheListingNameTextField() {
        _page.listingNameTextField();
    }

    @And("I validate listing category")
    public void iValidateTheListingCategory() {
        _page.categoryBtn();
        _page.listingCategoryOption();

    }

    @And("I validate listing description text field")
    public void iValidateTheListingDescriptionTextField() {
        _page.listingDescriptionTextField();
    }

    @And("I validate the listing Hourly price")
    public void iValidateTheListingHourlyPrice() {
        _page.listingHourlyPriceTextField();
    }

    @And("I validate listing image")
    public void iValidateTheListingImage() {
        _page.listingImageUploadButton();
    }

    @And("I validate listing video URL")
    public void iValidateTheListingVideoURL() {
        
        _page.listingVideoURLTextField();
    }

    @And("I select the go to details")
    public void iSelectTheGoToDetails() {
           _page.selectGoToDetailsButton();
    }

    @And("I select Subject Tag")
    public void iSelectSubjectTag(){
        
        _page.selectSubjectTag();
    }

    @And("I select Work Model checkbox")
    public void iSelectWorkModelCheckbox(){
        _page.workModelCheckboxOnline();
    }

    @And("I select Languages checkbox")
    public void iSelectLanguagesCheckbox() {
        _page.languageCheckboxEnglish();
    }

    @And("I complete Cancellation Text Field")
    public void iCompleteCancellationTextField() {
       _page.listingCancellationTextField();
    }
    @And("I select Go to Availability button")
    public void iSelectGoToAvailabilityButton() {
        _page.goToAvailabilityButton();
    }

    @And("I select Available Days tab")
    public void iSelectAvailableDaysTab(){
        _page.selectAvailableDaysTab();
        _page.selectSaturdayOption();
        _page.selectTimeFrom();
        _page.setTimeTwelve();
        _page.setTimeToTab();
        _page.setTimeFour();
    }

    @And("I select Publish button")
    public void iSelectPublishButton() {
//        _page.selectAvailableDaysTab();
//        _page.selectSaturdayOption();
//        _page.selectTimeFrom();
//        _page.setTimeTwelve();
//        _page.setTimeToTab();
//        _page.setTimeFour();
        _page.selectPublishButton();
    }


    @Then("I validate create a listing")
    public void iValidateCreateAListing() {
        Assert.assertEquals(_page.listingActiveTab(), true);
    }

    @And("I select Add Time Slot")
    public void iSelectAddTimeSlot() {
        _page.addTimeSlotButton();
    }

    @And("I select Edit button")
    public void iSelectEditButton() {
        _page.setEditBtn();
    }

    @Then("I validate the Edit button")
    public void iValidateTheEditButton() {
        Assert.assertEquals(_page.editActive(),true);
    }

    @And("I select tab dots")
    public void iSelectTabDots() {
        _page.setTabDots();
    }

    @When("I select Share button")
    public void iSelectShareButton() {
        _page.shareButton();
        
    }

    @Then("I validate Share button")
    public void iValidateShareButton() {
        Assert.assertEquals(_page.shareMessage(), true);
    }

    @When("I select Delete button")
    public void iSelectDeleteButton() {
        _page.setDeleteClassButton();
        _page.setDeleteConfirm();
    }

    @Then("I validate Delete button")
    public void iValidateDeleteButton() {
        Assert.assertEquals(_page.editActive(),true);
    }
}
