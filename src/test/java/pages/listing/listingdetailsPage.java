package pages.listing;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.random;

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
    @FindBy(how = How.CSS, using = "#message > div > div > div > div.justify-content-end.d-flex > div > button")
    public WebElement sendBtn;
    @FindBy(how = How.CSS, using = "#colors-father > span:nth-child(1) > label > span")
    public WebElement redBtn;
    @FindBy(how = How.CSS, using = "#colors-father > span:nth-child(2) > label > span")
    public WebElement blackBtn;
    @FindBy(how = How.CSS, using = "#colors-father > span:nth-child(4) > label > span")
    public WebElement yellowBtn;
    @FindBy(how = How.CSS, using = "#quantity")
    public WebElement quantityTextField;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div.d-flex.flex-wrap.align-items-center.justify-content-start > button.own-btn.own-btn-md.btn-primary.fz-16.font-weight-bold.mr-2.secondary-font.mb-3.btnBuyNow")
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
    @FindBy(xpath = "/html/body/div[3]/main/div[6]/div/div/div/div[3]/div[2]/div/div/div/input")
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
    @FindBy(xpath = "/html/body/div[3]/main/div[5]/div/div[1]/a/span")
    public WebElement moreFromThisSellerSeeAllBtn;
    @FindBy(how = How.CSS, using = "#profile-img-storefront")
    public WebElement profileImage;
    @FindBy(xpath = "/html/body/div[3]/main/div[6]/div/div/div/div[3]/div[3]/div/button")
    public WebElement sellerMessage;
    @FindBy(how = How.CSS, using = "#refunds-tab")
    public WebElement itemImage;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div.d-flex.flex-wrap.align-items-center.justify-content-start > a")
    public WebElement priceText;
    @FindBy(how = How.CSS, using = "#go-checkout")
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
        fluentWait(getDriver(), nextBtn);
        waitForWebElementAndClick(nextBtn);
        nextBtn.click();
    }

    public void imSellerButton() {
        fluentWait(getDriver(), imSellerBtn);
        waitForWebElementAndClick(imSellerBtn);
        imSellerBtn.click();
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
        getDriver().navigate().to(url + "/Listing/Detail/619");
    }

    public void goToListingItem() {
        getDriver().navigate().to(url + "/Listing/Detail/619");
    }

    public void goToSpecificItem() {
        getDriver().navigate().to(url + "/Listing/Detail/619");
    }

    public boolean sellerConfirm() {
        boolean result = profileImage.isDisplayed();
        return result;
    }

    public boolean sellerMessageConfirm() {
        boolean result = sellerMessage.isDisplayed();
        return result;
    }

    public boolean itemImageConfirm() {
        boolean result = itemImage.isDisplayed();
        return result;
    }

    public String priceTextConfirm() {
        String result = priceText.getText();
        return result;
    }

    public boolean shoppingCartConfirm() {
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
        sellerNameBtn.click();
    }

    public void iSelectSendMessage() {
        fluentWait(getDriver(), sendMessageBtn);
        waitForWebElementAndClick(sendMessageBtn);
        fluentWait(getDriver(),messageTextField);
        waitForWebElementAndClick(messageTextField);
        messageTextField.sendKeys("Automation message");
        fluentWait(getDriver(), sendBtn);
        waitForWebElementAndClick(sendBtn);
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
        fluentWait(getDriver(), buyNowBtn);
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
        fluentWait(getDriver(),offerTextField);
        waitForWebElementAndClick(offerTextField);
        offerTextField.sendKeys("test automation");
        addImageBtn.sendKeys(EV_RESULT_FILE_PATH);
        fluentWait(getDriver(), proposedPriceTextField);
        waitForWebElementAndClick(proposedPriceTextField);
        proposedPriceTextField.sendKeys("10");
        fluentWait(getDriver(), deliveryDate);
        waitForWebElementAndClick(deliveryDate);
        deliveryDate.sendKeys("10102023");
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
        fluentWait(getDriver(),clothingBtn);
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