package pages.production;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class loginPage extends BasePage {


    public loginPage() {
        super();
    }

    String windowHandle = getDriver().getWindowHandle();


    Actions actions = new Actions(getDriver());

    Actions action = new Actions(getDriver());
//action.moveToElement("#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > a");

    //LOGIN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    @FindBy(how = How.CSS, using = "#login-header-text-customize")
    public WebElement logInHeaderBtn;
    ////////////////

    public void loginButton(){
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
    }

    public void loginHeader(){
        fluentWait(getDriver(),logInHeaderBtn);
        waitForWebElementAndClick(logInHeaderBtn);
    }
    public void emailLoginInputTextField(){
        fluentWait(getDriver(),emailLoginInput);
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("gastongenaud@7r1ck.com");
    }
    public void passwordFieldStepEmails() {
        fluentWait(getDriver(), passwordLoginInput);
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.clear();
        passwordLoginInput.sendKeys("#NcUzbusYqu667gq");
    }
}
