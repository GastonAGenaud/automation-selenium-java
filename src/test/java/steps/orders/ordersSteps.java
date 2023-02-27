package steps.orders;

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
import org.testng.Assert;
import pages.BasePage;
import pages.orders.ordersPage;


public class ordersSteps extends BasePage {

    private ordersPage _page;

    public ordersSteps() {

        this._page = new ordersPage();
    }

    @And("I go to orders page")
    public void iGoToOrdersPage() {
        _page.goToOrders();
        _page.ordersPurchasedButton();

    }

    @When("I validate sold orders details")
    public void iValidateSoldOrdersDetails() {
        _page.goToOrders();
        _page.shipmentValidatingTxt();
        _page.ordersSoldDetails();
    }

    @And("I validate send message to buyer")
    public void iValidateSendMessageToBuyer() {
        _page.goToOrders();
        _page.ordersSoldMessage();
    }

    @Then("I validate the sold open section")
    public void iValidateTheSoldOpenSection() {
        Assert.assertEquals(true, _page.soldOpenSection());
    }

    @When("I validate the cancel button")
    public void iValidateTheCancelButton() {
        _page.selectSoldBtn();
        _page.ordersSoldCancelBtn();
        _page.setCancelMessage();
    }

    @Then("I validate the shipping orders section")
    public void iValidateTheShippingOrdersSection() {
        Assert.assertEquals(true, _page.shippingOrderSection());
    }

    @When("I validate purchased orders details")
    public void iValidatePurchasedOrdersDetails() {
        _page.ordersPurchasedButton();
        //_page.ordersPurchasedDetails();
    }

    @And("I validate send message to seller")
    public void iValidateSendMessageToSeller() {
        _page.ordersPurchasedButton();
        _page.ordersPurchasedMessage();
        //page.setMessageBeforeChat();
        //_page.setSendBeforeChat();
    }

    @Then("I validate the purchased open section")
    public void iValidateThePurchasedOpenSection() {
        
        Assert.assertEquals(true, _page.purchasedOpenSection());

    }

    @When("I validate the track button")
    public void iValidateTheTrackButton() {
        _page.ordersPurchasedButton();
        _page.purchasedOpenSection();
        _page.ordersPurchasedTrack();

    }

    @And("I validate the buy again button")
    public void iValidateTheBuyAgainButton() {
        getDriver().navigate().refresh();
        _page.ordersPurchasedButton();
        _page.ordersBuyAgain();
        _page.shippingAddressTextValidate();
        _page.goToOrders();
        _page.ordersPurchasedButton();
    }

    @And("I validate the share button")
    public void iValidateTheShareButton() {
        _page.goToOrders();
        _page.ordersPurchasedButton();
        _page.ordersShare();
        
        _page.goToOrders();
        
    }

    @And("I validate the request refund button")
    public void iValidateTheRequestRefundButton() {
        _page.ordersPurchasedButton();
        _page.requestTabBtn();
        _page.ordersRequestRefund();
    }

    @Then("I validate the purchased shipped orders section")
    public void iValidateThePurchasedShippedOrdersSection() {
        
        Assert.assertEquals(false, _page.purchasedPickupSection());
    }

    @And("I validate the confirm pick up button")
    public void iValidateTheConfirmPickUpButton() {
        _page.ordersPurchasedButton();
        _page.ordersConfirmPickUp();
    }

    @And("I validate the leave a review button")
    public void iValidateTheLeaveAReviewButton() {
        //_page.ordersShowCompleted();
        _page.ordersPurchasedButton();
        _page.purchasedOpenSection();
        _page.ordersLeaveAReview();
    }

    @And("I validate the buy again button in completed status")
    public void iValidateTheBuyAgainButtonInCompletedStatus() {
        _page.ordersShowCompleted();
        _page.ordersPurchasedButton();
        _page.seeDetailsValidateText();
        _page.ordersBuyAgain();
        _page.goToOrders();
    }

    @And("I validate the share button in complete status")
    public void iValidateTheShareButtonInCompleteStatus() {
        _page.goToOrders();
        _page.ordersShowCompleted();
        _page.ordersPurchasedButton();
        _page.seeDetailsValidateText();
        _page.ordersShare();
        
    }

    @And("I validate the request refund button in complete status")
    public void iValidateTheRequestRefundButtonInCompleteStatus() {
        _page.goToOrders();
        _page.ordersPurchasedButton();
        _page.seeDetailsValidateText();
        //_page.ordersShowCompleted();
        //_page.ordersPurchasedTab2Button();
        //_page.ordersPurchasedTab2Button();
        _page.ordersRequestRefund();
        
    }

    @Then("I validate the purchased pickup orders section")
    public void iValidateThePurchasedPickupOrdersSection() {
        _page.ordersPurchasedButton();
        
        Assert.assertEquals(true, _page.purchasedPickupSection());
    }

    @And("I select the show menu button")
    public void iSelectTheShowMenuButton() {
        _page.ordersPurchasedButton();
        _page.ordersShowAll();
        //_page.ordersPendingResponse();
        _page.ordersShowShipmentPending();
        _page.ordersShowShipped();
        _page.ordersShowDelivered();
        _page.ordersShowCompleted();
        _page.ordersCancelled();
    }

    @Then("I validate the show menu")
    public void iValidateTheShowMenu() {
        Assert.assertEquals("Show", _page.showMenu());
    }
}