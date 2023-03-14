package pages.listing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;


public class SvcListingDetailsPage extends BasePage {


    public SvcListingDetailsPage() {
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
    @FindBy(how = How.CSS, using = "#browse-header-text-customize")
    public WebElement browseClassesBtn;
    @FindBy(how = How.CSS, using = "#container-block > div:nth-child(1) > a > div")
    public WebElement exampleItem;
    @FindBy(how = How.CSS, using = "#service-title")
    public WebElement selectProviderText;
    @FindBy(how = How.CSS, using = "#btn-msg")
    public WebElement sendMessageBtn;
    @FindBy(how = How.CSS, using = "#message-text")
    public WebElement sendMessageTextField;
    @FindBy(how = How.CSS, using = "#btn-sendMessage")
    public WebElement sendFromBoxBtn;
    @FindBy(how = How.CSS, using = "#hire-btn")
    public WebElement hireBtn;
    @FindBy(how = How.CSS, using = "#sidebar > li:nth-child(1) > a")
    public WebElement serviceInfoBtn;
    @FindBy(how = How.CSS, using = "#sidebar > li:nth-child(2) > a > span")
    public WebElement availabilityBtn;
    @FindBy(how = How.CSS, using = "#sidebar > li:nth-child(3) > a")
    public WebElement flatRateServicesBtn;
    @FindBy(how = How.CSS, using = "#sidebar > li:nth-child(4) > a")
    public WebElement mediaBtn;
    @FindBy(how = How.CSS, using = "#sidebar > li:nth-child(5) > a")
    public WebElement reviewsBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > section.px-sm-3.px-md-4.px-lg-5.pt-lg-5.py-4.primary-font > div > div > section.col-lg-3.col-12 > section.pt-4 > h4")
    public WebElement workText;
    @FindBy(how = How.CSS, using = "#whole-container > main > section.px-sm-3.px-md-4.px-lg-5.pt-lg-5.py-4.primary-font > div > div > section.col-lg-3.col-12 > section:nth-child(3) > h4")
    public WebElement educationText;
    @FindBy(how = How.CSS, using = "#whole-container > main > section.px-sm-3.px-md-4.px-lg-5.pt-lg-5.py-4.primary-font > div > div > section.col-lg-3.col-12 > section:nth-child(3) > h4")
    public WebElement bioText;
    @FindBy(how = How.CSS, using = "#profileName")
    public WebElement hireNameText;
    @FindBy(how = How.CSS, using = "#sidebar > li:nth-child(1) > a > span > span.fz-20")
    public WebElement serviceInfoText;
    @FindBy(how = How.CSS, using = "#availability > h4")
    public WebElement availabilityText;
    @FindBy(xpath = "//h4[contains(text(), 'Flat Rate Services')]")
    public WebElement flatRateServicesText;
    @FindBy(how = How.CSS, using = "#media > h4")
    public WebElement mediaText;
    @FindBy(how = How.CSS, using = "#reviews > div.d-flex.justify-content-between.align-items-center.mb-2 > h4")
    public WebElement reviewText;


    public void setHomePage() {
        getDriver().navigate().to(UrlSVC);
    }

    public void goToLoginPage() {
        getDriver().navigate().to(UrlSVC + "/Account/Login");

    }

    public void BrowseClassesButton() {
        fluentWait(getDriver(), browseClassesBtn);
        waitForWebElementAndClick(browseClassesBtn);
    }

    public void exampleItemButton() {
        fluentWait(getDriver(), exampleItem);
        waitForWebElementAndClick(exampleItem);
    }

    public boolean providerText() {
        fluentWait(getDriver(), selectProviderText);
        boolean result = selectProviderText.isDisplayed();
        return result;
    }

    public void sendMessageButton() {
        fluentWait(getDriver(), sendMessageBtn);
        waitForWebElementAndClick(sendMessageBtn);
    }

    public void sendMessageTextBox() {
        fluentWait(getDriver(), sendMessageTextField);
        waitForWebElementAndClick(sendMessageTextField);
    }

    public boolean fromBoxSend() {
        fluentWait(getDriver(), sendMessageBtn);
        boolean result = sendFromBoxBtn.isDisplayed();
        return result;
    }

    public void hireButton() {
        fluentWait(getDriver(), hireBtn);
        waitForWebElementAndClick(hireBtn);

    }

    public void serviceInfoButton() {
        fluentWait(getDriver(), serviceInfoBtn);
        waitForWebElementAndClick(serviceInfoBtn);
    }

    public void availabilityButton() {
        fluentWait(getDriver(), availabilityBtn);
        waitForWebElementAndClick(availabilityBtn);
    }

    public void flatRateServicesButton() {
        fluentWait(getDriver(), flatRateServicesBtn);
        waitForWebElementAndClick(flatRateServicesBtn);
    }

    public void mediaButton() {
        fluentWait(getDriver(), mediaBtn);
        waitForWebElementAndClick(mediaBtn);
    }

    public void reviewsButton() {
        fluentWait(getDriver(), reviewsBtn);
        waitForWebElementAndClick(reviewsBtn);
    }

    public boolean workTxt() {
        fluentWait(getDriver(), workText);
        boolean result = workText.isDisplayed();
        return result;
    }

    public boolean educationTxt() {
        fluentWait(getDriver(), educationText);
        boolean result = educationText.isDisplayed();
        return result;
    }

    public boolean bioTxt() {
        fluentWait(getDriver(), bioText);
        boolean result = bioText.isDisplayed();
        return result;
    }

    public boolean hireTxt() {
        waitForVisibility(hireNameText);
        fluentWait(getDriver(), hireNameText);
        boolean result = hireNameText.isDisplayed();
        return result;
    }

    public boolean serviceInfoTxt() {
        fluentWait(getDriver(), serviceInfoText);
        boolean result = serviceInfoText.isDisplayed();
        return result;
    }

    public boolean availabilityTxt() {
        fluentWait(getDriver(), availabilityBtn);
        boolean result = availabilityText.isDisplayed();
        return result;
    }

    public boolean flatRateServicesTxt() {
        fluentWait(getDriver(), flatRateServicesText);
        boolean result = flatRateServicesText.isDisplayed();
        return result;
    }

    public boolean reviewTxt() {
        waitForVisibility(reviewText);
        fluentWait(getDriver(), reviewText);
        boolean result = reviewText.isDisplayed();
        return result;
    }

    public boolean mediaTxt() {
        fluentWait(getDriver(), mediaText);
        boolean result = mediaText.isDisplayed();
        return result;
    }
}



