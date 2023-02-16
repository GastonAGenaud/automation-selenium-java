package steps.admin;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;
import pages.admin.AdminPage;

import java.io.IOException;


public class AdminSteps extends BasePage {

    private AdminPage _page;

    public AdminSteps() {

        this._page = new AdminPage();
    }

    @And("Get started steps")
    public void getStartedSteps() throws IOException {
        ////_driver.manage().window().maximize();
        _page.goToAdminPanel();
        _page.getCloseChat();

    }

    @When("I validate step 1 Create your marketplace")
    public void iValidateStepCreateYourMarketplace() {

        _page.createMarketplace();
    }

    @And("I validate step 10 monetization")
    public void iValidateStepMonetization() {
        _page.goToAdminPanel();
        _page.monetization();
    }

    @And("I validate step 2 Select your landing page layout")
    public void iValidateStepSelectYourLandingPageLayout() {
        _page.goToAdminPanel();
        _page.selectLandingPage();
    }


    @And("I validate step 4 create categories")
    public void iValidateStepCreateCategories() {
        _page.goToAdminPanel();
        _page.createCategories();
    }

    @And("I validate step 5 create custom fields & filters")
    public void iValidateStepCreateCustomFieldsFilters() {
        _page.goToAdminPanel();
        _page.createCustomFields();
    }

    @When("I validate step 8 emails")
    public void iValidateStepEmails() {
        _page.goToAdminPanel();
        _page.emailStep();
    }

    @And("I validate step 6 connect domain")
    public void iValidateStepConnectDomain() {
        _page.goToAdminPanel();
        _page.connectDomain();
    }

    @And("I validate step 7 Google Locations and Social Login")
    public void iValidateStepGoogleLocationsAndSocialLogin() {
        _page.goToAdminPanel();
        _page.socialLogin();
    }

    @And("I validate step 9 create a request or add a user")
    public void iValidateStepCreateARequestOrAddAUser() {

    }

    @And("I validate step 11 create test users")
    public void iValidateStepCreateTestUsers() {
        _page.goToAdminPanel();
        _page.createTestUsers();
    }

    @And("I validate step 12 invite users")
    public void iValidateStepInviteUsers() {
        _page.goToAdminPanel();
        _page.inviteUsers();
    }

    @And("I validate step 13 marking tips")
    public void iValidateStepMarketTips() {
        _page.goToAdminPanel();
        _page.marketingTips();
    }

    @Then("I see that the step {int} redirect me to the same page")
    public void iSeeThatTheStepRedirectMeToTheSamePage() {

    }

    @And("I see that the step 2 redirect me to How do you want to make money on your site?")
    public void iSeeThatTheStepRedirectMeTo() {

    }

    @And("I see that the step 3 redirect me to Select template options")
    public void iSeeThatTheStepRedirectMeToSelectTemplateOptions() {

    }

    @And("I see that the step 4 redirect me to Categories creation and editing")
    public void iSeeThatTheStepRedirectMeToCategoriesCreationAndEditing() {

    }

    @And("I see that the step 5 redirect me to Create Custom Fields and Filters")
    public void iSeeThatTheStepRedirectMeToCreateCustomFieldsAndFilters() {

    }

    @And("I see that the step 8 redirect me to Set up the marketplace email")
    public void iSeeThatTheStepRedirectMeToSetUpTheMarketplaceEmail() {
    }

    @And("I see that the step 6 redirect me to Connect Domain")
    public void iSeeThatTheStepRedirectMeToConnectDomain() {
    }

    @And("I see that the step 7 redirect me to Google Locations and Social Login")
    public void iSeeThatTheStepRedirectMeToGoogleLocationsAndSocialLogin() {
    }

    @Then("I see all the functionalities in the administration panel for the user")
    public void iSeeAllTheFunctionalities() {
        _page.validateAdminPanel();
    }

    @Given("Step 10: Monetization")
    public void stepMonetization() throws IOException {
        _page.goToAdminPanel();
        _page.monetization();
    }

    @When("I validate the Contact us button")
    public void iValidateTheContactUsButton() {
        //_page.contactUsMonetizationStep();
        _page.goToAdminPanel();
    }

    @And("I validate the transaction fee% option")
    public void iValidateTheTransactionFeeOption() {
        _page.monetization();
    }

    @And("I validate the next button")
    public void iValidateTheNextButton() {
        _page.next();
    }

    @And("I validate the next button smtp")
    public void iValidateTheNextButtonSmtp() {
        _page.nextSmtp();
    }

    @Then("I see that the contact us button redirect me to a calendar")
    public void iSeeThatTheContactUsButtonRedirectMeToACalendar() {
        Assert.assertEquals("Step 10: Monetization", _page.monetizationConfirm());
    }

