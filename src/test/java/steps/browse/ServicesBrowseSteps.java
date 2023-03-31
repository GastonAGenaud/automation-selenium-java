package steps.browse;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import pages.BasePage;
import pages.browse.ServicesBrowsePage;


public class ServicesBrowseSteps extends BasePage {

    private ServicesBrowsePage _page;

    public ServicesBrowseSteps() {

        this._page = new ServicesBrowsePage();

    }

    @Given("SVC I go to browse services page")
    public void SvCiGoToBrowseServicesPage(){
        _page.goToBrowseServices();
    }

    @Then("SVC I validate categories filters")
    public void SvCiValidateCategoriesFilters() {
        Assert.assertEquals(_page.owlVerify(), true);
    }

    @When("SVC I type in the minimum price text field")
    public void SvCiTypeInTheMinimumPriceTextField() {
        _page.minimumPrice();
    }

    @And("SVC I type in the maximum price text field")
    public void SvCiTypeInTheMaximumPriceTextField() {
        _page.maximumPrice();
    }

    @And("SVC I select the price button")
    public void SvCiSelectThePriceButton() {
        _page.selectPrice();
    }

    @And("SVC I type in the location text field")
    public void SvCiTypeInTheLocationTextField() {
        _page.locationField();
    }

    @Then("SVC I validate the browse services price and location")
    public void SvCiValidateTheBrowseServicesPriceAndLocation() {
        Assert.assertEquals(_page.owlVerify(), true);
    }

    @When("SVC I type the browse search text field")
    public void SvCiTypeTheBrowseSearchTextField() {
        _page.browseSearchField();
    }

    @And("SVC I select the browse search button")
    public void SvCiSelectTheBrowseSearchButton() {
        _page.browseSearch();
    }

    @Then("SVC I validate the browse search")
    public void SvCiValidateTheBrowseSearch() {
        Assert.assertEquals(_page.owlVerify(), true);
    }

    @When("SVC I select block view")
    public void SvCiSelectBlockView() {
        _page.blockView();
    }

    @And("SVC I select list view")
    public void SvCiSelectListView() {
        _page.listView();
    }

    @And("SVC I select map view")
    public void SvCiSelectMapView() {
        _page.mapView();
    }

    @Then("SVC I validate the browse view")
    public void SvCiValidateTheBrowseView() {
        Assert.assertEquals(_page.owlVerify(), true);
    }

    @When("SVC I select sort by most relevant")
    public void SvCiSelectSortByMostRelevant() {
        _page.sortByMost();
    }

    @And("SVC I select sort by price: higher to lower")
    public void SvCiSelectSortByPriceHigherToLower() {
        _page.sortByPriceHigher();
    }

    @And("SVC I select sort by price: lower to higher")
    public void SvCiSelectSortByPriceLowerToHigher() {
        _page.sortByPriceLower();
    }

    @And("SVC I select sort by date: newer to older")
    public void SvCiSelectSortByDateNewerToOlder() {
        _page.sortByDateNewer();
    }

    @And("SVC I select sort by date: older to newer")
    public void SvCiSelectSortByDateOlderToNewer() {
        _page.sortByDateOlder();
    }

    @And("SVC I select sort by rating: higher to lower")
    public void SvCiSelectSortByRatingHigherToLower() {
        _page.sortByRating();
    }

    @Then("SVC I validate sort by section")
    public void SvCiValidateSortBySection() {
        Assert.assertEquals(_page.owlVerify(), true);
    }

    @When("SVC I select ages 12 to 14 category filter")
    public void SvCiSelectAges12To14CategoryFilter() {
        _page.ages12to14Category();
    }

    @And("SVC I select ages 15 to 17 category filter")
    public void SvCiSelectAges15To17CategoryFilter() {
        _page.ages15to17Category();
    }

    @And("SVC I select ages 5 to 8 category filter")
    public void SvCiSelectAges5To8CategoryFilter() {
        _page.ages5to8Category();
    }

    @And("SVC I select ages 9 to 11 category filter")
    public void SvCiSelectAges9To11CategoryFilter() {
        _page.ages9to11Category();
    }
}