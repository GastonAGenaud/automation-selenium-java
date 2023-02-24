package steps.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.dashboard.OhDashboardPage;

public class OhDashboardSteps extends BasePage {

    public OhDashboardPage _page;

    public OhDashboardSteps() {

        this._page = new OhDashboardPage();
    }

    @Given("I login and go to Dashboard")
    public void iLoginAndGoToDashboard() {
        _page.goToLoginPage();
        _page.login();
        _page.goToDashboard();
    }

    @When("I select dashboard customer section")
    public void iSelectDashboardCustomerSection() {
        _page.goToDashboard();
        _page.selectCustomer();
    }

    @And("I select my settings button")
    public void iSelectMySettingsButton() {
        _page.goToDashboard();
        _page.selectMySettings();
    }

    @And("I select the see all most popular button")
    public void iSelectTheSeeAllMostPopularButton() {
        _page.goToDashboard();
        _page.selectMostPopular();
    }

    @And("I select the see all my orders button")
    public void iSelectTheSeeAllMyOrdersButton() {
        _page.goToDashboard();
        _page.selectMyOrders();
    }

    @And("I select the go to my calendar button")
    public void iSelectTheGoToMyCalendarButton() {
        _page.goToDashboard();
        _page.selectMyCalendar();
    }

    @And("I select the see all messages button")
    public void iSelectTheSeeAllMessagesButton() {
        _page.goToDashboard();
        _page.selectAllMessages();
    }

    @And("I select create a want button")
    public void iSelectCreateAWantButton() {
        _page.goToDashboard();
        _page.selectCreateAWant();
    }

    @Then("I validate the customer dashboard")
    public void iValidateTheCustomerDashboard() {
        _page.goToDashboard();
        Assert.assertEquals(_page.customerValidate(), true);
    }

    @When("I select dashboard provider section")
    public void iSelectDashboardProviderSection() {
        _page.goToDashboard();
        _page.selectProvider();
    }

    @And("I select see all latest reviews button")
    public void iSelectSeeAllLatestReviewsButton() {
        _page.selectLatestReviews();
    }

    @And("I select invite people button")
    public void iSelectInvitePeopleButton() {
        _page.goToDashboard();
        _page.selectProvider();
        _page.selectInvitePeople();
    }

    @And("I select see all my sales button")
    public void iSelectSeeAllMySalesButton() {
        _page.goToDashboard();
        _page.selectProvider();
        _page.selectMySales();
    }

    @And("I select create a new listing button")
    public void iSelectCreateANewListingButton() {
        _page.goToDashboard();
        _page.selectProvider();
        _page.selectNewListing();
    }

    @And("I select see all messages button")
    public void iSelectSeeAllMessagesButton() {
        _page.goToDashboard();
        _page.selectProvider();
        _page.selectProviderMessages();
    }

    @And("I select go to my calendar button in provider")
    public void iSelectGoToMyCalendarButtonInProvider() {
        _page.goToDashboard();
        _page.selectProvider();
        _page.selectGoToMyCalendar();
    }

    @Then("I validate provider dashboard")
    public void iValidateTheProviderDashboard() {
        _page.goToDashboard();
        _page.selectProvider();
        Assert.assertEquals(_page.providerValidate(), true);
    }

    @Then("I validate the Most Popular sector")
    public void iValidateTheMostPopularSector() {
        _page.goToDashboard();
        _page.selectProvider();
        Assert.assertEquals(_page.providerValidate(), true);
    }
}