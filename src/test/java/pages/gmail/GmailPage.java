package pages.gmail;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.base.BasePage;
import static driver.DriverFactory.getDriver;

public class GmailPage extends BasePage {
    private WebDriver driver = getDriver();

    //selectors/locators
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement loginBtn;


    public void getGoogleLoginPage() {

    }

}
