package pages.request;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class requestPage extends BasePage {


    public requestPage() {
        super();
    }

    Actions actions = new Actions(getDriver());
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
    @FindBy(how = How.CSS, using = "#wants-header-text-customize")
    public WebElement headerRequestBtn;
    @FindBy(how = How.CSS, using = "#wants-tab > span > span:nth-child(1)")
    public WebElement requestBtn;
    @FindBy(how = How.CSS, using = "#search")
    public WebElement requestSearchTextField;
    @FindBy(how = How.CSS, using = "#searchButton")
    public WebElement requestSearchBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(7) > span > label")
    public WebElement filterAccessoriesBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(8) > span > label")
    public WebElement filterArtAndCollectablesBtn;

    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(5) > span > label")
    public WebElement filterClothingBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(4) > span > label")
    public WebElement filterHomeAndLivingBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(9) > span > label")
    public WebElement filterHottestItemsBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(1) > span > label")
    public WebElement filterJewelryBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(3) > span > label")
    public WebElement filterOutdoorStuffBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(4) > span > label")
    public WebElement filterRugsBtn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(2) > span > label")
    public WebElement filterShoesBtn;

    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(6) > span > label")
    public WebElement filterSkinCareBtn;
    @FindBy(how = How.CSS, using = "#manual-min")
    public WebElement filterMinusPriceTextField;
    @FindBy(how = How.CSS, using = "#manual-max")
    public WebElement filterMorePriceTextField;
    @FindBy(how = How.CSS, using = "#location")
    public WebElement filterLocationTextField;
    @FindBy(xpath = "//button[contains(text(),'Create a Request')]")
    public WebElement browseCreateRequestBtn;

    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement categoryBtn;
    @FindBy(how = How.CSS, using = "#category-selector > option:nth-child(2)")
    public WebElement categoryAccessoriesBtn;
    @FindBy(how = How.CSS, using = "#tags > div > input[type=text]")
    public WebElement tagsTextField;
    @FindBy(xpath = "/html/body/form/div/div[7]/button")
    public WebElement nextBtn;
    @FindBy(how = How.CSS, using = "#form-create > div > div.d-flex.justify-content-end.align-items-center > button")
    public WebElement next2Btn;
    @FindBy(how = How.CSS, using = "#name")
    public WebElement requestNameTextField;
    @FindBy(xpath = "/html/body/form/div/div[4]/div/div[2]/textarea")
    public WebElement requestDescriptionTextField;
    @FindBy(how = How.CSS, using = "#from")
    public WebElement minimumBudgetTextField;
    @FindBy(how = How.CSS, using = "#to")
    public WebElement maximumBudgetTextField;
    @FindBy(how = How.CSS, using = "#end-date")
    public WebElement endDateTextField;
    @FindBy(xpath = "/html/body/form/div/div[6]/div/div[3]/label[1]/span")
    public WebElement locationCheckBoxBtn;
    @FindBy(how = How.CSS, using = "#btn-create")
    public WebElement publishRequestBtn;

    @FindBy(how = How.CSS, using = "#card-want")
    public WebElement requestDetailsSuccessPopUpBtn;
    @FindBy(how = How.CSS, using = "#clipboard-button")
    public WebElement requestCopyURLBtn;
    @FindBy(how = How.CSS, using = "#sharedFB")
    public WebElement requestFacebookShareBtn;
    @FindBy(how = How.CSS, using = "#sharedTW")
    public WebElement requestTwitterShareBtn;
    @FindBy(how = How.CSS, using = "#sharedWAPP")
    public WebElement requestWhatsappShareBtn;
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div/div[1]/div[2]/div/div/div[3]/a")
    public WebElement requestBackToHomeBtn;

    @FindBy(how = How.CSS, using = "#buyer > div > div:nth-child(3) > div.card.card-dashboard.mb-3.mb-lg-0.min-h-12 > div > div > a")
    public WebElement requestDashboardCreateARequestBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/ul/li[2]/a/span")
    public WebElement requestsCreatedByMeBtn;

    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > a.cl-primary.fz-13.mx-2.a_hover")
    public WebElement requestsEditBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > button")
    public WebElement requestsActiveMenuBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(2)")
    public WebElement requestsPauseBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(3)")
    public WebElement requestsDuplicateBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(4)")
    public WebElement requestsShareBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(5)")
    public WebElement requestsDeleteBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[2]/a")
    public WebElement requestsMatchedDetailsBtn;
    @FindBy(how = How.CSS, using = "#matched-open-items > div > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > button")
    public WebElement requestsMatchedMenuBtn;
    @FindBy(how = How.CSS, using = "#btn-apply")
    public WebElement requestsMatchedApplyBtn;
    @FindBy(how = How.CSS, using = "#matched-open-items > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(2)")
    public WebElement requestsMatchedCloseBtn;
    @FindBy(how = How.CSS, using = "#matched-open-items > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a.openMsj.dropdown-item")
    public WebElement requestsMatchedSendMessageBtn;
    @FindBy(how = How.CSS, using = "#matched-open-items > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(4)")
    public WebElement requestsMatchedShareBtn;
    @FindBy(how = How.CSS, using = "#sortby-select")
    public WebElement requestsSortByMenuBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-end.mb-3 > div.ml-auto > div > div > div > a:nth-child(1)")
    public WebElement requestsSortNewestToOldestBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-end.mb-3 > div.ml-auto > div > div > div > a:nth-child(2)")
    public WebElement requestsSortOldToNewestBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-end.mb-3 > div.ml-auto > div > div > div > a:nth-child(3)")
    public WebElement requestsSortExpiresFirstBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-end.mb-3 > div.ml-auto > div > div > div > a:nth-child(4)")
    public WebElement requestsExpiresLastBtn;
    @FindBy(how = How.CSS, using = "#matched-close > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > button")
    public WebElement closedMenuBtn;
    @FindBy(how = How.CSS, using = "#matched-close > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(1)")
    public WebElement reOpenBtn;

    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9")
    public WebElement browseRequestValidate;

    @FindBy(how = How.CSS, using = "#matched-tab > span > span:nth-child(1)")
    public WebElement matchedValidate;

    @FindBy(how = How.CSS, using = "#created-tab > span > span:nth-child(1)")
    public WebElement validateRequestMatchedPage;


    @FindBy(how = How.CSS, using = "#form-create > div > div.px-4.mb-5 > h1")
    public WebElement validateRequestDashboard;

    @FindBy(xpath = "/html/body/div[4]/div/div/div/div/div[1]/div[1]/img")
    public WebElement pageLogo;

    @FindBy(how = How.CSS, using = "#wants-tab > span > span:nth-child(1)")
    public WebElement requestFromDashboard;

    @FindBy(xpath = "//p[contains(text(), 'Add Images')]")
    public WebElement validateAddImagesTxt;

    @FindBy(xpath = "//a[contains(text(), 'See detail')]")
    public WebElement detailTextValidate;

    @FindBy(xpath = "//h3[contains(text(), 'Excellent!')]")
    public WebElement validatingExcellentTxt;

    public boolean ExcellentTxt() {
        fluentWait(getDriver(), validatingExcellentTxt);
        boolean result = validatingExcellentTxt.isDisplayed();
        return result;
    }


    public boolean validatingDetailText() {
        fluentWait(getDriver(), detailTextValidate);
        boolean result = detailTextValidate.isDisplayed();
        return result;
    }


    public boolean validatingAddImagesTxt() {
        try {
            fluentWait(getDriver(), validateAddImagesTxt);
            boolean result = validateAddImagesTxt.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), validateAddImagesTxt);
            boolean result = validateAddImagesTxt.isDisplayed();
            return result;
        }


    }

    public void goToRequestFromDashboard() {
        fluentWait(getDriver(), requestFromDashboard);
        waitForWebElementAndClick(requestFromDashboard);
    }

    public boolean logoPage() {
        boolean result = pageLogo.isDisplayed();
        return result;
    }

    //HOME PAGE
    public void setHomePage() {
        getDriver().navigate().to(url);
    }

    public void goToLoginPage() {
        getDriver().navigate().to(url + "/Account/Login");
    }

    public void goToDashboard() {
        getDriver().navigate().to(url + "/dashboard");
    }

    //LOG IN

    public void request() {
        fluentWait(getDriver(), requestBtn);
        waitForWebElementAndClick(requestBtn);
    }

    public void browseCreateRequestBtn() {
        try {
            fluentWait(getDriver(), browseCreateRequestBtn);
            waitForWebElementAndClick(browseCreateRequestBtn);
            fluentWait(getDriver(), validateRequestDashboard);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), browseCreateRequestBtn);
            waitForWebElementAndClick(browseCreateRequestBtn);
        } finally {
            fluentWait(getDriver(), validateRequestDashboard);
        }


    }

    public void headerRequest() {
        fluentWait(getDriver(), headerRequestBtn);
        waitForWebElementAndClick(headerRequestBtn);
    }


    public void requestSearch() {
        try {
            fluentWait(getDriver(), requestSearchBtn);
            waitForWebElementAndClick(requestSearchBtn);
        } catch (Exception e) {
            wait(5);
            fluentWait(getDriver(), requestSearchBtn);
            waitForWebElementAndClick(requestSearchBtn);
        }
        fluentWait(getDriver(), requestSearchBtn);
        waitForWebElementAndClick(requestSearchBtn);
    }

    public void requestSearchText() {

        try {
            fluentWait(getDriver(), requestSearchTextField);
            waitForWebElementAndClick(requestSearchTextField);
            requestSearchTextField.sendKeys("test");
            requestSearchTextField.sendKeys(Keys.ENTER);
            //  waitForWebElementAndClick(requestSearchTextField);
            // requestSearchTextField.clear();
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), requestSearchTextField);
            waitForWebElementAndClick(requestSearchTextField);
            requestSearchTextField.sendKeys("test");
            requestSearchTextField.sendKeys(Keys.ENTER);
            //  waitForWebElementAndClick(requestSearchTextField);
            //   requestSearchTextField.clear();
        }

    }

    public void filterAccessories() {
        fluentWait(getDriver(), filterAccessoriesBtn);
        waitForWebElementAndClick(filterAccessoriesBtn);
    }

    public void filterArtAndCollectables() {
        fluentWait(getDriver(), filterArtAndCollectablesBtn);
        waitForWebElementAndClick(filterArtAndCollectablesBtn);
    }


    public void filterClothing() {
        fluentWait(getDriver(), filterClothingBtn);
        waitForWebElementAndClick(filterClothingBtn);
    }

    public void filterHomeAndLiving() {
        fluentWait(getDriver(), filterHomeAndLivingBtn);
        waitForWebElementAndClick(filterHomeAndLivingBtn);
    }

    public void filterHottestItems() {
        fluentWait(getDriver(), filterHottestItemsBtn);
        waitForWebElementAndClick(filterHottestItemsBtn);
    }

    public void filterJewelry() {
        fluentWait(getDriver(), filterJewelryBtn);
        waitForWebElementAndClick(filterJewelryBtn);
    }

    public void filterOutdoorStuff() {
        fluentWait(getDriver(), filterOutdoorStuffBtn);
        waitForWebElementAndClick(filterOutdoorStuffBtn);
    }

    public void filterRugs() {
        fluentWait(getDriver(), filterRugsBtn);
        waitForWebElementAndClick(filterRugsBtn);
    }

    public void filterShoes() {
        fluentWait(getDriver(), filterShoesBtn);
        waitForWebElementAndClick(filterShoesBtn);
    }


    public void filterSkinCare() {
        fluentWait(getDriver(), filterSkinCareBtn);
        waitForWebElementAndClick(filterSkinCareBtn);
    }

    public void filterPrice() {
        fluentWait(getDriver(), filterMinusPriceTextField);
        waitForWebElementAndClick(filterMinusPriceTextField);
        filterMinusPriceTextField.clear();
        filterMinusPriceTextField.sendKeys("11");
        waitForWebElementAndClick(filterMinusPriceTextField);
        filterMorePriceTextField.clear();
        filterMorePriceTextField.sendKeys("10000");
    }

    public void filterLocation() {
        fluentWait(getDriver(), filterLocationTextField);
        waitForWebElementAndClick(filterLocationTextField);
        filterLocationTextField.sendKeys("Test");
    }

    public void categoryButton() {
        fluentWait(getDriver(), categoryBtn);
        waitForWebElementAndClick(categoryBtn);
    }

    public void categoryAccessories() {
        fluentWait(getDriver(), categoryAccessoriesBtn);
        waitForWebElementAndClick(categoryAccessoriesBtn);
    }

    public void tagsText() {
        fluentWait(getDriver(), tagsTextField);
        waitForWebElementAndClick(tagsTextField);
        tagsTextField.sendKeys("test");
    }

    public void next() {
        fluentWait(getDriver(), nextBtn);
        waitForWebElementAndClick(nextBtn);
    }

    public void next2() {
        try {
            fluentWait(getDriver(), next2Btn);
            waitForWebElementAndClick(next2Btn);
            fluentWait(getDriver(), minimumBudgetTextField);
        } catch (Exception e) {
            wait(2);
            fluentWait(getDriver(), next2Btn);
            waitForWebElementAndClick(next2Btn);
        }

    }

    public void requestName() {
        fluentWait(getDriver(), requestNameTextField);
        waitForWebElementAndClick(requestNameTextField);
        requestNameTextField.sendKeys(Keys.ARROW_LEFT);
        requestNameTextField.sendKeys("test automation");
    }

    public void requestDescription() {
        try {
            fluentWait(getDriver(), requestDescriptionTextField);
            waitForWebElementAndClick(requestDescriptionTextField);
            requestDescriptionTextField.sendKeys("test automation");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), requestDescriptionTextField);
            waitForWebElementAndClick(requestDescriptionTextField);
            requestDescriptionTextField.sendKeys("test automation");

        }
        // fluentWait(getDriver(), requestDescriptionTextField);
        // waitForWebElementAndClick(requestDescriptionTextField);
        // requestDescriptionTextField.sendKeys("test automation");
    }

    public void minimumBudget() {
        fluentWaitStrict(getDriver(), minimumBudgetTextField);
        waitForWebElementAndClick(minimumBudgetTextField);
        minimumBudgetTextField.sendKeys("10");
        minimumBudgetTextField.clear();
        minimumBudgetTextField.sendKeys("10");
    }

    public void maximumBudget() {
        fluentWait(getDriver(), maximumBudgetTextField);
        waitForWebElementAndClick(maximumBudgetTextField);
        maximumBudgetTextField.sendKeys("1000");

    }

    public void endDate() {
        fluentWait(getDriver(), endDateTextField);
        waitForWebElementAndClick(endDateTextField);
        endDateTextField.sendKeys(Keys.ARROW_LEFT);
        endDateTextField.sendKeys(Keys.ARROW_LEFT);
        endDateTextField.sendKeys("11-2023");

    }

    public void locationCheckBox() {
        try {
            fluentWait(getDriver(), locationCheckBoxBtn);
            waitForWebElementAndClick(locationCheckBoxBtn);
            fluentWait(getDriver(), next2Btn);
            waitForWebElementAndClick(next2Btn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), locationCheckBoxBtn);
            waitForWebElementAndClick(locationCheckBoxBtn);
            fluentWait(getDriver(), next2Btn);
            waitForWebElementAndClick(next2Btn);
        }
    }

    public void addEndDate() {
        fluentWait(getDriver(), endDateTextField);
        waitForWebElementAndClick(endDateTextField);
        endDateTextField.clear();
        endDateTextField.sendKeys(Keys.ARROW_LEFT);
        endDateTextField.sendKeys("04-25-2025");
    }

    public void publishRequest() {

        try {
            fluentWait(getDriver(), publishRequestBtn);
            waitForWebElementAndClick(publishRequestBtn);
            fluentWait(getDriver(), requestCopyURLBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), publishRequestBtn);
            waitForWebElementAndClick(publishRequestBtn);
        } finally {
            fluentWaitStrict(getDriver(), requestCopyURLBtn);
        }
    }

    public void requestDetailsSuccessPopUp() {
        fluentWait(getDriver(), requestDetailsSuccessPopUpBtn);
        waitForWebElementAndClick(requestDetailsSuccessPopUpBtn);
    }


    public void requestCopyURL() {
        String window = getDriver().getWindowHandle();

        try {
            fluentWait(getDriver(), requestCopyURLBtn);
            waitForWebElementAndClick(requestCopyURLBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), requestCopyURLBtn);
            waitForWebElementAndClick(requestCopyURLBtn);
        }
        getDriver().switchTo().window(window);

    }

    public void requestFacebookShare() {
        String window = getDriver().getWindowHandle();

        fluentWait(getDriver(), requestFacebookShareBtn);
        waitForWebElementAndClick(requestFacebookShareBtn);

        getDriver().switchTo().window(window);

    }

    public void requestTwitterShare() {
        String window = getDriver().getWindowHandle();
        fluentWait(getDriver(), requestTwitterShareBtn);
        waitForWebElementAndClick(requestTwitterShareBtn);
        getDriver().switchTo().window(window);
    }

    public void requestWhatsappShare() {
        String window = getDriver().getWindowHandle();
        fluentWait(getDriver(), requestWhatsappShareBtn);
        waitForWebElementAndClick(requestWhatsappShareBtn);
        getDriver().switchTo().window(window);
    }

    public void requestBackToHomeButton() {
        fluentWait(getDriver(), requestBackToHomeBtn);
        waitForWebElementAndClick(requestBackToHomeBtn);
        fluentWait(getDriver(), requestBackToHomeBtn);
    }

    public void requestDashboardCreateARequest() {
        fluentWait(getDriver(), requestDashboardCreateARequestBtn);
        waitForWebElementAndClick(requestDashboardCreateARequestBtn);
    }

    public void goToOrders() {
        getDriver().navigate().to(url + "/want");
    }

    public void requestsCreatedByMeButton() {
        getDriver().navigate().refresh();
        fluentWait(getDriver(), requestsCreatedByMeBtn);
        waitForWebElementAndClick(requestsCreatedByMeBtn);
        getDriver().navigate().refresh();
        fluentWait(getDriver(), requestsCreatedByMeBtn);
        waitForWebElementAndClick(requestsCreatedByMeBtn);
    }


    public void requestsEdit() {
        fluentWaitStrict(getDriver(), requestsEditBtn);
        waitForWebElementAndClick(requestsEditBtn);
        getDriver().navigate().refresh();
        fluentWait(getDriver(), requestsCreatedByMeBtn);
        waitForWebElementAndClick(requestsCreatedByMeBtn);
        fluentWaitStrict(getDriver(), requestsEditBtn);
        waitForWebElementAndClick(requestsEditBtn);
    }

    public void requestsActiveMenu() {
        getDriver().navigate().refresh();
        fluentWait(getDriver(), requestsCreatedByMeBtn);
        waitForWebElementAndClick(requestsCreatedByMeBtn);
        fluentWait(getDriver(), requestsActiveMenuBtn);
        waitForWebElementAndClick(requestsActiveMenuBtn);
    }

    public void requestsPause() {
        getDriver().navigate().refresh();
        fluentWait(getDriver(), requestsCreatedByMeBtn);
        waitForWebElementAndClick(requestsCreatedByMeBtn);
        fluentWait(getDriver(), requestsPauseBtn);
        waitForWebElementAndClick(requestsPauseBtn);
    }


    public void requestsDuplicate() {
        getDriver().navigate().refresh();
        fluentWait(getDriver(), requestsCreatedByMeBtn);
        waitForWebElementAndClick(requestsCreatedByMeBtn);
        fluentWait(getDriver(), requestsDuplicateBtn);
        waitForWebElementAndClick(requestsDuplicateBtn);
    }

    public void requestsShare() {
        getDriver().navigate().refresh();
        fluentWait(getDriver(), requestsCreatedByMeBtn);
        waitForWebElementAndClick(requestsCreatedByMeBtn);
        fluentWait(getDriver(), requestsShareBtn);
        waitForWebElementAndClick(requestsShareBtn);
    }

    public void requestsDelete() {
        getDriver().navigate().refresh();
        fluentWait(getDriver(), requestsCreatedByMeBtn);
        waitForWebElementAndClick(requestsCreatedByMeBtn);
        fluentWait(getDriver(), requestsDeleteBtn);
        waitForWebElementAndClick(requestsDeleteBtn);
    }

    public void matchedDetails() {
        getDriver().navigate().refresh();
//        fluentWait(getDriver(), requestsCreatedByMeBtn);
//        waitForWebElementAndClick(requestsCreatedByMeBtn);

        try {
            fluentWaitStrict(getDriver(), requestsMatchedDetailsBtn);
            actions.moveToElement(requestsMatchedDetailsBtn);
            waitForWebElementAndClick(requestsMatchedDetailsBtn);
        } catch (Exception e) {
            wait(3);
            fluentWaitStrict(getDriver(), requestsMatchedDetailsBtn);
            actions.moveToElement(requestsMatchedDetailsBtn);
            waitForWebElementAndClick(requestsMatchedDetailsBtn);
        }

    }

    public void requestsMatchedMenu() {
        try {
            getDriver().navigate().refresh();
            fluentWaitStrict(getDriver(), requestsMatchedMenuBtn);
            waitForWebElementAndClick(requestsMatchedMenuBtn);
        } catch (Exception e) {
            wait(3);
            getDriver().navigate().refresh();
            fluentWaitStrict(getDriver(), requestsMatchedMenuBtn);
            waitForWebElementAndClick(requestsMatchedMenuBtn);
        }
//        fluentWait(getDriver(), requestsCreatedByMeBtn);
//        waitForWebElementAndClick(requestsCreatedByMeBtn);

    }

    public void requestsMatchedApply() {
        getDriver().navigate().refresh();
//        fluentWait(getDriver(), requestsCreatedByMeBtn);
//        waitForWebElementAndClick(requestsCreatedByMeBtn);

        fluentWaitStrict(getDriver(), requestsMatchedDetailsBtn);
        waitForWebElementAndClick(requestsMatchedDetailsBtn);

        fluentWait(getDriver(), requestsMatchedApplyBtn);
        waitForWebElementAndClick(requestsMatchedApplyBtn);
    }

    public void requestsMatchedClose() {
        getDriver().navigate().refresh();
        try {
            //fluentWait(getDriver(), requestsCreatedByMeBtn);
            //waitForWebElementAndClick(requestsCreatedByMeBtn);

            fluentWaitStrict(getDriver(), requestsMatchedMenuBtn);
            waitForWebElementAndClick(requestsMatchedMenuBtn);
//        retryingFindClick(requestsMatchedMenuBtn);

            fluentWait(getDriver(), requestsMatchedCloseBtn);
            waitForWebElementAndClick(requestsMatchedCloseBtn);
        } catch (Exception e) {
            wait(3);
            //fluentWait(getDriver(), requestsCreatedByMeBtn);

            //waitForWebElementAndClick(requestsCreatedByMeBtn);

            fluentWaitStrict(getDriver(), requestsMatchedMenuBtn);
            waitForWebElementAndClick(requestsMatchedMenuBtn);
//        retryingFindClick(requestsMatchedMenuBtn);

            fluentWait(getDriver(), requestsMatchedCloseBtn);
            waitForWebElementAndClick(requestsMatchedCloseBtn);
        }


    }

    public void closedMenu() {
        getDriver().navigate().refresh();
        fluentWait(getDriver(), requestsCreatedByMeBtn);
        waitForWebElementAndClick(requestsCreatedByMeBtn);
        fluentWait(getDriver(), closedMenuBtn);
        waitForWebElementAndClick(closedMenuBtn);
    }

    public void reOpen() {
        getDriver().navigate().refresh();
        fluentWait(getDriver(), requestsCreatedByMeBtn);
        waitForWebElementAndClick(requestsCreatedByMeBtn);
        fluentWait(getDriver(), reOpenBtn);
        waitForWebElementAndClick(reOpenBtn);
    }

    public void requestsMatchedSendMessage() {
        fluentWait(getDriver(), requestsMatchedSendMessageBtn);
        waitForWebElementAndClick(requestsMatchedSendMessageBtn);
    }

    public void requestsMatchedShare() {
        fluentWait(getDriver(), requestsMatchedShareBtn);
        waitForWebElementAndClick(requestsMatchedShareBtn);
    }

    public void sortByDropdown() {
        fluentWaitStrict(getDriver(), requestsSortByMenuBtn);
        actions.moveToElement(requestsSortByMenuBtn).perform();
    }

    public void sortNewestToOldest() {
        sortByDropdown();
        fluentWait(getDriver(), requestsSortNewestToOldestBtn);
        waitForWebElementAndClick(requestsSortNewestToOldestBtn);
    }

    public void sortOldToNewest() {
        sortByDropdown();
        fluentWaitStrict(getDriver(), requestsSortOldToNewestBtn);
        waitForWebElementAndClick(requestsSortOldToNewestBtn);
    }

    public void sortExpiresFirst() {
        sortByDropdown();
        fluentWait(getDriver(), requestsSortExpiresFirstBtn);
        waitForWebElementAndClick(requestsSortExpiresFirstBtn);
    }

    public void sortExpiresLast() {
        sortByDropdown();
        fluentWait(getDriver(), requestsExpiresLastBtn);
        waitForWebElementAndClick(requestsExpiresLastBtn);
    }

    public boolean browseRequestPage() {
        boolean result = browseRequestValidate.isDisplayed();
        return result;

    }

    public boolean matchedValidate() {
        boolean result = matchedValidate.isDisplayed();
        return result;

    }

    public boolean validateRequestMatchedPage() {
        boolean result = validateRequestMatchedPage.isDisplayed();
        return result;

    }


    public String validateCreateRequestDashboard() {
        fluentWait(getDriver(), validateRequestDashboard);
        String result = validateRequestDashboard.getText();
        return result;
    }

    public String validateCreateRequestBrowse() {
        try {
            String result = validateRequestDashboard.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            String result = validateRequestDashboard.getText();
            return result;
        }

    }
}