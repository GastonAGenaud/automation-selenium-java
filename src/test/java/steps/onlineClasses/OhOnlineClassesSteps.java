package steps.onlineClasses;

import org.openqa.selenium.WebDriver;
import pages.onlineClasses.OhOnlineClassesPage;

public class OhOnlineClassesSteps {
    private final OhOnlineClassesPage _page;
    private final WebDriver _driver;
    {
    }

    public OhOnlineClassesSteps(OhOnlineClassesPage page, WebDriver driver) {
        _page = page;
        _driver = driver;
    }
}
