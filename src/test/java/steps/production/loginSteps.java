package steps.production;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;
import pages.production.loginPage;

public class loginSteps extends BasePage {

    private loginPage _page;

    public loginSteps() {

        this._page = new loginPage();

    }

    @Given("I go to Products")
    public void iGoToProducts() {
        getDriver().navigate().to(UrlProd);
    }

    @And("I select Header Login")
    public void iSelectHeaderLogin() {
        _page.loginHeader();
    }

    @When("complete E-Mail TextField")
    public void completeEMailTextField() {
        _page.emailLoginInputTextField();
    }

    @And("complete Password TextFields")
    public void completePasswordTextFields() {
        _page.passwordFieldStepEmails();
    }

    @And("select Log in Button")
    public void selectLogInButton() {
        _page.loginButton();
    }

    @Then("I validate Login")
    public void iValidateLogin() {
    }
}