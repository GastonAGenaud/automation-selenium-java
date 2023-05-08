package pages.developmentServices;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;


public class RequestAQuoteDevPage extends BasePage {
    public RequestAQuoteDevPage() {
        super();
    }

    @FindBy(how = How.CSS, using = "#want-container > a:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > p")
    public WebElement selectRequest;
    @FindBy(how = How.CSS, using = "#btn-apply")
    public WebElement selectApply;
    @FindBy(how = How.CSS, using = "#supply-apply-form > div:nth-child(6) > textarea")
    public WebElement messageField;
    @FindBy(how = How.CSS, using = "#supply-date")
    public WebElement startDateField;
    @FindBy(how = How.CSS, using = "#btn-supply-apply")
    public WebElement applyBtn;
    @FindBy(how = How.CSS, using = "#supply-endtime")
    public WebElement endTimeField;
    @FindBy(how = How.CSS, using = "#supply-endtime > option:nth-child(3)")
    public WebElement endTimeOption;

    public void selectTheRequest() {
        try {
            fluentWait(getDriver(), selectRequest);
            waitForWebElementAndClick(selectRequest);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), selectRequest);
            waitForWebElementAndClick(selectRequest);
        }
    }

    public void selectApply() {
        try {
            fluentWait(getDriver(), selectApply);
            waitForWebElementAndClick(selectApply);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), selectApply);
            waitForWebElementAndClick(selectApply);
        }
    }

    public void enterMessage() {
        try {
            fluentWait(getDriver(), messageField);
            waitForWebElementAndClick(messageField);
            messageField.clear();
            messageField.sendKeys("Test");
            messageField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), messageField);
            waitForWebElementAndClick(messageField);
            messageField.clear();
            messageField.sendKeys("Test");
            messageField.sendKeys(Keys.ENTER);
        }
    }

    public void enterStartDate() {
        try {
            fluentWait(getDriver(), startDateField);
            waitForWebElementAndClick(startDateField);
            startDateField.clear();
            startDateField.sendKeys("05/29/2023");
            startDateField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), startDateField);
            waitForWebElementAndClick(startDateField);
            startDateField.clear();
            startDateField.sendKeys("05/29/2023");
            startDateField.sendKeys(Keys.ENTER);
        }
    }

    public void endTimeField() {
        try {
            fluentWait(getDriver(), endTimeField);
            waitForWebElementAndClick(endTimeField);
            fluentWait(getDriver(), endTimeOption);
            waitForWebElementAndClick(endTimeOption);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), endTimeField);
            waitForWebElementAndClick(endTimeField);
            fluentWait(getDriver(), endTimeOption);
            waitForWebElementAndClick(endTimeOption);
        }
    }

    public void applyField() {
        try {
            fluentWait(getDriver(), applyBtn);
            waitForWebElementAndClick(applyBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), applyBtn);
            waitForWebElementAndClick(applyBtn);
        }
    }

}
