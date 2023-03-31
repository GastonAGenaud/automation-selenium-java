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