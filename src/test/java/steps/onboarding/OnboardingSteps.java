package steps.onboarding;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.onboarding.OnboardingPage;


public class OnboardingSteps extends BasePage {

    private OnboardingPage _page;

    public OnboardingSteps() {

        this._page = new OnboardingPage();
    }

    @Given("^I want to start an optimize plan trial")
    public void i_go_to_homepage() {
        //getDriver().manage().window().setSize(new Dimension(2560, 1440));
        getDriver().navigate().to("https://mymarketplacebuilder.com");
        _page.selectBuild();
        _page.selectLaunchBtn();
    }

    @Given("I go to {string}")
    public void go_to(String url) {
        ////getDriver().manage().window().setSize(new Dimension(2560, 1440));
        getDriver().navigate().to(url);
        //getDriver().manage().window().maximize();
        getDriver().navigate().to(url);
    }

    @When("I type on name field")
    public void iTypeOnnameField() {
        _page.yourNameFieldFunction();
    }

    @And("I type on e-mail field {string}")
    public void iTypeOnEMailField(String text) {
        _page.yourEmailFieldFunction(text);
    }

    @And("I type on Phone Number field")
    public void iTypeOnPhoneNumberField() {
        _page.yourPhoneNumberFieldFunction();
    }

    @And("I type on your Marketplace name field {string}")
    public void iTypeOnYourMarketplaceNameField(String text) {
        _page.yourMarketplaceFieldFunction(text);
    }

    @And("i check to accept 'Being contacted for Custom Features that will grow my marketplace 2x faster'")
    public void iCheckToAcceptBeingContactedForCustomFeatures() {
        _page.checkBoxContactedFunction();
    }

    @And("I click the button Next")
    public void iClickTheButtonNext() {
        
        _page.nextButtonFirstScreenFunction();

    }

    @And("I click the other button Next")
    public void iClickTheButtonNext2() {
        _page.nextButtonSecondScreenFunction();
    }

    @Then("It redirects me to 'What type of marketplace are you looking to build?'")
    public void itRedirectsMeToWhatTypeOfMarketplaceAreYouLookingToBuild() {
        Assert.assertEquals(_page.visualizeResult(), "Let's create your Marketplace right away!");
    }

    @Then("I create my marketplace products page")
    public void iCreateMyMarketPlaceProductsPage() {
        //Assert.assertEquals(false, _page.productsErrorText());
        Assert.assertEquals(false, _page.marketPlaceCreateConfirm());
    }

    @Then("I create my marketplace service page")
    public void iCreateMyMarketPlaceServicePage() {
        Assert.assertEquals(false, _page.congratsTitleConfirm());
    }

    @And("I select Products")
    public void iSelectProducts() {
        _page.chooseProductMarketplace();
    }

    @And("I complete the field Card number")
    public void iCompleteTheFieldCardNumber() {
        _page.cardNumberFieldFunction();
    }

    @And("I complete the field name on card")
    public void iCompleteTheFieldnameOnCard() {
        _page.nameCardFieldForProductForm();
    }

    @And("I complete the field Expiry Date")
    public void iCompleteTheFieldExpiryDate() {
        _page.expiryDateFieldFunction();
    }

    @And("I complete the field CVC Code")
    public void iCompleteTheFieldCCVCode() {
        _page.cvcCardFieldFunction();
    }

    @And("I click the button Save payment")
    public void iClickTheButtonSavePayment() {
        _page.setSavePaymentFunction();
    }

    @Then("I create my markplace products page")
    public void iCreateMyMarkplaceProductsPage() {
    }

    @When("I complete the field Full name")
    public void iCompleteTheFieldFullname() {
        _page.fullNameFieldFunction();
    }

    @And("I complete the field Email Address")
    public void iCompleteTheFieldEmailAdress() {
        _page.emailAddressFieldFunction();
    }

    @And("I complete the field Phone Number")
    public void iCompleteTheFieldPhoneNumber() {
        _page.phoneNumberFieldFunction();
    }

    @And("I complete the field Credit card number")
    public void iCompleteTheFieldCreditCardNumber() {
        _page.creditCardNumberFieldFunction();
        _page.setCardNameField();
    }

    @And("I complete the field expiry date card")
    public void iCompleteTheFieldExpiryDateCard(){
        _page.expiryCardFieldFunction();
    }

    @And("I complete the field CVC Code card")
    public void iCompleteTheFieldCVCCode() {
        _page.cvcCodeFieldFunction();
    }

    @And("I click the button Start My MarketPlace Now")
    public void iClickTheButtonStartMyMarketPlaceNow() {
        _page.startMyMarketPlaceNow();
    }

    @And("I select Service")
    public void iSelectService() {
        _page.chooseServiceMarketplace();
    }


    @When("I choose Build")
    public void iChooseBuild() {
        _page.selectBuild();
        //_page.setVisualizeStartMyTrial();
    }

    @And("click the start my trial now button")
    public void clickTheStartMyTrialNowButton() {
    }

    @When("I choose launch")
    public void selectLaunchBtn() {
        _page.selectLaunch();
    }

    @When("I choose business")
    public void iChooseBusiness() {
        _page.specializeStartMyTrialBtn();
    }

    @Then("It redirects me to a calendar")
    public void itRedirectsMeToACalendar() {
        Assert.assertEquals("Book Your Meeting Now", _page.calendar());
    }

    @When("I choose customize")
    public void iChooseCustomize() {
        _page.customizeStartMyTrialBtn();
    }
    @And("I go to the admin panel")
    public void iGoToTheAdminPanel() {
        _page.adminPanelStepFunction();
    }
}