package steps.production;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.admin.AdminPage;
import pages.production.AdminPanelPage;

import java.io.IOException;


public class AdminPanelSteps extends BasePage {

    private AdminPanelPage _page;

    public AdminPanelSteps() {

        this._page = new AdminPanelPage();
    }

//    @Before
//    public void testSignup() throws IOException {
//        _page.loginWithGastonUserProdProducts();
//
//    }

    @When("I select Users tab")
    public void iSelectUsersTab() {
        _page.setUsersBtn();
        _page.getCloseChat();
    }

    @And("go to Admin Panel")
    public void goToAdminPanel() {
        getDriver().navigate().to(UrlProd + "/Admin/application/getstarted");
        _page.getCloseChat();
    }

    @And("Select Action button")
    public void selectActionButton() {
        _page.getCloseChat();
        _page.selectActionButton();
    }

    @And("select Impersonate Button")
    public void selectImpersonateButton() {
        _page.impersonateOption();
    }

    @Then("I validate action sector in Admin panel - Users")
    public void iValidateActionSectorInAdminPanelUsers() {
        _page.impersonateValidation();
    }

    @And("complete search filter")
    public void completeSearchFilter() {
        _page.searchUser();
    }

    @Then("I validate Filter sector in Admin panel - Users")
    public void iValidateFilterSectorInAdminPanelUsers() {
        _page.userResult();
    }

    @And("select Filter button")
    public void selectFilterButton() {
        _page.filterButton();
    }
}


