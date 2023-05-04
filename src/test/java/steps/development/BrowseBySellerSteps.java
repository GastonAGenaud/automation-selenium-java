package steps.development;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.development.BrowseBySellerPage;


public class BrowseBySellerSteps extends BasePage {

    private BrowseBySellerPage _page;

    public BrowseBySellerSteps() {

        this._page = new BrowseBySellerPage();
    }


//    @Before
//    public void testSignup() throws IOException {
//        _page.loginWithGastonUserDevProducts();
//
//    }


    @And("go to Browse By Seller")
    public void goToBrowseBySeller() {
        getDriver().navigate().to(UrlDevProducts + "Listing/BrowseBySeller");
    }

    @When("select Accessories BBS")
    public void selectAccessoriesBBS() {
        _page.accessoriesButton();
    }

    @And("select Body Jewelry & Stuff BBS")
    public void selectBodyJewelryStuffBBS() {
        _page.bodyJewelryAndStuff();
    }

    @And("select Bracelets & Stuff BBS")
    public void selectBraceletsStuffBBS() {
        _page.braceletsAndStuff();
    }

    @And("select Earrings BBS")
    public void selectEarringsBBS() {
        _page.earringsButton();
    }

    @And("select happy BBS")
    public void selectHappyBBS() {
        _page.happyButton();
    }

    @And("select Rings BBS")
    public void selectRingsBBS() {
        _page.ringsButton();
    }

    @And("select Shoes BBS")
    public void selectShoesBBS() {
        _page.shoesButton();
    }

    @Then("I validate Filters BBS")
    public void iValidateFiltersBBS() {
        _page.validateCategoriesSector();
    }

    @When("complete Location TextField BBS")
    public void completeLocationTextFieldBBS() {
        _page.locationTextField();
    }

    @Then("I validate Location BBS")
    public void iValidateLocationBBS() {
        _page.locationSectorValidate();
    }

    @And("select Department")
    public void selectDepartment() {
        _page.departmentOption();
    }

    @And("select Mens option")
    public void selectMensOption() {
        _page.selectMens();
    }

    @And("select Art Deco checkbox")
    public void selectArtDecoCheckbox() {
        _page.artDecoCheckbox();
    }

    @And("complete Size TextField")
    public void completeSizeTextField() {
        _page.sizeTextField();
    }

    @And("select Article License")
    public void selectArticleLicense() {
        _page.articleLicenseOption();
    }

    @And("select Medium License")
    public void selectMediumLicense() {
    }
}