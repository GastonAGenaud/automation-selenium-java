package steps.request;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.request.requestPage;


public class requestSteps extends BasePage {

    private requestPage _page;

    public requestSteps() {

        this._page = new requestPage();
    }

    @And("I go to Request Page")
    public void iGoToRequestPage() {
        ////_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.request();
    }

    @And("I go to Request Page from Dashboard")
    public void iGoToRequestPageFromDashboard() {
        ////_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.goToDashboard();
        _page.goToRequestFromDashboard();
        getDriver().navigate().refresh();
    }

    @When("I select create a request button")
    public void iSelectCreateARequestButton() {
        _page.browseCreateRequestBtn();
    }

    @Then("I validate the Create a Request in browse section")
    public void iValidateTheCreateARequestInBrowseSection() {
        Assert.assertEquals("Create a Request", _page.validateCreateRequestBrowse());
    }


    @When("I select create a request button in dashboard")
    public void iSelectCreateARequestButtonInDashboard() {
        _page.requestDashboardCreateARequest();
    }

    @Then("I validate the Create a Request in dashboard")
    public void iValidateTheCreateARequestInDashboard() {
        Assert.assertEquals("Create a Request", _page.validateCreateRequestDashboard());
    }

    @When("I select create a request")
    public void iSelectCreateARequest() {

        _page.browseCreateRequestBtn();
        _page.categoryButton();
        _page.categoryAccessories();
        _page.tagsText();
        _page.next();
        _page.requestName();
        _page.requestDescription();
        _page.next2();
        _page.validatingAddImagesTxt();
        _page.next2();
        _page.minimumBudget();
        _page.maximumBudget();
        //_page.endDate();
        _page.locationCheckBox();
        _page.ExcellentTxt();
        _page.addEndDate();
        System.out.println("MENSAJE IMPORTANTE");
        _page.publishRequest();
        System.out.println("MENSAJE IMPORTANTE");
    }

    @And("I select request details")
    public void iSelectRequestDetails() {

        System.out.println("MENSAJE IMPORTANTE _page.requestDetailsSuccessPopUp();");
        _page.requestDetailsSuccessPopUp();
    }

    @And("I select request URL")
    public void iSelectRequestURL() {
        _page.requestCopyURL();
    }

    @And("I validate the request social share")
    public void iValidateTheRequestSocialShare() {
        _page.requestFacebookShare();
        _page.requestTwitterShare();
        _page.requestWhatsappShare();
    }

    @And("I validate the back to home button")
    public void iValidateTheBackToHomeButton() {

        System.out.println("VALIDACION BACK TO HOME");
        _page.requestBackToHomeButton();
    }

    @Then("I validate the request pop up")
    public void iValidateTheRequestPopUp() {

        System.out.println("VALIDACION ASSERT");
        Assert.assertEquals(_page.logoPage(), true);
    }


    @When("I validate created by me active requests")
    public void iValidateCreatedByMeActiveRequests() {
        _page.requestsCreatedByMeButton();
        getDriver().navigate().refresh();
        _page.requestsCreatedByMeButton();
    }

    @And("I select edit button")
    public void iSelectEditButton() {
        _page.requestsEdit();
    }

    @And("I validate pause the request button")
    public void iValidatePauseTheRequestButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsCreatedByMeButton();
        getDriver().navigate().refresh();
        _page.requestsActiveMenu();
        _page.requestsPause();
    }

    @And("I validate duplicate the request button")
    public void iValidateDuplicateTheRequestButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsCreatedByMeButton();
        getDriver().navigate().refresh();
        _page.requestsActiveMenu();
        _page.requestsDuplicate();
    }

    @And("I validate share the request button")
    public void iValidateShareTheRequestButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsCreatedByMeButton();
        getDriver().navigate().refresh();
        _page.requestsActiveMenu();
        _page.requestsShare();
    }

    @And("I validate delete the request button")
    public void iValidateDeleteTheRequestButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsCreatedByMeButton();
        getDriver().navigate().refresh();
        _page.requestsActiveMenu();
        _page.requestsDelete();
    }

    @Then("I validate the requests created by me section")
    public void iValidateTheRequestsCreatedByMeSection() {
        Assert.assertEquals(true, _page.validateRequestMatchedPage());
    }

    @When("I validate open section details")
    public void iValidateOpenSectionDetails() {
        _page.matchedDetails();
    }

    @And("I validate the apply button")
    public void iValidateTheApplyButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsMatchedMenu();
        _page.requestsMatchedApply();
    }

    @And("I validate the close button")
    public void iValidateTheCloseButton() {
        _page.goToDashboard();
        _page.request();
        _page.validatingDetailText();
        _page.requestsMatchedMenu();
        _page.requestsMatchedClose();
//        _page.closedMenu();
        //_page.reOpen();
    }

    @And("I validate the send message button")
    public void iValidateTheSendMessageButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsMatchedMenu();
        _page.requestsMatchedSendMessage();
    }

    @And("I validate the share button in open section")
    public void iValidateTheShareButtonInOpenSection() {
        _page.goToDashboard();
        _page.request();
        _page.requestsMatchedMenu();
        _page.requestsMatchedShare();
    }

    @Then("I validate the request matched page")
    public void iValidateTheRequestMatchedPage() {
        Assert.assertEquals(true, _page.matchedValidate());

    }

    @When("I validate search a request")
    public void iValidateSearchARequest() {
        _page.requestSearchText();
        _page.requestSearch();
    }

    @And("I validate the category filters")
    public void iValidateTheCategoryFilters() {
        _page.filterAccessories();
        _page.filterArtAndCollectables();
        _page.filterClothing();
//        _page.filterHomeAndLiving();
        _page.filterHottestItems();
        _page.filterJewelry();
        _page.filterOutdoorStuff();
        _page.filterRugs();
        _page.filterShoes();
        _page.filterSkinCare();
    }

    @And("I validate the price filter")
    public void iValidateThePriceFilter() {
        _page.filterPrice();
    }

    @And("I validate the location filter")
    public void iValidateTheLocationFilter() {
        _page.filterLocation();
    }

    @And("I validate the sort section")
    public void iValidateTheSortSection() {
        _page.setHomePage();
        _page.headerRequest();
        _page.sortNewestToOldest();
        _page.sortOldToNewest();
        _page.sortExpiresFirst();
        _page.sortExpiresLast();
    }

    @Then("I validate the browse request page")
    public void iValidateTheBrowseRequestPage() {
        Assert.assertEquals(true, _page.browseRequestPage());
    }
}