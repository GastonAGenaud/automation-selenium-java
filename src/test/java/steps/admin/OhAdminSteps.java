package steps.admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.admin.OhAdminPage;

public class OhAdminSteps extends BasePage {

    private OhAdminPage _page;

    public OhAdminSteps() {

        this._page = new OhAdminPage();
    }

    @Given("OHE I go to Admin page")
    public void iGoToAdminPage(){
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.setHomePage();
        _page.login();
        _page.goToAdminPanel();
        _page.getCloseChat();

    }

    @When("OHE I validate step 1 Create your marketplace")
    public void oheIValidateStepCreateYourMarketplace() {
        _page.createMarketplace();
    }

    @And("OHE I validate step 2 Select your homepage layout")
    public void oheIValidateStepSelectYourHomepageLayout() {
        _page.goToAdminPanel();
        //_page.setHomePage();
    }

    @And("OHE I validate step 3 design your homepage")
    public void oheIValidateStepDesignYourHomepage() {
        _page.goToAdminPanel();
        _page.designYourHomePage();
    }

    @And("OHE I validate step 4 create categories")
    public void oheIValidateStepCreateCategories() {
        _page.goToAdminPanel();
        _page.createCategories();
    }

    @And("OHE I validate step 5 create custom fields & filters")
    public void oheIValidateStepCreateCustomFieldsFilters() {
        _page.goToAdminPanel();
        _page.createCustomFields();
    }

    @And("OHE I validate step 8 emails")
    public void oheIValidateStepEmails() {
        _page.goToAdminPanel();
        _page.emailStep();
    }

    @And("OHE I validate step 6 connect domain")
    public void oheIValidateStepConnectDomain() {
        _page.goToAdminPanel();
        _page.connectDomain();
    }

    @And("OHE I validate step 7 Google Locations")
    public void oheIValidateStepGoogleLocations() {
        _page.goToAdminPanel();
        _page.socialLogin();
    }

    @And("OHE I validate step 9 create a request or add a listing")
    public void oheIValidateStepCreateARequestOrAddAListing() {
    }

    @Then("OHE I see all the functionalities in the administration panel for the user")
    public void oheISeeAllTheFunctionalitiesInTheAdministrationPanelForTheUser() {
        _page.validateAdminPanel();
    }

