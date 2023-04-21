package pages.development;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class StorefrontPage extends BasePage {


    public StorefrontPage() {
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

    @FindBy(how = How.CSS, using = "#banner-storefront")
    public WebElement changeCoverPictureBtn;
    @FindBy(how = How.CSS, using = "#navbar-nav > ul > li.dropdown.hidden-mobile > div > a:nth-child(6)")
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

    public void setFrameText() {
        getDriver().switchTo().frame(0);
        try {
            WebElement textFieldBio=getDriver().findElement(By.cssSelector("body"));
            textFieldBio.sendKeys("Test");
        }
        catch (Exception e) {
            wait(3);
            WebElement textFieldBio=getDriver().findElement(By.cssSelector("body"));
            textFieldBio.sendKeys("Test");
        }
        getDriver().switchTo().defaultContent();
    }

    public void setProfilePage() {
        getDriver().navigate().to(UrlProd + "/listing/getstorefront");
    }


    public void setHomePage() {
        getDriver().navigate().to(UrlProd);
    }

    public void goToLoginPage() {
        getDriver().navigate().to(UrlProd + "/Account/Login");
    }


    public boolean profileStorefront() {
        boolean result =
                profileImage.isDisplayed();
        return result;
    }

    public boolean profileAvatar() {
        boolean result =
                profileAvatar.isDisplayed();
        return result;
    }

    public String socialConfirmText() {
        String result = socialText.getText();
        return result;
    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/storefront.jpg";

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
        waitForWebElementAndClick(lastNameTextField);
        lastNameTextField.sendKeys("Dev Account");
    }

    public void username() {
        fluentWait(getDriver(), usernameTextField);
        waitForWebElementAndClick(usernameTextField);
        usernameTextField.clear();
        waitForWebElementAndClick(usernameTextField);
        usernameTextField.sendKeys("dev");
    }

    public void email() {
        fluentWait(getDriver(), emailTextField);
        waitForWebElementAndClick(emailTextField);
        emailTextField.clear();
        waitForWebElementAndClick(emailTextField);
        emailTextField.sendKeys("dev@mymarketplacebuilder.com");
    }

    public void phoneNumber() {
        fluentWait(getDriver(), phoneNumberTextField);
        waitForWebElementAndClick(phoneNumberTextField);
        phoneNumberTextField.sendKeys("1111");
        waitForWebElementAndClick(phoneNumberTextField);
        phoneNumberTextField.clear();
    }


    public void socialButton() {
        fluentWait(getDriver(), socialBtn);
        waitForWebElementAndClick(socialBtn);
    }

    public void webSite() {
        fluentWait(getDriver(), webSiteTextField);
        waitForWebElementAndClick(webSiteTextField);
        webSiteTextField.sendKeys("Test Automation");
        waitForWebElementAndClick(webSiteTextField);
        webSiteTextField.clear();
    }

    public void facebook() {
        fluentWait(getDriver(), facebookTextField);
        waitForWebElementAndClick(facebookTextField);
        facebookTextField.clear();
        waitForWebElementAndClick(facebookTextField);
        facebookTextField.sendKeys("https://www.facebook.com/ashley.mcgroder/");
    }

    public void twitter() {
        fluentWait(getDriver(), twitterTextField);
        waitForWebElementAndClick(twitterTextField);
        twitterTextField.sendKeys("Test automation");
        waitForWebElementAndClick(twitterTextField);
        twitterTextField.clear();
    }

    public void instagram() {
        fluentWait(getDriver(), instagramTextField);
        waitForWebElementAndClick(instagramTextField);
        instagramTextField.clear();
        waitForWebElementAndClick(instagramTextField);
        instagramTextField.sendKeys("https://www.instagram.com/asheeley123/");
    }

    public void linkedin() {
        fluentWait(getDriver(), linkedinTextField);
        waitForWebElementAndClick(linkedinTextField);
        linkedinTextField.sendKeys("Test Automation");
        waitForWebElementAndClick(linkedinTextField);
        linkedinTextField.clear();
    }

    public void youtube() {
        fluentWait(getDriver(), youtubeTextField);
        waitForWebElementAndClick(youtubeTextField);
        youtubeTextField.sendKeys("Test Automation");
        waitForWebElementAndClick(youtubeTextField);
        youtubeTextField.clear();
    }

}