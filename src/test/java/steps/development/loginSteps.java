package steps.development;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.development.loginPage;

public class loginSteps extends BasePage {

    private loginPage _page;

    public loginSteps() {

        this._page = new loginPage();

    }

    @Given("I go to Products")
    public void iGoToProducts() {
        getDriver().navigate().to(UrlDevProducts);
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

    @When("select Forgot your password?")
    public void selectForgotYourPassword() {
        _page.forgotPasswordButton();
    }

    @And("complete Forgot Email TexField")
    public void completeForgotEmailTexField() {
        _page.forgotPasswordInput();
    }

    @And("select Send e-mail button")
    public void selectSendEMailButton() {
        _page.sendEmailForgot();
    }

    @Then("see reset password message")
    public void seeResetPasswordMessage() {
        _page.resetPasswordText();
    }
}