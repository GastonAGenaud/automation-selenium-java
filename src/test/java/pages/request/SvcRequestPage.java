package pages.request;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.BasePage;

public class SvcRequestPage extends BasePage {


    public SvcRequestPage() {
        super();
    }


    Actions actions = new Actions(getDriver());
    String rdm = Long.toString(System.currentTimeMillis());
    @FindBy(xpath = "//button[contains(string(),'%s')]")
    public WebElement buttonWithText;
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
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(1) > span > label")
    public WebElement filterAges12to14Btn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(2) > span > label")
    public WebElement filterAges15to17Btn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(3) > span > label")
    public WebElement filterAges5to8Btn;
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(4) > span > label")
    public WebElement filterAges9to11Btn;
    @FindBy(how = How.CSS, using = "#manual-min")
    public WebElement filterMinusPriceTextField;
    @FindBy(how = How.CSS, using = "#manual-max")
    public WebElement filterMorePriceTextField;
    @FindBy(how = How.CSS, using = "#location")
    public WebElement filterLocationTextField;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.card.border-0.bg-gray.my-4 > div > a")
    public WebElement browseCreateRequestBtn;
    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement categoryBtn;
    @FindBy(how = How.CSS, using = "#category-selector > option:nth-child(2)")
    public WebElement categoryAccessoriesBtn;
    @FindBy(how = How.CSS, using = "#tags > div > input[type=text]")
    public WebElement tagsTextField;
    @FindBy(how = How.CSS, using = "#form-create > div > div.d-flex.justify-content-end.align-items-center > button")
    public WebElement nextBtn;

    @FindBy(how = How.CSS, using = "#form-create > div > div.d-flex.justify-content-end.align-items-center > button")
    public WebElement next2Btn;
    @FindBy(how = How.CSS, using = "#name")
    public WebElement requestNameTextField;
    @FindBy(how = How.CSS, using = "#description")
    public WebElement requestDescriptionTextField;
    @FindBy(how = How.CSS, using = "#img-0")
    public WebElement addImageBtn;
    @FindBy(xpath = "/html/body/form/div/div[6]/div/div[1]/div[1]/div/div/div[1]/div/input")
    public WebElement minimumBudgetTextField;
    @FindBy(xpath = "/html/body/form/div/div[6]/div/div[1]/div[1]/div/div/div[3]/div/input")
    public WebElement maximumBudgetTextField;
    @FindBy(how = How.CSS, using = "#end-date")
    public WebElement endDateTextField;
    @FindBy(xpath = "/html/body/form/div/div[6]/div/div[2]/label[1]/span")
    public WebElement locationCheckBoxBtn;
    @FindBy(xpath = "/html/body/form/div/div[8]/div[2]/button")
    public WebElement publishRequestBtn;
    @FindBy(how = How.CSS, using = "#card-want")
    public WebElement requestDetailsSuccessPopUpBtn;
    @FindBy(how = How.CSS, using = "#url-to-share")
    public WebElement requestURLBtn;
    @FindBy(how = How.CSS, using = "#clipboard-button")
    public WebElement requestCopyURLBtn;
    @FindBy(how = How.CSS, using = "#sharedFB")
    public WebElement requestFacebookShareBtn;
    @FindBy(how = How.CSS, using = "#sharedTW")
    public WebElement requestTwitterShareBtn;
    @FindBy(how = How.CSS, using = "#sharedWAPP")
    public WebElement requestWhatsappShareBtn;
    @FindBy(how = How.CSS, using = "#published > div > div > div > div > div.card-body.card-top > div.container-fluid.px-0 > div > div > div.d-flex.justify-content-center.mt-3 > a")
    public WebElement requestBackToHomeBtn;
    @FindBy(how = How.CSS, using = "#listings-container > div:nth-child(1) > div > a")
    public WebElement requestMatchItemsBtn;
    @FindBy(how = How.CSS, using = "#link-category")
    public WebElement requestSeeMoreItemsBtn;
    @FindBy(how = How.CSS, using = "#buyer > div > div:nth-child(6) > div > div > div > a")
    public WebElement requestDashboardCreateARequestBtn;
    @FindBy(how = How.CSS, using = "#add-want > a")
    public WebElement requestsCreateARequestBtn;
    @FindBy(how = How.CSS, using = "#created-tab > span > span:nth-child(1)")
    public WebElement requestsCreatedByMeBtn;
    @FindBy(how = How.CSS, using = "#active > div > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > a.seeBids.cl-primary.fz-13.a_hover.hidden-mobile")
    public WebElement requestsSeeBidsBtn;
    @FindBy(how = How.CSS, using = "#active > div > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > a.cl-primary.fz-13.mx-2.a_hover")
    public WebElement requestsEditBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > button > svg")
    public WebElement requestsActiveMenuBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(2)")
    public WebElement requestsPauseBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(3)")
    public WebElement requestsDuplicateBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(4)")
    public WebElement requestsShareBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(5)")
    public WebElement requestsDeleteBtn;
    @FindBy(how = How.CSS, using = "#expired-or-paused > div > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(2)")
    public WebElement requestsActivateBtn;
    @FindBy(how = How.CSS, using = "#matched-open-items > div > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > a")
    public WebElement requestsMatchedDetailsBtn;
    @FindBy(how = How.CSS, using = "#matched-open-items > div > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > button")
    public WebElement requestsMatchedMenuBtn;
    @FindBy(how = How.CSS, using = "#matched-open-items > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > div.d-flex.flex-row.align-items-center > div.d-flex.align-items-center.ml-auto.justify-content-end > div > div > a:nth-child(1)")
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

