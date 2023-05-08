package pages.developmentServices;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pages.BasePage;


public class ListingDevPage extends BasePage {
    public ListingDevPage() {
        super();
    }

    @FindBy(how = How.CSS, using = "#name")
    public WebElement nameField;
    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement categoryField;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div/div/div[3]/div[1]/div/div[1]/div[1]/div/div[2]/div/select/option[10]")
    public WebElement businesBtn;
    @FindBy(how = How.CSS, using = "#work-model-selector")
    public WebElement workModelField;
    @FindBy(how = How.CSS, using = "#work-model-selector > option:nth-child(2)")
    public WebElement videoConferenceOption;
    @FindBy(how = How.CSS, using = "#description")
    public WebElement listingDescriptionField;
    @FindBy(how = How.CSS, using = "#hourlyPrice")
    public WebElement priceField;
    @FindBy(how = How.CSS, using = "#btn-crop")
    public WebElement cropBtn;
    @FindBy(how = How.CSS, using = "#img-0")
    public WebElement listingImageUpload;
    @FindBy(how = How.CSS, using = "#url-0")
    public WebElement listingVideosField;
    @FindBy(how = How.CSS, using = "#videos-container > div > div > div.col.mr-2.p-0.d-flex.align-items-center.justify-content-start > a.cursor-pointer.add-video.ml-2")
    public WebElement addListingVideos;
    @FindBy(how = How.CSS, using = "#go-detail-button")
    public WebElement goToDetailsBtn;
    @FindBy(how = How.CSS, using = "#checkbox-0-3")
    public WebElement englishCheckout;
    @FindBy(how = How.CSS, using = "#checkbox-1-0")
    public WebElement remoteCheckout;
    @FindBy(how = How.CSS, using = "#checkbox-2-1")
    public WebElement financeCheckout;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(4) > div > select")
    public WebElement techSpecialtiesField;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(4) > div > select > option:nth-child(2)")
    public WebElement qAOption;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(5) > div > select")
    public WebElement testDropdownField;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(5) > div > select > option:nth-child(2)")
    public WebElement option1;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(6) > div.form-group > div > div > div:nth-child(3) > span > label > span")
    public WebElement blackButton;
    @FindBy(how = How.CSS, using = "#go-availability-button")
    public WebElement goToAvailabilityBtn;
    @FindBy(how = How.CSS, using = "#multi-select-button")
    public WebElement weekdayField;
    @FindBy(how = How.CSS, using = "#weekday-options-container > li:nth-child(1) > a")
    public WebElement sundayOption;
    @FindBy(how = How.CSS, using = "#availableTimeFrom")
    public WebElement fromField;
    @FindBy(how = How.CSS, using = "#availableTimeFrom > option:nth-child(3)")
    public WebElement timeOption;
    @FindBy(how = How.CSS, using = "#availableTimeTo")
    public WebElement timeToField;
    @FindBy(how = How.CSS, using = "#availableTimeTo > option:nth-child(6)")
    public WebElement timeToOption;
    @FindBy(how = How.CSS, using = "#dates-form > div.col-4.mb-3.d-flex.justify-content-end.align-items-center > a > img")
    public WebElement addAvailable;
    @FindBy(how = How.CSS, using = "#availability-tab-pane > div.d-flex.justify-content-between.align-items-center > div > button")
    public WebElement publishBtn;
    @FindBy(xpath = "//h3[contains(text(), 'Great job! Your listing is under review and will be published soon.')]")
    public WebElement greatJobText;
    @FindBy(how = How.CSS, using = "#listings-tab")
    public WebElement myListingProd;
    @FindBy(how = How.CSS, using = "#add-new-btn")
    public WebElement newListing;
    @FindBy(how = How.CSS, using = "#name")
    public WebElement listingName;
    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement categoryServ;
    @FindBy(how = How.CSS, using = "#\\32 5761")
    public WebElement relaxCategory;
    @FindBy(how = How.CSS, using = "#description")
    public WebElement descriptionServ;
    @FindBy(how = How.CSS, using = "#hourlyPrice")
    public WebElement hourlyPrice;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(1) > input")
    public WebElement textField;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(2) > div > input")
    public WebElement numberField;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(3) > div > select")
    public WebElement dropdownField;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(3) > div > select > option:nth-child(2)")
    public WebElement indoorOption;
    @FindBy(how = How.CSS, using = "#checkbox-3-0")
    public WebElement fatOption;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(5) > div.form-group > div > div > div:nth-child(2) > span > label > span")
    public WebElement blackOption;

