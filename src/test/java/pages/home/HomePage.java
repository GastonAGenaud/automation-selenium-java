package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;


public class HomePage extends BasePage {
    public HomePage() {
        super();
    }

    WebDriver driver = getDriver();
    Actions actions = new Actions(driver);

    String rdm = Long.toString(System.currentTimeMillis());


    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement pricingBtn;
    //LOG IN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    //Header
    @FindBy(how = How.CSS, using = "#browse-header-text-customize")
    public WebElement headerBrowseBtn;
    @FindBy(how = How.CSS, using = "#wants-header-text-customize")
    public WebElement headerRequestBtn;
    @FindBy(how = How.CSS, using = "#login-header-text-customize")
    public WebElement headerLogInBtn;
    @FindBy(how = How.CSS, using = "#signup-header-text-customize")
    public WebElement headerSignUpBtn;
    @FindBy(how = How.CSS, using = "#browsebyseller-header-text-customize")
    public WebElement headerBrowseBySellerBtn;
    //Menu
    //Accessories
    @FindBy(xpath = "//a[contains(text(), 'Accessories')]")
    public WebElement accessoriesBtn;
    @FindBy(xpath = "//a[@class='nav-link more-cat'][@href='/Listing/Browse?CategoryId=580']")
    public WebElement moreAccessoriesBtn;
    //Clothing
    @FindBy(xpath = "//a[contains(text(), 'Clothing')]")
    public WebElement clothingBtn;

    @FindBy(xpath = "//a[@class='nav-link more-cat'][@href='/Listing/Browse?CategoryId=578']")
    public WebElement moreClothingBtn;
    @FindBy(xpath = "//li[contains(text(), 'More')]")
    public WebElement homeLivingBtn;

    @FindBy(xpath = "//a[@class='nav-link more-cat']")
    public WebElement moreHomeAndLivingBtn;
    @FindBy(xpath = "//a[contains(text(), 'Jewelry')]")
    public WebElement jewelryBtn;
    @FindBy(xpath = "//a[@class='nav-link more-cat'][@href='/Listing/Browse?CategoryId=573']")
    public WebElement moreJewelryBtn;
    @FindBy(xpath = "/html/body/header/div/ul/li[2]/a")
    public WebElement shoesBtn;

    @FindBy(xpath = "//a[@class='nav-link more-cat'][@href='/Listing/Browse?CategoryId=574']")
    public WebElement moreShoesBtn;
    @FindBy(xpath = "/html/body/header/div/ul/li[3]/a")
    public WebElement outdoorStuffBtn;
    @FindBy(xpath = "//a[@class='nav-link more-cat'][@href='/Listing/Browse?CategoryId=576']")
    public WebElement moreOutdoorStuffBtn;
    @FindBy(xpath = "/html/body/header/div/ul/li[4]/a")
    public WebElement artAndCollectablesBtn;
    @FindBy(xpath = "//a[@class='nav-link more-cat'][@href='/Listing/Browse?CategoryId=316']")
    public WebElement moreArtAndCollectablesBtn;
    @FindBy(how = How.CSS, using = "#more-tab")
    public WebElement moreBtn;
    //Image
    @FindBy(how = How.CSS, using = "#nav-buy-tab")
    public WebElement buyBtn;
    @FindBy(how = How.CSS, using = "body > header > nav > div > a")
    public WebElement homeBackBtn;

    @FindBy(how = How.CSS, using = "body > section > div > div.w-35.col-responsive-r > a")
    public WebElement homeBackBtnBug;
    @FindBy(how = How.CSS, using = "#searchCarousel")
    public WebElement buySearchTextField;
    @FindBy(how = How.CSS, using = "#nav-buy-carousel > div > div.d-flex.align-items-center.justify-content-between.mb-4 > button")
    public WebElement buySearchBtn;
    @FindBy(xpath = "//div[contains(text(), 'Search today')]")
    public WebElement buyAdvancedSearch;
    @FindBy(xpath = "/html/body/div[3]/main/div[1]/div[2]/div/div[3]/div/div/nav/div/a[2]")
    public WebElement sellBtn;
    @FindBy(how = How.CSS, using = "#nav-sell-carousel > button")
    public WebElement startTodayBtn;

