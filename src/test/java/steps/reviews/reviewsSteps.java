package steps.reviews;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.review.reviewsPage;


public class reviewsSteps extends BasePage {

    private reviewsPage _page;

    public reviewsSteps() {

        this._page = new reviewsPage();
    }


    @When("I select an item")
    public void iSelectAnItem() {
        _page.selectListingBtn();
    }

    @And("I select the Reviews button")
    public void iSelectTheReviewsButton() {
        _page.selectReviewBtn();
    }

    @And("I select the Profile Reviews button")
    public void selectReviewsProfileBtn() {
        _page.selectUserProfileBtn();
        _page.selectReviewsProfileBtn();
    }

    @And("I select the Leave a Review button")
    public void iSelectTheLeaveAReviewButton() {
        _page.selectLeaveReviewBtn();
    }

    @And("I select the star button")
    public void iSelectTheStarButton() {
        _page.selectStarButton();
    }

    @And("I type in the seller review TextField and I type in the item review TextField")
    public void iTypeInTheSellerReviewTextFieldAndITypeInTheItemReviewTextField() {
        _page.selectReviewPurchasedTextField();
    }

    @And("I select the Send Button")
    public void iSelectTheSendButton() {
        _page.selectSendReviewBtn();
    }

    @Then("I validate the Reviews section")
    public void iValidateTheReviewsSection() {
        Assert.assertEquals("Leave a Review", _page.reviewConfirm());
    }

    @And("I select the user profile name")
    public void iSelectTheUserProfileName() {
        _page.selectUserProfileBtn();
    }


    @And("I type in the both Your review TextField")
    public void iTypeInTheBothYourReviewTextField() {
        _page.selectSellerTextFieldBtn();
    }

    @Then("I validate the Leave a review Button in the seller profile")
    public void iValidateTheLeaveAReviewButtonInTheSellerProfile() {
        Assert.assertEquals("Leave a Review", _page.reviewConfirm());
    }


    @When("I select the Orders button")
    public void iSelectTheOrdersButton() {
        _page.selectOrdersBtn();
    }

    @And("I select the Purchased button")
    public void iSelectThePurchasedButton() {
        _page.selectPurchasedBtn();
    }

    @And("I select the Leave a review button in purchased section")
    public void iSelectTheLeaveAReviewButtonInPurchasedSection() {
        _page.showCompleted();
        _page.showCompleted();
        _page.selectLeaveAReviewInPurchased();
    }

    @Then("I validate the reviews in Purchased section")
    public void iValidateTheReviewsInPurchasedSection() {
        Assert.assertEquals("Leave a Review", _page.purchasedReviewConfirm());
    }

    @And("I select the Sold button")
    public void iSelectTheSoldButton() {
        _page.selectSoldBtn();
    }

    @And("I select the Ask for a review button in sold section")
    public void iSelectTheAskForAReviewButtonInSoldSection() {
        _page.selectAskForReviewBtn();
    }

    @Then("I validate the Ask for a review button in Sold section")
    public void iValidateTheAskForAReviewButtonInSoldSection() {
        Assert.assertEquals(true, _page.soldReviewConfirm());
    }

    @And("I select the Leave a Review button in profile")
    public void iSelectTheLeaveAReviewButtonInProfile() {
        _page.selectLeaveReviewInProfile();
    }

    @And("I select the second star button")
    public void iSelectTheSecondStarButton() {
        _page.selectRatingBtn();
    }

    @And("I select the star button in purchased")
    public void iSelectTheStarButtonInPurchased() {
        _page.selectStarInPurchased();
    }

    @And("I type in the seller review TextField")
    public void iTypeInTheSellerReviewTextField() {
        _page.selectSellerTextFieldBtn();
    }
}