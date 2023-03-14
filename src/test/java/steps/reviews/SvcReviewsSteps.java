package steps.reviews;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.review.SvcReviewsPage;

import java.io.IOException;

public class SvcReviewsSteps extends BasePage {

    private SvcReviewsPage _page;

    public SvcReviewsSteps() {

        this._page = new SvcReviewsPage();
    }

    @Given("SVC I login and go to a class")
    public void iLoginAndGoToClass() throws IOException {
        _page.goToSvcPage();
        _page.goToLoginPage();
        _page.loginWithGastonUserSVC();
        _page.goToSvcPage();
        _page.setBrowseClassesBtn();
        _page.setSelectClass();
    }

    @When("SVC I select review section")
    public void SVCISelectReviewSection() {
        _page.setReviewsBtn();
    }

    @And("SVC I select ask for reviews button")
    public void SVCISelectAskForReviewsButton() {

        _page.setAskForReviewBtn();
    }

    @Then("SVC I validate Ask for Reviews")
    public void SVCIValidateAskForReviews() {
        Assert.assertEquals("Invite people to leave you a review", _page.InvitePeopleTxt());
    }

    @And("SVC select Send button")
    public void selectSendButton() {
        _page.setSendInviteBtn();
    }

    @Then("SVC I validate Invite People")
    public void SVCIValidateInvitePeople() {

        Assert.assertEquals(_page.successInviteText(), "The invite emails have been sent successfully.");
    }

//    @And("SVC complete Email and Message TextField")
//    public void SVCcompleteEmailAndMessageTextField() {
//
//        _page.setEmailTextField();
//
//        _page.setMessageTextField();
//    }
//
//    @And("SVC complete Email with Import")
//    public void SVCcompleteEmailWithImport() {
//        _page.setImportCsv();
//        _page.setMessageTextField();
//    }
}