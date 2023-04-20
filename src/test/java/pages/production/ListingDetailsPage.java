package pages.production;

import org.json.XML;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;

public class ListingDetailsPage extends BasePage {


    public ListingDetailsPage() {
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
    @FindBy(xpath = "//a[contains(text(), 'Send message')]")
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
    @FindBy(xpath = "//button[contains(text(), 'Add to Cart')]")
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
    @FindBy(how = How.CSS, using = "#shipping-tab")
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
    public WebElement earringsBtn;
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
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/div[1]/div[1]/div[1]/div/div/div[2]/div/div[1]/div[1]/label")
    public WebElement hottestItemsCat;
    @FindBy(xpath = "//a[contains(text(), 'Next >')]")
    public WebElement nextPageBtn;
    @FindBy(how = How.CSS, using = "#pending-tab > span")
    public WebElement pendingBtn;

    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(1) > span > label")
    public WebElement hottestItemsCategory;
    @FindBy(xpath = "/html/body/div[4]/main/div[1]/div/div/div[2]/div[2]/div[1]/a")
    public WebElement hottestItemsDetail;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/div[1]/div[1]/div[1]/div/div/div[2]/div/a/h5")
    public WebElement productHottestItems;
    @FindBy(how = How.CSS, using = "#rowchat-container > section.d-none.d-lg-block.col-lg-3 > div")
    public WebElement sellerMessage;
    @FindBy(how = How.CSS, using = "#refunds-tab")
    public WebElement itemImage;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div:nth-child(2) > div.mb-3 > a")
    public WebElement earringsText;
    @FindBy(how = How.CSS, using = "#shopping-cart-mobile > a")
    public WebElement shoppingCartButton;
    @FindBy(how = How.CSS, using = "#search")
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
    @FindBy(xpath = "//h5[contains(text(), 'Listing HI')]")
    public WebElement HottestItemsCat;
    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement listingCategoryBtn;
    @FindBy(how = How.CSS, using = "#listing-name")
    public WebElement listingNameTextField;
    @FindBy(how = How.CSS, using = "#basic > div.d-flex.align-items-center.mb-3 > label > span")
    public WebElement activePdfBtn;
    @FindBy(how = How.CSS, using = "#img-7")
    public WebElement PdfFieldLoad;

    @FindBy(how = How.CSS, using = "#offer-message")
    public WebElement makeAnOfferMessageTextField;

    @FindBy(xpath = "/html/body/div[4]/main/div[6]/div/div/div/div[3]/div[3]/div/button")
    public WebElement makeAnOfferSendBtn;

    @FindBy(how = How.CSS, using = "#offer-img-1")
    public WebElement addImageToOfferBtn;

    @FindBy(how = How.CSS, using = "#rowchat-container > section.d-none.d-lg-block.col-lg-3 > div")
    public WebElement chatVerify;

    @FindBy(how = How.CSS, using = "#RXJyb3JQbGVhc2UlMjByZW1vdmUlMjBhbnklMjBzcGVjaWFsJTIwY2hhcmFjdGVycyUyMGZyb20lMjB5b3VyJTIwdXNlcm5hbWUucmVk > div.iziToast-body > div.iziToast-texts")
    public WebElement lastErrorValidate;

    @FindBy(how = How.CSS, using = "#seller-buyer-section > p")
    public WebElement validateText;

    @FindBy(how = How.CSS, using = "#reviews > div > div.d-flex.justify-content-end.mb-3")
    public WebElement reviewsSector;
    @FindBy(xpath = "/html/body/div[4]/main/div[3]/div/div/div[2]/div[3]/div[1]/div/div[1]/a/div/div/span[1]")
    public WebElement seenTimesTxt;


    public void reviewsSectorValidate() {
        fluentWait(getDriver(), reviewsSector);
        Assert.assertTrue(reviewsSector.isDisplayed());
    }

    public boolean validateMessageText() {
        fluentWait(getDriver(), validateTextFromSendMessage);
        boolean result = validateTextFromSendMessage.isDisplayed();
        return result;
    }


    public boolean validateTextFirst() {
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
        getDriver().navigate().to(UrlProd);
    }


    public void goToLoginPage() {
        getDriver().navigate().to(UrlProd + "/Account/Login");
    }


    public void goToListingPage() {
        getDriver().navigate().to(UrlProd + "/Listing/Browse");
    }

    public void goToShoppingCart() {
        getDriver().navigate().to(UrlProd + "/Order/ShoppingCart");
    }

    public void goToItem() {
        getDriver().navigate().to(UrlProd + "Listing/Detail/3285");
    }


    public void goToListingItem() {
        getDriver().navigate().to(UrlProd + "Listing/Detail/57");
    }

    public void goToSpecificItem() {
        getDriver().navigate().to(UrlProd + "Listing/Detail/57");
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

    public void validHottestItemsCategory() {
        try {
            fluentWaitStrict(getDriver(), nextBtn);
            List<WebElement> hottestItemsList = getDriver().findElements(By.xpath("//*[contains(text(), 'Hottest Items')]"));
            for (WebElement category : hottestItemsList) {
                if (category.getText().contains("Hottest Items")) {
                    wait(3);
                    fluentWaitStrict(getDriver(), category);
                    String id = category.getAttribute("id");
                    wait(5);
                    String replace = id.replace("-cat", "");
                    getDriver().navigate().to(UrlProd + "listing/detail/" + replace);
                    break;

                }
            }
        } catch (Exception e) {
            fluentWait(getDriver(), nextPageBtn);
            waitForWebElementAndClick(nextPageBtn);
            fluentWait(getDriver(), pendingBtn);
            wait(5);
            List<WebElement> hottestItemsList = getDriver().findElements(By.xpath("//*[contains(text(), 'Hottest Items')]"));
            for (WebElement category : hottestItemsList) {
                if (category.getText().contains("Hottest Items")) {
                    wait(3);
                    String id = category.getAttribute("id");
                    String replace = id.replace("-cat", "");
                    wait(5);
                    getDriver().navigate().to(UrlProd + "listing/detail/" + replace);
                    break;
                }
            }
        }
    }

    public void selectHottestItemsProduct() {
        try {
            fluentWait(getDriver(), HottestItemsCat);
            waitForWebElementAndClick(HottestItemsCat);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), HottestItemsCat);
            waitForWebElementAndClick(HottestItemsCat);
        } finally {
            getDriver().getWindowHandles().forEach(tab -> getDriver().switchTo().window(tab));
        }
    }


