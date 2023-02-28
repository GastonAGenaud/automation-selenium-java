package steps.onlineClasses;

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
import pages.listing.listingPage;
import pages.onlineClasses.OhOnlineClassesPage;

public class OhOnlineClassesSteps {
    private final OhOnlineClassesPage _page;
    private final WebDriver _driver;
    private final TestContext _context;

    public OhOnlineClassesSteps(TestContext context) {
        _context = context;
        _driver = _context.driver;
        _page = new OhOnlineClassesPage(_driver);
    }

}
