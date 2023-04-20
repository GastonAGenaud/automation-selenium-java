package pages.production;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import pages.BasePage;

public class SearchPage extends BasePage {


    public SearchPage() {
        super();
    }

    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());

    ////////LOGIN//////////////
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    ////////SEARCH//////////////

    @FindBy(how = How.CSS, using = "body > header > nav > div > a > img")
    public WebElement homeBtn;

    @FindBy(how = How.CSS, using = "#searchCarousel")
    public WebElement searchHomeInput;

    @FindBy(how = How.CSS, using = "#nav-buy-carousel > div > div.d-flex.align-items-center.justify-content-between.mb-4 > button")
    public WebElement searchUpdateBtn;

    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5")
    public WebElement validateSearch;

    @FindBy(how = How.CSS, using = "#search")
    public WebElement searchBrowseInput;

    @FindBy(how = How.CSS, using = "#search-button")
    public WebElement searchBtn;

    @FindBy(how = How.CSS, using = "#browse-header-text-customize")
    public WebElement browseListingBtn;

    public void browseListingButton(){
        fluentWait(getDriver(), browseListingBtn);
        waitForWebElementAndClick(browseListingBtn);
    }

    public void searchButtonBrowse(){
        fluentWait(getDriver(), searchBtn);
        waitForWebElementAndClick(searchBtn);
    }


    public void searchBrowseTxt(){
        fluentWait(getDriver(), searchBrowseInput);
        searchBrowseInput.sendKeys("test");
    }


    public void validSearching(){
        fluentWait(getDriver(), validateSearch);
        Assert.assertTrue(validateSearch.isDisplayed());
    }

    public void UpdateButton(){
        fluentWait(getDriver(), searchUpdateBtn);
        waitForWebElementAndClick(searchUpdateBtn);
    }

    public void searchHomeTxt(){
        fluentWait(getDriver(), searchHomeInput);
        searchHomeInput.sendKeys("test");
    }


    public void homeButton(){
        fluentWait(getDriver(), homeBtn);
    }
}