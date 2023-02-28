package steps.onboarding;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.onboarding.OhOnboardingPage;


public class OhOnboardingSteps extends BasePage {

    private OhOnboardingPage _page;

    public OhOnboardingSteps() {

        this._page = new OhOnboardingPage();
    }

    @Given("OHE I go to {string}")
    public void iGoTo(String url){
        getDriver().navigate().to(url);
    }

    @When("OHE I type on name field")
    public void oheITypeOnNameField() {
        _page.yourNameFieldFunction();
    }

    @And("OHE I type on e-mail field {string}")
    public void oheITypeOnEMailField(String text) {
        _page.yourEmailFieldFunction(text);
    }

    @And("OHE I type on Phone Number field")
    public void oheITypeOnPhoneNumberField() {
        _page.yourPhoneNumberFieldFunction();
    }

    @And("OHE I type on your Marketplace name field {string}")
    public void oheITypeOnYourMarketplaceNameField(String text) {
        _page.yourMarketplaceFieldFunction(text);
    }

    @And("OHE I click the button Next")
    public void oheIClickTheButtonNext() {
        _page.nextButtonFirstScreenFunction();
    }

    @And("OHE I select Products")
    public void oheISelectProducts() {
        _page.chooseProductMarketplace();
    }

    @And("OHE I click the other button Next")
    public void oheIClickTheOtherButtonNext() {
        _page.nextButtonSecondScreenFunction();
    }

    @And("OHE I complete the field Card number")
    public void oheICompleteTheFieldCardNumber() {
        _page.cardNumberFieldFunction();
    }

    @And("OHE I complete the field name on card")
    public void oheICompleteTheFieldNameOnCard() {
        _page.nameCardFieldForProductForm();
    }

    @And("OHE I complete the field Expiry Date")
    public void oheICompleteTheFieldExpiryDate() {
        _page.expiryDateFieldFunction();
    }

    @And("OHE I complete the field CVC Code")
    public void oheICompleteTheFieldCVCCode() {
        _page.cvcCardFieldFunction();
    }

    @And("OHE I click the button Save payment")
    public void oheIClickTheButtonSavePayment() {
        _page.setSavePaymentFunction();
    }

    @And("OHE I go to the admin panel")
    public void oheIGoToTheAdminPanel() {
        _page.adminPanelStepFunction();
    }

    @Then("OHE I create my marketplace products page")
    public void oheICreateMyMarketplaceProductsPage() {
        Assert.assertEquals(_page.marketPlaceCreateConfirm(), false);
    }

    @And("OHE I check to accept {string}")
    public void oheICheckToAcceptBeingContactedForCustomFeaturesThatWillGrowMyMarketplaceXFaster(int arg0) {
        _page.checkBoxContactedFunction();
    }

    @And("OHE I select Service")
    public void oheISelectService() {
        _page.chooseServiceMarketplace();
    }

    @And("OHE I complete the field Full name")
    public void oheICompleteTheFieldFullName() {
        _page.fullNameFieldFunction();
    }

    @And("OHE I complete the field Email Address")
    public void oheICompleteTheFieldEmailAddress() {
        _page.emailAddressFieldFunction();
    }

    @And("OHE I complete the field Phone Number")
    public void oheICompleteTheFieldPhoneNumber() {
        _page.phoneNumberFieldFunction();
    }

    @And("OHE I complete the field Credit card number")
    public void oheICompleteTheFieldCreditCardNumber() {
        _page.creditCardNumberFieldFunction();
    }

    @And("OHE I complete the field expiry date card")
    public void oheICompleteTheFieldExpiryDateCard() {
        _page.expiryCardFieldFunction();
    }

    @And("OHE I complete the field CVC Code card")
    public void oheICompleteTheFieldCVCCodeCard() {
        _page.cvcCodeFieldFunction();
    }

    @And("OHE I click the button Start My MarketPlace Now")
    public void oheIClickTheButtonStartMyMarketPlaceNow() {
        _page.startMyMarketPlaceNow();
    }

    @Then("OHE I create my marketplace service page")
    public void oheICreateMyMarketplaceServicePage() {
        Assert.assertEquals(_page.errorMessageConfirm(),false);
    }
}