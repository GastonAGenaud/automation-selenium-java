package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.AdminPanelDevPage;

import java.io.IOException;

public class AdminPanelDevSteps extends BasePage {
    private AdminPanelDevPage _page;

    public AdminPanelDevSteps() {

        this._page = new AdminPanelDevPage();
    }

    @And("go to Dashboard Serv")
    public void goToDashboardServ() {
        _page.goToDashboardServ();
    }

    @When("go to Admin Panel Serv")
    public void goToAdminPanelServ() {
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @And("select step {int}")
    public void selectStep(int arg0) {
        _page.selectStepEight();
    }

    @Then("validate step {int}")
    public void validateStep(int arg0) {
        Assert.assertEquals("TEMPLATES", _page.validatetTemplates());
        Assert.assertEquals("SMTP SETTINGS", _page.validateSMTPSettings());
    }

    @And("select Automated Emails section")
    public void selectAutomatedEmailsSection() {
        _page.automatedEmailsSection();
    }

    @And("validate Automated Emails section")
    public void validateAutomatedEmailsSection() {
        Assert.assertEquals("TEMPLATES", _page.validatetTemplates());
        Assert.assertEquals("SMTP SETTINGS", _page.validateSMTPSettings());
    }

    @And("go to home Serv")
    public void goToHomeServ() {
        _page.goToHomePage();
    }

    @When("select Contact Us")
    public void selectContactUs() {
        _page.selectContactUsSection();
    }

    @And("complete the form the Contact Us")
    public void completeTheFormTheContactUs() {
        _page.selectNameField();
        _page.selectEmailField();
        _page.selectMessage();
        _page.selectSend();
    }

    @Then("valid The complete form")
    public void validTheCompleteForm() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @When("I select Users tab Serv")
    public void iSelectUsersTabServ() {
        _page.setUsersBtn();
        _page.getCloseChat();
    }

    @And("complete search filter Serv")
    public void completeSearchFilterServ() {
        _page.searchUser();
    }

    @Then("I validate Filter sector in Admin panel - Users Serv")
    public void iValidateFilterSectorInAdminPanelUsersServ() {
        _page.userResult();
    }

    @Then("I validate redirection to Site Wording Serv")
    public void iValidateRedirectionToSiteWordingServ() {
        getDriver().navigate().to(UrlSVC + "admin/application/GlobalSettings");
        _page.siteWording();
    }

    @And("I validate elements in Site Wording Serv")
    public void iValidateElementsInSiteWordingServ() {
        _page.siteWordingText();
        _page.searchAndLanguageSection();
        _page.templateSector();
    }

    @And("I validate redirection to Company Info Serv")
    public void iValidateRedirectionToCompanyInfoServ() {
        getDriver().navigate().to(UrlSVC + "admin/application/companyinfo");
        _page.companyInfo();
    }

    @And("validate elements in Company Info Serv")
    public void validateElementsInCompanyInfoServ() {
        _page.settingsTitleSector();
        _page.companyInfoSubscriptionSector();
    }

    @And("I validate redirection to Payment Info Serv")
    public void iValidateRedirectionToPaymentInfoServ() {
        getDriver().navigate().to(UrlSVC + "admin/application/StripeSettings");
        _page.paymentInfo();
    }

    @And("validate elements in Payment Info Serv")
    public void validateElementsInPaymentInfoServ() {
        _page.stripeSettingsSector();
        _page.stripeTemplateSector();
    }

    @And("I validate redirection to Site MetaTags Serv")
    public void iValidateRedirectionToSiteMetaTagsServ() {
        getDriver().navigate().to(UrlSVC + "admin/application/MetaTags");
        _page.siteMetaTags();
    }

    @And("validate elements in Site MetaTags Serv")
    public void validateElementsInSiteMetaTagsServ() {
        _page.seoSetupTxt();
        _page.tabsSector();
        _page.siteTagsTemplate();
    }

    @And("I validate redirection to Requests Setup Serv")
    public void iValidateRedirectionToRequestsSetupServ() {
        getDriver().navigate().to(UrlSVC + "admin/application/RequestsSetup");
        _page.requestsSetup();
    }

    @And("validate elements in Requests Setup Serv")
    public void validateElementsInRequestsSetupServ() {
        _page.requestTitleText();
        _page.requestsTemplateSector();
    }

    @And("I validate redirection to Browse config Serv")
    public void iValidateRedirectionToBrowseConfigServ() {
        getDriver().navigate().to(UrlSVC + "admin/application/BrowseConfig");
        _page.browseConfig();
    }

    @And("validate elements in Browse config Serv")
    public void validateElementsInBrowseConfigServ() {
        _page.BrowseConfigTxt();
        _page.browseConfigTemplateSector();
    }

    @And("I validate redirection to SMS Settings Serv")
    public void iValidateRedirectionToSMSSettingsServ() {
        getDriver().navigate().to(UrlSVC + "admin/application/SmsSettings");
        _page.smsSettings();
    }

    @And("validate elements in SMS Settings Serv")
    public void validateElementsInSMSSettingsServ() {
        _page.smsTitleText();
        _page.smsTemplateSector();
    }

    @And("I validate redirection to Orders Setup Serv")
    public void iValidateRedirectionToOrdersSetupServ() {
        getDriver().navigate().to(UrlSVC + "admin/application/OrdersSetup");
        _page.ordersSetup();
    }

    @And("validate elements in Orders Setup Serv")
    public void validateElementsInOrdersSetupServ() {
        _page.ordersTitleText();
    }

    @Given("PSVC I go to Admin design")
    public void PSVCAdminDesign() {
        _page.setHomePage();
        _page.iLoginWithGastonUserServices();
        _page.goToAdminPanel();
        _page.getCloseChat();
    }


    @When("PSVC I validate customize landing page option")
    public void PSVCIValidateCustomizeLandingPageOption() {
        //_page.designSection();
        _page.customizeLandingPage();
        _page.getCloseChat();
        _page.customizeLandingPageHeader();
        _page.customizeLandingPageFooter();
        _page.customizeLandingPageSocialLinks();
        _page.customizeLandingPageFonts();
        _page.customizeLandingPageColors();
        _page.customizeLandingPageLogo();
    }

    @And("PSVC I validate customize menu option")
    public void PSVCIValidateCustomizeMenuOption() {
        //_page.designSection();
        _page.customizeMenu();
    }

    @And("PSVC I validate customize login page option")
    public void PSVCIValidateCustomizeLoginPageOption() {
        _page.designSection();
        _page.customizeLogIn();
    }

    @And("PSVC I validate customize sign up page option")
    public void PSVCIValidateCustomizeSignUpPageOption() {
        //_page.designSection();
        _page.customizeSignUp();
    }

    @And("PSVC I validate customize Terms & conditions page option")
    public void PSVCIValidateCustomizeTermsConditionsPageOption() {
        _page.designSection();
        _page.customizeTermsAndConditions();
    }

    @Then("PSVC I validate Admin Design")
    public void PSVCIValidateAdminDesign() {
        Assert.assertEquals("Customize your Terms & Conditions page", _page.faqConfirm());
    }

}
