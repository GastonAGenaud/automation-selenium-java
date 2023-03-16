package steps.onboarding;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.onboarding.ServicesOnboardingPage;


public class ServicesOnboardingSteps extends BasePage {

    private ServicesOnboardingPage _page;

    public ServicesOnboardingSteps() {

        this._page = new ServicesOnboardingPage();
    }

    @Given("SVC I go to {string}")
    public void iGoTo(String url){
        getDriver().navigate().to(url);
    }

    @When("SVC I type on name field")
    public void SVCITypeOnNameField() {
        _page.yourNameFieldFunction();
    }

    @And("SVC I type on e-mail field {string}")
    public void SVCITypeOnEMailField(String text) {
        _page.yourEmailFieldFunction(text);
    }

    @And("SVC I type on Phone Number field")
    public void SVCITypeOnPhoneNumberField() {
        _page.yourPhoneNumberFieldFunction();
    }

    @And("SVC I type on your Marketplace name field {string}")
    public void SVCITypeOnYourMarketplaceNameField(String text) {
        _page.yourMarketplaceFieldFunction(text);
    }

    @And("SVC I click the button Next")
    public void SVCIClickTheButtonNext() {
        _page.nextButtonFirstScreenFunction();
    }

    @And("SVC I select Products")
    public void SVCISelectProducts() {
        _page.chooseProductMarketplace();
    }

    @And("SVC I click the other button Next")
    public void SVCIClickTheOtherButtonNext() {
        _page.nextButtonSecondScreenFunction();
    }

    @And("SVC I complete the field Card number")
    public void SVCICompleteTheFieldCardNumber() {
        _page.cardNumberFieldFunction();
    }

    @And("SVC I complete the field name on card")
    public void SVCICompleteTheFieldNameOnCard() {
        _page.nameCardFieldForProductForm();
    }

    @And("SVC I complete the field Expiry Date")
    public void SVCICompleteTheFieldExpiryDate() {
        _page.expiryDateFieldFunction();
    }

    @And("SVC I complete the field CVC Code")
    public void SVCICompleteTheFieldCVCCode() {
        _page.cvcCardFieldFunction();
    }

    @And("SVC I click the button Save payment")
    public void SVCIClickTheButtonSavePayment() {
        _page.setSavePaymentFunction();
    }

    @And("SVC I go to the admin panel")
    public void SVCIGoToTheAdminPanel() {
        _page.adminPanelStepFunction();
    }

    @Then("SVC I create my marketplace products page")
    public void SVCICreateMyMarketplaceProductsPage() {
        Assert.assertEquals(_page.marketPlaceCreateConfirm(), false);
    }

    @And("SVC I check to accept {string}")
    public void SVCICheckToAcceptBeingContactedForCustomFeaturesThatWillGrowMyMarketplaceXFaster(int arg0) {
        _page.checkBoxContactedFunction();
    }

    @And("SVC I select Service")
    public void SVCISelectService() {
        _page.chooseServiceMarketplace();
    }

    @And("SVC I complete the field Full name")
    public void SVCICompleteTheFieldFullName() {
        _page.fullNameFieldFunction();
    }

    @And("SVC I complete the field Email Address")
    public void SVCICompleteTheFieldEmailAddress() {
        _page.emailAddressFieldFunction();
    }

    @And("SVC I complete the field Phone Number")
    public void SVCICompleteTheFieldPhoneNumber() {
        _page.phoneNumberFieldFunction();
    }

    @And("SVC I complete the field Credit card number")
    public void SVCICompleteTheFieldCreditCardNumber() {
        _page.creditCardNumberFieldFunction();
    }

    @And("SVC I complete the field expiry date card")
    public void SVCICompleteTheFieldExpiryDateCard() {
        _page.expiryCardFieldFunction();
    }

    @And("SVC I complete the field CVC Code card")
    public void SVCICompleteTheFieldCVCCodeCard() {
        _page.cvcCodeFieldFunction();
    }

    @And("SVC I click the button Start My MarketPlace Now")
    public void SVCIClickTheButtonStartMyMarketPlaceNow() {
        _page.startMyMarketPlaceNow();
    }

    @Then("SVC I create my marketplace service page")
    public void SVCICreateMyMarketplaceServicePage() {
        Assert.assertEquals(_page.errorMessageConfirm(),false);
    }
}