package pages.developmentServices;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;


public class LoginDevPage extends BasePage {
    public LoginDevPage() {
        super();
    }

    @FindBy(how = How.CSS, using = "#login-content > div.d-flex.justify-content-between.mb-4 > h3")
    public WebElement loginTxt;
    @FindBy(how = How.CSS, using = "#facebook")
    public WebElement facebookText;
    @FindBy(how = How.CSS, using = "#container > div")
    public WebElement GoogleText;
    @FindBy(how = How.CSS, using = "body > header > nav > div > a > img")
    public WebElement logoQA;

    @FindBy(how = How.CSS, using = "#e-mail-forgot")
    public WebElement forgotEmailField;
    @FindBy(how = How.CSS, using = "#forgot-tab")
    public WebElement forgotYourPassword;
    @FindBy(how = How.CSS, using = "#email-sent > h3")
    public WebElement messageResetPassword;

    public void goToLogin() {
        getHomePageProd();
        getLoginPageProd();
    }

    public String validateLoginText() {
        try {
            fluentWait(getDriver(), loginTxt);
            String result = loginTxt.getText();
            return result;
        } catch (Exception e) {
            wait(5);
            String result = loginTxt.getText();
            return result;
        }
    }

    public String validateLoginFacebookText() {
        try {
            fluentWait(getDriver(), facebookText);
            String result = facebookText.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            String result = facebookText.getText();
            return result;
        }
    }

    public boolean validateLoginGoogleText() {
        getDriver().switchTo().frame(0);
        try {
            fluentWait(getDriver(), GoogleText);
            boolean result = GoogleText.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = GoogleText.isDisplayed();
            return result;
        } finally {
            getDriver().switchTo().defaultContent();
        }
    }

    public boolean logoQAProductionSite() {
        try {
            boolean result = logoQA.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = logoQA.isDisplayed();
            return result;
        }
    }

    public void forgotYourPassword() {
        try {
            fluentWait(getDriver(), forgotYourPassword);
            waitForWebElementAndClick(forgotYourPassword);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), forgotYourPassword);
            waitForWebElementAndClick(forgotYourPassword);
        }
    }

    public void enterTheEmail() {
        fluentWait(getDriver(), forgotEmailField);
        waitForWebElementAndClick(forgotEmailField);
        forgotEmailField.sendKeys("gastongenaud@7r1ck.com");
        forgotEmailField.sendKeys(Keys.ENTER);
    }

    public String validMessageToResetThePassword() {
        fluentWait(getDriver(), messageResetPassword);
        String result = messageResetPassword.getText();
        return result;
    }
}
