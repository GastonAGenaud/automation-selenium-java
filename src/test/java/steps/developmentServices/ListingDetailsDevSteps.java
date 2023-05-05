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

public class ListingDetailsDevSteps extends BasePage {
    private ListingDetailsDevSteps _page;

    public ListingDetailsDevSteps() {

        this._page = new ListingDetailsDevSteps();
    }

    @Then("valid select Block")
    public void validSelectBlock() {
        _page.selectBlock();
    }

    @And("valid select List")
    public void validSelectList() {
        _page.selectList();
    }

    @And("valid select Map")
    public void validSelectMap() {
        _page.selectMap();
    }

    @And("valid select Search")
    public void validSelectSearch() {
        _page.serviceIncome();
        _page.selectSearch();

    }

}
