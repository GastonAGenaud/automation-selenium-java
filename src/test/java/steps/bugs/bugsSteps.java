package steps.bugs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.bugs.bugsPage;

public class bugsSteps extends BasePage {

    private bugsPage _page;

    public bugsSteps() {

        this._page = new bugsPage();
    }

    @Given("I Sign in with new account {string} and go to dashboard")
    public void iSignInAndGoToDashboard(String text) {
        _page.CreateAnAccountListingDetails(text);
        _page.imSellerButton();
        _page.nextButton();
        _page.howOldAreYou();
        _page.howMuchSell();
        _page.termsAndConditions();
        _page.whereAreYouFrom();
        _page.submitButton();
    }


    @And("I select the Flat Rate button")
    public void iSelectTheFlatRateButton() {
        _page.sleep(4000);
        _page.setFlatButton();
        _page.sleep(4000);
    }

    @When("I select tracking number TextField")
    public void iSelectTrackingNumberTextField() {
        _page.setTrackingTextField();
    }

    @And("select Submit button")
    public void selectSubmitButton() {
        _page.setSubmitBtn();
    }

    @Then("I validate tracking number")
    public void iValidateTrackingNumber() {
        Assert.assertEquals(false, _page.setSuccessPopUp());
    }

    @Given("I go to orders page BUGS")
    public void iGoToOrdersPageBUGS() {
        //_driver.manage().window().setSize(new Dimension(1920, 1080));
        _page.setHomePageBUG();
        _page.loginGastonUser();
        _page.goToDashboard();
        _page.goToOrders();
    }

    @And("select My Listings button")
    public void selectMyListingsButton() {
        _page.setMyListingsBtn();
    }

    @When("select My Listings button BUG")
    public void selectMyListingsButtonBUG() {
        _page.setMyListingsBtn();
        _page.sleep(3000);
    }

    @And("select item tab")
    public void selectItemTab() {
        _page.setItemDots();
    }

    @And("select Feature option")
    public void selectFeatureOption() {
        _page.setFeatureBtn();
    }

    @And("complete Start Date TextField")
    public void completeStartDateTextField() {
        _page.setStartDateTextField();
    }

    @And("complete End Date TextField")
    public void completeEndDateTextField() {
        _page.setEndDateTextField();
    }

    @When("select Feature Listing button")
    public void selectFeatureListingButton() {
        _page.setFeatureListingsBtn();
    }

    @Then("I validate Feature Listing")
    public void iValidateFeatureListing() {
        _page.sleep(4000);
        Assert.assertEquals(true, _page.setApprovedText());
    }

    @Given("I login and I go to Dashboard BUG")
    public void loginAndGoToDashboardPageBUG() {
        _page.setHomePageBUG();
        //_page.goToDashboard();
        _page.goToLoginPage();
        _page.login();
        _page.goToDashboard();
    }

    @And("I validate add new listing button BUG")
    public void iValidateTheAddNewListingButtonBUG() {
        _page.addNewListing();
    }

    @And("I select go to details")
    public void iSelectGoToDetails() {
        _page.setGoToDetailsBtn();
    }

    @And("select no Shipping Tab")
    public void selectNoShippingTab() {
        _page.setNoShippingTab();
    }

    @And("I select Publish button BUG")
    public void iSelectPublishButtonBUG() {
        _page.setPublishButton();
        _page.sleep(4000);
        _page.goBackToDashboard();
    }

    @Then("I validate settings Company Info BUG")
    public void iValidateSettingsCompanyInfoBug() {
        _page.settingsCompanyInfo();
    }

    @And("select Edit button")
    public void selectEditButton() {
        _page.setEditTemplateBtn();
    }

    @Then("I validate Templates and Edit")
    public void iValidateTemplatesAndEdit() {
        Assert.assertEquals(true, _page.SetTemplateTab());

    }

    @Then("I validate the sign up with Google BUG")
    public void iValidateTheSignUpWithGoogleBUG() {
        _page.signUpWithGoogle();
        _page.sleep(3000);
        Assert.assertEquals(true, _page.setGoogleLoginText());
    }

    @When("select Publish button BUG")
    public void selectPublishButtonBUG() {
        _page.setPublishButton();
        _page.sleep(4000);
        _page.goBackToDashboard();
    }

    @Then("I validate Publish Listing")
    public void iValidatePublishListing() {
        _page.sleep(7000);
        Assert.assertEquals(_page.listingActiveTab(), true);
    }

