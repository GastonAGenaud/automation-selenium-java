package steps.listing;

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
import pages.listing.listingdetailsPage;


public class listingdetailsSteps extends BasePage {

    private listingdetailsPage _page;

    public listingdetailsSteps() {

        this._page = new listingdetailsPage();
    }

    @Given("I create an account and go to Make an offer {string}")
    public void iCreateAnAccountAndGoToMakeAnOffer(String text) {
        _page.CreateAnAccountListingDetails(text);
        _page.imSellerButton();
        _page.nextButton();
        _page.howOldAreYou();
        _page.howMuchSell();
        _page.termsAndConditions();
        _page.whereAreYouFrom();
        _page.submitButton();
    }


    @And("I go to the listing details page")
    public void iGoToTheListingDetailsPage() {
        ////_driver.manage().window().setSize(new Dimension(1920, 1080));
        _page.goToListingPage();
    }

    @When("I select the seller name")
    public void iSelectTheSellerName() {
        _page.goToListingItem();
        _page.iSelectSellerName();
    }

    @Then("I see the seller storefront profile")
    public void iSeeTheSellerStorefrontProfile() {
        Assert.assertEquals(true, _page.sellerConfirm());
    }

    @When("I select the send message button")
    public void iSelectTheSendMessageButton() {
        _page.goToListingItem();
        _page.iSelectSendMessage();
    }

    @Then("I see that it redirects me to the chat page")
    public void iSeeThatItRedirectsMeToTheChatPage() {
        Assert.assertEquals(_page.sellerMessageConfirm(), true);

    }

    @Then("I see that it redirects me to the chat page again")
    public void iSeeThatItRedirectsMeToTheChatPageAgain() {
        wait(10);
        Assert.assertEquals(_page.sellerMessageConfirm(), true);

    }

    @When("I select the variant colors")
    public void iSelectTheVariantColors() {
        _page.goToSpecificItem();
        _page.iSelectVariant();
    }

    @Then("I validate the variants")
    public void iValidateTheVariants() {
        Assert.assertEquals(true, _page.itemImageConfirm());
    }

    @When("I change the quantity of the item")
    public void iChangeTheQuantityOfTheItem() {
        _page.goToSpecificItem();
        _page.iSelectQuantity();
    }

    @Then("I see that the price adjusts to the quantity")
    public void iSeeThatThePriceAdjustToTheQuantity() {
        Assert.assertEquals("Price", _page.priceTextConfirm());
    }

    @When("I select the buy now button")
    public void iSelectTheBuyNowButton() {
        _page.goToListingItem();
        _page.iSelectBuyNow();
    }

    @Then("I see that it redirects me to the shopping cart page")
    public void iSeeThatItRedirectsMeToTheShoppingCartPage() {
        wait(5);
        Assert.assertEquals(true, _page.shoppingCartConfirm());
    }

    @When("I select the add to cart button")
    public void iSelectTheAddToCartButton() {
        _page.goToListingItem();
        _page.iSelectAddToCart();
        _page.goToShoppingCart();
    }

    @When("I select the make an offer button")
    public void iSelectTheMakeAnOfferButton() {
        _page.iGoToMakingOfferPage();
        _page.iSelectMakeAnOffer();
    }

    @And("I type on the Describe what you expect from the seller text field")
    public void iTypeOnTheDescribeWhatYouExpectFromTheSellerTextField() {
        _page.iTypeAnOffer();
    }


    @When("I select the product Information button")
    public void iSelectTheProductInformationButton() {
        _page.goToListingItem();
        _page.iSelectTheProductInformation();
    }

    @Then("I validate the listing tabs")
    public void iValidateTheListingTabs() {
        Assert.assertEquals(true, _page.itemImageConfirm());
    }

    @When("I select the related item")
    public void iSelectTheRelatedItem() {
        _page.goToListingItem();
        _page.iSelectRelatedItems();
    }

    @Then("I see that it redirects me to the item page")
    public void iSeeThatItRedirectsMeToTheItemPage() {
        Assert.assertEquals(true, _page.itemImageConfirm());
    }

    @When("I select the see all button")
    public void iSelectTheSeeAllButton() {
        _page.goToListingItem();
        _page.iSelectSeeAll();
    }

    @Then("I see that redirects me to the browse page")
    public void iSeeThatRedirectsMeToTheBrowsePage() {
        Assert.assertEquals(true, _page.browseConfirm());
    }

    @When("I select related tags")
    public void iSelectRelatedTags() {
        _page.goToListingItem();
        _page.iSelectRelatedTags();
    }


    @When("I select more item from seller")
    public void iSelectMoreItemFromSeller() {
        _page.goToSpecificItem();
        _page.iSelectMoreItemFromSeller();
    }


    @When("I select see all redirect button")
    public void iSelectSeeAllRedirectButton() {
        _page.goToListingItem();
        _page.iSelectSeeAllFromSeller();
    }

    @Then("I see that redirects me to the seller profile")
    public void iSeeThatRedirectsMeToTheSellerProfile() {
        Assert.assertEquals(true, _page.sellerConfirm());
    }

}