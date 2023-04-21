package pages.development;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;


import static java.lang.Math.min;

public class LandingPagePage extends BasePage {


    public LandingPagePage() {
        super();
    }

    Actions actions = new Actions(getDriver());


    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(3)")
    public WebElement headerTab;

    @FindBy(how = How.CSS, using = "#blog-header-text")
    public WebElement blogModifyInput;

    @FindBy(how = How.CSS, using = "#collapse-header > div > form > div.col-12.pb-4 > button")
    public WebElement saveBtn;

    @FindBy(xpath = "//a[contains(text(), 'Test')]")
    public WebElement testTextValidate;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body > div.iziToast-texts > p")
    public WebElement validateSaveText;

    public void validateTextSavePopUp(){
        fluentWait(getDriver(), validateSaveText);
        Assert.assertTrue(validateSaveText.isDisplayed());
    }
    public String validateTestText(){
        String result = testTextValidate.getText();
        return result;
    }

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