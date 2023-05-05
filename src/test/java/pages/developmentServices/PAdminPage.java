package pages.developmentServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;

public class PAdminPage extends BasePage {

    public PAdminPage() {
        super();
    }

    Actions actions = new Actions(getDriver());

    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    //ADMIN PANEL
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement pricingBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(7) > div > ul > li:nth-child(1) > a:nth-child(1)")
    public WebElement monetizationGetStarted;
    @FindBy(how = How.CSS, using = "#go-next-step")
    public WebElement nextSteps;
    @FindBy(how = How.CSS, using = "#action-form > div > div > div > div > div > div:nth-child(2) > div:nth-child(1) > label > div")
    public WebElement transactionFee;
    @FindBy(how = How.CSS, using = "#action-form > div > div > div > div > div > div:nth-child(2) > div:nth-child(2) > label > div > span.fake-radio")
    public WebElement noPaymentsMonetization;
    @FindBy(how = How.CSS, using = "#addCategoryBtn")
    public WebElement categoriesImportData;
    @FindBy(how = How.CSS, using = "#modal-import-data1 > div > div > div.modal-header.border-bottom-0 > button")
    public WebElement closeCategoriesImportData;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[2]/input")
    public WebElement categoryNameField;
    @FindBy(how = How.CSS, using = "#addCategoryBtn")
    public WebElement addCategorybtn;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement deleteCategoryConfirmBtn;
    //Step 1
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(1) > div > ul > li:nth-child(1) > a")
    public WebElement createMarketplace;
    //Step 2

    //Step 3
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(1) > div > ul > li:nth-child(3) > a:nth-child(1)")
    public WebElement designHomePageBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(1) > div > ul > li:nth-child(2) > a:nth-child(1)")
    public WebElement selectLandingPage;

    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(1)")
    public WebElement customizeLandingPageBtn;
    //Step 4
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(1) > div > ul > li:nth-child(4) > a:nth-child(1)")
    public WebElement createCategories;

    //Step 5
    @FindBy(how = How.CSS, using = "#toggler")
    public WebElement createCustomFieldsHideShowBtn;
    @FindBy(how = How.CSS, using = "#main-admin > div.container-fluid.bg-white.pb-5 > div:nth-child(1) > div > ul > li:nth-child(5) > a")
    public WebElement createCustomFields;
    @FindBy(how = How.CSS, using = "#resources > div > div > div:nth-child(1) > a > img")
    public WebElement listingPagePreviewImage;
    @FindBy(how = How.CSS, using = "#products-modal > div > div > div.modal-header.border-0 > button")
    public WebElement closePreviewImage;
    @FindBy(how = How.CSS, using = "#resources > div > div > div:nth-child(2) > a > img")
    public WebElement browsePagePreviewImage;
    @FindBy(how = How.CSS, using = "#resources > div > div > div:nth-child(3) > a > img")
    public WebElement uploadAListingPreviewImage;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.py-5.b-top > div > div > div > div:nth-child(2) > div > div > a:nth-child(1)")
    public WebElement addNewFieldsText;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.py-5.b-top > div > div > div > div:nth-child(2) > div > div > a:nth-child(2)")
    public WebElement addNewFieldsNumber;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.py-5.b-top > div > div > div > div:nth-child(2) > div > div > a:nth-child(3)")
    public WebElement addNewFieldsDropdown;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.py-5.b-top > div > div > div > div:nth-child(2) > div > div > a:nth-child(4)")
    public WebElement addNewFieldsCheckbox;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.py-5.b-top > div > div > div > div:nth-child(2) > div > div > a:nth-child(5)")
    public WebElement addNewFieldsTags;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.py-5.b-top > div > div > div > div:nth-child(2) > div > div > a:nth-child(6)")
    public WebElement addNewFieldsColor;
    @FindBy(how = How.CSS, using = "#create-new-field > div > div > div.btn-section.d-flex.justify-content-between > a")
    public WebElement cancelCustomFieldEditBtn;

    //Step 6
    @FindBy(how = How.CSS, using = "#main-admin > div.container-fluid.bg-white.pb-5 > div:nth-child(4) > div > ul > li:nth-child(3) > a")
    public WebElement emailStep;
    @FindBy(how = How.CSS, using = "#smtp-tab")
    public WebElement smtpSettingsEmails;
    @FindBy(how = How.CSS, using = "#templates-tab")
    public WebElement templatesEmails;
    @FindBy(how = How.CSS, using = "#email")
    public WebElement emailTextBar;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement emailPasswordTextBar;
    @FindBy(how = How.CSS, using = "#verifyCredentials")
    public WebElement emailVerifyCredentialsBtn;
    @FindBy(how = How.CSS, using = "#templates > div.d-flex.align-items-end.justify-content-between.mb-4 > p > a")
    public WebElement emailTutorialBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/div[1]/div/div/div/div/div[1]/form/div/div[2]/div/button[2]")
    public WebElement nextStepsSmtp;
    @FindBy(how = How.CSS, using = "#templates > div.d-flex.align-items-end.justify-content-between.mb-4 > p > a")
    public WebElement watchVideoBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/div[1]/div/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[4]/div/a")
    public WebElement actionsBtn;
    @FindBy(how = How.CSS, using = "#details-modal > div > div > div.modal-header.border-0.p-4 > button > span")
    public WebElement actionsCloseBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/div[1]/div/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[5]/label/span")
    public WebElement statusCheckbox;
    //Design
    @FindBy(xpath = "/html/body/div[2]/div/aside/nav[1]/ul[2]/li[7]/a")
    public WebElement designSectionBtn;
    //Landing Page
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(3)")
    public WebElement landingPageHeaderCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-header > div > form > div.col-12.py-2 > a")
    public WebElement landingPageCloseHeaderCustomizeBtn;
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(4)")
    public WebElement landingPageFooterCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-footer > div > form > div.col-12.py-2 > a")
    public WebElement landingPageCloseFooterCustomizeBtn;
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(5)")
    public WebElement landingPageSocialLinksCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-social-links > div > form > div.col-12.py-2 > a")
    public WebElement landingPageCloseSocialLinksCustomizeBtn;
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(6)")
    public WebElement landingPageFontsCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-fonts > div > form > div.col-12.py-2 > a")
    public WebElement landingPageCloseFontsCustomizeBtn;
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(7)")
    public WebElement landingPageColorsCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-colors > div > form > div.col-12.py-2 > a")
    public WebElement landingPageCloseColorsCustomizeBtn;
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(8)")
    public WebElement landingPageLogoAndFaviconCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-logo-favicon > div > div > div.col-12.py-2 > a")
    public WebElement landingPageCloseLogoAndFaviconCustomizeBtn;
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > a")
    public WebElement closeLandingPage;
    //Menu Page
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(2)")
    public WebElement customizeMenuBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div > div > div > div.form-group.form-check.d-flex.justify-content-end > label.switch.mr-2.my-2")
    public WebElement customizeMenuOrderCheckBox;
    //Log in Page
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(3)")
    public WebElement customizeLoginPageBtn;
    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(3) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeLoginPageFacebookBtn;
    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(4) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeLoginPageGoogleBtn;
    //Sign in Page
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(4)")
    public WebElement customizeSignUpBtn;
    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(3) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeRegistrationPageFacebookBtn;
    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(4) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeRegistrationPageGoogleBtn;
    //Contact Page
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(5)")
    public WebElement customizeContactUsBtn;
    @FindBy(how = How.CSS, using = "#Title")
    public WebElement customizeContactPageTitleTextBar;
    @FindBy(how = How.CSS, using = "#Introductory")
    public WebElement customizeContactPageIntroductoryTextBar;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div/div/section/div/div[2]/div/div/form/div[4]/input[9]")
    public WebElement customizeContactPageLocationTextBar;
    @FindBy(how = How.CSS, using = "#Email")
    public WebElement customizeContactPageEmailTextBar;
    @FindBy(how = How.CSS, using = "#Phone")
    public WebElement customizeContactPagePhoneTextBar;
    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(8) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeContactPageNameCheckBox;
    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(9) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeContactPageEmailCheckBox;
    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(10) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeContactPageMessageCheckBox;
    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(11) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeContactPageMapCheckBox;
    //About Us Page
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(6)")
    public WebElement customizeAboutUsBtn;
    @FindBy(how = How.CSS, using = "#nav-design-header")
    public WebElement customizeAboutUsPageHeaderBtn;
    @FindBy(how = How.CSS, using = "#Slogan")
    public WebElement customizeAboutUsPageHeaderSloganTextBar;
    @FindBy(how = How.CSS, using = "#Introductory")
    public WebElement customizeAboutUsPageHeaderIntroductoryTextBar;
    @FindBy(how = How.CSS, using = "#Paragraph")
    public WebElement customizeAboutUsPageHeaderParagraphTextBar;
    @FindBy(how = How.CSS, using = "#nav-design-how-it-works")
    public WebElement customizeAboutUsPageHowItWorksBtn;
    @FindBy(how = How.CSS, using = "#Title1")
    public WebElement customizeAboutUsPageHowItWorksFirstTitleTextBar;
    @FindBy(how = How.CSS, using = "#Paragraph1")
    public WebElement customizeAboutUsPageHowItWorksFirstParagraphTextBar;
    @FindBy(how = How.CSS, using = "#Title2")
    public WebElement customizeAboutUsPageHowItWorksSecondTitleTextBar;
    @FindBy(how = How.CSS, using = "#Paragraph2")
    public WebElement customizeAboutUsPageHowItWorksSecondParagraphTextBar;
    @FindBy(how = How.CSS, using = "#Title3")
    public WebElement customizeAboutUsPageHowItWorksThirdTitleTextBar;
    @FindBy(how = How.CSS, using = "#Paragraph3")
    public WebElement customizeAboutUsPageHowItWorksThirdParagraphTextBar;
    @FindBy(how = How.CSS, using = "#Title4")
    public WebElement customizeAboutUsPageHowItWorksFourthTitleTextBar;
    @FindBy(how = How.CSS, using = "#Paragraph4")
    public WebElement customizeAboutUsPageHowItWorksFourthParagraphTextBar;
    @FindBy(how = How.CSS, using = "#nav-design-pre-footer")
    public WebElement customizeAboutUsPagePreFooterBtn;
    @FindBy(how = How.CSS, using = "#Headline")
    public WebElement customizeAboutUsPagePreFooterHeadLineTextBar;
    @FindBy(how = How.CSS, using = "#SubHeadline")
    public WebElement customizeAboutUsPagePreFooterSubHeadLineTextBar;
    @FindBy(how = How.CSS, using = "#Paragraph5")
    public WebElement customizeAboutUsPagePreFooterParagraphTextBar;
    @FindBy(how = How.CSS, using = "#Button")
    public WebElement customizeAboutUsPagePreFooterButtonTextBar;
    //FAQ Page
    @FindBy(xpath = "/html/body/div[2]/div/aside/nav[1]/ul[2]/li[8]/div/a[7]")
    public WebElement customizeFAQBtn;
    @FindBy(how = How.CSS, using = "#infoTitle")
    public WebElement customizeFAQPageTitleTextBar;
    @FindBy(how = How.CSS, using = "#rotator-20")
    public WebElement customizeFAQPageAddNewQuestionBtn;
    @FindBy(how = How.CSS, using = "#new-question")
    public WebElement customizeFAQPageWriteQuestionTextBar;
    @FindBy(how = How.CSS, using = "#new-answer")
    public WebElement customizeFAQPageWriteAnswerTextBar;
    //Terms And Conditions Page
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(8)")
    public WebElement customizeTermsAndConditionsBtn;
    @FindBy(how = How.CSS, using = "#infoTitle")
    public WebElement customizeTermsAndConditionsPageTitleTextBar;
    @FindBy(how = How.CSS, using = "#label-2")
    public WebElement customizeTermsAndConditionsPageAddNewFieldBtn;
    @FindBy(how = How.CSS, using = "#Title-static")
    public WebElement customizeTermsAndConditionsPageNewFieldTitleTextBar;
    @FindBy(how = How.CSS, using = "#Description-static")
    public WebElement customizeTermsAndConditionsPageDescriptionTextBar;

