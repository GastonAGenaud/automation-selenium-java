package steps.productionServices;

import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.productionServices.SProdLoginPages;


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

    @Given("I go to Sign Up PROD")
    public void iGoToSignUpPROD() {
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


    @And("I Sign in with new account {string} PROD")
    public void iSignInWithNewAccountEmailPROD(String text) {
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

    @And("go to Dashboard ServProd")
    public void goToDashboardServProd() {
        _page.goToDashboardServ();
    }

    @When("select My Listings button Serv Prod")
    public void selectMyListingsButtonServProd() {
        _page.selectMyListingsServProd();
    }

    @When("go to Settings Serv Prod")
    public void goToSettingsServProd() {
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

    @And("enter profile information")
    public void enterProfileInformation() {
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
        _page.cropButton();
        _page.sendMediaMessageAppendix();
    }

    @Then("valid that send messages")
    public void validThatSendMessages() {
        Assert.assertTrue(_page.validateSendMessageIncludingMedia());
    }

    @When("go to Browse Request ServProd")
    public void goToBrowseRequestServProd() {
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

    @And("complete the form ServProd")
    public void completeTheFormServProd() {
        _page.enterMessage();
        _page.enterStartDate();
        _page.endTimeField();
        _page.applyField();
    }

    @Then("valid Request a quote")
    public void validRequestAQuote() {
    }

    @And("go to Listing Page ServProd")
    public void goToListingPageServProd() {
        getDriver().navigate().to(urlServicesProd + "Listing/Browse");
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

    @And("select Techonology")
    public void selectTechonology() {
        _page.techonologyFilter();
    }

    @And("select Business")
    public void selectBusiness() {
        _page.businessFilter();
    }

    @Then("I validate Filters ServProd")
    public void iValidateFiltersServProd() {
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

    @And("select Apply button ServProd")
    public void selectApplyButtonServProd() {
        _page.applyFilterPrice();
    }

    @Then("I validate Price filter ServProd")
    public void iValidatePriceFilterServProd() {
        _page.validatePriceFilter();
    }

    @When("complete Location TextField ServProd")
    public void completeLocationTextFieldServProd() {
        _page.locationText();
    }

    @Then("I validate Location ServProd")
    public void iValidateLocationServProd() {
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

    @And("I validate listing name text field ServProd")
    public void iValidateListingNameTextFieldServProd() {
     //   _page.listingNameField();
    }

    @And("I validate listing category ServProd")
    public void iValidateListingCategoryServProd() {
       // _page.selectCategory();
    //    _page.businessCategory();
    }

    @And("I validate listing description text field ServProd")
    public void iValidateListingDescriptionTextFieldServProd() {
      //  _page.listingDescriptionField();
    }

    @And("I validate the listing Price ServProd")
    public void iValidateTheListingPriceServProd() {
     //   _page.listingPricePerHour();
    }

    @And("I validate listing image ServProd")
    public void iValidateListingImageServProd() {
       // _page.listingAddImage();
    }

    @And("I validate listing video URL ServProd")
    public void iValidateListingVideoURLServProd() {
     //   _page.listingVideoURLField();

    }

    @And("Go to details Section ServProd")
    public void goToDetailsSectionServProd() {
        _page.goToDetails();
    }

    @Then("I validate Create a Listing ServProd")
    public void iValidateCreateAListingServProd() {
    }
}