    @FindBy(how = How.CSS, using = "#wants-header-text-customize")
    public WebElement browseRequestValidate;

    @FindBy(how = How.CSS, using = "#matched-tab > span > span:nth-child(1)")
    public WebElement matchedValidate;

    @FindBy(how = How.CSS, using = "#created-tab > span > span:nth-child(1)")
    public WebElement validateRequestMatchedPage;

    @FindBy(how = How.CSS, using = "#published > div > div > div > div > div.card-body.card-top > div.text-center > h3")
    public WebElement validateRequestPopUp;

    @FindBy(how = How.CSS, using = "#form-create > div > div.px-4.mb-5 > h1")
    public WebElement validateRequestDashboard;

    @FindBy(how = How.CSS, using = "body > header > nav > div > a > img")
    public WebElement pageLogo;

    @FindBy(xpath = "//span[contains(text(), 'No accepted requests yet.')]")
    public WebElement noAcceptRequestsYetText;

    public boolean noAcceptedText() {
        fluentWaitStrict(getDriver(), noAcceptRequestsYetText);
        boolean result = noAcceptRequestsYetText.isDisplayed();
        return result;
    }

    public void filterAges12to14() {
        fluentWait(getDriver(), filterAges12to14Btn);
        waitForWebElementAndClick(filterAges12to14Btn);
    }

    public void filterAges15to17() {
        fluentWait(getDriver(), filterAges15to17Btn);
        waitForWebElementAndClick(filterAges15to17Btn);
    }

    public void filterAges5to8() {
        fluentWait(getDriver(), filterAges5to8Btn);
        waitForWebElementAndClick(filterAges5to8Btn);
    }

    public void filterAges9to11() {
        fluentWait(getDriver(), filterAges9to11Btn);
        waitForWebElementAndClick(filterAges9to11Btn);
    }

    public boolean logoPage() {
        fluentWait(getDriver(), pageLogo);
        boolean result = pageLogo.isDisplayed();
        return result;
    }

    //HOME PAGE
    public void goToOwlPage() {
        getDriver().navigate().to(baseUrlOHE);
    }

    public void goToLoginPage() {
        getDriver().navigate().to(baseUrlOHE + "/Account/Login");
    }

    public void goToDashboard() {
        getDriver().navigate().to(baseUrlOHE + "/dashboard");
    }

    //LOG IN

    public void request() {
        waitForVisibility(requestBtn);
        waitForClickability(requestBtn);
        fluentWait(getDriver(), requestBtn);
        waitForWebElementAndClick(requestBtn);
    }

    public void browseCreateRequestBtn() {
        fluentWait(getDriver(), browseCreateRequestBtn);
        waitForWebElementAndClick(browseCreateRequestBtn);

    }

    public void headerRequest() {
        fluentWait(getDriver(), headerRequestBtn);
        waitForWebElementAndClick(headerRequestBtn);
    }


    public void requestSearch() {
        fluentWait(getDriver(), requestSearchBtn);
        waitForWebElementAndClick(requestSearchBtn);
    }

    public void requestSearchText() {
        fluentWait(getDriver(), requestSearchTextField);
        waitForWebElementAndClick(requestSearchTextField);
        requestSearchTextField.sendKeys("test");
        fluentWait(getDriver(), requestSearchTextField);
        waitForWebElementAndClick(requestSearchTextField);
    }

    public void filterPrice() {
        fluentWait(getDriver(), filterMinusPriceTextField);
        waitForWebElementAndClick(filterMinusPriceTextField);
        filterMinusPriceTextField.clear();
        filterMinusPriceTextField.sendKeys("11");
        fluentWait(getDriver(), filterMorePriceTextField);
        waitForWebElementAndClick(filterMorePriceTextField);
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
        waitForVisibility(nextBtn);
        waitForClickability(nextBtn);
        fluentWait(getDriver(), nextBtn);
        waitForWebElementAndClick(nextBtn);
    }

