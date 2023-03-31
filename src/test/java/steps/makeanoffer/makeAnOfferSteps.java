package steps.makeanoffer;
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
import pages.makeanoffer.makeAnOfferPage;


public class makeAnOfferSteps extends BasePage {

    private makeAnOfferPage _page;

    public makeAnOfferSteps() {

        this._page = new makeAnOfferPage();

    }


    @Given("I Sign in with new account {string} and go to the listing page")
    public void iSignInAndGoToTheListingPage(String text) {
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


    @When("I select an item to make an offer")
    public void iSelectAnItemToMakeAnOffer() {
        _page.selectItemBtn();
    }

    @And("I press the Make an Offer Button")
    public void iPressTheMakeAnOfferButton() {
        getDriver().navigate().refresh();
        _page.selectMakeAnOfferBtn();
    }

    @And("I complete Make an Offer message TextField")
    public void iCompleteMakeAnOfferMessageTextField() {
        _page.selectMakeAnOfferMessageTextField();

    }

    @And("I upload an example image in the Add Images section")
    public void iUploadAnExampleImageInTheAddImagesSection() {
        _page.selectAddImageToOffer();

    }

    @And("I complete the Proposed TextField")
    public void iCompleteTheProposedTextField() {
        _page.selectProposedPriceTextField();
    }

    @And("I complete the Delivery Date TextField")
    public void iCompleteTheDeliveryDateTextField() {
        //_page.selectDeliverDateTextField();
        _page.selectMakeAnOfferSendButton();
    }

    @Then("I validate the Make an offer message TextField")
    public void iValidateTheMakeAnOfferMessageTextField() {
        Assert.assertEquals(_page.offerChatVerify(), true);
    }


    @Then("I see the request in message view after request")
    public void iValidateTheSeeingOfTheRequestInMessageViewAfterRequest() {
        Assert.assertEquals(_page.offerChatVerify(), true);
    }



    @Then("I validate the viewing of offer in inbox under Unread messages")
    public void iValidateTheViewingOfOfferInInboxUnderUnreadMessages() {
    }

    @When("I go to the offer in inbox under Unread Messages")
    public void iGoToTheOfferInInboxUnderUnreadMessages() {
    }

    @And("I select the Inbox Icon")
    public void iSelectTheInboxIcon() {
        _page.selectInboxButton();
    }
}