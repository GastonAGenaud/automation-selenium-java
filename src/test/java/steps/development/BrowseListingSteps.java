package steps.development;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.development.BrowseListingPage;


public class BrowseListingSteps extends BasePage {

    private BrowseListingPage _page;

    public BrowseListingSteps() {

        this._page = new BrowseListingPage();
    }

//    @Before
//    public void testSignup() throws IOException {
//        _page.loginWithGastonUserProdProducts();
//
//    }


    @And("go to Listing Page")
    public void goToListingPage() {
        getDriver().navigate().to("https://mtreborn-dev-products.azurewebsites.net/Listing/Browse");
    }

    @When("select Accessories")
    public void selectAccessories() {
        _page.accessoriesFilterButton();
    }

    @And("select Body Jewelry & Stuff")
    public void selectBodyJewelryStuff() {
        _page.bodyJewelryAndStuffButton();
    }

    @And("select Bracelets & Stuff")
    public void selectBraceletsStuff() {
        _page.braceletsAndStuffButton();
    }

    @And("select Earrings")
    public void selectEarrings() {
        _page.earringsButton();
    }

    @And("select happy")
    public void selectHappy() {
        _page.happyFilterButton();
    }

    @And("select Rings")
    public void selectRings() {
        _page.ringsButton();
    }

    @And("select Shoes")
    public void selectShoes() {
        _page.shoesButton();
    }

    @Then("I validate Filters")
    public void iValidateFilters() {
        _page.validateCategorySector();
    }

    @When("complete price numbers TextFields in Set up Manually")
    public void completePriceNumbersTextFieldsInSetUpManually() {
        _page.minPriceText();
        _page.maxPriceText();
    }

    @And("select Apply button")
    public void selectApplyButton() {
        _page.applyFilterButton();
    }

    @Then("I validate Price filter")
    public void iValidatePriceFilter() {
        _page.validatePrice();
    }

    @When("select Dark Green color")
    public void selectDarkGreenColor() {
        _page.darkGreenColorButton();
    }

    @Then("I validate colors filter")
    public void iValidateColorsFilter() {
        _page.validateColor();
    }

    @When("complete Location TextField")
    public void completeLocationTextField() {
        _page.locationTxt();
    }

    @Then("I validate Location")
    public void iValidateLocation() {
        _page.validateLocationSector();
    }
}
