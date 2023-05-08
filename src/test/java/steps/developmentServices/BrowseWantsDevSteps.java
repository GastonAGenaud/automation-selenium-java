package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.BrowseWantsDevPage;

import java.io.IOException;

public class BrowseWantsDevSteps extends BasePage {
    private BrowseWantsDevPage _page;

    public BrowseWantsDevSteps() {

        this._page = new BrowseWantsDevPage();
    }


    @When("go to Browse Request Serv")
    public void goToBrowseRequestServ() {
        _page.goToBrowseRequestServ();
    }

    @And("select Apply Serv")
    public void selectApplyServ() {
        _page.selectApplyButton();
    }

    @Then("I validate Price filter in section Browse Request ServProd")
    public void iValidatePriceFilterInSectionBrowseRequestServProd() {
        _page.validatePriceFilterSectionRequest();
    }
}
