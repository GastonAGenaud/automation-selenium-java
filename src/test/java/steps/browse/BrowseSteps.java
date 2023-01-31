package steps.browse;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.browse.BrowsePage;


public class BrowseSteps extends BasePage {

    private BrowsePage _page;

    public BrowseSteps() {

        this._page = new BrowsePage();

    }

    //Browse

    @And("I go to Browse Page")
    public void iGoToBrowsePage() {
        _page.headerBrowse();
    }

    @When("I validate the Search text Bar")
    public void iValidateTheSearchTextBar() {
        _page.browseSearchTextField();
        _page.browseClearFilters();
        _page.headerBrowse();
    }

    @And("I validate the Categories Filter Section")
    public void iValidateTheCategoriesFilterSection() {
        _page.browseCategoryAccesoriesBtn();
        _page.browseCategoryHairProductsBtn();
        _page.browseCategoryHomeAndLivingBtn();
        _page.browseCategoryJewelryBtn();
        _page.browseCategoryMakeUpBtn();
        _page.browseCategoryPetAccessoriesBtn();
        _page.browseCategoryRingsBtn();
        _page.browseCategoryShoesBtn();
        _page.browseCategorySportsEquipmentBtn();
        _page.browseCategoryToysBtn();
    }

    @And("I validate the Price Filter Section")
    public void iValidateThePriceFilterSection() {
        _page.browseSetMinimalAmountTextField();
        _page.browseSetMaximusAmountTextField();
        _page.browseAmountFilterBtn();
        _page.browseClearFilters();
    }

    @And("I validate the Location Filter")
    public void iValidateTheLocationFilter() {
        _page.browseLocationFilterTextField();
    }

    @And("I validate the Sort By options")
    public void iValidateTheSortByOptions() {
        _page.sortByPriceHigherToLower();
        _page.sortByPriceLowerToHigher();
        _page.sortByDateNewerToOlder();
        _page.sortByDateOlderToNewer();
        _page.sortByRatingHigherToLower();
        _page.sortByMostRelevant();
        _page.browseClearFilters();
    }

    @And("I validate the visual style")
    public void iValidateTheVisualStyle() {
        _page.browseViewListFormBtn();
        _page.browseViewBlockFormBtn();
        _page.browseMapBtn();
        _page.headerBrowse();
    }

    @Then("I validate the Browse Section")
    public void iValidateTheBrowseSection() {
    }

    //Request

    @And("I go to Browse Request Page")
    public void iGoToBrowseRequestPage() {
        _page.goToBrowseRequest();
        _page.browseCreateRequestBtn();
    }

    @And("I validate the Category")
    public void iValidateTheCategory() {
        _page.categoryButton();
        _page.categoryAccessories();
    }

    @And("I validate the Skills")
    public void iValidateTheSkills() {
        _page.tagsText();
        _page.next();
    }

    @And("I validate the Text bar")
    public void iValidateTheTextBar() {
        _page.requestName();
        _page.getCloseNameError();
        _page.requestDescription();
        _page.addAnImage();
        _page.next();
    }

    @And("I validate the next button to create a request")
    public void iValidateTheNextButtonToCreateARequest() {
        _page.minimumBudget();
        _page.maximumBudget();
        //_page.endDate();
        _page.locationCheckBox();
        _page.next();
        _page.publishRequest();
    }

    @Then("I validate the Create a Request")
    public void iValidateTheCreateARequest() {
    }
}