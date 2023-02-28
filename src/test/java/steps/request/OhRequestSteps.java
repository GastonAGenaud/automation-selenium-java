package steps.request;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.request.OhRequestPage;

public class OhRequestSteps extends BasePage {

    private OhRequestPage _page;

    public OhRequestSteps() {

        this._page = new OhRequestPage();
    }

    @Given("OHE I go to Request Page")
    public void oheIGoToRequestPage() {
        _page.goToOwlPage();
        _page.login();
        _page.headerRequest();
    }

    @When("OHE I select create a request button")
    public void oheISelectCreateARequestButton() {
        _page.browseCreateRequestBtn();
    }

    @Then("OHE I validate the Create a Request in browse section")
    public void oheIValidateTheCreateARequestInBrowseSection() {
        Assert.assertEquals("Create a Request", _page.validateCreateRequestBrowse());
    }

    @Given("OHE I go to Dashboard Page")
    public void oheIGoToDashboardPage() {
        _page.goToOwlPage();
        _page.goToLoginPage();
        _page.login();
        _page.goToDashboard();
    }

    @When("OHE I select create a request button in dashboard")
    public void oheISelectCreateARequestButtonInDashboard() {
        _page.requestDashboardCreateARequest();
    }

    @Then("OHE I validate the Create a Request in dashboard")
    public void oheIValidateTheCreateARequestInDashboard() {

        Assert.assertEquals("Create a Request", _page.validateCreateRequestDashboard());
    }

    @When("OHE I select create a request")
    public void oheISelectCreateARequest() {
        _page.browseCreateRequestBtn();
        _page.categoryButton();
        _page.categoryAccessories();
        _page.tagsText();
        _page.next();
        _page.requestName();
        _page.requestDescription();
        _page.next();

        _page.next2();

        _page.minimumBudget();
        _page.maximumBudget();
        _page.endDate();
        _page.locationCheckBox();

        _page.next2();

        _page.publishRequest();
    }

    @And("OHE I select request URL")
    public void oheISelectRequestURL() {
        _page.requestDetailsSuccessPopUp();
    }

    @And("OHE I validate the request social share")
    public void oheIValidateTheRequestSocialShare() {
        _page.requestCopyURL();
    }

    @And("OHE I select request details")
    public void oheISelectRequestDetails() {
        _page.requestFacebookShare();
        _page.requestTwitterShare();
        _page.requestWhatsappShare();
    }

    @And("OHE I validate the back to home button")
    public void oheIValidateTheBackToHomeButton() {
        _page.requestBackToHomeButton();
    }

    @Then("OHE I validate the request pop up")
    public void oheIValidateTheRequestPopUp() {
        Assert.assertEquals(_page.logoPage(), true);
    }

    @Given("OHE I go to requests page")
    public void oheIGoToRequestsPage() {
        _page.goToLoginPage();
        _page.login();
        _page.goToDashboard();
        _page.request();
    }

    @When("OHE I validate created by me active requests")
    public void oheIValidateCreatedByMeActiveRequests() {
        _page.requestsCreatedByMeButton();
    }

    @And("OHE I select edit button")
    public void oheISelectEditButton() {
        _page.requestsEdit();
    }

    @And("OHE I validate pause the request button")
    public void oheIValidatePauseTheRequestButton() {
        _page.goToDashboard();
        _page.request();

        _page.requestsCreatedByMeButton();

        _page.requestsActiveMenu();

        _page.requestsPause();
    }

    @And("OHE I validate duplicate the request button")
    public void oheIValidateDuplicateTheRequestButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsCreatedByMeButton();
        _page.requestsActiveMenu();
        _page.requestsDuplicate();
    }

    @And("OHE I validate share the request button")
    public void oheIValidateShareTheRequestButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsCreatedByMeButton();

        _page.requestsActiveMenu();

        _page.requestsShare();
    }

    @And("OHE I validate delete the request button")
    public void oheIValidateDeleteTheRequestButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsCreatedByMeButton();

        _page.requestsActiveMenu();

        _page.requestsDelete();
    }

    @Then("OHE I validate the requests created by me section")
    public void oheIValidateTheRequestsCreatedByMeSection() {
        Assert.assertEquals(true, _page.validateRequestMatchedPage());
    }

    @When("OHE I validate open section details")
    public void oheIValidateOpenSectionDetails() {
        _page.matchedDetails();
    }

    @And("OHE I validate the apply button")
    public void oheIValidateTheApplyButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsMatchedMenu();
        _page.requestsMatchedApply();
    }

    @And("OHE I validate the close button")
    public void oheIValidateTheCloseButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsMatchedMenu();
        _page.requestsMatchedClose();
        _page.closedMenu();
        _page.reOpen();
    }

    @And("OHE I validate the send message button")
    public void oheIValidateTheSendMessageButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsMatchedMenu();
        _page.requestsMatchedSendMessage();
    }

    @And("OHE I validate the share button in open section")
    public void oheIValidateTheShareButtonInOpenSection() {
        _page.goToDashboard();
        _page.request();
        _page.requestsMatchedMenu();
        _page.requestsMatchedShare();
    }

    @Then("OHE I validate the request matched page")
    public void oheIValidateTheRequestMatchedPage() {
        Assert.assertEquals(true, _page.matchedValidate());
    }

    @When("OHE I validate search a request")
    public void oheIValidateSearchARequest() {
        _page.requestSearchText();
        _page.requestSearch();
    }

    @And("OHE I validate the category filters")
    public void oheIValidateTheCategoryFilters() {
        _page.filterAges12to14();
        _page.filterAges15to17();
        _page.filterAges5to8();
        _page.filterAges9to11();
    }

    @And("OHE I validate the price filter")
    public void oheIValidateThePriceFilter() {
        _page.filterPrice();
    }

    @And("OHE I validate the location filter")
    public void oheIValidateTheLocationFilter() {
        _page.filterLocation();
    }

    @And("OHE I validate the create a request button")
    public void oheIValidateTheCreateARequestButton() {
        _page.browseCreateRequestBtn();
        _page.categoryButton();
        _page.categoryAccessories();
        _page.tagsText();
        _page.next();
        _page.requestName();
        _page.requestDescription();
        _page.next();

        _page.next2();
        _page.minimumBudget();
        _page.maximumBudget();
        _page.endDate();
        _page.locationCheckBox();
        _page.next2();
        _page.publishRequest();
    }

    @And("OHE I validate the sort section")
    public void oheIValidateTheSortSection() {
        _page.goToOwlPage();
        _page.headerRequest();
        _page.sortNewestToOldest();
        _page.sortOldToNewest();
        _page.sortExpiresFirst();
        _page.sortExpiresLast();

    }

    @Then("OHE I validate the browse request page")
    public void oheIValidateTheBrowseRequestPage() {

        Assert.assertEquals(true, _page.browseRequestPage());
    }
}