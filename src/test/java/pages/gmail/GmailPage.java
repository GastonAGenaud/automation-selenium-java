package pages.gmail;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GmailPage extends BasePage {

    public GmailPage(WebDriver driver) {
        super(driver);
    }
    //selectors/locators
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement loginBtn;

    public void setUserCredentials () {

    }

}
