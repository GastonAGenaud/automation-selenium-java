package steps.checkout;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.checkout.SvcCheckoutPage;

import java.io.IOException;

public class SvcCheckoutSteps extends BasePage {

    private SvcCheckoutPage _page;

    public SvcCheckoutSteps() {

        this._page = new SvcCheckoutPage();
    }


    @Given("SVC I login with Matias Owl")
    public void SVCloginWithMatiasOwlSteps() {
        getDriver().manage().deleteAllCookies();
        sessionManager.usePreviousLoggedInSession("MatiasUser-data-session");
        getDriver().navigate().refresh();
        wait(3);
        sessionManager.usePreviousLoggedInSession("MatiasUser-data-session");
        getDriver().navigate().refresh();
    }
/*
    @Given("SVC I login")
    public void SVCILogin(){
        _page.goToOwlPage();
        _page.goToLogin();
        _page.login();
    }

    @When("SVC I go to a class")
    public void SVCIGoToAClass() {
        _page.goToAClass();
    }

    @And("SVC I select hire button")
    public void SVCISelectHireButton() {
        _page.validateTextUser();
        _page.selectHireBtn();
    }

    @And("SVC I select flat fee option")
    public void SVCISelectFlatFeeOption() {
        _page.selectFlatFleeBtn();
    }

    @And("SVC I type in message text field")
    public void SVCITypeInMessageTextField() {
        _page.messageField();
    }

    @And("SVC I select the hire accept button")
    public void SVCISelectTheHireAcceptButton() {
        _page.acceptHire();
    }

    @Then("SVC I see the shopping cart")
    public void SVCISeeTheShoppingCart() {
    }

    @And("SVC I select hourly option")
    public void SVCISelectHourlyOption() {
        _page.validateHireTextBox();
        //_page.selectEndHour();
    }

    @And("SVC I select select the end time")
    public void SVCISelectSelectTheEndTime() {
        _page.selectEndTime();
        _page.selectEndHour();

    }

    @And("SVC I go back to cart")
    public void SVCIGoBackToCart() {
        _page.goBackToMyCartBtn();
    }

    @And("SVC I type in card number text field")
    public void SVCITypeInCardNumberTextField() {
        _page.cardNumberField();
    }

    @And("SVC I type in name on card text field")
    public void SVCITypeInNameOnCardTextField() {
        _page.nameOnCardTextField();
    }

    @And("SVC I select save checkbox")
    public void SVCISelectSaveCheckbox() {
        _page.saveCreditCard();
    }

    @Then("SVC I validate the new credit card")
    public void SVCIValidateTheNewCreditCard() {
    }

    @And("SVC I select submit payment")
    public void SVCISelectSubmitPayment() {
        _page.submitPayment();
    }

    @Then("SVC I validate the submit payment")
    public void SVCIValidateTheSubmitPayment() {
    }

    @And("SVC I type in expiration date text field")
    public void SVCITypeInExpirationDateTextField() {
        _page.expirationDate();
    }

    @And("SVC I type in CVVCode text field")
    public void SVCITypeInCVVCodeTextField() {
        _page.cvvCode();
    }

    @And("SVC I select the date time")
    public void SVCISelectTheDateTime() {
        _page.typeDate();
        _page.selectFlatFleeBtn();
        _page.hourlyCheckBox();
    }
}
 */

}