    //Privacy Policy Page
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(9)")
    public WebElement customizePrivacyPolicyBtn;
    @FindBy(how = How.CSS, using = "#infoTitle")
    public WebElement customizePrivacyPolicyPageTitleTextBar;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div/div/div[2]/div/section/div[2]/div[2]/div/a/div/div[1]/label")
    public WebElement customizePrivacyPolicyPageAddNewFieldBtn;
    @FindBy(how = How.CSS, using = "#new-title")
    public WebElement customizePrivacyPolicyPageNewFieldTitleTextBar;
    @FindBy(how = How.CSS, using = "#new-description")
    public WebElement customizePrivacyPolicyPageDescriptionTextBar;
    //Settings

    @FindBy(how = How.CSS, using = "#Embed > div > div > div > div > div > div > header > div > button:nth-child(4) > svg")
    public WebElement minimizeChat;
    @FindBy(how = How.CSS, using = "#li-settings > span")
    public WebElement settingsBtn;
    //Wording Site(Language)
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(1)")
    public WebElement siteWordingBtn;
    @FindBy(how = How.CSS, using = "#search")
    public WebElement siteWordingFilterTextBar;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > section > div.row.no-gutters.bg-white.border-b-gray > div > div > div.col-lg-9 > div > div > div.col-lg-2 > button")
    public WebElement siteWordingFilterBtn;
    //Company info
    @FindBy(xpath = "//a[contains(text(), 'Company Info')]")
    public WebElement settingsCompanyInfoBtn;
    @FindBy(how = How.CSS, using = "#company-tab")
    public WebElement selectCompanyInfoBtn;
    @FindBy(how = How.CSS, using = "#SiteTitle")
    public WebElement companyInfoTitleTextBar;
    @FindBy(how = How.CSS, using = "#CompanyName")
    public WebElement companyInfoCompanyNameTextBar;
    @FindBy(how = How.CSS, using = "#SiteDescription")
    public WebElement companyInfoCompanySiteDescriptionTextBar;
    @FindBy(how = How.CSS, using = "#OwnerName")
    public WebElement companyInfoContactNameTextBar;

    @FindBy(how = How.CSS, using = "#OwnerPhoneNumber")
    public WebElement companyInfoPhoneNumberTextField;
    @FindBy(how = How.CSS, using = "#EasyPostKey")
    public WebElement companyInfoPostProdKeyTextField;
    @FindBy(how = How.CSS, using = "#USPSCarrierAccountId")
    public WebElement companyInfoUSPSCarrierAccountIdTextField;
    @FindBy(how = How.CSS, using = "#GoogleLocationApiKey")
    public WebElement companyInfoGoogleLocationApiKeyTextField;
    @FindBy(how = How.CSS, using = "#FaviconURL")
    public WebElement companyInfoFaviconURLTextField;
    @FindBy(how = How.CSS, using = "#GoogleLocationApiKeyBackend")
    public WebElement companyInfoGoogleLocationApiSecondKeyTextField;
    @FindBy(how = How.CSS, using = "#FacebookOAuthID")
    public WebElement companyInfoFacebookOAuthIDTextField;
    @FindBy(how = How.CSS, using = "#GoogleOAuthID")
    public WebElement companyInfoGoogleAuthIDTextField;
    @FindBy(how = How.CSS, using = "#GoogleCaptchaKey")
    public WebElement companyInfoGoogleCaptchaKeyTextField;
    @FindBy(how = How.CSS, using = "#GoogleAnalyticsTrackingId")
    public WebElement companyInfoGoogleAnalyticsTrackingIdTextField;
    @FindBy(how = How.CSS, using = "#OwnerCommission")
    public WebElement companyInfoCommissionTextField;
    @FindBy(how = How.CSS, using = "#subscription-tab")
    public WebElement selectSubscriptionInfoBtn;
    //Payment Info
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(3)")
    public WebElement settingsPaymentInfoBtn;
    @FindBy(how = How.CSS, using = "#payment-tab")
    public WebElement selectPaymentInfoBtn;
    @FindBy(how = How.CSS, using = "#sitePaymentDropdown")
    public WebElement selectSitePaymentService;
    //Payment service Stripe
    @FindBy(how = How.CSS, using = "#StripeSecretApiKey")
    public WebElement paymentInfoStripeSecretApiKeyTextField;
    @FindBy(how = How.CSS, using = "#StripePublishableApiKey")
    public WebElement paymentInfoStripePublishableApiKeyTextField;
    @FindBy(how = How.CSS, using = "#StripeConnectClientId")
    public WebElement paymentInfoStripeConnectClientIdTextField;
    //Payment Paypal

    //Orders Setup
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(9)")
    public WebElement settingsOrdersSetupBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > section > div.row.mb-lg-5 > div > div > label.switch.float-left.mb-0.mr-2.my-2 > span")
    public WebElement autoAcceptOrdersCheckBox;
    //Requests Setup
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(5)")
    public WebElement settingsRequestSetupBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > section > div.row.mb-lg-5 > div > div > label.switch.float-left.mb-0.mr-2.my-2 > span")
    public WebElement enableRequestsOnMySiteCheckBox;
    //Discount
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(6)")
    public WebElement settingsDiscountBtn;
    @FindBy(how = How.CSS, using = "#code")
    public WebElement discountCodeTextField;
    @FindBy(how = How.CSS, using = "#description")
    public WebElement discountDescriptionTextField;
    @FindBy(how = How.CSS, using = "#expiry-date")
    public WebElement discountExpiryDateTextField;
    @FindBy(how = How.CSS, using = "#amount")
    public WebElement discountAmountTextField;
    @FindBy(how = How.CSS, using = "#type")
    public WebElement discountTypeOption;
    @FindBy(how = How.CSS, using = "#content > div > div > section > div.row.mb-5 > div.col-12 > div > div.col-auto.ml-auto > button")
    public WebElement discountAddCodeBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div/div/section/div[2]/div/div/table/tbody/tr/th[7]/a/svg/path")
    public WebElement discountEliminate;
    //Reports
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropup.show > div > a:nth-child(1)")
    public WebElement contactMessagesBtn;
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropup.show > div > a:nth-child(2)")
    public WebElement userReviewsBtn;
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropup.show > div > a:nth-child(3)")
    public WebElement listingReviewsBtn;
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropup > a")
    public WebElement reportsBtn;
    //Contact Messages
    @FindBy(how = How.CSS, using = "#content > div > div > div > label.switch.mr-2.my-2 > a")
    public WebElement contactMessagesEmailForwardingCheckBox;

