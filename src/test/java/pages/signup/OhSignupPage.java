package pages.signup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import static java.lang.Math.random;

public class OhSignupPage extends BasePage {


    public OhSignupPage() {
        super();
    }


    Actions actions = new Actions(getDriver());
    String rdm = Long.toString(System.currentTimeMillis());

    @FindBy(xpath = "//button[contains(string(),'%s')]")
    public WebElement buttonWithText;
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement pricingBtn;

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

    @FindBy(how = How.CSS, using = "#navbar-nav > ul > li:nth-child(5)")
    public WebElement headerSignUpBtn;


    public void goToSignUp() {
        getDriver().navigate().to(baseUrlOHE);
    }

    public void emailTextField(String text) {
        String id = rdm + Long.toString((int)random()*1200);
        fluentWait(getDriver(), emailTextField);
        waitForWebElementAndClick(emailTextField);
        emailTextField.sendKeys(text + id + "@7r1ck.com");
    }

    public void userNameTextField(String text) {
        String id = rdm + Long.toString((int)random()*1200);
        fluentWait(getDriver(), usernameTextField);
        waitForWebElementAndClick(usernameTextField);
        usernameTextField.sendKeys(text +"AutomationTest123");
    }

    public void passwordTextField() {
        fluentWait(getDriver(), passwordTextField);
        waitForWebElementAndClick(passwordTextField);
        passwordTextField.sendKeys("Hola123!");
        passwordTextField.clear();
        passwordTextField.sendKeys("Hola123!");
    }

    public void signUpBtn() {
        waitForVisibility(signupBtn);
        waitForClickability(signupBtn);
        fluentWait(getDriver(), signupBtn);
        waitForWebElementAndClick(signupBtn);
    }

    public boolean welcomeText() {
        fluentWait(getDriver(), welcomeText);
        boolean result = welcomeText.isDisplayed();
        return result;
    }

    public void headerSignUpButton(){
        fluentWait(getDriver(), headerSignUpBtn);
        waitForWebElementAndClick(headerSignUpBtn);
    }
}