    @And("I validate the listing image BUG")
    public void iValidateTheListingImageBUG() {
        _page.listingImageLoad();
        _page.sleep(2000);
        _page.cropButton();
    }

    @And("I validate the listing image BUG IMAGE")
    public void iValidateTheListingImageBUGIMAGE() {
        //_page.listingImageLoad();
        //_page.sleep(2000);
    }

    @And("select Download file")
    public void selectDownloadFile() {
        _page.ordersPurchasedButton();
        _page.sleep(3000);
        _page.downloadFileButton();
    }

    @Then("I validate Download file")
    public void iValidateDownloadFile() {
        Assert.assertEquals(true, _page.setImageValidate());
    }

    @And("I add an item to the Shopping Cart BUG")
    public void iAddAnItemToTheShoppingCartBUG() {
        _page.goToItemBUG();
        System.out.println("selectAddToCart");
        _page.selectAddToCartBUG();
        _page.sleep(4000);
        System.out.println("selectCartIcon");
        _page.selectCartIconBUG();
    }

    @And("I add an Address BUGS")
    public void iAddAnAddressBUGS() {
        _page.sleep(2000);
        _page.selectAddShippingAddress();
        _page.selectPreviousAddress();
    }

    @And("I validate the listing image BUGS")
    public void iValidateTheListingImageBUGS() {
        _page.listingImageLoad();
        _page.sleep(4000);
    }

    @Given("I go to Sign Up Page BUG")
    public void iGoToSignUpPageBUG() {
        _page.setHomePage();
        _page.goToSignUp();
        _page.signUpWithGoogle();
        _page.sleep(3000);
        Assert.assertEquals(true, _page.setGoogleLoginText());
    }

    @And("I select user message")
    public void iSelectUserMessage() {
        _page.selectingUserMessage();
    }

    @Then("I validate inbox sector")
    public void iValidateInboxSector() {
        Assert.assertEquals(true, _page.setInboxAboutText());
    }

    @And("I select inbox icon button OHE")
    public void iSelectInboxIconButtonOHE() {
        _page.headerInbox();
    }

    @And("select Settings button")
    public void selectSettingsButton() {
        _page.sleep(5000);
        _page.setSettingsTabButton();
        _page.sleep(5000);
    }

    @When("complete First Name TextField")
    public void completeFirstNameTextField() {
        _page.setFirstNameTextField();
    }

    @And("select Save Changes button")
    public void selectSaveChangesButton() {
        _page.setSaveChangesButton();
    }

    @Then("I validate mail in Profile Edit")
    public void iValidateMailInProfileEdit() {
        Assert.assertEquals("UserName already exists.", _page.setSuccessSavePopUp());
    }

    @Then("I validate Contact Messages BUG")
    public void contactMessagesBug() {
        Assert.assertEquals("Contact Messages", _page.userTransactionsConfirm());
    }

    @And("validate Location sector")
    public void validateLocationSector() {
        _page.setLocationSectorText();
    }

    @And("complete Enter a Location TextField")
    public void completeEnterALocationTextField() {
        _page.setLocationTextField();

    }

    @Then("I validate the Location sector MAP")
    public void iValidateTheLocationSectorMap() {
        Assert.assertEquals("Location", _page.setLocationSectorText());
    }

    @Given("Admin Reports OHE")
    public void adminReportsOHE() {
        _page.setHomePage();
        _page.login();
        _page.setAdminButton();
    }

    @When("I validate Contact Messages OHE")
    public void iValidateContactMessagesOHE() {
    }

    @When("I go to listing page")
    public void iGoToListingPageWhen() {
        _page.setHomePage();
        _page.goToListingPage();
    }

    @And("I select an item BUG")
    public void iSelectAnItemBUG() {
        _page.goToItemBUG();
        _page.sleep(2000);
    }

    @And("I select Reviews sector")
    public void iSelectReviewsSector() {
        _page.setReviewsTab();
    }

    @Then("I validate Reviews in item page")
    public void iValidateReviewsInItemPage() {
        _page.sleep(4000);
        Assert.assertEquals(_page.setCoolTxt(), "Leave a Review");
        _page.sleep(4000);
    }

    @And("I select Leave a Review Button")
    public void iSelectLeaveAReviewButton() {
        _page.setLeaveReviewBtn();
    }

