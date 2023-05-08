package pages.developmentServices;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pages.BasePage;



public class CheckoutDevPage extends BasePage {
    public CheckoutDevPage() {
        super();
    }

    @FindBy(how = How.CSS, using = "#browse-header-text-customize")
    public WebElement BrowseServicesBtn;
    @FindBy(how = How.CSS, using = "#hire-btn")
    public WebElement hireBtn;
    @FindBy(how = How.CSS, using = "#check-flat")
    public WebElement fleeFlatBtn;
    @FindBy(how = How.CSS, using = "#hire-modal > div > div > div")
    public WebElement validateHireBox;
    @FindBy(how = How.CSS, using = "#flatfee-deadline")
    public WebElement DeadlineField;
    @FindBy(how = How.CSS, using = "#form-hire > div:nth-child(7) > textarea")
    public WebElement descriptionField;
    @FindBy(how = How.CSS, using = "#modal-hire-btn")
    public WebElement hireSubmitBtn;

    public void goToBrowseService() {
        try {
            fluentWait(getDriver(), BrowseServicesBtn);
            waitForWebElementAndClick(BrowseServicesBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), BrowseServicesBtn);
            waitForWebElementAndClick(BrowseServicesBtn);
        }
    }

    public void enterClassesValet() {
        getDriver().navigate().to(UrlDevServices + "Listing/DetailService/252");
    }

    public void hireTheService() {
        try {
            fluentWait(getDriver(), hireBtn);
            waitForWebElementAndClick(hireBtn);
            //fluentWait(getDriver(), DeadlineField);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), hireBtn);
            waitForWebElementAndClick(hireBtn);
        }
    }

    public void hireBoxValidate() {
        wait(4);
        fluentWait(getDriver(), validateHireBox);
        validateHireBox.isDisplayed();
    }

    public void fleeFlatCheckbox() {
        fluentWait(getDriver(), fleeFlatBtn);
        waitForWebElementAndClick(fleeFlatBtn);
    }

    public void enterDeadline() {
        try {
            fluentWait(getDriver(), DeadlineField);
            waitForWebElementAndClick(DeadlineField);
            DeadlineField.sendKeys("10/12/2023");
            DeadlineField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), DeadlineField);
            waitForWebElementAndClick(DeadlineField);
            DeadlineField.sendKeys("10/12/2023");
            DeadlineField.sendKeys(Keys.ENTER);
        }
    }

    public void enterDescription() {
        try {
            fluentWait(getDriver(), descriptionField);
            waitForWebElementAndClick(descriptionField);
            descriptionField.sendKeys("text");
            descriptionField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), descriptionField);
            waitForWebElementAndClick(descriptionField);
            descriptionField.sendKeys("text");
            descriptionField.sendKeys(Keys.ENTER);
        }
    }

    public void enterHire() {
        try {
            fluentWaitStrict(getDriver(), hireSubmitBtn);
            waitForWebElementAndClick(hireSubmitBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), hireSubmitBtn);
            waitForWebElementAndClick(hireSubmitBtn);
        }
    }
}
