package steps.productionServices;

import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.productionServices.SProdLoginPages;


public class SProdLoginSteps extends BasePage {

    private SProdLoginPages _page;

    public SProdLoginSteps() {

        this._page = new SProdLoginPages();
    }



    @Given("I go login page PROD")
    public void iGoLoginPagePROD() {
        _page.goToLogin();
    }


    @When("Login title valid")
    public void loginTitleValid() {
        Assert.assertEquals("Login",_page.validateLoginText());
    }

    @And("valid Login with Facebook")
    public void validLoginWithFacebook() {
        Assert.assertEquals("Login with Facebook",_page.validateLoginFacebookText());
    }

    @And("valid Login with Google")
    public void validLoginWithGoogle() {
        Assert.assertEquals(true,_page.validateLoginGoogleText());
    }

    @Then("valid session login")
    public void validSessionLogin() {
        Assert.assertEquals(true,_page.logoQAProductionSite());
    }

    @Given("I go to Sign Up PROD")
    public void iGoToSignUpPROD() {
        _page.goToSignUp();
    }

    @When("Sign Up title valid")
    public void signUpTitleValid() {
    }

    @And("I Validate the E-mail text field")
    public void iValidateTheEMailTextField() {
    }

    @And("I validate the Username Text Field")
    public void iValidateTheUsernameTextField() {
    }

    @And("I validate the Password Text Field")
    public void iValidateThePasswordTextField() {
    }

    @Then("valid session Sign Up")
    public void validSessionSignUp() {
    }
}