    @And("I see that the next button send me to step 3")
    public void iSeeThatTheNextButtonSendMeToStep() {
    }

    @And("I validate the No payments option")
    public void iValidateTheNoPaymentsOption() {
        _page.monetization();
    }

    @And("I validate the Subscription option")
    public void iValidateTheSubscriptionOption() {
    }

    @And("I see that the Subscription option show me optional addons")
    public void iSeeThatTheSubscriptionOptionShowMeOptionalAddons() {
    }

    @Given("Step 3: Select your landing page layout")
    public void stepSelectYourLandingPageLayout() throws IOException {
        //_driver.manage().window().maximize();
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.goToAdminPanel();
    }


    @Then("I see the Step 4")
    public void iSeeTheText() {
        Assert.assertEquals("Step 2: Select your landing page layout", _page.landingPageConfirm());
    }

    @When("I validate the options")
    public void iValidateTheBrowseFirstOption() {
        _page.landingPageLayout();
    }

    @When("I validate the Standard option")
    public void iValidateTheStandardOption() {
    }

    @And("I validate next button")
    public void iValidateNextButton() {
    }

    @Given("Step 4: Create Categories")
    public void stepCreateCategories() throws IOException {
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.createCategories();
    }

    @When("I validate the Import data button")
    public void iValidateTheImportDataButton() {
        _page.categoriesImportData();
    }

    @And("I type on category name field")
    public void iTypeOnCategoryNameField() {
        _page.typeOnCategoryNameField();
    }

    @And("I validate the Add Category")
    public void iValidateTheAddCategory() {
        _page.addCategory();
        //_page.deleteCategory();
    }

    @And("I validate the category name")
    public void iValidateTheCategoryName() {
    }

    @Then("I see tha the Import data button open a window {string}")
    public void iSeeThaTheImportDataButtonOpenAWindow() {
    }

    @Then("I see that the add category button adds the category with the name set in the text bar")
    public void iSeeThatTheAddCategoryButtonAddsTheCategoryWithTheNameSetInTheTextBar() {
    }

    @And("I see that the category name show tags")
    public void iSeeThatTheCategoryNameShowTags() {
    }

    @Given("Step 5: Create Custom Fields and Filters")
    public void stepCreateCustomFieldsAndFilters() throws IOException {
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.createCustomFields();
        _page.getCloseChat();
    }

    @When("I validate the hide button")
    public void iValidateTheHideButton() {
        _page.CustomFieldsHideHowItWorks();
    }

    @And("I validate the show button")
    public void iValidateTheShowButton() {
        _page.CustomFieldsShowHowItWorks();
    }

    @And("I validate the listing page.jpg button")
    public void iValidateTheListingPageJpgButton() {
        _page.listingPagePreviewImage();
    }

    @And("I validate the browse page.jpg button")
    public void iValidateTheBrowsePageJpgButton() {
        _page.browsePagePreviewImage();
    }

    @And("I validate the upload a listing.jpg button")
    public void iValidateTheUploadAListingJpgButton() {
        _page.uploadAListingPreviewImage();
    }

    @And("I validate the table")
    public void iValidateTheTable() {
    }

    @And("I validate the text button")
    public void iValidateTheTextButton() {
        _page.AddNewFieldsText();
    }

    @And("I validate the number button")
    public void iValidateTheNumberButton() {
        _page.AddNewFieldsNumber();
    }

    @And("I validate the dropdown button")
    public void iValidateTheDropdownButton() {
        _page.AddNewFieldsDropdown();
    }

    @And("I validate the checkbox button")
    public void iValidateTheCheckboxButton() {
        _page.AddNewFieldsCheckbox();
    }

    @And("I validate the Tags button")
    public void iValidateTheTagsButton() {
        _page.AddNewFieldsTags();
    }

    @And("I validate the Color button")
    public void iValidateTheColorButton() {
        _page.AddNewFieldsColor();
    }

    @And("I validate the Mandatory checkbox")
    public void iValidateTheMandatoryCheckbox() {
        _page.MandatoryCheckboxCustomFields();
    }

    @And("I validate the Show in Browse checkbox")
    public void iValidateTheShowInBrowseCheckbox() {
        _page.ShowInBrowseCheckboxCustomFields();
    }

    @And("I validate the Allow to add tags checkbox")
    public void iValidateTheAllowToAddTagsCheckbox() {
    }

    @And("I validate the is variant checkbox")
    public void iValidateTheIsVariantCheckbox() {
    }

    @Then("I see that the hide button hide the examples")
    public void iSeeThatTheHideButtonHideTheExamples() {
    }

    @And("I see that the show button show the examples")
    public void iSeeThatTheShowButtonShowTheExamples() {
    }

