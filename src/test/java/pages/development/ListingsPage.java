package pages.development;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;

import static driver.DriverFactory.getDriver;

public class ListingsPage extends BasePage {

    public ListingsPage() {
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
    //Listing
    @FindBy(how = How.CSS, using = "#listings-tab > span > span:nth-child(1)")
    public WebElement myListingBtn;
    @FindBy(how = How.CSS, using = "#dashboard > div.row > div > div.row > div.col-lg-6.text-right > div > div.col-auto.ml-auto > a")
    public WebElement addListingsBtn;
    @FindBy(how = How.CSS, using = "#listing-name")
    public WebElement listingNameTextField;
    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement listingCategoryBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/form/div/div[1]/div[1]/div/div[1]/div[2]/div/select/option[4]")
    public WebElement listingCategoryOption;
    @FindBy(how = How.CSS, using = "#listing-description")
    public WebElement listingDescriptionTextField;
    @FindBy(how = How.CSS, using = "#price")
    public WebElement listingPriceTextField;
    @FindBy(how = How.CSS, using = "#quantity")
    public WebElement listingQuantityTextField;
    @FindBy(how = How.CSS, using = "#img-0")
    public WebElement listingImageUpload;
    @FindBy(how = How.CSS, using = "#listing-videourl")
    public WebElement listingVideoTextField;
    @FindBy(how = How.CSS, using = "#go-detail-button")
    public WebElement goToDetailsBtn;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(1) > div:nth-child(1) > div > div > div:nth-child(1) > span > label")
    public WebElement selectSubject;
    @FindBy(how = How.CSS, using = "#checkbox-1-0")
    public WebElement WorkModelOnlineCheckbox;
    @FindBy(how = How.CSS, using = "#checkbox-0-0")
    public WebElement listingLanguageCheckbox;

    @FindBy(how = How.CSS, using = "#checkbox-2-0")
    public WebElement listingSpecialityCheckbox;
    @FindBy(how = How.CSS, using = "#policy")
    public WebElement cancellationTextField;
    @FindBy(how = How.CSS, using = "#go-availability-button")
    public WebElement goToAvailabilityBtn;
    @FindBy(how = How.CSS, using = "#multi-select-button")
    public WebElement availableDayTab;
    @FindBy(how = How.CSS, using = "#weekday-options-container > li:nth-child(1) > a")
    public WebElement saturdayTab;
    @FindBy(how = How.CSS, using = "#availableTimeFrom")
    public WebElement timeFromTab;
    @FindBy(how = How.CSS, using = "#availableTimeFrom > option:nth-child(2)")
    public WebElement timeTwelve;
    @FindBy(how = How.CSS, using = "#availableTimeTo")
    public WebElement timeToTab;
    @FindBy(how = How.CSS, using = "#availableTimeTo > option:nth-child(20)")
    public WebElement timeFour;
    @FindBy(how = How.CSS, using = "#createListingBtn > span")
    public WebElement listingPublishBtn;
    @FindBy(how = How.CSS, using = "#approved > a:nth-child(1) > span:nth-child(1)")
    public WebElement listingActive;

    @FindBy(how = How.CSS, using = "#dates-form > div.col-4.mb-3.d-flex.justify-content-end.align-items-center > a")
    public WebElement addTimeSlotBtn;

    @FindBy(how = How.CSS, using = "#supply-117 > div > div.row.pt-2 > div.col-auto.text-right.pr-0 > a")
    public WebElement editBtn;

    @FindBy(how = How.CSS, using = "#approved > a:nth-child(1) > span")
    public WebElement editActive;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div/button")
    public WebElement tabDots;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div/div/a[1]")
    public WebElement shareBtn;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div")
    public WebElement successfullShare;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div/div/a[2]")
    public WebElement deleteClassButton;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//label[contains(text(), 'Stripe Connect')]")
    public WebElement validateStripeText;

    @FindBy(how = How.CSS, using = "#total-price > div > div.col-lg-12.d-flex.align-items-center > label.switch.mb-0.mr-1.my-2 > span")
    public WebElement setUpHourly;

    @FindBy(how = How.CSS, using = "#btn-crop")
    public WebElement cropBtn;

    @FindBy(how = How.CSS, using = "#customfield-holder > div:nth-child(3) > div.form-group > div > div > div > span > label > span")
    public WebElement lightBlueColor;

    @FindBy(how = How.CSS, using = "#custom-4")
    public WebElement selectStatusTab;

    @FindBy(xpath = "//option[contains(text(), 'Good')]")
    public WebElement goodOption;

    @FindBy(how = How.CSS, using = "#dashboard > div.row")
    public WebElement validateListing;

    public void validatingListing() {
        fluentWaitStrict(getDriver(), validateListing);
        Assert.assertTrue(validateListing.isDisplayed());
    }

    public void selectGood() {
        fluentWait(getDriver(), goodOption);
        waitForWebElementAndClick(goodOption);
    }

    public void statusTab() {
        fluentWait(getDriver(), selectStatusTab);
        waitForWebElementAndClick(selectStatusTab);
    }

    public void selectLightBlueColor() {
        fluentWait(getDriver(), lightBlueColor);
        waitForWebElementAndClick(lightBlueColor);
    }

    public void listingQuantity() {
        fluentWait(getDriver(), listingQuantityTextField);
        waitForWebElementAndClick(listingQuantityTextField);
        fluentWait(getDriver(), listingQuantityTextField);
        listingQuantityTextField.sendKeys(Keys.ARROW_LEFT);
        listingQuantityTextField.sendKeys("44");
        listingQuantityTextField.sendKeys(Keys.ENTER);
    }

    public void specialityCheckbox() {
        fluentWait(getDriver(), listingSpecialityCheckbox);
        waitForWebElementAndClick(listingSpecialityCheckbox);
    }

    public void cropButton() {
        fluentWait(getDriver(), cropBtn);
        waitForWebElementAndClick(cropBtn);
    }


    public void setUpHourlyCheckbox() {
        fluentWait(getDriver(), setUpHourly);
        waitForWebElementAndClick(setUpHourly);

        fluentWait(getDriver(), setUpHourly);
        waitForWebElementAndClick(setUpHourly);
    }

    public boolean validatingStripeTxtM() {
        boolean result = validateStripeText.isDisplayed();
        return result;
    }

    public void setDeleteConfirm() {
        fluentWait(getDriver(), deleteConfirm);
        waitForWebElementAndClick(deleteConfirm);
    }

    public void setDeleteClassButton() {
        waitForVisibility(deleteClassButton);
        waitForClickability(deleteClassButton);
        actions.moveToElement(deleteClassButton).build();
        fluentWait(getDriver(), deleteClassButton);
        waitForWebElementAndClick(deleteClassButton);
    }

    public void shareButton() {
        waitForVisibility(shareBtn);
        waitForClickability(shareBtn);
        actions.moveToElement(shareBtn);
        fluentWait(getDriver(), shareBtn);
        waitForWebElementAndClick(shareBtn);
    }

    public void setTabDots() {
        fluentWait(getDriver(), tabDots);
        waitForWebElementAndClick(tabDots);
    }

    public void setEditBtn() {
        fluentWait(getDriver(), editBtn);
        waitForWebElementAndClick(editBtn);
    }

    public void addTimeSlotButton() {
        fluentWait(getDriver(), addTimeSlotBtn);
        waitForWebElementAndClick(addTimeSlotBtn);
    }


    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/listing.jpeg";

    public void setHomePage() {
        getDriver().navigate().to(UrlSVC);
    }

    public void goToListingPage() {
        getDriver().navigate().to(UrlSVC + "/dashboard/MyListings");
    }

    public void goToLoginPage() {
        getDriver().navigate().to(UrlSVC + "/Account/Login");
    }

    public void goToDashboardPage() {
        getDriver().navigate().to(UrlSVC + "/dashboard");
    }

    public void myListingButton() {
        fluentWait(getDriver(), myListingBtn);
        waitForWebElementAndClick(myListingBtn);
    }

    public void addNewListing() {
        fluentWait(getDriver(), addListingsBtn);
        waitForWebElementAndClick(addListingsBtn);
    }

    public void listingNameTextField() {
        fluentWait(getDriver(), listingNameTextField);
        waitForWebElementAndClick(listingNameTextField);
        listingNameTextField.sendKeys("Test Automation");

    }

    public void categoryBtn() {
        fluentWait(getDriver(), listingCategoryBtn);
        waitForWebElementAndClick(listingCategoryBtn);
    }

    public void listingCategoryOption() {
        fluentWait(getDriver(), listingCategoryOption);
        waitForWebElementAndClick(listingCategoryOption);
    }

    public void listingDescriptionTextField() {
        fluentWait(getDriver(), listingDescriptionTextField);
        waitForWebElementAndClick(listingDescriptionTextField);
        listingDescriptionTextField.sendKeys("Test Automation");

    }

    public void listingHourlyPriceTextField() {
        fluentWait(getDriver(), listingPriceTextField);
        waitForWebElementAndClick(listingPriceTextField);
        listingPriceTextField.clear();
        listingPriceTextField.sendKeys("22");
        listingPriceTextField.sendKeys(Keys.ENTER);
    }

    public void listingImageUploadButton() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
        try {
            fluentWait(getDriver(), listingImageUpload);
            listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
        } catch (Exception e) {
            listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
        }
    }