    //User Reviews
    @FindBy(how = How.CSS, using = "#search")
    public WebElement userReviewsSearchFilterTextField;
    //Listing Reviews
    @FindBy(how = How.CSS, using = "#search")
    public WebElement listingReviewsSearchFilterTextField;
    //User Transactions(Nothing)
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropup.show > div > a:nth-child(4)")
    public WebElement reportsUserTransactions;
    //Add-Ons
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li:nth-child(9) > a")
    public WebElement addonBtn;
    @FindBy(how = How.CSS, using = "#IsProduct")
    public WebElement selectAddOnsProductSectionBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > div.col-auto.pr-2 > a")
    public WebElement addNewAddOnsBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > div > a")
    public WebElement backToAddOnsBtn;
    @FindBy(how = How.CSS, using = "#txtFilter")
    public WebElement addOnsFilterTextField;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div/section/div/div[2]/button")
    public WebElement addOnsFilterBtn;
    @FindBy(how = How.CSS, using = "#listingAddon > div > div > div")
    public WebElement explainerVideoBtn;
    @FindBy(how = How.CSS, using = "#listingAddon > div > div:nth-child(1) > div.d-flex.justify-content-around.mb-2 > a:nth-child(1)")
    public WebElement addOnsEditBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > div > a")
    public WebElement backToAddOnsAgainBtn;
    //Extensions
    @FindBy(how = How.CSS, using = "#extensionsBtn")
    public WebElement extensionsBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > div.col-auto.pr-2 > a")
    public WebElement addExtensionBtn;
    @FindBy(how = How.CSS, using = "#filterMenuContainer > li:nth-child(1) > a")
    public WebElement extensionsFilterAllSectionsBtn;
    @FindBy(how = How.CSS, using = "#filterMenuContainer > li:nth-child(2) > a")
    public WebElement extensionsFilterLandingPageSectionBtn;
    @FindBy(how = How.CSS, using = "#filterMenuContainer > li:nth-child(3) > a")
    public WebElement extensionsFilterSignUpSectionBtn;
    @FindBy(how = How.CSS, using = "#filterMenuContainer > li:nth-child(4) > a")
    public WebElement extensionsFilterAddListingSectionBtn;
    @FindBy(how = How.CSS, using = "#filterMenuContainer > li:nth-child(5) > a")
    public WebElement extensionsFilterBrowsePageSectionBtn;
    @FindBy(how = How.CSS, using = "#filterMenuContainer > li:nth-child(6) > a")
    public WebElement extensionsFilterListingPageSectionBtn;
    @FindBy(how = How.CSS, using = "#extensionsTxtFilter")
    public WebElement extensionsFilterTextField;
    @FindBy(how = How.CSS, using = "#btnFilter")
    public WebElement extensionsFilterBtn;

    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > div > a")
    public WebElement backToExtensionsBtn;
    //Step 7
    @FindBy(how = How.CSS, using = "#main-admin > div.container-fluid.bg-white.pb-5 > div:nth-child(4) > div > ul > li.d-flex.align-items-center > a:nth-child(1)")
    public WebElement connectDomain;
    //Step 8
    @FindBy(how = How.CSS, using = "#main-admin > div.container-fluid.bg-white.pb-5 > div:nth-child(4) > div > ul > li:nth-child(2) > a")
    public WebElement socialLogin;
    //Step 9
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(7) > div > ul > li:nth-child(2) > a:nth-child(1)")
    public WebElement createTestUsers;
    //Step 10
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(7) > div > ul > li:nth-child(3) > a:nth-child(1)")
    public WebElement inviteUsers;

    //Step 11
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(7) > div > ul > li.d-flex.done.step-11 > a:nth-child(1)")
    public WebElement marketingTips;

    @FindBy(how = How.CSS, using = "#Embed > div > div > button > span.label-6AYOW.Arrange-sizeFit.u-textInheritColor.u-inlineBlock")
    public WebElement openChatBtn;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div/div/div/header/div/button[3]")
    public WebElement closeChatBtn;
    @FindBy(how = How.CSS, using = "body > section.inner-banner > div > div > div > div > h1")
    public WebElement calendarText;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div.row.py-4 > div > div > div > h1")
    public WebElement monetizationText;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div.row.py-4 > div > div > h1")
    public WebElement landingPageText;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div.row.py-4 > div > div > h1")
    public WebElement createCustomText;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div.row.py-4 > div > div")
    public WebElement emailText;
    @FindBy(how = How.CSS, using = "h1.mb-4")
    public WebElement faqText;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > h1")
    public WebElement ordersText;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > h1")
    public WebElement userTransactionsText;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > h1")
    public WebElement extensionsText;

    @FindBy(how = How.CSS, using = "#login-header-text-customize")
    public WebElement headerLogInBtn;

    @FindBy(xpath = "//a[contains(text(), 'Delete')]")
    public WebElement deleteXpath;

    @FindBy(xpath = "/html/body/div[2]/div/main/div/div/div/form/div[6]/div[1]/label[1]/span")
    public WebElement MandatoryCheckboxCustomFields;

    @FindBy(xpath = "/html/body/div[2]/div/main/div/div/div/form/div[6]/div[2]/label[1]/span")
    public WebElement SetAsFilterCheckboxCustomFields;

    @FindBy(how = How.CSS, using = "#admin-categories > div > div.col-2 > div > div.w-100.bor-1.br-sm.p-3.content-info > div.d-flex.justify-content-between.align-items-center > a")
    public WebElement CreateCustomFieldBtn;

    @FindBy(how = How.CSS, using = "#custom-field-form > div:nth-child(4) > label")
    public WebElement FieldNameBtn;
    @FindBy(how = How.CSS, using = "#custom-field-form > div:nth-child(5) > label")
    public WebElement FieldDescriptionBtn;
    @FindBy(how = How.CSS, using = "#custom-field-form > div:nth-child(6) > label")
    public WebElement FieldTypeBtn;
    @FindBy(how = How.CSS, using = "#submit-form")
    public WebElement SaveBtn;

    @FindBy(how = How.CSS, using = "#field-name")
    public WebElement nameTextField;

    @FindBy(how = How.CSS, using = "#field-description")
    public WebElement descriptionTextField;

    @FindBy(how = How.CSS, using = "#text-tab")
    public WebElement textTab;

    @FindBy(how = How.CSS, using = "#number-tab")
    public WebElement numberTab;

    @FindBy(how = How.CSS, using = "#dropdown-tab")
    public WebElement dropdownTab;

    @FindBy(how = How.CSS, using = "#checkbox-tab")
    public WebElement checkboxTab;

    @FindBy(how = How.CSS, using = "#color-tab")
    public WebElement colorTab;

    @FindBy(how = How.CSS, using = "#submit-form")
    public WebElement saveForm;

    @FindBy(how = How.CSS, using = "div > div > div.iziToast-body > div.iziToast-texts > p")
    public WebElement successfullyText;

    @FindBy(how = How.CSS, using = "#checkbox-show-modal-category-494")
    public WebElement graphicCheckbox;

    @FindBy(how = How.CSS, using = "#go-next-step")
    public WebElement goNextStep;

    @FindBy(how = How.CSS, using = "#main-admin > div.container-fluid.bg-white.pb-5 > div:nth-child(1) > div > ul > li:nth-child(2) > a")
    public WebElement homePageLayout;

    @FindBy(how = How.CSS, using = "#search")
    public WebElement searchUserInput;

    @FindBy(how = How.CSS, using = "#display-name-7b1d49e4-942a-4a32-a976-ced874645f03")
    public WebElement userResultValidate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div.col-6.offset-lg-2")
    public WebElement siteWordingTxt;

    @FindBy(how = How.CSS, using = "#main-admin > section > div.row.no-gutters.bg-white.border-b-gray > div")
    public WebElement searchAndLenguage;

    @FindBy(how = How.CSS, using = "#main-admin > section > div.row.row-wordings.pt-4")
    public WebElement templateValidate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div")
    public WebElement settingsTitle;

    @FindBy(how = How.CSS, using = "#main-admin > section")
    public WebElement companyInfoSubscriptionInfo;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div")
    public WebElement stripeSettings;

