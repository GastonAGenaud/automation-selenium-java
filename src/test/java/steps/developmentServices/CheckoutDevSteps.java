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

public class CheckoutDevSteps extends BasePage {
    private CheckoutDevSteps _page;

    public CheckoutDevSteps() {

        this._page = new CheckoutDevSteps();
    }

    @When("go to Browse Services")
    public void goToBrowseServices() {
        _page.goToBrowseService();
    }

    @And("select the required service")
    public void selectTheRequiredService() {
        _page.enterClassesValet();
    }

    @And("contract the service")
    public void contractTheService() {
        _page.hireTheService();
        _page.hireBoxValidate();
        _page.fleeFlatCheckbox();
    }

    @And("complete the form")
    public void completeTheForm() {
        _page.enterDeadline();
        _page.enterDescription();
        _page.enterHire();
    }

}
