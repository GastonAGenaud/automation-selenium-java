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


//    @Before
//    public void testSignup() throws IOException {
//        _page.loginWithGastonUserProdProducts();
//
//    }


    @And("select Contact Us button")
    public void selectContactUsButton() {
    }

    @When("complete Name TextField")
    public void completeNameTextField() {
    }

    @And("complete Email TextField")
    public void completeEmailTextField() {
    }

    }