    public void listingNameField() {
        fluentWait(getDriver(), nameField);
        waitForWebElementAndClick(nameField);
        nameField.sendKeys("Kenpachi");
        nameField.sendKeys(Keys.ENTER);
    }

    public void selectCategory() {
        try {
            fluentWait(getDriver(), categoryField);
            waitForWebElementAndClick(categoryField);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), categoryField);
            waitForWebElementAndClick(categoryField);
        }

    }

    public void businessCategory() {
        try {
            fluentWait(getDriver(), businesBtn);
            waitForWebElementAndClick(businesBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), businesBtn);
            waitForWebElementAndClick(businesBtn);
        }

    }

    public void workModelSection() {
        fluentWait(getDriver(), workModelField);
        waitForWebElementAndClick(workModelField);
    }

    public void selectVideoConference() {
        fluentWait(getDriver(), videoConferenceOption);
        waitForWebElementAndClick(videoConferenceOption);
    }

    public void listingDescriptionField() {
        fluentWait(getDriver(), listingDescriptionField);
        waitForWebElementAndClick(listingDescriptionField);
        listingDescriptionField.sendKeys("test");
        listingDescriptionField.sendKeys(Keys.ENTER);
    }

    public void listingPricePerHour() {
        fluentWait(getDriver(), priceField);
        waitForWebElementAndClick(priceField);
        priceField.sendKeys("10");
        priceField.sendKeys(Keys.ENTER);

    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/listing.jpeg";

    public void listingAddImage() {
        try {
            listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
            fluentWait(getDriver(), cropBtn);
        } catch (Exception e) {
            wait(3);
            listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
        }
    }

    public void cropButton() {
        fluentWaitStrict(getDriver(), cropBtn);
        waitForWebElementAndClick(cropBtn);
    }

    public void listingVideoURLField() {
        try {
            fluentWait(getDriver(), listingVideosField);
            waitForWebElementAndClick(listingVideosField);
            listingVideosField.sendKeys("https://www.youtube.com/watch?v=59_usZm0HRg&ab_channel=PatrickFarrington");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), listingVideosField);
            waitForWebElementAndClick(listingVideosField);
            listingVideosField.sendKeys("https://www.youtube.com/watch?v=59_usZm0HRg&ab_channel=PatrickFarrington");
        }

    }

    public void addVideoURL() {
        fluentWait(getDriver(), addListingVideos);
        waitForWebElementAndClick(addListingVideos);
    }

    public void goToDetails() {
        try {
            fluentWait(getDriver(), goToDetailsBtn);
            waitForWebElementAndClick(goToDetailsBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), goToDetailsBtn);
            waitForWebElementAndClick(goToDetailsBtn);
        }
    }

    public void listingLanguages() {
        fluentWait(getDriver(), englishCheckout);
        waitForWebElementAndClick(englishCheckout);
    }

    public void listingWorkModel() {
        fluentWait(getDriver(), remoteCheckout);
        waitForWebElementAndClick(remoteCheckout);

    }

    public void listingBusinessSpecialties() {
        fluentWaitStrict(getDriver(), financeCheckout);
        waitForWebElementAndClick(financeCheckout);

    }

    public void listingTechSpecialties() {
        fluentWait(getDriver(), techSpecialtiesField);
        waitForWebElementAndClick(techSpecialtiesField);
    }

    public void listingTechSpecialtiesOption() {
        try {
            fluentWaitStrict(getDriver(), qAOption);
            waitForWebElementAndClick(qAOption);
            qAOption.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWaitStrict(getDriver(), qAOption);
            waitForWebElementAndClick(qAOption);
        } finally {
            fluentWaitStrict(getDriver(), qAOption);
        }

    }

    public void listingDropdownFilter() {
        try {
            fluentWait(getDriver(), testDropdownField);
            waitForWebElementAndClick(testDropdownField);
            fluentWaitStrict(getDriver(), option1);
            waitForWebElementAndClick(option1);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), testDropdownField);
            waitForWebElementAndClick(testDropdownField);
            fluentWaitStrict(getDriver(), option1);
            waitForWebElementAndClick(option1);
        }

    }

    public void listingColorPicker() {
        fluentWait(getDriver(), blackButton);
        waitForWebElementAndClick(blackButton);
    }

    public void goToAvailability() {
        try {
            fluentWait(getDriver(), goToAvailabilityBtn);
            waitForWebElementAndClick(goToAvailabilityBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), goToAvailabilityBtn);
            waitForWebElementAndClick(goToAvailabilityBtn);
        }
    }

    public void selectWeekday() {
        fluentWait(getDriver(), weekdayField);
        waitForWebElementAndClick(weekdayField);
        fluentWait(getDriver(), sundayOption);
        waitForWebElementAndClick(sundayOption);
    }

    public void selectFrom() {
        fluentWait(getDriver(), fromField);
        waitForWebElementAndClick(fromField);
        fluentWait(getDriver(), timeOption);
        waitForWebElementAndClick(timeOption);
    }

    public void selectTimeTo() {
        fluentWait(getDriver(), timeToField);
        waitForWebElementAndClick(timeToField);
        fluentWait(getDriver(), timeToOption);
        waitForWebElementAndClick(timeToOption);
    }

    public void selectAddTimeslot() {
        fluentWait(getDriver(), addAvailable);
        waitForWebElementAndClick(addAvailable);
    }

    public void publish() {
        try {
            fluentWait(getDriver(), publishBtn);
            waitForWebElementAndClick(publishBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), publishBtn);
            waitForWebElementAndClick(publishBtn);
        }
    }

    public String GreatText() {
        try {
            fluentWaitStrict(getDriver(), greatJobText);
            String result = greatJobText.getText();
            return result;
        } catch (Exception e) {
            wait(6);
            fluentWaitStrict(getDriver(), greatJobText);
            String result = greatJobText.getText();
            return result;
        }
    }

    public void selectMyListingsServ() {
        try {
            fluentWait(getDriver(), myListingProd);
            waitForWebElementAndClick(myListingProd);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), myListingProd);
            waitForWebElementAndClick(myListingProd);
        }
    }

    public void createNewListing() {
        try {
            fluentWait(getDriver(), newListing);
            waitForWebElementAndClick(newListing);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), newListing);
            waitForWebElementAndClick(newListing);
        }
    }

    public void enterTheName() {
        fluentWait(getDriver(), listingName);
        waitForWebElementAndClick(listingName);
        listingName.sendKeys("Test 1");
        listingName.sendKeys(Keys.ENTER);
    }

    public void enterCategory() {
        try {
            fluentWait(getDriver(), categoryServ);
            waitForWebElementAndClick(categoryServ);
            fluentWait(getDriver(), relaxCategory);
            waitForWebElementAndClick(relaxCategory);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), categoryServ);
            waitForWebElementAndClick(categoryServ);
            fluentWait(getDriver(), relaxCategory);
            waitForWebElementAndClick(relaxCategory);
        }
    }

    public void descriptionSection() {
        try {
            fluentWait(getDriver(), descriptionServ);
            waitForWebElementAndClick(descriptionServ);
            descriptionServ.sendKeys("Test 1");
            descriptionServ.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), descriptionServ);
            waitForWebElementAndClick(descriptionServ);
            descriptionServ.sendKeys("Test 1");
            descriptionServ.sendKeys(Keys.ENTER);
        }
    }

    public void hourlyPriceSection() {
        fluentWait(getDriver(), hourlyPrice);
        waitForWebElementAndClick(hourlyPrice);
        hourlyPrice.sendKeys("10");
        hourlyPrice.sendKeys(Keys.ENTER);
    }

    public void listingImageLoad() {
        try {
            listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
            fluentWait(getDriver(), cropBtn);
        } catch (Exception e) {
            wait(3);
            listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
        }
    }

    public void textCustomField() {
        fluentWait(getDriver(), textField);
        waitForWebElementAndClick(textField);
        textField.sendKeys("text 1");
        textField.sendKeys(Keys.ENTER);
    }

    public void numberCustomField() {
        fluentWait(getDriver(), numberField);
        waitForWebElementAndClick(numberField);
        numberField.sendKeys("1");
        numberField.sendKeys(Keys.ENTER);
    }

    public void dropdownCustomField() {
        try {
            fluentWait(getDriver(), dropdownField);
            waitForWebElementAndClick(dropdownField);
            fluentWait(getDriver(), indoorOption);
            waitForWebElementAndClick(indoorOption);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), dropdownField);
            waitForWebElementAndClick(dropdownField);
            fluentWait(getDriver(), indoorOption);
            waitForWebElementAndClick(indoorOption);
        }
    }

    public void checkboxCustomField() {
        try {
            fluentWait(getDriver(), fatOption);
            waitForWebElementAndClick(fatOption);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), fatOption);
            waitForWebElementAndClick(fatOption);
        }
    }

    public void colorPicker() {
        try {
            fluentWait(getDriver(), blackOption);
            waitForWebElementAndClick(blackOption);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), blackOption);
            waitForWebElementAndClick(blackOption);
        }
    }
}
