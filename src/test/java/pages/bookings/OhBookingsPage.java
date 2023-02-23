package pages.bookings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class OhBookingsPage extends BasePage {


    public OhBookingsPage() {
        super();
    }


    Actions action = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());
    //LOGIN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    //Dashboard
    @FindBy(how = How.CSS, using = "#booking-tab")
    public WebElement bookingsBtn;
    @FindBy(how = How.CSS, using = "#calendar-tab")
    public WebElement calendarBtn;
    @FindBy(how = How.CSS, using = "#tab-all > span > span:nth-child(1)")
    public WebElement allCalendarsBtn;
    @FindBy(how = How.CSS, using = "#sidebar-provider > li:nth-child(4) > a > span")
    public WebElement mathClassesCalendarBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/section/div/div/div[1]/div[1]/div/ul/li[3]/a")
    public WebElement testCalendarBtn;
    @FindBy(how = How.CSS, using = "#bookings-tab > span")
    public WebElement myBookingsBtn;
    @FindBy(how = How.CSS, using = "#calendar > div:nth-child(2) > div.col-auto.ml-auto > button")
    public WebElement todayBtn;
    @FindBy(how = How.CSS, using = "#calendar > div:nth-child(2) > div.col-auto.ml-auto > div > button.fc-prev-button.btn.btn-primary")
    public WebElement previousDayBtn;
    @FindBy(how = How.CSS, using = "#calendar > div:nth-child(2) > div.col-auto.ml-auto > div > button.fc-next-button.btn.btn-primary")
    public WebElement nextDayBtn;
    //Validate
    @FindBy(how = How.CSS, using = "#fullcalendar > div.fc-view-harness.fc-view-harness-passive > div > table")
    public WebElement calendarTableVerify;
    @FindBy(how = How.CSS, using = "#bookings > div > div > div > div.table-responsive > table")
    public WebElement myBookingsTableVerify;

    public void oheHomePage(){
        getDriver().navigate().to(baseUrlOHE);
    }

    public void goToOheLoginPage(){
        getDriver().navigate().to(baseUrlOHE+"/Account/Login");
    }

    public void goToOheDashboard() {
        getDriver().navigate().to(baseUrlOHE+"/dashboard");
    }

    public void bookingsButton() {
        waitForClickability(bookingsBtn);
        bookingsBtn.click();
    }

    public void reloadBookings() {
        getDriver().navigate().to(baseUrlOHE+"/dashboard/bookings");
    }

    public void calendarButton() {
        waitForClickability(calendarBtn);
        calendarBtn.click();
    }

    public void allCalendarButton() {
        getDriver().navigate().to(baseUrlOHE+"/dashboard/bookings");
        //driver.manage().window().maximize();
        
        getDriver().navigate().to(baseUrlOHE+"/dashboard/bookings");
        allCalendarsBtn.click();
    }

    public void mathClassesCalendarButton(){
        waitForVisibility(mathClassesCalendarBtn);
        waitForClickability(mathClassesCalendarBtn);

        fluentWait(getDriver(), mathClassesCalendarBtn);
        waitForWebElementAndClick(mathClassesCalendarBtn);
    }

    public void testCalendarButton(){
        waitForClickability(testCalendarBtn);
        fluentWait(getDriver(), testCalendarBtn);
        waitForWebElementAndClick(testCalendarBtn);
    }

    public void myBookingsOption(){
        waitForClickability(myBookingsBtn);
        fluentWait(getDriver(), myBookingsBtn);
        waitForWebElementAndClick(myBookingsBtn);
    }

    public void todayButton(){
        waitForClickability(todayBtn);
        fluentWait(getDriver(), todayBtn);
        waitForWebElementAndClick(todayBtn);
    }

    public void previousDayButton(){
        waitForClickability(previousDayBtn);
        fluentWait(getDriver(), previousDayBtn);
        waitForWebElementAndClick(previousDayBtn);
    }

    public void nextDayButton(){
        waitForClickability(nextDayBtn);
        fluentWait(getDriver(), nextDayBtn);
        waitForWebElementAndClick(nextDayBtn);
    }

    public boolean calendarVerify(){
        fluentWait(getDriver(), calendarTableVerify);
        boolean result = calendarTableVerify.isDisplayed();
        return result;
    }

    public boolean myBookingVerify(){
        fluentWait(getDriver(), myBookingsTableVerify);
        boolean result = myBookingsTableVerify.isDisplayed();
        return result;
    }
}
