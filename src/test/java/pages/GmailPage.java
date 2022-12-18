package pages;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import driver.DriverFactory;
import org.testng.Assert;

import java.util.List;

public class GmailPage extends BasePage {
    public GmailPage() {
        super();
    }

    //selectors/locators
    private @FindBy(how = How.CSS, using = "#identifierId")
    WebElement emailTxt;
    private @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    WebElement passwordTxt;
    private @FindBy(how = How.CSS, using = "#passwordNext > div > button")
    WebElement passwordNextBtn;
    private @FindBy(how = How.CSS, using = "#identifierNext > div > button")
    WebElement emailNextBtn;
    private @FindBy(xpath = "//*[@id=\"gb\"]/div[2]/div[1]/div[4]/div/a/img")
    WebElement gmailIcon;
    private @FindBy(xpath = "//a[starts-with(text(), 'Gmail')]")
    WebElement gmailBtn;


    public void SignIn() {
        sendKeys(emailTxt, DriverFactory.getEmail());
        waitForWebElementAndClick(emailNextBtn);
        sendKeys(passwordTxt, DriverFactory.getPassword());
        waitForWebElementAndClick(passwordNextBtn);
    }

    public void IncorrectPasswordLogin() {
        sendKeys(emailTxt, DriverFactory.getEmail());
        waitForWebElementAndClick(emailNextBtn);
        sendKeys(passwordTxt, generateRandomString(10));
        waitForWebElementAndClick(passwordNextBtn);
    }

    public void AccountNotFound() {
        sendKeys(emailTxt, generateRandomString(12) + "@gmail.com");
        waitForWebElementAndClick(emailNextBtn);
        sendKeys(passwordTxt, generateRandomString(10));
        waitForWebElementAndClick(passwordNextBtn);
    }

    public void IncorrectDomainLogin() {
        sendKeys(emailTxt, generateRandomString(5) + "@.com");
        waitForWebElementAndClick(emailNextBtn);
    }
    public void ValidateSuccessLogin() {
        navigateTo("https://mail.google.com/mail/u/0/#inbox");
        String url = getDriver().getCurrentUrl();
        Assert.assertEquals(url, "https://mail.google.com/mail/u/0/#inbox");
    }

    public void ValidateIncorrectLogin(String message) {
            Assert.assertEquals(findSpanByText(message).getText(), message);
    }
}
