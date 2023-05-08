package pages.developmentServices;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;


public class BrowseWantsDevPage extends BasePage {
    public BrowseWantsDevPage() {
        super();
    }

    @FindBy(how = How.CSS, using = "#filters-container > div:nth-child(4) > div.mb-4.mt-3.browse-price-manual-component > div > a")
    public WebElement applyFilterPriceButton;
    @FindBy(how = How.CSS, using = "#filters-container > div:nth-child(4)")
    public WebElement validatePriceSectionRequest;

    public void goToBrowseRequestServ() {
        getDriver().navigate().to(UrlDevServices + "Want/browse");
    }

    public void selectApplyButton() {
        fluentWait(getDriver(), applyFilterPriceButton);
        waitForWebElementAndClick(applyFilterPriceButton);
    }

    public void validatePriceFilterSectionRequest() {
        fluentWait(getDriver(), validatePriceSectionRequest);
        Assert.assertTrue(validatePriceSectionRequest.isDisplayed());
    }
}
