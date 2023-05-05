package steps.developmentServices;

import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.SProdLoginPages;


public class SProdLoginSteps extends BasePage {

    private SProdLoginPages _page;

    public SProdLoginSteps() {

        this._page = new SProdLoginPages();
    }


    @Given("I go login page PROD")
    public void iGoLoginPagePROD() {
        _page.goToLogin();
    }


    @When("Login title valid")
    public void loginTitleValid() {
        Assert.assertEquals("Login", _page.validateLoginText());
    }

    @And("valid Login with Facebook")
    public void validLoginWithFacebook() {
        Assert.assertEquals("Login with Facebook", _page.validateLoginFacebookText());
    }

    @And("valid Login with Google")
    public void validLoginWithGoogle() {
        Assert.assertEquals(true, _page.validateLoginGoogleText());
    }

    @Then("valid session login")
    public void validSessionLogin() {
        Assert.assertEquals(true, _page.logoQAProductionSite());
    }

    @Given("I go to Sign Up")
    public void iGoToSignUp() {
        _page.goToSignUp();
    }

    @When("Sign Up title valid")
    public void signUpTitleValid() {
        Assert.assertEquals("Sign up", _page.validateSignUpText());
    }

    @And("I Validate the E-mail text field")
    public void iValidateTheEMailTextField() {
        Assert.assertEquals(true, _page.validateEmail());
    }

    @And("I validate the Username Text Field")
    public void iValidateTheUsernameTextField() {
        Assert.assertEquals(true, _page.usernameTextField());
    }

    @And("I validate the Password Text Field")
    public void iValidateThePasswordTextField() {
        Assert.assertEquals(true, _page.passwordTextField());
    }

    @Then("valid session Sign Up")
    public void validSessionSignUp() {
        Assert.assertEquals(true, _page.logoQAProductionSite());
    }


    @And("I Sign in with new account {string}OHE")
    public void iSignInWithNewAccountEmailOHE(String text) {
        _page.CreateAnAccountListingDetailsPROD(text);
        _page.CloseWindow();
    }

    @When("go to forgot your Password")
    public void goToForgotYourPassword() {
        _page.forgotYourPassword();
    }

    @And("enter the e-mail to recover the password")
    public void enterTheEMailToRecoverThePassword() {
        _page.enterTheEmail();
    }

    @Then("Valid that An email has been sent to reset the password.")
    public void validThatAnEmailHasBeenSentToResetThePassword() {
        Assert.assertEquals("Reset password e-mail was sent", _page.validMessageToResetThePassword());
    }

    @And("add New Listing")
    public void addNewListing() {
        _page.createNewListing();
        _page.enterTheName();
        _page.enterCategory();
        _page.descriptionSection();
        _page.hourlyPriceSection();
        _page.listingImageLoad();
        _page.cropButton();
        _page.goToDetails();
        _page.textCustomField();
        _page.numberCustomField();
        _page.dropdownCustomField();
        _page.checkboxCustomField();
        _page.colorPicker();
        _page.goToAvailability();
        _page.publish();
    }


//    @Before
//    public void test() throws IOException {
//        loginDevSVC();
//        loginWithGastonUserSVC();
//    }


    @And("go to Dashboard Serv")
    public void goToDashboardServ() {
        _page.goToDashboardServ();
    }

    @When("select My Listings button Serv")
    public void selectMyListingsButtonServ() {
        _page.selectMyListingsServProd();
    }

    @When("go to Settings Serv")
    public void goToSettingsServ() {
        _page.goToSettingServ();
    }

    @And("go to Cashout")
    public void goToCashout() {
        _page.goToCashoutServ();
    }

    @Then("valid than connect to Stripe")
    public void validThanConnectToStripe() {
        Assert.assertEquals("Pending", _page.validConnectStipe());
    }

    @And("enter profile information Serv")
    public void enterProfileInformationServ() {
        _page.enterFirstName();
        _page.enterLastName();
        _page.enterUsername();
        _page.enterEmail();
        _page.enterPhoneNumber();
        _page.saveChanges();
    }

    @Then("valid to save profile information")
    public void validToSaveProfileInformation() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @When("go to Browse Services")
    public void goToBrowseServices() {
        _page.goToBrowseService();
    }

    @And("select the required service")
    public void selectTheRequiredService() {
        _page.enterClassesValet();
    }

    @And("contract the service")
    public void contractTheService() {
        _page.hireTheService();
        _page.hireBoxValidate();
        _page.fleeFlatCheckbox();
    }

