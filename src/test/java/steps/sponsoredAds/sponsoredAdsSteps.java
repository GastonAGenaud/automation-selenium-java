package steps.sponsoredAds;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;
import pages.sponsoredAds.sponsoredAdsPage;


public class sponsoredAdsSteps extends BasePage {

    private sponsoredAdsPage _page;

    public sponsoredAdsSteps() {

        this._page = new sponsoredAdsPage();
    }

    @Given("I login with another account")
    public void iLoginWithAnotherAccount() {
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.getLoginPage();
        _page.login2();
        _page.goToDashboard();

    }

    @When("I select Sponsored Ads section")
    public void iSelectSponsoredAdsSection() {
        _page.goToSponsoredAds();
    }

    @And("I select the Add New button")
    public void iSelectTheAddNewButton() {
        _page.addNewButton();
    }

    @And("I complete the Ad information TextField")
    public void iCompleteTheAdInformationTextField() {
        _page.adInformationTextField();
    }

    @And("I complete the URL TextField")
    public void iCompleteTheURLTextField() {
        _page.urlTextField();
    }

    @And("I add an image")
    public void iAddAnImage() {
        _page.addAnImage();
        //_page.cropButton();

    }

    @And("I complete the Start Date TextField")
    public void iCompleteTheStartDateTextField() {
        _page.adStartDateTextField();
    }

    @And("I complete the End Date TextField")
    public void iCompleteTheEndDateTextField() {
        _page.adEndDateTextField();
    }

    @And("I select the Publish button")
    public void iSelectThePublishButton() {
        _page.iSelectPublish();
    }

    @Then("I validate Create an Ad")
    public void iValidateCreateAnAd() {
        Assert.assertEquals(true, _page.validateSponsoredPage());
    }

    @And("I select the tab dots ONE")
    public void iSelectTheTabDotsOne() {

        _page.sortByButton();
        //_page.expiresLastOption();
        _page.iSelectTabDotsONE();
    }

    @And("I select the Reactivate option")
    public void iSelectTheReactivateOption() {
//        _page.reactivateAd();
    }

    @Then("I validate the change status to Active")
    public void iValidateTheChangeStatusToActive() {
        Assert.assertEquals(true, _page.validateSponsoredPage());
    }

    @And("I select the tab dots DEACTIVATE")
    public void iSelectTheTabDotsDEACTIVATE() {
//        _page.sortByButton();
//        _page.expiresLastOption();
        _page.iSelectTabDotsTWO();
    }

    @And("I select the Deactivate option")
    public void iSelectTheDeactivateOption() {
        _page.deactivateAd();
    }

    @Then("I validate the change status to Inactive")
    public void iValidateTheChangeStatusToInactive() {
        Assert.assertEquals(true, _page.validateSponsoredPage());
    }

    @And("I select the tab dots PENDING PAY")
    public void iSelectTheTabDotsPENDINGPAY() {
        //_page.sortByButton();
        //_page.expiresLastOption();
        _page.getActiveTab();
        _page.tabButton();
//       _page.iSelectTabDotsTwo();
    }

    @And("I select the Pay option")
    public void iSelectThePayOption() {
        _page.payOption();
    }

    @And("I complete the Card Number TextField")
    public void iCompleteTheCardNumberTextField() {
        _page.cardNumberTXT();
    }

    @And("I complete the Name on Card TextField")
    public void iCompleteTheNameOnCardTextField() {
        _page.nameOnCardTXT();
    }

    @And("I complete the Expiration Date TextField")
    public void iCompleteTheExpirationDateTextField() {
        _page.expirationDateTXT();
    }

    @And("I complete the CVV Code TextField")
    public void iCompleteTheCVVCodeTextField() {
        _page.cvvCodeTXT();
    }

    @And("I select the Submit Payment Button")
    public void iSelectTheSubmitPaymentButton() {
        _page.iSubmitPendingPayment();
    }

    @Then("I validate Pay an ad")
    public void iValidatePayAnAd() {
        Assert.assertEquals(true, _page.payingErrorMSG());
    }

    @And("I select the Sort By option")
    public void iSelectTheSortByOption() {
        _page.sortByButton();
    }

    @And("I select the Expires Last option")
    public void iSelectTheExpiresLastOption() {
        _page.expiresLastOption();
    }

    @Then("I validate sort ads")
    public void iValidateSortAds() {
        Assert.assertEquals(true, _page.validateSponsoredPage());
    }

    @When("I select the Sponsored Ads section")
    public void iSelectTheSponsoredAdsSection() {
        _page.goToSponsoredAds();
    }

    @And("I select the tab dots")
    public void iSelectTheTabDots() {
//        _page.sortByButton();
//        _page.expiresLastOption();
        _page.tabButton();
    }

    @And("I select the Edit option")
    public void iSelectTheEditOption() {
        _page.editAd();
    }

    @And("i click the Publish button")
    public void iClickThePublishButton() {
        _page.iSelectPublish();
    }

    @Then("I validate the Edit ads")
    public void iValidateTheEditAds() {
        Assert.assertEquals(true, _page.validateSponsoredPage());
    }

    @And("I select the Delete option")
    public void iSelectTheDeleteOption() {
        _page.deleteAd();
    }

    @Then("I validate the Delete ads")
    public void iValidateTheDeleteAds() {
        Assert.assertEquals(true, _page.validateSponsoredPage());
    }

    @And("I create a new Ad for PENDING PAY")
    public void iCreateANewAdForPENDINGPAY() {
        _page.addNewButton();
        _page.adInformationTextField();
        _page.urlTextField();
        _page.adStartDateTextField();
        _page.endDateField2();
        //_page.adStartDateTextField();
        _page.addAnImage();
        _page.iSelectPublish();
        //_page.logOut();
        //_page.loginHeaderButton();
        //_page.login();
        //page.goToDashboard();
        //_page.goToSponsoredAds();
    }
}

