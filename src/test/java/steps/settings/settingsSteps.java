package steps.settings;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;
import pages.settings.settingsPage;


public class settingsSteps extends BasePage {

    private settingsPage _page;

    public settingsSteps() {

        this._page = new settingsPage();

    }

    @When("I select my settings")
    public void iSelectMySettings() {
        _page.selectMySettings();
    }


    @Then("I see the profile information")
    public void iSeeTheProfileInformation() {
        Assert.assertEquals("Information", _page.settingsConfirm());
    }

    @And("I select Social")
    public void iSelectSocial() {
        _page.selectSocial();
    }

    @Then("I see the Social information")
    public void iSeeTheSocialInformation() {
        Assert.assertEquals("You on the web", _page.socialConfirm());
    }

    @And("I select Payment")
    public void iSelectPayment() {
        _page.selectPayment();
    }

    @Then("I see the Payment information")
    public void iSeeThePaymentInformation() {
        Assert.assertEquals(true, _page.paymentConfirm());
    }

    @And("I select CashOut")
    public void iSelectCashOut() {
        _page.selectCashOut();
    }

    @Then("I see the CashOut information")
    public void iSeeTheCashOutInformation() {
        Assert.assertEquals("Funding details", _page.cashOutConfirm());
    }

    @And("I select Security")
    public void iSelectPassword() {
        _page.selectPassword();
    }

    @Then("I see the Security information")
    public void iSeeThePasswordInformation() {
        Assert.assertEquals("Change Password", _page.passwordConfirm());
    }

    @And("I select Addresses")
    public void iSelectAddresses() {
        _page.selectAddresses();
    }

    @Then("I see the Addresses information")
    public void iSeeTheAddressesInformation() {
        Assert.assertEquals("Saved Addresses", _page.addressesConfirm());
    }
}