package pages.signup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import static java.lang.Math.random;

public class signupPage extends BasePage {


    public signupPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());


    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement pricingBtn;

    @FindBy(how = How.CSS, using = "#facebook")
    public WebElement facebookBtn;
    @FindBy(how = How.CSS, using = "#container > div > div.nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb > span.nsm7Bb-HzV7m-LgbsSe-BPrWId")
    public WebElement googleBtn;
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailTextField;
    @FindBy(how = How.CSS, using = "#username")
    public WebElement usernameTextField;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordTextField;
    @FindBy(how = How.CSS, using = "#signup-button")
    public WebElement signupBtn;

    @FindBy(how = How.CSS, using = "#welcome > div > div > div > h4")
    public WebElement welcomeText;

    public void setHomePage() {
        getDriver().navigate().to(UrlProd);
    }

    public void goToSignUp() {
        getDriver().navigate().to(UrlProd + "/Account/Register");
    }


    public void signUpWithGoogle() {
        fluentWait(getDriver(), googleBtn);
        waitForWebElementAndClick(googleBtn);
        goToSignUp();
    }

    public void emailTextField(String text) {
        String id = rdm + Long.toString((int) random() * 1200);
        fluentWait(getDriver(),emailTextField);
        waitForWebElementAndClick(emailTextField);
        emailTextField.sendKeys(text + "automation2@7r1ck.com");
    }


    public void userNameTextField(String text) {
        String id = rdm + Long.toString((int) random() * 1200);
        fluentWait(getDriver(), usernameTextField);
        waitForWebElementAndClick(usernameTextField);
        usernameTextField.sendKeys(text + "AutomationTesting" + id);
    }

    public void passwordTextField(String password) {
        fluentWait(getDriver(), passwordTextField);
        waitForWebElementAndClick(passwordTextField);
        passwordTextField.sendKeys(password);
    }

    public void signUpBtn() {
        fluentWait(getDriver(), signupBtn);
        waitForWebElementAndClick(signupBtn);
    }

}