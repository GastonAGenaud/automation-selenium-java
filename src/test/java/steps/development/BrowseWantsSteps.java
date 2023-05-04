package steps.development;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import pages.BasePage;
import pages.development.BrowseWantsPage;

import java.io.IOException;


public class BrowseWantsSteps extends BasePage {

    private BrowseWantsPage _page;

    public BrowseWantsSteps() {

        this._page = new BrowseWantsPage();
    }


//    @Before
//    public void testSignup() throws IOException {
//        _page.loginWithGastonUserProdProducts();
//
//    }

    @And("go to Browse Request")
    public void goToBrowseRequest() {
        getDriver().navigate().to(UrlDevProducts + "Want/browse");
    }
}
