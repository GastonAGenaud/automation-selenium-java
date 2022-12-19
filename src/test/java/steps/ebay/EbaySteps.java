package steps.ebay;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.EbayPage;
import pages.GmailPage;

public class EbaySteps  extends BasePage {
    private EbayPage ebayPage;

    public EbaySteps() {
        this.ebayPage = new EbayPage();
    }

    @When("Search for {string}")
    public void searchForText(String search) {
        ebayPage.testSearchElectricGuitar();
        ebayPage.testSearch(search);
    }

    @Then("Open first result and output item price")
    public void verifySuccessLoginByUserProfileIcon() {
        ebayPage.clickOnFistResult();
        ebayPage.showFirstPrice();

    }
}
