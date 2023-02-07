package pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class AdminPage extends BasePage {


    public AdminPage() {
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
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div.row.py-4 > div > div > div > div > button")
    public WebElement categoriesImportData;
    @FindBy(how = How.CSS, using = "#modal-import-data1 > div > div > div.modal-header.border-bottom-0 > button")
    public WebElement closeCategoriesImportData;
    @FindBy(how = How.CSS, using = "#CategoryName")
    public WebElement categoryNameField;
    @FindBy(how = How.CSS, using = "#btnAddCategory")
    public WebElement addCategorybtn;

    @FindBy(how = How.CSS, using = "#Q29uZmlybSUyMHRoYXQlMjB5b3UlMjB3YW50JTIwdG8lMjBkZWxldGUlMjB0aGUlMjBjYXRlZ29yeSUzRg > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
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
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(1) > div > ul > li:nth-child(5) > a:nth-child(1)")
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
    @FindBy(how = How.CSS, using = "#Title-2")
    public WebElement customizeTermsAndConditionsPageNewFieldTitleTextBar;
    @FindBy(how = How.CSS, using = "#Description-2")
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
    @FindBy(xpath = "/html/body/div[2]/div/aside/nav[1]/ul[2]/li[9]/a")
    public WebElement settingsBtn;
    //Wording Site(Language)
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(1)")
    public WebElement siteWordingBtn;
    @FindBy(how = How.CSS, using = "#search")
    public WebElement siteWordingFilterTextBar;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > section > div.row.no-gutters.bg-white.border-b-gray > div > div > div.col-lg-9 > div > div > div.col-lg-2 > button")
    public WebElement siteWordingFilterBtn;
    //Company info
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > div > a:nth-child(2)")
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
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li:nth-child(11) > a > span")
    public WebElement addonBtn;
    @FindBy(how = How.CSS, using = "#product-tab")
    public WebElement selectAddOnsProductSectionBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > div.col-auto.pr-2 > a")
    public WebElement addNewAddOnsBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > div > a")
    public WebElement backToAddOnsBtn;
    @FindBy(how = How.CSS, using = "#txtFilter")
    public WebElement addOnsFilterTextField;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div/section/div/div[2]/button")
    public WebElement addOnsFilterBtn;
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
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(4) > div > ul > li.d-flex.align-items-center.done > a > strong")
    public WebElement connectDomain;
    //Step 8
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(4) > div > ul > li:nth-child(2) > a > strong")
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

    public void setHomePage() {
        getDriver().navigate().to(url);

        headerLogInBtn.click();
    }

    public void goToAdminPanel() {
        getDriver().navigate().to(url + "/admin/application/GetStarted");

//        getDriver().switchTo().frame(2);
//       
//        getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div/header/div/button[1]")).click();
//        getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/header/div[1]/button")).click();
    }

    public void getCloseChat() {
        getDriver().switchTo().frame(2);
        getDriver().findElement(By.xpath("//*[@aria-label='Minimizar widget']")).click();
        //getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/header/div[1]/button")).click();
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
        fluentWait(getDriver(), categoriesImportData);
        waitForWebElementAndClick(categoriesImportData);
    }

    public void typeOnCategoryNameField() {
        fluentWait(getDriver(), categoryNameField);
        waitForWebElementAndClick(categoryNameField);
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
        actions.moveToElement(designSectionBtn).build().perform();
    }

    public void customizeLandingPage() {
        //designSection();
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Admin/application/LandingCustomize#!");
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
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Menu/Customize");
        fluentWait(getDriver(), customizeMenuOrderCheckBox);
        waitForWebElementAndClick(customizeMenuOrderCheckBox);
    }

    public void customizeLogIn() {
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Admin/application/LoginCustomize");

        fluentWait(getDriver(), customizeLoginPageFacebookBtn);
        waitForWebElementAndClick(customizeLoginPageFacebookBtn);

        fluentWait(getDriver(), customizeLoginPageGoogleBtn);
        waitForWebElementAndClick(customizeLoginPageGoogleBtn);
    }

    public void customizeSignUp() {
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Admin/application/SignupCustomize");
        // customizeSignUpBtn.click();
        fluentWait(getDriver(), customizeRegistrationPageFacebookBtn);
        waitForWebElementAndClick(customizeRegistrationPageFacebookBtn);

        fluentWait(getDriver(), customizeRegistrationPageGoogleBtn);
        waitForWebElementAndClick(customizeRegistrationPageGoogleBtn);
    }

    public void customizeContactUs() {
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Admin/application/ContactUsCustomize");
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

        fluentWait(getDriver(),customizeContactPageNameCheckBox);
        waitForWebElementAndClick(customizeContactPageNameCheckBox);

        fluentWait(getDriver(), customizeContactPageEmailCheckBox);
        waitForWebElementAndClick(customizeContactPageEmailCheckBox);

        fluentWait(getDriver(), customizeContactPageMessageCheckBox);
        waitForWebElementAndClick(customizeContactPageMessageCheckBox);

        fluentWait(getDriver(), customizeContactPageMapCheckBox);
        waitForWebElementAndClick(customizeContactPageMapCheckBox);

    }

    public void customizeAboutUs() {
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Admin/AboutUs/Index");
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
        customizeAboutUsPageHowItWorksBtn.click();
        customizeAboutUsPageHowItWorksFirstTitleTextBar.click();
        customizeAboutUsPageHowItWorksFirstTitleTextBar.sendKeys("Test Automation");
        customizeAboutUsPageHowItWorksFirstParagraphTextBar.click();
        customizeAboutUsPageHowItWorksFirstParagraphTextBar.sendKeys("Test Automation");
        customizeAboutUsPageHowItWorksSecondTitleTextBar.click();
        customizeAboutUsPageHowItWorksSecondParagraphTextBar.click();
        customizeAboutUsPageHowItWorksSecondParagraphTextBar.sendKeys("Test Automation");
        customizeAboutUsPageHowItWorksThirdTitleTextBar.click();
        customizeAboutUsPageHowItWorksThirdTitleTextBar.sendKeys("Test Automation");
        customizeAboutUsPageHowItWorksThirdParagraphTextBar.click();
        customizeAboutUsPageHowItWorksThirdParagraphTextBar.sendKeys("Test Automation");
        customizeAboutUsPageHowItWorksFourthTitleTextBar.click();
        customizeAboutUsPageHowItWorksFourthTitleTextBar.sendKeys("Test Automation");
        customizeAboutUsPageHowItWorksFourthParagraphTextBar.click();
        customizeAboutUsPageHowItWorksFourthParagraphTextBar.sendKeys("Test Automation");
    }

    public void customizeAboutUsPreFooter() {
        customizeAboutUsPagePreFooterBtn.click();
        customizeAboutUsPagePreFooterHeadLineTextBar.click();
        customizeAboutUsPagePreFooterHeadLineTextBar.sendKeys("Test Automation");
        customizeAboutUsPagePreFooterSubHeadLineTextBar.click();
        customizeAboutUsPagePreFooterSubHeadLineTextBar.sendKeys("Test Automation");
        customizeAboutUsPagePreFooterParagraphTextBar.click();
        customizeAboutUsPagePreFooterParagraphTextBar.sendKeys("Test Automation");
        customizeAboutUsPagePreFooterButtonTextBar.click();
        customizeAboutUsPagePreFooterButtonTextBar.sendKeys("Test Automation");
    }

    public void customizeFAQ() {
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Admin/application/FAQCustomize");
        //customizeFAQBtn.click();
        customizeFAQPageTitleTextBar.click();
        customizeFAQPageTitleTextBar.sendKeys("Test Automation");
        customizeFAQPageAddNewQuestionBtn.click();
        customizeFAQPageWriteQuestionTextBar.click();
        customizeFAQPageWriteQuestionTextBar.sendKeys("Test Automation");
        customizeFAQPageWriteAnswerTextBar.click();
        customizeFAQPageWriteAnswerTextBar.sendKeys("Test Automation");
    }

    public void customizeTermsAndConditions() {
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Admin/application/TermsOfUseCustomize");
        //customizeTermsAndConditionsBtn.click();
        customizeTermsAndConditionsPageTitleTextBar.click();
        customizeTermsAndConditionsPageTitleTextBar.sendKeys("Test Automation");
        customizeTermsAndConditionsPageAddNewFieldBtn.click();
        customizeTermsAndConditionsPageNewFieldTitleTextBar.click();
        customizeTermsAndConditionsPageNewFieldTitleTextBar.sendKeys("Test Automation");
        customizeTermsAndConditionsPageDescriptionTextBar.click();
        customizeTermsAndConditionsPageDescriptionTextBar.sendKeys("Test Automation");
    }

    public void customizePrivacyPolicy() {
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Admin/application/PrivacyCustomize");
        //customizePrivacyPolicyBtn.click();
        customizePrivacyPolicyPageTitleTextBar.click();
        customizePrivacyPolicyPageTitleTextBar.sendKeys("Test Automation");
        customizePrivacyPolicyPageAddNewFieldBtn.click();
        customizePrivacyPolicyPageNewFieldTitleTextBar.click();
        customizePrivacyPolicyPageNewFieldTitleTextBar.sendKeys("Test Automation");
        customizePrivacyPolicyPageDescriptionTextBar.click();
        customizePrivacyPolicyPageDescriptionTextBar.sendKeys("Test Automation");
    }

    //Settings
    public void settings() {
        actions.moveToElement(settingsBtn).build().perform();
    }

    public void siteWording() {
        settings();
        siteWordingBtn.click();
        siteWordingFilterTextBar.click();
        siteWordingFilterTextBar.sendKeys("Test Automation");
        siteWordingFilterBtn.click();

    }

    public void settingsCompanyInfo() {
        settings();
        settingsCompanyInfoBtn.click();
        selectCompanyInfoBtn.click();
        companyInfoTitleTextBar.click();
        companyInfoTitleTextBar.sendKeys("Test Automation");
        companyInfoCompanyNameTextBar.click();
        companyInfoCompanyNameTextBar.sendKeys("Test Automation");
        companyInfoCompanySiteDescriptionTextBar.click();
        companyInfoCompanySiteDescriptionTextBar.sendKeys("Test Automation");
        companyInfoContactNameTextBar.click();
        companyInfoContactNameTextBar.sendKeys("Test Automation");
        companyInfoPhoneNumberTextField.click();
        companyInfoPhoneNumberTextField.sendKeys("Test Automation");
        companyInfoPostProdKeyTextField.click();
        companyInfoPostProdKeyTextField.sendKeys("Test Automation");
        companyInfoUSPSCarrierAccountIdTextField.click();
        companyInfoUSPSCarrierAccountIdTextField.sendKeys("Test Automation");

        companyInfoGoogleLocationApiKeyTextField.click();
        companyInfoGoogleLocationApiKeyTextField.sendKeys("Test Automation");
        companyInfoFaviconURLTextField.click();
        companyInfoFaviconURLTextField.sendKeys("https://test.automation");
        companyInfoGoogleLocationApiSecondKeyTextField.click();
        companyInfoGoogleLocationApiSecondKeyTextField.sendKeys("Test Automation");
        companyInfoFacebookOAuthIDTextField.click();
        companyInfoFacebookOAuthIDTextField.sendKeys("111111111");
        companyInfoGoogleAuthIDTextField.click();
        companyInfoGoogleAuthIDTextField.sendKeys("111111111");
        companyInfoGoogleCaptchaKeyTextField.click();
        companyInfoGoogleCaptchaKeyTextField.sendKeys("Test Automation");
        companyInfoGoogleAnalyticsTrackingIdTextField.click();
        companyInfoGoogleAnalyticsTrackingIdTextField.sendKeys("Test Automation");
        companyInfoCommissionTextField.click();
        companyInfoCommissionTextField.sendKeys("11");
        selectSubscriptionInfoBtn.click();

    }

    public void paymentInfo() {
        settings();
        settingsPaymentInfoBtn.click();
        selectPaymentInfoBtn.click();
        selectSitePaymentService.click();
        paymentInfoStripeSecretApiKeyTextField.click();
        paymentInfoStripeSecretApiKeyTextField.sendKeys("Test Automation");
        paymentInfoStripePublishableApiKeyTextField.click();
        paymentInfoStripePublishableApiKeyTextField.sendKeys("Test Automation");
        paymentInfoStripeConnectClientIdTextField.click();
        paymentInfoStripeConnectClientIdTextField.sendKeys("Test Automation");

    }

    public void settingsOrdersSetup() {
        settings();
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/admin/application/OrdersSetup");

        //settingsOrdersSetupBtn.click();
        autoAcceptOrdersCheckBox.click();
        autoAcceptOrdersCheckBox.click();
    }

    public void settingsRequestSetup() {
        settings();
        settingsRequestSetupBtn.click();
        enableRequestsOnMySiteCheckBox.click();
        enableRequestsOnMySiteCheckBox.click();
    }

    public void settingsDiscount() {
        settings();
        settingsDiscountBtn.click();
        discountCodeTextField.click();
        discountCodeTextField.sendKeys("Test Automation");
        discountDescriptionTextField.click();
        discountDescriptionTextField.sendKeys("Test Automation");
        discountExpiryDateTextField.click();
        discountExpiryDateTextField.sendKeys("20062023");
        discountAmountTextField.click();
        discountAmountTextField.sendKeys("111");
        discountAddCodeBtn.click();

        discountEliminate.click();
    }

    //Reports
    public void reports() {
        actions.moveToElement(reportsBtn).perform();
    }

    public void contactMessages() {
        actions.moveToElement(reportsBtn).perform();
        contactMessagesBtn.click();
        contactMessagesEmailForwardingCheckBox.click();
        contactMessagesEmailForwardingCheckBox.click();
    }

    public void userReviews() {
        reports();
        userReviewsBtn.click();
        userReviewsSearchFilterTextField.click();
        userReviewsSearchFilterTextField.sendKeys("Test");

    }

    public void listingReviews() {
        reports();
        listingReviewsBtn.click();
        listingReviewsSearchFilterTextField.click();
        listingReviewsSearchFilterTextField.sendKeys("Test");

    }

    public void userTransactions() {
        reports();
        reportsUserTransactions.click();
    }

    //Add-ons

    public void addonBtnFromPanel() {
        addonBtn.click();
    }

    public void addNewAddOns() {
        addNewAddOnsBtn.click();
    }

    public void backToAddOns() {
        backToAddOnsBtn.click();
    }

    public void selectAddOnsProductSections() {
        selectAddOnsProductSectionBtn.click();
    }

    public void addOnsEdit() {
        addOnsEditBtn.click();
    }

    public void backToAddOnsAgain() {
        backToAddOnsAgainBtn.click();
    }

    public void addOnsFilterTextField() {
        addOnsFilterTextField.click();
    }

    public void addOnsFilterTextFieldType() {
        addOnsFilterTextField.sendKeys("Test");
    }

    public void addOnsFilterBtn() {

        addOnsFilterBtn.click();
    }


    //Extensions

    public void extensions() {
        addonBtn.click();
        extensionsBtn.click();
        addExtensionBtn.click();
        backToExtensionsBtn.click();
        extensionsFilterAllSectionsBtn.click();
        extensionsFilterLandingPageSectionBtn.click();
        extensionsFilterSignUpSectionBtn.click();
        extensionsFilterAddListingSectionBtn.click();
        extensionsFilterBrowsePageSectionBtn.click();
        extensionsFilterListingPageSectionBtn.click();
        extensionsFilterTextField.click();
        extensionsFilterTextField.sendKeys("Test");
        extensionsFilterBtn.click();
    }

    //Step 7 and forward

    public void connectDomain() {
        connectDomain.click();
    }

    public void socialLogin() {
        socialLogin.click();
    }

    public void createTestUsers() {
        createTestUsers.click();
    }

    public void inviteUsers() {
        inviteUsers.click();
    }


    public void marketingTips() {
        marketingTips.click();
    }

}