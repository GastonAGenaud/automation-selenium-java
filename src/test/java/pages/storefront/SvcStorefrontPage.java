package pages.storefront;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import static java.lang.Math.random;

public class SvcStorefrontPage extends BasePage {


    public SvcStorefrontPage() {
        super();
    }


    Actions actions = new Actions(getDriver());
    String rdm = Long.toString(System.currentTimeMillis());

    //LOG IN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    @FindBy(how = How.CSS, using = "#profile-img-loginbar")
    public WebElement userImageBtn;
    @FindBy(xpath= "/html/body/header/nav/div/div[2]/ul/li[7]/div/a[3]")
    public WebElement profileBtn;
    @FindBy(how = How.CSS, using = "#banner-storefront")
    public WebElement changeCoverPictureBtn;
    @FindBy(how = How.CSS, using = "#settings-tab")
    public WebElement settingsBtn;
    @FindBy(how = How.CSS, using = "#FirstName")
    public WebElement firstNameTextField;
    @FindBy(how = How.CSS, using = "#LastName")
    public WebElement lastNameTextField;
    @FindBy(how = How.CSS, using = "#DisplayName")
    public WebElement usernameTextField;
    @FindBy(how = How.CSS, using = "#Email")
    public WebElement emailTextField;
    @FindBy(how = How.CSS, using = "#PhoneNumber")
    public WebElement phoneNumberTextField;
    @FindBy(how = How.CSS, using = "#Description")
    public WebElement bioTextField;
    @FindBy(how = How.CSS, using = "#social-tab")
    public WebElement socialBtn;
    @FindBy(how = How.CSS, using = "#website")
    public WebElement webSiteTextField;
    @FindBy(how = How.CSS, using = "#facebook")
    public WebElement facebookTextField;
    @FindBy(how = How.CSS, using = "#twitter")
    public WebElement twitterTextField;
    @FindBy(how = How.CSS, using = "#instagram")
    public WebElement instagramTextField;
    @FindBy(how = How.CSS, using = "#linkedin")
    public WebElement linkedinTextField;
    @FindBy(how = How.CSS, using = "#youtube")
    public WebElement youtubeTextField;
    @FindBy(how = How.CSS, using = "#banner-storefront-img")
    public WebElement profileImage;
    @FindBy(how = How.CSS, using = "#avatarProfile-img")
    public WebElement profileAvatar;
    @FindBy(how = How.CSS, using = "#social-tab-content > div > div > h5")
    public WebElement socialText;




    public void setHomePage(){
        getDriver().navigate().to(baseUrlOHE);
    }

    public void goToLoginPage() {
        getDriver().navigate().to(baseUrlOHE+"/Account/Login");
    }

    public void goToProfile() {
        actions.moveToElement(userImageBtn).perform();
        waitForVisibility(profileBtn);
        waitForClickability(profileBtn);
        fluentWait(getDriver(), profileBtn);
        waitForWebElementAndClick(profileBtn);
    }

    public boolean profileStorefront () {
        fluentWait(getDriver(),profileImage);
        boolean result = profileImage.isDisplayed();
        return result;
    }

    public boolean profileAvatar () {
        fluentWait(getDriver(), profileAvatar);
        boolean result = profileAvatar.isDisplayed();
        return result;
    }

