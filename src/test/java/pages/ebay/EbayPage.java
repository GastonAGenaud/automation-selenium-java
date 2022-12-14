package pages.ebay;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EbayPage extends BasePage {

    public EbayPage(WebDriver driver) {
        super(driver);
    }
    Actions action = new Actions(driver);

    //selectors/locators
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement loginBtn;


}
