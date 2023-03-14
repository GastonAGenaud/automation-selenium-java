package steps.orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.orders.SvcOrdersPage;

public class SvcOrdersSteps extends BasePage {

    private SvcOrdersPage _page;

    public SvcOrdersSteps() {

        this._page = new  SvcOrdersPage();
    }

    @Given("SVC I login and go to orders page")
    public void svcILoginAndGoToOrdersPage() {
        //_page.goToOwlPage();
        _page.loginWithGastonUserSVC();
        _page.goToDashboard();
        _page.goToOrders();
    }

    @When("SVC I select sold section")
    public void svcISelectSoldSection() {
        _page.soldOption();
    }

    @Then("SVC I validate sold section")
    public void svcIValidateSoldSection() {
    }

    @When("SVC I select purchased section")
    public void svcISelectPurchasedSection() {
        _page.ordersPurchasedButton();
    }

    @And("SVC I validate open section in purchased")
    public void svcIValidateOpenSectionInPurchased() {
    }

    @And("SVC I validate close section in purchased")
    public void svcIValidateCloseSectionInPurchased() {
    }

    @Then("SVC I validate purchased section")
    public void svcIValidatePurchasedSection() {
    }

    @When("SVC I select sort by all")
    public void svcISelectSortByAll() {
        _page.ordersShowAll();
    }

    @And("SVC I select sort by Pending response")
    public void svcISelectSortByPendingResponse() {
        _page.ordersPendingResponse();
    }

    @And("SVC I select sort by Shipment pending")
    public void svcISelectSortByShipmentPending() {
        _page.ordersShowShipmentPending();
    }

    @And("SVC I select sort by pick up pending")
    public void svcISelectSortByPickUpPending() {
    }

    @And("SVC I select sort by shipped")
    public void svcISelectSortByShipped() {
        _page.ordersShowShipped();
    }

    @And("SVC I select sort by delivered")
    public void svcISelectSortByDelivered() {
        _page.ordersShowDelivered();
    }

    @And("SVC I select sort by completed")
    public void svcISelectSortByCompleted() {
        _page.ordersShowCompleted();
    }

    @And("SVC I select sort by cancelled")
    public void svcISelectSortByCancelled() {
        _page.ordersCancelled();
    }

    @Then("SVC I validate orders sort by")
    public void svcIValidateOrdersSortBy() {
        Assert.assertEquals(_page.showMenu(), "Show");
    }
}