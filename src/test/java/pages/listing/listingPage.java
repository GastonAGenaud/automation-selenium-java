package pages.listing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class listingPage extends BasePage {


    public listingPage() {
        super();
    }

    Actions actions = new Actions(getDriver());


    //LOGIN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    //Listing
    @FindBy(how = How.CSS, using = "#dashboard > div.row > div > div.row > div.col-lg-6.text-right > div > div.col-auto.ml-auto > a")
    public WebElement addListingsBtn;
    @FindBy(how = How.CSS, using = "#listing-name")
    public WebElement listingNameTextField;
    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement listingCategoryBtn;
    @FindBy(xpath = "//option[contains(text(), 'Shoes')]")
    public WebElement categoryJewelry;
    @FindBy(xpath = "//option[contains(text(), 'Hottest Items')]")
    public WebElement categoryHottestItems;
    @FindBy(how = How.CSS, using = "#sub-category-selector")
    public WebElement subcategoryBtn;
    @FindBy(how = How.CSS, using = "#sub-category-selector > option:nth-child(4)")
    public WebElement subcategoryMensClothing;
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
    @FindBy(how = How.CSS, using = "#usps-tab > span > span:nth-child(1)")
    public WebElement listingUSPSBtn;
    //shipping
    @FindBy(how = How.CSS, using = "#location-usps")
    public WebElement USPSAddress1TextField;
    @FindBy(how = How.CSS, using = "#locality-location-usps")
    public WebElement USPSCityTextField;
    @FindBy(how = How.CSS, using = "#StateNameLong-location-usps")
    public WebElement USPSStateTextField;
    @FindBy(how = How.CSS, using = "#ZipCode-location-usps")
    public WebElement USPSZipTextField;
    @FindBy(how = How.CSS, using = "#Country-location-usps")
    public WebElement USPSCountryTextField;
    @FindBy(how = How.CSS, using = "#shipping-weight")
    public WebElement USPSWeightTextField;
    @FindBy(how = How.CSS, using = "#shipping-length")
    public WebElement USPSLengthTextField;
    @FindBy(how = How.CSS, using = "#shipping-width")
    public WebElement USPSWidthTextField;
    @FindBy(how = How.CSS, using = "#shipping-height")
    public WebElement USPSHeightTextField;
    @FindBy(how = How.CSS, using = "#fedex-tab")
    public WebElement listingFedExBtn;
    @FindBy(how = How.CSS, using = "#location-fedex")
    public WebElement fedExAddress1TextField;
    @FindBy(how = How.CSS, using = "#locality-location-fedex")
    public WebElement fedExCityTextField;
    @FindBy(how = How.CSS, using = "#StateNameLong-location-fedex")
    public WebElement fedExStateTextField;
    @FindBy(how = How.CSS, using = "#ZipCode-location-fedex")
    public WebElement fedExZipTextField;
    @FindBy(how = How.CSS, using = "#Country-location-fedex")
    public WebElement fedExCountryTextField;
    @FindBy(how = How.CSS, using = "#shipping-weight-fedex")
    public WebElement fedExWeightTextField;
    @FindBy(how = How.CSS, using = "#shipping-length-fedex")
    public WebElement fedExLengthTextField;
    @FindBy(how = How.CSS, using = "#shipping-width-fedex")
    public WebElement fedExWidthTextField;
    @FindBy(how = How.CSS, using = "#shipping-height-fedex")
    public WebElement fedExHeightTextField;
    @FindBy(how = How.CSS, using = "#phone-fedex")
    public WebElement fedExPhoneNumberTextField;
    @FindBy(how = How.CSS, using = "#custom-tab")
    public WebElement listingFlatRateShippingBtn;
    @FindBy(how = How.CSS, using = "#location-cs")
    public WebElement flatRateAddress1TextField;
    @FindBy(how = How.CSS, using = "#locality-location-cs")
    public WebElement flatRateCityTextField;
    @FindBy(how = How.CSS, using = "#StateNameLong-location-cs")
    public WebElement flatRateStateTextField;
    @FindBy(how = How.CSS, using = "#ZipCode-location-cs")
    public WebElement flatRateZipTextField;
    @FindBy(how = How.CSS, using = "#Country-location-cs")
    public WebElement flatRateCountryTextField;
    @FindBy(how = How.CSS, using = "#shipping-price")
    public WebElement flatRatePriceTextField;
    @FindBy(how = How.CSS, using = "#no-ship-tab > span > span.border-bottom-rounded")
    public WebElement noShippingBtn;
    @FindBy(how = How.CSS, using = "#shipping-tabs > div.card-body > div > div.form-group.d-flex.align-items-center > label.switch.mr-2")
    public WebElement shippingPickUpCheckbox;
    @FindBy(how = How.CSS, using = "#pickup-address")
    public WebElement pickUpAddressLine1TextField;
    @FindBy(how = How.CSS, using = "#locality-pickup-address")
    public WebElement pickUpCityTextField;
    @FindBy(how = How.CSS, using = "#StateNameLong-pickup-address")
    public WebElement pickUpStateTextField;
    @FindBy(how = How.CSS, using = "#ZipCode-pickup-address")
    public WebElement pickUpZIPTextField;
    @FindBy(how = How.CSS, using = "#Country-pickup-address")
    public WebElement pickUpCountryTextField;
    @FindBy(how = How.CSS, using = "#basic > div.d-flex.justify-content-between.align-items-center > button")
    public WebElement goToDetailsBtn;
    @FindBy(how = How.CSS, using = "#btn-crop")
    public WebElement cropBtn;

    @FindBy(how = How.CSS, using = "#createListingBtn > span")
    public WebElement listingPublishBtn;


    @FindBy(xpath = "//h3[contains(text(), 'Great job! Your listing is under review and will be published soon.')]")
    public WebElement greatJobText;

    @FindBy(how = How.CSS, using = "#basic > div.d-flex.justify-content-between.align-items-center > button > span")
    public WebElement gotoDetailsButton;


    @FindBy(how = How.CSS, using = "#custom-0")
    public WebElement departmentTab;
    @FindBy(how = How.CSS, using = "#customfield-holder > div:nth-child(2) > div.form-group > div > div > div:nth-child(1) > span > label > span")
    public WebElement greenOptionsBtn;

    @FindBy(how = How.CSS, using = "#custom-1 > option:nth-child(3)")
    public WebElement departmentMenOption;

    @FindBy(how = How.CSS, using = "#checkbox-2-1")
    public WebElement goldButtonCheckbox;

    @FindBy(how = How.CSS, using = "#custom-3")
    public WebElement mandatoryTextfield;

    @FindBy(how = How.CSS, using = "#custom-3")
    public WebElement sizeText;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body > div.iziToast-texts > p")
    public WebElement pickupError;

    public boolean validatePickupError() {
//        fluentWaitElementDisappears(getDriver(), pickupError);
        boolean result = pickupError.isDisplayed();
        return result;
    }

    public void getMandatoryTextfield() {
        fluentWait(getDriver(), mandatoryTextfield);
        waitForWebElementAndClick(mandatoryTextfield);
        mandatoryTextfield.sendKeys("1");
    }

    public void goldCheckbox() {
        actions.moveToElement(goldButtonCheckbox).build().perform();
        fluentWait(getDriver(), goldButtonCheckbox);
        waitForWebElementAndClick(goldButtonCheckbox);
    }

    public void setDepartmentMenOption() {
        actions.moveToElement(departmentMenOption).build().perform();
        fluentWait(getDriver(), departmentMenOption);
        waitForWebElementAndClick(departmentMenOption);


    }

    public void setDepartmentTab() {
        fluentWait(getDriver(), departmentTab);
        waitForWebElementAndClick(departmentTab);
        departmentTab.sendKeys(Keys.ARROW_DOWN);
        departmentTab.sendKeys(Keys.ARROW_DOWN);
        departmentTab.sendKeys(Keys.ENTER);
    }

    public void ColorOptionsAT() {
        fluentWait(getDriver(), greenOptionsBtn);
        waitForWebElementAndClick(greenOptionsBtn);
    }

    public void sizeTextField() {
        fluentWait(getDriver(), sizeText);
        waitForWebElementAndClick(sizeText);
        sizeText.sendKeys("3");
    }


    public void setGotoDetailsButton() {
        fluentWait(getDriver(), gotoDetailsButton);
        waitForWebElementAndClick(gotoDetailsButton);
    }

    public String GreatText() {
       try {
           fluentWaitStrict(getDriver(), greatJobText);
           String result = greatJobText.getText();
           return result;
       }
       catch (Exception e){
           wait(3);
           fluentWaitStrict(getDriver(), greatJobText);
           String result = greatJobText.getText();
           return result;
       }

    }

    public void setListingPublishBtn() {
        try {
            fluentWait(getDriver(), listingPublishBtn);
            waitForWebElementAndClick(listingPublishBtn);
            retryingFindClick(listingPublishBtn);
            fluentWait(getDriver(), greatJobText);
        } catch (Exception e) {
            wait(2);
        }
    }


    public void setHomePage() {
        getDriver().navigate().to(url);
    }

    public void setHomePageRelease() {
        getDriver().navigate().to(url);
    }

    public void goToListingPage() {
        getDriver().navigate().to(url + "/dashboard/MyListings");
    }

    public void goToListingPageStaging() {
        getDriver().navigate().to(url + "/dashboard/MyListings");
    }

    public void goToLoginPage() {
        getDriver().navigate().to(url + "/Account/Login");
    }

    public void goToLoginPageStaging() {
        getDriver().navigate().to(url + "/Account/Login");
    }



    public boolean listingConfirm() {
        boolean result = goToDetailsBtn.isDisplayed();
        return result;
    }


    public void addListingBtn() {
        fluentWait(getDriver(), addListingsBtn);
        waitForWebElementAndClick(addListingsBtn);
    }

    public void listingName() {
        fluentWait(getDriver(), listingCategoryBtn);
        waitForWebElementAndClick(listingNameTextField);
        listingNameTextField.sendKeys("Listing HI");
    }

    public void categoryBtn() {
        fluentWaitStrict(getDriver(), listingCategoryBtn);
        waitForWebElementAndClick(listingCategoryBtn);
    }

    public void categoryJewelryBtn() {
        fluentWaitStrict(getDriver(), categoryJewelry);
        wait(2);
        waitForWebElementAndClick(categoryJewelry);
    }

    public void categoryHottestItemsBtn() {
        try {
            fluentWaitStrict(getDriver(), categoryHottestItems);
            waitForWebElementAndClick(categoryHottestItems);
        } catch (Exception e) {
            wait(3);
            fluentWaitStrict(getDriver(), categoryHottestItems);
            waitForWebElementAndClick(categoryHottestItems);
        }
    }

    public void subcategoryBtn() {
        fluentWait(getDriver(), subcategoryBtn);
        waitForWebElementAndClick(subcategoryBtn);
    }

    public void subcategoryMensClothing() {
        try {
            fluentWaitStrict(getDriver(), subcategoryMensClothing);
            waitForWebElementAndClick(subcategoryMensClothing);
        } catch (Exception e) {
            wait(3);
            fluentWaitStrict(getDriver(), subcategoryMensClothing);
            waitForWebElementAndClick(subcategoryMensClothing);
        }
    }


    public void listingDescription() {
        fluentWait(getDriver(), listingDescriptionTextField);
        waitForWebElementAndClick(listingDescriptionTextField);
        listingDescriptionTextField.sendKeys("Test Automation");
    }

    public void listingPrice() {
        fluentWait(getDriver(), listingPriceTextField);
        waitForWebElementAndClick(listingPriceTextField);
        listingPriceTextField.sendKeys(Keys.ARROW_LEFT);
        listingPriceTextField.sendKeys("100");
    }

    public void listingQuantity() {
        fluentWait(getDriver(), listingQuantityTextField);
        waitForWebElementAndClick(listingQuantityTextField);
        fluentWait(getDriver(), listingQuantityTextField);
        listingQuantityTextField.sendKeys(Keys.ARROW_LEFT);
        listingQuantityTextField.sendKeys("44");
        listingQuantityTextField.sendKeys(Keys.ENTER);
    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/listing.jpeg";

    public void listingImageLoad() {
        listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
    }

    public void cropButton() {
        fluentWaitStrict(getDriver(), cropBtn);
        waitForWebElementAndClick(cropBtn);
    }

    public void listingVideo() {
        fluentWait(getDriver(), listingVideoTextField);
        waitForWebElementAndClick(listingVideoTextField);
        fluentWait(getDriver(), listingVideoTextField);
        listingVideoTextField.sendKeys("https://www.youtube.com/watch?v=59_usZm0HRg&ab_channel=PatrickFarrington");
    }

    public void USPSOption() {
        fluentWaitStrict(getDriver(), listingUSPSBtn);
        waitForWebElementAndClick(listingUSPSBtn);
        fluentWaitStrict(getDriver(), listingUSPSBtn);
    }

    public void USPSAddress1() {
        fluentWait(getDriver(), USPSAddress1TextField);
        waitForWebElementAndClick(USPSAddress1TextField);
        fluentWaitStrict(getDriver(), USPSAddress1TextField);
        USPSAddress1TextField.sendKeys("322 East Illinois Street");
    }


    public void USPSCity() {
        fluentWait(getDriver(), USPSCityTextField);
        waitForWebElementAndClick(USPSCityTextField);
        fluentWait(getDriver(), USPSCityTextField);
        USPSCityTextField.sendKeys("Chicago");
    }

    public void USPSState() {
        fluentWait(getDriver(), USPSStateTextField);
        waitForWebElementAndClick(USPSStateTextField);
        fluentWait(getDriver(), USPSStateTextField);
        USPSStateTextField.sendKeys("Illinois");
    }

    public void USPSZip() {
        fluentWait(getDriver(), USPSZipTextField);
        waitForWebElementAndClick(USPSZipTextField);
        fluentWait(getDriver(), USPSZipTextField);
        USPSZipTextField.sendKeys("11211");
    }

    public void USPSCountry() {
        fluentWait(getDriver(), listingUSPSBtn);
        waitForWebElementAndClick(USPSCountryTextField);
        fluentWait(getDriver(), listingUSPSBtn);
        USPSCountryTextField.sendKeys("United States");
    }

    public void USPSWeight() {
        fluentWait(getDriver(), USPSWeightTextField);
        waitForWebElementAndClick(USPSWeightTextField);
        fluentWait(getDriver(), USPSWeightTextField);
        USPSWeightTextField.sendKeys("10");
    }

    public void USPSLength() {
        fluentWait(getDriver(), USPSLengthTextField);
        waitForWebElementAndClick(USPSLengthTextField);
        fluentWait(getDriver(), USPSLengthTextField);
        USPSLengthTextField.sendKeys("10");
    }

    public void USPSWidth() {
        fluentWait(getDriver(), USPSWidthTextField);
        waitForWebElementAndClick(USPSWidthTextField);
        fluentWait(getDriver(), USPSWidthTextField);
        USPSWidthTextField.sendKeys("10");
    }

    public void USPSHeight() {
        fluentWait(getDriver(), USPSHeightTextField);
        waitForWebElementAndClick(USPSHeightTextField);
        fluentWait(getDriver(), USPSHeightTextField);
        USPSHeightTextField.sendKeys("10");
    }

    public void fedExOption() {
        fluentWait(getDriver(), listingFedExBtn);
        waitForWebElementAndClick(listingFedExBtn);
    }

    public void fedExAddress1() {
        fluentWait(getDriver(), fedExAddress1TextField);
        waitForWebElementAndClick(fedExAddress1TextField);
        fluentWait(getDriver(), fedExAddress1TextField);
        fedExAddress1TextField.sendKeys("322 East Illinois Street");
        fedExAddress1TextField.sendKeys(Keys.ENTER);
    }


    public void fedExCity() {
        fluentWait(getDriver(), fedExCityTextField);
        waitForWebElementAndClick(fedExCityTextField);
        fluentWait(getDriver(), fedExCityTextField);
        fedExCityTextField.sendKeys("Chicago");
    }

    public void fedExState() {
        fluentWait(getDriver(), fedExStateTextField);
        waitForWebElementAndClick(fedExStateTextField);
        fluentWait(getDriver(), fedExStateTextField);
        fedExStateTextField.sendKeys("Illinois");
    }

    public void fedExZip() {
        fluentWait(getDriver(), fedExZipTextField);
        waitForWebElementAndClick(fedExZipTextField);
        fluentWait(getDriver(), fedExZipTextField);
        fedExZipTextField.sendKeys("11211");
    }

    public void fedExCountry() {
        fluentWait(getDriver(), fedExCountryTextField);
        waitForWebElementAndClick(fedExCountryTextField);
        fluentWait(getDriver(), fedExCountryTextField);
        fedExCountryTextField.sendKeys("United States");
    }

    public void fedExWeight() {
        fluentWait(getDriver(), fedExWeightTextField);
        waitForWebElementAndClick(fedExWeightTextField);
        fluentWait(getDriver(), fedExWeightTextField);
        fedExWeightTextField.sendKeys("10");
    }

    public void fedExLength() {
        fluentWait(getDriver(), fedExLengthTextField);
        waitForWebElementAndClick(fedExLengthTextField);
        fluentWait(getDriver(), fedExLengthTextField);
        fedExLengthTextField.sendKeys("10");
    }

    public void fedExWidth() {
        fluentWait(getDriver(), fedExWidthTextField);
        waitForWebElementAndClick(fedExWidthTextField);
        fluentWait(getDriver(), fedExWidthTextField);
        fedExWidthTextField.sendKeys("10");
    }

    public void fedExHeight() {
        fluentWait(getDriver(), fedExHeightTextField);
        waitForWebElementAndClick(fedExHeightTextField);
        fluentWait(getDriver(), fedExHeightTextField);
        fedExHeightTextField.sendKeys("10");
    }

    public void fedExPhoneNumber() {
        fluentWait(getDriver(), fedExPhoneNumberTextField);
        waitForWebElementAndClick(fedExPhoneNumberTextField);
        fluentWait(getDriver(), fedExPhoneNumberTextField);
        fedExPhoneNumberTextField.sendKeys("18882722938");
    }

    public void flatRateOption() {
        fluentWait(getDriver(), listingFlatRateShippingBtn);
        waitForWebElementAndClick(listingFlatRateShippingBtn);

    }

    public void flatRateAddress1() {
        fluentWait(getDriver(), flatRateAddress1TextField);
        waitForWebElementAndClick(flatRateAddress1TextField);
        flatRateAddress1TextField.sendKeys("322 East Illinois Street");
    }


    public void flatRateCity() {
        fluentWait(getDriver(), flatRateCityTextField);
        waitForWebElementAndClick(flatRateCityTextField);
        flatRateCityTextField.sendKeys("Chicago");
    }

    public void flatRateState() {
        fluentWait(getDriver(), flatRateStateTextField);
        waitForWebElementAndClick(flatRateStateTextField);
        flatRateStateTextField.sendKeys("Illinois");
    }

    public void flatRateZip() {
        fluentWait(getDriver(), flatRateZipTextField);
        waitForWebElementAndClick(flatRateZipTextField);
        flatRateZipTextField.sendKeys("11211");
    }

    public void flatRateCountry() {
        fluentWait(getDriver(), flatRateCountryTextField);
        waitForWebElementAndClick(flatRateCountryTextField);
        flatRateCountryTextField.sendKeys("United States");
    }

    public void flatRatePrice() {
        fluentWait(getDriver(), flatRatePriceTextField);
        waitForWebElementAndClick(flatRatePriceTextField);
        flatRatePriceTextField.sendKeys("100");
    }

    public void noShipping() {
        fluentWait(getDriver(), noShippingBtn);
        waitForWebElementAndClick(noShippingBtn);
    }

    public void pickUpCheckbox() {
        fluentWaitStrict(getDriver(), shippingPickUpCheckbox);
        waitForWebElementAndClick(shippingPickUpCheckbox);
    }

    public void pickUpAddress1() {
        waitForVisibility(pickUpAddressLine1TextField);
        waitForClickability(pickUpAddressLine1TextField);
        fluentWait(getDriver(), pickUpAddressLine1TextField);
        waitForWebElementAndClick(pickUpAddressLine1TextField);
        pickUpAddressLine1TextField.sendKeys("322 East Illinois Street");
    }


    public void pickUpCity() {
        fluentWait(getDriver(), pickUpCityTextField);
        waitForWebElementAndClick(pickUpCityTextField);
        pickUpCityTextField.sendKeys("Chicago");
    }

    public void pickUpState() {
        fluentWait(getDriver(), pickUpStateTextField);
        waitForWebElementAndClick(pickUpStateTextField);
        pickUpStateTextField.sendKeys("Illinois");
    }

    public void pickUpZip() {
        fluentWait(getDriver(), pickUpZIPTextField);
        waitForWebElementAndClick(pickUpZIPTextField);
        pickUpZIPTextField.sendKeys("60611");

    }

    public void pickUpCountry() {
        fluentWait(getDriver(), pickUpCountryTextField);
        waitForWebElementAndClick(pickUpCountryTextField);
        pickUpCountryTextField.sendKeys("United States");
    }

}