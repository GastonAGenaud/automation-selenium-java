package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;


public class ServicesHomePage extends BasePage {
    public ServicesHomePage() {
        super();
    }

    WebDriver driver = getDriver();
    Actions actions = new Actions(driver);

    String rdm = Long.toString(System.currentTimeMillis());

    //LOG IN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    //Header
    @FindBy(how = How.CSS, using = "#browse-header-text-customize")
    public WebElement headerBrowseServicesBtn;
    @FindBy(how = How.CSS, using = "#login-header-text-customize")
    public WebElement headerLoginBtn;
    @FindBy(how = How.CSS, using = "#signup-header-text-customize")
    public WebElement headerSignupBtn;
    //With Account
    @FindBy(how = How.CSS, using = "#navbar-nav > ul > li:nth-child(5) > a")
    public WebElement headerInboxIconBtn;
    @FindBy(how = How.CSS, using = "#navbar-nav > ul > li:nth-child(6) > a")
    public WebElement headerCartIconBtn;
    //Categories
    @FindBy(how = How.CSS, using = "#\\32 -tab")
    public WebElement ages5CategoryBtn;
    @FindBy(how = How.CSS, using = "#\\33 -tab")
    public WebElement ages9CategoryBtn;
    @FindBy(how = How.CSS, using = "#\\34 -tab")
    public WebElement ages12CategoryBtn;
    @FindBy(how = How.CSS, using = "#\\35 -tab")
    public WebElement ages15CategoryBtn;
    @FindBy(how = How.CSS, using = "#more-tab")
    public WebElement moreCategoriesBtn;
    //Image
    @FindBy(how = How.CSS, using = "#nav-buy-tab")
    public WebElement hireBtn;
    @FindBy(how = How.CSS, using = "#search")
    public WebElement hireSearchTextField;
    @FindBy(how = How.CSS, using = "#nav-buy > div.input-nav.mb-5 > a")
    public WebElement hireSearchBtn;
    @FindBy(how = How.CSS, using = "#nav-buy > div > div:nth-child(2) > a")
    public WebElement hireAdvancedSearchBtn;
    @FindBy(how = How.CSS, using = "#nav-sell-tab")
    public WebElement provideBtn;
    @FindBy(how = How.CSS, using = "#nav-sell > a")
    public WebElement provideStartNowBtn;
    //Body
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white > div.more-categories > div > div.py-5 > a")
    public WebElement browseByCategorySeeAllBtn;
    @FindBy(how = How.CSS, using = "#featuredListings-section > div > div.d-flex.justify-content-between > a")
    public WebElement featuredProvidersSeeAllBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white > div.newest-items > div > div.d-flex.justify-content-between > a")
    public WebElement newestProvidersSeeAllBtn;
    @FindBy(how = How.CSS, using = "#nav-buyer-tab")
    public WebElement forSeekersBtn;
    @FindBy(how = How.CSS, using = "#nav-seller-tab")
    public WebElement forProvidersBtn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white > div:nth-child(7) > div.container-fluid.px-sm-5 > div > div > button")
    public WebElement signUpNowBtn;
    //Footer
    @FindBy(how = How.CSS, using = "#wants-header-text-customize")
    public WebElement footerBrowseRequestsBtn;
    @FindBy(how = How.CSS, using = "#login-footer-text-customize")
    public WebElement footerLoginBtn;
    @FindBy(how = How.CSS, using = "#signup-footer-text-customize")
    public WebElement footerSignupBtn;
    @FindBy(how = How.CSS, using = "#browselist-footer-text-customize")
    public WebElement footerBrowseClassBtn;
    @FindBy(how = How.CSS, using = "#faq-footer-text-customize")
    public WebElement footerFAQBtn;
    @FindBy(how = How.CSS, using = "#terms-footer-text-customize")
    public WebElement footerTermsAndServiceBtn;
    @FindBy(how = How.CSS, using = "#privacy-footer-text-customize")
    public WebElement footerPrivacyPolicyBtn;
    @FindBy(how = How.CSS, using = "#about-footer-text-customize")
    public WebElement footerAboutUSBtn;
    @FindBy(how = How.CSS, using = "#contact-footer-text-customize")
    public WebElement footerContactBtn;
    @FindBy(how = How.CSS, using = "li.list-inline-item:nth-child(1) > a:nth-child(1)")
    public WebElement footerFacebookPageBtn;
    @FindBy(how = How.CSS, using = "body > footer > div > div > div.col-12.col-lg-5.d-flex.justify-content-center.justify-content-sm-end.align-items-end > ul > li:nth-child(2) > a")
    public WebElement footerInstagramPageBtn;
    @FindBy(how = How.CSS, using = "body > footer > div > div > div.col-12.col-lg-5.d-flex.justify-content-center.justify-content-sm-end.align-items-end > ul > li:nth-child(3) > a")
    public WebElement footerLinkedinPageBtn;
    @FindBy(how = How.CSS, using = "body > footer > div > div > div.col-12.col-lg-5.d-flex.justify-content-center.justify-content-sm-end.align-items-end > ul > li:nth-child(4) > a")
    public WebElement footerTwitterPageBtn;
    @FindBy(how = How.CSS, using = "body > footer > div > div > div.col-12.col-lg-5.d-flex.justify-content-center.justify-content-sm-end.align-items-end > ul > li:nth-child(5) > a")
    public WebElement footerYoutubePageBtn;
    //Asserts
    @FindBy(how = How.CSS, using = "body > header > nav > div > a > img")
    public WebElement owlHomeIconBtn;

