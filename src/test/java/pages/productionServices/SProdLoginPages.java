package pages.productionServices;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;

import static java.lang.Math.random;


public class SProdLoginPages extends BasePage {
    public SProdLoginPages() {
        super();
    }

    Actions actions = new Actions(getDriver());
    String rdm = Long.toString(System.currentTimeMillis());
    String randomEmail = rdm + Long.toString((int) random() * 1200);
    String randomStr = RandomStringUtils.randomAlphabetic(20);
    @FindBy(how = How.CSS, using = "#login-content > div.d-flex.justify-content-between.mb-4 > h3")
    public WebElement loginTxt;
    @FindBy(how = How.CSS, using = "#facebook")
    public WebElement facebookText;
    @FindBy(how = How.CSS, using = "#container > div")
    public WebElement GoogleText;
    @FindBy(how = How.CSS, using = "body > header > nav > div > a > img")
    public WebElement logoQA;
    @FindBy(how = How.CSS, using = "#no-footer > div.d-flex.justify-content-between.mb-4 > h3")
    public WebElement SignUpText;
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailField;
    @FindBy(how = How.CSS, using = "#username")
    public WebElement usernameField;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordField;
    @FindBy(how = How.CSS, using = "#RXJyb3JQbGVhc2UlMjByZW1vdmUlMjBhbnklMjBzcGVjaWFsJTIwY2hhcmFjdGVycyUyMGZyb20lMjB5b3VyJTIwdXNlcm5hbWUucmVk > div.iziToast-body > div.iziToast-texts")
    public WebElement lastErrorValidate;
    @FindBy(how = How.CSS, using = "#seller-buyer-section > p")
    public WebElement validateText;
    @FindBy(xpath = "//div[@class='iziToast-texts']")
    public WebElement errorMessageSignUp;
    @FindBy(how = How.CSS, using = "#imSellerSelector > div > label > div > div")
    public WebElement imSellerBtn;
    @FindBy(how = How.CSS, using = "#seller-buyer-button")
    public WebElement nextBtn;
    @FindBy(how = How.CSS, using = "#\\35 4")
    public WebElement howOld;
    @FindBy(how = How.CSS, using = "#\\35 5")
    public WebElement howMuch;
    @FindBy(how = How.CSS, using = "#\\35 6")
    public WebElement agreeTerms;

    @FindBy(how = How.CSS, using = "#\\35 7")
    public WebElement whereAreYou;

    @FindBy(how = How.CSS, using = "#submit-button")
    public WebElement submitBtn;
    @FindBy(xpath = "//h2[contains(text(), 'You haven’t created any listings yet')]")
    public WebElement validateFirstText;
    @FindBy(how = How.CSS, using = "#welcome > div > div > div > button > span")
    public WebElement closeBtnWindow;


    public void goToLogin() {
        getHomePageProd();
        getLoginPageProd();
    }

    public String validateLoginText() {
        try {
            fluentWait(getDriver(),loginTxt);
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
            fluentWait(getDriver(),facebookText);
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
        }
       finally {
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

    public void CreateAnAccountListingDetailsPROD(String text) {
        getDriver().navigate().to(urlServicesProd);

        waitForVisibility(signUpNowBtn);
        fluentWaitStrict(getDriver(), signUpNowBtn);
        fluentWait(getDriver(), signUpNowBtn);
        waitForWebElementAndClick(signUpNowBtn);

        fluentWaitStrict(getDriver(), newEmailBtn);
        fluentWait(getDriver(), newEmailBtn);
        waitForWebElementAndClick(newEmailBtn);

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), newEmailBtn);
        waitForWebElementAndClick(newEmailBtn);
        newEmailBtn.sendKeys(text + randomEmail + "auto@trick.com");

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.clear();
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), newPasswordBtn);
        fluentWait(getDriver(), newPasswordBtn);
        waitForWebElementAndClick(newPasswordBtn);
        newPasswordBtn.click();

        fluentWaitStrict(getDriver(), newPasswordBtn);
        fluentWait(getDriver(), newPasswordBtn);
        waitForWebElementAndClick(newPasswordBtn);
        newPasswordBtn.sendKeys("asdasdasq21231@A");
        newPasswordBtn.clear();
        newPasswordBtn.sendKeys("asdasdasq21231@A");

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), signUpBtn);
        fluentWait(getDriver(), signUpBtn);
        waitForWebElementAndClick(signUpBtn);

   /*     fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.clear();
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), signUpBtn);
        fluentWait(getDriver(), signUpBtn);
        waitForWebElementAndClick(signUpBtn);


        wait(4);
        //welcomeClose.click();

    */

    }
    public void CloseWindow(){
       try {
           fluentWait(getDriver(),closeBtnWindow);
           waitForWebElementAndClick(closeBtnWindow);
       }catch (Exception e){
           wait(3);
           fluentWait(getDriver(),closeBtnWindow);
           waitForWebElementAndClick(closeBtnWindow);
       }
    }

    public boolean validateLastError() {
        try {
            fluentWaitElementDisappears(getDriver(), lastErrorValidate);
            boolean result = lastErrorValidate.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(4);
            fluentWait(getDriver(), validateText);
            boolean result = lastErrorValidate.isDisplayed();
            return result;
        } finally {
            fluentWait(getDriver(), validateText);
        }

    }

    public void imSellerButton() {
        try {
            actions.moveToElement(errorMessageSignUp).build().perform();
            fluentWaitElementDisappears(getDriver(), errorMessageSignUp);
            fluentWait(getDriver(), imSellerBtn);
            waitForWebElementAndClick(imSellerBtn);
            fluentWaitStrict(getDriver(), nextBtn);
        } catch (Exception e) {
            wait(4);
            fluentWait(getDriver(), imSellerBtn);
            waitForWebElementAndClick(imSellerBtn);
            retryingFindClick(imSellerBtn);
        } finally {
            fluentWaitStrict(getDriver(), nextBtn);
        }
    }

    public void nextButton() {
        fluentWaitStrict(getDriver(), nextBtn);
        waitForWebElementAndClick(nextBtn);
    }

    public boolean validateTextFirst() {
        fluentWait(getDriver(), validateFirstText);
        boolean result = validateFirstText.isDisplayed();
        return result;
    }

    public void completeFormSignUp() {
        try {
            fluentWait(getDriver(), howOld);
            waitForWebElementAndClick(howOld);
            //fluentWaitElementDisappears(getDriver(),errorMessageSignUp);
            howOld.sendKeys("18");
            howMuch.sendKeys("test");
            agreeTerms.sendKeys("Yes");
            whereAreYou.sendKeys("test");
            fluentWait(getDriver(), submitBtn);
            waitForWebElementAndClick(submitBtn);
//        retryingFindClick(submitBtn);
            validateTextFirst();
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), howOld);
            waitForWebElementAndClick(howOld);
            //fluentWaitElementDisappears(getDriver(),errorMessageSignUp);
            howOld.sendKeys("18");
            howMuch.sendKeys("test");
            agreeTerms.sendKeys("Yes");
            whereAreYou.sendKeys("test");
            fluentWait(getDriver(), submitBtn);
            waitForWebElementAndClick(submitBtn);
            validateTextFirst();
        }


    }
}