    public String HottestItemsCat() {
        try {
            String result = hottestItemsCat.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            String result = hottestItemsCat.getText();
            return result;
        }

    }

    public void goToProductHottestItems() {
        getDriver().navigate().to(UrlProd + "/Listing/Detail/991");
    }

    public void selectProductHottestItems() {
        try {
            fluentWait(getDriver(), productHottestItems);
            waitForWebElementAndClick(productHottestItems);
            fluentWait(getDriver(), hottestItemsDetail);
        } catch (Exception e) {
            wait(3);
        }
    }

    public String HottestItemsDetail() {
        try {
            String result = hottestItemsDetail.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            String result = hottestItemsDetail.getText();
            return result;
        }

    }

    public String HottestItemsCategory() {
        try {
            String result = hottestItemsCategory.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            String result = hottestItemsCategory.getText();
            return result;
        }

    }

    public void selectHottestItemsDetail() {
        try {
            fluentWait(getDriver(), hottestItemsDetail);
            waitForWebElementAndClick(hottestItemsDetail);
            fluentWait(getDriver(), hottestItemsCategory);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), hottestItemsDetail);
            waitForWebElementAndClick(hottestItemsDetail);
        }

    }

    public void goToHottestItemsDetail() {
        getDriver().navigate().to(UrlProd + "/Listing/Browse?CategoryId=320");
    }

    public boolean sellerMessageConfirm() {
        try {
            fluentWaitStrict(getDriver(), sellerMessage);
            boolean result = sellerMessage.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            fluentWaitStrict(getDriver(), sellerMessage);
            boolean result = sellerMessage.isDisplayed();
            return result;
        }
    }

    public boolean itemImageConfirm() {
        fluentWait(getDriver(), itemImage);
        boolean result = itemImage.isDisplayed();
        return result;
    }

    public String earringsTextConfirm() {
        String result = earringsText.getText();
        try {
            result = earringsText.getText();
        } catch (Exception e) {
            wait(6);
            fluentWaitStrict(getDriver(), earringsText);
            result = earringsText.getText();
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
        try {
            boolean result = browseSearchBtn.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = browseSearchBtn.isDisplayed();
            return result;
        }

    }

    public void iSelectSellerName() {
        fluentWait(getDriver(), sellerNameBtn);
        waitForWebElementAndClick(sellerNameBtn);
    }

    public void iSelectSendMessage() {
        try {
            fluentWait(getDriver(), sendMessageBtn);
            waitForWebElementAndClick(sendMessageBtn);
            fluentWait(getDriver(), messageTextField);
        } catch (Exception e) {
            wait(2);
            fluentWait(getDriver(), sendMessageBtn);
            waitForWebElementAndClick(sendMessageBtn);
        }

    }

    public void iSendMessage() {
        try {
            fluentWait(getDriver(), messageTextField);
            waitForWebElementAndClick(messageTextField);
            messageTextField.sendKeys("Automation message");
            fluentWait(getDriver(), sendBtn);
            waitForWebElementAndClick(sendBtn);
        } catch (Exception e) {
            wait(3);
            messageTextField.sendKeys("Automation message");
            fluentWait(getDriver(), sendBtn);
            waitForWebElementAndClick(sendBtn);
        }
    }




        /*messageTexActivate();
        fluentWait(getDriver(), sendMessageBtn);
        waitForWebElementAndClick(sendMessageBtn);
        fluentWait(getDriver(), messageTextField);
        waitForWebElementAndClick(messageTextField);
        messageTextField.sendKeys("Automation message");
        messageTextField.clear();
        messageTextField.sendKeys("Automation message");

        fluentWait(getDriver(), messageTextField);
        waitForWebElementAndClick(messageTextField);
        messageTextField.sendKeys("Automation message");
        messageTextField.clear();
        messageTextField.sendKeys("Automation message");
        messageTexActivate();
        fluentWait(getDriver(), messageTextField);
        waitForWebElementAndClick(messageTextField);
        messageTextField.sendKeys("Automation message");
        messageTextField.clear();
        messageTextField.sendKeys("Automation message");
//        fluentWait(getDriver(), sendBtn);
//        waitForWebElementAndClick(sendBtn);
        //fluentWait(getDriver(), sendBtn);
        try {
            fluentWait(getDriver(), messageTextField);
            waitForWebElementAndClick(messageTextField);
            messageTextField.sendKeys("Automation message");
            messageTextField.clear();
            messageTextField.sendKeys("Automation message");
            messageTexActivate();
            fluentWait(getDriver(), messageTextField);
            waitForWebElementAndClick(messageTextField);
            messageTextField.sendKeys("Automation message");
            messageTextField.clear();
            messageTextField.sendKeys("Automation message");
            fluentWait(getDriver(), sendBtn);
            waitForWebElementAndClick(sendBtn);
        } catch (Exception e) {
            while (!sendBtn.isDisplayed()) {
                wait(5);
                validateMessageText();
                //actions.moveToElement(sendBtn).doubleClick().build().perform();
                //fluentWaitElementDisappears(getDriver(), sendBtn);
                wait(2);
                messageTextField.clear();
                messageTextField.sendKeys("Automation message");
                fluentWait(getDriver(), sendBtn);
                waitForWebElementAndClick(sendBtn);
            }


        }

         */
//        waitForWebElementAndClick(sendBtn);


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
        try {
            fluentWait(getDriver(), addToCartBtn);
            waitForWebElementAndClick(addToCartBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addToCartBtn);
            waitForWebElementAndClick(addToCartBtn);
        }
    }

    public void iGoToMakingOfferPage() {
        getDriver().navigate().to(UrlProd + "Listing/Detail/57");

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
        } catch (Exception e) {
            wait(3);
            fluentWaitStrict(getDriver(), sendBtnMakeAndOffer);
            waitForWebElementAndClick(sendBtnMakeAndOffer);
//            retryingFindClick(sendBtnMakeAndOffer);
        }

    }

    public void nameTheProduct() {
        fluentWait(getDriver(), listingCategoryBtn);
        waitForWebElementAndClick(listingNameTextField);
        listingNameTextField.sendKeys("Test Download File");
    }

    public void activePdf() {
        try {
            fluentWait(getDriver(), activePdfBtn);
            waitForWebElementAndClick(activePdfBtn);
            fluentWait(getDriver(), PdfFieldLoad);
        } catch (Exception e) {
            wait(3);

        }

    }

    public static final String EV_RESULT_PDF_PATH = System.getProperty("user.dir") + "/src/test/resources/media/Doc1.pdf";

    public void listingPdfLoad() {
        PdfFieldLoad.sendKeys(EV_RESULT_PDF_PATH);
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

    public void reviewsButton() {
        fluentWaitStrict(getDriver(), reviewsBtn);
        waitForWebElementAndClick(reviewsBtn);
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

        getDriver().navigate().to(UrlProd + "Listing/Detail/57");
        fluentWait(getDriver(), earringsBtn);
        waitForWebElementAndClick(earringsBtn);

        getDriver().navigate().to(UrlProd + "Listing/Detail/57");
        fluentWait(getDriver(), accessoriesBtn);
        waitForWebElementAndClick(accessoriesBtn);

        getDriver().navigate().to(UrlProd + "Listing/Detail/57");
        fluentWait(getDriver(), homeAndLivingBtn);
        waitForWebElementAndClick(homeAndLivingBtn);


        getDriver().navigate().to(UrlProd + "Listing/Detail/57");
        fluentWait(getDriver(), clothingBtn);
        waitForWebElementAndClick(clothingBtn);

    }

    public void iSelectMoreItemFromSeller() {
        fluentWait(getDriver(), wristBandCoolBtn);
        waitForWebElementAndClick(wristBandCoolBtn);

        getDriver().navigate().to(UrlProd + "Listing/Detail/57");
        fluentWait(getDriver(), testPickupBtn);
        waitForWebElementAndClick(testPickupBtn);
    }

    public void iSelectSeeAllFromSeller() {

        getDriver().navigate().to(UrlProd + "Listing/Detail/57");
        waitForVisibility(moreFromThisSellerSeeAllBtn);
        waitForClickability(moreFromThisSellerSeeAllBtn);
        fluentWait(getDriver(), moreFromThisSellerSeeAllBtn);
        waitForWebElementAndClick(moreFromThisSellerSeeAllBtn);

    }

    public void completeFormSignUpPROD() {
        try {
            fluentWait(getDriver(), howOld);
            waitForWebElementAndClick(howOld);
            //fluentWaitElementDisappears(getDriver(),errorMessageSignUp);
            howOld.sendKeys("18");
            howMuch.sendKeys("test");
            agreeTerms.sendKeys("Yes");
            whereAreYou.sendKeys("test");
            fluentWait(getDriver(), submitBtn);
            waitForWebElementAndClick(submitBtn);
//        retryingFindClick(submitBtn);
            validateTextFirst();
            getDriver().navigate().to(UrlProd + "/Listing/Detail/57");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), howOld);
            waitForWebElementAndClick(howOld);
            //fluentWaitElementDisappears(getDriver(),errorMessageSignUp);
            howOld.sendKeys("18");
            howMuch.sendKeys("test");
            agreeTerms.sendKeys("Yes");
            whereAreYou.sendKeys("test");
            fluentWait(getDriver(), submitBtn);
            waitForWebElementAndClick(submitBtn);
//        retryingFindClick(submitBtn);
            validateTextFirst();
            getDriver().navigate().to(UrlProd + "/Listing/Detail/57");
        }
    }

    public void selectMakeAnOfferBtn() {
        getDriver().navigate().refresh();
        try {
            fluentWait(getDriver(), makeAnOfferBtn);
            waitForWebElementAndClick(makeAnOfferBtn);
            fluentWait(getDriver(), makeAnOfferMessageTextField);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), makeAnOfferBtn);
            waitForWebElementAndClick(makeAnOfferBtn);
        }

    }

    public void selectMakeAnOfferMessageTextField() {
        fluentWait(getDriver(), makeAnOfferMessageTextField);
        waitForWebElementAndClick(makeAnOfferMessageTextField);
        makeAnOfferMessageTextField.sendKeys("Test Asleep(3000);utomation");
    }

    public void selectProposedPriceTextField() {
        fluentWait(getDriver(), proposedPriceTextField);
        waitForWebElementAndClick(proposedPriceTextField);
        proposedPriceTextField.sendKeys("100");
    }

    public void selectAddImageToOffer() {
        addImageToOfferBtn.sendKeys(EV_RESULT_FILE_PATH);

    }

    public void selectMakeAnOfferSendButton() {
        try {
            actions.moveToElement(makeAnOfferSendBtn);
            fluentWaitStrict(getDriver(), makeAnOfferSendBtn);
            waitForWebElementAndClick(makeAnOfferSendBtn);
            waitForWebElementAndClick(makeAnOfferSendBtn);
            waitForWebElementAndClick(makeAnOfferSendBtn);
            //retryingFindClick(makeAnOfferSendBtn);
//            fluentWait(getDriver(), chatVerify);
        } catch (Exception e) {
            wait(4);
            fluentWaitStrict(getDriver(), makeAnOfferSendBtn);
            waitForWebElementAndClick(makeAnOfferSendBtn);
            //retryingFindClick(makeAnOfferSendBtn);
        }

    }

    public boolean offerChatVerify() {
        fluentWait(getDriver(), chatVerify);
        boolean result = chatVerify.isDisplayed();
        return result;
    }

    public boolean validateLastError() {
        try {
            fluentWaitElementDisappears(getDriver(), lastErrorValidate);
            boolean result = lastErrorValidate.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(4);
            fluentWait(getDriver(), validateText);
            boolean result = lastErrorValidate.isDisplayed();
            return result;
        } finally {
            fluentWait(getDriver(), validateText);
        }

    }

    public void completeFormSignUp() {
        try {
            fluentWait(getDriver(), howOld);
            waitForWebElementAndClick(howOld);
            //fluentWaitElementDisappears(getDriver(),errorMessageSignUp);
            howOld.sendKeys("18");
            howMuch.sendKeys("test");
            agreeTerms.sendKeys("Yes");
            whereAreYou.sendKeys("test");
            fluentWait(getDriver(), submitBtn);
            waitForWebElementAndClick(submitBtn);
//        retryingFindClick(submitBtn);
            validateTextFirst();
            getDriver().navigate().to(UrlProd + "/Listing/Detail/57");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), howOld);
            waitForWebElementAndClick(howOld);
            //fluentWaitElementDisappears(getDriver(),errorMessageSignUp);
            howOld.sendKeys("18");
            howMuch.sendKeys("test");
            agreeTerms.sendKeys("Yes");
            whereAreYou.sendKeys("test");
            fluentWait(getDriver(), submitBtn);
            waitForWebElementAndClick(submitBtn);
//        retryingFindClick(submitBtn);
            validateTextFirst();
            getDriver().navigate().to(UrlProd + "/Listing/Detail/57");
        }
    }

    public void selectItemBtn() {
        getDriver().navigate().to(UrlProd + "/Listing/Detail/57");

    }

    public String seenCountText() {
        String result = seenTimesTxt.getText();
        return result;
    }
}