    @And("complete Both Reviews TextFields")
    public void completeBothReviewsTextFields() {
        _page.setFiveStars();
        _page.sleep(2000);
        _page.setFiveStarsTWO();
        _page.sleep(2000);
        _page.setYourReviewONE();
        _page.setYourReviewTWO();
        _page.setSendBtn();
    }

    @Then("I validate Browse Listing without Login")
    public void iValidateBrowseListingWithoutLogin() {
        _page.sleep(3000);
        Assert.assertEquals("Send message", _page.setGreatCarTxt());
    }

    @Given("I sign up and I go to Listing Page")
    public void iSignUpAndIGoToListingPage() {
        _page.sleep(5000);
        _page.createAndLogin();
        _page.sleep(5000);
    }

    @And("I select Logo and Favicon")
    public void iSelectLogoAndFavicon() {
        _page.setLogoAndFavicon();
    }

    @And("I upload PNG example")
    public void iUploadPNGExample() {
        _page.setUploadLogo();
    }

    @Then("I validate upload PNG")
    public void iValidateUploadPNG() {
        Assert.assertEquals("Desktop version", _page.desktopVersionTxt());
    }

    @Then("I validate Refresh Cache in Step 6")
    public void iValidateRefreshCacheInStep() {
        _page.refreshCache();
        _page.sleep(7000);
        Assert.assertEquals("Step 6: Connect Domain", _page.getConnectDomainTxt());
    }

    @When("I validate step 6 connect domain BUG")
    public void iValidateStepConnectDomainBUG() {
        _page.goToAdminPanel();
        _page.connectDomain();
    }

    @When("I select Users")
    public void iSelectUsers() {
        //_page.sleep(8000);
        _page.setUsersBtn();
    }

    @And("search name")
    public void searchName() {
        _page.setFilterSearchTextField();
    }

    @And("click Select Action button")
    public void clickSelectActionButton() {
        //_page.getCloseChat();
        _page.setSelectActionBtn();
    }

    @And("select Delete button")
    public void selectDeleteButton() {
        _page.setDeleteBtn();
        _page.sleep(2000);
        _page.setGreenDeleteBtn();
    }

    @Then("I validate Delete user")
    public void iValidateDeleteUser() {
        Assert.assertEquals("Users", _page.usersText());
    }

    @And("I go to Item")
    public void iGoToItem() {
    }

    @Then("I validate Listing Price")
    public void iValidateListingPrice() {
    }

    @And("I select Variants button")
    public void iSelectVariantsButton() {
        _page.setVariantsBtn();
    }

    @And("I select Option 1 tab")
    public void iSelectOptionTab() {
        _page.setOption1Tab();
    }

    @And("select Hello 14")
    public void selectHello() {
        _page.setHelloTest14Btn();
    }

    @And("complete Variants TextField")
    public void completeVariantsTextField() {
        _page.setVariantsTextField();
        _page.sleep(2000);

    }

    @And("complete Price TextField")
    public void completePriceTextField() {
        _page.setVariantsPriceTxt();
    }

    @And("complete Quantity TextField")
    public void completeQuantityTextField() {
        _page.setVariantsQuantityTxt();
    }

    @Then("I validate My Listings text")
    public void iValidateMyListingsText() {
        Assert.assertEquals(true, _page.setMyListingsIcon());
    }

    @Given("I create an user and go to Dashboard")
    public void iCreateAnUserAndGoToDashboard() {
        //_page.setHomePageBUG();
        _page.createAndLogin();
        _page.goToDashboard();
        _page.goToDashboard();
    }

    @And("select Social Links sector")
    public void selectSocialLinksSector() {
        _page.setSocialLinksButton();
    }

    @And("validate Facebook text")
    public void validateFacebookText() {
        _page.setFacebookText();
    }

    @And("validate Twitter text")
    public void validateTwitterText() {
        _page.setTwitterText();
    }

    @And("validate Instagram text")
    public void validateInstagramText() {
        _page.setInstagramText();
    }

    @And("validate Linkedin text")
    public void validateLinkedinText() {
        _page.setLinkedInText();
    }

    @And("validate Youtube")
    public void validateYoutube() {
        _page.setYoutube();
    }

    @Then("validate Social Links")
    public void validateSocialLinks() {
        Assert.assertEquals("Social Links", _page.setSocialLinksText());
    }

    @Then("I validate Image Upload")
    public void iValidateImageUpload() {
        Assert.assertEquals("Media", _page.getMediaText());
    }

