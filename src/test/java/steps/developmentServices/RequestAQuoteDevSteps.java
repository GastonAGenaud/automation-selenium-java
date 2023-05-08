package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.RequestAQuoteDevPage;

import java.io.IOException;

public class RequestAQuoteDevSteps extends BasePage {
    private RequestAQuoteDevPage _page;

    public RequestAQuoteDevSteps() {

        this._page = new RequestAQuoteDevPage();
    }

    @And("i select the request")
    public void iSelectTheRequest() {
        _page.selectTheRequest();
    }

    @And("i select apply")
    public void iSelectApply() {
        _page.selectApply();
    }

    @And("complete the form Serv")
    public void completeTheFormServ() {
        _page.enterMessage();
        _page.enterStartDate();
        _page.endTimeField();
        _page.applyField();
    }

    @Then("valid Request a quote")
    public void validRequestAQuote() {
    }

}