    public void next2() {
        fluentWait(getDriver(), next2Btn);
        waitForWebElementAndClick(next2Btn);
    }

    public void requestName() {
        fluentWait(getDriver(), requestNameTextField);
        requestNameTextField.sendKeys(Keys.ARROW_LEFT);
        requestNameTextField.sendKeys("test automation");
    }

    public void requestDescription() {
        fluentWait(getDriver(), requestDescriptionTextField);
        waitForWebElementAndClick(requestDescriptionTextField);
        requestDescriptionTextField.sendKeys("test automation");
    }

    public void addImage() {
        fluentWait(getDriver(), addImageBtn);
        waitForWebElementAndClick(addImageBtn);
        addImageBtn.sendKeys();
    }

    public void minimumBudget() {
        fluentWait(getDriver(), minimumBudgetTextField);
        waitForWebElementAndClick(minimumBudgetTextField);
        minimumBudgetTextField.sendKeys(Keys.ARROW_LEFT);
        minimumBudgetTextField.sendKeys("10");
    }

    public void maximumBudget() {
        fluentWait(getDriver(), maximumBudgetTextField);
        waitForWebElementAndClick(maximumBudgetTextField);
        maximumBudgetTextField.sendKeys(Keys.ARROW_LEFT);
        maximumBudgetTextField.sendKeys("1000");
    }

    public void endDate() {
        fluentWait(getDriver(), maximumBudgetTextField);
        waitForWebElementAndClick(maximumBudgetTextField);
        endDateTextField.sendKeys(Keys.ARROW_LEFT);
        endDateTextField.sendKeys(Keys.ARROW_LEFT);
        endDateTextField.sendKeys("11112023");
    }

    public void locationCheckBox() {
        fluentWait(getDriver(), locationCheckBoxBtn);
        waitForWebElementAndClick(locationCheckBoxBtn);
    }

