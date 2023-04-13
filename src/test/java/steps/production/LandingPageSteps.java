package steps.production;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.production.LandingPagePage;

import java.io.IOException;


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
        getDriver().navigate().to("https://lizcolemp.mymarketplacebuilder.com/Admin/Application/LandingCustomize#!");
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