    public void listingVideoURLTextField() {
        //waitForVisibility(listingVideoTextField);
        fluentWaitStrict(getDriver(), listingVideoTextField);
        waitForWebElementAndClick(listingVideoTextField);
        listingVideoTextField.sendKeys("https://www.youtube.com/watch?v=59_usZm0HRg&ab_channel=PatrickFarrington");
    }

    public void selectGoToDetailsButton() {
        fluentWait(getDriver(), goToDetailsBtn);
        waitForWebElementAndClick(goToDetailsBtn);
    }

    public void selectSubjectTag() {
        fluentWait(getDriver(), selectSubject);
        waitForWebElementAndClick(selectSubject);
    }

    public void workModelCheckboxOnline() {
        fluentWait(getDriver(), WorkModelOnlineCheckbox);
        waitForWebElementAndClick(WorkModelOnlineCheckbox);
    }

    public void languageCheckboxEnglish() {
        fluentWait(getDriver(), listingLanguageCheckbox);
        waitForWebElementAndClick(listingLanguageCheckbox);
    }

    public void listingCancellationTextField() {
        fluentWait(getDriver(), cancellationTextField);
        waitForWebElementAndClick(cancellationTextField);
        cancellationTextField.sendKeys("Test");
    }

    public void goToAvailabilityButton() {
        fluentWait(getDriver(), goToAvailabilityBtn);
        waitForWebElementAndClick(goToAvailabilityBtn);
    }

