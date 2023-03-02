package steps.browse;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import pages.BasePage;
import pages.browse.OhBrowsePage;


public class OhBrowseSteps extends BasePage {

    private OhBrowsePage _page;

    public OhBrowseSteps() {

        this._page = new OhBrowsePage();

    }

    @Given("I go to browse services page")
    public void iGoToBrowseServicesPage(){
        _page.goToBrowseServices();
    }

    @Then("I validate categories filters")
    public void iValidateCategoriesFilters() {
        Assert.assertEquals(_page.owlVerify(), true);
    }

    @When("I type in the minimum price text field")
    public void iTypeInTheMinimumPriceTextField() {
        _page.minimumPrice();
    }

    @And("I type in the maximum price text field")
    public void iTypeInTheMaximumPriceTextField() {
        _page.maximumPrice();
    }

    @And("I select the price button")
    public void iSelectThePriceButton() {
        _page.selectPrice();
    }

    @And("I type in the location text field")
    public void iTypeInTheLocationTextField() {
        _page.locationField();
    }

    @Then("I validate the browse services price and location")
    public void iValidateTheBrowseServicesPriceAndLocation() {
        Assert.assertEquals(_page.owlVerify(), true);
    }

    @When("I type the browse search text field")
    public void iTypeTheBrowseSearchTextField() {
        _page.browseSearchField();
    }

    @And("I select the browse search button")
    public void iSelectTheBrowseSearchButton() {
        _page.browseSearch();
    }

    @Then("I validate the browse search")
    public void iValidateTheBrowseSearch() {
        Assert.assertEquals(_page.owlVerify(), true);
    }

    @When("I select block view")
    public void iSelectBlockView() {
        _page.blockView();
    }

    @And("I select list view")
    public void iSelectListView() {
        _page.listView();
    }

    @And("I select map view")
    public void iSelectMapView() {
        _page.mapView();
    }

    @Then("I validate the browse view")
    public void iValidateTheBrowseView() {
        Assert.assertEquals(_page.owlVerify(), true);
    }

    @When("I select sort by most relevant")
    public void iSelectSortByMostRelevant() {
        _page.sortByMost();
    }

    @And("I select sort by price: higher to lower")
    public void iSelectSortByPriceHigherToLower() {
        _page.sortByPriceHigher();
    }

    @And("I select sort by price: lower to higher")
    public void iSelectSortByPriceLowerToHigher() {
        _page.sortByPriceLower();
    }

    @And("I select sort by date: newer to older")
    public void iSelectSortByDateNewerToOlder() {
        _page.sortByDateNewer();
    }

    @And("I select sort by date: older to newer")
    public void iSelectSortByDateOlderToNewer() {
        _page.sortByDateOlder();
    }

    @And("I select sort by rating: higher to lower")
    public void iSelectSortByRatingHigherToLower() {
        _page.sortByRating();
    }

    @Then("I validate sort by section")
    public void iValidateSortBySection() {
        Assert.assertEquals(_page.owlVerify(), true);
    }

    @When("I select ages 12 to 14 category filter")
    public void iSelectAges12To14CategoryFilter() {
        _page.ages12to14Category();
    }

    @And("I select ages 15 to 17 category filter")
    public void iSelectAges15To17CategoryFilter() {
        _page.ages15to17Category();
    }

    @And("I select ages 5 to 8 category filter")
    public void iSelectAges5To8CategoryFilter() {
        _page.ages5to8Category();
    }

    @And("I select ages 9 to 11 category filter")
    public void iSelectAges9To11CategoryFilter() {
        _page.ages9to11Category();
    }
}