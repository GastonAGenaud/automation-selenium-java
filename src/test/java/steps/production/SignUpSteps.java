package steps.production;

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
import pages.BasePage;
import pages.production.SignUpPage;


public class SignUpSteps extends BasePage {

    private SignUpPage _page;

    public SignUpSteps() {

        this._page = new SignUpPage();

    }

//    @Given("I go to Sign Up Page")
//    public void loginiGoToSignUpPage() {
//        ////_driver.manage().window().setSize(new Dimension(2560, 1440));
//        _page.setHomePage();
//        _page.goToSignUp();
//        //_page.signUpWithGoogle();
//    }
//
//    @When("I validate the Sign Up with Facebook")
//    public void loginiValidateTheSignUpWithFacebookReborn() {
//        //_page.signUpWithFacebook();
//    }
//
//    @And("I validate the sign up with Google")
//    public void loginiValidateTheSignUpWithGoogleReborn() {
//        _page.signUpWithGoogle();
//    }
//
//    @And("I validate the E-mail Text Field with the email {string}")
//    public void loginiValidateTheEmailTextField(String text) {
//        _page.emailTextField(text);
//    }
//
//
//    @And("I validate the Sign Up button")
//    public void loginValidateTheSignUpButton() {
//        _page.signUpBtn();
//    }
//
}