package steps.developmentServices;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.developmentServices.PAdminPage;

import java.io.IOException;

public class PAdminSteps extends BasePage {

    private PAdminPage _page;

    public PAdminSteps() {

        this._page = new PAdminPage();
    }


    @Given("PSVC I login with Gaston User in services")
    public void ILoginWithGastonUserInServices() {
        _page.setHomePage();
        _page.iLoginWithGastonUserServices();
    }

    @Given("PSVC I go to admin panel in services")
    public void PSVCiGoToAdminPageInServices() {
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("PSVC I validate step 1 Create your marketplace")
    public void PSVCIValidateStepCreateYourMarketplace() {
        _page.createMarketplace();
    }

    @And("PSVC I validate step 2 Select your homepage layout")
    public void PSVCIValidateStepSelectYourHomepageLayout() {
        _page.goToAdminPanel();
        //_page.setHomePage();
    }

    @And("PSVC I validate step 3 design your homepage")
    public void PSVCIValidateStepDesignYourHomepage() {
        _page.goToAdminPanel();
        _page.designYourHomePage();
    }

    @And("PSVC I validate step 4 create categories")
    public void PSVCIValidateStepCreateCategories() {
        _page.goToAdminPanel();
        _page.createCategories();
    }

    @And("PSVC I validate step 5 create custom fields & filters")
    public void PSVCIValidateStepCreateCustomFieldsFilters() {
        _page.goToAdminPanel();
        _page.createCustomFields();
    }

    @And("PSVC I validate step 8 emails")
    public void PSVCIValidateStepEmails() {
        _page.goToAdminPanel();
        _page.emailStep();
    }

    @And("PSVC I validate step 6 connect domain")
    public void PSVCIValidateStepConnectDomain() {
        _page.goToAdminPanel();
        _page.connectDomain();
    }

    @And("PSVC I validate step 7 Google Locations")
    public void PSVCIValidateStepGoogleLocations() {
        _page.goToAdminPanel();
        _page.socialLogin();
    }

    @And("PSVC I validate step 9 create a request or add a listing")
    public void PSVCIValidateStepCreateARequestOrAddAListing() {
    }

    @Then("PSVC I see all the functionalities in the administration panel for the user")
    public void PSVCISeeAllTheFunctionalitiesInTheAdministrationPanelForTheUser() {
        _page.validateAdminPanel();
    }

    @Given("PSVC Step 2: Select your homepage layout")
    public void PSVCStepSelectYourHomepageLayout() {
        _page.setHomePage();
        _page.iLoginWithGastonUserServices();
        _page.goToAdminPanel();
        _page.getCloseChat();

    }

    @When("PSVC I validate the options")
    public void PSVCIValidateTheOptions() {
        _page.selectHomePageLayout();
    }

    @And("PSVC I validate the Save button")
    public void PSVCIValidateTheSaveButton() {
        _page.saveButton();
    }

    @And("PSVC I validate the next button")
    public void PSVCIValidateTheNextButton() {
        _page.getCloseChat();
        _page.nextStepButton();
    }

    @Then("PSVC I see the Step 3")
    public void PSVCISeeTheStep() {
    }

    @Given("PSVC Step 4: Create Categories")
    public void PSVCStepCreateCategories() {
        _page.setHomePage();
        _page.iLoginWithGastonUserServices();
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.createCategories();
    }

    @When("PSVC I validate the Import data button")
    public void PSVCIValidateTheImportDataButton() {
        _page.categoriesImportData();
    }

    @And("PSVC I type on category name field")
    public void PSVCITypeOnCategoryNameField() {
        _page.typeOnCategoryNameField();
    }

    @And("PSVC I validate the Add Category")
    public void PSVCIValidateTheAddCategory() {
        _page.addCategory();
        _page.deleteCategory();
    }

    @And("PSVC I validate the category name")
    public void PSVCIValidateTheCategoryName() {
    }

    @Then("PSVC I see that the add category button adds the category with the name set in the text bar")
    public void PSVCISeeThatTheAddCategoryButtonAddsTheCategoryWithTheNameSetInTheTextBar() {
    }

    @Given("PSVC Step 5: Create Custom Fields and Filters")
    public void PSVCStepCreateCustomFieldsAndFilters() {
        _page.setHomePage();
        _page.iLoginWithGastonUserServices();
        _page.goToAdminPanel();
        _page.createCustomFields();
        _page.getCloseChat();
    }

    @When("PSVC I validate the hide button")
    public void PSVCIValidateTheHideButton() {
        _page.CustomFieldsHideHowItWorks();
    }

    @And("PSVC I validate the show button")
    public void PSVCIValidateTheShowButton() {
        _page.CustomFieldsShowHowItWorks();
    }

    @And("PSVC I validate the listing page.jpg button")
    public void PSVCIValidateTheListingPageJpgButton() {
        _page.listingPagePreviewImage();
    }

    @And("PSVC I validate the browse page.jpg button")
    public void PSVCIValidateTheBrowsePageJpgButton() {
        _page.browsePagePreviewImage();
    }

    @And("PSVC I validate the upload a listing.jpg button")
    public void PSVCIValidateTheUploadAListingJpgButton() {
        _page.uploadAListingPreviewImage();
    }

    @And("PSVC I validate the Create Custom Fields")
    public void PSVCIValidateTheCreateCustomFields() {
        _page.goToCreateCustomFieldsBtn();
    }

    @And("PSVC I validate the text button")
    public void PSVCIValidateTheTextButton() {
        _page.textButton();
//        _page.AddNewFieldsText();
    }

    @And("PSVC I validate the number button")
    public void PSVCIValidateTheNumberButton() {
        _page.numberButton();
//       _page.AddNewFieldsNumber();
    }

    @And("PSVC I validate the dropdown button")
    public void PSVCIValidateTheDropdownButton() {
        _page.dropDownButton();
//        _page.AddNewFieldsDropdown();
    }

    @And("PSVC I validate the checkbox button")
    public void PSVCIValidateTheCheckboxButton() {
        _page.checkboxButton();
//        _page.AddNewFieldsCheckbox();
    }

    @And("PSVC I validate the Tags button")
    public void PSVCIValidateTheTagsButton() {
        _page.AddNewFieldsTags();
    }

    @And("PSVC I validate the Color Picker button")
    public void PSVCIValidateTheColorPickerButton() {
        _page.colorPickerButton();
        _page.textButton();
//        _page.AddNewFieldsColor();
    }

    @And("PSVC I validate the Mandatory checkbox")
    public void PSVCIValidateTheMandatoryCheckbox() {
        _page.MandatoryCheckboxCustomFields();
    }

    @And("PSVC I validate the Set as filter checkbox")
    public void PSVCIValidateTheSetAsFilterCheckbox() {
        _page.SetAsFilterCheckboxCustomFields();
    }

    @And("PSVC I validate the Allow to add tags checkbox")
    public void PSVCIValidateTheAllowToAddTagsCheckbox() {
    }

    @And("PSVC I validate the is variant checkbox")
    public void PSVCIValidateTheIsVariantCheckbox() {
    }

    @Then("PSVC I see Successfully Text")
    public void PSVCISeeSuccessfullyText() {
        _page.successfullyTextDisplayed();
        _page.deleteTheLastCustomField();
    }

    @Given("PSVC Step 6: Connect Domain")
    public void PSVCStepEMails() {
        _page.setHomePage();
        _page.iLoginWithGastonUserServices();
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.emailStep();
    }

    @When("PSVC I validate SMTP Settings")
    public void PSVCIValidateSMTPSettings() {
        _page.templatesTabEmails();
        _page.SMTPSettingsTabEmails();
    }

    @And("PSVC I validate here button")
    public void PSVCIValidateHereButton() {
        _page.clickHereTutorialRedirect();
    }

    @And("PSVC I type on Email")
    public void PSVCITypeOnEmail() {
        _page.emailFieldStepEmails();
    }

    @And("PSVC I type on Password")
    public void PSVCITypeOnPassword() {
        _page.passwordFieldStepEmails();
    }

    @And("PSVC I validate verify credentials")
    public void PSVCIValidateVerifyCredentials() {
        _page.verifyCredentialsEmails();
    }

    @And("PSVC I validate the next button smtp")
    public void PSVCIValidateTheNextButtonSmtp() {
    }

    @Then("PSVC I see that the next button redirect me to step 7")
    public void PSVCISeeThatTheVerifyCredentialsButtonVerifyTheMailISeeThatTheNextButtonRedirectMeToStep() {
    }

    @When("PSVC I validate templates")
    public void PSVCIValidateTemplates() {
        _page.templatesTabEmails();
    }

    @And("PSVC I validate the watch video button")
    public void PSVCIValidateTheWatchVideoButton() {
        _page.watchVideoRedirect();
    }

    @And("PSVC I validate the actions section")
    public void PSVCIValidateTheActionsSection() {
        _page.actionsTemplateOptions();
    }

    @And("PSVC I validate the status section")
    public void PSVCIValidateTheStatusSection() {
        _page.statusCheckbox();
        _page.statusCheckbox();
    }

    //Design  STEPS

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

    @And("PSVC I validate customize contact us page option")
    public void PSVCIValidateCustomizeContactUsPageOption() {
        _page.designSection();
        _page.customizeContactUs();
    }

    @And("PSVC I validate customize about us page option")
    public void PSVCIValidateCustomizeAboutUsPageOption() {
        _page.designSection();
        _page.customizeAboutUs();
        _page.customizeAboutUsHeader();
        _page.customizeAboutUsHowItWorks();
        _page.customizeAboutUsPreFooter();
    }

    @And("PSVC I validate customize FAQ page option")
    public void PSVCIValidateCustomizeFAQPageOption() {
        _page.designSection();
        _page.customizeFAQ();
    }

    @And("PSVC I validate customize Terms & conditions page option")
    public void PSVCIValidateCustomizeTermsConditionsPageOption() {
        _page.designSection();
        _page.customizeTermsAndConditions();
    }

    @And("PSVC I validate customize Privacy Policy page option")
    public void PSVCIValidateCustomizePrivacyPolicyPageOption() {
        _page.designSection();
        _page.customizePrivacyPolicy();
    }

    @Then("PSVC I validate Admin Design")
    public void PSVCIValidateAdminDesign() {
        Assert.assertEquals("Customize your Terms & Conditions page", _page.faqConfirm());
    }

    @Given("PSVC Admin settings")
    public void PSVCAdminSettings() {
        _page.setHomePage();
        _page.iLoginWithGastonUserServices();
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.settings();
    }

    @When("PSVC I validate settings Site Wording")
    public void PSVCIValidateSettingsSiteWording() {
        _page.siteWording();
    }

    @And("PSVC I validate settings Company Info")
    public void PSVCIValidateSettingsCompanyInfo() {
        _page.settingsCompanyInfo();
    }

    @And("PSVC I validate settings Payment Info")
    public void PSVCIValidateSettingsPaymentInfo() {
        _page.paymentInfo();
    }

    @And("PSVC I validate settings Orders Setup")
    public void PSVCIValidateSettingsOrdersSetup() {
        _page.settingsOrdersSetup();
    }

    @And("PSVC I validate Request Setup")
    public void PSVCIValidateRequestSetup() {
        _page.settingsRequestSetup();
    }

    @And("PSVC I validate Discount codes section")
    public void PSVCIValidateDiscountCodesSection() {
        _page.settingsDiscount();
    }

    @Then("PSVC I validate Admin Settings")
    public void PSVCIValidateAdminSettings() {
        Assert.assertEquals("Browse Config", _page.ordersConfirm());
    }

    //Reports

    @Given("PSVC Admin Reports")
    public void PSVCAdminReports() {
        _page.setHomePage();
        _page.iLoginWithGastonUserServices();
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("PSVC I validate Contact Messages")
    public void PSVCIValidateContactMessages() {
        _page.contactMessages();
    }

    @And("PSVC I validate User Reviews")
    public void PSVCIValidateUserReviews() {
        _page.userReviews();
    }

    @And("PSVC I validate Listing Reviews")
    public void PSVCIValidateListingReviews() {
        _page.listingReviews();
    }

    @And("PSVC I validate User Transactions")
    public void PSVCIValidateUserTransactions() {
        _page.userTransactions();
    }

    @Then("PSVC I validate Admin Reports")
    public void PSVCIValidateAdminReports() {
        Assert.assertEquals("User Transactions", _page.userTransactionsConfirm());
    }

    //Add-Ons and extensions

//    @Before
    public void generateCookiesForServicesDevelopment() throws IOException {
        loginDevSVC();
        loginWithGastonUserDevServices();
        loginWithGastonUserSVC();
    }

    @Given("PSVC I login With Dev User")
    public void PSVCIloginWithDevUser() {
        _page.getHomePagePSVC();
        _page.iLoginWithDevUserServices();
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("PSVC I validate Add-Ons Section")
    public void PSVCIValidateAddOnsSection() {
        _page.addonBtnFromPanel();
        _page.getCloseChat();
        _page.addNewAddOns();
        //_page.selectAddOnsProductSections();
        _page.backToAddOns();
        _page.addOnsEdit();
        _page.backToAddOnsAgain();
        //_page.addOnsFilterTextField();
        //_page.addOnsFilterTextFieldType();
        //_page.addOnsFilterBtn();
    }

    @And("PSVC I validate Extensions")
    public void PSVCIValidateExtensions() {
        _page.extensions();
    }

    @Then("PSVC I validate add ons")
    public void PSVCIValidateAddOns() {
        Assert.assertEquals("Add-Ons", _page.extensionsConfirm());
    }

    @Given("PSVC Step 3: Design your homepage")
    public void PSVCStepDesignYourHomepage() {
    }

    @When("PSVC I validate the Header")
    public void PSVCIValidateTheHeader() {
    }

    @And("PSVC I validate the Footer")
    public void PSVCIValidateTheFooter() {
    }

    @And("PSVC I validate the social links")
    public void PSVCIValidateTheSocialLinks() {
    }

    @And("PSVC I validate the Fonts")
    public void PSVCIValidateTheFonts() {
    }

    @And("PSVC I validate the Colors")
    public void PSVCIValidateTheColors() {
    }

    @And("PSVC I validate the Logo And Favicon")
    public void PSVCIValidateTheLogoAndFavicon() {
    }

    @Then("PSVC I Validate the design homepage")
    public void PSVCIValidateTheDesignHomepage() {
    }

    @And("PSVC I complete TextFields")
    public void PSVCICompleteTextFields() {
        _page.fieldNameText();
        _page.descriptionFieldText();
    }

    @And("PSVC I validate Graphic and Design checkbox")
    public void PSVCIValidateGraphicAndDesignCheckbox() {
        _page.graphicDesign();
    }

    @When("PSVC I select Users tab")
    public void psvcISelectUsersTab() {
        _page.setUsersBtn();
        _page.getCloseChat();
    }

    @And("PSVC complete search filter")
    public void psvcCompleteSearchFilter() {
        _page.searchUser();
    }

    @Then("PSVC I validate Filter sector in Admin panel - Users")
    public void psvcIValidateFilterSectorInAdminPanelUsers() {
        _page.userResult();
    }
}