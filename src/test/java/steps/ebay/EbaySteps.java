package steps.ebay;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.base.TestContext;
import pages.ebay.EbayPage;

public class EbaySteps {
    private final EbayPage _page;
    private final WebDriver _driver;
    private final TestContext _context;

    public EbaySteps(TestContext context) {
        _context = context;
        _driver = _context.driver;
        _page = new EbayPage(_driver);
    }

    public EbaySteps(EbayPage page, WebDriver driver, TestContext context) {
        _page = page;
        _driver = driver;
        _context = context;
    }
}
