package steps.home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.home.OHEHomePage;

import java.io.IOException;

public class OHEHomeSteps extends BasePage {

    private OHEHomePage _page;

    public OHEHomeSteps() {

        this._page = new OHEHomePage();

    }

    @Given("I go to owl home page")
    public void iGoToOwlHomePage() {
        ////_driver.manage().window().setSize(new Dimension(1920, 1080));
        _page.goToOwlHomePage();
    }

    @When("I select browse services")
    public void iSelectBrowseServices() {
        _page.headerBrowseServices();
    }

    @And("I select login")
    public void iSelectLogin() {
        _page.headerLogin();
    }

    @And("I select browse requests")
    public void iSelectBrowseRequests() {
        _page.footerBrowseRequests();
    }

    @And("I select sign up")
    public void iSelectSignUp() {
        _page.headerSignUp();
    }

    @Then("I validate the home main header")
    public void iValidateTheHomeMainHeader() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @When("I validate the owl Facebook icon")
    public void iValidateTheFacebookIcon() {
        _page.footerFacebookIcon();
    }

    @And("I validate the owl Instagram icon")
    public void iValidateTheInstagramIcon() {
        _page.footerInstagramIcon();
    }

    @And("I validate the owl Linkedin icon")
    public void iValidateTheLinkedinIcon() {
        _page.footerLinkedin();
    }

    @And("I validate the owl Twitter icon")
    public void iValidateTheTwitterIcon() {
        _page.footerTwitter();
    }

    @And("I validate the owl Youtube icon")
    public void iValidateTheYoutubeIcon() {
        _page.footerYoutube();
        _page.goToOwlHomePage();
    }

    @Then("I validate the owl social links")
    public void iValidateTheSocialWithAccounts() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @When("I select ages 5 to 8 option")
    public void iSelectAges5To8Option() {
        _page.ages5to8();
    }
    @And("I select ages 9 to 11 option")
    public void iSelectAges9To11Option() {
        _page.ages9to11();
    }
    @And("I select ages 12 to 14 option")
    public void iSelectAges12To14Option() {
        _page.ages12to14();
    }
    @And("I select ages 15 to 17 option")
    public void iSelectAges15To17Option() {
        _page.ages15to17();
    }

    @And("I select More option")
    public void iSelectMoreOption() {
        _page.categoryMore();
    }

    @Then("I validate the home menu")
    public void iValidateTheHomeMenu() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @When("I select Provide button")
    public void iSelectProvideButton() {
        _page.provideOption();
    }

    @And("I select start now button")
    public void iSelectStartNowButton() {
        _page.startNowButton();
    }

    @And("I select Hire button")
    public void iSelectHireButton() {
        _page.hireOption();
    }

    @And("I type in the search field")
    public void iTypeInTheSearchField() {
        _page.hireSearch();
    }

    @And("I select the search button")
    public void iSelectTheSearchButton() {
        _page.hireSearchButton();
    }

    @And("I select the advance search button")
    public void iSelectTheAdvanceSearchButton() {
        _page.advancedSearchBtn();
    }

    @And("I select see all in the browse by category section")
    public void iSelectSeeAllInTheBrowseByCategorySection() {
        _page.seeAllBrowseByCategory();
    }

    @And("I select see all in the featured providers section")
    public void iSelectSeeAllInTheFeaturedProvidersSection() {
        _page.seeAllFeaturedProviders();
    }

    @And("I select see all in the newest providers section")
    public void iSelectSeeAllInTheNewestProvidersSection() {
        _page.seeAllNewestProviders();
    }

    @And("I select for providers button")
    public void iSelectForProvidersButton() {
        _page.forProvidersButton();
    }

    @And("I select for seekers button")
    public void iSelectForSeekersButton() {
        _page.forSeekersButton();
    }

    @And("I select sign up now button")
    public void iSelectSignUpNowButton() {
        _page.signUpNowButton();
    }

    @Then("I validate the home body")
    public void iValidateTheHomeBody() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @When("I select footer browse request button")
    public void iSelectFooterBrowseRequestButton() {
        _page.footerBrowseRequests();
    }

    @And("I select footer log in button")
    public void iSelectFooterLogInButton() {
        _page.footerLogin();
    }

    @And("I select footer sign up button")
    public void iSelectFooterSignUpButton() {
        _page.footerSignup();
    }

    @And("I select footer browse classes button")
    public void iSelectFooterUploadYourServicesButton() {
        _page.footerBrowseClass();
    }

    @And("I select footer FAQ button")
    public void iSelectFooterFAQButton() {
        _page.footerFAQ();
    }

    @And("I select footer terms and service button")
    public void iSelectFooterTermsAndServiceButton() {
        _page.footerTermsAndService();
    }

    @And("I select footer privacy policy button")
    public void iSelectFooterPrivacyPolicyButton() {
        _page.footerPrivacyPolicy();
    }

    @And("I select footer about us button")
    public void iSelectFooterAboutUsButton() {
        _page.footerAboutUs();
    }

    @And("I select footer contact button")
    public void iSelectFooterContactButton() {
        _page.footerContact();
    }

    @Then("I validate the home footer section")
    public void iValidateTheHomeFooterSection() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @Given("I login")
    public void iLogin() throws IOException {
        //_page.goToLoginPage();
        _page.generateLoginWithGastonUser();
    }

    @And("I select inbox icon button")
    public void iSelectInboxIconButton() {
        _page.headerInbox();
    }

    @And("I select cart icon button")
    public void iSelectCartIconButton() {
        _page.headerCartIcon();
    }

    @Then("I validate the main header with account")
    public void iValidateTheMainHeaderWithAccount() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @When("I select footer browse requests button")
    public void iSelectFooterBrowseRequestsButton() {
        _page.footerBrowseRequests();
    }

    @Then("I validate the home footer section with account")
    public void iValidateTheHomeFooterSectionWithAccount() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }


}