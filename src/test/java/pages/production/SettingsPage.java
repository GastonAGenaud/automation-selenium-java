package pages.production;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;

public class SettingsPage extends BasePage {


    public SettingsPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());

    ////////LOGIN//////////////
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    ////////SETTINGS//////////////

    @FindBy(how = How.CSS, using = "#settings-tab > span > span:nth-child(1)")
    public WebElement settingsTab;

    @FindBy(how = How.CSS, using = "#security-tab > span > span:nth-child(1)")
    public WebElement passwordTab;
    @FindBy(how = How.CSS, using = "#Password")
    public WebElement resetPasswordTextField;

    @FindBy(how = How.CSS, using = "#saveChangesBtn")
    public WebElement saveResetPassword;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body")
    public WebElement passwordChangedMessage;

    @FindBy(how = How.CSS, using = "#security-tab-content > div > div > h5")
    public WebElement validateTextChangePassword;

    @FindBy(how = How.CSS, using = "#CurrentPassword")
    public WebElement currentPassword;

    @FindBy(how = How.CSS, using = "#social-tab > span > span:nth-child(1)")
    public WebElement socialTab;

    @FindBy(how = How.CSS, using = "#website")
    public WebElement websiteInput;

    @FindBy(how = How.CSS, using = "#linkedin")
    public WebElement linkedinInput;

    @FindBy(how = How.CSS, using = "#facebook")
    public WebElement facebookInput;
    @FindBy(how = How.CSS, using = "#instagram")
    public WebElement instagramInput;
    @FindBy(how = How.CSS, using = "#youtube")
    public WebElement youtubeInput;
    @FindBy(how = How.CSS, using = "#twitter")
    public WebElement twitterInput;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body")
    public WebElement urlsAddedMessage;

    @FindBy(how = How.CSS, using = "#NameOnCard")
    public WebElement nameOnCardInput;

    @FindBy(how = How.CSS, using = "#CardNumber")
    public WebElement cardNumberInput;

    @FindBy(how = How.CSS, using = "#ExpirationDate")
    public WebElement expirationDateInput;

    @FindBy(how = How.CSS, using = "#CVV")
    public WebElement cvvInput;

    public void cvvTextField(){
        fluentWait(getDriver(), cvvInput);
        cvvInput.sendKeys("123");
    }

    public void expirationDateTextField(){
        fluentWait(getDriver(), expirationDateInput);
        expirationDateInput.sendKeys("052");
    }

    public void cardNumberTextField(){
        fluentWait(getDriver(), cardNumberInput);
        cardNumberInput.sendKeys("424242424242");
    }

    public void nameOnCardTextField(){
        fluentWait(getDriver(), nameOnCardInput);
        nameOnCardInput.sendKeys("Test Production");
    }



    public void urlsAddedPopUp(){
        fluentWait(getDriver(), urlsAddedMessage);
        Assert.assertTrue(urlsAddedMessage.isDisplayed());
    }

    public void linkedinTextField(){
        fluentWait(getDriver(), linkedinInput);
        linkedinInput.sendKeys("https://www.google.com/");
    }
    public void facebookTextField(){
        fluentWait(getDriver(), facebookInput);
        facebookInput.sendKeys("https://www.google.com/");
    }
    public void instagramTextField(){
        fluentWait(getDriver(), instagramInput);
        instagramInput.sendKeys("https://www.google.com/");
    }
    public void youtubeTextField(){
        fluentWait(getDriver(), youtubeInput);
        youtubeInput.sendKeys("https://www.google.com/");
    }
    public void websiteTextField(){
        fluentWait(getDriver(), websiteInput);
        websiteInput.sendKeys("https://www.google.com/");
    }

    public void twitterTextField(){
        fluentWait(getDriver(), twitterInput);
        twitterInput.sendKeys("https://www.google.com/");
    }

    public void dashboardSocialTab() {
        fluentWait(getDriver(), socialTab);
        waitForWebElementAndClick(socialTab);

    }
    public void currentPasswordTextField(){
        fluentWait(getDriver(), currentPassword);
        waitForWebElementAndClick(currentPassword);
        currentPassword.sendKeys("#NcUzbusYqu667gq");
    }

    public void textChangePasswordValidate(){
        fluentWait(getDriver(), validateTextChangePassword);
        validateTextChangePassword.isDisplayed();
    }

    public void passwordChangedPopUp(){
        fluentWait(getDriver(), passwordChangedMessage);
        Assert.assertTrue(passwordChangedMessage.isDisplayed());
    }

    public void saveChangesPassword(){
        fluentWait(getDriver(), saveResetPassword);
        waitForWebElementAndClick(saveResetPassword);
    }

    public void resetPassword() {
        fluentWait(getDriver(), resetPasswordTextField);
        waitForWebElementAndClick(resetPasswordTextField);
        resetPasswordTextField.sendKeys("#NcUzbusYqu667gq");
    }

    public void dashboardPasswordTab() {
        fluentWait(getDriver(), passwordTab);
        waitForWebElementAndClick(passwordTab);
    }

    public void dashboardSettingsTab() {
        fluentWait(getDriver(), settingsTab);
        waitForWebElementAndClick(settingsTab);
    }
}