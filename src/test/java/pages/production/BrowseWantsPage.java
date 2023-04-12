package pages.production;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;
import sun.awt.windows.WWindowPeer;

import java.security.Key;

import static java.lang.Math.min;
import static java.lang.Math.random;

public class BrowseWantsPage extends BasePage {

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";


    public BrowseWantsPage() {
        super();
    }

    Actions actions = new Actions(getDriver());

}