package pages.ItemApprove;

import org.apache.http.util.Asserts;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;

public class ItemApprovePage extends BasePage {

    public ItemApprovePage() {
        super();
    }

    Actions actions = new Actions(getDriver());


//ItemApprove

    @FindBy(how = How.CSS, using = "#approve-item-tab")
    public WebElement approveTab;

    @FindBy(how = How.CSS, using = "#approved-tab > span > span:nth-child(1)")
    public WebElement approveTabText;

    @FindBy(how = How.CSS, using = "#pending-tab > span > span:nth-child(1)")
    public WebElement pendingTabText;

    @FindBy(how = How.CSS, using = "#rejected-tab > span > span:nth-child(1)")
    public WebElement rejectedTabText;

    @FindBy(how = How.CSS, using = "#item-1051 > div > div.col-7.col-md-8.col-lg-9 > div > div:nth-child(1) > div.col > label")
    public WebElement hottestItemsText;

    @FindBy(how = How.CSS, using = "#\\31 051-name")
    public WebElement listingItemText;

    @FindBy(how = How.CSS, using = "#item-1051 > div > div.col-7.col-md-8.col-lg-9 > div > div:nth-child(2) > div:nth-child(2) > p")
    public WebElement soldByTxt;

    @FindBy(how = How.CSS, using = "#item-1051 > div > div.col-7.col-md-8.col-lg-9 > div > div:nth-child(2) > div:nth-child(2) > div > p")
    public WebElement gastonItemText;

    @FindBy(how = How.CSS, using = "#item-1051 > div > div.col-5.col-md-4.col-lg-3.border-right.pr-0.ftContainer.overflow-hidden")
    public WebElement itemImage;

    @FindBy(how = How.CSS, using = "#item-1051 > div > div.col-7.col-md-8.col-lg-9 > div > div:nth-child(3) > div:nth-child(1) > label")
    public WebElement starsIcon;

    @FindBy(how = How.CSS, using = "#item-1051 > div > div.col-7.col-md-8.col-lg-9 > div > div:nth-child(1) > div.col-auto.text-right > div > button > i")
    public WebElement threeDots;

    @FindBy(how = How.CSS, using = "#item-1051 > div > div.col-7.col-md-8.col-lg-9 > div > div:nth-child(3) > div:nth-child(2) > label")
    public WebElement priceNumbers;

    @FindBy(how = How.CSS, using = "#listings-approval-container > div.row.mb-4")
    public WebElement approveSector;

    public void approveSectorValidated(){
        fluentWait(getDriver(), approveSector);
        Assert.assertTrue(approveSector.isDisplayed());
    }

    public void priceDisplayed(){
        fluentWait(getDriver(), priceNumbers);
        Assert.assertTrue(priceNumbers.isDisplayed());
    }

    public void DotsDisplayed(){
        fluentWait(getDriver(), threeDots);
        Assert.assertTrue(threeDots.isDisplayed());
    }

    public void fiveStars(){
        fluentWait(getDriver(), starsIcon);
        Assert.assertTrue(starsIcon.isDisplayed());
    }

    public void ItemImg(){
        //fluentWait(getDriver(), itemImage);
        Assert.assertTrue(itemImage.isDisplayed());
    }

    public void gastonItemTxt(){
        fluentWait(getDriver(), gastonItemText);
        Assert.assertTrue(gastonItemText.isDisplayed());
        Assert.assertEquals(gastonItemText.getText(), "gastongenaud_AutomationTest");

    }
    public void soldByText(){
        fluentWait(getDriver(), soldByTxt);
        Assert.assertTrue(soldByTxt.isDisplayed());
        Assert.assertEquals(soldByTxt.getText(), "Sold by");
    }

    public void listingText(){
        fluentWait(getDriver(), listingItemText);
        Assert.assertTrue(listingItemText.isDisplayed(), "Listing HI");
    }

    public void  hottestText(){
        fluentWait(getDriver(), hottestItemsText);
        Assert.assertTrue(hottestItemsText.isDisplayed(), "Hottest Items");
    }


    public void rejectedText(){
        fluentWait(getDriver(), rejectedTabText);
        Assert.assertTrue(rejectedTabText.isDisplayed());
        Assert.assertEquals(rejectedTabText.getText(), "Rejected");
    }

    public void pendingText(){
        fluentWait(getDriver(), pendingTabText);
        Assert.assertTrue(pendingTabText.isDisplayed());
        Assert.assertEquals(pendingTabText.getText(), "Pending");
    }

    public void approveTab(){
        try {
            waitForVisibility(approveTab);
            fluentWait(getDriver(), approveTab);
            waitForWebElementAndClick(approveTab);
        }
        catch(Exception e){
            wait(3);
            fluentWait(getDriver(), approveTab);
            waitForWebElementAndClick(approveTab);
        }

    }

    public void approveText() {
        fluentWait(getDriver(), approveTabText                                                                                                                              );
        Assert.assertTrue(approveTabText.isDisplayed());
        Assert.assertEquals(approveTabText.getText(), "Approved");
    }


}


