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

//    @Before
//    public void testSignup() throws IOException {
//        _page.loginWithGastonUserProd();

//}

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
    public void iLoginWithGastonUserProd() throws IOException {
        _page.loginWithGastonUserProd();
    }

    @Given("I login with Gaston User PROD")
    public void loginWithGastonUserStepsProd() {
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
    }

    @And("complete Website TextField")
    public void completeWebsiteTextField() {
    }

    @And("complete Facebook TextField")
    public void completeFacebookTextField() {
    }

    @And("complete Twitter TextField")
    public void completeTwitterTextField() {
    }

    @And("complete Instagram TextField")
    public void completeInstagramTextField() {
    }

    @And("complete Linkedin TextField")
    public void completeLinkedinTextField() {
    }

    @And("complete Youtube TextField")
    public void completeYoutubeTextField() {
    }
}