    @FindBy(how = How.CSS, using = "#main-admin > section > div")
    public WebElement stripeTemplate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div")
    public WebElement seoSetupText;

    @FindBy(how = How.CSS, using = "#tabs")
    public WebElement tabs;

    @FindBy(how = How.CSS, using = "#landing-page > section")
    public WebElement siteMetaTagsTemplate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div.col-lg-6.offset-lg-2 > h1")
    public WebElement requestsTitle;

    @FindBy(how = How.CSS, using = "#main-admin > section > div.row.mb-lg-5")
    public WebElement requestsTemplate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div > h1")
    public WebElement browseConfigTitle;

    @FindBy(how = How.CSS, using = "#main-admin > section > div")
    public WebElement browseConfigTemplate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div.col-lg-6.offset-lg-2 > div > h1")
    public WebElement smsTitle;

    @FindBy(how = How.CSS, using = "#main-admin > div.py-4.b-top > div")
    public WebElement smsTemplate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div.col-lg-6.offset-lg-2 > h1")
    public WebElement ordersTitle;

    public void ordersTitleText(){
        fluentWait(getDriver(), ordersTitle);
        Assert.assertTrue(ordersTitle.isDisplayed());
    }

    public void smsTemplateSector(){
        fluentWait(getDriver(), smsTemplate);
        Assert.assertTrue(smsTemplate.isDisplayed());
    }

    public void smsTitleText(){
        fluentWait(getDriver(), smsTitle);
        Assert.assertTrue(smsTitle.isDisplayed());
    }



    public void  browseConfigTemplateSector(){
        fluentWait(getDriver(), browseConfigTemplate);
        Assert.assertTrue(browseConfigTemplate.isDisplayed());
    }

    public void BrowseConfigTxt(){
        fluentWait(getDriver(), browseConfigTitle);
        Assert.assertTrue(browseConfigTitle.isDisplayed());
    }


    public void requestsTemplateSector() {
        fluentWait(getDriver(), requestsTemplate);
        Assert.assertTrue(requestsTemplate.isDisplayed());
    }


    public void requestTitleText() {
        fluentWait(getDriver(), requestsTitle);
        Assert.assertTrue(requestsTitle.isDisplayed());
    }

    public void siteTagsTemplate() {
        fluentWait(getDriver(), siteMetaTagsTemplate);
        Assert.assertTrue(siteMetaTagsTemplate.isDisplayed());
    }

    public void tabsSector() {
        fluentWait(getDriver(), tabs);
        Assert.assertTrue(tabs.isDisplayed());
    }

    public void seoSetupTxt() {
        fluentWait(getDriver(), seoSetupText);
        Assert.assertTrue(seoSetupText.isDisplayed());
    }

    public void stripeTemplateSector() {
        fluentWait(getDriver(), stripeTemplate);
        Assert.assertTrue(stripeTemplate.isDisplayed());
    }

    public void stripeSettingsSector() {
        fluentWait(getDriver(), stripeSettings);
        Assert.assertTrue(stripeSettings.isDisplayed());
    }

    public void companyInfoSubscriptionSector() {
        fluentWait(getDriver(), companyInfoSubscriptionInfo);
        Assert.assertTrue(companyInfoSubscriptionInfo.isDisplayed());
    }

    public void settingsTitleSector() {
        fluentWait(getDriver(), settingsTitle);
        Assert.assertTrue(settingsTitle.isDisplayed());
    }

    public void templateSector() {
        fluentWait(getDriver(), templateValidate);
        Assert.assertTrue(templateValidate.isDisplayed());
    }

    public void searchAndLanguageSection() {
        fluentWait(getDriver(), searchAndLenguage);
        Assert.assertTrue((searchAndLenguage.isDisplayed()));
    }

    public void siteWordingText() {
        fluentWait(getDriver(), siteWordingTxt);
        Assert.assertTrue(siteWordingTxt.isDisplayed());
    }

    
    

    public void userResult() {
        fluentWait(getDriver(), userResultValidate);
        Assert.assertTrue(userResultValidate.isDisplayed());
    }

    public void setUsersBtn() {
        getDriver().navigate().to(UrlSVC + "/Admin/User");
    }

    public void searchUser() {
        fluentWait(getDriver(), searchUserInput);
        searchUserInput.sendKeys("gastongenaud");
    }


    public void selectHomePageLayout() {
        fluentWait(getDriver(), homePageLayout);
        waitForWebElementAndClick(homePageLayout);
    }

    public void nextStepButton() {
        fluentWait(getDriver(), goNextStep);
        waitForWebElementAndClick(goNextStep);
    }

    public void graphicDesign() {
        fluentWait(getDriver(), graphicCheckbox);
        waitForWebElementAndClick(graphicCheckbox);
    }

    public void successfullyTextDisplayed() {
        fluentWait(getDriver(), successfullyText);
        Assert.assertEquals(successfullyText.getText(), "successfully created!");
    }

    public void saveButton() {
        fluentWait(getDriver(), saveForm);
        waitForWebElementAndClick(saveForm);
    }

    public void colorPickerButton() {
        fluentWait(getDriver(), colorTab);
        waitForWebElementAndClick(colorTab);
    }

    public void checkboxButton() {
        fluentWait(getDriver(), checkboxTab);
        waitForWebElementAndClick(checkboxTab);
    }

    public void dropDownButton() {
        fluentWait(getDriver(), dropdownTab);
        waitForWebElementAndClick(dropdownTab);
    }

    public void numberButton() {
        fluentWait(getDriver(), numberTab);
        waitForWebElementAndClick(numberTab);
    }

    public void textButton() {
        fluentWait(getDriver(), textTab);
        waitForWebElementAndClick(textTab);
    }

    public void descriptionFieldText() {
        fluentWait(getDriver(), descriptionTextField);
        waitForWebElementAndClick(descriptionTextField);
        descriptionTextField.sendKeys("Testing");
    }


    public void fieldNameText() {
        fluentWait(getDriver(), nameTextField);
        waitForWebElementAndClick(nameTextField);
        nameTextField.sendKeys("Testing");
    }


    public void SetAsFilterCheckboxCustomFields() {
        fluentWait(getDriver(), SetAsFilterCheckboxCustomFields);
        waitForWebElementAndClick(SetAsFilterCheckboxCustomFields);

    }

    public void MandatoryCheckboxCustomFields() {
        fluentWait(getDriver(), MandatoryCheckboxCustomFields);
        waitForWebElementAndClick(MandatoryCheckboxCustomFields);
    }

    public void setHomePage() {
        getDriver().navigate().to(UrlSVC);
//        fluentWait(getDriver(), headerLogInBtn);
//        waitForWebElementAndClick(headerLogInBtn);
    }

    public void getHomePagePSVC() {
        getDriver().navigate().to(UrlSVC);
    }

    public void deleteCategory() {
        fluentWait(getDriver(), deleteXpath);
        waitForWebElementAndClick(deleteXpath);

        fluentWait(getDriver(), deleteCategoryConfirmBtn);
        waitForWebElementAndClick(deleteCategoryConfirmBtn);
    }

    public void goToAdminPanel() {
        getDriver().navigate().to(UrlSVC + "/admin/application/GetStarted");

//        getDriver().switchTo().frame(2);
//
//        getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div/header/div/button[1]")).click();
//        getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/header/div[1]/button")).click();
    }

    public void getCloseChat() {
        try {

            try {
                fluentWaitStrict(getDriver(), getDriver().findElement(By.xpath("//*[@id='webWidget']")));
                getDriver().switchTo().frame("webWidget");
                getDriver().findElement(By.xpath("//*[@aria-label='Minimizar widget']")).click();
            } catch (Exception e) {
                wait(6);
                getDriver().switchTo().frame("webWidget");
                getDriver().findElement(By.xpath("//*[@aria-label='Minimizar widget']")).click();
            }
        } catch (Exception e) {

        } finally {
            getDriver().switchTo().defaultContent();
        }

    }


    public String monetizationConfirm() {
        String result = monetizationText.getText();
        return result;
    }

    public String landingPageConfirm() {
        String result = landingPageText.getText();
        return result;
    }

    public boolean createCustomConfirm() {
        boolean result = createCustomText.isDisplayed();
        return result;
    }

    public boolean emailConfirm() {
        boolean result = emailText.isDisplayed();
        return result;
    }

    public String faqConfirm() {
        String result = faqText.getText();
        return result;
    }

    public String ordersConfirm() {
        String result = ordersText.getText();
        return result;
    }

    public String userTransactionsConfirm() {
        String result = userTransactionsText.getText();
        return result;
    }

    public String extensionsConfirm() {
        String result = extensionsText.getText();
        return result;
    }

    public void createMarketplace() {
        fluentWait(getDriver(), createMarketplace);
        waitForWebElementAndClick(createMarketplace);
    }

    public void monetization() {

        fluentWait(getDriver(), monetizationGetStarted);
        waitForWebElementAndClick(monetizationGetStarted);
        fluentWait(getDriver(), transactionFee);
        waitForWebElementAndClick(transactionFee);
    }

