package steps.production;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.production.ReviewsPage;


public class ReviewsSteps extends BasePage {

    private ReviewsPage _page;

    public ReviewsSteps() {

        this._page = new ReviewsPage();
    }
//        @Before
//    public void test() throws{
//        _page.CreateAnAccountListingDetailsPROD();
//    }

    @Given("PROD I Sign in with new account {string}")
    public void iSignInWithNewAccount(String text) {
        _page.CreateAnAccountListingDetailsPROD(text);
    }

    @And("select Leave a review button")
    public void selectLeaveAReviewButton() {
        _page.selectLeaveReviewBtn();
    }

    @And("select five stars")
    public void selectFiveStars() {
        _page.fiveStarsSelectONE();
        _page.fiveStarsSelectTWO();
    }

    @And("complete the two reviews TextFields")
    public void completeTwoReviewTextField() {
        _page.reviewOneTxt();
        _page.reviewTwoTxt();
    }

    @And("select Send button")
    public void selectSendButton() {
        _page.sendReview();
    }

    @Then("I validate Leave a review")
    public void iValidateLeaveAReview() {
        _page.reviewSendCorrectly();
    }

    @And("select Reviews tab")
    public void selectReviewsTab() {
        _page.itemReviewsTab();
    }

    @And("Validate that the review is displayed")
    public void validateThatTheReviewIsDisplayed() {
        _page.reviewsSectionDisplayed();
    }
}

