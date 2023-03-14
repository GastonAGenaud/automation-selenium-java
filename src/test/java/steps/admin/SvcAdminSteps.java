package steps.admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.admin.SvcAdminPage;

public class SvcAdminSteps extends BasePage {

    private SvcAdminPage _page;

    public SvcAdminSteps() {

        this._page = new SvcAdminPage();
    }

    @Given("SVC I go to Admin page")
    public void iGoToAdminPage() {
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.setHomePage();
        _page.loginWithGastonUserSVC();
        _page.goToAdminPanel();
        _page.getCloseChat();

    }

    @When("SVC I validate step 1 Create your marketplace")
    public void SVCIValidateStepCreateYourMarketplace() {
        _page.createMarketplace();
    }

    @And("SVC I validate step 2 Select your homepage layout")
    public void SVCIValidateStepSelectYourHomepageLayout() {
        _page.goToAdminPanel();
        //_page.setHomePage();
    }

    @And("SVC I validate step 3 design your homepage")
    public void SVCIValidateStepDesignYourHomepage() {
        _page.goToAdminPanel();
        _page.designYourHomePage();
    }

    @And("SVC I validate step 4 create categories")
    public void SVCIValidateStepCreateCategories() {
        _page.goToAdminPanel();
        _page.createCategories();
    }

    @And("SVC I validate step 5 create custom fields & filters")
    public void SVCIValidateStepCreateCustomFieldsFilters() {
        _page.goToAdminPanel();
        _page.createCustomFields();
    }

    @And("SVC I validate step 8 emails")
    public void SVCIValidateStepEmails() {
        _page.goToAdminPanel();
        _page.emailStep();
    }

    @And("SVC I validate step 6 connect domain")
    public void SVCIValidateStepConnectDomain() {
        _page.goToAdminPanel();
        _page.connectDomain();
    }

    @And("SVC I validate step 7 Google Locations")
    public void SVCIValidateStepGoogleLocations() {
        _page.goToAdminPanel();
        _page.socialLogin();
    }

    @And("SVC I validate step 9 create a request or add a listing")
    public void SVCIValidateStepCreateARequestOrAddAListing() {
    }

    @Then("SVC I see all the functionalities in the administration panel for the user")
    public void SVCISeeAllTheFunctionalitiesInTheAdministrationPanelForTheUser() {
        _page.validateAdminPanel();
    }

    @Given("SVC Step 2: Select your homepage layout")
    public void SVCStepSelectYourHomepageLayout() {
        _page.setHomePage();
        _page.loginWithGastonUserSVC();
        _page.goToAdminPanel();
        _page.getCloseChat();

    }

    @When("SVC I validate the options")
    public void SVCIValidateTheOptions() {
        _page.selectHomePageLayout();
    }

    @And("SVC I validate the Save button")
    public void SVCIValidateTheSaveButton() {
        _page.saveButton();
    }

    @And("SVC I validate the next button")
    public void SVCIValidateTheNextButton() {
        _page.getCloseChat();
        _page.nextStepButton();
    }

    @Then("SVC I see the Step 3")
    public void SVCISeeTheStep() {
    }

    @Given("SVC Step 4: Create Categories")
    public void SVCStepCreateCategories() {
        _page.setHomePage();
        _page.loginWithGastonUserSVC();
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.createCategories();
    }

    @When("SVC I validate the Import data button")
    public void SVCIValidateTheImportDataButton() {
        _page.categoriesImportData();
    }

    @And("SVC I type on category name field")
    public void SVCITypeOnCategoryNameField() {
        _page.typeOnCategoryNameField();
    }

    @And("SVC I validate the Add Category")
    public void SVCIValidateTheAddCategory() {
        _page.addCategory();
        _page.deleteCategory();
    }

    @And("SVC I validate the category name")
    public void SVCIValidateTheCategoryName() {
    }

    @Then("SVC I see that the add category button adds the category with the name set in the text bar")
    public void SVCISeeThatTheAddCategoryButtonAddsTheCategoryWithTheNameSetInTheTextBar() {
    }

    @Given("SVC Step 5: Create Custom Fields and Filters")
    public void SVCStepCreateCustomFieldsAndFilters() {
        _page.setHomePage();
        _page.loginWithGastonUserSVC();
        _page.goToAdminPanel();
        _page.createCustomFields();
        _page.getCloseChat();
    }

    @When("SVC I validate the hide button")
    public void SVCIValidateTheHideButton() {
        _page.CustomFieldsHideHowItWorks();
    }

    @And("SVC I validate the show button")
    public void SVCIValidateTheShowButton() {
        _page.CustomFieldsShowHowItWorks();
    }

    @And("SVC I validate the listing page.jpg button")
    public void SVCIValidateTheListingPageJpgButton() {
        _page.listingPagePreviewImage();
    }

    @And("SVC I validate the browse page.jpg button")
    public void SVCIValidateTheBrowsePageJpgButton() {
        _page.browsePagePreviewImage();
    }

