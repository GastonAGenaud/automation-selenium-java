package steps.gmail;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pages.BasePage;
import pages.GmailPage;

import static org.testng.Assert.assertEquals;


public class GmailSteps extends BasePage {

    private GmailPage gmailPage;

    public GmailSteps() {

        this.gmailPage = new GmailPage();

    }
    String url = "";
    Response response;

    @When("Login using {string} credentials")
    public void loginUsingCredentials(String typeOfCredentials)  {
        System. out. println(typeOfCredentials +  " normal string");
        if (typeOfCredentials.equals("valid")) {
            gmailPage.SignIn();
        } else if (typeOfCredentials.equals("invalid password")) {
            gmailPage.IncorrectPasswordLogin();
        } else if (typeOfCredentials.equals("invalid domain")) {
            gmailPage.IncorrectDomainLogin();
        }
        else if (typeOfCredentials.equals("random")) {
            gmailPage.AccountNotFound();
        }
        else {
            System.out.println("You need put a valid type of credentials (valid, invalid or random)"
                    + "\n" + typeOfCredentials + " is not a valid type of credentials");
        }
    }

    @Then("Verify success login by user profile icon")
    public void verifySuccessLoginByUserProfileIcon() {
        gmailPage.ValidateSuccessLogin();

    }
    @Then("Verify incorrect login message {string}")
    public void verifyIncorrectLogin(String message) {
        gmailPage.ValidateIncorrectLogin(message);
    }
    @Given("Navigate to {string} page")
    public void navigate_to_page(String url) {
        navigateTo(url);
    }

    @Given("I want to access the Google Home Page")
    public void iWantToAccessTheGoogleHomePage() {
    }

    @When("I make a GET request to the URL {string}")
    public void iMakeAGETRequestToTheURL(String url) {
         this.url=url;
        response = RestAssured.get(this.url);
    }

    @Then("the status of the response should be {int} OK")
    public void theStatusOfTheResponseShouldBeOK(int status) {
        assertEquals(status, response.getStatusCode());
    }

}
