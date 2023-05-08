package pages.developmentServices;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;



public class BrowseListingsDevPage extends BasePage {
    public BrowseListingsDevPage() {
        super();
    }

    @FindBy(how = How.CSS, using = "#container-block")
    public WebElement listingValidate;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(1) > label > span")
    public WebElement purpleBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(2) > label > span")
    public WebElement lightBlueBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(3) > label > span")
    public WebElement blackBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(4) > label > span")
    public WebElement redBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(5) > label > span")
    public WebElement blueBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(6) > label > span")
    public WebElement greenBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(7) > label > span")
    public WebElement yellowBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(8) > label > span")
    public WebElement pinkBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(9) > label > span")
    public WebElement brownBtn;
    @FindBy(how = How.CSS, using = "#colors-wrapper")
    public WebElement colorFilter;
    @FindBy(how = How.CSS, using = "#work-model-filters > li:nth-child(1) > span > label")
    public WebElement videoConferenceBtn;
    @FindBy(how = How.CSS, using = "#work-model-filters > li:nth-child(2) > span > label")
    public WebElement inPersonBtn;
    @FindBy(how = How.CSS, using = "#work-model-holder > div")
    public WebElement workModelText;
    @FindBy(how = How.CSS, using = "#manual-max")
    public WebElement maxPriceField;
    @FindBy(how = How.CSS, using = "#manual-min")
    public WebElement minPriceField;
    @FindBy(how = How.CSS, using = "#set-up-manually-btn")
    public WebElement applyFilterPriceBtn;
    @FindBy(how = How.CSS, using = "#filters-container > div:nth-child(6)")
    public WebElement validatePriceSection;
    @FindBy(how = How.CSS, using = "#search")
    public WebElement searchField;
    @FindBy(how = How.CSS, using = "#listing-name-0")
    public WebElement productTest22;

    public void listingValidation() {
        fluentWait(getDriver(), listingValidate);
        Assert.assertTrue(listingValidate.isDisplayed());
    }

    public void selectPurple() {
        fluentWait(getDriver(), purpleBtn);
        waitForWebElementAndClick(purpleBtn);
    }

    public void selectLightBlue() {
        fluentWait(getDriver(), lightBlueBtn);
        waitForWebElementAndClick(lightBlueBtn);
    }

    public void selectBlack() {
        fluentWait(getDriver(), blackBtn);
        waitForWebElementAndClick(blackBtn);
    }

    public void selectRed() {
        fluentWait(getDriver(), redBtn);
        waitForWebElementAndClick(redBtn);
    }

    public void selectBlue() {
        fluentWait(getDriver(), blueBtn);
        waitForWebElementAndClick(blueBtn);
    }

    public void selectGreen() {
        fluentWait(getDriver(), greenBtn);
        waitForWebElementAndClick(greenBtn);
    }

    public void selectYellow() {
        fluentWait(getDriver(), yellowBtn);
        waitForWebElementAndClick(yellowBtn);
    }

    public void selectPink() {
        fluentWait(getDriver(), pinkBtn);
        waitForWebElementAndClick(pinkBtn);
    }

    public void selectBrown() {
        fluentWait(getDriver(), brownBtn);
        waitForWebElementAndClick(brownBtn);
    }

    public void validColorFilterSection() {
        fluentWait(getDriver(), colorFilter);
        Assert.assertTrue(colorFilter.isDisplayed());
    }

    public void VideoConferenceFilter() {
        fluentWait(getDriver(), videoConferenceBtn);
        waitForWebElementAndClick(videoConferenceBtn);
    }

    public void inPersonFilter() {
        fluentWait(getDriver(), inPersonBtn);
        waitForWebElementAndClick(inPersonBtn);
    }

    public String validateWorkModelSector() {
        fluentWait(getDriver(), workModelText);
        String result = workModelText.getText();
        return result;
    }

    public void maxPriceFilter() {
        fluentWait(getDriver(), maxPriceField);
        waitForWebElementAndClick(maxPriceField);
        maxPriceField.clear();
        maxPriceField.sendKeys("1000");

    }

    public void minPriceFilter() {
        fluentWait(getDriver(), minPriceField);
        waitForWebElementAndClick(minPriceField);
        minPriceField.clear();
        minPriceField.sendKeys("1");

    }

    public void applyFilterPrice() {
        fluentWait(getDriver(), applyFilterPriceBtn);
        waitForWebElementAndClick(applyFilterPriceBtn);
    }

    public void validatePriceFilter() {
        fluentWait(getDriver(), validatePriceSection);
        Assert.assertTrue(validatePriceSection.isDisplayed());

    }

    public void searchProduct() {
        try {
            fluentWait(getDriver(), searchField);
            waitForWebElementAndClick(searchField);
            searchField.sendKeys("test22");
            searchField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), searchField);
            waitForWebElementAndClick(searchField);
            searchField.sendKeys("test22");
            searchField.sendKeys(Keys.ENTER);
        }
    }

    public String validateDesiredProduct() {
        fluentWait(getDriver(), productTest22);
        String result = productTest22.getText();
        return result;
    }
}
