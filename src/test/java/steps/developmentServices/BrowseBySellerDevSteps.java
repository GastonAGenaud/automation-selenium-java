package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.BrowseBySellerDevPage;

import java.io.IOException;

public class BrowseBySellerDevSteps extends BasePage {
    private BrowseBySellerDevPage _page;

    public BrowseBySellerDevSteps() {

        this._page = new BrowseBySellerDevPage();
    }

    @And("go to Browse by Seller ServProd")
    public void goToBrowseBySellerServProd() {
        _page.goToBrowseBySeller();
    }

    @When("select Graphics & Design")
    public void selectGraphicsDesign() {
        _page.graphicsDesignFilter();
    }

    @And("select Marketing")
    public void selectMarketing() {
        _page.marketingFilter();
    }

    @And("select Programming & Tech")
    public void selectProgrammingTech() {
        _page.programmingTechFilter();
    }

    @And("select Testing Category")
    public void selectTestingCategory() {
        _page.testingCategoryFilter();
    }

    @And("select Software")
    public void selectSoftware() {
        _page.softwareFilter();
    }

    @And("select Technology")
    public void selectTechnology() {
        _page.technologyFilter();
    }

    @And("select Business")
    public void selectBusiness() {
        _page.businessFilter();
    }

    @Then("I validate Filters Serv")
    public void iValidateFiltersServ() {
        Assert.assertEquals("Category", _page.validateFilterSector());
    }

    @And("select Show more")
    public void selectShowMore() {
        _page.shoreMoreSection();
    }

    @And("select Photography")
    public void selectPhotography() {
        _page.photographyFilter();
    }

    @When("complete Location TextField Serv")
    public void completeLocationTextFieldServ() {
        _page.locationText();
    }

    @Then("I validate Location Serv")
    public void iValidateLocationServ() {
        _page.validateLocationSection();
    }
}
