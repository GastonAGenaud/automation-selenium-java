package steps.checkout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.checkout.checkoutPage;

public class checkoutSteps extends BasePage {

    private checkoutPage _page;

    public checkoutSteps() {

        this._page = new checkoutPage();
    }

    @And("I go to the Shopping Cart")
    public void iGoToTheShoppingCart() {
        _page.selectCartIcon();
    }

    @When("I add an item to the Shopping Cart")
    public void iAddAnItemToTheShoppingCart() {
        System.out.println("goToItem");
        //_page.goToItem();
       // _page.goToItem();
        _page.goToItem();

        System.out.println("selectAddToCart");
        _page.selectAddToCart();


        //_page.setCloseAddedToCart();
        //
        //_page.setCloseAddedToCart();
        System.out.println("selectCartIcon");
        _page.selectCartIcon();
    }

    @When("I add an item to the Shopping Cart for shipping")
    public void iAddAnItemToTheShoppingCartForShipping() {
        _page.goToItemForShipping();
        _page.selectAddToCart();
        _page.addedToCartMessage();
        _page.selectCartIcon();
    }

    @And("I validate the clear cart button")
    public void iValidateTheClearCartButton() {
        _page.selectClearCart();
        _page.selectAcceptClearCart();
    }

    @Then("I see the shopping cart cleaned")
    public void iSeeTheShoppingCartCleaned() {
        Assert.assertEquals("Your Cart is empty", _page.cartEmptyMessageText());
    }

    @And("I increase the quantity of the item")
    public void iIncreaseTheQuantityOfTheItem() {
        _page.selectPlusButton();
    }

    @And("I subtract the quantity of the item")
    public void iSubtractTheQuantityOfTheItem() {
        _page.selectMinusButton();
    }

    @Then("I Validate quantity functioning")
    public void iValidateQuantityFunctioning() {
        Assert.assertEquals("Summary", _page.summaryText());
    }


    @And("I select the add a Shipping Address button")
    public void iSelectTheAddAShippingAddressButton() {
        //System.out.println("AntesShipping");
        _page.shippingAddressTextValidate();
        _page.selectAddShippingAddress();
        //System.out.println("DespuesShipping");
    }

    @And("I complete Address line 1")
    public void iCompleteAddressLine() {

        _page.selectAddressField1();
    }

    @And("I complete City text field")
    public void iCompleteCityTextField() {
        _page.selectCityTextField();
    }

    @And("I complete the State text field")
    public void iCompleteTheStateTextField() {
        _page.selectStateTextField();
    }

    @And("I complete the Zip text field")
    public void iCompleteTheZipTextField() {
        _page.selectZipCodeTextField();
    }

    @And("I complete the Phone Number text field")
    public void iCompleteThePhoneNumberTextField() {
        _page.selectPhoneNumberTextField();
    }

    @And("I select the Save address button")
    public void iSelectTheSaveAddressButton() {
        _page.selectSaveAddressCheckBox();
    }

    @And("I complete the Name text field")
    public void iCompleteTheNameTextField() {
        _page.selectNameTextField();
    }

    @And("I select the Accept button")
    public void iSelectTheAcceptButton() {
        _page.selectAddAddress();
    }

    @Then("I see the shipping address added and saved")
    public void iSeeTheShippingAddressAddedAndSaved() {
       // fluentWait(getDriver(), _page.addressErrorText);
        Assert.assertEquals(true, _page.addressErrorMessage());
    }

    @And("I add an Address")
    public void iAddAnAddress() {
        _page.shippingAddressTextValidate();
        _page.selectAddShippingAddress();
        _page.selectPreviousAddress();
       // _page.selectFlatRate();

    }

    @And("I select the Flat Rate option")
    public void iSelectTheFlatRateOption() {
        System.out.println("FlatAntes");
        _page.selectFlatRate();
        System.out.println("FlatDespues");
    }

    @Then("I validate the Flat Rate button")
    public void iValidateTheFlatRateButton() {
        Assert.assertEquals("My Orders", _page.myOrdersConfirm());
    }

    @And("I select the Go To Secure Checkout button")
    public void iSelectTheGoToSecureCheckoutButton() {
        _page.goToSecureCheckout();
    }

    @Then("I validate the Go To Secure Checkout button")
    public void iValidateTheGoToSecureCheckoutButton() {
        iSelectTheSubmitPaymentButton();
        Assert.assertEquals( "Now share it with the world",_page.validateSecureCheckout());
    }

