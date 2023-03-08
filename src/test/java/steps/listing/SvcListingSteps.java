package steps.listing;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.listing.SvcListingPage;

public class SvcListingSteps extends BasePage {

    private SvcListingPage _page;

    public SvcListingSteps() {

        this._page = new SvcListingPage();
    }
    /*
    @Given("I login and I go to Dashboard")
    public void SVCiLoginAndGoToDashboard() {
        _page.setHomePage();
        _page.goToLoginPage();
        _page.login();
        _page.goToDashboardPage();
    }

    @And("I validate the My Listings button")
    public void SVCiValidateTheMyListingsButton() {
        _page.myListingButton();
    }
*/
    @When("I validate add new listing button")
    public void SVCiValidateTheAddNewListingButton() {
        _page.addNewListing();
    }
/*
    @And("I validate listing name text field")
    public void SVCiValidateTheListingNameTextField() {
        _page.listingNameTextField();
    }

    @And("I validate listing category")
    public void SVCiValidateTheListingCategory() {
        _page.categoryBtn();
        _page.listingCategoryOption();

    }

    @And("I validate listing description text field")
    public void SVCiValidateTheListingDescriptionTextField() {
        _page.listingDescriptionTextField();
    }

    @And("I validate the listing Hourly price")
    public void SVCiValidateTheListingHourlyPrice() {
        _page.listingHourlyPriceTextField();
    }

    @And("I validate listing image")
    public void SVCiValidateTheListingImage() {
        _page.listingImageUploadButton();
    }

    @And("I validate listing video URL")
    public void SVCiValidateTheListingVideoURL() {

        _page.listingVideoURLTextField();
    }

    @And("I select the go to details")
    public void SVCiSelectTheGoToDetails() {
        _page.selectGoToDetailsButton();
    }

    @And("I select Subject Tag")
    public void SVCiSelectSubjectTag(){

        _page.selectSubjectTag();
    }

    @And("I select Work Model checkbox")
    public void SVCiSelectWorkModelCheckbox(){
        _page.workModelCheckboxOnline();
    }

    @And("I select Languages checkbox")
    public void SVCiSelectLanguagesCheckbox() {
        _page.languageCheckboxEnglish();
    }

    @And("I complete Cancellation Text Field")
    public void SVCiCompleteCancellationTextField() {
        _page.listingCancellationTextField();
    }
    @And("I select Go to Availability button")
    public void SVCiSelectGoToAvailabilityButton() {
        _page.goToAvailabilityButton();
    }

    @And("I select Available Days tab")
    public void SVCiSelectAvailableDaysTab(){
        _page.selectAvailableDaysTab();
        _page.selectSaturdayOption();
        _page.selectTimeFrom();
        _page.setTimeTwelve();
        _page.setTimeToTab();
        _page.setTimeFour();
    }

    @And("I select Publish button")
    public void SVCiSelectPublishButton() {
//        _page.selectAvailableDaysTab();
//        _page.selectSaturdayOption();
//        _page.selectTimeFrom();
//        _page.setTimeTwelve();
//        _page.setTimeToTab();
//        _page.setTimeFour();
        _page.selectPublishButton();
    }


    @Then("I validate create a listing")
    public void SVCiValidateCreateAListing() {
        Assert.assertEquals(_page.listingActiveTab(), true);
    }

    @And("I select Add Time Slot")
    public void SVCiSelectAddTimeSlot() {
        _page.addTimeSlotButton();
    }

    @And("I select Edit button")
    public void SVCiSelectEditButton() {
        _page.setEditBtn();
    }

    @Then("I validate the Edit button")
    public void SVCiValidateTheEditButton() {
        Assert.assertEquals(_page.editActive(),true);
    }

    @And("I select tab dots")
    public void SVCiSelectTabDots() {
        _page.setTabDots();
    }

    @When("I select Share button")
    public void SVCiSelectShareButton() {
        _page.shareButton();

    }

    @Then("I validate Share button")
    public void SVCiValidateShareButton() {
        Assert.assertEquals(_page.shareMessage(), true);
    }

    @When("I select Delete button")
    public void SVCiSelectDeleteButton() {
        _page.setDeleteClassButton();
        _page.setDeleteConfirm();
    }

    @Then("I validate Delete button")
    public void SVCiValidateDeleteButton() {
        Assert.assertEquals(_page.editActive(),true);
    }
}

     */

}