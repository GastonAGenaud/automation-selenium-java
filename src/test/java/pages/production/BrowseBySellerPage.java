package pages.production;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;


public class BrowseBySellerPage extends BasePage {

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";


    public BrowseBySellerPage() {
        super();
    }

    Actions actions = new Actions(getDriver());

    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(1) > span > label")
    public WebElement accessoriesBtn;

    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(2) > span > label")
    public WebElement bodyJewelryStuffBtn;

    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(3) > span > label")
    public WebElement braceletsStuffBtn;

    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(4) > span > label")
    public WebElement earringsBtn;

    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(5) > span > label")
    public WebElement happyBtn;

    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(6) > span > label")
    public WebElement ringsBtn;

    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(7) > span > label")
    public WebElement shoesBtn;

    @FindBy(how = How.CSS, using = "#filters-container > div:nth-child(2)")
    public WebElement validateCategories;

    @FindBy(how = How.CSS, using = "#location")
    public WebElement locationFilterTextField;

    @FindBy(how = How.CSS, using = "#filters-container > div.mb-4.location-cont.pt-3")
    public WebElement locationValidate;

    @FindBy(how = How.CSS, using = "#customfield-text-0")
    public WebElement departmentTab;

    @FindBy(how = How.CSS, using = "#customfield-text-0 > option:nth-child(2)")
    public WebElement mensOption;

    @FindBy(how = How.CSS, using = "#checkbox-1-0")
    public WebElement artDeco;

    @FindBy(how = How.CSS, using = "#customfield-text-3")
    public WebElement sizeTextInput;

    @FindBy(how = How.CSS, using = "#customfield-text-4")
    public WebElement articleLicenseTab;

    @FindBy(how = How.CSS, using = "#customfield-text-4 > option:nth-child(2)")
    public WebElement mediumOption;

    public void selectMedium(){
        fluentWait(getDriver(), mediumOption);
        waitForWebElementAndClick(mediumOption);
    }

    public void articleLicenseOption(){
        fluentWait(getDriver(), articleLicenseTab);
        waitForWebElementAndClick(articleLicenseTab);
    }

    public void sizeTextField() {
        fluentWait(getDriver(), sizeTextInput);
        sizeTextInput.sendKeys("123");
    }

    public void artDecoCheckbox() {
        fluentWait(getDriver(), artDeco);
        waitForWebElementAndClick(artDeco);
    }

    public void selectMens() {
        fluentWait(getDriver(), mensOption);
        waitForWebElementAndClick(mensOption);
    }

    public void departmentOption() {
        fluentWait(getDriver(), departmentTab);
        waitForWebElementAndClick(departmentTab);
    }

    public void locationSectorValidate() {
        fluentWait(getDriver(), locationValidate);
        Assert.assertTrue(locationValidate.isDisplayed());
    }

    public void locationTextField() {
        fluentWait(getDriver(), locationFilterTextField);
        locationFilterTextField.sendKeys("2405 Montopolis Drive, Austin, TX, USA");
        locationFilterTextField.sendKeys(Keys.ARROW_DOWN);
        locationFilterTextField.sendKeys(Keys.ENTER);
    }

    public void validateCategoriesSector() {
        fluentWait(getDriver(), validateCategories);
        Assert.assertTrue(validateCategories.isDisplayed());
    }

    public void shoesButton() {
        fluentWait(getDriver(), shoesBtn);
        waitForWebElementAndClick(shoesBtn);
    }


    public void ringsButton() {
        fluentWait(getDriver(), ringsBtn);
        waitForWebElementAndClick(ringsBtn);
    }

    public void happyButton() {
        fluentWait(getDriver(), happyBtn);
        waitForWebElementAndClick(happyBtn);
    }

    public void earringsButton() {
        fluentWait(getDriver(), earringsBtn);
        waitForWebElementAndClick(earringsBtn);
    }


    public void braceletsAndStuff() {
        fluentWait(getDriver(), braceletsStuffBtn);
        waitForWebElementAndClick(braceletsStuffBtn);
    }

    public void bodyJewelryAndStuff() {
        fluentWait(getDriver(), bodyJewelryStuffBtn);
        waitForWebElementAndClick(bodyJewelryStuffBtn);
    }

    public void accessoriesButton() {
        fluentWait(getDriver(), accessoriesBtn);
        waitForWebElementAndClick(accessoriesBtn);
    }


}