    @And("I see that the listing page.jpg button show a example")
    public void iSeeThatTheListingPageJpgButtonShowAExample() {
    }

    @And("I see that the browse page.jpg button show a example")
    public void iSeeThatTheBrowsePageJpgButtonShowAExample() {
    }

    @And("I see that the upload a listing.jpg button show a example")
    public void iSeeThatTheUploadAListingJpgButtonShowAExample() {
    }

    @And("I see that the text button redirect me to create new text field")
    public void iSeeThatTheTextButtonRedirectMeToCreateNewTextField() {
    }

    @And("I see that the number button redirect me to create new number field")
    public void iSeeThatTheNumberButtonRedirectMeToCreateNewNumberField() {
    }

    @And("I see that the dropdown button redirect me to create new dropdown field")
    public void iSeeThatTheDropdownButtonRedirectMeToCreateNewDropdownField() {
    }

    @And("I see that the tags button redirect me to create new tags field")
    public void iSeeThatTheTagsButtonRedirectMeToCreateNewTagsField() {
    }

    @And("I see that the Color button redirect me to create new Color field")
    public void iSeeThatTheColorButtonRedirectMeToCreateNewColorField() {
    }

    @And("I see that the Mandatory checkbox accept to be obligatory in the marketplace")
    public void iSeeThatTheMandatoryCheckboxAcceptToBeObligatoryInTheMarketplace() {
    }

    @And("I see that the Mandatory checkbox decline to be obligatory in the marketplace")
    public void iSeeThatTheMandatoryCheckboxDeclineToBeObligatoryInTheMarketplace() {
    }

    @And("I see that the Show in browse checkbox accept to show in the browser")
    public void iSeeThatTheShowInBrowseCheckboxAcceptToShowInTheBrowser() {
    }

    @And("I see that the Show in browse checkbox decline to show in the browser")
    public void iSeeThatTheShowInBrowseCheckboxDeclineToShowInTheBrowser() {
    }

    @And("I see that the Allow to add tags checkbox accept to give permission to the seller to add their own tags")
    public void iSeeThatTheAllowToAddTagsCheckboxAcceptToGivePermissionToTheSellerToAddTheirOwnTags() {
    }

    @And("I see that the Allow to add tags checkbox decline to give permission to the seller to add their own tags")
    public void iSeeThatTheAllowToAddTagsCheckboxDeclineToGivePermissionToTheSellerToAddTheirOwnTags() {
    }

    @And("I see that the is variant checkbox accept to show more than one option")
    public void iSeeThatTheIsVariantCheckboxAcceptToShowMoreThanOneOption() {
    }

    @And("I see that the is variant checkbox decline to show more than one option")
    public void iSeeThatTheIsVariantCheckboxDeclineToShowMoreThanOneOption() {
    }

    @Then("I see that the next button redirect me to step 6")
    public void iSeeThatTheNextButtonRedirectMeToStep() {
        Assert.assertEquals(true, _page.createCustomConfirm());
    }

    @Then("I see that the verify credentials button verify the mail & I see that the next button redirect me to step 7")
    public void iSeeThatTheNextButtonRedirectMeToStepEmail() {
        Assert.assertEquals(true, _page.emailConfirm());
    }

    @And("Step 8: E-mails")
    public void stepEMails() throws IOException {
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.emailStep();
    }

    @When("I validate SMTP Settings")
    public void iValidateSMTPSettings() {
        _page.templatesTabEmails();
        _page.SMTPSettingsTabEmails();
    }

    @And("I validate here button")
    public void iValidateHereButton() {
        _page.templatesTabEmails();
        _page.clickHereTutorialRedirect();
    }

    @And("I type on Email")
    public void iTypeOnEmail() {
        _page.emailFieldStepEmails();
    }

    @And("I type on Password")
    public void iTypeOnPassword() {
        _page.passwordFieldStepEmails();
    }

    @And("I validate verify credentials")
    public void iValidateVerifyCredentials() {
        _page.verifyCredentialsEmails();
    }

    @When("I validate templates")
    public void iValidateTemplates() {
        _page.templatesTabEmails();
    }

    @And("I validate the watch video button")
    public void iValidateTheWatchVideoButton() {
        _page.watchVideoRedirect();
    }

    @And("I validate the actions section")
    public void iValidateTheActionsSection() {
        _page.actionsTemplateOptions();
    }

    @And("I validate the status section")
    public void iValidateTheStatusSection() {
        _page.statusCheckbox();
        _page.statusCheckbox();
    }

    //Design  STEPS

