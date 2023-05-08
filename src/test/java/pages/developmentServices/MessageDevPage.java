package pages.developmentServices;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;


public class MessageDevPage extends BasePage {
    public MessageDevPage() {
        super();
    }

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[3]/div[1]/div/a[3]/div")
    public WebElement messageSection;
    @FindBy(how = How.CSS, using = "/html/body/div[2]/div/div[2]/div/div/section[1]/section[1]/section[1]/div")
    public WebElement validateMessage;
    @FindBy(how = How.CSS, using = "#chat-message")
    public WebElement chatField;
    @FindBy(how = How.CSS, using = "#sendmessage-btn")
    public WebElement sendMessageBtn;

    public void messageSection() {
        try {
            fluentWait(getDriver(), messageSection);
            waitForWebElementAndClick(messageSection);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), messageSection);
            waitForWebElementAndClick(messageSection);
        }
    }

    public void sendMediaMessage() {
        try {
            Assert.assertTrue(validateMessage.isDisplayed());
            WebElement clipBtn = getDriver().findElement(By.id("files"));
            clipBtn.sendKeys(EV_RESULT_FILE_PATH);
            getWait().until(ExpectedConditions.attributeToBeNotEmpty(clipBtn, "value"));
        } catch (Exception e) {
            wait(4);
            WebElement clipBtn = getDriver().findElement(By.id("files"));
            clipBtn.sendKeys(EV_RESULT_FILE_PATH);
            getWait().until(ExpectedConditions.attributeToBeNotEmpty(clipBtn, "value"));
        }
    }

    public void sendMediaMessageAppendix() {
        try {
            fluentWait(getDriver(), chatField);
            waitForWebElementAndClick(chatField);
            chatField.clear();
            chatField.sendKeys("hi test");
            chatField.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), sendMessageBtn);
            waitForWebElementAndClick(sendMessageBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), chatField);
            waitForWebElementAndClick(chatField);
            chatField.clear();
            chatField.sendKeys("hi test");
            chatField.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), sendMessageBtn);
            waitForWebElementAndClick(sendMessageBtn);
        }
    }

    public void validateSendMessageIncludingMedia() {
        List<WebElement> msgRightDivs = getDriver().findElements(By.cssSelector(".row.msg-right"));
        // Obtener el último elemento <div> con la clase 'row msg-right'
        WebElement lastDiv = msgRightDivs.get(msgRightDivs.size() - 1);
        // Verificar si contiene un elemento <img> con un atributo 'src' válido
        WebElement imgElement = lastDiv.findElement(By.cssSelector("img[src]"));
        // Comprobar si el elemento <img> encontrado tiene un atributo 'src' no vacío
        String imgSrc = imgElement.getAttribute("src");
        Assert.assertNotNull(imgSrc);
        Assert.assertFalse(imgSrc.isEmpty());
    }

}
