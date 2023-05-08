package pages.developmentServices;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;


public class SignUpDevPage extends BasePage {
    public SignUpDevPage() {
        super();
    }

    @FindBy(how = How.CSS, using = "#no-footer > div.d-flex.justify-content-between.mb-4 > h3")
    public WebElement SignUpText;
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailField;
    @FindBy(how = How.CSS, using = "#username")
    public WebElement usernameField;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordField;
    @FindBy(how = How.CSS, using = "body > header > nav > div > a > img")
    public WebElement logoQA;

    public void goToSignUp() {
        getHomePageProd();
        getSignUpPageProd();
    }

    public String validateSignUpText() {
        try {
            fluentWait(getDriver(), SignUpText);
            String result = SignUpText.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            String result = SignUpText.getText();
            return result;
        }

    }

    public boolean validateEmail() {
        try {
            boolean result = emailField.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = emailField.isDisplayed();
            return result;
        }
    }

    public boolean passwordTextField() {
        try {
            boolean result = passwordField.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = passwordField.isDisplayed();
            return result;
        }
    }

    public boolean usernameTextField() {
        try {
            boolean result = usernameField.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = usernameField.isDisplayed();
            return result;
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
}
