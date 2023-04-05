package steps.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.dashboard.dashboardPage;


public class dashboardSteps extends BasePage {

    private dashboardPage _page;

    public dashboardSteps() {

        this._page = new dashboardPage();

    }


    @And("I go to dashboard")
    public void iGoToDashboard() {
        ////_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.goToDashboard();
    }

    @When("I validate my settings button")
    public void iValidateMySettingsButton() {
        _page.mySettings();
        _page.goToDashboard();
    }

    @And("I validate the most popular carousel section")
    public void iValidateTheMostPopularCarouselSection() {
        _page.buyersCarousel();
    }

    @And("I validate the my orders section")
    public void iValidateTheMyOrdersSection() {
        _page.buyersMyOrders();
    }

    @And("I validate the messages section")
    public void iValidateTheMessagesSection() {
        _page.goToDashboard();
        _page.buyersMessage();
    }

    @And("I validate the create a request button")
    public void iValidateTheCreateARequestButton() {
        _page.goToDashboard();
       // _page.createARequest();
        _page.goToDashboard();
    }

    @Then("I validate buyers dashboard")
    public void iValidateBuyersDashboard() {
    }

    @When("I validate the seller section")
    public void iValidateTheSellerSection() {
        _page.sellerOption();
    }

    @And("I validate the option to view last days section")
    public void iValidateTheOptionToViewLastDaysSection() {
        _page.last7Days();
        _page.last30Days();
        _page.last90Days();
    }

    @And("I validate the latest reviews section")
    public void iValidateTheLatestReviewsSection() {
        _page.seeAllReviews();
    }

    @And("I validate my sales link")
    public void iValidateMySalesLink() {
        _page.goToDashboard();
        _page.sellerOption();
        //_page.mySales();
        _page.goToDashboard();
        _page.sellerOption();
        _page.seeAllMySales();
    }

    @And("I validate see more messages link")
    public void iValidateSeeMoreMessagesLink() {
        _page.goToDashboard();
        _page.sellerOption();
        _page.sellerMessage();
        _page.goToDashboard();
        _page.sellerOption();
        _page.seeAllSellerMessages();
    }

    @And("I validate the request matched carousel")
    public void iValidateTheRequestMatchedCarousel() {
        _page.goToDashboard();
        _page.sellerOption();
        _page.requestCarousel();
    }

    @Then("I validate sellers dashboard")
    public void iValidateSellersDashboard() {
    }
}