    public void iGoToSvcHomePage() {
        getDriver().navigate().to(UrlSVC);
    }

    public void goToLoginPage() {
        driver.navigate().to(UrlSVC + "/Account/Login");
    }



    public void headerBrowseServices() {
        fluentWait(getDriver(), headerBrowseServicesBtn);
        waitForWebElementAndClick(headerBrowseServicesBtn);
        iGoToSvcHomePage();
    }

    public void headerLogin() {
        fluentWait(getDriver(), headerLoginBtn);
        waitForWebElementAndClick(headerLoginBtn);
        iGoToSvcHomePage();
    }


    public void headerSignUp() {
        fluentWait(getDriver(), headerLoginBtn);
        waitForWebElementAndClick(headerLoginBtn);
        iGoToSvcHomePage();
    }

    public boolean OwlHomeVerify() {
        fluentWait(getDriver(), owlHomeIconBtn);
        boolean result = owlHomeIconBtn.isDisplayed();
        return result;
    }

    public void ages5to8() {
        fluentWait(getDriver(), ages5CategoryBtn);
        waitForWebElementAndClick(ages5CategoryBtn);
        iGoToSvcHomePage();
    }

    public void ages9to11() {
        fluentWait(getDriver(), ages9CategoryBtn);
        waitForWebElementAndClick(ages9CategoryBtn);
        iGoToSvcHomePage();
    }

    public void ages12to14() {
        fluentWait(getDriver(), ages12CategoryBtn);
        waitForWebElementAndClick(ages12CategoryBtn);
        iGoToSvcHomePage();
    }

    public void ages15to17() {
        fluentWait(getDriver(), ages15CategoryBtn);
        waitForWebElementAndClick(ages15CategoryBtn);
        iGoToSvcHomePage();
    }

    public void categoryMore() {
        fluentWait(getDriver(), moreCategoriesBtn);
        waitForWebElementAndClick(moreCategoriesBtn);
        iGoToSvcHomePage();
    }

    public void provideOption() {
        fluentWait(getDriver(), provideBtn);
        waitForWebElementAndClick(provideBtn);
    }

    public void startNowButton() {
        fluentWait(getDriver(), provideStartNowBtn);
        waitForWebElementAndClick(provideStartNowBtn);
        iGoToSvcHomePage();
    }

    public void hireOption() {
        fluentWait(getDriver(), hireBtn);
        waitForWebElementAndClick(hireBtn);
    }

    public void hireSearch() {
        fluentWait(getDriver(), hireSearchTextField);
        waitForWebElementAndClick(hireSearchTextField);
        hireSearchTextField.sendKeys("Automation Test");
    }

    public void hireSearchButton() {
        fluentWait(getDriver(), hireSearchBtn);
        waitForWebElementAndClick(hireSearchBtn);
        iGoToSvcHomePage();
    }

    public void advancedSearchBtn() {
        fluentWait(getDriver(), hireAdvancedSearchBtn);
        waitForWebElementAndClick(hireAdvancedSearchBtn);
        iGoToSvcHomePage();
    }

