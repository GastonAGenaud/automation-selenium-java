package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.ListingDevPage;

import java.io.IOException;

public class ListingDevSteps extends BasePage {
    private ListingDevPage _page;

    public ListingDevSteps() {

        this._page = new ListingDevPage();
    }

    @And("go to Dashboard ServI validate listing name text field Serv")
    public void iValidateListingNameTextFieldServ() {
        _page.listingNameField();
    }

    @And("I validate listing category Serv")
    public void iValidateListingCategoryServ() {
        _page.selectCategory();
        _page.businessCategory();
    }

    @And("I validate listing Work ModelServ")
    public void iValidateListingWorkModelServ() {
        _page.workModelSection();
        _page.selectVideoConference();
    }

    @And("I validate listing description text field Serv")
    public void iValidateListingDescriptionTextFieldServ() {
        _page.listingDescriptionField();
    }

    @And("I validate the listing Price Serv")
    public void iValidateTheListingPriceServ() {
        _page.listingPricePerHour();
    }

    @And("I validate listing image Serv")
    public void iValidateListingImageServ() {
        _page.listingAddImage();
        _page.cropButton();
    }

    @And("I validate listing video URL Serv")
    public void iValidateListingVideoURLServ() {
        _page.listingVideoURLField();
        _page.addVideoURL();
    }

    @And("Go to details Section Serv")
    public void goToDetailsSectionServ() {
        _page.goToDetails();
    }

    @And("I validate Custom fields")
    public void iValidateCustomFields() {
        _page.listingLanguages();
        _page.listingWorkModel();
        _page.listingBusinessSpecialties();
        _page.listingTechSpecialties();
        _page.listingTechSpecialtiesOption();
        _page.listingDropdownFilter();
        _page.listingColorPicker();
    }

    @And("Go to Availability Serv")
    public void goToAvailabilityServ() {
        _page.goToAvailability();
    }

    @And("I validate Set available days")
    public void iValidateSetAvailableDays() {
        _page.selectWeekday();
        _page.selectFrom();
        _page.selectTimeTo();
        _page.selectAddTimeslot();
        _page.publish();
    }

    @Then("I validate Create a Listing Serv")
    public void iValidateCreateAListingServ() {
        Assert.assertEquals(_page.GreatText(), "Great job! Your listing is under review and will be published soon.");
    }

    @When("select My Listings button Serv")
    public void selectMyListingsButtonServ() {
        _page.selectMyListingsServ();
    }

    @And("add New Listing")
    public void addNewListing() {
        _page.createNewListing();
        _page.enterTheName();
        _page.enterCategory();
        _page.descriptionSection();
        _page.hourlyPriceSection();
        _page.listingImageLoad();
        _page.cropButton();
        _page.goToDetails();
        _page.textCustomField();
        _page.numberCustomField();
        _page.dropdownCustomField();
        _page.checkboxCustomField();
        _page.colorPicker();
        _page.goToAvailability();
        _page.publish();
    }


}
