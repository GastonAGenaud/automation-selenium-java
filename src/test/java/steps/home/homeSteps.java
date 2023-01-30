package steps.home;

import SessionManager.SessionManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.HomePage;

import java.io.IOException;

public class homeSteps extends BasePage {

    private HomePage _page;

    public homeSteps() {
        this._page = new HomePage();
    }

    @Given("I go to home page")
    public void iGoToHomePage() {
        ////_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.setHomePage();
    }

    @When("I validate the Browse button")
    public void iValidateTheBrowseButton() {
        _page.headerBrowse();
        _page.homeBack();
    }

    @And("I validate the Browse Request button")
    public void iValidateTheBrowseRequestButton() {
        _page.headerRequest();
        _page.homeBack();
    }

    @And("I validate the Log in button")
    public void iValidateTheLogInButton() {
        _page.headerLogIn();
        _page.homeBack();
    }

    @And("I validate the sing up button")
    public void iValidateTheSingUpButton() {
        _page.headerSignUp();
        _page.homeBack();
    }

    @And("I validate the Browse by seller button")
    public void iValidateTheBrowseBySellerButton() {
        _page.headerBrowseBySeller();
        _page.homeBack();
    }

    @Then("I validate the main header")

    //Header Categories

    @When("I validate the accessories section")
    public void iValidateTheAccessoriesSection() {
        _page.accessoriesMenuTab();
        _page.homeBack();
    }

    @And("I validate the More Accessories Button")
    public void iValidateTheMoreAccessoriesButton() {
        _page.moreAccessories();
        _page.homeBack();
    }


    @And("I validate the Jewelry section")
    public void iValidateTheJewelrySection() {
        _page.jewelry();
        _page.homeBack();
    }

    @And("I validate the More Jewelry Button")
    public void iValidateTheMoreJewelryButton() {
        _page.moreJewelry();
        _page.homeBack();
    }

    @And("I validate the Home & Living section")
    public void iValidateTheHomeLivingSection() {
        _page.homeLiving();
        _page.homeBack();
    }

    @And("I validate the More Home And Living Button")
    public void iValidateTheMoreHomeAndLivingButton() {
        _page.moreHomeAndLiving();
        _page.homeBack();
    }

    @And("I validate the Shoes section")
    public void iValidateTheShoesSection() {
        _page.shoes();
        //_page.shoesType();
        //_page.shoesDepartment();
        _page.homeBack();
    }

    @And("I validate the more Shoes button")
    public void iValidateTheMoreShoesButton() {
        _page.moreShoes();
        _page.homeBack();
    }


    @And("I validate the More section")
    public void iValidateTheMoreSection() {
        _page.moreCategories();
        _page.homeBack();
    }

    @Then("I validate the Header Section")

    //Buy And Sell

    @When("I validate the Buy section")
    public void iValidateTheBuySection() {
        //_page.buy();
        _page.buySearchTextField();
        _page.buySearchBtn();
        _page.homeBack();
    }

    @And("I validate the advanced search")
    public void iValidateTheAdvanceSearch() {
        //_page.buy();
        _page.buyAdvancedSearch();
        _page.homeBack();
    }

    @And("I validate the Sell section")
    public void iValidateTheSellSection() {
        _page.sellBtn();
        _page.startTodayBtn();
        _page.homeBack();
    }

    @When("I validate the Start Now button")
    public void iValidateTheStartNowButton() {
        _page.startNow();
        _page.homeBack();
    }

    @And("I validate the For Buyers Header section")
    public void iValidateTheForBuyersHeaderSection() {
        _page.homeBack();
        _page.forBuyers();
    }

    @And("I validate the For Sellers section")
    public void iValidateTheForSellersSection() {
        _page.forSellers();
    }

    @Then("I validate the Body")

    //Footer

    @When("I validate the sell button")
    public void iValidateTheSellButton() {
        _page.footerSell();
        _page.homeBack();
    }

    @And("I validate the Sing up now button")
    public void iValidateTheSingUpNowButton() {
        _page.footerSignUp();
        _page.homeBack();
    }

    @And("I validate the Footer Log In button")
    public void iValidateTheFooterLogInButton() {
        _page.footerLogIn();
        _page.homeBack();
    }


    @And("I validate the Browse Listing button")
    public void iValidateTheBrowseListingButton() {
        _page.footerBrowseListing();
        _page.homeBack();
    }

    @And("I validate the Browse Request")
    public void iValidateTheBrowseRequest() {
        _page.footerBrowseRequest();
        _page.homeBack();
    }