    public void seeAllBrowseByCategory() {
        fluentWait(getDriver(), browseByCategorySeeAllBtn);
        waitForWebElementAndClick(browseByCategorySeeAllBtn);
        iGoToSvcHomePage();
    }

    public void seeAllFeaturedProviders() {
        fluentWait(getDriver(), featuredProvidersSeeAllBtn);
        waitForWebElementAndClick(featuredProvidersSeeAllBtn);
        iGoToSvcHomePage();
    }

    public void seeAllNewestProviders() {
        fluentWait(getDriver(), newestProvidersSeeAllBtn);
        waitForWebElementAndClick(newestProvidersSeeAllBtn);
        iGoToSvcHomePage();
    }

    public void forProvidersButton() {
        fluentWait(getDriver(), forProvidersBtn);
        waitForWebElementAndClick(forProvidersBtn);
    }

    public void forSeekersButton() {
        fluentWait(getDriver(), forSeekersBtn);
        waitForWebElementAndClick(forSeekersBtn);
    }

    public void signUpNowButton() {
        fluentWait(getDriver(), signUpNowBtn);
        waitForWebElementAndClick(signUpNowBtn);
    }

    public void footerBrowseRequests() {
        fluentWait(getDriver(), footerBrowseRequestsBtn);
        waitForWebElementAndClick(footerBrowseRequestsBtn);
        iGoToSvcHomePage();
    }

    public void footerLogin() {
        fluentWait(getDriver(), footerLoginBtn);
        waitForWebElementAndClick(footerLoginBtn);
        iGoToSvcHomePage();
    }

    public void footerSignup() {
        fluentWait(getDriver(), footerSignupBtn);
        waitForWebElementAndClick(footerSignupBtn);
        iGoToSvcHomePage();
    }

    public void footerBrowseClass() {
        fluentWait(getDriver(), footerBrowseClassBtn);
        waitForWebElementAndClick(footerBrowseClassBtn);
        iGoToSvcHomePage();
    }

    public void footerFAQ() {
        fluentWait(getDriver(), footerFAQBtn);
        waitForWebElementAndClick(footerFAQBtn);
        iGoToSvcHomePage();
    }

    public void footerTermsAndService() {
        fluentWait(getDriver(), footerTermsAndServiceBtn);
        waitForWebElementAndClick(footerTermsAndServiceBtn);
        iGoToSvcHomePage();
    }

    public void footerPrivacyPolicy() {
        fluentWait(getDriver(), footerPrivacyPolicyBtn);
        waitForWebElementAndClick(footerPrivacyPolicyBtn);
        iGoToSvcHomePage();
    }

    public void footerAboutUs() {
        fluentWait(getDriver(), footerAboutUSBtn);
        waitForWebElementAndClick(footerAboutUSBtn);
        iGoToSvcHomePage();
    }

    public void footerContact() {
        fluentWait(getDriver(), footerContactBtn);
        waitForWebElementAndClick(footerContactBtn);
        iGoToSvcHomePage();
    }

    public void headerInbox() {
        fluentWait(getDriver(), headerInboxIconBtn);
        waitForWebElementAndClick(headerInboxIconBtn);
        iGoToSvcHomePage();
    }

    public void headerCartIcon() {
        fluentWait(getDriver(), headerCartIconBtn);
        waitForWebElementAndClick(headerCartIconBtn);
        iGoToSvcHomePage();
    }

    public void footerFacebookIcon() {
        fluentWait(getDriver(), footerFacebookPageBtn);
        waitForWebElementAndClick(footerFacebookPageBtn);
    }

    public void footerInstagramIcon() {
        fluentWait(getDriver(), footerInstagramPageBtn);
        waitForWebElementAndClick(footerInstagramPageBtn);
    }

    public void footerLinkedin() {
        fluentWait(getDriver(), footerLinkedinPageBtn);
        waitForWebElementAndClick(footerLinkedinPageBtn);
    }

    public void footerTwitter() {
        fluentWait(getDriver(), footerTwitterPageBtn);
        waitForWebElementAndClick(footerTwitterPageBtn);
    }

    public void footerYoutube() {
        fluentWait(getDriver(), footerTwitterPageBtn);
        waitForWebElementAndClick(footerTwitterPageBtn);
    }
}