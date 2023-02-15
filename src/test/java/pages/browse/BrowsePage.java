package pages.browse;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;


public class BrowsePage extends BasePage {

    public BrowsePage() {
        super();
    }

    Actions action = new Actions(getDriver());
    String rdm = Long.toString(System.currentTimeMillis());

    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement pricingBtn;
    //LOG IN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    //Browse
    @FindBy(how = How.CSS, using = "#browse-header-text-customize")
    public WebElement headerBrowseBtn;
    @FindBy(how = How.CSS, using = "#search")
    public WebElement browseSearchTextField;
    @FindBy(xpath = "//span[contains(text(), 'Clear Filters')]")
    public WebElement browseClearFilters;
    @FindBy(how = How.CSS, using = "#block-tab")
    public WebElement browseViewBlockFormBtn;
    @FindBy(how = How.CSS, using = "#list-tab")
    public WebElement browseViewListFormBtn;
    @FindBy(how = How.CSS, using = "#map-tab")
    public WebElement browseMapBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(3) > span > label")
    public WebElement browseCategoryAccesoriesBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(3) > span > label")
    public WebElement browseCategoryHairProductsBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(4) > span > label")
    public WebElement browseCategoryHomeAndLivingBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(1) > span > label")
    public WebElement browseCategoryJewelryBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(5) > span > label")
    public WebElement browseCategoryMakeUpBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(6) > span > label")
    public WebElement browseCategoryPetAccessoriesBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(7) > span > label")
    public WebElement browseCategoryRingsBtn;
    @FindBy(xpath = "/html/body/div[4]/main/div[3]/div/div/div[1]/div[2]/div/ul/li[2]/span/label")
    public WebElement browseCategoryShoesBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(9) > span > label")
    public WebElement browseCategorySportsEquipmentBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(10) > span > label")
    public WebElement browseCategoryToysBtn;
    @FindBy(how = How.CSS, using = "#manual-min")
    public WebElement browseSetMinimalAmountTextField;
    @FindBy(how = How.CSS, using = "#manual-max")
    public WebElement browseSetMaximusAmountTextField;
    @FindBy(how = How.CSS, using = "#filters-container > div:nth-child(5) > div.mb-4.mt-3 > div > a")
    public WebElement browseAmountFilterBtn;
    @FindBy(how = How.CSS, using = "#location")
    public WebElement browseLocationFilterTextField;
    @FindBy(how = How.CSS, using = "#sortby-select")
    public WebElement browseSortByBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(1)")
    public WebElement browseSortByMostRelevantBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(2)")
    public WebElement browseSortByPriceHigherToLowerBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(3)")
    public WebElement browseSortByPriceLowerToHigherBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(4)")
    public WebElement browseSortByDateNewerToOlderBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(5)")
    public WebElement browseSortByDateOlderToNewerBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(5)")
    public WebElement browseSortByRatingHigherToLower;

    //Request
    @FindBy(how = How.CSS, using = "#wants-header-text-customize")
    public WebElement headerRequestBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.card.border-0.bg-gray.my-4 > div > a")
    public WebElement browseCreateRequestBtn;
    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement categoryBtn;
    @FindBy(how = How.CSS, using = "#category-selector > option:nth-child(2)")
    public WebElement categoryAccessoriesBtn;
    @FindBy(how = How.CSS, using = "#tags > div > input[type=text]")
    public WebElement tagsTextField;
    @FindBy(xpath = "/html/body/form/div/div[7]/button")
    public WebElement nextBtn;
    @FindBy(xpath = "/html/body/form/div/div[4]/div/div[1]/input")
    public WebElement requestNameTextField;
    @FindBy(how = How.CSS, using = "#description")
    public WebElement requestDescriptionTextField;
    @FindBy(how = How.CSS, using = "#from")
    public WebElement minimumBudgetTextField;
    @FindBy(how = How.CSS, using = "#to")
    public WebElement maximumBudgetTextField;
    @FindBy(xpath = "/html/body/form/div/div[6]/div/div[2]/label[1]/span")
    public WebElement locationCheckBoxBtn;
    @FindBy(xpath = "/html/body/form/div/div[8]/div[2]/button")
    public WebElement publishRequestBtn;
    @FindBy(how = How.CSS, using = "#img-0")
    public WebElement addImageBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > h3")
    public WebElement categoryButton;
    @FindBy(how = How.CSS, using = "#RXJyb3JZb3UlMjBtdXN0JTIwY2hvb3NlJTIwYSUyMG5hbWUucmVk")
    public WebElement closeNameError;

