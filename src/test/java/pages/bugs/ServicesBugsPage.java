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

    public void faviconRedirect(){
        fluentWait(getDriver(), validatingFaviconRedirect);
        Assert.assertTrue(validatingFaviconRedirect.isDisplayed());
    }

    public void svcFaviconButton(){
        fluentWait(getDriver(), svcFaviconBtn);
        waitForWebElementAndClick(svcFaviconBtn);
    }

    public void sendRequestButton(){
        fluentWait(getDriver(), sendRequestBtn);
        waitForWebElementAndClick(sendRequestBtn);
    }

    public void messageField() {
        fluentWait(getDriver(), messageTextField);
        waitForWebElementAndClick(messageTextField);
        messageTextField.sendKeys("Testing Message");
    }
    public void proposedPriceTextField(){
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

    }


}