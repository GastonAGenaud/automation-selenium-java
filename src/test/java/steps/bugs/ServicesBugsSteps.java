package steps.bugs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.bugs.ServicesBugsPage;

public class ServicesBugsSteps extends BasePage {

    private ServicesBugsPage _page;

    public ServicesBugsSteps() {

        this._page = new ServicesBugsPage();

    }

    @Given("SVC The user create 5 subcategories under one category.")
    public void SVCTheUserCreateSubcategoriesUnderOneCategory() {
        _page.setHomePage();
        _page.loginWithGastonUserSVC();
        _page.goToAdminPanel();
        _page.createCustomFields();
        _page.getCloseChat();
    }

    @And("select Add Category")
    public void selectAddCategory() {
        _page.addCategoryButton();
        _page.typeCategoryField();

    }

    @And("SVC I Create {int} Subcategories")
    public void svcICreateSubcategories(int arg0) {
        _page.expandCategoryTab();
        _page.addSubCategoryButton();
        _page.addSubCategoryTextBoxField();
    }

    @And("I create {int} Items inside one Subcategory")
    public void iCreateAnotherCategoriesInsideOneSubcategory(int arg0) {


    }

    @And("I go to Custom Fields")
    public void iGoToCustomFields() {
    }

    @And("select what you wnt to edit")
    public void selectWhatYouWntToEdit() {
    }

    @And("select the category you created")
    public void selectTheCategoryYouCreated() {
    }

    @Then("SVC I valid that the incorrect display of categories and Subcategories no longer occurs")
    public void svcIValidThatTheIncorrectDisplayOfCategoriesAndSubcategoriesNoLongerOccurs() {
    }


    @Then("I valid that the Bug of Hourly no longer occurs.")
    public void iValidThatTheBugOfHourlyNoLongerOccurs() {
        Assert.assertEquals(true, _page.validHourlyOfferingText());
    }

    @And("select one day from the calendar")
    public void selectOneDayFromTheCalendar() {
        _page.selectingAvailableDate();
    }

    @Then("I validate that the available schedules work correctly and the bug no longer occurs.")
    public void iValidateThatTheAvailableSchedulesWorkCorrectlyAndTheBugNoLongerOccurs() {
        _page.scheduleHours();
    }

    @And("select Request a Quote")
    public void selectRequestAQuote() {
    }

    @And("complete form")
    public void completeForm() {
        _page.typeDate();
        _page.selectEndTime();
        _page.proposedPriceTextField();
        _page.messageField();
    }

    @And("SVC I select the Send Request Button")
    public void svcISelectTheSendRequestButton() {
        _page.sendRequestButton();
    }

    @And("I select the favicon from the top left")
    public void iSelectTheFaviconFromTheTopLeft() {
        _page.svcFaviconButton();
    }

    @Then("I valid that the endless loading when selecting favicon no longer occurs")
    public void iValidThatTheEndlessLoadingWhenSelectingFaviconNoLongerOccurs() {
        _page.faviconRedirect();
    }


    @And("SVC go to Admin")
    public void svcGoToAdmin() {
        _page.SVCgoToAdminPanel();
    }

    @Then("I validate that the modal is displaying correctly and the bug no longer occurs")
    public void iValidateThatTheModalIsDisplayingCorrectlyAndTheBugNoLongerOccurs() {
        _page.validateCustomFieldModal();
    }

    @When("SVC I select My Listings button")
    public void svcISelectMyListingsButton() {
        _page.myListingsButton();
    }

    @Then("I validate that the my Services-listings sections is working correctly and the slow loading no longer occurs")
    public void iValidateThatTheMyServicesListingsSectionsIsWorkingCorrectlyAndTheSlowLoadingNoLongerOccurs() {
        _page.MyListingCompleteSector();
    }

    @Then("SVC I validate that the bug of being able to continue creating the listing without adding the image no longer occurs")
    public void svcIValidateThatTheBugOfBeingAbleToContinueCreatingTheListingWithoutAddingTheImageNoLongerOccurs() {
        _page.imgCannotBeEmpty();
    }

