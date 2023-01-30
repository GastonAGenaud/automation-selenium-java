package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


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
    @FindBy(xpath = "/html/body/header/div/ul/li[1]/a")
    public WebElement accessoriesBtn;
    @FindBy(how = How.CSS, using = "#dropdown-nav-7 > li > a")
    public WebElement moreAccessoriesBtn;
    //Clothing
    @FindBy(how = How.CSS, using = "#cats-father > li:nth-child(3) > span")
    public WebElement clothingBtn;

    @FindBy(xpath = "/html/body/header/div/div/div[3]/div/div/div/div[1]/ul/li")
    public WebElement moreClothingBtn;
    @FindBy(xpath = "/html/body/header/div/ul/li[4]/a")
    public WebElement homeLivingBtn;

    @FindBy(xpath = "/html/body/header/div/div/div[4]/div/div/div/div[1]/ul/li/a")
    public WebElement moreHomeAndLivingBtn;
    @FindBy(how = How.CSS, using = "#\\31 -tab")
    public WebElement jewelryBtn;
    @FindBy(how = How.CSS, using = "#dropdown-nav-1 > li > a")
    public WebElement moreJewelryBtn;
    @FindBy(how = How.CSS, using = "#\\33 -tab")
    public WebElement shoesBtn;

    @FindBy(how = How.CSS, using = "#dropdown-nav-3 > li:nth-child(3) > a")
    public WebElement moreShoesBtn;
    @FindBy(how = How.CSS, using = "#\\38 4-tab")
    public WebElement outdoorStuffBtn;
    @FindBy(how = How.CSS, using = "#dropdown-nav-84 > li > a")
    public WebElement moreOutdoorStuffBtn;
    @FindBy(how = How.CSS, using = "#\\33 16-tab")
    public WebElement artAndCollectablesBtn;
    @FindBy(how = How.CSS, using = "#dropdown-nav-316 > li > a")
    public WebElement moreArtAndCollectablesBtn;
    @FindBy(how = How.CSS, using = "#more-tab")
    public WebElement moreBtn;
    //Image
    @FindBy(how = How.CSS, using = "#nav-buy-tab")
    public WebElement buyBtn;
    @FindBy(how = How.CSS, using = "body > header > nav > div > a")
    public WebElement homeBackBtn;
    @FindBy(how = How.CSS, using = "#searchCarousel")
    public WebElement buySearchTextField;
    @FindBy(how = How.CSS, using = "#nav-buy-carousel > div > div.d-flex.align-items-center.justify-content-between.mb-4 > button")
    public WebElement buySearchBtn;
    @FindBy(how = How.CSS, using = "#nav-buy-carousel > div > div:nth-child(2) > a")
    public WebElement buyAdvancedSearch;
    @FindBy(xpath = "/html/body/div[3]/main/div[1]/div[2]/div/div[3]/div/div/nav/div/a[2]")
    public WebElement sellBtn;
    @FindBy(how = How.CSS, using = "#nav-sell-carousel > button")
    public WebElement startTodayBtn;

    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[3]/div/div/nav/div/a[1]")
    public WebElement forBuyersBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[3]/div/div/nav/div/a[2]")
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

    @FindBy(how = How.CSS, using = "#\\33 20-tab")
    public WebElement hottestItemsBtn;

    @FindBy(how = How.CSS, using = "#dropdown-nav-320 > li:nth-child(2) > a")
    public WebElement moreHottestItemsBtn;

    @FindBy(how = How.CSS, using = "#\\32 32-tab")
    public WebElement rugsHomeBtn;

    @FindBy(how = How.CSS, using = "#dropdown-nav-232 > li > a")
    public WebElement moreRugsBtn;

    //LOG IN
    public void login() {
        emailLoginInput.click();
        emailLoginInput.sendKeys("dev@mymarketplacebuilder.com");
        passwordLoginInput.click();
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
        headerBrowseBtn.click();
    }

    public void headerRequest() {
        headerRequestBtn.click();
    }

    public void headerLogIn() {
        headerLogInBtn.click();
    }

    public void headerSignUp() {
        headerSignUpBtn.click();
    }

    public void headerBrowseBySeller() {
        headerBrowseBySellerBtn.click();
    }

    //Menu
    public void accessoriesMenuTab() {
        goToHome();
        accessoriesBtn.click();
    }


    public void mensHomeBtn() {
        mensHomeBtn.click();
    }

    public void moreMensBtn() {
        actions.moveToElement(mensHomeBtn).perform();
        moreMensBtn.click();
    }

    public void hottestItemsBtn() {
        hottestItemsBtn.click();
    }

    public void moreHottestItemsBtn() {
        moreHottestItemsBtn.click();
    }

    public void rugsHomeBtn() {
        rugsHomeBtn.click();
    }

    public void moreRugsBtn() {
        moreRugsBtn.click();
    }

    public void moreAccessories() {
        actions.moveToElement(accessoriesBtn).perform();
        moreAccessoriesBtn.click();
    }

    public void clothing() {
        clothingBtn.click();
    }


    public void moreClothing() {
        actions.moveToElement(clothingBtn).perform();
        moreClothingBtn.click();
    }

    public void homeLiving() {
        waitForVisibility(homeLivingBtn);
        homeLivingBtn.click();
    }


    public void moreHomeAndLiving() {
        actions.moveToElement(homeLivingBtn).perform();
        moreHomeAndLivingBtn.click();
    }

    public void jewelry() {
        jewelryBtn.click();
    }

    public void moreJewelry() {
        actions.moveToElement(jewelryBtn).perform();
        moreJewelryBtn.click();
    }

    public void shoes() {
        shoesBtn.click();
    }


    public void moreShoes() {
        actions.moveToElement(shoesBtn).perform();
        moreShoesBtn.click();
    }

    public void outdoorStuff() {
        outdoorStuffBtn.click();
    }

    public void moreOutdoorStuff() {
        actions.moveToElement(outdoorStuffBtn).perform();
        moreOutdoorStuffBtn.click();
    }

    public void artAndCollectables() {
        artAndCollectablesBtn.click();
    }

    public void moreArtAndCollectables() {
        actions.moveToElement(artAndCollectablesBtn).perform();
        moreArtAndCollectablesBtn.click();
    }

    public void moreCategories() {
        waitForVisibility(moreBtn);
        moreBtn.click();
    }

    //Image
    public void buy() {
        buyBtn.click();
    }

    public void buySearchTextField() {
        buySearchTextField.click();
        buySearchTextField.sendKeys("Test Search");
    }

    public void buySearchBtn() {
        buySearchBtn.click();
    }

    public void buyAdvancedSearch() {
        buyAdvancedSearch.click();
    }

    public void sellBtn() {
        actions.moveToElement(sellBtn);
        sellBtn.click();
        sellBtn.click();
        sellBtn.click();
    }

    public void startTodayBtn() {
        startTodayBtn.click();
    }

    public void homeBack() {
        homeBackBtn.click();
    }

    public void forBuyers() {
        wait(2);
        actions.moveToElement(forBuyersBtn).build().perform();
        forBuyersBtn.click();
    }

    public void forSellers() {
        actions.moveToElement(forSellersBtn).build().perform();
        forSellersBtn.click();
        waitForVisibility(forSellersBtn);
    }

    public void startNow() {
        startNowBtn.click();
    }

    //Footer
    public void footerSell() {
        footerSellBtn.click();
    }

    public void footerBrowseListing() {
        footerBrowseListBtn.click();
    }

    public void footerBrowseRequest() {
        footerBrowseRequestBtn.click();
    }

    public void footerLogIn() {
        footerLogInBtn.click();
    }

    public void footerSignUp() {
        footerSignUpBtn.click();
    }

    public void footerFAQS() {
        footerFAQSBtn.click();
    }

    public void footerTermsAndConditions() {
        footerTermsAndConditionsBtn.click();
    }

    public void footerPrivacyPolicy() {
        footerPrivacyPolicyBtn.click();
    }

    public void footerAboutUs() {
        footerAboutUsBtn.click();
    }

    public void footerContactUs() {
        footerContactUsBtn.click();
    }

    //Social links
    public void footerFacebookIcon() {
        footerFacebookPageBtn.click();
    }

    public void footerInstagramIcon() {
        footerInstagramPageBtn.click();
    }

    public void footerLinkedin() {
        footerLinkedinPageBtn.click();
    }

    public void footerTwitter() {
        footerTwitterPageBtn.click();
    }

    public void footerYoutube() {
        footerYoutubePageBtn.click();
    }
    //Browse


}