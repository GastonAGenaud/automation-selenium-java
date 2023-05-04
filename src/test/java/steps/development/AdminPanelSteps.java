package steps.development;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.development.AdminPanelPage;

import java.io.IOException;


public class AdminPanelSteps extends BasePage {

    private AdminPanelPage _page;

    public AdminPanelSteps() {

        this._page = new AdminPanelPage();
    }

   // @Before
    public void testSignup() throws IOException {
      _page.loginDevSVC();
      _page.loginWithGastonUserSVC();
      _page.loginWithMatiasOwl();
    }

    @When("I select Users tab")
    public void iSelectUsersTab() {
        _page.setUsersBtn();
        _page.getCloseChat();
    }

    @And("go to Admin Panel")
    public void goToAdminPanel() {
        getDriver().navigate().to(UrlDevProducts + "/Admin/application/getstarted");
        _page.getCloseChat();
    }

    @And("Select Action button")
    public void selectActionButton() {
        _page.getCloseChat();
        _page.selectActionButton();
    }

    @And("select Impersonate Button")
    public void selectImpersonateButton() {
        _page.impersonateOption();
    }

    @Then("I validate action sector in Admin panel - Users")
    public void iValidateActionSectorInAdminPanelUsers() {
        _page.impersonateValidation();
    }

    @And("complete search filter")
    public void completeSearchFilter() {
        _page.searchUser();
    }

    @Then("I validate Filter sector in Admin panel - Users")
    public void iValidateFilterSectorInAdminPanelUsers() {
        _page.userResult();
    }

    @And("select Filter button")
    public void selectFilterButton() {
        _page.filterButton();
    }

    @Then("I validate redirection to Site Wording")
    public void iValidateRedirectionToSiteWording() {
        getDriver().navigate().to(UrlDevProducts + "admin/application/GlobalSettings");
        _page.siteWording();
    }

    @And("I validate elements in Site Wording")
    public void iValidateElementsInSiteWording() {
        _page.siteWordingText();
        _page.searchAndLanguageSection();
        _page.templateSector();
    }

    @And("I validate redirection to Company Info")
    public void iValidateRedirectionToCompanyInfo() {
        getDriver().navigate().to(UrlDevProducts + "admin/application/companyinfo");
        _page.companyInfo();
    }

    @And("validate elements in Company Info")
    public void validateElementsInCompanyInfo() {
        _page.settingsTitleSector();
        _page.companyInfoSubscriptionSector();
    }

    @And("I validate redirection to Payment Info")
    public void iValidateRedirectionToPaymentInfo() {
        getDriver().navigate().to(UrlDevProducts + "admin/application/StripeSettings");
        _page.paymentInfo();
    }

    @And("validate elements in Payment Info")
    public void validateElementsInPaymentInfo() {
        _page.stripeSettingsSector();
        _page.stripeTemplateSector();
    }

    @And("I validate redirection to Site MetaTags")
    public void iValidateRedirectionToSiteMetaTags() {
        getDriver().navigate().to(UrlDevProducts + "admin/application/MetaTags");
        _page.siteMetaTags();
    }

    @And("validate elements in Site MetaTags")
    public void validateElementsInSiteMetaTags() {
        _page.seoSetupTxt();
        _page.tabsSector();
        _page.siteTagsTemplate();
    }

    @And("I validate redirection to Requests Setup")
    public void iValidateRedirectionToRequestsSetup() {
        getDriver().navigate().to(UrlDevProducts + "admin/application/RequestsSetup");
        _page.requestsSetup();
    }

    @And("validate elements in Requests Setup")
    public void validateElementsInRequestsSetup() {
        _page.requestTitleText();
        _page.requestsTemplateSector();
    }

    @And("I validate redirection to Browse config")
    public void iValidateRedirectionToBrowseConfig() {
        getDriver().navigate().to(UrlDevProducts + "admin/application/BrowseConfig");
        _page.browseConfig();
    }

    @And("validate elements in Browse config")
    public void validateElementsInBrowseConfig() {
        _page.BrowseConfigTxt();
        _page.browseConfigTemplateSector();
    }

    @And("I validate redirection to SMS Settings")
    public void iValidateRedirectionToSMSSettings() {
        getDriver().navigate().to(UrlDevProducts + "admin/application/SmsSettings");
        _page.smsSettings();
    }

    @And("validate elements in SMS Settings")
    public void validateElementsInSMSSettings() {
        _page.smsTitleText();
        _page.smsTemplateSector();
    }

    @And("I validate redirection to Orders Setup")
    public void iValidateRedirectionToOrdersSetup() {
        getDriver().navigate().to(UrlDevProducts + "admin/application/OrdersSetup");
        _page.ordersSetup();
    }

    @And("validate elements in Orders Setup")
    public void validateElementsInOrdersSetup() {
        _page.ordersTitleText();
    }
}


