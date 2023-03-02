package steps.signup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.signup.OhSignupPage;

import java.io.IOException;

public class OhSignupSteps extends BasePage {

    private OhSignupPage _page;

    public OhSignupSteps() {

        this._page = new OhSignupPage();
    }

    @Given("I go to the sign up page")
    public void iGoToTheSignUpPage() {
        _page.goToSignUp();
        _page.headerSignUpButton();
    }

    @When("I type in the E-mail text field {string}")
    public void iTypeInTheEMailTextField(String text) {
        _page.emailTextField(text);
    }

    @And("I type in the Username text field {string}")
    public void iTypeInTheUsernameTextField(String text) {
        _page.userNameTextField(text);
    }

    @And("I type in the Password text field")
    public void iTypeInThePasswordTextField() {
        _page.passwordTextField();
    }

    @And("I select sign up button")
    public void iSelectSignUpButton() {
        _page.signUpBtn();
    }

    @Then("I validate create an account")
    public void iValidateCreateAnAccount() {
        Assert.assertEquals(_page.welcomeText(), true);
    }

    @Given("I Sign in with new account {string}")
    public void iSignInWithNewAccount(String text) {
        _page.CreateAnAccountListingDetailsOHE(text);
//        _page.validateLastError();
    }

}