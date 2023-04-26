package pages.bugs;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;

public class ServicesBugsPage extends BasePage {


    public ServicesBugsPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());

    //LOGIN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;

    @FindBy(how = How.CSS, using = "#login-header-text-customize")
    public WebElement headerLogInBtn;

    @FindBy(how = How.CSS, using = "#toggler")
    public WebElement createCustomFieldsHideShowBtn;
    @FindBy(how = How.CSS, using = "#main-admin > div.container-fluid.bg-white.pb-5 > div:nth-child(1) > div > ul > li:nth-child(5) > a")
    public WebElement createCustomFields;

    @FindBy(how = How.CSS, using = "#addCategoryBtn")
    public WebElement addCategoryBtn;

    @FindBy(how = How.CSS, using = "#category-name")
    public WebElement typeCategory;

    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[6]/div[1]/label")
    public WebElement expandCategory;

    @FindBy(xpath = "//button[contains(text(), '+ Add Subcategory')]")
    public WebElement addSubCategoryBtn;

    @FindBy(how = How.CSS, using = "#category-name-846")
    public WebElement addSubCategoryText;

    @FindBy(xpath = "//button[contains(text(), '+ Add Item')]")
    public WebElement addItemBtn;

    @FindBy(xpath = "//h5[contains(text(), 'Set up Hourly offering')]")
    public WebElement validateHourlyOffering;

    @FindBy(how = How.CSS, using = "#mainCalendar > div > div > div.datepicker-main > div > div > div.datepicker-grid > span.datepicker-cell.day.selected.focused")
    public WebElement selectingDate;

    @FindBy(how = How.CSS, using = "#cont-avt-hours")
    public WebElement hoursAvailable;
    @FindBy(how = How.CSS, using = "#form-hire > div.form-group.mb-3 > label:nth-child(2)")
    public WebElement flatFleeBtn;

    @FindBy(how = How.CSS, using = "#hourly-deadline")
    public WebElement dateField;

    @FindBy(how = How.CSS, using = "#hourly-end")
    public WebElement endTimeOptionBtn;

    @FindBy(how = How.CSS, using = "#hire-hourly > div.col-sm-3.cont-budget > div > div.position-relative > input")
    public WebElement proposedPriceText;

    @FindBy(how = How.CSS, using = "#form-hire > div:nth-child(7) > textarea")
    public WebElement messageTextField;

    @FindBy(how = How.CSS, using = "#modal-hire-btn")
    public WebElement sendRequestBtn;

    @FindBy(how = How.CSS, using = "body > header > nav > div > a > img")
    public WebElement svcFaviconBtn;

    @FindBy(how = How.CSS, using = "#hero-section > div:nth-child(2) > div")
    public WebElement validatingFaviconRedirect;

    @FindBy(how = How.CSS, using = "#custom-field-form")
    public WebElement validateCustomFieldForm;

    @FindBy(how = How.CSS, using = "#listings-tab > span > span:nth-child(1)")
    public WebElement myListingsBtn;

    @FindBy(how = How.CSS, using = "#dashboard > div.row > div")
    public WebElement myListingSector;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body > div.iziToast-texts > p")
    public WebElement imageCannotBeEmpty;

    @FindBy(how = How.CSS, using = "#listing-img-0")
    public WebElement userServiceImageFromListing;

    @FindBy(how = How.CSS, using = "#container-block")
    public WebElement listingValidation;

    @FindBy(how = How.CSS, using = "#browse-header-text-customize")
    public WebElement browseExperts;

    @FindBy(xpath = "//span[contains(text(), 'Price: Higher to Lower')]")
    public WebElement validateTextHigherLower;

    @FindBy(how = How.CSS, using = "#list-tab")
    public WebElement listViewBtn;

    @FindBy(how = How.CSS, using = "#href-createlisting")
    public WebElement createListingFromProvider;

    @FindBy(how = How.CSS, using = "#dashboard > div")
    public WebElement addListingWebValidate;

    @FindBy(how = How.CSS, using = "#listingAddon > div > div:nth-child(1) > div > div.card-body.text-center > a")
    public WebElement deactivateAddon1;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement deactivateAddon1Confirm;

    @FindBy(how = How.CSS, using = "#loader-customize > div")
    public WebElement loader;

    @FindBy(how = How.CSS, using = "#listingAddon > div > div:nth-child(2) > div > div.card-body.text-center > a")
    public WebElement deactivateAddonExplainer;

    @FindBy(how = How.CSS, using = "#listingAddon > div > div:nth-child(3) > div > div.card-body.text-center > a")
    public WebElement deactivateAnalytics;

    @FindBy(how = How.CSS, using = "#main-admin > div.py-5.b-top > div > div > div > div > div:nth-child(1) > div:nth-child(2) > div > div > div.text-center > div.be-masked.mt-3 > label")
    public WebElement browseFirstCheckbox;

    @FindBy(how = How.CSS, using = "#btn-save")
    public WebElement btnSaveLayout;

    @FindBy(how = How.CSS, using = "#whole-container")
    public WebElement homeValidateLayout;

    @FindBy(how = How.CSS, using = "#main-admin > div.py-5.b-top > div > div > div > div > div:nth-child(1) > div:nth-child(1) > div > div > div.text-center > div.be-masked.mt-3 > label > span")
    public WebElement stylishCheckbox;

    @FindBy(how = How.CSS, using = "#basic-tab-pane > div > div.card-body")
    public WebElement monthlyCheckboxValidate;

    @FindBy(how = How.CSS, using = "#notifications-tab-content > div:nth-child(1) > div > div > div > div > label.switch.switch-settings.ml-auto > span")
    public WebElement notificationEmailCheckbox;

    @FindBy(how = How.CSS, using = "#save-info-notifications")
    public WebElement notificationSaveChanges;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body > div.iziToast-texts > p")
    public WebElement saveSuccessMessage;

    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white > div.newest-items > div > div.d-flex.justify-content-between > a")
    public WebElement seeMoreBtn;

    @FindBy(xpath = "/html/body/div[4]/main/div[3]/div/div/div[2]/div[2]/div[1]/div/a/span")
    public WebElement clearFiltersBtn;

    @FindBy(how = How.CSS, using = "#container-block")
    public WebElement validateListing;

    @FindBy(how = How.CSS, using = "#block-tab")
    public WebElement blockViewBtn;
    @FindBy(how = How.CSS, using = "#total-price > div > div.col-lg-12.d-flex.align-items-center > label.switch.mb-0.mr-1.my-2 > span")
    public WebElement setUpHourly;

    @FindBy(how = How.CSS, using = "#hourlyPrice")
    public WebElement listingPriceTextField;

    @FindBy(xpath = "//label[contains(text(), '1500.00')]")
    public WebElement priceNumberValidate;

    @FindBy(how = How.CSS, using = "#sell-footer-text-customize")
    public WebElement becomeAnExpertBtn;

    @FindBy(xpath = "/html/body/div[2]/div/main/form/div/div/div/div/div/div[1]/div[2]/label/div")
    public WebElement noPaymentCheckbox;

    @FindBy(xpath = "/html/body/div[2]/div/main/form/div/div/div/div/div/div[1]/div[1]/label/div")
    public WebElement transactionFeeCheckbox;

    @FindBy(xpath = "/html/body/div[4]/main/div[3]/div/div/div[2]/div[3]/div[1]/div/div[1]/a/div/img")
    public WebElement listingVisible;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div")
    public WebElement adminMonetizationValidate;

    @FindBy(how = How.CSS, using = "#save-monetization")
    public WebElement saveMonetizationBtn;

    public void saveMonetization(){
        fluentWait(getDriver(), saveMonetizationBtn);
        waitForWebElementAndClick(saveMonetizationBtn);
    }

    public void setAdminMonetizationValidate(){
        fluentWait(getDriver(), adminMonetizationValidate);
        Assert.assertTrue(adminMonetizationValidate.isDisplayed());
    }

    public void setListingVisible(){
        fluentWait(getDriver(), listingVisible);
        listingVisible.isDisplayed();
    }

    public void transactionFeeOption(){
        fluentWait(getDriver(), transactionFeeCheckbox);
        waitForWebElementAndClick(transactionFeeCheckbox);
    }

    public void noPaymentOption(){
        fluentWait(getDriver(), noPaymentCheckbox);
        waitForWebElementAndClick(noPaymentCheckbox);
    }

    public void loginButton(){
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
    }

    public void becomeAnExpertButton(){
        fluentWait(getDriver(), becomeAnExpertBtn);
        waitForWebElementAndClick(becomeAnExpertBtn);
    }

    public void priceValidate(){
        fluentWait(getDriver(), priceNumberValidate);
        Assert.assertTrue(priceNumberValidate.isDisplayed());
    }

    public void listingHourlyPriceTextField() {
        fluentWait(getDriver(), listingPriceTextField);
        waitForWebElementAndClick(listingPriceTextField);
        listingPriceTextField.sendKeys("1500");
        listingPriceTextField.sendKeys(Keys.ENTER);
    }

    public void setUpHourlyCheckbox() {
        fluentWait(getDriver(), setUpHourly);
        waitForWebElementAndClick(setUpHourly);

        fluentWait(getDriver(), setUpHourly);
        waitForWebElementAndClick(setUpHourly);
    }

    public void blockView() {
        fluentWait(getDriver(), blockViewBtn);
        waitForWebElementAndClick(blockViewBtn);
    }

    public void validateListingPage() {
        fluentWait(getDriver(), validateListing);
        Assert.assertTrue(validateListing.isDisplayed());
    }

    public void clearFiltersButton() {
//        fluentWait(getDriver(), clearFiltersBtn);
//        waitForWebElementAndClick(clearFiltersBtn);
        try {
            fluentWait(getDriver(), userServiceImageFromListing);
            userServiceImageFromListing.isDisplayed();
            fluentWait(getDriver(), clearFiltersBtn);
            waitForWebElementAndClick(clearFiltersBtn);
        } catch (Exception e) {
            getDriver().navigate().refresh();
            wait(4);
            fluentWait(getDriver(), clearFiltersBtn);
            waitForWebElementAndClick(clearFiltersBtn);
        }
    }

    public void seeMoreButton() {
        fluentWait(getDriver(), seeMoreBtn);
        waitForWebElementAndClick(seeMoreBtn);
    }

    public void successSaveMessage() {
        fluentWait(getDriver(), saveSuccessMessage);
        Assert.assertTrue(saveSuccessMessage.isDisplayed());
    }

    public void saveChangesNotification() {
        fluentWait(getDriver(), notificationSaveChanges);
        waitForWebElementAndClick(notificationSaveChanges);
    }

    public void emailNotificationCheckbox() {
        fluentWait(getDriver(), notificationEmailCheckbox);
        waitForWebElementAndClick(notificationEmailCheckbox);
    }

    public void monthlyCheckbox() {
        fluentWait(getDriver(), monthlyCheckboxValidate);
        monthlyCheckboxValidate.isDisplayed();
    }

    public void stylishLayout() {
        fluentWait(getDriver(), stylishCheckbox);
        waitForWebElementAndClick(stylishCheckbox);
    }

    public void validateHome() {
        fluentWait(getDriver(), homeValidateLayout);
        homeValidateLayout.isDisplayed();
    }

    public void saveButtonLayout() {
        fluentWait(getDriver(), btnSaveLayout);
        Assert.assertTrue(btnSaveLayout.isDisplayed());
    }

    public void browseLayout() {
        fluentWait(getDriver(), browseFirstCheckbox);
        waitForWebElementAndClick(browseFirstCheckbox);
    }


    public void analyticsDeactivate() {
        fluentWait(getDriver(), deactivateAnalytics);
        waitForWebElementAndClick(deactivateAnalytics);
    }

    public void addonExplainerDeactivate() {
        fluentWait(getDriver(), deactivateAddonExplainer);
        waitForWebElementAndClick(deactivateAddonExplainer);
    }

    public void loaderWheel() {
        Assert.assertFalse(loader.isDisplayed());
    }

    public void deactivateAddonVerifyConfirm() {
        fluentWait(getDriver(), deactivateAddon1Confirm);
        waitForWebElementAndClick(deactivateAddon1Confirm);
    }

    public void deactivateAddonVerify() {
        fluentWait(getDriver(), deactivateAddon1);
        waitForWebElementAndClick(deactivateAddon1);


    }

    public void createListingValidateWeb() {
        fluentWait(getDriver(), addListingWebValidate);
        Assert.assertTrue(addListingWebValidate.isDisplayed());
    }

    public void addListingFromProvider() {
        fluentWait(getDriver(), createListingFromProvider);
        waitForWebElementAndClick(createListingFromProvider);
    }

    public void listViewBUG() {
        fluentWait(getDriver(), listViewBtn);
        waitForWebElementAndClick(listViewBtn);
    }


    public void validatingTextHigherAndLower() {
        fluentWait(getDriver(), validateTextHigherLower);
        validateTextHigherLower.isDisplayed();
    }


    public void browseExpertsTab() {
        fluentWait(getDriver(), browseExperts);
        waitForWebElementAndClick(browseExperts);
    }

    public void validateListing() {
        fluentWait(getDriver(), listingValidation);
        Assert.assertTrue(listingValidation.isDisplayed());
    }

    public void userImageFromListing() {
        fluentWait(getDriver(), userServiceImageFromListing);
        waitForWebElementAndClick(userServiceImageFromListing);
    }

    public void imgCannotBeEmpty() {
        fluentWait(getDriver(), imageCannotBeEmpty);
        Assert.assertTrue(imageCannotBeEmpty.isDisplayed());
    }

    public void MyListingCompleteSector() {
        fluentWait(getDriver(), myListingSector);
        Assert.assertTrue(myListingSector.isDisplayed());
    }

    public void myListingsButton() {
        fluentWait(getDriver(), myListingsBtn);
        waitForWebElementAndClick(myListingsBtn);
    }

    public void validateCustomFieldModal() {
        fluentWait(getDriver(), validateCustomFieldForm);
        Assert.assertTrue(validateCustomFieldForm.isDisplayed());
    }

    public void SVCgoToAdminPanel() {
        getDriver().navigate().to(UrlSVC + "/admin/application/GetStarted");
    }

    public void faviconRedirect() {
        fluentWait(getDriver(), validatingFaviconRedirect);
        Assert.assertTrue(validatingFaviconRedirect.isDisplayed());
    }

    public void svcFaviconButton() {
        fluentWait(getDriver(), svcFaviconBtn);
        waitForWebElementAndClick(svcFaviconBtn);
    }

    public void sendRequestButton() {
        fluentWait(getDriver(), sendRequestBtn);
        waitForWebElementAndClick(sendRequestBtn);
    }

    public void messageField() {
        fluentWait(getDriver(), messageTextField);
        waitForWebElementAndClick(messageTextField);
        messageTextField.sendKeys("Testing Message");
    }

    public void proposedPriceTextField() {
        fluentWait(getDriver(), proposedPriceText);
        waitForWebElementAndClick(proposedPriceText);
        proposedPriceText.sendKeys("10");
    }

    public void selectEndTime() {
        fluentWait(getDriver(), endTimeOptionBtn);
        waitForWebElementAndClick(endTimeOptionBtn);
    }

    public void typeDate() {
        fluentWait(getDriver(), dateField);
        waitForWebElementAndClick(dateField);
        dateField.clear();
        waitForWebElementAndClick(dateField);
        dateField.sendKeys(Keys.ARROW_LEFT);
        dateField.sendKeys("06-14-2023");
    }

    public void scheduleHours() {
        fluentWait(getDriver(), hoursAvailable);
        Assert.assertTrue(hoursAvailable.isDisplayed());
    }

    public void selectingAvailableDate() {
        fluentWait(getDriver(), selectingDate);
        waitForWebElementAndClick(selectingDate);
    }

    public boolean validHourlyOfferingText() {
        fluentWait(getDriver(), validateHourlyOffering);
        boolean result = validateHourlyOffering.isDisplayed();
        return result;
    }

    public void selectFlatFleeBtn() {
        fluentWait(getDriver(), flatFleeBtn);
        waitForWebElementAndClick(flatFleeBtn);
    }


    public void addItems() {
        fluentWait(getDriver(), addItemBtn);
        waitForWebElementAndClick(addItemBtn);
        WebElement subCategoryEdit = null;
        try {
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'test Hottest Items')]"));
            if (subCategoryEdit.isDisplayed()) {

            }
        } catch (Exception e) {
            wait(4);
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'test Hottest Items')]"));

        }
        String dataId = subCategoryEdit.getAttribute("data-id");
        WebElement editBtn = getDriver().findElement(By.xpath(String.format("//i[ @id= 'edit-%s']", dataId)));
        WebElement editField = getDriver().findElement(By.xpath(String.format("//input[ @id= 'name-%s']", dataId)));
        try {
            fluentWait(getDriver(), editBtn);
            waitForWebElementAndClick(editBtn);
            fluentWait(getDriver(), editField);
            waitForWebElementAndClick(editField);
            editField.sendKeys(" Edit");
            editField.sendKeys(Keys.ENTER);
            //fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void addSubCategoryTextBoxField() {
        for (int i = 0; i <= 5; i = i + 1) {
            fluentWait(getDriver(), addSubCategoryText);
            waitForWebElementAndClick(addSubCategoryText);
            addSubCategoryText.sendKeys("Cow" + i);
            addSubCategoryText.sendKeys(Keys.ENTER);
        }

    }

    public void addSubCategoryButton() {
        fluentWait(getDriver(), addSubCategoryBtn);
        waitForWebElementAndClick(addCategoryBtn);
    }

    public void expandCategoryTab() {
        fluentWait(getDriver(), expandCategory);
        waitForWebElementAndClick(expandCategory);
    }


    public void typeCategoryField() {
        fluentWait(getDriver(), typeCategory);
        waitForWebElementAndClick(typeCategory);
        typeCategory.sendKeys("Testing");
        typeCategory.sendKeys(Keys.ENTER);
    }

    public void addCategoryButton() {
        fluentWait(getDriver(), addCategoryBtn);
        waitForWebElementAndClick(addCategoryBtn);
    }


    public void setHomePage() {
        getDriver().navigate().to(UrlSVC);
        fluentWait(getDriver(), headerLogInBtn);
        waitForWebElementAndClick(headerLogInBtn);
    }

    public void goToAdminPanel() {
        getDriver().navigate().to(UrlSVC + "/admin/application/GetStarted");
    }

    public void createCustomFields() {
        fluentWait(getDriver(), createCustomFields);
        waitForWebElementAndClick(createCustomFields);

    }

    public void getCloseChat() {
        try {

            try {
                fluentWaitStrict(getDriver(), getDriver().findElement(By.xpath("//*[@id='webWidget']")));
                getDriver().switchTo().frame("webWidget");
                getDriver().findElement(By.xpath("//*[@aria-label='Minimizar widget']")).click();
            } catch (Exception e) {
                wait(6);
                getDriver().switchTo().frame("webWidget");
                getDriver().findElement(By.xpath("//*[@aria-label='Minimizar widget']")).click();
            }
        } catch (Exception e) {

        }
        finally {
            getDriver().switchTo().defaultContent();
        }


    }


}