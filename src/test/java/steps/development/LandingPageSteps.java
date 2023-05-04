package steps.development;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.development.LandingPagePage;


public class LandingPageSteps extends BasePage {

    private LandingPagePage _page;

    public LandingPageSteps() {

        this._page = new LandingPagePage();
    }

//        @Before
//    public void test() throws IOException {
//        loginWithGastonUserProdProducts();
//    }
    @And("go to Landing Page")
    public void goToLandingPage() {
        getDriver().navigate().to(UrlDevProducts + "Admin/Application/LandingCustomize");
    }

    @When("select Header")
    public void selectHeader() {
        _page.headerOption();
    }

    @And("modify header text to {}")
    public void modifyHeaderTextBLOGToTest(String text) {
        _page.blogModifyText(text);
    }

    @And("select Save")
    public void selectSave() {
        _page.saveButton();
        _page.validateTextSavePopUp();
    }

    @And("validate modified text")
    public void validateModifiedText() {
        getDriver().navigate().refresh();
        _page.validateTestText();
    }


    @Then("I validate Landing Page")
    public void iValidateLandingPage() {
        _page.validateTextSavePopUp();
    }
}