    @And("SVC I validate the upload a listing.jpg button")
    public void SVCIValidateTheUploadAListingJpgButton() {
        _page.uploadAListingPreviewImage();
    }

    @And("SVC I validate the Create Custom Fields")
    public void SVCIValidateTheCreateCustomFields() {
        _page.goToCreateCustomFieldsBtn();
    }

    @And("SVC I validate the text button")
    public void SVCIValidateTheTextButton() {
        _page.textButton();
//        _page.AddNewFieldsText();
    }

    @And("SVC I validate the number button")
    public void SVCIValidateTheNumberButton() {
        _page.numberButton();
//       _page.AddNewFieldsNumber();
    }

    @And("SVC I validate the dropdown button")
    public void SVCIValidateTheDropdownButton() {
        _page.dropDownButton();
//        _page.AddNewFieldsDropdown();
    }

    @And("SVC I validate the checkbox button")
    public void SVCIValidateTheCheckboxButton() {
        _page.checkboxButton();
//        _page.AddNewFieldsCheckbox();
    }

    @And("SVC I validate the Tags button")
    public void SVCIValidateTheTagsButton() {
        _page.AddNewFieldsTags();
    }

    @And("SVC I validate the Color Picker button")
    public void SVCIValidateTheColorPickerButton() {
        _page.colorPickerButton();
        _page.textButton();
//        _page.AddNewFieldsColor();
    }

    @And("SVC I validate the Mandatory checkbox")
    public void SVCIValidateTheMandatoryCheckbox() {
        _page.MandatoryCheckboxCustomFields();
    }

    @And("SVC I validate the Set as filter checkbox")
    public void SVCIValidateTheSetAsFilterCheckbox() {
        _page.SetAsFilterCheckboxCustomFields();
    }

    @And("SVC I validate the Allow to add tags checkbox")
    public void SVCIValidateTheAllowToAddTagsCheckbox() {
    }

    @And("SVC I validate the is variant checkbox")
    public void SVCIValidateTheIsVariantCheckbox() {
    }

    @Then("SVC I see Successfully Text")
    public void SVCISeeSuccessfullyText() {
        _page.successfullyTextDisplayed();
        _page.deleteTheLastCustomField();
    }

    @Given("SVC Step 6: Connect Domain")
    public void SVCStepEMails() {
        _page.setHomePage();
        _page.loginWithGastonUserSVC();
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.emailStep();
    }

    @When("SVC I validate SMTP Settings")
    public void SVCIValidateSMTPSettings() {
        _page.templatesTabEmails();
        _page.SMTPSettingsTabEmails();
    }

    @And("SVC I validate here button")
    public void SVCIValidateHereButton() {
        _page.clickHereTutorialRedirect();
    }

    @And("SVC I type on Email")
    public void SVCITypeOnEmail() {
        _page.emailFieldStepEmails();
    }

    @And("SVC I type on Password")
    public void SVCITypeOnPassword() {
        _page.passwordFieldStepEmails();
    }

    @And("SVC I validate verify credentials")
    public void SVCIValidateVerifyCredentials() {
        _page.verifyCredentialsEmails();
    }

    @And("SVC I validate the next button smtp")
    public void SVCIValidateTheNextButtonSmtp() {
    }

    @Then("SVC I see that the next button redirect me to step 7")
    public void SVCISeeThatTheVerifyCredentialsButtonVerifyTheMailISeeThatTheNextButtonRedirectMeToStep() {
    }

    @When("SVC I validate templates")
    public void SVCIValidateTemplates() {
        _page.templatesTabEmails();
    }

    @And("SVC I validate the watch video button")
    public void SVCIValidateTheWatchVideoButton() {
        _page.watchVideoRedirect();
    }

    @And("SVC I validate the actions section")
    public void SVCIValidateTheActionsSection() {
        _page.actionsTemplateOptions();
    }

    @And("SVC I validate the status section")
    public void SVCIValidateTheStatusSection() {
        _page.statusCheckbox();
        _page.statusCheckbox();
    }

    //Design  STEPS

