package steps.checkout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.checkout.OhCheckoutPage;

public class OhCheckoutSteps extends BasePage {

    private OhCheckoutPage _page;

    public OhCheckoutSteps() {

        this._page = new OhCheckoutPage();
    }

    @Given("OHE I login")
    public void oheILogin(){
        _page.goToOwlPage();
        _page.goToLogin();
        _page.login();
    }

    @When("OHE I go to a class")
    public void oheIGoToAClass() {
        _page.goToAClass();
    }

    @And("OHE I select hire button")
    public void oheISelectHireButton() {
        _page.validateTextUser();
        _page.selectHireBtn();
    }

    @And("OHE I select flat fee option")
    public void oheISelectFlatFeeOption() {
        _page.selectFlatFleeBtn();
    }

    @And("OHE I type in message text field")
    public void oheITypeInMessageTextField() {
        _page.messageField();
    }

    @And("OHE I select the hire accept button")
    public void oheISelectTheHireAcceptButton() {
        _page.acceptHire();
    }

    @Then("OHE I see the shopping cart")
    public void oheISeeTheShoppingCart() {
    }

    @And("OHE I select hourly option")
    public void oheISelectHourlyOption() {
        _page.validateHireTextBox();
        //_page.selectEndHour();
    }

    @And("OHE I select select the end time")
    public void oheISelectSelectTheEndTime() {
        _page.selectEndTime();
        _page.selectEndHour();

    }

    @And("OHE I go back to cart")
    public void oheIGoBackToCart() {
        _page.goBackToMyCartBtn();
    }

    @And("OHE I type in card number text field")
    public void oheITypeInCardNumberTextField() {
        _page.cardNumberField();
    }

    @And("OHE I type in name on card text field")
    public void oheITypeInNameOnCardTextField() {
        _page.nameOnCardTextField();
    }

    @And("OHE I select save checkbox")
    public void oheISelectSaveCheckbox() {
        _page.saveCreditCard();
    }

    @Then("OHE I validate the new credit card")
    public void oheIValidateTheNewCreditCard() {
    }

    @And("OHE I select submit payment")
    public void oheISelectSubmitPayment() {
        _page.submitPayment();
    }

    @Then("OHE I validate the submit payment")
    public void oheIValidateTheSubmitPayment() {
    }

    @And("OHE I type in expiration date text field")
    public void oheITypeInExpirationDateTextField() {
        _page.expirationDate();
    }

    @And("OHE I type in CVVCode text field")
    public void oheITypeInCVVCodeTextField() {
        _page.cvvCode();
    }

    @And("OHE I select the date time")
    public void oheISelectTheDateTime() {
        _page.typeDate();
        _page.selectFlatFleeBtn();
        _page.hourlyCheckBox();
    }
}