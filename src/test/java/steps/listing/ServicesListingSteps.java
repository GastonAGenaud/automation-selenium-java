package steps.listing;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pages.BasePage;
import pages.listing.ServicesListingDetailsPage;
import pages.listing.ServicesListingPage;

public class ServicesListingSteps extends BasePage {

    private ServicesListingPage _page;

    public ServicesListingSteps() {

        this._page = new ServicesListingPage();
    }


    @Given("SVC I login and I go to Dashboard")
    public void SVCiLoginAndGoToDashboard() {
        _page.setHomePage();
        _page.goToLoginPage();
        _page.login();
        _page.goToDashboardPage();
    }

    @And("SVC I validate the My Listings button")
    public void SVCiValidateTheMyListingsButton() {
        _page.myListingButton();
    }

    @When("SVC I validate add new listing button")
    public void SVCiValidateTheAddNewListingButton() {
        _page.addNewListing();
    }

    @And("SVC I validate listing name text field")
    public void SVCiValidateTheListingNameTextField() {
        _page.listingNameTextField();
    }

    @And("SVC I validate listing category")
    public void SVCiValidateTheListingCategory() {
        _page.categoryBtn();
        _page.listingCategoryOption();

    }

    @And("SVC I validate listing description text field")
    public void SVCiValidateTheListingDescriptionTextField() {
        _page.listingDescriptionTextField();
    }

    @And("SVC I validate the listing Hourly price")
    public void SVCiValidateTheListingHourlyPrice() {
        _page.setUpHourlyCheckbox();
        _page.listingHourlyPriceTextField();
    }


    @And("SVC I validate listing image")
    public void SVCiValidateTheListingImage() {
        _page.listingImageUploadButton();
        _page.cropButton();
    }

    @And("SVC I validate listing video URL")
    public void SVCiValidateTheListingVideoURL() {

        _page.listingVideoURLTextField();
    }

    @And("SVC I select the go to details")
    public void SVCiSelectTheGoToDetails() {
        _page.selectGoToDetailsButton();
    }

    @And("SVC I select Subject Tag")
    public void SVCiSelectSubjectTag() {

        _page.selectSubjectTag();
    }

    @And("SVC I select Work Model checkbox")
    public void SVCiSelectWorkModelCheckbox() {
        _page.workModelCheckboxOnline();
    }

    @And("SVC I select Languages checkbox")
    public void SVCiSelectLanguagesCheckbox() {
        _page.languageCheckboxEnglish();
    }
    @And("SVC I select Speciality checkbox")
    public void SVCiSelectSpecialityCheckbox() {
        _page.specialityCheckbox();
    }

    @And("SVC I complete Cancellation Text Field")
    public void SVCiCompleteCancellationTextField() {
        _page.listingCancellationTextField();
    }

    @And("SVC I select Go to Availability button")
    public void SVCiSelectGoToAvailabilityButton() {
        _page.goToAvailabilityButton();
    }

    @And("SVC I select Available Days tab")
    public void SVCiSelectAvailableDaysTab() {
        _page.selectAvailableDaysTab();
        _page.selectSaturdayOption();
        _page.selectTimeFrom();
        _page.setTimeTwelve();
        _page.setTimeToTab();
        _page.setTimeFour();
    }

    @And("SVC I select Publish button")
    public void SVCiSelectPublishButton() {
        _page.selectAvailableDaysTab();
        _page.selectSaturdayOption();
        _page.selectTimeFrom();
        _page.setTimeTwelve();
        _page.setTimeToTab();
        _page.setTimeFour();
        _page.selectPublishButton();
    }


    @Then("SVC I validate create a listing")
    public void SVCiValidateCreateAListing() {
        Assert.assertEquals(_page.listingActiveTab(), true);
    }

    @And("SVC I select Add Time Slot")
    public void SVCiSelectAddTimeSlot() {
        _page.addTimeSlotButton();
    }

    @And("SVC I select Edit button")
    public void SVCiSelectEditButton() {
        _page.setEditBtn();
    }

    @Then("SVC I validate the Edit button")
    public void SVCiValidateTheEditButton() {
        Assert.assertEquals(_page.editActive(), true);
    }

    @And("SVC I select tab dots")
    public void SVCiSelectTabDots() {
        _page.setTabDots();
    }

    @When("SVC I select Share button")
    public void SVCiSelectShareButton() {
        _page.shareButton();

    }

    @Then("SVC I validate Share button")
    public void SVCiValidateShareButton() {
        Assert.assertEquals(_page.shareMessage(), true);
    }

    @When("SVC I select Delete button")
    public void SVCiSelectDeleteButton() {
        _page.setDeleteClassButton();
        _page.setDeleteConfirm();
    }

    @Then("SVC I validate Delete button")
    public void SVCiValidateDeleteButton() {
        Assert.assertEquals(_page.editActive(), true);
    }
}


