package steps.reviews;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.review.OhReviewsPage;

import java.io.IOException;

public class OhReviewsSteps extends BasePage {

    private OhReviewsPage _page;

    public OhReviewsSteps() {

        this._page = new OhReviewsPage();
    }

    @Given("OHE I login and go to a class")
    public void iLoginAndGoToClass() throws IOException {
        _page.goToOwlPage();
        _page.goToLoginPage();
        _page.loginWithMatiasOwl();
        _page.goToOwlPage();
        _page.setBrowseClassesBtn();
        _page.setSelectClass();
    }

    @When("OHE I select review section")
    public void oheISelectReviewSection() {
        _page.setReviewsBtn();
    }

    @And("OHE I select ask for reviews button")
    public void oheISelectAskForReviewsButton() {

        _page.setAskForReviewBtn();
    }

    @Then("OHE I validate Ask for Reviews")
    public void oheIValidateAskForReviews() {
        Assert.assertEquals("Invite people to leave you a review", _page.InvitePeopleTxt());
    }

    @And("OHE select Send button")
    public void selectSendButton() {
        _page.setSendInviteBtn();
    }

    @Then("OHE I validate Invite People")
    public void oheIValidateInvitePeople() {

        Assert.assertEquals(_page.successInviteText(), "The invite emails have been sent successfully.");
    }

    @And("complete Email and Message TextField")
    public void completeEmailAndMessageTextField() {

        _page.setEmailTextField();

        _page.setMessageTextField();
    }

    @And("complete Email with Import")
    public void completeEmailWithImport() {
        _page.setImportCsv();
        _page.setMessageTextField();
    }
}