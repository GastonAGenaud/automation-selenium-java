package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.SProdLoginPages;

import java.io.IOException;

public class BrowseWantsDevSteps extends BasePage {
    private BrowseWantsDevSteps _page;

    public BrowseWantsDevSteps() {

        this._page = new BrowseWantsDevSteps();
    }

    @When("go to Browse Request Serv")
    public void goToBrowseRequestServ() {
        _page.goToBrowseRequestServ();
    }

    @And("select Apply ServProd")
    public void selectApplyServProd() {
        _page.selectApplyButton();
    }

    @Then("I validate Price filter in section Browse Request ServProd")
    public void iValidatePriceFilterInSectionBrowseRequestServProd() {
        _page.validatePriceFilterSectionRequest();
    }
}
