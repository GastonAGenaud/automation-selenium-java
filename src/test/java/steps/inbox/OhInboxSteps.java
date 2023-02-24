package steps.inbox;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.inbox.OhInboxPage;

public class OhInboxSteps extends BasePage {

    public OhInboxPage _page;

    public OhInboxSteps() {

        this._page = new OhInboxPage();
    }

    @And("I select Inbox sector")
    public void iSelectInboxSector() {
        _page.setInboxTab();
    }

    @When("I select a chat")
    public void iSelectAChat() {
        _page.setSelectChat();
    }

    @And("I type in the chat Text Field")
    public void iTypeInTheChatTextField() {
        _page.setChatMessageBox();
    }

    @And("Select Send button")
    public void selectSendButton() {
        _page.sendMessageButton();
    }

    @Then("I validate enter a chat")
    public void iValidateEnterAChat() {
        Assert.assertEquals(_page.aboutText(), "ABOUT");
    }

    @When("I type in the search TextField")
    public void iTypeInTheSearchTextField() {
        _page.setChatSearch();
    }

    @Then("I validate search a chat")
    public void iValidateSearchAChat() {
        Assert.assertEquals(_page.aboutText(), "ABOUT");
    }
}
