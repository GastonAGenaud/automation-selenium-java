package steps.orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.orders.OHEOrdersPage;

public class OHEOrdersSteps extends BasePage {

    private OHEOrdersPage _page;

    public OHEOrdersSteps() {

        this._page = new OHEOrdersPage();
    }

    @Given("OHE I login and go to orders page")
    public void oHEiLoginAndGoToOrdersPage() {
        //_page.goToOwlPage();
        _page.login();
        _page.goToDashboard();
        _page.goToOrders();
    }

    @When("OHE I select sold section")
    public void oheISelectSoldSection() {
        _page.soldOption();
    }

    @Then("OHE I validate sold section")
    public void oheIValidateSoldSection() {
    }

    @When("OHE I select purchased section")
    public void oheISelectPurchasedSection() {
        _page.ordersPurchasedButton();
    }

    @And("OHE I validate open section in purchased")
    public void oheIValidateOpenSectionInPurchased() {
    }

    @And("OHE I validate close section in purchased")
    public void oheIValidateCloseSectionInPurchased() {
    }

    @Then("OHE I validate purchased section")
    public void oheIValidatePurchasedSection() {
    }

    @When("OHE I select sort by all")
    public void oheISelectSortByAll() {
        _page.ordersShowAll();
    }

    @And("OHE I select sort by Pending response")
    public void oheISelectSortByPendingResponse() {
        _page.ordersPendingResponse();
    }

    @And("OHE I select sort by Shipment pending")
    public void oheISelectSortByShipmentPending() {
        _page.ordersShowShipmentPending();
    }

    @And("OHE I select sort by pick up pending")
    public void oheISelectSortByPickUpPending() {
    }

    @And("OHE I select sort by shipped")
    public void oheISelectSortByShipped() {
        _page.ordersShowShipped();
    }

    @And("OHE I select sort by delivered")
    public void oheISelectSortByDelivered() {
        _page.ordersShowDelivered();
    }

    @And("OHE I select sort by completed")
    public void oheISelectSortByCompleted() {
        _page.ordersShowCompleted();
    }

    @And("OHE I select sort by cancelled")
    public void oheISelectSortByCancelled() {
        _page.ordersCancelled();
    }

    @Then("OHE I validate orders sort by")
    public void oheIValidateOrdersSortBy() {
        Assert.assertEquals(_page.showMenu(), "Show");
    }
}