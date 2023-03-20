package pages.inbox;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;


public class OHEInboxPage extends BasePage {

    public OHEInboxPage() {
        super();
    }

    Actions action = new Actions(getDriver());



    //LOGIN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    @FindBy(how = How.CSS, using = "#inbox-tab")
    public WebElement inboxTab;

    @FindBy(how = How.CSS, using = "#readed-holder > div:nth-child(1)")
    public WebElement selectChat;

    @FindBy(how = How.CSS, using = "#chat-message")
    public WebElement chatMessageBox;

    @FindBy(how = How.CSS, using = "#sendmessage-btn")
    public WebElement sendMessageBtn;

    @FindBy(how = How.CSS, using = "#rowchat-container > section.d-none.d-lg-block.col-lg-3 > div > span")
    public WebElement aboutTxt;

    @FindBy(how = How.CSS, using = "#inbox-search")
    public WebElement chatSearch;


    public void setChatSearch() {
        chatSearch.sendKeys("matias");
    }

    public String aboutText() {
        fluentWait(getDriver(), aboutTxt);
        String result = aboutTxt.getText();
        return result;
    }

    public void sendMessageButton() {
        fluentWait(getDriver(), sendMessageBtn);
        waitForWebElementAndClick(sendMessageBtn);
    }

    public void setChatMessageBox() {
        fluentWait(getDriver(), chatMessageBox);
        chatMessageBox.sendKeys("Testing");
    }

    public void setInboxTab() {
        fluentWait(getDriver(), inboxTab);
        waitForWebElementAndClick(inboxTab);
    }

    public void setSelectChat() {
        fluentWait(getDriver(), selectChat);
        waitForWebElementAndClick(selectChat);
    }


}
