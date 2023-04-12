package steps.production;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.production.HomePage;

import java.io.IOException;


public class HomeSteps extends BasePage {

    private HomePage _page;

    public HomeSteps() {

        this._page = new HomePage();
    }


    @Before
    public void testSignup() throws IOException {
        _page.loginWithGastonUserProdProducts();

    }


    @And("select Contact Us button")
    public void selectContactUsButton() {
    }

    @When("complete Name TextField")
    public void completeNameTextField() {
    }

    @And("complete Email TextField")
    public void completeEmailTextField() {
    }

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
    }

    @And("validate modified text")
    public void validateModifiedText() {
    }


    @Then("I validate Landing Page")
    public void iValidateLandingPage() {
    }
}