    @And("Admin design")
    public void adminDesign() throws IOException {
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("I validate customize landing page option")
    public void iValidateCustomizeLandingPageOption() {
        //_page.designSection();
        _page.customizeLandingPage();
        _page.customizeLandingPageHeader();
        _page.customizeLandingPageFooter();
        _page.customizeLandingPageSocialLinks();
        _page.customizeLandingPageFonts();
        _page.customizeLandingPageColors();
        _page.customizeLandingPageLogo();
    }

    @And("I validate customize menu option")
    public void iValidateCustomizeMenuOption() {
        ////_page.designSection();
        _page.customizeMenu();
    }

    @And("I validate customize login page option")
    public void iValidateCustomizeLoginPageOption() {
        ////_page.designSection();
        _page.customizeLogIn();
    }

    @And("I validate customize sign up page option")
    public void iValidateCustomizeSignUpPageOption() {
        //_page.designSection();
        _page.customizeSignUp();
    }

    @And("I validate customize contact us page option")
    public void iValidateCustomizeContactUsPageOption() {
        //_page.designSection();
        _page.customizeContactUs();
    }

    @And("I validate customize about us page option")
    public void iValidateCustomizeAboutUsPageOption() {
        //_page.designSection();
        _page.customizeAboutUs();
        _page.customizeAboutUsHeader();
        _page.customizeAboutUsHowItWorks();
        _page.customizeAboutUsPreFooter();
    }

    @And("I validate customize FAQ page option")
    public void iValidateCustomizeFAQPageOption() {
        //_page.designSection();
        _page.customizeFAQ();
    }

    @And("I validate customize Terms & conditions page option")
    public void iValidateCustomizeTermsConditionsPageOption() {
        //_page.designSection();
        _page.customizeTermsAndConditions();
    }

    @And("I validate customize Privacy Policy page option")
    public void iValidateCustomizePrivacyPolicyPageOption() {
        //_page.designSection();
        _page.customizePrivacyPolicy();
    }

    @Then("I validate Admin Design")
    public void iValidateAdminDesign() {
        Assert.assertEquals("Customize your Privacy Policy page", _page.faqConfirm());
    }
    //Settings

    @And("Admin settings")
    public void adminSettings() throws IOException {
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.settings();
    }

    @When("I validate settings Site Wording")
    public void iValidateSettingsSiteWording() {
        _page.siteWording();
    }

    @And("I validate settings Company Info")
    public void iValidateSettingsCompanyInfo() {
        _page.settingsCompanyInfo();
    }

    @And("I validate settings Payment Info")
    public void iValidateSettingsPaymentInfo() {
        _page.paymentInfo();
    }

    @And("I validate settings Orders Setup")
    public void iValidateSettingsOrdersSetup() {
        _page.settingsOrdersSetup();
    }

    @And("I validate Request Setup")
    public void iValidateRequestSetup() {
        _page.settingsRequestSetup();
    }

    @And("I validate Discount codes section")
    public void iValidateDiscountCodesSection() {
        _page.settingsDiscount();
    }

    @Then("I validate Admin Settings")
    public void iValidateAdminSettings() {
        _page.settingsOrdersSetup();
        Assert.assertEquals("Orders", _page.ordersConfirm());
    }
    //Reports

    @Given("Admin Reports")
    public void adminReports() throws IOException {
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("I validate Contact Messages")
    public void iValidateContactMessages() {

        _page.contactMessages();
    }

    @And("I validate User Reviews")
    public void iValidateUserReviews() {
        _page.userReviews();
    }

    @And("I validate Listing Reviews")
    public void iValidateListingReviews() {
        _page.listingReviews();
    }

    @And("I validate User Transactions")
    public void iValidateUserTransactions() {
        _page.userTransactions();
    }

    @Then("I validate Admin Reports")
    public void iValidateAdminReports() {
        Assert.assertEquals("User Transactions", _page.userTransactionsConfirm());
    }

    //Add ons and extensions

    @Given("Admin Add-ons")
    public void adminAddOns() throws IOException {
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.goToAdminPanel();
        _page.getCloseChat();

    }

    @When("I validate Add-Ons Section")
    public void iValidateAddOnsSection() {
        _page.addonBtnFromPanel();
        //_page.addNewAddOns();
        //_page.backToAddOns();
        _page.selectAddOnsProductSections();
        //_page.addOnsEdit();
        //_page.backToAddOnsAgain();
        _page.addOnsFilterTextField();
        _page.addOnsFilterTextFieldType();
        _page.addOnsFilterBtn();
    }

    @And("I validate Extensions")
    public void iValidateExtensions() {
        _page.extensions();
    }

    @Then("I validate add ons")
    public void iValidateAddOns() {
        Assert.assertEquals("Extensions", _page.extensionsConfirm());
    }

    @And("I validate step 3 design your homepage")
    public void iValidateStepDesignYourHomepage() {
        _page.goToAdminPanel();
        _page.designYourHomePage();
    }
}