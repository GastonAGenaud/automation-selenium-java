package pages.developmentServices;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;


public class BrowseBySellerDevPage extends BasePage {

    public BrowseBySellerDevPage() {
        super();
    }


    @FindBy(xpath = "//a[contains(text(), 'Graphics & Design')]")
    public WebElement graphicsDesignBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(2) > span > label")
    public WebElement marketingBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(3) > span > label")
    public WebElement programmingTechBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(4) > span > label")
    public WebElement testingCategoryBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(5) > span > label")
    public WebElement softwareBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(6) > span > label")
    public WebElement technologyBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(7) > span > label")
    public WebElement photographyBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(8) > span > label")
    public WebElement businessBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > h3")
    public WebElement categoryText;
    @FindBy(xpath = "//*[contains(text(), 'Show more')]")
    public WebElement showMoreText;
    @FindBy(how = How.CSS, using = "#filters-container > div.mb-4.location-cont.pt-3")
    public WebElement locationSection;
    @FindBy(how = How.CSS, using = "#location")
    public WebElement locationField;

    public void goToBrowseBySeller() {
        getDriver().navigate().to(UrlDevServices + "Listing/BrowseBySeller");
    }

    public void graphicsDesignFilter() {
        try {
            fluentWait(getDriver(), graphicsDesignBtn);
            waitForWebElementAndClick(graphicsDesignBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), graphicsDesignBtn);
            waitForWebElementAndClick(graphicsDesignBtn);
        }

    }

    public void marketingFilter() {
        fluentWait(getDriver(), marketingBtn);
        waitForWebElementAndClick(marketingBtn);
    }

    public void programmingTechFilter() {
        fluentWait(getDriver(), programmingTechBtn);
        waitForWebElementAndClick(programmingTechBtn);
    }

    public void testingCategoryFilter() {
        fluentWait(getDriver(), testingCategoryBtn);
        waitForWebElementAndClick(testingCategoryBtn);
    }

    public void softwareFilter() {
        fluentWait(getDriver(), softwareBtn);
        waitForWebElementAndClick(softwareBtn);
    }

    public void technologyFilter() {
        fluentWait(getDriver(), technologyBtn);
        waitForWebElementAndClick(technologyBtn);
    }

    public void businessFilter() {
        fluentWait(getDriver(), businessBtn);
        waitForWebElementAndClick(businessBtn);
    }

    public void photographyFilter() {
        fluentWait(getDriver(), photographyBtn);
        waitForWebElementAndClick(photographyBtn);
    }

    public void shoreMoreSection() {
        try {
            fluentWait(getDriver(), showMoreText);
            waitForWebElementAndClick(showMoreText);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), showMoreText);
            waitForWebElementAndClick(showMoreText);
        }
    }

    public String validateFilterSector() {
        fluentWait(getDriver(), categoryText);
        String result = categoryText.getText();
        return result;
    }

    public void locationText() {
        fluentWait(getDriver(), locationField);
        locationField.sendKeys("2405 Montopolis Drive, Austin, TX, USA");
        locationField.sendKeys(Keys.ARROW_DOWN);
        locationField.sendKeys(Keys.ENTER);
    }

    public void validateLocationSection() {
        fluentWait(getDriver(), locationSection);
        Assert.assertTrue(locationSection.isDisplayed());
    }

}
