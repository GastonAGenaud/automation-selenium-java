package steps.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.dashboard.ServicesDashboardPage;

public class ServicesDashboardSteps extends BasePage {

    public ServicesDashboardPage _page;

    public ServicesDashboardSteps() {

        this._page = new ServicesDashboardPage();
    }

    @Given("SVC I login and go to Dashboard")
    public void SVCiLoginAndgoToDashboardSVC() {
        _page.goToLoginPage();
        _page.loginWithGastonUserSVC();
        _page.goToDashboardSVC();
    }

    @When("SVC I select dashboard customer section")
    public void SVCiSelectDashboardCustomerSection() {
        _page.goToDashboardSVC();
        _page.selectCustomer();
    }

    
    @And("SVC I select my settings button")
    public void SVCiSelectMySettingsButton() {
        _page.goToDashboardSVC();
        _page.selectMySettings();
    }

    @And("SVC I select the see all most popular button")
    public void SVCiSelectTheSeeAllMostPopularButton() {
        _page.goToDashboardSVC();
        _page.selectMostPopular();
    }

    @And("SVC I select the see all my orders button")
    public void SVCiSelectTheSeeAllMyOrdersButton() {
        _page.goToDashboardSVC();
        _page.selectMyOrders();
    }

    @And("SVC I select the go to my calendar button")
    public void SVCiSelectTheGoToMyCalendarButton() {
        _page.goToDashboardSVC();
        _page.selectMyCalendar();
    }

    @And("SVC I select the see all messages button")
    public void SVCiSelectTheSeeAllMessagesButton() {
        _page.goToDashboardSVC();
        _page.selectAllMessages();
    }

    @And("SVC I select create a want button")
    public void SVCiSelectCreateAWantButton() {
        _page.goToDashboardSVC();
        _page.selectCreateAWant();
    }

    @Then("SVC I validate the customer dashboard")
    public void SVCiValidateTheCustomerDashboard() {
        _page.goToDashboardSVC();
        Assert.assertEquals(_page.customerValidate(), true);
    }

    @When("SVC I select dashboard provider section")
    public void SVCiSelectDashboardProviderSection() {
        _page.goToDashboardSVC();
        _page.selectProvider();
    }

    @And("SVC I select see all latest reviews button")
    public void SVCiSelectSeeAllLatestReviewsButton() {
        _page.selectLatestReviews();
    }

    @And("SVC I select invite people button")
    public void SVCiSelectInvitePeopleButton() {
        _page.goToDashboardSVC();
        _page.selectProvider();
        _page.selectInvitePeople();
    }

    @And("SVC I select see all my sales button")
    public void SVCiSelectSeeAllMySalesButton() {
        _page.goToDashboardSVC();
        _page.selectProvider();
        _page.selectMySales();
    }

    @And("SVC I select create a new listing button")
    public void SVCiSelectCreateANewListingButton() {
        _page.goToDashboardSVC();
        _page.selectProvider();
        _page.selectNewListing();
    }

    @And("SVC I select see all messages button")
    public void SVCiSelectSeeAllMessagesButton() {
        _page.goToDashboardSVC();
        _page.selectProvider();
        _page.selectProviderMessages();
    }

    @And("SVC I select go to my calendar button in provider")
    public void SVCiSelectGoToMyCalendarButtonInProvider() {
        _page.goToDashboardSVC();
        _page.selectProvider();
        _page.selectGoToMyCalendar();
    }

    @Then("SVC I validate provider dashboard")
    public void SVCiValidateTheProviderDashboard() {
        _page.goToDashboardSVC();
        _page.selectProvider();
        Assert.assertEquals(_page.providerValidate(), true);
    }

    @Then("SVC I validate the Most Popular sector")
    public void SVCiValidateTheMostPopularSector() {
        _page.goToDashboardSVC();
        _page.selectProvider();
        Assert.assertEquals(_page.providerValidate(), true);
    }
}