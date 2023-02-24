package pages.browse;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import static java.lang.Math.random;

public class OhBrowsePage extends BasePage {


    public OhBrowsePage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());

    //LOG IN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    //Search bar
    @FindBy(how = How.CSS, using = "#search")
    public WebElement browseSearchTextField;
    @FindBy(how = How.CSS, using = "#searchButton")
    public WebElement browseSearchBtn;
    //Filters
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(1) > span > label")
    public WebElement ages12to14FilterBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(2) > span > label")
    public WebElement ages15to17FilterBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(3) > span > label")
    public WebElement ages5to8FilterBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(4) > span > label")
    public WebElement ages9to11FilterBtn;
    @FindBy(how = How.CSS, using = "#manual-min")
    public WebElement minimumPriceTextField;
    @FindBy(how = How.CSS, using = "#manual-max")
    public WebElement maximumPriceTextField;
    @FindBy(how = How.CSS, using = "#filters-container > div:nth-child(5) > div.mb-4.mt-3 > div > a")
    public WebElement priceBtn;
    @FindBy(how = How.CSS, using = "#location")
    public WebElement locationTextField;
    @FindBy(how = How.CSS, using = "#block-tab")
    public WebElement blockViewBtn;
    @FindBy(how = How.CSS, using = "#list-tab")
    public WebElement listViewBtn;
    @FindBy(how = How.CSS, using = "#map-tab")
    public WebElement mapViewBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > button")
    public WebElement sortByDropdown;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(1)")
    public WebElement sortByMostRelevantBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(2)")
    public WebElement sortByPriceHigherToLowerBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(3)")
    public WebElement sortByPriceLowerToHigherBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(4)")
    public WebElement sortByDateNewerToOlderBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(5)")
    public WebElement sortByDateOlderToNewerBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(6)")
    public WebElement ratingHigherToLowerBtn;

    @FindBy(how = How.CSS, using = "body > header > nav > div > a > img")
    public WebElement owlIcon;

    public void login() {
        waitForClickability(emailLoginInput);
        fluentWait(getDriver(), emailLoginInput);
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("dev@mymarketplacebuilder.com");

        fluentWait(getDriver(), passwordLoginInput);
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("uX$Z2Z4^Ye3z,2&A");
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
    }


    public void goToLoginPage() {
        getDriver().navigate().to(baseUrlOHE + "/Account/Login");
    }

    public void goToBrowseServices() {
        getDriver().navigate().to(baseUrlOHE + "/Listing/Browse");
    }

    public void ages12to14Category() {
        fluentWait(getDriver(), ages12to14FilterBtn);
        waitForWebElementAndClick(ages12to14FilterBtn);
    }

    public void ages15to17Category() {
        fluentWait(getDriver(), ages15to17FilterBtn);
        waitForWebElementAndClick(ages15to17FilterBtn);
    }

    public void ages9to11Category() {
        fluentWait(getDriver(), ages15to17FilterBtn);
        waitForWebElementAndClick(ages15to17FilterBtn);
    }

    public void ages5to8Category() {
        fluentWait(getDriver(), ages5to8FilterBtn);
        waitForWebElementAndClick(ages5to8FilterBtn);
    }

    public void minimumPrice() {
        fluentWait(getDriver(), minimumPriceTextField);
        waitForWebElementAndClick(minimumPriceTextField);
        minimumPriceTextField.sendKeys("10");
    }

    public void maximumPrice() {
        fluentWait(getDriver(), maximumPriceTextField);
        waitForWebElementAndClick(maximumPriceTextField);
        maximumPriceTextField.sendKeys("50");
    }

    public void selectPrice() {
        fluentWait(getDriver(), priceBtn);
        waitForWebElementAndClick(priceBtn);
    }

    public void locationField() {
        fluentWait(getDriver(), locationTextField);
        waitForWebElementAndClick(locationTextField);
        locationTextField.sendKeys("Automation test");
    }

    public void browseSearchField() {
        fluentWait(getDriver(), browseSearchTextField);
        waitForWebElementAndClick(browseSearchTextField);
        browseSearchTextField.sendKeys("test");
    }

    public void browseSearch() {
        fluentWait(getDriver(), browseSearchBtn);
        waitForWebElementAndClick(browseSearchBtn);
    }

    public void blockView() {
        fluentWait(getDriver(), blockViewBtn);
        waitForWebElementAndClick(blockViewBtn);
    }

    public void listView() {
        fluentWait(getDriver(), listViewBtn);
        waitForWebElementAndClick(listViewBtn);
    }

    public void mapView() {
        fluentWait(getDriver(), mapViewBtn);
        waitForWebElementAndClick(mapViewBtn);
    }

    public void sortBy() {
        actions.moveToElement(sortByDropdown).perform();
    }

    public void sortByMost() {
        sortBy();
        fluentWait(getDriver(), sortByMostRelevantBtn);
        waitForWebElementAndClick(sortByMostRelevantBtn);
    }

    public void sortByPriceHigher() {
        sortBy();
        fluentWait(getDriver(), sortByPriceHigherToLowerBtn);
        waitForWebElementAndClick(sortByPriceHigherToLowerBtn);
    }

    public void sortByPriceLower() {
        sortBy();
        fluentWait(getDriver(), sortByPriceLowerToHigherBtn);
        waitForWebElementAndClick(sortByPriceLowerToHigherBtn);
    }

    public void sortByDateNewer() {
        sortBy();
        fluentWait(getDriver(), sortByDateNewerToOlderBtn);
        waitForWebElementAndClick(sortByDateNewerToOlderBtn);
    }

    public void sortByDateOlder() {
        sortBy();
        fluentWait(getDriver(), sortByDateOlderToNewerBtn);
        waitForWebElementAndClick(sortByDateOlderToNewerBtn);
    }

    public void sortByRating() {
        sortBy();
        fluentWait(getDriver(), ratingHigherToLowerBtn);
        waitForWebElementAndClick(ratingHigherToLowerBtn);
    }

    public boolean owlVerify() {
        boolean result = owlIcon.isDisplayed();
        return result;
    }
}