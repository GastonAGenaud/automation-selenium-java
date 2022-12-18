package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EbayPage extends BasePage {
    public EbayPage() {
        super();
    }

    //selectors/locators
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement loginBtn;
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement searchBar;
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement searchBtn;

}
