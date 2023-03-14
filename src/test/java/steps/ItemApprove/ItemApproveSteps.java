package steps.ItemApprove;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.ItemApprove.ItemApprovePage;

public class ItemApproveSteps extends BasePage {

    private ItemApprovePage _page;

    public ItemApproveSteps() {

        this._page = new ItemApprovePage();

    }

        @And("I select Item Approve")
    public void iSelectItemApprove() {
        _page.approveTab();
    }

    @And("I validate texts")
    public void iValidateTexts() {
        _page.approveText();
        _page.pendingText();
        _page.rejectedText();
     //   _page.hottestText();
     //   _page.listingText();
     //   _page.soldByText();
     //   _page.gastonItemTxt();
     //   _page.ItemImg();
     //   _page.fiveStars();
     //   _page.DotsDisplayed();
     //   _page.priceDisplayed();
    }

    @Then("Valid that the texts are displayed correctly")
    public void validThatTheTextsAreDisplayedCorrectly() {
        _page.approveSectorValidated();
    }
}
