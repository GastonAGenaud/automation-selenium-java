package steps.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.dashboard.SvcDashboardPage;

public class SvcDashboardSteps extends BasePage {

    public SvcDashboardPage _page;

    public SvcDashboardSteps() {

        this._page = new SvcDashboardPage();
    }

//    @Given("I login and go to Dashboard")
//    public void SVCiLoginAndGoToDashboard() {
//        _page.goToLoginPage();
//        _page.login();
//        _page.goToDashboard();
//    }
//
//    @When("I select dashboard customer section")
//    public void SVCiSelectDashboardCustomerSection() {
//        _page.goToDashboard();
//        _page.selectCustomer();
//    }
//
//    @And("I select my settings button")
//    public void SVCiSelectMySettingsButton() {
//        _page.goToDashboard();
//        _page.selectMySettings();
//    }
//
    @And("SVC I select the see all most popular button")
    public void SVCiSelectTheSeeAllMostPopularButton() {
        _page.goToDashboard();
        _page.selectMostPopular();
    }
//
//    @And("I select the see all my orders button")
//    public void SVCiSelectTheSeeAllMyOrdersButton() {
//        _page.goToDashboard();
//        _page.selectMyOrders();
//    }
//
    @And("SVC I select the go to my calendar button")
    public void SVCiSelectTheGoToMyCalendarButton() {
        _page.goToDashboard();
        _page.selectMyCalendar();
    }

    @And("SVC I select the see all messages button")
    public void SVCiSelectTheSeeAllMessagesButton() {
        _page.goToDashboard();
        _page.selectAllMessages();
    }

    @And("SVC I select create a want button")
    public void SVCiSelectCreateAWantButton() {
        _page.goToDashboard();
        _page.selectCreateAWant();
    }
//
//    @Then("I validate the customer dashboard")
//    public void SVCiValidateTheCustomerDashboard() {
//        _page.goToDashboard();
//        Assert.assertEquals(_page.customerValidate(), true);
//    }
//
//    @When("I select dashboard provider section")
//    public void SVCiSelectDashboardProviderSection() {
//        _page.goToDashboard();
//        _page.selectProvider();
//    }
//
//    @And("I select see all latest reviews button")
//    public void SVCiSelectSeeAllLatestReviewsButton() {
//        _page.selectLatestReviews();
//    }
//
//    @And("I select invite people button")
//    public void SVCiSelectInvitePeopleButton() {
//        _page.goToDashboard();
//        _page.selectProvider();
//        _page.selectInvitePeople();
//    }
//
//    @And("I select see all my sales button")
//    public void SVCiSelectSeeAllMySalesButton() {
//        _page.goToDashboard();
//        _page.selectProvider();
//        _page.selectMySales();
//    }
//
//    @And("I select create a new listing button")
//    public void SVCiSelectCreateANewListingButton() {
//        _page.goToDashboard();
//        _page.selectProvider();
//        _page.selectNewListing();
//    }
//
//    @And("I select see all messages button")
//    public void SVCiSelectSeeAllMessagesButton() {
//        _page.goToDashboard();
//        _page.selectProvider();
//        _page.selectProviderMessages();
//    }
//
//    @And("I select go to my calendar button in provider")
//    public void SVCiSelectGoToMyCalendarButtonInProvider() {
//        _page.goToDashboard();
//        _page.selectProvider();
//        _page.selectGoToMyCalendar();
//    }
//
//    @Then("I validate provider dashboard")
//    public void SVCiValidateTheProviderDashboard() {
//        _page.goToDashboard();
//        _page.selectProvider();
//        Assert.assertEquals(_page.providerValidate(), true);
//    }
//
//    @Then("I validate the Most Popular sector")
//    public void SVCiValidateTheMostPopularSector() {
//        _page.goToDashboard();
//        _page.selectProvider();
//        Assert.assertEquals(_page.providerValidate(), true);
    }
//}