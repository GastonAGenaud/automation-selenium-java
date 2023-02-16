package pages.settings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class settingsPage extends BasePage {


    public settingsPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());


    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/div[1]/div/div[2]/a")
    public WebElement mySettingsBtn;
    @FindBy(how = How.CSS, using = "#social-tab > span > span:nth-child(1)")
    public WebElement socialBtn;
    @FindBy(how = How.CSS, using = "#payment-tab > span > span:nth-child(1)")
    public WebElement paymentBtn;
    @FindBy(how = How.CSS, using = "#cashout-tab > span > span:nth-child(1)")
    public WebElement cashOutBtn;
    @FindBy(how = How.CSS, using = "#security-tab > span > span:nth-child(1)")
    public WebElement passwordBtn;
    @FindBy(how = How.CSS, using = "#addresses-tab > span > span:nth-child(1)")
    public WebElement addressesBtn;
    @FindBy(how = How.CSS, using = "#profile-tab-content > div:nth-child(1) > div > h5")
    public WebElement settingsInformation;
    @FindBy(how = How.CSS, using = "#social-tab-content > div > div > h5")
    public WebElement socialInformation;

    @FindBy(how = How.CSS, using = "#cashout-tab-content > div > div > div.d-flex > h5")
    public WebElement cashOutInformation;
    @FindBy(how = How.CSS, using = "#security-tab-content > div > div > h5")
    public WebElement passwordInformation;
    @FindBy(how = How.CSS, using = "#address > h5")
    public WebElement addressesInformation;
    @FindBy(how = How.CSS, using = "#creditCards > h5")
    public WebElement validatePaymentText;

    public String settingsConfirm() {
        String result = settingsInformation.getText();
        return result;
    }

    public String socialConfirm() {
        String result = socialInformation.getText();
        return result;
    }

    public boolean paymentConfirm() {
        boolean result = paymentBtn.isDisplayed();
        return result;
    }

    public String cashOutConfirm() {
        String result = cashOutInformation.getText();
        return result;
    }

    public String passwordConfirm() {
        fluentWait(getDriver(), passwordInformation);
        String result = passwordInformation.getText();
        return result;
    }

    public String addressesConfirm() {
        String result = addressesInformation.getText();
        return result;
    }

    public void setHomePage() {
        getDriver().navigate().to(url);
    }

    public void goToLoginPage() {
        getDriver().navigate().to(url + "/Account/Login");
    }

    public void goToDashboard() {
        getDriver().navigate().to(url + "/dashboard");
    }

    public void selectMySettings() {
        fluentWait(getDriver(), mySettingsBtn);
        waitForWebElementAndClick(mySettingsBtn);

    }

    public void selectSocial() {
        fluentWait(getDriver(), socialBtn);
        waitForWebElementAndClick(socialBtn);
    }

    public void selectPayment() {
        try {
            fluentWait(getDriver(), paymentBtn);
            waitForWebElementAndClick(paymentBtn);
            fluentWait(getDriver(), validatePaymentText);

        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), validatePaymentText);
        }

    }

    public void selectCashOut() {
        fluentWait(getDriver(), cashOutBtn);
        waitForWebElementAndClick(cashOutBtn);
    }

    public void selectPassword() {
        fluentWait(getDriver(), passwordBtn);
        waitForWebElementAndClick(passwordBtn);
    }

    public void selectAddresses() {
        fluentWait(getDriver(), addressesBtn);
        waitForWebElementAndClick(addressesBtn);
    }
}