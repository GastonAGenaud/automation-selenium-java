package steps.production;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.production.BrowseBySellerPage;
import pages.production.BrowseWantsPage;

import java.io.IOException;


public class BrowseWantsSteps extends BasePage {

    private BrowseWantsPage _page;

    public BrowseWantsSteps() {

        this._page = new BrowseWantsPage();
    }


    @Before
    public void testSignup() throws IOException {
        _page.loginWithGastonUserProdProducts();

    }

    @And("go to Browse Request")
    public void goToBrowseRequest() {
        getDriver().navigate().to(UrlProd + "Want/browse");
    }
}