    @And("I complete Custom Fields BUG")
    public void iCompleteCustomFieldsBUG() {
        //_page.setConditionOfItemTextField();
        _page.setDepartmentTab();
        _page.setDepartmentMenOption();
        _page.setWouldOption();
        //_page.setAshTestTextField();
        //_page.setAshNumberTextField();
        //_page.setAshDropDownTab();
        //_page.setThisOption();
        //_page.setAshCheckBoxWill();
        //_page.setAshTagThis();
        //_page.setFreeTaggingText();
        _page.setHello14Tab();
        _page.setDoesOption();
        //_page.setHello14TestTab();
        //_page.setHello14OptionsHello();
    }

    @Then("I validate create a listing Staging BUG")
    public void iValidateCreateAListingStagingBUG() {
        _page.setPublishButton();
        _page.sleep(3000);
        Assert.assertEquals("You must select at least one of the options of the custom field", _page.getErrorTextPublish());
    }

    @Given("I login BUG")
    public void iLoginBugGiven() {
        _page.goToLoginPage();
        _page.login();
    }

    @And("I go to Landing Page")
    public void iGoToLandingPage() {
        _page.goToAdminPanel();
        _driver.navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Admin/application/LandingCustomize");
    }

    @Then("I validate the Visual Editor Button is hidden")
    public void iValidateVisualEditorFeatureBug() {
        Assert.assertEquals(false, _page.validateVisualEditor());
    }

    @Then("I validate that the Services page is created")
    public void iValidateThatTheServicesPageIsCreated() {
    }

    @When("I select Add New")
    public void iSelectAddNew() {
        _page.addNewListing();
        _page.sleep(3000);
    }

    @Then("I validate Can finish listing creation")
    public void iValidateCanFinishListingCreation() {
        Assert.assertEquals(true, _page.cropArea());
    }

    @Then("I validate Price appearing on Listing Details")
    public void iValidatePriceAppearingOnListingDetails() {
        Assert.assertEquals(true, _page.validatePriceShowing());
    }

    @And("Select Inbox")
    public void selectInbox() {
        _page.inboxButton();
    }

    @When("Select Read section")
    public void selectReadSection() {
        _page.readSector();
    }

    @Then("Validate messages in Read")
    public void validateMessagesInRead() {
        Assert.assertEquals("Read", _page.validateReadText());
    }

    @Then("I validate Seen times")
    public void iValidateSeenTimes() {
        _page.sleep(3000);
        Assert.assertEquals("Seen 0 times in the last hour", _page.seenTimesText());
    }

    @Given("I go to Signup")
    public void iGoToLoginAndSignup() {
        _driver.navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Account/Login");
    }


    @When("Select Signup With Facebook")
    public void selectSignupWithFacebook() {
        _page.loginFacebookButton();
    }

    @Then("I validate Signup With Facebook")
    public void iValidateSignupWithFacebook() {
        Assert.assertEquals("Welcome!", _page.welcomeTxt());
    }


    @Then("I validate Payment Information")
    public void iValidatePaymentInformation() {
        Assert.assertEquals("Saved Credit Cards", _page.validatePaymentTxt());
    }

    @When("I type password {string}")
    public void iTypePassword(String arg0) {
        _page.passwordTxt();
    }

    @Then("I validate \"Minimum 6 characters\" message does appear")
    public void iValidateMessageDoesAppear() {
        _page.sleep(3000);
        Assert.assertEquals("Minimum 6 characters", _page.minimumPasswordText());
    }

    @Then("I validate Newest Listings images are not blurred")
    public void iValidateNewestListingsImagesAreNotBlurred() {
        _page.sleep(3500);
        Assert.assertEquals("Sort By", _page.notBlurredText());
    }

    @When("I go to listing page BUG")
    public void iGoToListingPageBUG() {
        _page.goToListingPage();
        _page.sortByDateNewerToOlder();
        _page.newerToOlderButton();
        _page.sleep(3500);
    }

    @Given("I login and go to Landing page")
    public void iLoginAndGoToLandingPage() {
        _page.login();

    }

    @Given("I login and go to Admin")
    public void iLoginAndGoToAdmin() {
        _page.goToLoginPage();
        _page.login();
        _page.goToAdminPanel();
    }

    @And("I select Step 8 Emails")
    public void iSelectStepEmails() {
        _page.emailStep();
    }

    @And("select Template Tab")
    public void selectTemplateTab() {
        _page.setTemplatesEmails();
    }