    public void landingPageLayout() {

        fluentWait(getDriver(), selectLandingPage);
        waitForWebElementAndClick(selectLandingPage);
    }

    public void designYourHomePage() {
        fluentWait(getDriver(), designHomePageBtn);
        waitForWebElementAndClick(designHomePageBtn);
    }

    public void goToCreateCustomFieldsBtn() {
        try {
            fluentWait(getDriver(), CreateCustomFieldBtn);
            waitForWebElementAndClick(CreateCustomFieldBtn);
            fluentWait(getDriver(), FieldNameBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), FieldNameBtn);
        }

    }

    public String validateFieldNameTest() {
        String result = FieldNameBtn.getText();
        return result;
    }

    public String validateFieldDescription() {
        String result = FieldDescriptionBtn.getText();
        return result;
    }

    public String validateFieldType() {
        String result = FieldTypeBtn.getText();
        return result;
    }

    public String validateSaveButton() {
        String result = SaveBtn.getText();
        return result;
    }

    public void next() {
        fluentWait(getDriver(), nextSteps);
        waitForWebElementAndClick(nextSteps);
    }

    public void nextSmtp() {
        fluentWait(getDriver(), nextStepsSmtp);
        waitForWebElementAndClick(nextStepsSmtp);
    }


    public void validateAdminPanel() {
    }


    public void selectLandingPage() {
        fluentWait(getDriver(), selectLandingPage);
        waitForWebElementAndClick(selectLandingPage);
    }

    public void createCategories() {
        fluentWait(getDriver(), createCategories);
        waitForWebElementAndClick(createCategories);
    }

    public void categoriesImportData() {
        fluentWaitStrict(getDriver(), categoriesImportData);
        waitForWebElementAndClick(categoriesImportData);
    }

    public void typeOnCategoryNameField() {
        fluentWait(getDriver(), categoryNameField);
        waitForWebElementAndClick(categoryNameField);
        retryingFindClick(categoryNameField);
        categoryNameField.sendKeys("AutomationTest");
    }

    public void addCategory() {
        fluentWait(getDriver(), addCategorybtn);
        waitForWebElementAndClick(addCategorybtn);
    }


    //STEPS 5
    public void createCustomFields() {
        fluentWait(getDriver(), createCustomFields);
        waitForWebElementAndClick(createCustomFields);

    }


    public void CustomFieldsHideHowItWorks() {
        fluentWait(getDriver(), createCustomFieldsHideShowBtn);
        waitForWebElementAndClick(createCustomFieldsHideShowBtn);
    }

    public void CustomFieldsShowHowItWorks() {
        fluentWait(getDriver(), createCustomFieldsHideShowBtn);
        waitForWebElementAndClick(createCustomFieldsHideShowBtn);
    }

    public void listingPagePreviewImage() {
        fluentWait(getDriver(), listingPagePreviewImage);
        waitForWebElementAndClick(listingPagePreviewImage);

        fluentWait(getDriver(), closePreviewImage);
        waitForWebElementAndClick(closePreviewImage);
    }

    public void browsePagePreviewImage() {
        fluentWait(getDriver(), browsePagePreviewImage);
        waitForWebElementAndClick(browsePagePreviewImage);

        fluentWait(getDriver(), closePreviewImage);
        waitForWebElementAndClick(closePreviewImage);
    }

    public void uploadAListingPreviewImage() {
        fluentWait(getDriver(), uploadAListingPreviewImage);
        waitForWebElementAndClick(uploadAListingPreviewImage);

        fluentWait(getDriver(), closePreviewImage);
        waitForWebElementAndClick(closePreviewImage);
    }

    public void AddNewFieldsText() {
        fluentWait(getDriver(), addNewFieldsText);
        waitForWebElementAndClick(addNewFieldsText);

        fluentWait(getDriver(), cancelCustomFieldEditBtn);
        waitForWebElementAndClick(cancelCustomFieldEditBtn);
    }

    public void AddNewFieldsNumber() {
        fluentWait(getDriver(), addNewFieldsNumber);
        waitForWebElementAndClick(addNewFieldsNumber);

        fluentWait(getDriver(), cancelCustomFieldEditBtn);
        waitForWebElementAndClick(cancelCustomFieldEditBtn);
    }

    public void AddNewFieldsDropdown() {
        fluentWait(getDriver(), addNewFieldsDropdown);
        waitForWebElementAndClick(addNewFieldsDropdown);

        fluentWait(getDriver(), cancelCustomFieldEditBtn);
        waitForWebElementAndClick(cancelCustomFieldEditBtn);
    }

    public void AddNewFieldsCheckbox() {
        fluentWait(getDriver(), addNewFieldsCheckbox);
        waitForWebElementAndClick(addNewFieldsCheckbox);

        fluentWait(getDriver(), cancelCustomFieldEditBtn);
        waitForWebElementAndClick(cancelCustomFieldEditBtn);
    }

    public void AddNewFieldsTags() {
        fluentWait(getDriver(), addNewFieldsTags);
        waitForWebElementAndClick(addNewFieldsTags);

        fluentWait(getDriver(), cancelCustomFieldEditBtn);
        waitForWebElementAndClick(cancelCustomFieldEditBtn);
    }

    public void AddNewFieldsColor() {
        fluentWait(getDriver(), addNewFieldsColor);
        waitForWebElementAndClick(addNewFieldsColor);

        fluentWait(getDriver(), cancelCustomFieldEditBtn);
        waitForWebElementAndClick(cancelCustomFieldEditBtn);
    }


    // Step 6
    public void emailStep() {
        fluentWait(getDriver(), emailStep);
        waitForWebElementAndClick(emailStep);
    }

    public void SMTPSettingsTabEmails() {
        actions.moveToElement(smtpSettingsEmails).build().perform();
        fluentWait(getDriver(), smtpSettingsEmails);
        waitForWebElementAndClick(smtpSettingsEmails);
    }

    public void templatesTabEmails() {
        try {
            getCloseChat();
        } catch (Exception e) {
        }

        fluentWait(getDriver(), templatesEmails);
        waitForWebElementAndClick(templatesEmails);
    }

    public void emailFieldStepEmails() {
        fluentWait(getDriver(), emailTextBar);
        waitForWebElementAndClick(emailTextBar);
        emailTextBar.clear();
        emailTextBar.sendKeys("no-reply@mymarketplacebuilder.com");
    }

    public void passwordFieldStepEmails() {
        fluentWait(getDriver(), emailPasswordTextBar);
        waitForWebElementAndClick(emailPasswordTextBar);
        emailPasswordTextBar.clear();
        emailPasswordTextBar.sendKeys("zcHuFNbR7e9dEuM");
    }

    public void verifyCredentialsEmails() {
        fluentWait(getDriver(), emailVerifyCredentialsBtn);
        waitForWebElementAndClick(emailVerifyCredentialsBtn);
    }

    public void clickHereTutorialRedirect() {
        String window = getDriver().getWindowHandle();
        fluentWait(getDriver(), emailTutorialBtn);
        waitForWebElementAndClick(emailTutorialBtn);
        getDriver().switchTo().window(window);
    }

    public void watchVideoRedirect() {
        String window = getDriver().getWindowHandle();
        fluentWait(getDriver(), watchVideoBtn);
        waitForWebElementAndClick(watchVideoBtn);
        getDriver().switchTo().window(window);
    }

    public void actionsTemplateOptions() {
        fluentWait(getDriver(), actionsBtn);
        waitForWebElementAndClick(actionsBtn);

        fluentWait(getDriver(), actionsCloseBtn);
        waitForWebElementAndClick(actionsCloseBtn);
    }

    public void statusCheckbox() {
        fluentWait(getDriver(), statusCheckbox);
        waitForWebElementAndClick(statusCheckbox);
    }

    //design
    public void designSection() {
        //actions.moveToElement(designSectionBtn).build().perform();
    }

    public void customizeLandingPage() {
        //designSection();
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/application/LandingCustomize#!");
    }

    public void customizeLandingPageHeader() {
        fluentWait(getDriver(), landingPageHeaderCustomizeBtn);
        waitForWebElementAndClick(landingPageHeaderCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseHeaderCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseHeaderCustomizeBtn);
    }

    public void customizeLandingPageFooter() {
        fluentWait(getDriver(), landingPageFooterCustomizeBtn);
        waitForWebElementAndClick(landingPageFooterCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseFooterCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseFooterCustomizeBtn);
    }

    public void customizeLandingPageSocialLinks() {
        fluentWait(getDriver(), landingPageSocialLinksCustomizeBtn);
        waitForWebElementAndClick(landingPageSocialLinksCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseSocialLinksCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseSocialLinksCustomizeBtn);
    }

    public void customizeLandingPageFonts() {
        fluentWait(getDriver(), landingPageFontsCustomizeBtn);
        waitForWebElementAndClick(landingPageFontsCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseFontsCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseFontsCustomizeBtn);
    }

    public void customizeLandingPageColors() {
        fluentWait(getDriver(), landingPageColorsCustomizeBtn);
        waitForWebElementAndClick(landingPageColorsCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseColorsCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseColorsCustomizeBtn);
    }

    public void customizeLandingPageLogo() {
        fluentWait(getDriver(), landingPageLogoAndFaviconCustomizeBtn);
        waitForWebElementAndClick(landingPageLogoAndFaviconCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseLogoAndFaviconCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseLogoAndFaviconCustomizeBtn);
        //closeLandingPage.click();
    }

    public void customizeMenu() {
        //designSection();
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Menu/Customize");
        fluentWait(getDriver(), customizeMenuOrderCheckBox);
        waitForWebElementAndClick(customizeMenuOrderCheckBox);
    }

    public void customizeLogIn() {
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/application/LoginCustomize");

        fluentWait(getDriver(), customizeLoginPageFacebookBtn);
        waitForWebElementAndClick(customizeLoginPageFacebookBtn);

        fluentWait(getDriver(), customizeLoginPageGoogleBtn);
        waitForWebElementAndClick(customizeLoginPageGoogleBtn);
    }

    public void customizeSignUp() {
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/application/SignupCustomize");
        // customizeSignUpBtn.click();
        fluentWait(getDriver(), customizeRegistrationPageFacebookBtn);
        waitForWebElementAndClick(customizeRegistrationPageFacebookBtn);

        fluentWait(getDriver(), customizeRegistrationPageGoogleBtn);
        waitForWebElementAndClick(customizeRegistrationPageGoogleBtn);
    }

    public void customizeContactUs() {
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/application/ContactUsCustomize");
        //customizeContactUsBtn.click();
        fluentWait(getDriver(), customizeContactPageTitleTextBar);
        waitForWebElementAndClick(customizeContactPageTitleTextBar);
        customizeContactPageTitleTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeContactPageIntroductoryTextBar);
        waitForWebElementAndClick(customizeContactPageIntroductoryTextBar);
        customizeContactPageIntroductoryTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeContactPageLocationTextBar);
        waitForWebElementAndClick(customizeContactPageLocationTextBar);
        customizeContactPageLocationTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeContactPageEmailTextBar);
        waitForWebElementAndClick(customizeContactPageEmailTextBar);
        customizeContactPageEmailTextBar.sendKeys("Automation@test.com");

        fluentWait(getDriver(), customizeContactPagePhoneTextBar);
        waitForWebElementAndClick(customizeContactPagePhoneTextBar);
        customizeContactPagePhoneTextBar.sendKeys("11111111111");

        fluentWait(getDriver(), customizeContactPageNameCheckBox);
        waitForWebElementAndClick(customizeContactPageNameCheckBox);

        fluentWait(getDriver(), customizeContactPageEmailCheckBox);
        waitForWebElementAndClick(customizeContactPageEmailCheckBox);

        fluentWait(getDriver(), customizeContactPageMessageCheckBox);
        waitForWebElementAndClick(customizeContactPageMessageCheckBox);

        fluentWait(getDriver(), customizeContactPageMapCheckBox);
        waitForWebElementAndClick(customizeContactPageMapCheckBox);

    }

    public void customizeAboutUs() {
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/AboutUs/Index");
        //customizeAboutUsBtn.click();
    }

    public void customizeAboutUsHeader() {
        fluentWait(getDriver(), customizeAboutUsPageHeaderBtn);
        waitForWebElementAndClick(customizeAboutUsPageHeaderBtn);

        fluentWait(getDriver(), customizeAboutUsPageHeaderSloganTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHeaderSloganTextBar);
        customizeAboutUsPageHeaderSloganTextBar.sendKeys("Test Automation");


        fluentWait(getDriver(), customizeAboutUsPageHeaderIntroductoryTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHeaderIntroductoryTextBar);
        customizeAboutUsPageHeaderIntroductoryTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeAboutUsPageHeaderParagraphTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHeaderParagraphTextBar);
        customizeAboutUsPageHeaderParagraphTextBar.sendKeys("Test Automation");
    }

    public void customizeAboutUsHowItWorks() {
        fluentWait(getDriver(), customizeAboutUsPageHowItWorksBtn);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksBtn);

        fluentWait(getDriver(), customizeAboutUsPageHowItWorksBtn);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksBtn);

        fluentWait(getDriver(), customizeAboutUsPageHowItWorksFirstTitleTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksFirstTitleTextBar);

        fluentWait(getDriver(), customizeAboutUsPageHowItWorksFirstTitleTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksFirstTitleTextBar);
        customizeAboutUsPageHowItWorksFirstTitleTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeAboutUsPageHowItWorksFirstParagraphTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksFirstParagraphTextBar);
        customizeAboutUsPageHowItWorksFirstParagraphTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeAboutUsPageHowItWorksSecondTitleTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksSecondTitleTextBar);

        fluentWait(getDriver(), customizeAboutUsPageHowItWorksSecondParagraphTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksSecondParagraphTextBar);
        customizeAboutUsPageHowItWorksSecondParagraphTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeAboutUsPageHowItWorksThirdTitleTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksThirdTitleTextBar);

        fluentWait(getDriver(), customizeAboutUsPageHowItWorksThirdTitleTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksThirdTitleTextBar);
        customizeAboutUsPageHowItWorksThirdTitleTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeAboutUsPageHowItWorksThirdParagraphTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksThirdParagraphTextBar);
        customizeAboutUsPageHowItWorksThirdParagraphTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeAboutUsPageHowItWorksFourthTitleTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksFourthTitleTextBar);
        customizeAboutUsPageHowItWorksFourthTitleTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeAboutUsPageHowItWorksFourthParagraphTextBar);
        waitForWebElementAndClick(customizeAboutUsPageHowItWorksFourthParagraphTextBar);
        customizeAboutUsPageHowItWorksFourthParagraphTextBar.sendKeys("Test Automation");
    }

    public void customizeAboutUsPreFooter() {
        fluentWait(getDriver(), customizeAboutUsPagePreFooterBtn);
        waitForWebElementAndClick(customizeAboutUsPagePreFooterBtn);

        fluentWait(getDriver(), customizeAboutUsPagePreFooterHeadLineTextBar);
        waitForWebElementAndClick(customizeAboutUsPagePreFooterHeadLineTextBar);
        customizeAboutUsPagePreFooterHeadLineTextBar.sendKeys("Test Automation");


        fluentWait(getDriver(), customizeAboutUsPagePreFooterSubHeadLineTextBar);
        waitForWebElementAndClick(customizeAboutUsPagePreFooterSubHeadLineTextBar);
        customizeAboutUsPagePreFooterSubHeadLineTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeAboutUsPagePreFooterParagraphTextBar);
        waitForWebElementAndClick(customizeAboutUsPagePreFooterParagraphTextBar);
        customizeAboutUsPagePreFooterParagraphTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeAboutUsPagePreFooterButtonTextBar);
        waitForWebElementAndClick(customizeAboutUsPagePreFooterButtonTextBar);
        customizeAboutUsPagePreFooterButtonTextBar.sendKeys("Test Automation");
    }

    public void customizeFAQ() {
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/application/FAQCustomize");
        //customizeFAQBtn.click();
        fluentWait(getDriver(), customizeFAQPageTitleTextBar);
        waitForWebElementAndClick(customizeFAQPageTitleTextBar);
        customizeFAQPageTitleTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeFAQPageAddNewQuestionBtn);
        waitForWebElementAndClick(customizeFAQPageAddNewQuestionBtn);

        fluentWait(getDriver(), customizeFAQPageWriteQuestionTextBar);
        waitForWebElementAndClick(customizeFAQPageWriteQuestionTextBar);
        customizeFAQPageWriteQuestionTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeFAQPageWriteAnswerTextBar);
        waitForWebElementAndClick(customizeFAQPageWriteAnswerTextBar);
        customizeFAQPageWriteAnswerTextBar.sendKeys("Test Automation");
    }

    public void customizeTermsAndConditions() {
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/application/TermsOfUseCustomize");
        //customizeTermsAndConditionsBtn.click();

        fluentWait(getDriver(), customizeTermsAndConditionsPageTitleTextBar);
        waitForWebElementAndClick(customizeTermsAndConditionsPageTitleTextBar);
        customizeTermsAndConditionsPageTitleTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeTermsAndConditionsPageAddNewFieldBtn);
        waitForWebElementAndClick(customizeTermsAndConditionsPageAddNewFieldBtn);

        fluentWait(getDriver(), customizeTermsAndConditionsPageNewFieldTitleTextBar);
        waitForWebElementAndClick(customizeTermsAndConditionsPageNewFieldTitleTextBar);
        customizeTermsAndConditionsPageNewFieldTitleTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeTermsAndConditionsPageDescriptionTextBar);
        waitForWebElementAndClick(customizeTermsAndConditionsPageDescriptionTextBar);
        customizeTermsAndConditionsPageDescriptionTextBar.sendKeys("Test Automation");
    }

    public void customizePrivacyPolicy() {
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/application/PrivacyCustomize");
        //customizePrivacyPolicyBtn.click();
        fluentWait(getDriver(), customizePrivacyPolicyPageTitleTextBar);
        waitForWebElementAndClick(customizePrivacyPolicyPageTitleTextBar);
        customizePrivacyPolicyPageTitleTextBar.sendKeys("Test Automation");


        fluentWait(getDriver(), customizePrivacyPolicyPageAddNewFieldBtn);
        waitForWebElementAndClick(customizePrivacyPolicyPageAddNewFieldBtn);

        fluentWait(getDriver(), customizePrivacyPolicyPageNewFieldTitleTextBar);
        waitForWebElementAndClick(customizePrivacyPolicyPageNewFieldTitleTextBar);
        customizePrivacyPolicyPageNewFieldTitleTextBar.sendKeys("Test Automation");


        fluentWait(getDriver(), customizePrivacyPolicyPageDescriptionTextBar);
        waitForWebElementAndClick(customizePrivacyPolicyPageDescriptionTextBar);
        customizePrivacyPolicyPageDescriptionTextBar.sendKeys("Test Automation");
    }

    //Settings
    public void settings() {
        fluentWaitStrict(getDriver(), settingsBtn);
        actions.moveToElement(settingsBtn).build().perform();
    }

    public void siteWording() {
        settings();

        try {
            getCloseChat();
        } catch (Exception e) {
        }

        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/admin/application/GlobalSettings");
//        fluentWait(getDriver(), siteWordingBtn);
//        waitForWebElementAndClick(siteWordingBtn);

        settings();

        try {
            getCloseChat();
        } catch (Exception e) {
        }

        fluentWait(getDriver(), siteWordingFilterTextBar);
        waitForWebElementAndClick(siteWordingFilterTextBar);
        siteWordingFilterTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), siteWordingFilterBtn);
        waitForWebElementAndClick(siteWordingFilterBtn);
    }

    public void settingsCompanyInfo() {
        settings();
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/admin/application/companyinfo");
//        fluentWaitStrict(getDriver(), settingsCompanyInfoBtn);
//        waitForWebElementAndClick(settingsCompanyInfoBtn);


//        fluentWaitStrict(getDriver(), selectCompanyInfoBtn);
//        waitForWebElementAndClick(selectCompanyInfoBtn);
//
//        fluentWait(getDriver(), companyInfoTitleTextBar);
//        waitForWebElementAndClick(companyInfoTitleTextBar);
//        companyInfoTitleTextBar.sendKeys("Test Automation");
//
//
//        fluentWait(getDriver(), companyInfoCompanyNameTextBar);
//        waitForWebElementAndClick(companyInfoCompanyNameTextBar);
//        companyInfoCompanyNameTextBar.sendKeys("Test Automation");
//
//
//        fluentWait(getDriver(), companyInfoCompanySiteDescriptionTextBar);
//        waitForWebElementAndClick(companyInfoCompanySiteDescriptionTextBar);
//        companyInfoCompanySiteDescriptionTextBar.click();
//        companyInfoCompanySiteDescriptionTextBar.sendKeys("Test Automation");
//
//
//        fluentWait(getDriver(), companyInfoContactNameTextBar);
//        waitForWebElementAndClick(companyInfoContactNameTextBar);
//        companyInfoContactNameTextBar.sendKeys("Test Automation");
//
//        fluentWait(getDriver(), companyInfoPhoneNumberTextField);
//        waitForWebElementAndClick(companyInfoPhoneNumberTextField);
//
//        fluentWait(getDriver(), companyInfoPhoneNumberTextField);
//        waitForWebElementAndClick(companyInfoPhoneNumberTextField);
//        companyInfoPhoneNumberTextField.sendKeys("Test Automation");
//
//
//        fluentWait(getDriver(), companyInfoPostProdKeyTextField);
//        waitForWebElementAndClick(companyInfoPostProdKeyTextField);
//        companyInfoPostProdKeyTextField.sendKeys("Test Automation");
//
//        fluentWait(getDriver(), companyInfoUSPSCarrierAccountIdTextField);
//        waitForWebElementAndClick(companyInfoUSPSCarrierAccountIdTextField);
//        companyInfoUSPSCarrierAccountIdTextField.sendKeys("Test Automation");
//
//
//        fluentWait(getDriver(), companyInfoGoogleLocationApiKeyTextField);
//        waitForWebElementAndClick(companyInfoGoogleLocationApiKeyTextField);
//        companyInfoGoogleLocationApiKeyTextField.sendKeys("Test Automation");
//
//
//        fluentWait(getDriver(), companyInfoFaviconURLTextField);
//        waitForWebElementAndClick(companyInfoFaviconURLTextField);
//        companyInfoFaviconURLTextField.sendKeys("https://test.automation");
//
//
//        fluentWait(getDriver(), companyInfoGoogleLocationApiSecondKeyTextField);
//        waitForWebElementAndClick(companyInfoGoogleLocationApiSecondKeyTextField);
//        companyInfoGoogleLocationApiSecondKeyTextField.sendKeys("Test Automation");
//
//
//        fluentWait(getDriver(), companyInfoFacebookOAuthIDTextField);
//        waitForWebElementAndClick(companyInfoFacebookOAuthIDTextField);
//        companyInfoFacebookOAuthIDTextField.sendKeys("111111111");
//
//
//        fluentWait(getDriver(), companyInfoGoogleAuthIDTextField);
//        waitForWebElementAndClick(companyInfoGoogleAuthIDTextField);
//        companyInfoGoogleAuthIDTextField.sendKeys("111111111");
//
//
//        fluentWait(getDriver(), companyInfoGoogleCaptchaKeyTextField);
//        waitForWebElementAndClick(companyInfoGoogleCaptchaKeyTextField);
//        companyInfoGoogleCaptchaKeyTextField.sendKeys("Test Automation");
//
//        fluentWait(getDriver(), companyInfoGoogleAnalyticsTrackingIdTextField);
//        waitForWebElementAndClick(companyInfoGoogleAnalyticsTrackingIdTextField);
//        companyInfoGoogleAnalyticsTrackingIdTextField.sendKeys("Test Automation");
//
//
//        fluentWait(getDriver(), companyInfoCommissionTextField);
//        waitForWebElementAndClick(companyInfoCommissionTextField);
//        companyInfoCommissionTextField.sendKeys("11");
//
//        fluentWait(getDriver(), selectSubscriptionInfoBtn);
//        waitForWebElementAndClick(selectSubscriptionInfoBtn);
    }

    public void paymentInfo() {
        settings();

        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/admin/application/StripeSettings");

//        fluentWait(getDriver(), settingsPaymentInfoBtn);
//        waitForWebElementAndClick(settingsPaymentInfoBtn);
//
//        fluentWait(getDriver(), selectPaymentInfoBtn);
//        waitForWebElementAndClick(selectPaymentInfoBtn);
//
//        fluentWait(getDriver(), selectSitePaymentService);
//        waitForWebElementAndClick(selectSitePaymentService);
//
//        fluentWait(getDriver(), paymentInfoStripeSecretApiKeyTextField);
//        waitForWebElementAndClick(paymentInfoStripeSecretApiKeyTextField);
//        paymentInfoStripeSecretApiKeyTextField.sendKeys("Test Automation");
//
//        fluentWait(getDriver(), paymentInfoStripePublishableApiKeyTextField);
//        waitForWebElementAndClick(paymentInfoStripePublishableApiKeyTextField);
//        paymentInfoStripePublishableApiKeyTextField.sendKeys("Test Automation");
//
//        fluentWait(getDriver(), paymentInfoStripeConnectClientIdTextField);
//        waitForWebElementAndClick(paymentInfoStripeConnectClientIdTextField);
//        paymentInfoStripeConnectClientIdTextField.sendKeys("Test Automation");
    }

    public void settingsOrdersSetup() {
        settings();
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/admin/application/OrdersSetup");
        //settingsOrdersSetupBtn.click();

        fluentWait(getDriver(), autoAcceptOrdersCheckBox);
        waitForWebElementAndClick(autoAcceptOrdersCheckBox);

        fluentWait(getDriver(), autoAcceptOrdersCheckBox);
        waitForWebElementAndClick(autoAcceptOrdersCheckBox);
    }

    public void settingsRequestSetup() {
        settings();
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/admin/application/RequestsSetup");
//        fluentWait(getDriver(), settingsRequestSetupBtn);
//        waitForWebElementAndClick(settingsRequestSetupBtn);

        fluentWait(getDriver(), enableRequestsOnMySiteCheckBox);
        waitForWebElementAndClick(enableRequestsOnMySiteCheckBox);
    }

    public void settingsDiscount() {
        settings();

        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/admin/application/BrowseConfig");
//        fluentWait(getDriver(), settingsDiscountBtn);
//        waitForWebElementAndClick(settingsDiscountBtn);

//        fluentWait(getDriver(), discountCodeTextField);
//        waitForWebElementAndClick(discountCodeTextField);
//        discountCodeTextField.sendKeys("Test Automation");
//
//        fluentWait(getDriver(), discountDescriptionTextField);
//        waitForWebElementAndClick(discountDescriptionTextField);
//        discountDescriptionTextField.sendKeys("Test Automation");
//
//
//        fluentWait(getDriver(), discountExpiryDateTextField);
//        waitForWebElementAndClick(discountExpiryDateTextField);
//        discountExpiryDateTextField.sendKeys("20062023");
//
//
//        fluentWait(getDriver(), discountAmountTextField);
//        waitForWebElementAndClick(discountAmountTextField);
//        discountAmountTextField.sendKeys("111");
//
//        fluentWait(getDriver(), discountAddCodeBtn);
//        waitForWebElementAndClick(discountAddCodeBtn);
//
//        fluentWait(getDriver(), discountEliminate);
//        waitForWebElementAndClick(discountEliminate);
    }

    //Reports
    public void reports() {
        actions.moveToElement(reportsBtn).perform();
    }

    public void contactMessages() {
        actions.moveToElement(reportsBtn).perform();

        fluentWait(getDriver(), contactMessagesBtn);
        waitForWebElementAndClick(contactMessagesBtn);

        fluentWait(getDriver(), contactMessagesEmailForwardingCheckBox);
        waitForWebElementAndClick(contactMessagesEmailForwardingCheckBox);
    }

    public void userReviews() {
        //   reports();
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/Application/UserReviews");
//        fluentWait(getDriver(), userReviewsBtn);
//        waitForWebElementAndClick(userReviewsBtn);

        fluentWait(getDriver(), userReviewsSearchFilterTextField);
        waitForWebElementAndClick(userReviewsSearchFilterTextField);
        userReviewsSearchFilterTextField.sendKeys("Test");
    }

    public void listingReviews() {
        //reports();
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/Application/ListingsReviews");

//        fluentWait(getDriver(), listingReviewsBtn);
//        waitForWebElementAndClick(listingReviewsBtn);

        fluentWait(getDriver(), listingReviewsSearchFilterTextField);
        waitForWebElementAndClick(listingReviewsSearchFilterTextField);
        listingReviewsSearchFilterTextField.sendKeys("Test");

    }

    public void userTransactions() {
        //reports();

        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/Transaction");
//        fluentWait(getDriver(), reportsUserTransactions);
//        waitForWebElementAndClick(reportsUserTransactions);


    }

    //Add-ons

    public void addonBtnFromPanel() {
        getDriver().navigate().to(UrlSVC + "admin/feature/addons");
//        fluentWait(getDriver(), addonBtn);
//        waitForWebElementAndClick(addonBtn);
    }

    public void addNewAddOns() {
        fluentWait(getDriver(), addNewAddOnsBtn);
        waitForWebElementAndClick(addNewAddOnsBtn);
    }

    public void backToAddOns() {
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/admin/feature/addons");
    }

    public void selectAddOnsProductSections() {
        fluentWait(getDriver(), selectAddOnsProductSectionBtn);
        waitForWebElementAndClick(selectAddOnsProductSectionBtn);

        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/admin/feature/addons");
    }

    public void addOnsEdit() {
        fluentWait(getDriver(), addOnsEditBtn);
        waitForWebElementAndClick(addOnsEditBtn);
    }

    public void backToAddOnsAgain() {
        fluentWait(getDriver(), backToAddOnsAgainBtn);
        waitForWebElementAndClick(backToAddOnsAgainBtn);
    }

    public void addOnsFilterTextField() {
        fluentWait(getDriver(), addOnsFilterTextField);
        waitForWebElementAndClick(addOnsFilterTextField);
    }

    public void addOnsFilterTextFieldType() {
        addOnsFilterTextField.sendKeys("Explainer Video");
    }

    public void addOnsFilterBtn() {
        fluentWait(getDriver(), addOnsFilterBtn);
        waitForWebElementAndClick(addOnsFilterBtn);
    }

    public void validateExtension() {
        boolean result = explainerVideoBtn.isDisplayed();
        Assert.assertTrue(result);
    }
    //Extensions

    public void extensions() {
        fluentWait(getDriver(), addonBtn);
        waitForWebElementAndClick(addonBtn);

        fluentWait(getDriver(), extensionsBtn);
        waitForWebElementAndClick(extensionsBtn);

        fluentWait(getDriver(), addExtensionBtn);
        waitForWebElementAndClick(addExtensionBtn);

        fluentWait(getDriver(), backToExtensionsBtn);
        waitForWebElementAndClick(backToExtensionsBtn);


        fluentWait(getDriver(), extensionsFilterAllSectionsBtn);
        waitForWebElementAndClick(extensionsFilterAllSectionsBtn);


        fluentWait(getDriver(), extensionsFilterAllSectionsBtn);
        waitForWebElementAndClick(extensionsFilterAllSectionsBtn);

        fluentWait(getDriver(), extensionsFilterLandingPageSectionBtn);
        waitForWebElementAndClick(extensionsFilterLandingPageSectionBtn);


        fluentWait(getDriver(), extensionsFilterSignUpSectionBtn);
        waitForWebElementAndClick(extensionsFilterSignUpSectionBtn);

        fluentWait(getDriver(), extensionsFilterAddListingSectionBtn);
        waitForWebElementAndClick(extensionsFilterAddListingSectionBtn);

        fluentWait(getDriver(), extensionsFilterBrowsePageSectionBtn);
        waitForWebElementAndClick(extensionsFilterBrowsePageSectionBtn);

        fluentWait(getDriver(), extensionsFilterListingPageSectionBtn);
        waitForWebElementAndClick(extensionsFilterListingPageSectionBtn);

        fluentWait(getDriver(), extensionsFilterTextField);
        waitForWebElementAndClick(extensionsFilterTextField);
        extensionsFilterTextField.sendKeys("Test");

        fluentWait(getDriver(), extensionsFilterBtn);
        waitForWebElementAndClick(extensionsFilterBtn);
    }

    //Step 7 and forward

    public void connectDomain() {
        fluentWait(getDriver(), connectDomain);
        waitForWebElementAndClick(connectDomain);
    }

    public void socialLogin() {
        fluentWait(getDriver(), socialLogin);
        waitForWebElementAndClick(socialLogin);
    }

    public void createTestUsers() {
        fluentWait(getDriver(), createTestUsers);
        waitForWebElementAndClick(createTestUsers);
    }

    public void inviteUsers() {
        fluentWait(getDriver(), inviteUsers);
        waitForWebElementAndClick(inviteUsers);
    }


    public void marketingTips() {
        fluentWait(getDriver(), marketingTips);
        waitForWebElementAndClick(marketingTips);
    }

    public void deleteTheLastCustomField() {

        try {
            fluentWait(getDriver(), getDriver().findElement(By.id("custom-fields")));
            List<WebElement> elements = getDriver().findElements(By.xpath("//*[@class='btn dropdown-action-listing dropdown-toggle pt-0']"));
            try {
                getCloseChat();
            } catch (Exception e) {
                wait(5);
                getCloseChat();
            }
            WebElement lastElement = elements.get(elements.size() - 1);
            waitForWebElementAndClick(lastElement);
            WebElement spanElement = lastElement.findElement(By.xpath("//a[contains(text(), 'Delete')]"));
            waitForWebElementAndClick(spanElement);
        } catch (Exception e) {
            wait(5);
            fluentWait(getDriver(), getDriver().findElement(By.id("custom-fields")));
            List<WebElement> elements = getDriver().findElements(By.xpath("//*[@class='btn dropdown-action-listing dropdown-toggle pt-0']"));
            WebElement lastElement = elements.get(elements.size() - 1);
            waitForWebElementAndClick(lastElement);
            WebElement spanElement = lastElement.findElement(By.xpath("//a[contains(text(), 'Delete')]"));
            fluentWait(getDriver(), spanElement);
            waitForWebElementAndClick(spanElement);
        }
    }

  

    public void companyInfo() {
        Assert.assertEquals(UrlDevServices + "admin/application/companyinfo", getDriver().getCurrentUrl());
    }
    
    public void siteMetaTags() {
        Assert.assertEquals(UrlDevServices + "admin/application/MetaTags", getDriver().getCurrentUrl());
    }

    public void requestsSetup() {
        Assert.assertEquals(UrlDevServices + "admin/application/RequestsSetup", getDriver().getCurrentUrl());
    }

    public void browseConfig() {
        Assert.assertEquals(UrlDevServices + "admin/application/BrowseConfig", getDriver().getCurrentUrl());
    }

    public void smsSettings() {
        Assert.assertEquals(UrlDevServices + "admin/application/SmsSettings", getDriver().getCurrentUrl());
    }

    public void ordersSetup() {
        Assert.assertEquals(UrlDevServices + "admin/application/OrdersSetup", getDriver().getCurrentUrl());
    }

}
