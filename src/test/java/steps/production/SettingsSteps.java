package steps.production;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.production.SettingsPage;

import java.io.IOException;

public class SettingsSteps extends BasePage {

    private SettingsPage _page;

    public SettingsSteps() {

        this._page = new SettingsPage();

    }

    @Before
    public void testSignup() throws IOException {
        _page.loginWithGastonUserProdProducts();

}

    @And("go to dashboard")
    public void goToDashboard() {
        getDriver().navigate().to(UrlProd + "/dashboard");
    }

    @When("I select settings")
    public void iSelectSettings() {
        _page.dashboardSettingsTab();
    }

    @And("select password tab")
    public void selectPasswordTab() {
        _page.dashboardPasswordTab();
    }

    @And("change password completing New Password TextField")
    public void changePasswordCompletingNewPasswordTextField() {
        _page.currentPasswordTextField();
        _page.resetPassword();
    }

    @And("select Save Changes")
    public void selectSaveChanges() {
        _page.saveChangesPassword();
    }

    @Then("I valid change password")
    public void iValidChangePassword() {
        _page.textChangePasswordValidate();
        _page.passwordChangedPopUp();
    }

    @Given("I login with Gaston User Prod")
    public void iLoginWithGastonUserProdProducts() throws IOException {
        _page.loginWithGastonUserProdProducts();
    }

    @Given("I login with Gaston User PROD")
    public void loginWithGastonUserStepsProdProducts() {
        try {
            getDriver().manage().deleteAllCookies();
            ProdHomePage();
            sessionManager.usePreviousLoggedInSession("GastonUser");

            getDriver().navigate().refresh();
            sessionManager.usePreviousLoggedInSession("GastonUser");
        } catch (Exception e) {
            wait(3);

            getDriver().manage().deleteAllCookies();
            ProdHomePage();
            sessionManager.usePreviousLoggedInSession("GastonUser");

            getDriver().navigate().refresh();
            sessionManager.usePreviousLoggedInSession("GastonUser");
        }
    }

    @And("select Social tab")
    public void selectSocialTab() {
        _page.dashboardSocialTab();
    }

    @And("complete Website TextField")
    public void completeWebsiteTextField() {
        _page.websiteTextField();
    }

    @And("complete Facebook TextField")
    public void completeFacebookTextField() {
        _page.facebookTextField();
    }

    @And("complete Twitter TextField")
    public void completeTwitterTextField() {
        _page.twitterTextField();
    }

    @And("complete Instagram TextField")
    public void completeInstagramTextField() {
        _page.instagramTextField();
    }

    @And("complete Linkedin TextField")
    public void completeLinkedinTextField() {
        _page.linkedinTextField();
    }

    @And("complete Youtube TextField")
    public void completeYoutubeTextField() {
        _page.youtubeTextField();
        _page.twitterTextField();
    }

    @Then("I valid add social profile urls")
    public void iValidAddSocialProfileUrls() {
        _page.urlsAddedPopUp();
    }

    @And("complete Name on card TextField")
    public void completeNameOnCardTextField() {
        _page.nameOnCardTextField();
    }

    @And("complete Card number TextField")
    public void completeCardNumberTextField() {
        _page.cardNumberTextField();
    }

    @And("complete Expiration Date TextField")
    public void completeExpirationDateTextField() {
        _page.expirationDateTextField();
    }

    @And("complete Security Code TextField")
    public void completeSecurityCodeTextField() {
        _page.cvvTextField();
    }

    @And("select Add Credit Card button")
    public void selectAddCreditCardButton() {
    }

    @Then("I validate Add credit card")
    public void iValidateAddCreditCard() {
    }
}




