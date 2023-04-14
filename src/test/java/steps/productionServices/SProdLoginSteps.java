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

    @Given("I go to Sign Up PROD")
    public void iGoToSignUpPROD() {
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


    @And("I Sign in with new account {string} PROD")
    public void iSignInWithNewAccountEmailPROD(String text) {
        _page.CreateAnAccountListingDetailsPROD(text);
        _page.CloseWindow();
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

    @And("add New Listing")
    public void addNewListing() {
        _page.createNewListing();
        _page.enterTheName();
        _page.enterCategory();
        _page.descriptionSection();
        _page.hourlyPriceSection();
        _page.listingImageLoad();
        _page.cropButton();
        _page.goToDetails();
        _page.textCustomField();
        _page.numberCustomField();
        _page.dropdownCustomField();
        _page.checkboxCustomField();
        _page.colorPicker();
        _page.goToAvailability();
        _page.publish();
    }

    @And("go to Dashboard ServProd")
    public void goToDashboardServProd() {
        _page.goToDashboardServ();
    }

    @When("select My Listings button Serv Prod")
    public void selectMyListingsButtonServProd() {
        _page.selectMyListingsServProd();
    }

    @When("go to Settings Serv Prod")
    public void goToSettingsServProd() {
        _page.goToSettingServ();
    }

    @And("go to Cashout")
    public void goToCashout() {
        _page.goToCashoutServ();
    }

    @Then("valid than connect to Stripe")
    public void validThanConnectToStripe() {
        Assert.assertEquals("Pending", _page.validConnectStipe());
    }

    @And("enter profile information")
    public void enterProfileInformation() {
        _page.enterFirstName();
        _page.enterLastName();
        _page.enterUsername();
        _page.enterEmail();
        _page.enterPhoneNumber();
        _page.saveChanges();
    }

    @Then("valid to save profile information")
    public void validToSaveProfileInformation() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @When("go to Browse Services")
    public void goToBrowseServices() {
        _page.goToBrowseService();
    }

    @And("select the required service")
    public void selectTheRequiredService() {
        _page.enterClassesValet();
    }

    @And("contract the service")
    public void contractTheService() {
        _page.hireTheService();
    }

    @And("complete the form")
    public void completeTheForm() {
        _page.enterDeadline();
        _page.enterDescription();
        _page.enterHire();
    }

    @Then("valid that can hire the service")
    public void validThatCanHireTheService() {
        Assert.assertEquals("Congratulations! You just bought:",_page.validateHireServices());
    }

    @And("enter the new Credit Card")
    public void enterTheNewCreditCard() {
        _page.enterCardNumberServ();
        _page.enterNameOnCardServ();
        _page.enterExpirationDateServ();
        _page.enterCVVCodeServ();
    }

    @And("I select the Submit Payment Button SERV")
    public void iSelectTheSubmitPaymentButtonSERV() {
        _page.iSubmitPendingPaymentServ();
    }
}
