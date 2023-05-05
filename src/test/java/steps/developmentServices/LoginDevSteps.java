package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.SProdLoginPages;

import java.io.IOException;

public class LoginDevSteps extends BasePage {
    private LoginDevSteps _page;

    public LoginDevSteps() {

        this._page = new LoginDevSteps();
    }

    @Given("I go login page PROD")
    public void iGoLoginPagePROD() {
        _page.goToLogin();
    }

    @When("Login title valid")
    public void loginTitleValid() {
        Assert.assertEquals("Login", _page.validateLoginText());
    }

    @And("valid Login with Facebook")
    public void validLoginWithFacebook() {
        Assert.assertEquals("Login with Facebook", _page.validateLoginFacebookText());
    }

    @And("valid Login with Google")
    public void validLoginWithGoogle() {
        Assert.assertEquals(true, _page.validateLoginGoogleText());
    }

    @Then("valid session login")
    public void validSessionLogin() {
        Assert.assertEquals(true, _page.logoQAProductionSite());
    }
    @When("go to forgot your Password")
    public void goToForgotYourPassword() {
        _page.forgotYourPassword();
    }
    @And("enter the e-mail to recover the password")
    public void enterTheEMailToRecoverThePassword() {
        _page.enterTheEmail();
    }
    @Then("Valid that An email has been sent to reset the password.")
    public void validThatAnEmailHasBeenSentToResetThePassword() {
        Assert.assertEquals("Reset password e-mail was sent", _page.validMessageToResetThePassword());
    }

}
