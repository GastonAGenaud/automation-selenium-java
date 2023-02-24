package pages.listing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;


public class OhListingDetailsPage extends BasePage {


    public OhListingDetailsPage() {
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
    @FindBy(how = How.CSS, using = "#hire-name")
    public WebElement hireNameText;
    @FindBy(how = How.CSS, using = "#sidebar > li:nth-child(1) > a > span > span.fz-20")
    public WebElement serviceInfoText;
    @FindBy(how = How.CSS, using = "#availability > h4")
    public WebElement availabilityText;
    @FindBy(how = How.CSS, using = "#package > h4")
    public WebElement flatRateServicesText;
    @FindBy(how = How.CSS,using = "#media > h4")
    public WebElement mediaText;
    @FindBy(how = How.CSS, using = "#reviews > div.d-flex.justify-content-between.align-items-center.mb-2 > h4")
    public WebElement reviewText;



    public void setHomePage(){

        getDriver().navigate().to(baseUrlOHE);
    }

    public void goToLoginPage () {
        getDriver().navigate().to(baseUrlOHE+"/Account/Login");

    }
        public void BrowseClassesButton() {
            browseClassesBtn.click();
        }

        public void exampleItemButton(){
        exampleItem.click();
        }

        public boolean providerText(){
        boolean result= selectProviderText.isDisplayed();
        return result;
        }

        public void sendMessageButton(){
        sendMessageBtn.click();
        }

        public void sendMessageTextBox(){
        sendMessageTextField.click();
        }

        public boolean fromBoxSend(){
        boolean result = sendFromBoxBtn.isDisplayed();
        return result;
        }

        public void hireButton(){
        hireBtn.click();

        }

        public void serviceInfoButton(){
        serviceInfoBtn.click();
        }

        public void availabilityButton(){
        availabilityBtn.click();
        }

        public void flatRateServicesButton(){
        flatRateServicesBtn.click();
        }

        public void mediaButton(){
        mediaBtn.click();
        }

        public void reviewsButton(){
        reviewsBtn.click();
        }

        public boolean workTxt(){
        boolean result = workText.isDisplayed();
        return result;
        }

        public boolean educationTxt(){
        boolean result = educationText.isDisplayed();
        return result;
        }

        public boolean bioTxt(){
        boolean result = bioText.isDisplayed();
        return result;
        }

        public boolean hireTxt(){
        boolean result = hireNameText.isDisplayed();
        return result;
        }

        public boolean serviceInfoTxt(){
        boolean result = serviceInfoText.isDisplayed();
        return result;
        }

        public boolean availabilityTxt(){
        boolean result = availabilityText.isDisplayed();
        return result;
        }

        public boolean flatRateServicesTxt(){
        boolean result = flatRateServicesText.isDisplayed();
        return result;
        }

        public boolean reviewTxt(){
        boolean result = reviewText.isDisplayed();
        return result;
        }
        public boolean mediaTxt(){
        boolean result = mediaText.isDisplayed();
        return result;
        }
    }



