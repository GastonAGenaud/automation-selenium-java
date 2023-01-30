package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

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
    private @FindBy(xpath = "//a[@title='Gmail']")
    WebElement gmailBtn;


    public void SignIn() {
        sendKeys(emailTxt, email);
        waitForWebElementAndClick(emailNextBtn);
        sendKeys(passwordTxt, password);
        waitForWebElementAndClick(passwordNextBtn);
    }


    public void IncorrectPasswordLogin() {
        sendKeys(emailTxt, email);
        waitForWebElementAndClick(emailNextBtn);
        sendKeys(passwordTxt, generateRandomString(10));
        waitForWebElementAndClick(passwordNextBtn);
    }

    public void AccountNotFound() {
        sendKeys(emailTxt, generateRandomString(12) + "@gmail.com");
        waitForWebElementAndClick(emailNextBtn);
    }

    public void IncorrectDomainLogin() {
        sendKeys(emailTxt, generateRandomString(5) + "@.com");
        waitForWebElementAndClick(emailNextBtn);
    }

    public void ValidateSuccessLogin() {
        String expectedUrl = "https://mail.google.com/mail/u/0/#inbox";
        String actualUrl = getDriver().getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Se ha redirigido correctamente al inbox de Gmail");
        } else {
            System.out.println("No se ha redirigido al inbox de Gmail");
        }
    }

    public void ValidateIncorrectLogin(String message) {
        wait(10);
        Assert.assertEquals(findSpanByText(message).getText(), message);
    }
}
