package pages.developmentServices;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;


public class ListingDetailsDevPage extends BasePage {
    public ListingDetailsDevPage() {
        super();
    }

    @FindBy(how = How.CSS, using = "#block-tab")
    public WebElement blockFilter;
    @FindBy(how = How.CSS, using = "#list-tab")
    public WebElement listFilter;
    @FindBy(how = How.CSS, using = "#map-tab")
    public WebElement mapFilter;
    @FindBy(how = How.CSS, using = "#search")
    public WebElement searchField;
    @FindBy(how = How.CSS, using = "#search-button")
    public WebElement searchBtn;

    public void selectBlock() {
        fluentWait(getDriver(), blockFilter);
        waitForWebElementAndClick(blockFilter);
    }

    public void selectList() {
        fluentWait(getDriver(), listFilter);
        waitForWebElementAndClick(listFilter);

    }

    public void selectMap() {
        fluentWait(getDriver(), mapFilter);
        waitForWebElementAndClick(mapFilter);

    }

    public void serviceIncome() {
        fluentWait(getDriver(), searchField);
        waitForWebElementAndClick(searchField);
        searchField.sendKeys("Blouse");
    }

    public void selectSearch() {
        fluentWait(getDriver(), searchBtn);
        waitForWebElementAndClick(searchBtn);

    }
}
