package pages.listing;

import org.json.XML;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class listingdetailsPage extends BasePage {


    public listingdetailsPage() {
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
    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div.d-flex.mb-4 > div > a")
    public WebElement sellerNameBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div.d-flex.mb-4 > div > div > a")
    public WebElement sendMessageBtn;
    @FindBy(how = How.CSS, using = "#message-text")
    public WebElement messageTextField;
    @FindBy(xpath = "/html/body/div[4]/main/div[7]/div/div/div/div[3]/div/button")
    public WebElement sendBtn;
    @FindBy(xpath = "/html/body/div[4]/main/div[6]/div/div/div/div[3]/div[3]/div/button")
    public WebElement sendBtnMakeAndOffer;
    @FindBy(how = How.CSS, using = "#colors-father > span:nth-child(1) > label > span")
    public WebElement redBtn;
    @FindBy(how = How.CSS, using = "#colors-father > span:nth-child(2) > label > span")
    public WebElement blackBtn;
    @FindBy(how = How.CSS, using = "#colors-father > span:nth-child(4) > label > span")
    public WebElement yellowBtn;
    @FindBy(how = How.CSS, using = "#quantity")
    public WebElement quantityTextField;
    @FindBy(xpath = "/html/body/div[4]/main/div[1]/div/div/div[2]/div[4]/button[1]")
    public WebElement buyNowBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div.d-flex.flex-wrap.align-items-center.justify-content-start > button.own-btn.own-btn-md.btn-outline-primary.fz-16.font-weight-bold.mr-2.secondary-font.mb-3.btnAddToCart")
    public WebElement addToCartBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div.d-flex.flex-wrap.align-items-center.justify-content-start > a")
    public WebElement makeAnOfferBtn;
    @FindBy(how = How.CSS, using = "#offer-message")
    public WebElement offerTextField;
    @FindBy(how = How.CSS, using = "#offer-img-1")
    public WebElement addImageBtn;
    @FindBy(how = How.CSS, using = "#offer-submit")
    public WebElement proposedPriceTextField;
    @FindBy(xpath = "/html/body/div[4]/main/div[6]/div/div/div/div[3]/div[2]/div/div/div/input")
    public WebElement deliveryDate;
    @FindBy(how = How.CSS, using = "#info-tab")
    public WebElement productInformationBtn;
    @FindBy(how = How.CSS, using = "#shipping-tab > span > span.fz-20")
    public WebElement shippingBtn;
    @FindBy(how = How.CSS, using = "#reviews-tab > span > span.fz-20")
    public WebElement reviewsBtn;
    @FindBy(how = How.CSS, using = "#refunds-tab > span > span.fz-20")
    public WebElement returnsAndRefundsBtn;
    @FindBy(how = How.CSS, using = "#related-listing-holder > div:nth-child(4) > a > div > img")
    public WebElement relatedItemBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div:nth-child(6) > div > div.d-flex.justify-content-between.mb-3 > a > span")
    public WebElement seeAllRelatedBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div:nth-child(7) > div > a:nth-child(2) > span")
    public WebElement jewelryBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div:nth-child(7) > div > a:nth-child(3) > span")
    public WebElement shoesBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div:nth-child(7) > div > a:nth-child(4) > span")
    public WebElement accessoriesBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div:nth-child(7) > div > a:nth-child(5) > span")
    public WebElement homeAndLivingBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div:nth-child(7) > div > a:nth-child(6) > span")
    public WebElement clothingBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div[5]/div/div[2]/div/a/div/img")
    public WebElement wristBandCoolBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div[5]/div/div[2]/div/a/div/img")
    public WebElement testPickupBtn;
    @FindBy(xpath = "/html/body/div[4]/main/div[1]/div/div/div[2]/div[1]/div/a")
    public WebElement moreFromThisSellerSeeAllBtn;
    @FindBy(how = How.CSS, using = "#profile-img-storefront")
    public WebElement profileImage;
    @FindBy(how = How.CSS, using = "#rowchat-container > section.d-none.d-lg-block.col-lg-3 > div")
    public WebElement sellerMessage;
    @FindBy(how = How.CSS, using = "#refunds-tab")
    public WebElement itemImage;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div:nth-child(2) > div.mb-3 > a")
    public WebElement shoesText;
    @FindBy(how = How.CSS, using = "#shopping-cart-mobile > a")
    public WebElement shoppingCartButton;
    @FindBy(how = How.CSS, using = "#searchButton")
    public WebElement browseSearchBtn;

    @FindBy(how = How.CSS, using = "#imSellerSelector > div > label > div > div > p")
    public WebElement imSellerBtn;

    @FindBy(how = How.CSS, using = "#seller-buyer-button")
    public WebElement nextBtn;

    @FindBy(how = How.CSS, using = "#\\35 4")
    public WebElement howOld;

    @FindBy(how = How.CSS, using = "#\\35 5")
    public WebElement howMuch;

    @FindBy(how = How.CSS, using = "#\\35 6")
    public WebElement agreeTerms;

    @FindBy(how = How.CSS, using = "#\\35 7")
    public WebElement whereAreYou;

    @FindBy(how = How.CSS, using = "#submit-button")
    public WebElement submitBtn;

    @FindBy(xpath = "/html/body/div[4]/main/div[7]/div/div/div/div[2]/p")
    public WebElement validateMessageText;

    @FindBy(xpath = "//h2[contains(text(), 'You haven’t created any listings yet')]")
    public WebElement validateFirstText;

    @FindBy(xpath = "//p[contains(text(), 'Message')]")
    public WebElement validateTextFromSendMessage;

    public boolean validateMessageText(){
        fluentWait(getDriver(), validateTextFromSendMessage);
        boolean result = validateTextFromSendMessage.isDisplayed();
        return result;
    }


    public boolean validateTextFirst(){
        fluentWait(getDriver(), validateFirstText);
        boolean result = validateFirstText.isDisplayed();
        return result;
    }



    public void submitButton() {
        fluentWait(getDriver(), submitBtn);
        waitForWebElementAndClick(submitBtn);
    }

    public void whereAreYouFrom() {
        fluentWait(getDriver(), whereAreYou);
        waitForWebElementAndClick(whereAreYou);
        whereAreYou.sendKeys("test");
    }

    public void termsAndConditions() {
        fluentWait(getDriver(), agreeTerms);
        waitForWebElementAndClick(agreeTerms);
        agreeTerms.sendKeys("Yes");
    }

    public void howMuchSell() {
        fluentWait(getDriver(), howMuch);
        waitForWebElementAndClick(howMuch);
        howMuch.sendKeys("test");
    }

    public void howOldAreYou() {
        fluentWait(getDriver(), howOld);
        waitForWebElementAndClick(howOld);
        howOld.sendKeys("18");
    }

    public void nextButton() {
        try {
            fluentWait(getDriver(), nextBtn);
            waitForWebElementAndClick(nextBtn);

        } catch (Exception e) {
            wait(4);
            fluentWait(getDriver(), nextBtn);
            waitForWebElementAndClick(nextBtn);
        }

    }

    public void imSellerButton() {
        fluentWait(getDriver(), imSellerBtn);
        waitForWebElementAndClick(imSellerBtn);
    }


    public void setHomePage() {
        getDriver().navigate().to(url);
    }


    public void goToLoginPage() {
        getDriver().navigate().to(url + "/Account/Login");
    }


    public void goToListingPage() {
        getDriver().navigate().to(url + "/Listing/Browse");
    }

    public void goToShoppingCart() {
        getDriver().navigate().to(url + "/Order/ShoppingCart");
    }

    public void goToItem() {
        getDriver().navigate().to(url + "/Listing/Detail/676");
    }


    public void goToListingItem() {
        getDriver().navigate().to(url + "/Listing/Detail/619");
    }

    public void goToSpecificItem() {
        getDriver().navigate().to(url + "/Listing/Detail/619");
    }


    public boolean messageTexActivate() {
        boolean result = validateMessageText.isDisplayed();
        return result;
    }

    public boolean sellerConfirm() {
        fluentWait(getDriver(), profileImage);
        boolean result = profileImage.isDisplayed();
        return result;
    }

    public boolean sellerMessageConfirm() {
        try {
            fluentWaitStrict(getDriver(), sellerMessage);
            boolean result = sellerMessage.isDisplayed();
            return result;
        }
        catch (Exception e){
            wait(3);
            fluentWaitStrict(getDriver(), sellerMessage);
            boolean result = sellerMessage.isDisplayed();
            return result;
        }
    }

    public boolean itemImageConfirm() {
        boolean result = itemImage.isDisplayed();
        return result;
    }

    public String shoesTextConfirm() {
        String result = shoesText.getText();
        try {
            result = shoesText.getText();
        } catch (Exception e) {
            wait(6);
            fluentWaitStrict(getDriver(), shoesText);
            result = shoesText.getText();
        } finally {
            return result;
        }
    }

    public boolean shoppingCartConfirm() {
        fluentWait(getDriver(), shoppingCartButton);
        boolean result = shoppingCartButton.isDisplayed();
        return result;
    }

    public boolean browseConfirm() {
        boolean result = browseSearchBtn.isDisplayed();
        return result;
    }

    public void iSelectSellerName() {
        fluentWait(getDriver(), sellerNameBtn);
        waitForWebElementAndClick(sellerNameBtn);
    }

    public void iSelectSendMessage() {
        fluentWait(getDriver(), sendMessageBtn);
        waitForWebElementAndClick(sendMessageBtn);
        fluentWait(getDriver(), messageTextField);
        waitForWebElementAndClick(messageTextField);
        messageTextField.sendKeys("Automation message");
        messageTextField.clear();
        messageTextField.sendKeys("Automation message");
        //fluentWait(getDriver(), sendBtn);
        //messageTexActivate();
        try {
            actions.moveToElement(sendBtn).doubleClick().build().perform();
        } catch (Exception e) {
            while (!sendBtn.isDisplayed()) {
                wait(5);
                validateMessageText();
                actions.moveToElement(sendBtn).doubleClick().build().perform();
                //fluentWaitElementDisappears(getDriver(), sendBtn);
                retryingFindClick(sendBtn);
                retryingFindClick(sendBtn);
                retryingFindClick(sendBtn);
                retryingFindClick(sendBtn);
            }
        }
//        waitForWebElementAndClick(sendBtn);
    }

    public void iSelectVariant() {
        fluentWait(getDriver(), redBtn);
        waitForWebElementAndClick(redBtn);
        fluentWait(getDriver(), blackBtn);
        waitForWebElementAndClick(blackBtn);
        fluentWait(getDriver(), yellowBtn);
        waitForWebElementAndClick(yellowBtn);
    }

    public void iSelectQuantity() {
        fluentWait(getDriver(), quantityTextField);
        waitForWebElementAndClick(quantityTextField);
        quantityTextField.clear();
        waitForWebElementAndClick(quantityTextField);
        quantityTextField.sendKeys("2");
    }

    public void iSelectBuyNow() {
        fluentWaitStrict(getDriver(), buyNowBtn);
        waitForWebElementAndClick(buyNowBtn);
    }

    public void iSelectAddToCart() {
        fluentWait(getDriver(), addToCartBtn);
        waitForWebElementAndClick(addToCartBtn);
    }

    public void iGoToMakingOfferPage() {
        getDriver().navigate().to(url + "/Listing/Detail/619");

    }

    public void iSelectMakeAnOffer() {
        fluentWait(getDriver(), makeAnOfferBtn);
        waitForWebElementAndClick(makeAnOfferBtn);
    }


    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/listing.jpeg";

    public void iTypeAnOffer() {
        fluentWait(getDriver(), offerTextField);
        waitForWebElementAndClick(offerTextField);
        offerTextField.sendKeys("test automation");
        addImageBtn.sendKeys(EV_RESULT_FILE_PATH);
        fluentWait(getDriver(), proposedPriceTextField);
        waitForWebElementAndClick(proposedPriceTextField);
        proposedPriceTextField.sendKeys("10");
        fluentWait(getDriver(), deliveryDate);
        waitForWebElementAndClick(deliveryDate);
        deliveryDate.sendKeys("10-10-2023");

        try {
            actions.moveToElement(sendBtnMakeAndOffer);
            fluentWaitStrict(getDriver(), sendBtnMakeAndOffer);
            waitForWebElementAndClick(sendBtnMakeAndOffer);
            waitForWebElementAndClick(sendBtnMakeAndOffer);
            waitForWebElementAndClick(sendBtnMakeAndOffer);
            retryingFindClick(sendBtnMakeAndOffer);
//            fluentWait(getDriver(), chatVerify);
        }catch(Exception e){
            wait(3);
            fluentWaitStrict(getDriver(), sendBtnMakeAndOffer);
            waitForWebElementAndClick(sendBtnMakeAndOffer);
//            retryingFindClick(sendBtnMakeAndOffer);
        }

    }


    public void iSelectTheProductInformation() {
        waitForVisibility(productInformationBtn);
        waitForClickability(productInformationBtn);
        fluentWait(getDriver(), productInformationBtn);
        waitForWebElementAndClick(productInformationBtn);

        fluentWait(getDriver(), shippingBtn);
        waitForWebElementAndClick(shippingBtn);

        fluentWait(getDriver(), reviewsBtn);
        waitForWebElementAndClick(reviewsBtn);

        fluentWait(getDriver(), returnsAndRefundsBtn);
        waitForWebElementAndClick(returnsAndRefundsBtn);

    }

    public void iSelectRelatedItems() {
        fluentWait(getDriver(), relatedItemBtn);
        waitForWebElementAndClick(relatedItemBtn);
    }

    public void iSelectSeeAll() {
        fluentWait(getDriver(), seeAllRelatedBtn);
        waitForWebElementAndClick(seeAllRelatedBtn);
    }

    public void iSelectRelatedTags() {
        fluentWait(getDriver(), jewelryBtn);
        waitForWebElementAndClick(jewelryBtn);

        getDriver().navigate().to(url + "/Listing/Detail/619");
        fluentWait(getDriver(), shoesBtn);
        waitForWebElementAndClick(shoesBtn);

        getDriver().navigate().to(url + "/Listing/Detail/619");
        fluentWait(getDriver(), accessoriesBtn);
        waitForWebElementAndClick(accessoriesBtn);

        getDriver().navigate().to(url + "/Listing/Detail/619");
        fluentWait(getDriver(), homeAndLivingBtn);
        waitForWebElementAndClick(homeAndLivingBtn);


        getDriver().navigate().to(url + "/Listing/Detail/619");
        fluentWait(getDriver(), clothingBtn);
        waitForWebElementAndClick(clothingBtn);

    }

    public void iSelectMoreItemFromSeller() {
        fluentWait(getDriver(), wristBandCoolBtn);
        waitForWebElementAndClick(wristBandCoolBtn);

        getDriver().navigate().to(url + "/Listing/Detail/619");
        fluentWait(getDriver(), testPickupBtn);
        waitForWebElementAndClick(testPickupBtn);
    }

    public void iSelectSeeAllFromSeller() {

        getDriver().navigate().to(url + "/Listing/Detail/619");
        waitForVisibility(moreFromThisSellerSeeAllBtn);
        waitForClickability(moreFromThisSellerSeeAllBtn);
        fluentWait(getDriver(), moreFromThisSellerSeeAllBtn);
        waitForWebElementAndClick(moreFromThisSellerSeeAllBtn);

    }


}