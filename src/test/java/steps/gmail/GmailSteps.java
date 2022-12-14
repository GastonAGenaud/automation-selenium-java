package steps.gmail;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.base.TestContext;
import pages.gmail.GmailPage;

public class GmailSteps {
    private final GmailPage _page;
    private final WebDriver _driver;
    private final TestContext _context;

    public GmailSteps(TestContext context) {
        _context = context;
        _driver = _context.driver;
        _page = new GmailPage(_driver);
    }

    public GmailSteps(GmailPage page, WebDriver driver, TestContext context) {
        _page = page;
        _driver = driver;
        _context = context;
    }
}
