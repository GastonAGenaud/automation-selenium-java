package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.BrowseListingsDevPage;

import java.io.IOException;

public class BrowseListingDevSteps extends BasePage {
    private BrowseListingsDevPage _page;

    public BrowseListingDevSteps() {

        this._page = new BrowseListingsDevPage();
    }

    @And("go to Listing Page Serv")
    public void goToListingPageServ() {
        getDriver().navigate().to(UrlDevServices + "Listing/Browse");
        _page.listingValidation();
    }

    @When("select filter colors")
    public void selectFilterColors() {
        _page.selectPurple();
        _page.selectLightBlue();
        _page.selectBlack();
        _page.selectRed();
        _page.selectBlue();
        _page.selectGreen();
        _page.selectYellow();
        _page.selectPink();
        _page.selectBrown();
    }

    @Then("valid color filter")
    public void validColorFilter() {
        _page.validColorFilterSection();
    }

    @When("select Video Conference")
    public void selectVideoConference() {
        _page.VideoConferenceFilter();
    }

    @And("select in-Person")
    public void selectInPerson() {
        _page.inPersonFilter();
    }

    @Then("I validate Work Model Section")
    public void iValidateWorkModelSection() {
        Assert.assertEquals("Work Model", _page.validateWorkModelSector());
    }

    @When("complete price numbers TextFields in Set up Manually ServProd")
    public void completePriceNumbersTextFieldsInSetUpManuallyServProd() {
        _page.minPriceFilter();
        _page.maxPriceFilter();
    }

    @And("select Apply button Serv")
    public void selectApplyButtonServ() {
        _page.applyFilterPrice();
    }

    @Then("I validate Price filter Serv")
    public void iValidatePriceFilterServ() {
        _page.validatePriceFilter();
    }

    @When("search for the desired product")
    public void searchForTheDesiredProduct() {
        _page.searchProduct();
    }

    @Then("validate that you have found the desired product")
    public void validateThatYouHaveFoundTheDesiredProduct() {
        Assert.assertEquals("test22", _page.validateDesiredProduct());
    }
}