    @FindBy(xpath = "/html/body/div[4]/main/div[2]/div/div[3]/div/div/nav/div/a[1]")
    public WebElement forBuyersBtn;
    @FindBy(xpath = "/html/body/div[4]/main/div[2]/div/div[3]/div/div/nav/div/a[2]")
    public WebElement forSellersBtn;

    @FindBy(how = How.CSS, using = "#whole-container > main > div.section-img-bg > div.container-fluid.px-sm-5 > div > div.offset-lg-5.col-lg-2 > a")
    public WebElement startNowBtn;
    //Footer
    @FindBy(how = How.CSS, using = "#sell-footer-text-customize")
    public WebElement footerSellBtn;
    @FindBy(how = How.CSS, using = "#browselist-footer-text-customize")
    public WebElement footerBrowseListBtn;
    @FindBy(how = How.CSS, using = "#browse-footer-text-customize")
    public WebElement footerBrowseRequestBtn;
    @FindBy(how = How.CSS, using = "#login-footer-text-customize")
    public WebElement footerLogInBtn;
    @FindBy(how = How.CSS, using = "#signup-footer-text-customize")
    public WebElement footerSignUpBtn;
    @FindBy(how = How.CSS, using = "#faq-footer-text-customize")
    public WebElement footerFAQSBtn;
    @FindBy(how = How.CSS, using = "#terms-footer-text-customize")
    public WebElement footerTermsAndConditionsBtn;
    @FindBy(how = How.CSS, using = "#privacy-footer-text-customize")
    public WebElement footerPrivacyPolicyBtn;
    @FindBy(how = How.CSS, using = "#about-footer-text-customize")
    public WebElement footerAboutUsBtn;
    @FindBy(how = How.CSS, using = "#contact-footer-text-customize")
    public WebElement footerContactUsBtn;
    @FindBy(how = How.CSS, using = "body > footer > div > div > div.col-12.col-lg-5.d-flex.justify-content-center.justify-content-sm-end.align-items-end > ul > li:nth-child(1) > a")
    public WebElement footerFacebookPageBtn;
    @FindBy(how = How.CSS, using = "body > footer > div > div > div.col-12.col-lg-5.d-flex.justify-content-center.justify-content-sm-end.align-items-end > ul > li:nth-child(2) > a")
    public WebElement footerInstagramPageBtn;
    @FindBy(how = How.CSS, using = "body > footer > div > div > div.col-12.col-lg-5.d-flex.justify-content-center.justify-content-sm-end.align-items-end > ul > li:nth-child(3) > a")
    public WebElement footerLinkedinPageBtn;
    @FindBy(how = How.CSS, using = "body > footer > div > div > div.col-12.col-lg-5.d-flex.justify-content-center.justify-content-sm-end.align-items-end > ul > li:nth-child(4) > a")
    public WebElement footerTwitterPageBtn;
    @FindBy(how = How.CSS, using = "body > footer > div > div > div.col-12.col-lg-5.d-flex.justify-content-center.justify-content-sm-end.align-items-end > ul > li:nth-child(5) > a")
    public WebElement footerYoutubePageBtn;
    //Browse


    @FindBy(xpath = "/html/body/header/div/ul/li[2]/a")
    public WebElement mensHomeBtn;

    @FindBy(how = How.CSS, using = "#dropdown-nav-451 > li > a")
    public WebElement moreMensBtn;

    @FindBy(xpath = "/html/body/header/div/ul/li[9]/a")
    public WebElement hottestItemsBtn;

    @FindBy(how = How.CSS, using = "#dropdown-nav-320 > li:nth-child(2) > a")
    public WebElement moreHottestItemsBtn;

    @FindBy(xpath = "/html/body/header/div/ul/li[4]/a")
    public WebElement rugsHomeBtn;

    @FindBy(how = How.CSS, using = "#dropdown-nav-232 > li > a")
    public WebElement moreRugsBtn;

    //LOG IN
    public void login() {
        fluentWait(getDriver(), emailLoginInput);
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("dev@mymarketplacebuilder.com");
        fluentWait(getDriver(), passwordLoginInput);
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("uX$Z2Z4^Ye3z,2&A");
        waitForWebElementAndClick(logInBtn);
    }
    //HOME PAGE

    public void setHomePage() {
        driver.navigate().to(url);
    }

