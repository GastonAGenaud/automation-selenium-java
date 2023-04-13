package pages.production;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;
//

import java.security.Key;

import static java.lang.Math.min;
import static java.lang.Math.random;

public class BrowseListingPage extends BasePage {

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";


    public BrowseListingPage() {
        super();
    }

    Actions actions = new Actions(getDriver());


    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(1) > span > label")
    public WebElement accessoriesFilterBtn;

    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(2) > span > label")
    public WebElement bodyJewelryStuffBtn;

    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(3) > span > label")
    public WebElement braceletsStuffBtn;

    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(4) > span > label")
    public WebElement earringsBtn;

    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(5) > span > label")
    public WebElement happyFilterBtn;

    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(6) > span > label")
    public WebElement ringsBtn;

    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(7) > span > label")
    public WebElement shoesBtn;

    @FindBy(how = How.CSS, using = "#location")
    public WebElement locationInput;

    @FindBy(how = How.CSS, using = "#manual-min")
    public WebElement minPriceInput;

    @FindBy(how = How.CSS, using = "#manual-max")
    public WebElement maxPriceInput;

    @FindBy(how = How.CSS, using = "#set-up-manually-btn")
    public WebElement applyFilter;

    @FindBy(how = How.CSS, using = "#filters-container > div:nth-child(5)")
    public WebElement validatePriceFilter;

    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(1) > label > span")
    public WebElement darkGreenColorBtn;

    @FindBy(how = How.CSS, using = "#colors-container")
    public WebElement validateColorsSector;

    @FindBy(how = How.CSS, using = "#filters-container > div.mb-4.location-cont.pt-3")
    public WebElement validateLocation;

    @FindBy(how = How.CSS, using = "#filters-container")
    public WebElement validateCategories;

    public void validateCategorySector() {
        fluentWait(getDriver(), validateCategories);
        Assert.assertTrue(validateCategories.isDisplayed());
    }

    public void validateLocationSector() {
        fluentWait(getDriver(), validateLocation);
        Assert.assertTrue(validateLocation.isDisplayed());
    }

    public void validateColor() {
        fluentWait(getDriver(), validateColorsSector);
        waitForWebElementAndClick(validateColorsSector);
    }

    public void darkGreenColorButton() {
        fluentWait(getDriver(), darkGreenColorBtn);
        waitForWebElementAndClick(darkGreenColorBtn);
    }

    public void validatePrice() {
        fluentWait(getDriver(), validatePriceFilter);
        Assert.assertTrue(validatePriceFilter.isDisplayed());
    }

    public void applyFilterButton() {
        fluentWait(getDriver(), applyFilter);
        waitForWebElementAndClick(applyFilter);
    }

    public void maxPriceText() {
        fluentWait(getDriver(), maxPriceInput);
        maxPriceInput.sendKeys("1000");
    }

    public void minPriceText() {
        fluentWait(getDriver(), minPriceInput);
        minPriceInput.sendKeys("1");
    }

    public void locationTxt() {
        fluentWait(getDriver(), locationInput);
        locationInput.sendKeys("2405 Montopolis Drive, Austin, TX, USA");
        locationInput.sendKeys(Keys.ARROW_DOWN);
        locationInput.sendKeys(Keys.ENTER);
    }

    public void shoesButton() {
        fluentWait(getDriver(), shoesBtn);
        waitForWebElementAndClick(shoesBtn);
    }

    public void ringsButton() {
        fluentWait(getDriver(), ringsBtn);
        waitForWebElementAndClick(ringsBtn);
    }

    public void happyFilterButton() {
        fluentWait(getDriver(), happyFilterBtn);
        waitForWebElementAndClick(happyFilterBtn);
    }

    public void earringsButton() {
        fluentWait(getDriver(), earringsBtn);
        waitForWebElementAndClick(earringsBtn);
    }

    public void braceletsAndStuffButton() {
        fluentWait(getDriver(), braceletsStuffBtn);
        waitForWebElementAndClick(braceletsStuffBtn);
    }

    public void bodyJewelryAndStuffButton() {
        fluentWait(getDriver(), bodyJewelryStuffBtn);
        waitForWebElementAndClick(bodyJewelryStuffBtn);
    }

    public void accessoriesFilterButton() {
        fluentWait(getDriver(), accessoriesFilterBtn);
        waitForWebElementAndClick(accessoriesFilterBtn);
    }

}
