package steps.request;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.request.ServicesRequestPage;

public class ServicesRequestSteps extends BasePage {

    private ServicesRequestPage _page;

    public ServicesRequestSteps() {

        this._page = new ServicesRequestPage();
    }

    @Given("SVC I go to Request Page")
    public void SVCIGoToRequestPage() {
        _page.goToOwlPage();
        _page.login();
        _page.headerRequest();
    }

    @When("SVC I select create a request button")
    public void SVCISelectCreateARequestButton() {
        _page.browseCreateRequestBtn();
    }

    @Then("SVC I validate the Create a Request in browse section")
    public void SVCIValidateTheCreateARequestInBrowseSection() {
        Assert.assertEquals("Create a Request", _page.validateCreateRequestBrowse());
    }

    @Given("SVC I go to Dashboard Page")
    public void SVCIGoToDashboardPage() {
        _page.goToOwlPage();
        _page.goToLoginPage();
        _page.login();
        _page.goToDashboard();
    }

    @When("SVC I select create a request button in dashboard")
    public void SVCISelectCreateARequestButtonInDashboard() {
        _page.requestDashboardCreateARequest();
    }

    @Then("SVC I validate the Create a Request in dashboard")
    public void SVCIValidateTheCreateARequestInDashboard() {

        Assert.assertEquals("Create a Request", _page.validateCreateRequestDashboard());
    }

    @When("SVC I select create a request")
    public void SVCISelectCreateARequest() {
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

    @And("SVC I select request URL")
    public void SVCISelectRequestURL() {
        _page.requestDetailsSuccessPopUp();
    }

    @And("SVC I validate the request social share")
    public void SVCIValidateTheRequestSocialShare() {
        _page.requestCopyURL();
    }

    @And("SVC I select request details")
    public void SVCISelectRequestDetails() {
        _page.requestFacebookShare();
        _page.requestTwitterShare();
        _page.requestWhatsappShare();
    }

    @And("SVC I validate the back to home button")
    public void SVCIValidateTheBackToHomeButton() {
        _page.requestBackToHomeButton();
    }

    @Then("SVC I validate the request pop up")
    public void SVCIValidateTheRequestPopUp() {
        Assert.assertEquals(_page.logoPage(), true);
    }

    @Given("SVC I go to requests page")
    public void SVCIGoToRequestsPage() {
        _page.goToLoginPage();
        _page.login();
        _page.goToDashboard();
        _page.request();
        _page.noAcceptedText();
    }

    @When("SVC I validate created by me active requests")
    public void SVCIValidateCreatedByMeActiveRequests() {
        //_page.noAcceptedText();
        _page.requestsCreatedByMeButton();
    }

    @And("SVC I select edit button")
    public void SVCISelectEditButton() {
        //_page.browseRequestPage();
        //_page.noAcceptedText();
        //_page.requestsCreatedByMeButton();
        _page.requestsEdit();
    }

    @And("SVC I validate pause the request button")
    public void SVCIValidatePauseTheRequestButton() {
        _page.goToDashboard();
        _page.request();
        _page.noAcceptedText();
        _page.requestsCreatedByMeButton();
        _page.requestsActiveMenu();
        _page.requestsPause();
    }

    @And("SVC I validate duplicate the request button")
    public void SVCIValidateDuplicateTheRequestButton() {
        _page.goToDashboard();
        _page.request();
        _page.noAcceptedText();
        _page.requestsCreatedByMeButton();
        _page.requestsActiveMenu();
        _page.requestsDuplicate();
    }

    @And("SVC I validate share the request button")
    public void SVCIValidateShareTheRequestButton() {
        _page.goToDashboard();
        _page.request();
        _page.noAcceptedText();
        _page.requestsCreatedByMeButton();
        _page.requestsActiveMenu();
        _page.requestsShare();
    }

    @And("SVC I validate delete the request button")
    public void SVCIValidateDeleteTheRequestButton() {
        _page.goToDashboard();
        _page.request();
        _page.noAcceptedText();
        _page.requestsCreatedByMeButton();
        _page.requestsActiveMenu();
        _page.requestsDelete();
    }

    @Then("SVC I validate the requests created by me section")
    public void SVCIValidateTheRequestsCreatedByMeSection() {
        Assert.assertEquals(true, _page.validateRequestMatchedPage());
    }

    @When("SVC I validate open section details")
    public void SVCIValidateOpenSectionDetails() {
        _page.matchedDetails();
    }

    @And("SVC I validate the apply button")
    public void SVCIValidateTheApplyButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsMatchedMenu();
        _page.requestsMatchedApply();
    }

    @And("SVC I validate the close button")
    public void SVCIValidateTheCloseButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsMatchedMenu();
        _page.requestsMatchedClose();
        _page.closedMenu();
        _page.reOpen();
    }

    @And("SVC I validate the send message button")
    public void SVCIValidateTheSendMessageButton() {
        _page.goToDashboard();
        _page.request();
        _page.requestsMatchedMenu();
        _page.requestsMatchedSendMessage();
    }

    @And("SVC I validate the share button in open section")
    public void SVCIValidateTheShareButtonInOpenSection() {
        _page.goToDashboard();
        _page.request();
        _page.requestsMatchedMenu();
        _page.requestsMatchedShare();
    }

    @Then("SVC I validate the request matched page")
    public void SVCIValidateTheRequestMatchedPage() {
        Assert.assertEquals(true, _page.matchedValidate());
    }

    @When("SVC I validate search a request")
    public void SVCIValidateSearchARequest() {
        _page.requestSearchText();
        _page.requestSearch();
    }

    @And("SVC I validate the category filters")
    public void SVCIValidateTheCategoryFilters() {
        _page.filterAges12to14();
        _page.filterAges15to17();
        _page.filterAges5to8();
        _page.filterAges9to11();
    }

    @And("SVC I validate the price filter")
    public void SVCIValidateThePriceFilter() {
        _page.filterPrice();
    }

    @And("SVC I validate the location filter")
    public void SVCIValidateTheLocationFilter() {
        _page.filterLocation();
    }

    @And("SVC I validate the create a request button")
    public void SVCIValidateTheCreateARequestButton() {
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

    @And("SVC I validate the sort section")
    public void SVCIValidateTheSortSection() {
        _page.goToOwlPage();
        _page.headerRequest();
        _page.sortNewestToOldest();
        _page.sortOldToNewest();
        _page.sortExpiresFirst();
        _page.sortExpiresLast();

    }

    @Then("SVC I validate the browse request page")
    public void SVCIValidateTheBrowseRequestPage() {

        Assert.assertEquals(true, _page.browseRequestPage());
    }
}