    @And("I validate the FAQ button")
    public void iValidateTheFAQButton() {
        _page.footerFAQS();
        _page.homeBack();
    }

    @And("I validate the Terms and Service button")
    public void iValidateTheTermsAndServiceButton() {
        _page.footerTermsAndConditions();
        _page.homeBack();
    }

    @And("I validate the Privacy Policy button")
    public void iValidateThePrivacyPolicyButton() {
        _page.footerPrivacyPolicy();
        _page.homeBack();
    }

    @And("I validate the About Us button")
    public void iValidateTheAboutUsButton() {
        _page.footerAboutUs();
        _page.homeBack();
    }

    @And("I validate the Contact Us button")
    public void iValidateTheContactUsButton() {
        _page.footerContactUs();
        _page.homeBack();
    }

    @Then("I validate the Footer Section")
    public void IValidateTheFooterSection() {
    }
    //Social links

    @When("I validate the Facebook icon")
    public void iValidateTheFacebookIcon() {
        _page.footerFacebookIcon();
    }

    @And("I validate the Instagram icon")
    public void iValidateTheInstagramIcon() {
        _page.footerInstagramIcon();
    }

    @And("I validate the Linkedin icon")
    public void iValidateTheLinkedinIcon() {
        _page.footerLinkedin();
    }

    @And("I validate the Twitter icon")
    public void iValidateTheTwitterIcon() {
        _page.footerTwitter();
    }

    @And("I validate the Youtube icon")
    public void iValidateTheYoutubeIcon() {
        _page.footerYoutube();
    }

    @Then("I validate the social links")
    public void iValidateTheSocialWithAccounts() {
    }
    //Main header
    @Given("I go to Home With Account")
    public void IgoToHomePage() {
        ////_driver.manage().window().setSize(new Dimension(2560, 1440));

    }

    @Then("I validate the Header Section with account")
    public void iValidateTheSectionWithAccounts() {
    }
    //Body

    @Then("I validate the footer with accounts")
    public void iValidateTheSocialLinksSectionWithAccounts() {
    }
    //Social Links

    @Then("I validate the social links section with account")
    public void iValidateTheSocialLinksSectionWithAccount() {
    }
    @Then("I validate the Body with account")
    public void iValidateTheBodyWithAccount() {
    }

    @And("I validate the clothing section")
    public void iValidateTheClothingSection() {
        _page.clothing();
        //_page.clothingDepartment();
        //_page.clothingTagsAndTest();
        //_page.clothingAnimals();
        _page.homeBack();
    }

    @And("I validate the more clothing button")
    public void iValidateTheMoreClothingButton() {
        _page.moreClothing();
        _page.homeBack();
    }

    @And("I validate the outdoor staff section")
    public void iValidateTheOutdoorStaffSection() {
        _page.outdoorStuff();
        _page.homeBack();
    }

    @And("I validate the more outdoor staff section")
    public void iValidateTheMoreOutdoorStaffSection() {
        _page.moreOutdoorStuff();
        _page.homeBack();
    }

    @And("I validate the art and collectables section")
    public void iValidateTheArtAndCollectablesSection() {
        _page.artAndCollectables();
        _page.homeBack();
    }

    @And("I validate the More art and collectables button")
    public void iValidateTheMoreArtAndCollectablesButton() {
        _page.moreArtAndCollectables();
        _page.homeBack();
    }

    @And("I validate the Men's button")
    public void iValidateTheMenSButton() {
        _page.mensHomeBtn();
    }

    @And("I validate the more Men's section")
    public void iValidateTheMoreMenSSection() {
        _page.moreMensBtn();
        _page.homeBack();
    }

    @And("I validate the hottest items button")
    public void iValidateTheHottestItemsButton() {
        _page.hottestItemsBtn();
    }

    @And("I validate the more hottest items section")
    public void iValidateTheMoreHottestItemsSection() {
        _page.moreHottestItemsBtn();
    }

    @And("I validate Rugs button")
    public void iValidateRugsButton() {
        _page.rugsHomeBtn();
    }

    @And("I validate the more Rugs section")
    public void iValidateTheMoreRugsSection() {
        _page.moreRugsBtn();
    }
    SessionManager sessionManager = new SessionManager(getDriver());

    @Before
    public void test() throws IOException {
        _page.setHomePage();
        _page.headerLogIn();
        _page.login();
        sessionManager.storeSessionFile("sesionPrueba");
        _page.homeBack();

    }

    @Given("login bypass")
    public void iLoginBypass() {
        wait(10);
        sessionManager.usePreviousLoggedInSession("sesionPrueba");
        wait(4);
        getDriver().navigate().refresh();
        wait(10);
    }

}