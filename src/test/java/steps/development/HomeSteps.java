package steps.development;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.development.HomePage;


public class HomeSteps extends BasePage {

    private HomePage _page;

    public HomeSteps() {

        this._page = new HomePage();
    }


//    @Before
//    public void testSignup() throws IOException {
//        _page.loginWithGastonUserProdProducts();
//
//    }


    @And("select Contact Us button")
    public void selectContactUsButton() {
    }

    @When("complete Name TextField")
    public void completeNameTextField() {
    }

    @And("complete Email TextField")
    public void completeEmailTextField() {
    }

    }