package steps.development;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.development.SearchPage;

public class SearchSteps extends BasePage {

    private SearchPage _page;

    public SearchSteps() {

        this._page = new SearchPage();

    }



    @And("select Home button")
    public void selectHomeButton() {
        _page.homeButton();
    }

    @When("complete search TextField")
    public void completeSearchTextField() {
        _page.searchHomeTxt();
    }

    @When("complete search TextField Browse")
    public void completeSearchTextFieldBrowse() {
        _page.searchBrowseTxt();
    }

    @And("select search")
    public void selectSearch() {
        _page.searchButtonBrowse();
    }

    @Then("I validate Search in home")
    public void iValidateSearchInHome() {
        _page.validSearching();
    }

    @And("select Browse Listings")
    public void selectBrowseListings() {
        _page.browseListingButton();
    }

    @Then("I validate Search in Listings")
    public void iValidateSearchInListings() {
        _page.validSearching();
    }

    @And("select update")
    public void selectUpdate() {
        _page.UpdateButton();
    }
}