package pages.checkout;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.FluentWait;
import pages.BasePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.random;

public class checkoutPage extends BasePage {


    public checkoutPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());

    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    @FindBy(how = How.CSS, using = "#listing-img-1")
    public WebElement listingItemBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div.d-flex.flex-wrap.align-items-center.justify-content-start > button.own-btn.own-btn-md.btn-primary.fz-16.font-weight-bold.mr-2.secondary-font.mb-3.btnBuyNow")
    public WebElement buyNowBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div/div/div/div[2]/form/div/div/div[2]/div[2]/table/tbody/tr[1]/th/div/label")
    public WebElement flatRateBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div/div/div/div[3]/button")
    public WebElement goToSecureCheckoutBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div.d-flex.flex-wrap.align-items-center.justify-content-start > button.own-btn.own-btn-md.btn-outline-primary.fz-16.font-weight-bold.mr-2.secondary-font.mb-3.btnAddToCart")
    public WebElement addToCartBtn;
    @FindBy(xpath = "/html/body/header/nav/div/div[2]/ul/li[6]/a")
    public WebElement cartIconBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div > div > div > div:nth-child(1) > div > div > a > span")
    public WebElement clearCartBtn;
    @FindBy(how = How.CSS, using = "button.mt-2:nth-child(1)")
    public WebElement acceptClearCartBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div/div/div/div[2]/form/div[1]/div/div[2]/div[2]/div/div[1]/a")
    public WebElement addShippingAddressBtn;
    @FindBy(how = How.CSS, using = "#minus > svg")
    public WebElement minusIconBtn;
    @FindBy(how = How.CSS, using = "#more > svg")
    public WebElement plusIconBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div")
    public WebElement reUseAddressBtn;
    @FindBy(how = How.CSS, using = "#location-shoppingcart")
    public WebElement address1TextField;
    @FindBy(how = How.CSS, using = "#address-line-2")
    public WebElement address2TextField;
    @FindBy(how = How.CSS, using = "#locality-location-shoppingcart")
    public WebElement cityTextField;
    @FindBy(how = How.CSS, using = "#StateNameLong-location-shoppingcart")
    public WebElement stateTextField;
    @FindBy(how = How.CSS, using = "#ZipCode-location-shoppingcart")
    public WebElement zipCodeTextField;
    @FindBy(how = How.CSS, using = "#PhoneNumber-location-shoppingcart")
    public WebElement phoneNumberTextField;
    @FindBy(xpath = "/html/body/div[3]/main/div/div/div/div[2]/div/div/div/div/form/div[1]/div/div[2]/div[1]/div/label[1]/span")
    public WebElement saveAddressCheckBox;
    @FindBy(how = How.CSS, using = "#name")
    public WebElement nameTextField;
    @FindBy(how = How.CSS, using = "#addAddress")
    public WebElement acceptBtn;
    @FindBy(how = How.CSS, using = "#back-cont > a > span")
    public WebElement backToCartBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[2]/div[1]/div/div/div/textarea")
    public WebElement sendMessageToSellerTextField;
    @FindBy(how = How.CSS, using = "#card-number")
    public WebElement cardNumberTextField;
    @FindBy(how = How.CSS, using = "#card-name")
    public WebElement nameOnCardTextField;
    @FindBy(how = How.CSS, using = "#expiry-date")
    public WebElement expirationDateTextField;
    @FindBy(how = How.CSS, using = "#card-cvc")
    public WebElement cvvCodeTextField;
    @FindBy(how = How.CSS, using = "#left-column > div:nth-child(2) > div.card.card-shopping > div > div.d-flex.align-items-center.mt-2 > label.switch.mr-2 > span")
    public WebElement saveCreditCardBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[3]/div[5]/button")
    public WebElement submitPaymentBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div/div/div/div[1]/input")
    public WebElement preLoadedCreditCardBtn;
    @FindBy(how = How.CSS, using = "#container-items > div.d-flex.flex-wrap.justify-content-between > div:nth-child(2) > a.mr-3.text-decoration-none.d-inline-block > img")
    public WebElement shareFacebookBtn;
    @FindBy(how = How.CSS, using = "#container-items > div.d-flex.flex-wrap.justify-content-between > div:nth-child(2) > a.mr-2.text-decoration-none.d-inline-block > img")
    public WebElement shareTwitterBtn;
    @FindBy(how = How.CSS, using = "#container-items > div.d-flex.flex-wrap.justify-content-between > div:nth-child(2) > a:nth-child(3) > img")
    public WebElement shareWhatsappBtn;
    @FindBy(how = How.CSS, using = "body > div > div.d-flex.justify-content-between.align-items-center.mt-3 > span > a")
    public WebElement yourOrdersBtn;
    @FindBy(how = How.CSS, using = "body > div > div.d-flex.justify-content-between.align-items-center.mt-3 > a")
    public WebElement backToBrowseBtn;
    @FindBy(how = How.CSS, using = "#purchased-tab > span > span:nth-child(1)")
    public WebElement ordersPurchasedBtn;
    @FindBy(how = How.CSS, using = "#container-items > div.text-center.my-4 > h5")
    public WebElement validateSecureCheckoutText;
    @FindBy(xpath = "/html/body/div[4]/main/div/div/div/div[2]/div/div/div/h3")
    public WebElement cartEmptyMessage;
    @FindBy(how = How.CSS, using = "#RXJyb3JZb3UlMjBoYXZlJTIwYSUyMGR1cGxpY2F0ZSUyMGFkZHJlc3NyZWQ > div.iziToast-body > div.iziToast-texts > p")
    public WebElement addressErrorText;
    @FindBy(how = How.CSS, using = "#whole-container > main > div > div > div > div:nth-child(1) > div > p")
    public WebElement myOrdersText;
    @FindBy(how = How.CSS, using = "#RXJyb3JUaGVyZSUyMHdhcyUyMGFuJTIwZXJyb3IuJTIwUGxlYXNlJTIwdHJ5JTIwYWdhaW4lMjBsYXRlciUyQyUyMGlmJTIwdGhlJTIwZXJyb3IlMjBwZXJzaXN0JTIwY29udGFjdCUyMGFuJTIwYWRtaW5pc3RyYXRvci5yZWQ > div.iziToast-body")
    public WebElement submitPaymentError;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/img")
    public WebElement congratulationsMessage;
    @FindBy(how = How.CSS, using = "#U3VjY2Vzc0FkZGVkJTIwdG8lMjBjYXJ0IWdyZWVu > button")
    public WebElement closeAddedToCart;


    public boolean purchasedConfirm() {
        boolean result = ordersPurchasedBtn.isDisplayed();
        return result;
    }

    public boolean congratulationsMessageConfirm() {
        boolean result = congratulationsMessage.isDisplayed();
        return result;
    }

    public String validateSecureCheckout() {
        String result = validateSecureCheckoutText.getText();
        return result;
    }

    public String myOrdersConfirm() {
        String result = myOrdersText.getText();
        return result;
    }

    public String cartEmptyMessageText() {
        fluentWaitStrict(getDriver(), cartEmptyMessage);
        String result = cartEmptyMessage.getText();
        return result;
    }

    public boolean cartCheckoutConfirm() {
        boolean result = goToSecureCheckoutBtn.isDisplayed();
        return result;
    }

    public boolean addressErrorMessage() {
        boolean result = addressErrorText.isDisplayed();
        return result;
    }

    public boolean submitPaymentConfirm() {
        boolean result = submitPaymentBtn.isDisplayed();
        return result;
    }


    public void setHomePage() {
        getDriver().navigate().to(url);
    }

    public void goToLoginPage() {
        getDriver().navigate().to(url + "/Account/Login");
        getDriver().navigate().to(url + "/Account/Login");
    }


    public void goToOrders() {
        getDriver().navigate().to(url + "/order/MyOrders?");
    }

    public void goToItem() {
        getDriver().navigate().to(url + "/Listing/Detail/619");
    }

    public void selectFlatRate() {
        fluentWait(getDriver(), flatRateBtn);
        waitForWebElementAndClick(flatRateBtn);
    }

    public void goToItemForShipping() {
        getDriver().navigate().to(url + "/Listing/Detail/619");
    }

    public void goToSecureCheckout() {
        waitForVisibility(goToSecureCheckoutBtn);
        waitForClickability(goToSecureCheckoutBtn);
        fluentWait(getDriver(), goToSecureCheckoutBtn);
        waitForWebElementAndClick(goToSecureCheckoutBtn);
    }

    public void selectAddToCart() {
        waitForVisibility(addToCartBtn);
        waitForClickability(addToCartBtn);
        fluentWait(getDriver(), addToCartBtn);
        waitForWebElementAndClick(addToCartBtn);
        fluentWait(getDriver(), plusIconBtn);
        waitForWebElementAndClick(plusIconBtn);
        fluentWait(getDriver(), minusIconBtn);

    }

    public void selectCartIcon() {
        getDriver().navigate().to(url + "/order/ShoppingCart");

        getDriver().navigate().to(url + "/order/ShoppingCart");

    }

    public void selectClearCart() {
        fluentWait(getDriver(), clearCartBtn);
        waitForWebElementAndClick(clearCartBtn);
    }

    public void selectAcceptClearCart() {
        fluentWait(getDriver(), acceptClearCartBtn);
        waitForWebElementAndClick(acceptClearCartBtn);
    }

    public void selectAddShippingAddress() {
        getDriver().get(url + "/order/ShoppingCart");
        getDriver().get(url + "/order/ShoppingCart");
        waitForVisibility(addShippingAddressBtn);
        waitForClickability(addShippingAddressBtn);
        fluentWait(getDriver(), addShippingAddressBtn);
        waitForWebElementAndClick(addShippingAddressBtn);
    }

    public void selectMinusButton() {
        fluentWait(getDriver(), minusIconBtn);
        waitForWebElementAndClick(minusIconBtn);
    }

    public void selectPlusButton() {
        fluentWait(getDriver(), plusIconBtn);
        waitForWebElementAndClick(plusIconBtn);
    }

    public void selectPreviousAddress() {
        waitForVisibility(reUseAddressBtn);
        waitForClickability(reUseAddressBtn);
        actions.moveToElement(reUseAddressBtn).build().perform();
        fluentWait(getDriver(), reUseAddressBtn);
        waitForWebElementAndClick(reUseAddressBtn);
    }

    public void selectAddressField1() {
        fluentWait(getDriver(), address1TextField);
        waitForWebElementAndClick(address1TextField);
        address1TextField.sendKeys("723 Felspar Street");
    }

    public void selectCityTextField() {
        fluentWait(getDriver(), cityTextField);
        waitForWebElementAndClick(cityTextField);
        cityTextField.sendKeys("San Diego");
    }

    public void selectStateTextField() {
        fluentWait(getDriver(), stateTextField);
        waitForWebElementAndClick(stateTextField);
        stateTextField.sendKeys("California");
    }

    public void selectZipCodeTextField() {
        fluentWait(getDriver(), zipCodeTextField);
        waitForWebElementAndClick(zipCodeTextField);
        zipCodeTextField.sendKeys("92109");
    }

    public void selectPhoneNumberTextField() {
        fluentWait(getDriver(), phoneNumberTextField);
        waitForWebElementAndClick(phoneNumberTextField);
        phoneNumberTextField.sendKeys("111");
    }

    public void selectSaveAddressCheckBox() {
        fluentWait(getDriver(), saveAddressCheckBox);
        waitForWebElementAndClick(saveAddressCheckBox);
    }

    public void selectNameTextField() {
        fluentWait(getDriver(), nameTextField);
        waitForWebElementAndClick(nameTextField);
        nameTextField.sendKeys("Test Automation");
    }

    public void selectAddAddress() {
        fluentWait(getDriver(), acceptBtn);
        waitForWebElementAndClick(acceptBtn);
    }

    public void selectBackToCart() {
        fluentWait(getDriver(), backToCartBtn);
        waitForWebElementAndClick(backToCartBtn);
    }

    public void selectSendMessageToSellerTextField() {
        fluentWait(getDriver(), sendMessageToSellerTextField);
        waitForWebElementAndClick(sendMessageToSellerTextField);
        sendMessageToSellerTextField.sendKeys("Test Automation");
    }

    public void selectCardNumberTextField() {
        fluentWait(getDriver(), cardNumberTextField);
        waitForWebElementAndClick(cardNumberTextField);
        cardNumberTextField.sendKeys("424242424242");
    }

    public void selectNameOnCardTextField() {
        fluentWait(getDriver(), nameOnCardTextField);
        waitForWebElementAndClick(nameOnCardTextField);
        nameOnCardTextField.sendKeys("Michael Test");
    }

    public void selectExpirationDateTextField() {
        fluentWait(getDriver(), expirationDateTextField);
        waitForWebElementAndClick(expirationDateTextField);
        expirationDateTextField.sendKeys("0528");
    }

    public void selectCvvCodeTextField() {
        fluentWait(getDriver(), cvvCodeTextField);
        waitForWebElementAndClick(cvvCodeTextField);
        cvvCodeTextField.sendKeys(Keys.ARROW_LEFT);
        cvvCodeTextField.sendKeys("333");
    }

    public void selectSaveCreditCard() {
        fluentWait(getDriver(), saveCreditCardBtn);
        waitForWebElementAndClick(saveCreditCardBtn);
    }

    public void selectSubmitPayment() {
        fluentWait(getDriver(), submitPaymentBtn);
        waitForWebElementAndClick(submitPaymentBtn);
    }

    public void selectPreLoadedCardButton() {
        waitForVisibility(preLoadedCreditCardBtn);
        waitForClickability(preLoadedCreditCardBtn);
        fluentWait(getDriver(), preLoadedCreditCardBtn);
        waitForWebElementAndClick(preLoadedCreditCardBtn);
        actions.moveToElement(preLoadedCreditCardBtn).build().perform();
    }

    public void selectShareFacebookButton() {
        fluentWait(getDriver(), shareFacebookBtn);
        waitForWebElementAndClick(shareFacebookBtn);
    }

    public void selectShareTwitterButton() {
        fluentWait(getDriver(), shareTwitterBtn);
        waitForWebElementAndClick(shareTwitterBtn);
    }

    public void selectShareWhatsappButton() {
        fluentWait(getDriver(), shareWhatsappBtn);
        waitForWebElementAndClick(shareWhatsappBtn);
    }

    public void selectYourOrders() {
        fluentWait(getDriver(), yourOrdersBtn);
        waitForWebElementAndClick(yourOrdersBtn);
    }
    public void selectBackToBrowse() {
        fluentWait(getDriver(), backToBrowseBtn);
        waitForWebElementAndClick(backToBrowseBtn);
    }

    public void ordersPurchasedButton() {
        fluentWait(getDriver(), ordersPurchasedBtn);
        waitForWebElementAndClick(ordersPurchasedBtn);

    }

}