package steps.production;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.production.InboxPage;


public class InboxSteps extends BasePage {

    private InboxPage _page;

    public InboxSteps() {

        this._page = new InboxPage();
    }

    @And("select Send Message")
    public void selectSendMessageButton() {
        _page.sendMessageFromListing();
    }

    @And("complete Message TextField")
    public void completeMessageTextField() {
        _page.completeMessageText();
    }

    @And("it redirects me to the Chat Page")
    public void itRedirectsMeToTheChatPage() {
        _page.chatPageValidate();
    }

    @And("select clip to send media")
    public void selectClipToSendMedia() {
//        getDriver().navigate().refresh();
//        _page.validateChatMessagesBox();
        _page.addAnImage();
    }

    @And("select send")
    public void selectSend() {
        _page.chatMessageText();
        _page.sendMediaMessageButton();
    }

    @Then("I validate Send Message to users, including media")
    public void iValidateSendMessageToUsersIncludingMedia() {
        _page.validateMessageMedia();
    }

    @And("select Send Message Button")
    public void selectSendMessagePopUpButton() {
        _page.sendMessagePopUpButton();
    }

    @When("select Inbox")
    public void selectInbox() {
        _page.dashboardInboxTab();
    }

    @And("select Unread")
    public void selectUnread() {
        _page.unreadButton();
    }

    @Then("Validate Unread sector")
    public void validateUnreadSector() {
        _page.validateReadUnreadSector();
    }

    @And("select read")
    public void selectRead() {
        _page.readButton();
    }

    @Then("Validate read sector")
    public void validateReadSector() {
        _page.validateReadUnreadSector();
    }
}