package pages.checkout;

import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.BasePage;

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
    @FindBy(xpath = "/html/body/div[4]/main/div/div/div/div[2]/form/div/div/div[2]/div[2]/table/tbody/tr[1]/th/div/label")
    public WebElement flatRateBtn;
    @FindBy(xpath = "/html/body/div[4]/main/div/div/div/div[3]/button")
    public WebElement goToSecureCheckoutBtn;
    @FindBy(xpath = "//button[contains(text(), 'Add to Cart')]")
    public WebElement addToCartBtn;
    @FindBy(xpath = "/html/body/header/nav/div/div[2]/ul/li[6]/a")
    public WebElement cartIconBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div > div > div > div:nth-child(1) > div > div > a > span")
    public WebElement clearCartBtn;
    @FindBy(how = How.CSS, using = "button.mt-2:nth-child(1)")
    public WebElement acceptClearCartBtn;
    @FindBy(xpath = "/html/body/div[4]/main/div/div/div/div[2]/form/div/div/div[2]/div[2]/div/div[1]/a")
    public WebElement addShippingAddressBtn;
    @FindBy(how = How.CSS, using = "#minus > svg")
    public WebElement minusIconBtn;
    @FindBy(how = How.CSS, using = "#more > svg")
    public WebElement plusIconBtn;
    @FindBy(xpath = "//p[contains(text(), 'Alabama ')]")
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
    @FindBy(xpath = "/html/body/div[4]/main/div/div/div/div[2]/div/div/div/div/form/div[1]/div/div[2]/div[1]/div/label[1]/span")
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
    @FindBy(xpath = "/html/body/div[4]/main/div[2]/div/div/div[2]/div[2]/div[2]/div/div[3]/div[3]/div/input")
    public WebElement cvvCodeTextField;
    @FindBy(how = How.CSS, using = "#left-column > div:nth-child(2) > div.card.card-shopping > div > div.d-flex.align-items-center.mt-2 > label.switch.mr-2 > span")
    public WebElement saveCreditCardBtn;
    @FindBy(xpath = "/html/body/div[4]/main/div[2]/div/div/div[3]/div[5]/button/span")
    public WebElement submitPaymentBtn;
    @FindBy(xpath = "/html/body/div[4]/main/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div/div/div/div[1]/input")
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

    @FindBy(how = How.CSS, using = "#whole-container > main > div > div > div > div.col-lg-4 > p")
    public WebElement summaryTextValidate;

    @FindBy(how = How.CSS, using = "#U3VjY2Vzc0FkZGVkJTIwdG8lMjBjYXJ0IWdyZWVu > div.iziToast-body > div.iziToast-texts > p")
    public WebElement addtoCartMessage;
    @FindBy(how = How.CSS, using = "#edit-address > div > div > div")
    public WebElement modalShippingAddress;

    @FindBy(xpath = "//p[contains(text(), 'Shipping Address')]")
    public WebElement shippingAddressText;

    @FindBy(xpath = "//span[contains(text(), 'CVV Code')]")
    public WebElement validateCVVText;


    public boolean validateCVVTextField() {
        fluentWaitStrict(getDriver(), validateCVVText);
        boolean result = validateCVVText.isDisplayed();
        return result;
    }

    public boolean shippingAddressTextValidate() {
        getDriver().navigate().refresh();
        fluentWait(getDriver(), shippingAddressText);
        boolean result = shippingAddressText.isDisplayed();
        return result;

    }

    public boolean addedToCartMessage() {
        try {
            fluentWaitStrict(getDriver(), addtoCartMessage);
            boolean result = addtoCartMessage.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(2);
            boolean result = addtoCartMessage.isDisplayed();
            return result;
        }

    }

    public boolean purchasedConfirm() {
        boolean result = ordersPurchasedBtn.isDisplayed();
        return result;
    }

    public boolean congratulationsMessageConfirm() {
        fluentWait(getDriver(), congratulationsMessage);
        boolean result = congratulationsMessage.isDisplayed();
        return result;
    }

    public String validateSecureCheckout() {
        fluentWait(getDriver(), validateSecureCheckoutText);
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
        fluentWait(getDriver(), goToSecureCheckoutBtn);
        boolean result = goToSecureCheckoutBtn.isDisplayed();
        return result;
    }

    public String summaryText() {
        fluentWaitStrict(getDriver(), summaryTextValidate);
        String result = summaryTextValidate.getText();
        return result;
    }

    public boolean addressErrorMessage() {
        boolean result = addressErrorText.isDisplayed();
        return result;
    }

    public boolean submitPaymentConfirm() {
        fluentWait(getDriver(), submitPaymentBtn);
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
       try {
           fluentWait(getDriver(), flatRateBtn);
           waitForWebElementAndClick(flatRateBtn);
       }
        catch (Exception e){
           wait(3);
            fluentWait(getDriver(), flatRateBtn);
            waitForWebElementAndClick(flatRateBtn);
        }
    }

    public void goToItemForShipping() {
        getDriver().navigate().to(url + "/Listing/Detail/619");
    }

    public void goToSecureCheckout() {
        fluentWaitStrict(getDriver(), goToSecureCheckoutBtn);
        waitForWebElementAndClick(goToSecureCheckoutBtn);
    }

    public void selectAddToCart() {
        fluentWait(getDriver(), addToCartBtn);
        waitForWebElementAndClick(addToCartBtn);

    }

    public void selectCartIcon() {
        getDriver().navigate().to(url + "/order/ShoppingCart");

        getDriver().navigate().to(url + "/order/ShoppingCart");

    }

    public void selectClearCart() {
        try {
            try {
                fluentWait(getDriver(), clearCartBtn);
                waitForWebElementAndClick(clearCartBtn);
                fluentWait(getDriver(), acceptClearCartBtn);
            } catch (Exception e) {
                wait(3);
                fluentWait(getDriver(), clearCartBtn);
                waitForWebElementAndClick(clearCartBtn);
            }
        } catch (Exception e){

        }
    }

    public void selectAcceptClearCart() {
        try {
            fluentWait(getDriver(), acceptClearCartBtn);
            waitForWebElementAndClick(acceptClearCartBtn);
        }
        catch (Exception e){

        }

    }

    public void selectAddShippingAddress() {
        try {
            fluentWait(getDriver(), addShippingAddressBtn);
            waitForWebElementAndClick(addShippingAddressBtn);
            //retryingFindClick(addShippingAddressBtn);
            fluentWait(getDriver(), modalShippingAddress);
        } catch (Exception e) {
            wait(4);
            fluentWait(getDriver(), addShippingAddressBtn);
            waitForWebElementAndClick(addShippingAddressBtn);
        }
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
        try {
            fluentWait(getDriver(), reUseAddressBtn);
            waitForWebElementAndClick(reUseAddressBtn);
            fluentWait(getDriver(), flatRateBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), reUseAddressBtn);
            waitForWebElementAndClick(reUseAddressBtn);
        }

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
        expirationDateTextField.sendKeys("05-28");
        expirationDateTextField.clear();
        expirationDateTextField.sendKeys("05-28");
    }

    public void selectCvvCodeTextField() {
        fluentWaitStrict(getDriver(), cvvCodeTextField);
        waitForWebElementAndClick(cvvCodeTextField);
        //cvvCodeTextField.sendKeys(Keys.ARROW_LEFT);
        waitForClickability(cvvCodeTextField);
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