package pages.review;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.BasePage;

public class OhReviewsPage extends BasePage {


    public OhReviewsPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    @FindBy(how = How.CSS, using = "#browse-header-text-customize")
    public WebElement browseClassesBtn;
    @FindBy(how = How.CSS, using = "#listing-img-0")
    public WebElement selectClass;

    @FindBy(how = How.CSS, using = "#sidebar > li:nth-child(5) > a > span")
    public WebElement reviewsBtn;

    @FindBy(how = How.CSS, using = "#reviews > div.d-flex.justify-content-between.align-items-center.mb-2 > div")
    public WebElement askForReviewBtn;

    @FindBy(how = How.CSS, using = "#whole-container > main > div > div.card.card-vertical.mb-3 > div > div.text-center > h3")
    public WebElement invitePeopleText;

    @FindBy(how = How.CSS, using = "#submit-btn")
    public WebElement sendInviteBtn;

    @FindBy(how = How.CSS, using = "#U3VjY2Vzc1RoZSUyMGludml0ZSUyMGVtYWlscyUyMGhhdmUlMjBiZWVuJTIwc2VudCUyMHN1Y2Nlc3NmdWxseS5ncmVlbg > div.iziToast-body > div.iziToast-texts > p")
    public WebElement successInviteTxt;

    @FindBy(how = How.CSS, using = "#whole-container > main > div > div.card.card-vertical.mb-3 > div > div.container-fluid > div:nth-child(1) > div.bootstrap-tagsinput > input[type=text]")
    public WebElement emailTextField;

    @FindBy(how = How.CSS, using = "#message")
    public WebElement messageTextField;

    @FindBy(how = How.CSS, using = "#filename")
    public WebElement importCsv;


    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir")+ "/src/test/resources/EMAIL.csv";

    public void setImportCsv() {
        importCsv.sendKeys(EV_RESULT_FILE_PATH);

    }
    public void setMessageTextField(){
        fluentWait(getDriver(), messageTextField);
        waitForWebElementAndClick(messageTextField);
        messageTextField.sendKeys("Testing");
    }

    public void setEmailTextField(){
        fluentWait(getDriver(), emailTextField);
        waitForWebElementAndClick(emailTextField);
        emailTextField.sendKeys("gastongenaud@7r1ck.com");
    }

    public String successInviteText() {
        fluentWait(getDriver(), emailTextField);
        String result = successInviteTxt.getText();
        return result;
    }
    public void setSendInviteBtn(){
        fluentWait(getDriver(), emailTextField);
        waitForWebElementAndClick(emailTextField);
    }

    public String InvitePeopleTxt(){
        fluentWait(getDriver(), invitePeopleText);
        String result = invitePeopleText.getText();
        return result;
    }

    public void setAskForReviewBtn(){
        fluentWait(getDriver(), askForReviewBtn);
        waitForWebElementAndClick(askForReviewBtn);
    }

    public void setReviewsBtn(){
        fluentWait(getDriver(), reviewsBtn);
        waitForWebElementAndClick(reviewsBtn);
    }

    public void setSelectClass(){
        fluentWait(getDriver(), selectClass);
        waitForWebElementAndClick(selectClass);
    }
    public void setBrowseClassesBtn() {
        fluentWait(getDriver(), browseClassesBtn);
        waitForWebElementAndClick(browseClassesBtn);
    }

    //LOG IN


    public void goToOwlPage() {
        getDriver().navigate().to(baseUrlOHE);
    }

    public void goToLoginPage() {
        getDriver().navigate().to(baseUrlOHE+"/Account/Login");
    }

    public void goToDashboard() {
        getDriver().navigate().to(baseUrlOHE+"/dashboard");
    }
}