package pages.development;

import org.openqa.selenium.interactions.Actions;
import pages.BasePage;



public class BrowseWantsPage extends BasePage {

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";


    public BrowseWantsPage() {
        super();
    }

    Actions actions = new Actions(getDriver());

}