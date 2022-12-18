package steps.ebay;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.EbayPage;

public class EbaySteps  extends BasePage {
    private EbayPage _page;

    public EbaySteps(EbayPage page) {
        _page = page;
    }

    @When("Search for {string}")
    public void loginUsingCredentials(String search) {
    }

    @Then("Open first result and output item price")
    public void verifySuccessLoginByUserProfileIcon() {

    }
}
