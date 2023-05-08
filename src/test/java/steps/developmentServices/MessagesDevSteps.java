package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.MessageDevPage;

import java.io.IOException;

public class MessagesDevSteps extends BasePage {
    private MessageDevPage _page;

    public MessagesDevSteps() {

        this._page = new MessageDevPage();
    }

    @When("go to the message section")
    public void goToTheMessageSection() {
        _page.messageSection();
    }

    @And("I send message")
    public void iSendMessage() {
        _page.sendMediaMessage();
        //_page.cropButton();
        _page.sendMediaMessageAppendix();
    }

    @Then("valid that send messages")
    public void validThatSendMessages() {
        _page.validateSendMessageIncludingMedia();
    }
}
