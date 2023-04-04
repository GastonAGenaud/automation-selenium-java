package pages.productionServices;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;


public class SProdLoginPages extends BasePage {
    public SProdLoginPages() {
        super();
    }

    Actions actions = new Actions(getDriver());
    String rdm = Long.toString(System.currentTimeMillis());

    @FindBy(xpath = "/html/body/div[4]/main/div/div[2]/div/div[1]/div[1]/h3")
    public WebElement loginTxt;
    @FindBy(how = How.CSS, using = "#facebook")
    public WebElement facebookText;
    @FindBy(how = How.CSS, using = "#container > div > div.nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb")
    public WebElement GoogleText;
    @FindBy(how = How.CSS, using = "body > header > nav > div > a > img")
    public WebElement logoQA;

    public void goToLogin() {
        getHomePageProd();
        getLoginPageProd();
    }

    public String validateLoginText() {
        try {
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
            String result = facebookText.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            String result = facebookText.getText();
            return result;
        }
    }

    public boolean validateLoginGoogleText() {
        try {
            boolean result = GoogleText.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = GoogleText.isDisplayed();
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
    public void goToSignUp(){
        getHomePageProd();
        getSignUpPageProd();
    }

}
