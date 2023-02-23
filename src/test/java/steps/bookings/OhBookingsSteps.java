package steps.bookings;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.bookings.OhBookingsPage;


public class OhBookingsSteps extends BasePage {

    private OhBookingsPage _page;

    public OhBookingsSteps() {

        this._page = new OhBookingsPage();

    }

    @Given("I go to dashboard page")
    public void iGoToDashboardPage(){
        _page.oheHomePage();
        _page.goToOheLoginPage();
        _page.login();
        _page.goToOheDashboard();
    }

    @When("I select bookings")
    public void iSelectBookings() {
        _page.bookingsButton();
        _page.reloadBookings();
        _page.reloadBookings();
    }

    @And("I select All calendars")
    public void iSelectAllCalendars() {
        _page.calendarButton();
        _page.allCalendarButton();
    }

    @And("I select Math Classes calendar")
    public void iSelectMathClassesCalendar() {
        _page.mathClassesCalendarButton();
    }

    @And("I select Test calendar")
    public void iSelectTestCalendar() {
        _page.testCalendarButton();
    }

    @And("I select today button")
    public void iSelectTodayButton() {
        _page.todayButton();
    }

    @And("I select the back button")
    public void iSelectTheBackButton() {
        _page.previousDayButton();
    }

    @And("I select the forward button")
    public void iSelectTheForwardButton() {
        _page.nextDayButton();
    }

    @Then("I validate the bookings calendar section")
    public void iValidateTheBookingsCalendarSection() {
        Assert.assertEquals(_page.calendarVerify(),true);
    }

    @And("I select My bookings")
    public void iSelectMyBookings() {
        _page.myBookingsOption();
    }

    @Then("I validate the My bookings section")
    public void iValidateTheMyBookingsSection() {
        Assert.assertEquals(_page.myBookingVerify(), true);
    }
}
