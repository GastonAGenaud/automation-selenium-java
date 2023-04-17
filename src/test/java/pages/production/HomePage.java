package pages.production;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;


import java.security.Key;

import static java.lang.Math.min;
import static java.lang.Math.random;

public class HomePage extends BasePage {


    public HomePage() {
        super();
    }

    Actions actions = new Actions(getDriver());


    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(3)")
    public WebElement headerTab;

    @FindBy(how = How.CSS, using = "#blog-header-text")
    public WebElement blogModifyInput;

    @FindBy(how = How.CSS, using = "#collapse-header > div > form > div.col-12.pb-4 > button")
    public WebElement saveBtn;

    public void saveButton() {
        fluentWait(getDriver(), saveBtn);
        waitForWebElementAndClick(saveBtn);
    }

    public void blogModifyText(String text) {
        fluentWait(getDriver(), blogModifyInput);
        blogModifyInput.clear();
        blogModifyInput.sendKeys(text);
    }

    public void headerOption() {
        fluentWait(getDriver(), headerTab);
        waitForWebElementAndClick(headerTab);
    }
}