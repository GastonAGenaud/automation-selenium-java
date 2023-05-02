package pages.development;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import pages.BasePage;
import java.util.List;

import java.time.Duration;

public class InboxPage extends BasePage {

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/listing.jpeg";


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
    @FindBy(how = How.CSS, using = "#rowchat-container > section.col-12.col-lg-9 > section.input-section.screen-sendMessage.bg-white > div.d-flex.align-items-center > label > img")
    public WebElement clipBtn;

    @FindBy(how = How.CSS, using = "#sendmessage-btn")
    public WebElement sendMessageAndMediaBtn;

    @FindBy(how = How.CSS, using = "#chat-message")
    public WebElement chatMessage;

    @FindBy(how = How.CSS, using = "/html/body/div[2]/div/div[2]/div/div/section[1]/section[1]/section[1]/div")
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

    @FindBy(xpath = "//img[contains(@src, 'https://rebornstorage.blob.core.windows.net/uploads/e8d4af01-cd28-4b02-aa70-c7c1802a6586original-listing.jpeg')]")
    public WebElement validateImage;

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
        } catch (Exception e) {
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
        List<WebElement> msgRightDivs = getDriver().findElements(By.cssSelector(".row.msg-right"));
        fluentWait(getDriver(),validateChatBox);
        Assert.assertTrue(validateChatBox.isDisplayed());
        // Obtener el último elemento <div> con la clase 'row msg-right'
        WebElement lastDiv = msgRightDivs.get(msgRightDivs.size() - 1);
        fluentWait(getDriver(), lastDiv);
        // Verificar si contiene un elemento <img> con un atributo 'src' válido
        WebElement imgElement = lastDiv.findElement(By.cssSelector("img[src]"));
        // Comprobar si el elemento <img> encontrado tiene un atributo 'src' no vacío
        String imgSrc = imgElement.getAttribute("src");
        Assert.assertNotNull(imgSrc);
        Assert.assertFalse(imgSrc.isEmpty());
    }

    public void chatMessageText() {
        fluentWaitStrict(getDriver(), chatMessage);
        chatMessage.sendKeys("Test Image AGAIN");
    }

    public void sendMediaMessageButton() {
        fluentWait(getDriver(), sendMessageAndMediaBtn);
        waitForWebElementAndClick(sendMessageAndMediaBtn);
    }

    public void addAnImage(){
        try {
            Assert.assertTrue(validateMessage.isDisplayed());
            WebElement clipBtn = getDriver().findElement(By.id("files"));
            clipBtn.sendKeys(EV_RESULT_FILE_PATH);
            getWait().until(ExpectedConditions.attributeToBeNotEmpty(clipBtn, "value"));
        }
        catch (Exception e){
            wait(4);
            WebElement clipBtn = getDriver().findElement(By.id("files"));
            clipBtn.sendKeys(EV_RESULT_FILE_PATH);
            getWait().until(ExpectedConditions.attributeToBeNotEmpty(clipBtn, "value"));
        }
    }

    public void uploadImage(String filePath) {
        Wait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"rowchat-container\"]/section[1]/section[2]/div[2]/label/img")));
        input.sendKeys(filePath);
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

        messageFieldInput.isDisplayed();
    }

    public void sendMessageFromListing() {
        fluentWait(getDriver(), sendMessageBtn);
        waitForWebElementAndClick(sendMessageBtn);
    }

}
