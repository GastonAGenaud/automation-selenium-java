package steps.home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.home.ServicesHomePage;

import java.io.IOException;

public class ServicesHomeSteps extends BasePage {

    private ServicesHomePage _page;

    public ServicesHomeSteps() {

        this._page = new ServicesHomePage();

    }

    @Given("SVC I go to owl Svc page")
    public void iGoToSvcHomePage() {
        //_driver.manage().window().setSize(new Dimension(1920, 1080));
        _page.iGoToSvcHomePage();
    }
    

    @When("SVC I select browse services")
    public void iSelectBrowseServices() {
        _page.headerBrowseServices();
    }

    @And("SVC I select login")
    public void iSelectLogin() {
        _page.headerLogin();
    }

   @And("SVC I select browse requests")
    public void iSelectBrowseRequests() {
        _page.footerBrowseRequests();
    }

    @And("SVC I select sign up")
    public void iSelectSignUp() {
        _page.headerSignUp();
    }

    @Then("SVC I validate the home main header")
    public void iValidateTheHomeMainHeader() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @When("SVC I validate the owl Facebook icon")
    public void iValidateTheFacebookIcon() {
        _page.footerFacebookIcon();
    }

    @And("SVC I validate the owl Instagram icon")
    public void iValidateTheInstagramIcon() {
        _page.footerInstagramIcon();
    }

    @And("SVC I validate the owl Linkedin icon")
    public void iValidateTheLinkedinIcon() {
        _page.footerLinkedin();
    }

    @And("SVC I validate the owl Twitter icon")
    public void iValidateTheTwitterIcon() {
        _page.footerTwitter();
    }

    @And("SVC I validate the owl Youtube icon")
    public void iValidateTheYoutubeIcon() {
        _page.footerYoutube();
        _page.iGoToSvcHomePage();
    }

    @Then("SVC I validate the owl social links")
    public void iValidateTheSocialWithAccounts() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @When("SVC I select ages 5 to 8 option")
    public void iSelectAges5To8Option() {
        _page.ages5to8();
    }
    @And("SVC I select ages 9 to 11 option")
    public void iSelectAges9To11Option() {
        _page.ages9to11();
    }
    @And("SVC I select ages 12 to 14 option")
    public void iSelectAges12To14Option() {
        _page.ages12to14();
    }
    @And("SVC I select ages 15 to 17 option")
    public void iSelectAges15To17Option() {
        _page.ages15to17();
    }

    @And("SVC I select More option")
    public void iSelectMoreOption() {
        _page.categoryMore();
    }

    @Then("SVC I validate the home menu")
    public void iValidateTheHomeMenu() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @When("SVC I select Provide button")
    public void iSelectProvideButton() {
        _page.provideOption();
    }

    @And("SVC I select start now button")
    public void iSelectStartNowButton() {
        _page.startNowButton();
    }

    @And("SVC I select Hire button")
    public void iSelectHireButton() {
        _page.hireOption();
    }

    @And("SVC I type in the search field")
    public void iTypeInTheSearchField() {
        _page.hireSearch();
    }

    @And("SVC I select the search button")
    public void iSelectTheSearchButton() {
        _page.hireSearchButton();
    }

    @And("SVC I select the advance search button")
    public void iSelectTheAdvanceSearchButton() {
        _page.advancedSearchBtn();
    }

    @And("SVC I select see all in the browse by category section")
    public void iSelectSeeAllInTheBrowseByCategorySection() {
        _page.seeAllBrowseByCategory();
    }

    @And("SVC I select see all in the featured providers section")
    public void iSelectSeeAllInTheFeaturedProvidersSection() {
        _page.seeAllFeaturedProviders();
    }

    @And("SVC I select see all in the newest providers section")
    public void iSelectSeeAllInTheNewestProvidersSection() {
        _page.seeAllNewestProviders();
    }

    @And("SVC I select for providers button")
    public void iSelectForProvidersButton() {
        _page.forProvidersButton();
    }

    @And("SVC I select for seekers button")
    public void iSelectForSeekersButton() {
        _page.forSeekersButton();
    }

    @And("SVC I select sign up now button")
    public void iSelectSignUpNowButton() {
        _page.signUpNowButton();
    }

    @Then("SVC I validate the home body")
    public void iValidateTheHomeBody() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @When("SVC I select footer browse request button")
    public void iSelectFooterBrowseRequestButton() {
        _page.footerBrowseRequests();
    }

    @And("SVC I select footer log in button")
    public void iSelectFooterLogInButton() {
        _page.footerLogin();
    }

    @And("SVC I select footer sign up button")
    public void iSelectFooterSignUpButton() {
        _page.footerSignup();
    }

    @And("SVC I select footer browse classes button")
    public void iSelectFooterUploadYourServicesButton() {
        _page.footerBrowseClass();
    }

    @And("SVC I select footer FAQ button")
    public void iSelectFooterFAQButton() {
        _page.footerFAQ();
    }

    @And("SVC I select footer terms and service button")
    public void iSelectFooterTermsAndServiceButton() {
        _page.footerTermsAndService();
    }

    @And("SVC I select footer privacy policy button")
    public void iSelectFooterPrivacyPolicyButton() {
        _page.footerPrivacyPolicy();
    }

    @And("SVC I select footer about us button")
    public void iSelectFooterAboutUsButton() {
        _page.footerAboutUs();
    }

    @And("SVC I select footer contact button")
    public void iSelectFooterContactButton() {
        _page.footerContact();
    }

    @Then("SVC I validate the home footer section")
    public void iValidateTheHomeFooterSection() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @Given("SVC I login")
    public void SVCiLogin() throws IOException {
        _page.goToLoginPage();
        _page.iLoginWithGastonUserServices();
//        _page.loginWithGastonUserSVC();
    }

    @And("SVC I select inbox icon button")
    public void iSelectInboxIconButton() {
        _page.headerInbox();
    }

    @And("SVC I select cart icon button")
    public void iSelectCartIconButton() {
        _page.headerCartIcon();
    }

    @Then("SVC I validate the main header with account")
    public void iValidateTheMainHeaderWithAccount() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }

    @When("SVC I select footer browse requests button")
    public void iSelectFooterBrowseRequestsButton() {
        _page.footerBrowseRequests();
    }

    @Then("SVC I validate the home footer section with account")
    public void iValidateTheHomeFooterSectionWithAccount() {
        Assert.assertEquals(_page.OwlHomeVerify(),true);
    }


}