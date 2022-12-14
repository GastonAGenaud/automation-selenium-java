package steps.gmail;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static driver.DriverFactory.getDriver;

public class GmailSteps {

    private WebDriver driver = getDriver();

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
