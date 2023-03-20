package steps.onlineClasses;

import org.openqa.selenium.WebDriver;
import pages.onlineClasses.OHEOnlineClassesPage;

public class OHEOnlineClassesSteps {
    private final OHEOnlineClassesPage _page;
    private final WebDriver _driver;
    {
    }

    public OHEOnlineClassesSteps(OHEOnlineClassesPage page, WebDriver driver) {
        _page = page;
        _driver = driver;
    }
}