    @And("I select the Back to my cart button")
    public void iSelectTheBackToMyCartButton() {
        _page.selectBackToCart();
    }

    @Then("I validate the Back to my cart button")
    public void iValidateTheBackToMyCartButton() {
        Assert.assertEquals(true, _page.cartCheckoutConfirm());
    }

    @And("I type on the Send message to Seller text field")
    public void iTypeOnTheSendMessageToSellerTextField() {

        _page.selectSendMessageToSellerTextField();
    }

    @Then("I validate the Send message to Seller")
    public void iValidateTheSendMessageToSeller() {
        Assert.assertEquals(true, _page.submitPaymentConfirm());
    }

    @And("I complete the Card Number text field")
    public void iCompleteTheCardNumberTextField() {
        _page.selectCardNumberTextField();
    }

    @And("I complete the Name on Card text field")
    public void iCompleteTheNameOnCardTextField() {
        _page.selectNameOnCardTextField();
    }

    @And("I complete the Expiration Date text field")
    public void iCompleteTheExpirationDateTextField() {
        _page.selectExpirationDateTextField();
    }

    @And("i complete the CVV Code text field")
    public void iCompleteTheCVVCodeTextField() {
        _page.validateCVVTextField();
        _page.selectCvvCodeTextField();
    }

    @And("I select the Save Credit Card details button")
    public void iSelectTheSaveCreditCardDetailsButton() {
        _page.selectSaveCreditCard();
    }

    @Then("I validate the Add new Credit Card section")
    public void iValidateTheAddNewCreditCardSection() {
        Assert.assertEquals(true, _page.submitPaymentConfirm());
    }

    @And("I select the preloaded Credit Card button")
    public void iSelectThePreloadedCreditCardButton() {
        _page.selectPreLoadedCardButton();
    }

    @And("I select the Submit Payment button")
    public void iSelectTheSubmitPaymentButton() {
        _page.selectSubmitPayment();
    }

    @Then("I validate the Submit Payment")
    public void iValidateTheSubmitPayment() {
        Assert.assertEquals(true, _page.congratulationsMessageConfirm());
    }

    @Then("I validate the preloaded Credit Card")
    public void iValidateThePreloadedCreditCard() {
        Assert.assertEquals(true, _page.submitPaymentConfirm());
    }

    @Then("I see the Congratulations Screen")
    public void iSeeTheCongratulationsScreen() {
        Assert.assertEquals(true, _page.congratulationsMessageConfirm());
    }

    @And("I select Facebook icon")
    public void iSelectFacebookIcon() {
        _page.selectShareFacebookButton();
    }

    @And("I select Twitter icon")
    public void iSelectTwitterIcon() {
        _page.selectShareTwitterButton();
    }

    @And("I select the Whatsapp icon")
    public void iSelectTheWhatsappIcon() {
        _page.selectShareWhatsappButton();
    }

    @Then("I validate sharing on Whatsapp, Facebook or Twitter")
    public void iValidateSharingOnWhatsappFacebookOrTwitter() {
        Assert.assertEquals(true, _page.congratulationsMessageConfirm());
    }

    @And("I select Your Orders button")
    public void iSelectYourOrdersButton() {
        _page.selectYourOrders();
    }

    @And("I select Purchased button")
    public void iSelectPurchasedButton() {
        _page.goToOrders();
        _page.ordersPurchasedButton();
    }

    @Then("I validate Purchased")
    public void iValidatePurchased() {
        Assert.assertEquals(true, _page.purchasedConfirm());
    }

    @And("I select the Back to Browse button")
    public void iSelectTheBackToBrowseButton() {
        _page.selectBackToBrowse();
    }

    @Then("I validate Back to Browse")
    public void iValidateBackToBrowse() {
        //Assert.assertEquals(true, _page.cartErrorMessage());
    }

    @When("I clear the cart1")
    public void iClearTheCart1() {
        _page.selectCartIcon();
    }

    @And("I clear the cart2")
    public void iClearTheCart2() {
        _page.selectClearCart();
    }

    @And("I clear the cart3")
    public void iClearTheCart3() {
        _page.selectAcceptClearCart();
        getDriver().navigate().to(url + "/Listing/Detail/619");
    }

    @When("I clear the cart")
    public void iClearTheCart() {
        _page.selectCartIcon();
        _page.selectClearCart();
        _page.selectAcceptClearCart();
    }
}