    @And("SVC select Service from User in Listings")
    public void svcSelectServiceFromUserInListings() {
        _page.userImageFromListing();
    }

    @And("Go back to Listings")
    public void goBackToListings() {
        getDriver().navigate().to("https://mtreborn-automation-services.azurewebsites.net/Listing/Browse");
    }

    @Then("I validate that the List View is displaying correctly and the bug no longer occurs")
    public void iValidateThatTheListViewIsDisplayingCorrectlyAndTheBugNoLongerOccurs() {
        _page.validateListing();
    }

    @When("SVC I select Browse Experts")
    public void svcISelectBrowseExperts() {
        _page.browseExpertsTab();
    }

    @And("SVC I select list view BUG")
    public void SvCiSelectListViewBUG() {
        _page.validatingTextHigherAndLower();
        _page.listViewBUG();
    }

    @And("SVC select Create a New Listing from Provider")
    public void svcSelectCreateANewListingFromProvider() {
        _page.addListingFromProvider();
    }

    @Then("I valid that the Add Listing Section from Provider works correctly and the bug no longer occurs")
    public void iValidThatTheAddListingSectionFromProviderWorksCorrectlyAndTheBugNoLongerOccurs() {
        _page.createListingValidateWeb();
    }

    @When("Deactivate Verify user")
    public void deactivateVerifyUser() {
        _page.deactivateAddonVerify();
        _page.deactivateAddonVerifyConfirm();
        _page.loaderWheel();
    }

    @And("Deactivate Explainer Video")
    public void deactivateExplainerVideo() {
        getDriver().navigate().refresh();
        _page.addonExplainerDeactivate();
        _page.deactivateAddonVerifyConfirm();
        _page.loaderWheel();
    }

    @And("Deactivate Google Analytics")
    public void deactivateGoogleAnalytics() {
        getDriver().navigate().refresh();
        _page.analyticsDeactivate();
        _page.deactivateAddonVerifyConfirm();
    }

    @Then("I validate that the addons can be deactivated correctly and the bug no longer occurs.")
    public void iValidateThatTheAddonsCanBeDeactivatedCorrectlyAndTheBugNoLongerOccurs() {
        _page.loaderWheel();
    }

    @And("SVC select browse first option")
    public void svcSelectBrowseFirstOption() {
        _page.browseLayout();
        _page.saveButtonLayout();
    }

    @And("SVC go to home")
    public void svcGoToHome() {
        getDriver().navigate().to(UrlSVC);
        _page.validateHome();
    }

    @And("SVC return to homepage layout")
    public void svcReturnToHomepageLayout() {
    }

    @And("SVC select Stylish layout")
    public void svcSelectStylishLayout() {
        _page.stylishLayout();
    }

    @Then("I validate that the browse first layout is displayed correctly and the bug no longer occurs")
    public void iValidateThatTheBrowseFirstLayoutIsDisplayedCorrectlyAndTheBugNoLongerOccurs() {
        _page.saveButtonLayout();
    }

    @And("SVC I go to Admin page again")
    public void svcIGoToAdminPageAgain() {
        _page.goToAdminPanel();
    }

    @Then("I Valid that the monthly offering button is not shown and the bug no longer occurs")
    public void iValidThatTheMonthlyOfferingButtonIsNotShownAndTheBugNoLongerOccurs() {

    }

    @And("select Email Notifications Checkbox")
    public void selectEmailNotificationsCheckbox() {
        _page.emailNotificationCheckbox();
    }

    @And("select the Save Changes button")
    public void selectTheSaveChangesButton() {
        _page.saveChangesNotification();
    }

    @Then("I validate that the error on Notifications Settings no longer occurs")
    public void iValidateThatTheErrorOnNotificationsSettingsNoLongerOccurs() {
        _page.successSaveMessage();
    }
}