    public String socialConfirmText () {
        fluentWait(getDriver(), socialText);
        String result = socialText.getText();
        return result;
    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir")+ "/src/test/resources/media/storefront.jpg";

    public void loadCoverPicture() {
        changeCoverPictureBtn.sendKeys(EV_RESULT_FILE_PATH);
    }

    public void goToSettings() {
        actions.moveToElement(userImageBtn).perform();
        fluentWait(getDriver(), settingsBtn);
        waitForWebElementAndClick(settingsBtn);
    }

    public void firstName() {
        fluentWait(getDriver(), firstNameTextField);
        waitForWebElementAndClick(firstNameTextField);
        firstNameTextField.clear();
        firstNameTextField.clear();
        firstNameTextField.sendKeys("Test");
    }

    public void lastName() {
        fluentWait(getDriver(), lastNameTextField);
        waitForWebElementAndClick(lastNameTextField);
        lastNameTextField.clear();
        fluentWait(getDriver(), lastNameTextField);
        waitForWebElementAndClick(lastNameTextField);
        lastNameTextField.sendKeys("Dev Account");
    }

    public void username() {
        fluentWait(getDriver(), usernameTextField);
        waitForWebElementAndClick(usernameTextField);
        usernameTextField.clear();
        fluentWait(getDriver(), usernameTextField);
        waitForWebElementAndClick(usernameTextField);
        usernameTextField.sendKeys("dev");
    }

    public void email() {
        fluentWait(getDriver(), emailTextField);
        waitForWebElementAndClick(emailTextField);
        emailTextField.clear();
        fluentWait(getDriver(), emailTextField);
        waitForWebElementAndClick(emailTextField);
        emailTextField.sendKeys("dev@mymarketplacebuilder.com");
    }

    public void phoneNumber() {
        fluentWait(getDriver(), emailTextField);
        waitForWebElementAndClick(emailTextField);
        phoneNumberTextField.sendKeys("1111");
        fluentWait(getDriver(), phoneNumberTextField);
        waitForWebElementAndClick(phoneNumberTextField);
        phoneNumberTextField.clear();
    }

    public void bioEdition() {
        fluentWait(getDriver(), bioTextField);
        waitForWebElementAndClick(bioTextField);
        bioTextField.clear();
        fluentWait(getDriver(), bioTextField);
        waitForWebElementAndClick(bioTextField);
        bioTextField.sendKeys("This is my bio");
    }

    public void socialButton() {
        fluentWait(getDriver(), socialBtn);
        waitForWebElementAndClick(socialBtn);
    }

    public void webSite() {
        fluentWait(getDriver(), webSiteTextField);
        waitForWebElementAndClick(webSiteTextField);
        webSiteTextField.sendKeys("Test Automation");
        fluentWait(getDriver(), webSiteTextField);
        waitForWebElementAndClick(webSiteTextField);
        webSiteTextField.clear();
    }

    public void facebook() {
        fluentWait(getDriver(), facebookTextField);
        waitForWebElementAndClick(facebookTextField);
        facebookTextField.clear();
        fluentWait(getDriver(), facebookTextField);
        waitForWebElementAndClick(facebookTextField);
        facebookTextField.sendKeys("https://www.facebook.com/ashley.mcgroder/");
    }

    public void twitter() {
        fluentWait(getDriver(), twitterTextField);
        waitForWebElementAndClick(twitterTextField);
        twitterTextField.sendKeys("Test automation");
        fluentWait(getDriver(), twitterTextField);
        waitForWebElementAndClick(twitterTextField);
        twitterTextField.clear();
    }

    public void instagram() {
        fluentWait(getDriver(), instagramTextField);
        waitForWebElementAndClick(instagramTextField);
        instagramTextField.clear();
        fluentWait(getDriver(), instagramTextField);
        waitForWebElementAndClick(instagramTextField);
        instagramTextField.sendKeys("https://www.instagram.com/asheeley123/");
    }

    public void linkedin() {
        fluentWait(getDriver(), linkedinTextField);
        waitForWebElementAndClick(linkedinTextField);
        linkedinTextField.sendKeys("Test Automation");
        fluentWait(getDriver(), linkedinTextField);
        waitForWebElementAndClick(linkedinTextField);
        fluentWait(getDriver(),linkedinTextField);
        waitForWebElementAndClick(linkedinTextField);
    }

    public void youtube() {
        fluentWait(getDriver(), youtubeTextField);
        waitForWebElementAndClick(youtubeTextField);
        youtubeTextField.sendKeys("Test Automation");
        fluentWait(getDriver(), youtubeTextField);
        waitForWebElementAndClick(youtubeTextField);
        youtubeTextField.clear();
    }
}