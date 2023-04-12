package steps.production;

import io.cucumber.java.Before;
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
import pages.production.ListingDetailsPage;

import java.io.IOException;


public class ListingDetailsSteps extends BasePage {

    private ListingDetailsPage _page;

    public ListingDetailsSteps() {

        this._page = new ListingDetailsPage();
    }

    @Given("PROD I create an account and go to Make an offer {string}")
    public void prodiCreateAnAccountAndGoToMakeAnOffer(String text) {
        _page.CreateAnAccountListingDetails(text);
        _page.imSellerButton();
        _page.nextButton();
        _page.howOldAreYou();
        _page.howMuchSell();
        _page.termsAndConditions();
        _page.whereAreYouFrom();
        _page.submitButton();
        _page.validateTextFirst();
    }

//    @Before
//    public void test() throws IOException {
//        loginWithGastonUserProdProducts();
//    }

    @And("PROD I go to the listing details page")
    public void prodiGoToTheListingDetailsPage() {
        ////_driver.manage().window().setSize(new Dimension(1920, 1080));
        _page.goToListingPage();
    }

    @When("PROD I select the seller name")
    public void prodiSelectTheSellerName() {
        _page.goToListingItem();
        _page.iSelectSellerName();
    }

    @Then("PROD I see the seller storefront profile")
    public void prodiSeeTheSellerStorefrontProfile() {
        Assert.assertEquals(true, _page.sellerConfirm());
    }

    @When("PROD I select the send message button")
    public void prodiSelectTheSendMessageButton() {
        _page.goToListingItem();
        _page.iSelectSendMessage();
        _page.iSendMessage();
    }

    @Then("PROD I see that it redirects me to the chat page")
    public void prodiSeeThatItRedirectsMeToTheChatPage() {
        Assert.assertEquals(_page.sellerMessageConfirm(), true);

    }

    @Then("PROD I see that it redirects me to the chat page again")
    public void prodiSeeThatItRedirectsMeToTheChatPageAgain() {
        Assert.assertEquals(_page.sellerMessageConfirm(), true);

    }

    @When("PROD I select the variant colors")
    public void prodiSelectTheVariantColors() {
        _page.goToSpecificItem();
        _page.iSelectVariant();
    }

    @Then("PROD I validate the variants")
    public void prodiValidateTheVariants() {
        Assert.assertEquals(true, _page.itemImageConfirm());
    }

    @When("PROD I change the quantity of the item")
    public void iChangeTheQuantityOfTheItem() {
        _page.goToSpecificItem();
        _page.iSelectQuantity();
    }

    @Then("PROD I see that the price adjusts to the quantity")
    public void prodiSeeThatThePriceAdjustToTheQuantity() {
        Assert.assertEquals("Earrings", _page.earringsTextConfirm());
    }

    @When("PROD I select the buy now button")
    public void prodiSelectTheBuyNowButton() {
        _page.goToListingItem();
        _page.iSelectBuyNow();
    }

    @Then("PROD I see that it redirects me to the shopping cart page")
    public void prodiSeeThatItRedirectsMeToTheShoppingCartPage() {
        Assert.assertEquals(true, _page.shoppingCartConfirm());
    }

    @When("PROD I select the add to cart button")
    public void prodiSelectTheAddToCartButton() {
        _page.goToListingItem();
        _page.iSelectAddToCart();
        _page.goToShoppingCart();
    }

    @When("PROD I select the make an offer button")
    public void prodiSelectTheMakeAnOfferButton() {
        _page.iGoToMakingOfferPage();
        _page.iSelectMakeAnOffer();
    }

    @And("PROD I type on the Describe what you expect from the seller text field")
    public void prodiTypeOnTheDescribeWhatYouExpectFromTheSellerTextField() {
        _page.iTypeAnOffer();
    }


    @When("PROD I select the product Information button")
    public void prodiSelectTheProductInformationButton() {
        _page.goToItem();
        _page.iSelectTheProductInformation();
    }

    @Then("PROD I validate the listing tabs")
    public void prodiValidateTheListingTabs() {
        Assert.assertEquals(true, _page.itemImageConfirm());
    }

    @When("PROD I select the related item")
    public void prodiSelectTheRelatedItem() {
        _page.goToListingItem();
        _page.iSelectRelatedItems();
    }

    @Then("PROD I see that it redirects me to the item page")
    public void prodiSeeThatItRedirectsMeToTheItemPage() {
        Assert.assertEquals(true, _page.itemImageConfirm());
    }