    public void selectAvailableDaysTab() {
        fluentWait(getDriver(), availableDayTab);
        waitForWebElementAndClick(availableDayTab);
    }

    public void selectSaturdayOption() {
        fluentWait(getDriver(), saturdayTab);
        waitForWebElementAndClick(saturdayTab);
    }

    public void selectTimeFrom() {
        fluentWait(getDriver(), timeFromTab);
        waitForWebElementAndClick(timeFromTab);
    }

    public void setTimeTwelve() {
        fluentWait(getDriver(), timeTwelve);
        waitForWebElementAndClick(timeTwelve);
    }

    public void setTimeToTab() {
        fluentWait(getDriver(), timeToTab);
        waitForWebElementAndClick(timeToTab);
    }

    public void setTimeFour() {
        fluentWait(getDriver(), timeFour);
        waitForWebElementAndClick(timeFour);
    }

    public void selectPublishButton() {

        try {
            try {
                validatingStripeTxtM();
                fluentWaitStrict(getDriver(), listingPublishBtn);
                waitForWebElementAndClick(listingPublishBtn);
            } catch (Exception e) {
                validatingStripeTxtM();
                wait(5);
                fluentWait(getDriver(), listingPublishBtn);
                waitForWebElementAndClick(listingPublishBtn);
                retryingFindClick(listingPublishBtn);
            }
        } catch (Exception e) {
            wait(4);
            retryingFindClick(listingPublishBtn);

        }
    }

    public boolean listingActiveTab() {
        try {
            fluentWaitStrict(getDriver(), listingActive);
            boolean result = listingActive.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(5);
            fluentWaitStrict(getDriver(), listingActive);
            boolean result = listingActive.isDisplayed();
            return result;
        }
    }

    public boolean editActive() {
        fluentWait(getDriver(), editActive);
        boolean result = editActive.isDisplayed();
        return result;
    }

    public boolean shareMessage() {
        waitForVisibility(successfullShare);
        fluentWait(getDriver(), successfullShare);
        boolean result = successfullShare.isDisplayed();
        return result;
    }


}
