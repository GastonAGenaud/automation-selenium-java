package steps.development;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;
import pages.development.ListingDetailsPage;
import pages.development.ListingsPage;

public class ListingsSteps extends BasePage {

    private ListingsPage _page;

    public ListingsSteps() {

        this._page = new ListingsPage();
    }


    @And("DEV I validate the My Listings button")
    public void DEViValidateTheMyListingsButton() {
        _page.myListingButton();
    }

    @When("DEV I validate add new listing button")
    public void DEViValidateTheAddNewListingButton() {
        _page.addNewListing();
    }

    @And("DEV I validate listing name text field")
    public void DEViValidateTheListingNameTextField() {
        _page.listingNameTextField();
    }

    @And("DEV I validate listing category")
    public void DEViValidateTheListingCategory() {
        _page.categoryBtn();
        _page.listingCategoryOption();

    }

    @And("DEV I validate listing description text field")
    public void DEViValidateTheListingDescriptionTextField() {
        _page.listingDescriptionTextField();
    }

    @And("DEV I validate the listing Price")
    public void DEViValidateTheListingPrice() {
        // _page.setUpHourlyCheckbox();
        _page.listingHourlyPriceTextField();
    }

    @And("DEV I validate the listing quantity")
    public void iValidateTheListingQuantity() {
        _page.listingQuantity();
    }


    @And("DEV I validate listing image")
    public void DEViValidateTheListingImage() {
        _page.listingImageUploadButton();
        _page.cropButton();
    }

    @And("DEV I validate listing video URL")
    public void DEViValidateTheListingVideoURL() {
        _page.listingVideoURLTextField();
    }

    @And("DEV I select the go to details")
    public void DEViSelectTheGoToDetails() {
        _page.selectGoToDetailsButton();
    }

    @And("DEV I select Subject Tag")
    public void DEViSelectSubjectTag() {

        _page.selectSubjectTag();
    }

    @And("DEV I select Work Model checkbox")
    public void DEViSelectWorkModelCheckbox() {
        _page.workModelCheckboxOnline();
    }

    @And("DEV I select Languages checkbox")
    public void DEViSelectLanguagesCheckbox() {
        _page.languageCheckboxEnglish();
    }

    @And("DEV I select Speciality checkbox")
    public void DEViSelectSpecialityCheckbox() {
        _page.specialityCheckbox();
    }

    @And("DEV I complete Cancellation Text Field")
    public void DEViCompleteCancellationTextField() {
        _page.listingCancellationTextField();
    }

    @And("DEV I select Go to Availability button")
    public void DEViSelectGoToAvailabilityButton() {
        _page.goToAvailabilityButton();
    }

    @And("DEV I select Available Days tab")
    public void DEViSelectAvailableDaysTab() {
        _page.selectAvailableDaysTab();
        _page.selectSaturdayOption();
        _page.selectTimeFrom();
        _page.setTimeTwelve();
        _page.setTimeToTab();
        _page.setTimeFour();
    }

    @And("DEV I select Publish button")
    public void DEViSelectPublishButton() {
        _page.selectPublishButton();
    }


    @Then("DEV I validate create a listing")
    public void DEViValidateCreateAListing() {
        Assert.assertEquals(_page.listingActiveTab(), true);
    }

    @And("DEV I select Add Time Slot")
    public void DEViSelectAddTimeSlot() {
        _page.addTimeSlotButton();
    }

    @And("DEV I select Edit button")
    public void DEViSelectEditButton() {
        _page.setEditBtn();
    }

    @Then("DEV I validate the Edit button")
    public void DEViValidateTheEditButton() {
        Assert.assertEquals(_page.editActive(), true);
    }

    @And("DEV I select tab dots")
    public void DEViSelectTabDots() {
        _page.setTabDots();
    }

    @When("DEV I select Share button")
    public void DEViSelectShareButton() {
        _page.shareButton();

    }

    @Then("DEV I validate Share button")
    public void DEViValidateShareButton() {
        Assert.assertEquals(_page.shareMessage(), true);
    }

    @When("DEV I select Delete button")
    public void DEViSelectDeleteButton() {
        _page.setDeleteClassButton();
        _page.setDeleteConfirm();
    }

    @Then("DEV I validate Delete button")
    public void DEViValidateDeleteButton() {
        Assert.assertEquals(_page.editActive(), true);
    }

    @And("DEV I select a Color")
    public void devISelectAColor() {
        _page.selectLightBlueColor();
    }

    @And("DEV I click Select the status Tab")
    public void devIClickSelectTheStatusTab() {
        _page.statusTab();
    }

    @And("DEV I select Good")
    public void devISelectGood() {
        _page.selectGood();
    }

    @Then("DEV I validate Create a Listing")
    public void devIValidateCreateAListing() {
        _page.validatingListing();
    }
}