    @When("PROD I select the see all button")
    public void prodiSelectTheSeeAllButton() {
        _page.goToListingItem();
        _page.iSelectSeeAll();
    }

    @Then("PROD I see that redirects me to the browse page")
    public void prodiSeeThatRedirectsMeToTheBrowsePage() {
        Assert.assertEquals(true, _page.browseConfirm());
    }

    @When("PROD I select related tags")
    public void prodiSelectRelatedTags() {
        _page.goToListingItem();
        _page.iSelectRelatedTags();
    }


    @When("PROD I select more item from seller")
    public void prodiSelectMoreItemFromSeller() {
        _page.goToSpecificItem();
        _page.iSelectMoreItemFromSeller();
    }


    @When("PROD I select see all redirect button")
    public void prodiSelectSeeAllRedirectButton() {
        _page.goToListingItem();
        _page.iSelectSeeAllFromSeller();
    }

    @Then("PROD I see that redirects me to the seller profile")
    public void prodiSeeThatRedirectsMeToTheSellerProfile() {
        Assert.assertEquals(true, _page.sellerConfirm());
    }

    @When("PROD valid to show the product category and select it")
    public void prodValidToShowTheProductCategoryAndSelectIt() {
        _page.validHottestItemsCategory();
    }

    @And("PROD valid if the category is shown on the product page")
    public void prodValidIfTheCategoryIsShownOnTheProductPage() {
        try {
            Assert.assertEquals("Hottest Items", _page.HottestItemsDetail());
        } catch (Exception e) {
            _page.validHottestItemsCategory();
            Assert.assertEquals("Hottest Items", _page.HottestItemsDetail());
        }
    }

    @And("PROD select the category")
    public void prodSelectTheCategory() {
        _page.selectHottestItemsDetail();
        _page.goToHottestItemsDetail();
    }

    @Then("PROD valid if the category is selected")
    public void prodValidIfTheCategoryIsSelected() {
        Assert.assertEquals("Hottest Items", _page.HottestItemsCategory());
    }

    @And("PROD I add a name text field")
    public void prodiAddANameTextField() {
        _page.nameTheProduct();
    }

    @And("PROD Activate option and add pdf")
    public void prodActivateOptionAndAddPdf() {
        _page.activePdf();
        _page.listingPdfLoad();
    }


    @Given("PROD I Sign in with new account {string} and go to the listing page")
    public void prodiSignInAndGoToTheListingPage(String text) {
        _page.CreateAnAccountListingDetails(text);
        _page.validateLastError();
        _page.imSellerButton();
        _page.nextButton();
        _page.completeFormSignUp();
//        _page.howMuchSell();
//        _page.termsAndConditions();
//        _page.whereAreYouFrom();
//        _page.submitButton();
    }


    @When("PROD I select an item to make an offer")
    public void prodiSelectAnItemToMakeAnOffer() {
        _page.selectItemBtn();
    }

    @And("PROD I press the Make an Offer Button")
    public void prodiPressTheMakeAnOfferButton() {
        getDriver().navigate().refresh();
        _page.selectMakeAnOfferBtn();
    }

    @And("PROD I complete Make an Offer message TextField")
    public void prodiCompleteMakeAnOfferMessageTextField() {
        _page.selectMakeAnOfferMessageTextField();

    }

    @And("PROD I upload an example image in the Add Images section")
    public void prodiUploadAnExampleImageInTheAddImagesSection() {
        _page.selectAddImageToOffer();

    }

    @And("PROD I complete the Proposed TextField")
    public void prodiCompleteTheProposedTextField() {
        _page.selectProposedPriceTextField();
    }

    @And("PROD I complete the Delivery Date TextField")
    public void prodiCompleteTheDeliveryDateTextField() {
        //_page.selectDeliverDateTextField();
        _page.selectMakeAnOfferSendButton();
    }

    @Then("PROD I validate the Make an offer message TextField")
    public void prodiValidateTheMakeAnOfferMessageTextField() {
        Assert.assertEquals(_page.offerChatVerify(), true);
    }

    @And("select Review button")
    public void selectReviewButton() {
        _page.reviewsButton();
    }

    @Then("Validate the Review sector")
    public void validateTheReviewSector() {
    }

    @And("select an item")
    public void selectAnItem() {
        _page.goToSpecificItem();
    }

    @Then("I validate Seen count")
    public void iValidateSeenCount() {
        try {
            Assert.assertEquals("Seen 0 times in the last hour", _page.seenCountText());
        } catch (Exception e) {
            wait(4);
            Assert.assertEquals("Seen 0 times in the last hour", _page.seenCountText());
        }

    }
}
