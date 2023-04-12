package pages.production;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;

import static java.lang.Math.random;

public class InboxPage extends BasePage {

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";


    public InboxPage() {
        super();
    }

    Actions actions = new Actions(getDriver());


    @FindBy(how = How.CSS, using = "#send-message-link")
    public WebElement sendMessageBtn;

    @FindBy(how = How.CSS, using = "#message-text")
    public WebElement messageFieldInput;

    @FindBy(how = How.CSS, using = "#modal-send-message-btn")
    public WebElement sendMessagePopUpBtn;
    @FindBy(how = How.CSS, using = "#rowchat-container > section.col-12.col-lg-9")
    public WebElement chatPageDisplayed;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/section[1]/section[1]/section[2]/div[2]/label/input")
    public WebElement clipBtn;

    @FindBy(how = How.CSS, using = "#sendmessage-btn")
    public WebElement sendMessageAndMediaBtn;

    @FindBy(how = How.CSS, using = "#chat-message")
    public WebElement chatMessage;

    @FindBy(how = How.CSS, using = "/html/body/div[2]/div/div[2]/div/div/section[1]/section[1]/section[1]/div/div[3]/div[1]/div")
    public WebElement validateMessage;

    @FindBy(how = How.CSS, using = "#inbox-container")
    public WebElement validateChatBox;

    @FindBy(how = How.CSS, using = "#inbox-tab > span > span:nth-child(1)")
    public WebElement inboxTab;

    @FindBy(how = How.CSS, using = "#dashboard > div > div > div:nth-child(2) > div.card-header.pb-3.px-0 > h5 > a > span")
    public WebElement unreadBtn;

    @FindBy(how = How.CSS, using = "#openReadMessages > span")
    public WebElement readBtn;

    @FindBy(how = How.CSS, using = "#dashboard > div")
    public WebElement validateReadUnread;

    public void validateReadUnreadSector() {
        fluentWait(getDriver(), validateReadUnread);
        Assert.assertTrue(validateReadUnread.isDisplayed());
    }

    public void readButton() {
        fluentWait(getDriver(), readBtn);
        waitForWebElementAndClick(readBtn);
    }

    public void unreadButton() {
        try {
            fluentWait(getDriver(), unreadBtn);
            waitForWebElementAndClick(unreadBtn);
        }
        catch (Exception e){
            wait(4);
            fluentWait(getDriver(), unreadBtn);
            waitForWebElementAndClick(unreadBtn);
        }
    }

    public void dashboardInboxTab() {
        fluentWait(getDriver(), inboxTab);
        waitForWebElementAndClick(inboxTab);
    }

    public void validateChatMessagesBox() {
        fluentWait(getDriver(), validateChatBox);
    }

    public void validateMessageMedia() {
        fluentWait(getDriver(), validateMessage);
        Assert.assertTrue(validateMessage.isDisplayed());
    }

    public void chatMessageText() {
        fluentWait(getDriver(), chatMessage);
        chatMessage.sendKeys("Test Image");
    }

    public void sendMediaMessageButton() {
        fluentWait(getDriver(), sendMessageAndMediaBtn);

    }

    public void addAnImage() {
        fluentWait(getDriver(), clipBtn);
//        waitForWebElementAndClick(clipBtn);
        clipBtn.sendKeys(EV_RESULT_FILE_PATH);
    }

    public void chatPageValidate() {
        fluentWait(getDriver(), chatPageDisplayed);
        Assert.assertTrue(chatPageDisplayed.isDisplayed());
    }

    public void sendMessagePopUpButton() {
        fluentWait(getDriver(), sendMessagePopUpBtn);
        waitForWebElementAndClick(sendMessagePopUpBtn);
    }

    public void completeMessageText() {
        fluentWait(getDriver(), messageFieldInput);
        messageFieldInput.sendKeys("Testing Message");

        messageFieldInput.clear();
        messageFieldInput.sendKeys("Testing Message");
    }

    public void sendMessageFromListing() {
        fluentWait(getDriver(), sendMessageBtn);
        waitForWebElementAndClick(sendMessageBtn);
    }

}