    public void goToHome() {
        driver.navigate().to(url);
    }

    //Header
    public void headerBrowse() {
        fluentWait(getDriver(), headerBrowseBtn);
        waitForWebElementAndClick(headerBrowseBtn);
    }

    public void headerRequest() {
        fluentWaitStrict(getDriver(), headerRequestBtn);
        waitForWebElementAndClick(headerRequestBtn);
    }

    public void headerLogIn() {
        fluentWait(getDriver(), headerLogInBtn);
        waitForWebElementAndClick(headerLogInBtn);
    }

    public void headerSignUp() {
        fluentWait(getDriver(), headerSignUpBtn);
        waitForWebElementAndClick(headerSignUpBtn);
    }

    public void headerBrowseBySeller() {
        fluentWait(getDriver(), headerBrowseBySellerBtn);
        waitForWebElementAndClick(headerBrowseBySellerBtn);
    }

    //Menu
    public void accessoriesMenuTab() {
        goToHome();
        fluentWait(getDriver(), accessoriesBtn);
        waitForWebElementAndClick(accessoriesBtn);}


    public void mensHomeBtn() {
        fluentWait(getDriver(), mensHomeBtn);
        waitForWebElementAndClick(mensHomeBtn);
    }

    public void moreMensBtn() {
        fluentWait(getDriver(), moreMensBtn);
        waitForWebElementAndClick(moreMensBtn);
        moreMensBtn.click();
    }

    public void hottestItemsBtn() {
        fluentWait(getDriver(), hottestItemsBtn);
        waitForWebElementAndClick(hottestItemsBtn);
    }

    public void moreHottestItemsBtn() {
        fluentWait(getDriver(), moreHottestItemsBtn);
        moreHottestItemsBtn.click();
    }

    public void rugsHomeBtn() {
        fluentWait(getDriver(), rugsHomeBtn);
        waitForWebElementAndClick(rugsHomeBtn);
    }

    public void moreRugsBtn() {
        fluentWait(getDriver(), moreRugsBtn);
        waitForWebElementAndClick(moreRugsBtn);
    }

    public void moreAccessories() {
        fluentWait(getDriver(), accessoriesBtn);
        actions.moveToElement(accessoriesBtn).build().perform();

        fluentWaitStrict(getDriver(), moreAccessoriesBtn);
        waitForWebElementAndClick(moreAccessoriesBtn);
    }

    public void clothing() {
        wait(5);
        fluentWaitStrict(getDriver(), clothingBtn);
        waitForWebElementAndClick(clothingBtn);
    }


    public void moreClothing() {
        fluentWait(getDriver(), moreClothingBtn);
        waitForWebElementAndClick(moreClothingBtn);
    }

    public void homeLiving() {
        fluentWait(getDriver(), homeLivingBtn);
        waitForWebElementAndClick(homeLivingBtn);
    }


    public void moreHomeAndLiving() {
        fluentWait(getDriver(), moreHomeAndLivingBtn);
        waitForWebElementAndClick(moreHomeAndLivingBtn);
    }

    public void jewelry() {
        fluentWait(getDriver(), jewelryBtn);
        waitForWebElementAndClick(jewelryBtn);
    }

    public void moreJewelry() {
        fluentWait(getDriver(), jewelryBtn);
        actions.moveToElement(jewelryBtn).build().perform();
        fluentWait(getDriver(), moreJewelryBtn);
        waitForWebElementAndClick(moreJewelryBtn);

    }

    public void shoes() {
        fluentWait(getDriver(), shoesBtn);
        waitForWebElementAndClick(shoesBtn);
    }


    public void moreShoes() {
        fluentWait(getDriver(), moreShoesBtn);
        waitForWebElementAndClick(moreShoesBtn);
    }

    public void outdoorStuff() {
        fluentWait(getDriver(), outdoorStuffBtn);
        waitForWebElementAndClick(outdoorStuffBtn);
    }

    public void moreOutdoorStuff() {
        fluentWait(getDriver(), outdoorStuffBtn);
        actions.moveToElement(outdoorStuffBtn).build().perform();

        fluentWait(getDriver(), moreOutdoorStuffBtn);
        waitForWebElementAndClick(moreOutdoorStuffBtn);
    }

