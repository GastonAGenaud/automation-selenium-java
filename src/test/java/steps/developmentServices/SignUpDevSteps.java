package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.SignUpDevPage;

import java.io.IOException;

public class SignUpDevSteps extends BasePage {
    private SignUpDevPage _page;

    public SignUpDevSteps() {

        this._page = new SignUpDevPage();
    }

    @Given("I go to Sign Up")
    public void iGoToSignUp() {
        _page.goToSignUp();
    }

    @When("Sign Up title valid")
    public void signUpTitleValid() {
        Assert.assertEquals("Sign up", _page.validateSignUpText());
    }

    @And("I Validate the E-mail text field")
    public void iValidateTheEMailTextField() {
        Assert.assertEquals(true, _page.validateEmail());
    }

    @And("I validate the Username Text Field")
    public void iValidateTheUsernameTextField() {
        Assert.assertEquals(true, _page.usernameTextField());
    }

    @And("I validate the Password Text Field")
    public void iValidateThePasswordTextField() {
        Assert.assertEquals(true, _page.passwordTextField());
    }

    @Then("valid session Sign Up")
    public void validSessionSignUp() {
        Assert.assertEquals(true, _page.logoQAProductionSite());
    }


}
