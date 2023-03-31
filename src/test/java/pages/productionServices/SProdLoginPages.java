package pages.productionServices;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;


public class SProdLoginPages extends BasePage {
    public SProdLoginPages() {
        super();
    }

    Actions actions = new Actions(getDriver());

}
