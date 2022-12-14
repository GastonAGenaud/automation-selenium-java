package steps.ebay;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ebay.EbayPage;

public class EbaySteps  {
    @When("Search for {string}")
    public void loginUsingCredentials(String search) {
    }

    @Then("Open first result and output item price")
    public void verifySuccessLoginByUserProfileIcon() {

    }
}
