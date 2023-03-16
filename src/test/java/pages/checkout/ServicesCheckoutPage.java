package pages.checkout;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class ServicesCheckoutPage extends BasePage {


    public ServicesCheckoutPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());

    //login
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    //Class
    @FindBy(how = How.CSS, using = "#hire-btn")
    public WebElement hireBtn;
    @FindBy(how = How.CSS, using = "#form-hire > div.form-group.mb-3 > label:nth-child(2)")
    public WebElement flatFleeBtn;
    //Hourly
    @FindBy(how = How.CSS, using = "#hourly-deadline")
    public WebElement dateField;
    @FindBy(how = How.CSS, using = "#hourly-end")
    public WebElement endTimeOptionBtn;
    @FindBy(how = How.CSS, using = "#hourly-end")
    public WebElement endTimeOptionValueBtn;
    @FindBy(how = How.CSS, using = "#form-hire > div:nth-child(7) > textarea")
    public WebElement messageTextField;
    @FindBy(how = How.CSS, using = "#modal-hire-btn")
    public WebElement hireAcceptBtn;
    //Credit Card
    @FindBy(how = How.CSS, using = "#back-cont > a")
    public WebElement backToMyCartBtn;
    @FindBy(how = How.CSS, using = "#card-number")
    public WebElement cardNumberTextField;
    @FindBy(how = How.CSS, using = "#card-name")
    public WebElement nameCardTextField;
    @FindBy(how = How.CSS, using = "#expiry-date")
    public WebElement expirationDateTextField;
    @FindBy(how = How.CSS, using = "#card-cvc")
    public WebElement CVVCodeTextField;
    @FindBy(how = How.CSS, using = "#left-column > div > div.card.card-shopping > div > div.d-flex.align-items-center.mt-2 > label.switch.mr-2 > span:nth-child(2)")
    public WebElement saveCreditCheckboxBtn;
    @FindBy(how = How.CSS, using = "#prepare-checkout > span")
    public WebElement submitPaymentBtn;

    @FindBy(xpath = "//a[contains(text(), 'Book an interview')]")
    public WebElement validatingTextUser;

    @FindBy(xpath = "//span[contains(text(), 'You’ll be able to book all the classes after payment is made')]")
    public WebElement validatingHireTextBox;

    @FindBy(how = How.CSS, using = "#form-hire > div.form-group.mb-3 > label:nth-child(4)")
    public WebElement hourlyCheck;

    @FindBy(how = How.CSS, using = "#listing-img-0")
    public WebElement selectClass;

    @FindBy(xpath = "/html/body/div[4]/main/section[2]/div/div/div/form/div[3]/div[3]/div/s<elect/option[6]")
    public WebElement selectingEndingHour;

    public void selectClassFromListing(){
        fluentWait(getDriver(), selectClass);
        waitForWebElementAndClick(selectClass);
    }
    public void hourlyCheckBox() {
        fluentWait(getDriver(), hourlyCheck);
        waitForWebElementAndClick(hourlyCheck);
    }

    public boolean validateHireTextBox() {
        fluentWaitStrict(getDriver(), validatingHireTextBox);
        boolean result = validatingHireTextBox.isDisplayed();
        return result;
    }

    public boolean validateTextUser() {
        fluentWaitStrict(getDriver(), validatingTextUser);
        boolean result = validatingTextUser.isDisplayed();
        return result;
    }

    public void goToLogin() {
        getDriver().navigate().to(UrlSVC + "/Account/Login");
    }

    public void goToSvcPage() {
        getDriver().navigate().to(UrlSVC);
    }

    public void goToAClass() {
        getDriver().navigate().to(UrlSVC + "Listing/Browse");
        fluentWait(getDriver(), selectClass);
        waitForWebElementAndClick(selectClass);
    }

    public void selectHireBtn() {
        try {
            fluentWaitStrict(getDriver(), hireBtn);
            waitForWebElementAndClick(hireBtn);
        }catch(Exception e){
            fluentWaitStrict(getDriver(), hireBtn);
            actions.doubleClick(hireBtn);
        }

    }

    public void selectFlatFleeBtn() {
        fluentWait(getDriver(), flatFleeBtn);
        waitForWebElementAndClick(flatFleeBtn);
    }

    public void typeDate() {
        fluentWait(getDriver(), dateField);
        waitForWebElementAndClick(dateField);
        dateField.clear();
        waitForWebElementAndClick(dateField);
        dateField.sendKeys(Keys.ARROW_LEFT);
        dateField.sendKeys("06-14-2023");
    }

    public void selectEndTime() {
        fluentWait(getDriver(), endTimeOptionBtn);
        waitForWebElementAndClick(endTimeOptionBtn);
    }

    public void selectEndHour() {
        {
            try {
                fluentWait(getDriver(), endTimeOptionValueBtn);
                waitForWebElementAndClick(endTimeOptionValueBtn);

                fluentWait(getDriver(), selectingEndingHour);
                waitForWebElementAndClick(selectingEndingHour);
            }catch (Exception e){
                retryingFindClick(endTimeOptionBtn);
                fluentWait(getDriver(), selectingEndingHour);
                waitForWebElementAndClick(selectingEndingHour);
            }
        }

    }

    public void messageField() {
        fluentWait(getDriver(), messageTextField);
        waitForWebElementAndClick(messageTextField);
        messageTextField.sendKeys("Automation Test");

    }

    public void acceptHire() {
        fluentWait(getDriver(), hireAcceptBtn);
        waitForWebElementAndClick(hireAcceptBtn);
    }

    public void goBackToMyCartBtn() {
        fluentWait(getDriver(), backToMyCartBtn);
        waitForWebElementAndClick(backToMyCartBtn);
    }

    public void cardNumberField() {
        fluentWait(getDriver(), cardNumberTextField);
        waitForWebElementAndClick(cardNumberTextField);
        cardNumberTextField.sendKeys("424242424242");
    }

    public void nameOnCardTextField() {
        fluentWait(getDriver(), nameCardTextField);
        waitForWebElementAndClick(nameCardTextField);
        nameCardTextField.sendKeys("Michael Test");
    }

    public void expirationDate() {
        fluentWait(getDriver(), expirationDateTextField);
        waitForWebElementAndClick(expirationDateTextField);
        expirationDateTextField.sendKeys("0528");
    }

    public void cvvCode() {
        fluentWait(getDriver(), CVVCodeTextField);
        waitForWebElementAndClick(CVVCodeTextField);
        CVVCodeTextField.sendKeys(Keys.ARROW_LEFT);
        CVVCodeTextField.sendKeys("333");
    }

    public void saveCreditCard() {
        fluentWait(getDriver(), saveCreditCheckboxBtn);
        waitForWebElementAndClick(saveCreditCheckboxBtn);
    }

    public void submitPayment() {
        fluentWait(getDriver(), submitPaymentBtn);
        waitForWebElementAndClick(submitPaymentBtn);
    }
}