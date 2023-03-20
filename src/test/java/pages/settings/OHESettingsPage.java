package pages.settings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class OHESettingsPage extends BasePage {


    public OHESettingsPage() {
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
    @FindBy(how = How.CSS, using = "#navbar-nav > ul > li.dropdown.hidden-mobile > div > a:nth-child(3)")
    public WebElement dashboardBtn;
    @FindBy(how = How.CSS, using = "#navbar-nav > ul > li.dropdown.hidden-mobile > a")
    public WebElement dropdownBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/div[1]/div/div[2]/a")
    public WebElement mySettingsBtn;
    @FindBy(how = How.CSS, using = "#social-tab > span > span:nth-child(1)")
    public WebElement socialBtn;
    @FindBy(how = How.CSS, using = "#payment-tab > span > span:nth-child(1)")
    public WebElement paymentBtn;
    @FindBy(how = How.CSS, using = "#cashout-tab > span > span:nth-child(1)")
    public WebElement cashOutBtn;
    @FindBy(how = How.CSS, using = "#addresses-tab > span > span:nth-child(1)")
    public WebElement addressesBtn;
    @FindBy(how = How.CSS, using = "#experience-tab > span > span:nth-child(1)")
    public WebElement experienceBtn;
    @FindBy(how = How.CSS, using = "#profile-tab-content > div:nth-child(1) > div > h5")
    public WebElement settingsInformation;
    @FindBy(how = How.CSS, using = "#social-tab-content > div > div > h5")
    public WebElement socialInformation;
    @FindBy(how = How.CSS, using = "#creditCards > h5")
    public WebElement paymentInformation;
    @FindBy(how = How.CSS, using = "#cashout-tab-content > div > div > div.d-flex > h5")
    public WebElement cashOutInformation;
    @FindBy(how = How.CSS, using = "#security-tab-content > div > div > h5")
    public WebElement securityInformation;
    @FindBy(how = How.CSS, using = "#addresses-tab-content > div.card.card-settings.mt-4.work-experience.px-3.px-sm-3.px-md-4.px-lg-5 > div > h5")
    public WebElement addressesInformation;



        public String settingsConfirm () {
            fluentWait(getDriver(), settingsInformation);
            String result = settingsInformation.getText();
            return result;
        }

        public String socialConfirm () {
            fluentWait(getDriver(), socialInformation);
            String result = socialInformation.getText();
            return result;
        }

        public boolean paymentConfirm () {
            fluentWait(getDriver(), paymentBtn);
            boolean result = paymentBtn.isDisplayed();
            return result;
        }

        public String cashOutConfirm () {
            fluentWait(getDriver(), cashOutInformation);
            String result = cashOutInformation.getText();
            return result;
        }

        public String securityConfirm () {
            fluentWait(getDriver(), securityInformation);
            String result = securityInformation.getText();
            return result;
        }

        public String addressesConfirm () {
            fluentWait(getDriver(), addressesInformation);
            String result = addressesInformation.getText();
            return result;
        }

        public void setHomePage () {
            getDriver().navigate().to(baseUrlOHE);
        }

        public void goToLoginPage () {
            getDriver().navigate().to(baseUrlOHE + "/Account/Login");
        }

        public void goToDashboard () {
            getDriver().navigate().to(baseUrlOHE + "/dashboard");
        }

        public void settingsReload () {
            getDriver().navigate().to(baseUrlOHE + "/profile/settings");
        }

        public void selectMySettings () {
            fluentWait(getDriver(), mySettingsBtn);
            waitForWebElementAndClick(mySettingsBtn);
            getDriver().get(baseUrlOHE + "/profile/settings");
        }

        public void selectSocial () {
            fluentWait(getDriver(), socialBtn);
            waitForWebElementAndClick(socialBtn);

        }

        public void selectPayment () {
            fluentWait(getDriver(), paymentBtn);
            waitForWebElementAndClick(paymentBtn);

        }

        public void selectCashOut () {
            fluentWait(getDriver(), cashOutBtn);
            waitForWebElementAndClick(cashOutBtn);
        }

        public void selectSecurity () {
            fluentWait(getDriver(), addressesBtn);
            waitForWebElementAndClick(addressesBtn);
        }

        public void selectAddresses () {
            fluentWait(getDriver(), addressesBtn);
            waitForWebElementAndClick(addressesBtn);

        }
    }