    @Given("OHE Step 2: Select your homepage layout")
    public void oheStepSelectYourHomepageLayout() {
        _page.setHomePage();
        _page.login();
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("OHE I validate the options")
    public void oheIValidateTheOptions() {
        //_page.landingPageLayout();
    }

    @And("OHE I validate the next button")
    public void oheIValidateTheNextButton() {
    }

    @Then("OHE I see the Step 3")
    public void oheISeeTheStep() {
    }

    @Given("OHE Step 4: Create Categories")
    public void oheStepCreateCategories() {
        _page.setHomePage();
        _page.login();
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.createCategories();
    }

    @When("OHE I validate the Import data button")
    public void oheIValidateTheImportDataButton() {
        _page.categoriesImportData();
    }

    @And("OHE I type on category name field")
    public void oheITypeOnCategoryNameField() {
        _page.typeOnCategoryNameField();
    }

    @And("OHE I validate the Add Category")
    public void oheIValidateTheAddCategory() {
        _page.addCategory();
        _page.deleteCategory();
    }

    @And("OHE I validate the category name")
    public void oheIValidateTheCategoryName() {
    }

    @Then("OHE I see that the add category button adds the category with the name set in the text bar")
    public void oheISeeThatTheAddCategoryButtonAddsTheCategoryWithTheNameSetInTheTextBar() {
    }

    @Given("OHE Step 5: Create Custom Fields and Filters")
    public void oheStepCreateCustomFieldsAndFilters() {
        _page.setHomePage();
        _page.login();
        _page.goToAdminPanel();
        _page.createCustomFields();
        _page.getCloseChat();
    }

    @When("OHE I validate the hide button")
    public void oheIValidateTheHideButton() {
        _page.CustomFieldsHideHowItWorks();
    }

    @And("OHE I validate the show button")
    public void oheIValidateTheShowButton() {
        _page.CustomFieldsShowHowItWorks();
    }

    @And("OHE I validate the listing page.jpg button")
    public void oheIValidateTheListingPageJpgButton() {
        _page.listingPagePreviewImage();
    }

    @And("OHE I validate the browse page.jpg button")
    public void oheIValidateTheBrowsePageJpgButton() {
        _page.browsePagePreviewImage();
    }

    @And("OHE I validate the upload a listing.jpg button")
    public void oheIValidateTheUploadAListingJpgButton() {
        _page.uploadAListingPreviewImage();
    }

    @And("OHE I validate the table")
    public void oheIValidateTheTable() {
    }

    @And("OHE I validate the text button")
    public void oheIValidateTheTextButton() {
        _page.AddNewFieldsText();
    }

    @And("OHE I validate the number button")
    public void oheIValidateTheNumberButton() {
        _page.AddNewFieldsNumber();
    }

    @And("OHE I validate the dropdown button")
    public void oheIValidateTheDropdownButton() {
        _page.AddNewFieldsDropdown();
    }

    @And("OHE I validate the checkbox button")
    public void oheIValidateTheCheckboxButton() {
        _page.AddNewFieldsCheckbox();
    }

    @And("OHE I validate the Tags button")
    public void oheIValidateTheTagsButton() {
        _page.AddNewFieldsTags();
    }

    @And("OHE I validate the Color button")
    public void oheIValidateTheColorButton() {
        _page.AddNewFieldsColor();
    }

    @And("OHE I validate the Mandatory checkbox")
    public void oheIValidateTheMandatoryCheckbox() {
        _page.MandatoryCheckboxCustomFields();
    }

    @And("OHE I validate the Show in Browse checkbox")
    public void oheIValidateTheShowInBrowseCheckbox() {
        _page.ShowInBrowseCheckboxCustomFields();
    }

    @And("OHE I validate the Allow to add tags checkbox")
    public void oheIValidateTheAllowToAddTagsCheckbox() {
    }

    @And("OHE I validate the is variant checkbox")
    public void oheIValidateTheIsVariantCheckbox() {
    }

    @Then("OHE I see that the next button redirect me to step 6")
    public void oheISeeThatTheNextButtonRedirectMeToStep() {
    }

    @Given("OHE Step 6: Connect Domain")
    public void oheStepEMails() {
        _page.setHomePage();
        _page.login();
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.emailStep();
    }

    @When("OHE I validate SMTP Settings")
    public void oheIValidateSMTPSettings() {
        _page.templatesTabEmails();
        _page.SMTPSettingsTabEmails();
    }

    @And("OHE I validate here button")
    public void oheIValidateHereButton() {
        _page.clickHereTutorialRedirect();
    }

    @And("OHE I type on Email")
    public void oheITypeOnEmail() {
        _page.emailFieldStepEmails();
    }

    @And("OHE I type on Password")
    public void oheITypeOnPassword() {
        _page.passwordFieldStepEmails();
    }

    @And("OHE I validate verify credentials")
    public void oheIValidateVerifyCredentials() {
        _page.verifyCredentialsEmails();
    }

    @And("OHE I validate the next button smtp")
    public void oheIValidateTheNextButtonSmtp() {
    }

    @Then("OHE I see that the next button redirect me to step 7")
    public void oheISeeThatTheVerifyCredentialsButtonVerifyTheMailISeeThatTheNextButtonRedirectMeToStep() {
    }

    @When("OHE I validate templates")
    public void oheIValidateTemplates() {
        _page.templatesTabEmails();
    }

    @And("OHE I validate the watch video button")
    public void oheIValidateTheWatchVideoButton() {
        _page.watchVideoRedirect();
    }

    @And("OHE I validate the actions section")
    public void oheIValidateTheActionsSection() {
        _page.actionsTemplateOptions();
    }

    @And("OHE I validate the status section")
    public void oheIValidateTheStatusSection() {
        _page.statusCheckbox();
        _page.statusCheckbox();
    }

    //Design  STEPS

    @Given("OHE I go to Admin design")
    public void oheAdminDesign() {
        _page.setHomePage();
        _page.login();
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("OHE I validate customize landing page option")
    public void oheIValidateCustomizeLandingPageOption() {
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

    @And("OHE I validate customize menu option")
    public void oheIValidateCustomizeMenuOption() {
        //_page.designSection();
        _page.customizeMenu();
    }

    @And("OHE I validate customize login page option")
    public void oheIValidateCustomizeLoginPageOption() {
        _page.designSection();
        _page.customizeLogIn();
    }

    @And("OHE I validate customize sign up page option")
    public void oheIValidateCustomizeSignUpPageOption() {
        _page.designSection();
        _page.customizeSignUp();
    }

    @And("OHE I validate customize contact us page option")
    public void oheIValidateCustomizeContactUsPageOption() {
        _page.designSection();
        _page.customizeContactUs();
    }

    @And("OHE I validate customize about us page option")
    public void oheIValidateCustomizeAboutUsPageOption() {
        _page.designSection();
        _page.customizeAboutUs();
        _page.customizeAboutUsHeader();
        _page.customizeAboutUsHowItWorks();
        _page.customizeAboutUsPreFooter();
    }

    @And("OHE I validate customize FAQ page option")
    public void oheIValidateCustomizeFAQPageOption() {
        _page.designSection();
        _page.customizeFAQ();
    }

    @And("OHE I validate customize Terms & conditions page option")
    public void oheIValidateCustomizeTermsConditionsPageOption() {
        _page.designSection();
        _page.customizeTermsAndConditions();
    }

    @And("OHE I validate customize Privacy Policy page option")
    public void oheIValidateCustomizePrivacyPolicyPageOption() {
        _page.designSection();
        _page.customizePrivacyPolicy();
    }

    @Then("OHE I validate Admin Design")
    public void oheIValidateAdminDesign() {
        Assert.assertEquals("Customize your Terms & Conditions page", _page.faqConfirm());
    }

    @Given("OHE Admin settings")
    public void oheAdminSettings() {
        _page.setHomePage();
        _page.login();
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.settings();
    }

    @When("OHE I validate settings Site Wording")
    public void oheIValidateSettingsSiteWording() {
        _page.siteWording();
    }

    @And("OHE I validate settings Company Info")
    public void oheIValidateSettingsCompanyInfo() {
        _page.settingsCompanyInfo();
    }

    @And("OHE I validate settings Payment Info")
    public void oheIValidateSettingsPaymentInfo() {
        _page.paymentInfo();
    }

    @And("OHE I validate settings Orders Setup")
    public void oheIValidateSettingsOrdersSetup() {
        _page.settingsOrdersSetup();
    }

    @And("OHE I validate Request Setup")
    public void oheIValidateRequestSetup() {
        _page.settingsRequestSetup();
    }

    @And("OHE I validate Discount codes section")
    public void oheIValidateDiscountCodesSection() {
        _page.settingsDiscount();
    }

    @Then("OHE I validate Admin Settings")
    public void oheIValidateAdminSettings() {
        Assert.assertEquals("Site Wording", _page.ordersConfirm());
    }

    //Reports

    @Given("OHE Admin Reports")
    public void oheAdminReports() {
        _page.setHomePage();
        _page.login();
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("OHE I validate Contact Messages")
    public void oheIValidateContactMessages() {
        _page.contactMessages();
    }

    @And("OHE I validate User Reviews")
    public void oheIValidateUserReviews() {
        _page.userReviews();
    }

    @And("OHE I validate Listing Reviews")
    public void oheIValidateListingReviews() {
        _page.listingReviews();
    }

    @And("OHE I validate User Transactions")
    public void oheIValidateUserTransactions() {
        _page.userTransactions();
    }

    @Then("OHE I validate Admin Reports")
    public void oheIValidateAdminReports() {
        Assert.assertEquals("User Transactions", _page.userTransactionsConfirm());
    }

    //Add-Ons and extensions

    @Given("OHE Admin Add-ons")
    public void oheAdminAddOns() {
        _page.setHomePage();
        _page.login();
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("OHE I validate Add-Ons Section")
    public void oheIValidateAddOnsSection() {
        _page.addonBtnFromPanel();
        _page.addNewAddOns();
        _page.backToAddOns();
        _page.selectAddOnsProductSections();
        _page.addOnsEdit();
        _page.backToAddOnsAgain();
        //_page.addOnsFilterTextField();
        //_page.addOnsFilterTextFieldType();
        //_page.addOnsFilterBtn();
    }

    @And("OHE I validate Extensions")
    public void oheIValidateExtensions() {
        _page.extensions();
    }

    @Then("OHE I validate add ons")
    public void oheIValidateAddOns() {
        Assert.assertEquals("Add-Ons", _page.extensionsConfirm());
    }

    @Given("OHE Step 3: Design your homepage")
    public void oheStepDesignYourHomepage() {
    }

    @When("OHE I validate the Header")
    public void oheIValidateTheHeader() {
    }

    @And("OHE I validate the Footer")
    public void oheIValidateTheFooter() {
    }

    @And("OHE I validate the social links")
    public void oheIValidateTheSocialLinks() {
    }

    @And("OHE I validate the Fonts")
    public void oheIValidateTheFonts() {
    }

    @And("OHE I validate the Colors")
    public void oheIValidateTheColors() {
    }

    @And("OHE I validate the Logo And Favicon")
    public void oheIValidateTheLogoAndFavicon() {
    }

    @Then("OHE I Validate the design homepage")
    public void oheIValidateTheDesignHomepage() {
    }
}