    public void publishRequest() {
        try {
            fluentWait(getDriver(), publishRequestBtn);
            waitForWebElementAndClick(publishRequestBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), publishRequestBtn);
            waitForWebElementAndClick(publishRequestBtn);
        }
    }

    public void requestDetailsSuccessPopUp() {
        try {
            fluentWait(getDriver(), requestDetailsSuccessPopUpBtn);
            waitForWebElementAndClick(requestDetailsSuccessPopUpBtn);
        } catch (Exception e) {

        }
    }

    public void requestURL() {
        fluentWait(getDriver(), requestURLBtn);
        waitForWebElementAndClick(requestURLBtn);
    }

    public void requestCopyURL() {
        fluentWait(getDriver(), requestCopyURLBtn);
        waitForWebElementAndClick(requestCopyURLBtn);
    }

    public void requestFacebookShare() {
        fluentWait(getDriver(), requestFacebookShareBtn);
        waitForWebElementAndClick(requestFacebookShareBtn);
    }

    public void requestTwitterShare() {
        fluentWait(getDriver(), requestTwitterShareBtn);
        waitForWebElementAndClick(requestTwitterShareBtn);
    }

    public void requestWhatsappShare() {
        fluentWait(getDriver(), requestWhatsappShareBtn);
        waitForWebElementAndClick(requestWhatsappShareBtn);
    }

    public void requestBackToHomeButton() {
        fluentWait(getDriver(), requestBackToHomeBtn);
        waitForWebElementAndClick(requestBackToHomeBtn);
    }

    public void requestMatchedItems() {
        fluentWait(getDriver(), requestMatchItemsBtn);
        waitForWebElementAndClick(requestMatchItemsBtn);
    }

    public void requestSeeMoreItems() {
        fluentWait(getDriver(), requestSeeMoreItemsBtn);
        waitForWebElementAndClick(requestSeeMoreItemsBtn);
    }

    public void requestDashboardCreateARequest() {
        waitForVisibility(requestDashboardCreateARequestBtn);
        waitForClickability(requestDashboardCreateARequestBtn);
        fluentWait(getDriver(), requestDashboardCreateARequestBtn);
        waitForWebElementAndClick(requestDashboardCreateARequestBtn);

    }

    public void requestsCreateARequest() {
        fluentWait(getDriver(), requestsCreateARequestBtn);
        waitForWebElementAndClick(requestsCreateARequestBtn);
    }

    public void goToOrders() {
        getDriver().navigate().to(baseUrlOHE + "/want");
    }

    public void requestsCreatedByMeButton() {
        fluentWait(getDriver(), requestsCreatedByMeBtn);
        waitForWebElementAndClick(requestsCreatedByMeBtn);

    }

    public void requestsSeeBids() {
        waitForVisibility(requestsSeeBidsBtn);
        waitForClickability(requestsSeeBidsBtn);
        fluentWait(getDriver(), requestsSeeBidsBtn);
        waitForWebElementAndClick(requestsSeeBidsBtn);
    }

    public void requestsEdit() {
        fluentWait(getDriver(), requestsEditBtn);
        waitForWebElementAndClick(requestsEditBtn);
    }

    public void requestsActiveMenu() {
        waitForVisibility(requestsActiveMenuBtn);
        waitForClickability(requestsActiveMenuBtn);
        fluentWait(getDriver(), requestsActiveMenuBtn);
        waitForWebElementAndClick(requestsActiveMenuBtn);
    }

    public void requestsPause() {
        waitForVisibility(requestsPauseBtn);
        waitForClickability(requestsPauseBtn);
        fluentWait(getDriver(), requestsPauseBtn);
        waitForWebElementAndClick(requestsPauseBtn);
    }


    public void requestsDuplicate() {
        fluentWait(getDriver(), requestsDuplicateBtn);
        waitForWebElementAndClick(requestsDuplicateBtn);
    }

    public void requestsShare() {
        fluentWait(getDriver(), requestsShareBtn);
        waitForWebElementAndClick(requestsShareBtn);
    }

    public void requestsDelete() {
        fluentWait(getDriver(), requestsDeleteBtn);
        waitForWebElementAndClick(requestsDeleteBtn);
    }

    public void requestsActive() {
        fluentWait(getDriver(), requestsActivateBtn);
        waitForWebElementAndClick(requestsActivateBtn);
    }

    public void matchedDetails() {
        fluentWait(getDriver(), requestsMatchedDetailsBtn);
        waitForWebElementAndClick(requestsMatchedDetailsBtn);
    }

    public void requestsMatchedMenu() {
        waitForVisibility(requestsMatchedMenuBtn);
        waitForClickability(requestsMatchedMenuBtn);
        fluentWait(getDriver(), requestsMatchedMenuBtn);
        waitForWebElementAndClick(requestsMatchedMenuBtn);
    }

    public void requestsMatchedApply() {
        fluentWait(getDriver(), requestsMatchedApplyBtn);
        waitForWebElementAndClick(requestsMatchedApplyBtn);
    }

    public void requestsMatchedClose() {
        fluentWait(getDriver(), requestsMatchedCloseBtn);
        waitForWebElementAndClick(requestsMatchedCloseBtn);
    }

    public void closedMenu() {
        waitForVisibility(closedMenuBtn);
        waitForClickability(closedMenuBtn);
        fluentWait(getDriver(), closedMenuBtn);
        waitForWebElementAndClick(closedMenuBtn);
    }

    public void reOpen() {
        fluentWait(getDriver(), reOpenBtn);
        waitForWebElementAndClick(reOpenBtn);
    }

    public void requestsMatchedSendMessage() {
        fluentWait(getDriver(), requestsMatchedSendMessageBtn);
        waitForWebElementAndClick(requestsMatchedSendMessageBtn);
    }

    public void requestsMatchedShare() {
        fluentWait(getDriver(), requestsMatchedSendMessageBtn);
        waitForWebElementAndClick(requestsMatchedSendMessageBtn);
    }

    public void sortByDropdown() {
        actions.moveToElement(requestsSortByMenuBtn).perform();
    }

    public void sortNewestToOldest() {
        sortByDropdown();
        fluentWait(getDriver(), requestsSortNewestToOldestBtn);
        waitForWebElementAndClick(requestsSortNewestToOldestBtn);
    }

    public void sortOldToNewest() {
        sortByDropdown();
        fluentWait(getDriver(), requestsSortOldToNewestBtn);
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
        fluentWait(getDriver(), browseRequestValidate);
        boolean result = browseRequestValidate.isDisplayed();
        return result;

    }

    public boolean matchedValidate() {
        fluentWait(getDriver(), matchedValidate);
        boolean result = matchedValidate.isDisplayed();
        return result;

    }

    public boolean validateRequestMatchedPage() {
        fluentWait(getDriver(), validateRequestMatchedPage);
        boolean result = validateRequestMatchedPage.isDisplayed();
        return result;

    }

    public String validateRequestPopUp() {
        fluentWait(getDriver(), validateRequestPopUp);
        String result = validateRequestPopUp.getText();
        return result;
    }

    public String validateCreateRequestDashboard() {
        fluentWait(getDriver(), validateRequestDashboard);
        String result = validateRequestDashboard.getText();
        return result;
    }

    public String validateCreateRequestBrowse() {
        fluentWait(getDriver(), validateRequestDashboard);
        String result = validateRequestDashboard.getText();
        return result;
    }
}