    @Given("SVC I go to Admin design")
    public void SVCAdminDesign() {
        _page.setHomePage();
        _page.loginWithGastonUserSVC();
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("SVC I validate customize landing page option")
    public void SVCIValidateCustomizeLandingPageOption() {
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

    @And("SVC I validate customize menu option")
    public void SVCIValidateCustomizeMenuOption() {
        //_page.designSection();
        _page.customizeMenu();
    }

    @And("SVC I validate customize login page option")
    public void SVCIValidateCustomizeLoginPageOption() {
        _page.designSection();
        _page.customizeLogIn();
    }

    @And("SVC I validate customize sign up page option")
    public void SVCIValidateCustomizeSignUpPageOption() {
        //_page.designSection();
        _page.customizeSignUp();
    }

    @And("SVC I validate customize contact us page option")
    public void SVCIValidateCustomizeContactUsPageOption() {
        _page.designSection();
        _page.customizeContactUs();
    }

    @And("SVC I validate customize about us page option")
    public void SVCIValidateCustomizeAboutUsPageOption() {
        _page.designSection();
        _page.customizeAboutUs();
        _page.customizeAboutUsHeader();
        _page.customizeAboutUsHowItWorks();
        _page.customizeAboutUsPreFooter();
    }

    @And("SVC I validate customize FAQ page option")
    public void SVCIValidateCustomizeFAQPageOption() {
        _page.designSection();
        _page.customizeFAQ();
    }

    @And("SVC I validate customize Terms & conditions page option")
    public void SVCIValidateCustomizeTermsConditionsPageOption() {
        _page.designSection();
        _page.customizeTermsAndConditions();
    }

    @And("SVC I validate customize Privacy Policy page option")
    public void SVCIValidateCustomizePrivacyPolicyPageOption() {
        _page.designSection();
        _page.customizePrivacyPolicy();
    }

    @Then("SVC I validate Admin Design")
    public void SVCIValidateAdminDesign() {
        Assert.assertEquals("Customize your Terms & Conditions page", _page.faqConfirm());
    }

    @Given("SVC Admin settings")
    public void SVCAdminSettings() {
        _page.setHomePage();
        _page.loginWithGastonUserSVC();
        _page.goToAdminPanel();
        _page.getCloseChat();
        _page.settings();
    }

    @When("SVC I validate settings Site Wording")
    public void SVCIValidateSettingsSiteWording() {
        _page.siteWording();
    }

    @And("SVC I validate settings Company Info")
    public void SVCIValidateSettingsCompanyInfo() {
        _page.settingsCompanyInfo();
    }

    @And("SVC I validate settings Payment Info")
    public void SVCIValidateSettingsPaymentInfo() {
        _page.paymentInfo();
    }

    @And("SVC I validate settings Orders Setup")
    public void SVCIValidateSettingsOrdersSetup() {
        _page.settingsOrdersSetup();
    }

    @And("SVC I validate Request Setup")
    public void SVCIValidateRequestSetup() {
        _page.settingsRequestSetup();
    }

    @And("SVC I validate Discount codes section")
    public void SVCIValidateDiscountCodesSection() {
        _page.settingsDiscount();
    }

    @Then("SVC I validate Admin Settings")
    public void SVCIValidateAdminSettings() {
        Assert.assertEquals("Site Wording", _page.ordersConfirm());
    }

    //Reports

    @Given("SVC Admin Reports")
    public void SVCAdminReports() {
        _page.setHomePage();
        _page.loginWithGastonUserSVC();
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("SVC I validate Contact Messages")
    public void SVCIValidateContactMessages() {
        _page.contactMessages();
    }

    @And("SVC I validate User Reviews")
    public void SVCIValidateUserReviews() {
        _page.userReviews();
    }

    @And("SVC I validate Listing Reviews")
    public void SVCIValidateListingReviews() {
        _page.listingReviews();
    }

    @And("SVC I validate User Transactions")
    public void SVCIValidateUserTransactions() {
        _page.userTransactions();
    }

    @Then("SVC I validate Admin Reports")
    public void SVCIValidateAdminReports() {
        Assert.assertEquals("User Transactions", _page.userTransactionsConfirm());
    }

    //Add-Ons and extensions

    @Given("SVC Admin Add-ons")
    public void SVCAdminAddOns() {
        _page.setHomePage();
        _page.loginWithGastonUserSVC();
        _page.goToAdminPanel();
        _page.getCloseChat();
    }

    @When("SVC I validate Add-Ons Section")
    public void SVCIValidateAddOnsSection() {
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

    @And("SVC I validate Extensions")
    public void SVCIValidateExtensions() {
        _page.extensions();
    }

    @Then("SVC I validate add ons")
    public void SVCIValidateAddOns() {
        Assert.assertEquals("Add-Ons", _page.extensionsConfirm());
    }

    @Given("SVC Step 3: Design your homepage")
    public void SVCStepDesignYourHomepage() {
    }

    @When("SVC I validate the Header")
    public void SVCIValidateTheHeader() {
    }

    @And("SVC I validate the Footer")
    public void SVCIValidateTheFooter() {
    }

    @And("SVC I validate the social links")
    public void SVCIValidateTheSocialLinks() {
    }

    @And("SVC I validate the Fonts")
    public void SVCIValidateTheFonts() {
    }

    @And("SVC I validate the Colors")
    public void SVCIValidateTheColors() {
    }

    @And("SVC I validate the Logo And Favicon")
    public void SVCIValidateTheLogoAndFavicon() {
    }

    @Then("SVC I Validate the design homepage")
    public void SVCIValidateTheDesignHomepage() {
    }

    @And("SVC I complete TextFields")
    public void svcICompleteTextFields() {
        _page.fieldNameText();
        _page.descriptionFieldText();
    }

    @And("SVC I validate Graphic and Design checkbox")
    public void svcIValidateGraphicAndDesignCheckbox() {
        _page.graphicDesign();
    }
}