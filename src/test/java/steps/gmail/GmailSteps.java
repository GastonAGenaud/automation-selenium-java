package steps.gmail;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.base.BasePage;
import pages.gmail.GmailPage;


public class GmailSteps extends BasePage {

    private GmailPage _page;
    @When("Login using {string} credentials")
    public void loginUsingCredentials(String typeOfCredentials) {
    }

    @Then("Verify success login by user profile icon")
    public void verifySuccessLoginByUserProfileIcon() {

    }

    @Then("Verify incorrect login")
    public void verifyIncorrectLogin() {
    }
}
