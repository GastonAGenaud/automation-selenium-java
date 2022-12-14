package pages.ebay;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.base.BasePage;

public class EbayPage extends BasePage {


    //selectors/locators
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement loginBtn;


}