    @Then("I validate that the 404 error does not exist.")
    public void iValidateThatTheErrorDoesNotExist() {
        Assert.assertEquals(true, _page.validateErrorConsole());
    }

    @When("I select Purchased button in orders")
    public void iSelectPurchasedButtonInOrders() {
        _page.ordersPurchasedButton();
    }

    @And("I select Download file button")
    public void iSelectDownloadFileButton() {
        _page.downloadFileXpath();
    }

    @Then("I validate that I can download the file")
    public void iValidateThatICanDownloadTheFile() {
        _page.validateDownloadFile();
    }

    @Given("I login with pending Stripe account")
    public void ILoginWithPendingStripeAccount() {
        //_driver.manage().window().setSize(new Dimension(1920, 1080));
        _page.setHomePage();
        _page.loginPendingStripeUser();
        _page.goToDashboard();
        _page.sleep(2000);
    }

    @When("I select Settings button")
    public void iSelectSettingsButton() {
        _page.SelectSettings();
    }

    @And("I select CaShout button")
    public void iSelectCaShoutButton() {
        _page.SelectCaShout();
    }

    @And("I select Pending button")
    public void iSelectPendingButton() {
        _page.SelectPending();
    }

    @Then("valid verification form is displayed")
    public void validVerificationFormIsDisplayed() {
        _page.VerificationForm();
    }

    @And("I select See Details button")
    public void iSelectSeeDetailsButton() {
        _page.SeeDetails();
    }

    @And("I select See messages button")
    public void iSelectSeeMessagesButton() {
        _page.SeeMesSages();
    }

    @Then("valid to redirect to the respective page")
    public void validToRedirectToTheRespectivePage() {
        _page.RespectivePage();
    }

    @Given("I go setting page")
    public void iGoSettingPage() {
        _page.setHomePage();
        _page.goToDashboard();
        _page.loginGastonUser();
        _page.goToSiteWording();
        _page.sleep(2000);
        //_page.getCloseChat();

    }

    @When("input changes in the field SIGNUP_WELCOME_TITLE")
    public void inputChangesInTheFieldSIGNUP_WELCOME_TITLE() {
        _page.sleep(5000);
        //_page.getCloseChat();
        _page.SIGNUP_WELCOME_TITLE();
    }

    @And("input changes in the field SIGNUP_WELCOME_DESCRIPTION")
    public void inputChangesInTheFieldSIGNUP_WELCOME_DESCRIPTION() {
        _page.SIGNUP_WELCOME_DESCRIPTION();
    }

    @And("input changes in the field SIGNUP_WELCOME_BUTTON_SELLER_TITLE")
    public void inputChangesInTheFieldSIGNUP_WELCOME_BUTTON_SELLER_TITLE() {
        _page.SIGNUP_WELCOME_BUTTON_SELLER_TITLE();
    }

    @And("input changes in the field SIGNUP_WELCOME_BUTTON_SELLER_DESCRIPTION")
    public void inputChangesInTheFieldSIGNUP_WELCOME_BUTTON_SELLER_DESCRIPTION() {
        _page.SIGNUP_WELCOME_BUTTON_SELLER_DESCRIPTION();
    }

    @And("input changes in the field SIGNUP_WELCOME_BUTTON_BUYER_TITLE")
    public void inputChangesInTheFieldSIGNUP_WELCOME_BUTTON_BUYER_TITLE() {
        _page.SIGNUP_WELCOME_BUTTON_BUYER_TITLE();
    }

    @And("input changes in the field SIGNUP_WELCOME_BUTTON_BUYER_DESCRIPTION")
    public void inputChangesInTheFieldSIGNUP_WELCOME_BUTTON_BUYER_DESCRIPTION() {
        _page.SIGNUP_WELCOME_BUTTON_BUYER_DESCRIPTION();
    }

    @And("I log out")
    public void iLogOut() {
        _page.LogOut();
    }

    @And("I log in and go setting page")
    public void iLogInAndGoSettingPage() {
        _page.setHomePage();
        _page.goToDashboard();
        _page.loginGastonUser();
        _page.goToSiteWording();
    }

    @Then("Valid to save the new texts entered")
    public void validToSaveTheNewTextsEntered() {
        _page.valideWelcomeText();

    }

    @And("I create a new user")
    public void iCreateANewUser() {
        _page.CreateAnAccountListingDetails("test");
    }

}