    public void addAnImage() {
        addImageBtn.sendKeys(EV_RESULT_FILE_PATH);
    }

    public void getCloseNameError() {
        action.moveToElement(closeNameError);
        wait(6);
    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";


    //HOME PAGE

    public void setHomePage() {
        getDriver().navigate().to(url);
    }

    public void goToHome() {
        getDriver().navigate().to(url);
    }

    public void goToLoginPage() {
        getDriver().navigate().to(url + "/Account/Login");
    }

    //LOG IN

    //Browse

    public void headerBrowse() {
        try {
            fluentWait(getDriver(), headerBrowseBtn);
            waitForWebElementAndClick(headerBrowseBtn);
        } catch (Exception e) {
            wait(4);
            fluentWait(getDriver(), headerBrowseBtn);
            waitForWebElementAndClick(headerBrowseBtn);
        }

    }

    public void headerRequest() {
        headerRequestBtn.click();
    }

    public void goToBrowseRequest() {
        getDriver().navigate().to(url + "/Want/browse");
    }

    public void validateBrowseSection() {
        boolean result = categoryButton.isDisplayed();
        Assert.assertTrue(result);
    }

    public void browseSearchTextField() {
        waitForWebElementAndClick(browseSearchTextField);
        browseSearchTextField.sendKeys("Test Automation");
        browseSearchTextField.sendKeys(Keys.ENTER);
        waitForWebElementAndClick(browseSearchTextField);
        browseSearchTextField.clear();

    }


    public void browseClearFilters() {
        fluentWait(getDriver(), browseClearFilters);
        waitForWebElementAndClick(browseClearFilters);
    }

    public void browseViewBlockFormBtn() {
        waitForWebElementAndClick(browseViewBlockFormBtn);
    }

    public void browseViewListFormBtn() {
        waitForWebElementAndClick(browseViewListFormBtn);
    }

    public void browseMapBtn() {
        waitForWebElementAndClick(browseMapBtn);
    }

    public void browseCategoryAccesoriesBtn() {
        fluentWait(getDriver(), browseCategoryAccesoriesBtn);
        waitForWebElementAndClick(browseCategoryAccesoriesBtn);
    }

    public void browseCategoryHairProductsBtn() {
        fluentWait(getDriver(), browseCategoryHairProductsBtn);
        waitForWebElementAndClick(browseCategoryHairProductsBtn);

    }

    public void browseCategoryHomeAndLivingBtn() {
        fluentWait(getDriver(), browseCategoryHomeAndLivingBtn);
        waitForWebElementAndClick(browseCategoryHomeAndLivingBtn);
    }

    public void browseCategoryJewelryBtn() {
        fluentWait(getDriver(), browseCategoryJewelryBtn);
        waitForWebElementAndClick(browseCategoryJewelryBtn);
    }

    public void browseCategoryMakeUpBtn() {
        waitForWebElementAndClick(browseCategoryMakeUpBtn);
    }

    public void browseCategoryPetAccessoriesBtn() {
        waitForWebElementAndClick(browseCategoryPetAccessoriesBtn);
    }

    public void browseCategoryRingsBtn() {
        waitForWebElementAndClick(browseCategoryRingsBtn);
    }

    public void browseCategoryShoesBtn() {
        fluentWaitStrict(getDriver(), browseCategoryShoesBtn);
        waitForWebElementAndClick(browseCategoryShoesBtn);
    }

    public void browseCategorySportsEquipmentBtn() {
        waitForWebElementAndClick(browseCategorySportsEquipmentBtn);
    }

    public void browseCategoryToysBtn() {
        waitForWebElementAndClick(browseCategoryToysBtn);
    }

    public void browseSetMinimalAmountTextField() {
        waitForWebElementAndClick(browseSetMinimalAmountTextField);
        browseSetMinimalAmountTextField.sendKeys("10");
    }

    public void browseSetMaximusAmountTextField() {
        waitForWebElementAndClick(browseSetMaximusAmountTextField);
        browseSetMaximusAmountTextField.sendKeys("1000");
    }

    public void browseAmountFilterBtn() {
        fluentWait(getDriver(), browseAmountFilterBtn);
        waitForWebElementAndClick(browseAmountFilterBtn);
    }

    public void browseLocationFilterTextField() {
        waitForWebElementAndClick(browseLocationFilterTextField);
        browseLocationFilterTextField.sendKeys("Test");
    }

    public void browseSortByBtn() {
        fluentWait(getDriver(), browseSortByBtn);
        action.moveToElement(browseSortByBtn).perform();
    }

    public void sortByMostRelevant() {
        browseSortByBtn();
        fluentWait(getDriver(), browseSortByMostRelevantBtn);
        waitForWebElementAndClick(browseSortByMostRelevantBtn);
    }

    public void sortByPriceHigherToLower() {
        browseSortByBtn();
        fluentWait(getDriver(), browseSortByPriceHigherToLowerBtn);
        waitForWebElementAndClick(browseSortByPriceHigherToLowerBtn);
    }

    public void sortByPriceLowerToHigher() {
        browseSortByBtn();
        fluentWait(getDriver(), browseSortByPriceLowerToHigherBtn);
        waitForWebElementAndClick(browseSortByPriceLowerToHigherBtn);

    }

    public void sortByDateNewerToOlder() {
        browseSortByBtn();
        fluentWait(getDriver(), browseSortByDateNewerToOlderBtn);
        waitForWebElementAndClick(browseSortByDateNewerToOlderBtn);

    }

    public void sortByDateOlderToNewer() {
        browseSortByBtn();
        fluentWait(getDriver(), browseSortByDateOlderToNewerBtn);
        waitForWebElementAndClick(browseSortByDateOlderToNewerBtn);

    }

    public void sortByRatingHigherToLower() {
        browseSortByBtn();
        fluentWait(getDriver(), browseSortByRatingHigherToLower);
        waitForWebElementAndClick(browseSortByRatingHigherToLower);
    }


    public void browseCreateRequestBtn() {
        waitForWebElementAndClick(browseCreateRequestBtn);
    }

    public void categoryButton() {
        waitForWebElementAndClick(categoryBtn);
    }

    public void categoryAccessories() {
        waitForWebElementAndClick(categoryAccessoriesBtn);
    }

    public void tagsText() {
        waitForWebElementAndClick(tagsTextField);
        tagsTextField.sendKeys("test");
    }

    public void next() {
        fluentWaitStrict(getDriver(), nextBtn);
        waitForWebElementAndClick(nextBtn);
    }

    public void requestName() {
        waitForWebElementAndClick(requestNameTextField);
        fluentWait(getDriver(), requestNameTextField);
        requestNameTextField.sendKeys("test automation");
    }

    public void requestDescription() {
        fluentWait(getDriver(), requestDescriptionTextField);
        waitForWebElementAndClick(requestDescriptionTextField);
        requestDescriptionTextField.sendKeys("test automation");
    }

    public void minimumBudget() {

        fluentWait(getDriver(), minimumBudgetTextField);
        waitForWebElementAndClick(minimumBudgetTextField);
        minimumBudgetTextField.sendKeys("10");
    }

    public void maximumBudget() {
        waitForWebElementAndClick(maximumBudgetTextField);
        maximumBudgetTextField.sendKeys("1000");
    }


    public void locationCheckBox() {
        fluentWait(getDriver(), locationCheckBoxBtn);
        waitForWebElementAndClick(locationCheckBoxBtn);
    }

    public void publishRequest() {
        fluentWait(getDriver(), publishRequestBtn);
        waitForWebElementAndClick(publishRequestBtn);

    }


}