    @And("complete the form")
    public void completeTheForm() {
        _page.enterDeadline();
        _page.enterDescription();
        _page.enterHire();
    }

    @Then("valid that can hire the service")
    public void validThatCanHireTheService() {
        Assert.assertEquals("Congratulations! You just bought:", _page.validateHireServices());
    }

    @And("enter the new Credit Card")
    public void enterTheNewCreditCard() {
        _page.enterCardNumberServ();
        _page.enterNameOnCardServ();
        _page.enterExpirationDateServ();
        _page.enterCVVCodeServ();
    }

    @And("I select the Submit Payment Button SERV")
    public void iSelectTheSubmitPaymentButtonSERV() {
        _page.iSubmitPendingPaymentServ();
    }

    @When("go to the message section")
    public void goToTheMessageSection() {
        _page.messageSection();
    }

    @And("I send message")
    public void iSendMessage() {
        _page.sendMediaMessage();
        //_page.cropButton();
        _page.sendMediaMessageAppendix();
    }

    @Then("valid that send messages")
    public void validThatSendMessages() {
        _page.validateSendMessageIncludingMedia();
    }

    @When("go to Browse Request Serv")
    public void goToBrowseRequestServ() {
        _page.goToBrowseRequestServ();
    }

    @And("i select the request")
    public void iSelectTheRequest() {
        _page.selectTheRequest();
    }

    @And("i select apply")
    public void iSelectApply() {
        _page.selectApply();
    }

    @And("complete the form Serv")
    public void completeTheFormServ() {
        _page.enterMessage();
        _page.enterStartDate();
        _page.endTimeField();
        _page.applyField();
    }

    @Then("valid Request a quote")
    public void validRequestAQuote() {
    }

    @And("go to Listing Page Serv")
    public void goToListingPageServ() {
        getDriver().navigate().to(UrlDevServices + "Listing/Browse");
    }

    @When("select Graphics & Design")
    public void selectGraphicsDesign() {
        _page.graphicsDesignFilter();
    }

    @And("select Marketing")
    public void selectMarketing() {
        _page.marketingFilter();
    }

    @And("select Programming & Tech")
    public void selectProgrammingTech() {
        _page.programmingTechFilter();
    }

    @And("select Testing Category")
    public void selectTestingCategory() {
        _page.testingCategoryFilter();
    }

    @And("select Software")
    public void selectSoftware() {
        _page.softwareFilter();
    }

    @And("select Technology")
    public void selectTechnology() {
        _page.technologyFilter();
    }

    @And("select Business")
    public void selectBusiness() {
        _page.businessFilter();
    }

    @Then("I validate Filters Serv")
    public void iValidateFiltersServ() {
        Assert.assertEquals("Category", _page.validateFilterSector());
    }

    @And("select Photography")
    public void selectPhotography() {
        _page.photographyFilter();
    }

    @When("select Video Conference")
    public void selectVideoConference() {
        _page.VideoConferenceFilter();
    }

    @And("select in-Person")
    public void selectInPerson() {
        _page.inPersonFilter();
    }

    @Then("I validate Work Model Section")
    public void iValidateWorkModelSection() {
        Assert.assertEquals("Work Model", _page.validateWorkModelSector());
    }

    @When("complete price numbers TextFields in Set up Manually ServProd")
    public void completePriceNumbersTextFieldsInSetUpManuallyServProd() {
        _page.minPriceFilter();
        _page.maxPriceFilter();
    }

    @And("select Apply button Serv")
    public void selectApplyButtonServ() {
        _page.applyFilterPrice();
    }

    @Then("I validate Price filter Serv")
    public void iValidatePriceFilterServ() {
        _page.validatePriceFilter();
    }

    @When("complete Location TextField Serv")
    public void completeLocationTextFieldServ() {
        _page.locationText();
    }

    @Then("I validate Location Serv")
    public void iValidateLocationServ() {
        _page.validateLocationSection();
    }


    @And("select Show more")
    public void selectShowMore() {
        _page.shoreMoreSection();
    }

    @And("select Apply ServProd")
    public void selectApplyServProd() {
        _page.selectApplyButton();
    }

    @Then("I validate Price filter in section Browse Request ServProd")
    public void iValidatePriceFilterInSectionBrowseRequestServProd() {
        _page.validatePriceFilterSectionRequest();
    }

    @When("select filter colors")
    public void selectFilterColors() {
        _page.selectPurple();
        _page.selectLightBlue();
        _page.selectBlack();
        _page.selectRed();
        _page.selectBlue();
        _page.selectGreen();
        _page.selectYellow();
        _page.selectPink();
        _page.selectBrown();
    }