    public void artAndCollectables() {
        fluentWait(getDriver(), artAndCollectablesBtn);
        waitForWebElementAndClick(artAndCollectablesBtn);
    }

    public void moreArtAndCollectables() {
        fluentWait(getDriver(), artAndCollectablesBtn);
        actions.moveToElement(artAndCollectablesBtn).build().perform();

        fluentWaitStrict(getDriver(), moreArtAndCollectablesBtn);
        waitForWebElementAndClick(moreArtAndCollectablesBtn);
    }

    public void moreCategories() {
        waitForVisibility(moreBtn);
        fluentWait(getDriver(), moreBtn);
        waitForWebElementAndClick(moreBtn);
    }

    //Image
    public void buy() {
        fluentWait(getDriver(), buyBtn);
        waitForWebElementAndClick(buyBtn);
        buyBtn.click();
    }

    public void buySearchTextField() {
        fluentWait(getDriver(), buySearchTextField);
        waitForWebElementAndClick(buySearchTextField);
        buySearchTextField.sendKeys("Test Search");
    }

    public void buySearchBtn() {
        fluentWait(getDriver(), buySearchBtn);
        waitForWebElementAndClick(buySearchBtn);
    }

    public void buyAdvancedSearch() {
        fluentWait(getDriver(), buyAdvancedSearch);
        waitForWebElementAndClick(buyAdvancedSearch);
    }

    public void sellBtn() {
        actions.moveToElement(sellBtn);
        fluentWait(getDriver(), sellBtn);
        waitForWebElementAndClick(sellBtn);
    }

    public void startTodayBtn() {
        fluentWait(getDriver(), startTodayBtn);
        waitForWebElementAndClick(startTodayBtn);
        startTodayBtn.click();
    }

    public void homeBack() {
       try {
           fluentWait(getDriver(), homeBackBtn);
           waitForWebElementAndClick(homeBackBtn);
       }catch (Exception e){
           wait(3);
           fluentWait(getDriver(), homeBackBtnBug);
           waitForWebElementAndClick(homeBackBtnBug);
       }
    }

    public void forBuyers() {
        fluentWait(getDriver(), forBuyersBtn);
        waitForWebElementAndClick(forBuyersBtn);
    }

    public void forSellers() {
        fluentWait(getDriver(), forSellersBtn);
        waitForWebElementAndClick(forSellersBtn);
    }

    public void startNow() {
        fluentWait(getDriver(), startNowBtn);
        waitForWebElementAndClick(startNowBtn);
    }

    //Footer
    public void footerSell() {
        fluentWait(getDriver(), footerSellBtn);
        waitForWebElementAndClick(footerSellBtn);
    }

    public void footerBrowseListing() {
        fluentWait(getDriver(), footerBrowseListBtn);
        waitForWebElementAndClick(footerBrowseListBtn);
    }

    public void footerBrowseRequest() {
        fluentWait(getDriver(), footerBrowseRequestBtn);
        waitForWebElementAndClick(footerBrowseRequestBtn);
    }

    public void footerLogIn() {
        fluentWait(getDriver(), footerLogInBtn);
        waitForWebElementAndClick(footerLogInBtn);
    }

    public void footerSignUp() {
        fluentWait(getDriver(), footerSignUpBtn);
        waitForWebElementAndClick(footerSignUpBtn);
    }

    public void footerFAQS() {
        fluentWait(getDriver(), footerFAQSBtn);
        footerFAQSBtn.click();
    }

    public void footerTermsAndConditions() {
        fluentWait(getDriver(), footerTermsAndConditionsBtn);
        waitForWebElementAndClick(footerTermsAndConditionsBtn);
    }

    public void footerPrivacyPolicy() {
        fluentWait(getDriver(), footerPrivacyPolicyBtn);
        waitForWebElementAndClick(footerPrivacyPolicyBtn);
    }

    public void footerAboutUs() {
        fluentWait(getDriver(), footerAboutUsBtn);
        waitForWebElementAndClick(footerAboutUsBtn);
    }

    public void footerContactUs() {
        fluentWait(getDriver(), footerContactUsBtn);
        waitForWebElementAndClick(footerContactUsBtn);
    }

    //Social links
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
        fluentWait(getDriver(), footerYoutubePageBtn);
        waitForWebElementAndClick(footerYoutubePageBtn);
    }
    //Browse


}