    @Then("valid color filter")
    public void validColorFilter() {
        _page.validColorFilterSection();
    }

    @And("go to Browse by Seller ServProd")
    public void goToBrowseBySellerServProd() {
        _page.goToBrowseBySeller();
    }

    @And("go to Dashboard ServI validate listing name text field Serv")
    public void iValidateListingNameTextFieldServ() {
        _page.listingNameField();
    }

    @And("I validate listing category Serv")
    public void iValidateListingCategoryServ() {
        _page.selectCategory();
        _page.businessCategory();
    }

    @And("I validate listing description text field Serv")
    public void iValidateListingDescriptionTextFieldServ() {
        _page.listingDescriptionField();
    }

    @And("I validate the listing Price Serv")
    public void iValidateTheListingPriceServ() {
        _page.listingPricePerHour();
    }

    @And("I validate listing image Serv")
    public void iValidateListingImageServ() {
        _page.listingAddImage();
        _page.cropButton();
    }

    @And("I validate listing video URL Serv")
    public void iValidateListingVideoURLServ() {
        _page.listingVideoURLField();
        _page.addVideoURL();

    }

    @And("Go to details Section Serv")
    public void goToDetailsSectionServ() {
        _page.goToDetails();
    }

    @Then("I validate Create a Listing Serv")
    public void iValidateCreateAListingServ() {
        Assert.assertEquals(_page.GreatText(), "Great job! Your listing is under review and will be published soon.");
    }

    @And("I validate Custom fields")
    public void iValidateCustomFields() {
        _page.listingLanguages();
        _page.listingWorkModel();
        _page.listingBusinessSpecialties();
        _page.listingTechSpecialties();
        _page.listingTechSpecialtiesOption();
        _page.listingDropdownFilter();
        _page.listingColorPicker();
    }

    @And("Go to Availability Serv")
    public void goToAvailabilityServ() {
        _page.goToAvailability();
    }

    @And("I validate Set available days")
    public void iValidateSetAvailableDays() {
        _page.selectWeekday();
        _page.selectFrom();
        _page.selectTimeTo();
        _page.selectAddTimeslot();
        _page.publish();
    }

    @And("I validate listing Work ModelServ")
    public void iValidateListingWorkModelServ() {
        _page.workModelSection();
        _page.selectVideoConference();
    }

    @Then("valid select Block")
    public void validSelectBlock() {
        _page.selectBlock();
    }

    @And("valid select List")
    public void validSelectList() {
        _page.selectList();
    }

    @And("valid select Map")
    public void validSelectMap() {
        _page.selectMap();
    }

    @And("valid select Search")
    public void validSelectSearch() {
        _page.serviceIncome();
        _page.selectSearch();

    }

    @Then("select Payment Section")
    public void selectPaymentSection() {
        _page.selectPayment();
    }

    @And("Add new Credit Card")
    public void addNewCreditCard() {
        _page.nameOnCardField();
        _page.cardNumberField();
        _page.expDateField();
        _page.securityCode();
        _page.addCreditCard();
    }

    @When("valid that the new credit card has been created")
    public void validThatTheNewCreditCardHasBeenCreated() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @And("delete Credit Card")
    public void deleteCreditCard() {
        _page.deleteCreditCard();
    }

    @And("valid that the credit card has been erased")
    public void validThatTheCreditCardHasBeenErased() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @Then("select Password section")
    public void selectPasswordSection() {
        _page.selectPassword();
    }

    @And("add New password")
    public void addNewPassword() {
        _page.newPasswordField();
        _page.saveChanges();
    }

    @When("valid if the password has been changed")
    public void validIfThePasswordHasBeenChanged() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @Then("select Notifications Section")
    public void selectNotificationsSection() {
        _page.selectNotifications();
    }

    @And("activate notifications")
    public void activateNotifications() {
        _page.activateSMSNotifications();
        _page.countryCodeField();
        _page.areaCode();
        _page.phoneNumberField();
        _page.acceptTermsAndConditions();
        _page.saveChangesNotifications();
    }

    @When("valid to activate notifications")
    public void validToActivateNotifications() {
        Assert.assertEquals("Success!", _page.validSaveProfile());
    }

    @And("desactive notifications")
    public void desactiveNotifications() {
        _page.desactiveNotificationCheckout();
        _page.saveChangesNotifications();
    }

    @And("valid to desactive notofications")
    public void validToDesactiveNotofications() {
        Assert.assertEquals("Success!", _page.validSaveProfile());
    }

    @Then("select Addresses Section")
    public void selectAddressesSection() {
        _page.selectAddressesSections();
    }

    @And("add New Address")
    public void addNewAddress() {
        _page.addressLineField();
        _page.cityField();
        _page.stateField();
        _page.zIPField();
        _page.nameThisAddress();
        _page.addAddress();
    }

    @When("valid that the new address has been created")
    public void validThatTheNewAddressHasBeenCreated() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @And("select Edit Addresses")
    public void selectEditAddresses() {
        _page.selectEdit();
        _page.editAddress();
        _page.acceptEditAddress();
    }

    @And("valid that the address has been edited")
    public void validThatTheAddressHasBeenEdited() {
        Assert.assertEquals("Success", _page.validSaveProfile());
    }

    @And("select Delete Address saved")
    public void selectDeleteAddressSaved() {
        _page.deleteSavedAddress();
        _page.confirmDeleteAddress();
    }

    @And("valid that the address has been erased")
    public void validThatTheAddressHasBeenErased() {
        Assert.assertEquals("Success", _page.validSaveProfile());
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

    @When("search for the desired product")
    public void searchForTheDesiredProduct() {
        _page.searchProduct();
    }

    @Then("validate that you have found the desired product")
    public void validateThatYouHaveFoundTheDesiredProduct() {
        Assert.assertEquals("test22", _page.validateDesiredProduct());
    }

    @When("validate Location sector Serv")
    public void validateLocationSectorServ() {
        Assert.assertTrue(_page.enterLocation());
        Assert.assertTrue(_page.enterRadius());
    }

    @And("Step {int}: Create Categories Serv")
    public void stepCreateCategoriesServ(int arg0) {
        _page.selectCreateCategorySection();
    }

    @When("Add new Category")
    public void addNewCategory() {
        _page.addCategory();
        _page.enterNewCategory();
    }

    @Then("valid that new category was created")
    public void validThatNewCategoryWasCreated() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("Edit Category")
    public void editCategory() {
        _page.selectKenpachiCat();
        //  _page.editKenpachiCat();

    }

    @Then("valid that the category was edit")
    public void validThatTheCategoryWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("delete Category Serv")
    public void deleteCategoryServ() {
        _page.selectDeleteKenpachiCat();
    }

    @Then("valid that the category was erased")
    public void validThatTheCategoryWasErased() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("Add new Subcategory")
    public void addNewSubcategory() {
        _page.selectKenpachiEditCat();
        _page.addSubcategory();
    }

    @Then("Valid that the subcategory was created")
    public void validThatTheSubcategoryWasCreated() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("Edit Subcategory")
    public void editSubcategory() {
        _page.selectKenpachiEditCat();
        _page.selectTestSubCat();
    }

    @Then("valid that the Subcategory was edit")
    public void validThatTheSubcategoryWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("delete Subategory Serv")
    public void deleteSubategoryServ() {
        _page.selectKenpachiEditCat();
        _page.selectDeleteTestSubCat();
    }

    @Then("valid that the Subcategory was erased")
    public void validThatTheSubcategoryWasErased() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("Add new Subcategory Item")
    public void addNewSubcategoryItem() {
        _page.selectKenpachiEditCat();
        _page.addItemSubCat();
    }

    @Then("valid that new Subcategory Item was created")
    public void validThatNewSubcategoryItemWasCreated() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("Edit Subcategory Item")
    public void editSubcategoryItem() {
        _page.selectKenpachiEditCat();
        _page.selectHelloItemSubCat();

    }

    @Then("valid that the Subcategory Item was edit")
    public void validThatTheSubcategoryItemWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }


    @When("delete Subcategory Item")
    public void deleteSubcategoryItem() {
        _page.selectKenpachiEditCat();
        _page.selectDeleteHelloItemSubCat();
    }

    @Then("valid that the Subcategory Item was erased")
    public void validThatTheSubcategoryItemWasErased() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("Step {int}: Create custom Field Serv")
    public void stepCreateCustomFieldServ(int arg0) {
        _page.selectCreateCustomFieldsSection();
        _page.selectCreateCustomFields();
    }

    @When("create custom Field")
    public void createCustomField() {
        _page.enterFieldName();
        _page.enterFieldDescription();
        _page.fieldType();
        _page.selectFieldCategories();
        _page.enterSaveCustomField();
    }

    @Then("valid that new custom Field was created")
    public void validThatNewCustomFieldWasCreated() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }
}
