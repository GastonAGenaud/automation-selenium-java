package pages.dashboard;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;


public class SvcDashboardPage extends BasePage {

    public SvcDashboardPage() {
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
    //Customer Section
    @FindBy(how = How.CSS, using = "#buyer-tab > span")
    public WebElement customerBtn;
    @FindBy(how = How.CSS, using = "#settings-tab > span > span:nth-child(1)")
    public WebElement mySettingsBtn;
    @FindBy(how = How.CSS, using = "#buyer > div > div:nth-child(1) > div.card.card-dashboard.min-h-12.card__flex__grow.mb-3.mb-xl-0 > div > div.d-flex.justify-content-between.align-items-center.mb-2 > span:nth-child(2) > a")
    public WebElement seeAllMostPopularBtn;
    @FindBy(how = How.CSS, using = "#buyer > div > div:nth-child(2) > div > div > div.d-flex.justify-content-between.align-items-center.mb-2 > span:nth-child(2) > a")
    public WebElement seeAllMyOrdersBtn;
    @FindBy(how = How.CSS, using = "#calendar-container-seeker > div > div.d-flex.justify-content-between.align-items-center.mb-2 > span:nth-child(2) > a")
    public WebElement goToMyCalendarBtn;
    @FindBy(how = How.CSS, using = "#dashboard-messages > div > span:nth-child(2) > a")
    public WebElement seeAllMessagesBtn;
    @FindBy(how = How.CSS, using = "#buyer > div > div:nth-child(3) > div.card.card-dashboard.mb-3.mb-lg-0.min-h-12 > div > div > a")
    public WebElement createAWantBtn;
    //Provider
    @FindBy(how = How.CSS, using = "#details-tab")
    public WebElement providerBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(1) > div.card.card-dashboard.min-h-12.mb-3 > div > div.d-flex.justify-content-between.align-items-center.mb-2 > div > button > span")
    public WebElement sortStatsDropdown;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(1) > div.card.card-dashboard.min-h-12.mb-3 > div > div.d-flex.justify-content-between.align-items-center.mb-2 > div > div > a:nth-child(1)")
    public WebElement last7DaysBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(1) > div.card.card-dashboard.min-h-12.mb-3 > div > div.d-flex.justify-content-between.align-items-center.mb-2 > div > div > a:nth-child(2)")
    public WebElement last30DaysBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(1) > div.card.card-dashboard.min-h-12.mb-3 > div > div.d-flex.justify-content-between.align-items-center.mb-2 > div > div > a:nth-child(3)")
    public WebElement last90DaysBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(1) > div.card.card-dashboard.mb-3.mb-xl-0.min-h-16 > div > div.d-flex.justify-content-between.align-items-center.mb-2 > span:nth-child(2) > a")
    public WebElement seeAllLatestReviewsBtn;
    @FindBy(how = How.CSS, using = "#reviews-holder > div > a")
    public WebElement invitePeopleBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(2) > div > div > div.d-flex.justify-content-between.align-items-center.mb-2 > span:nth-child(2) > a")
    public WebElement seeAllMySalesBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(2) > div > div > div.d-flex.justify-content-center > a")
    public WebElement createANewListingBtn;
    @FindBy(how = How.CSS, using = "#dashboard-seller-messages > div > span:nth-child(2) > a")
    public WebElement providerSeeAllMessagesBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(3) > div.card.card-dashboard.min-h-12.card__flex__grow.mb-3.mb-lg-0 > div > div.d-flex.justify-content-between.align-items-center.mb-2 > span:nth-child(2) > a")
    public WebElement providerGoToMyCalendarBtn;

    //LOGIN

    public void goToLoginPage() {
        getDriver().navigate().to(UrlSVC + "/Account/Login");
    }

    public void goToDashboard() {
        getDriver().navigate().to(UrlSVC + "/dashboard");
    }

    //CUSTOMER
    public void selectCustomer() {
        fluentWait(getDriver(), customerBtn);
        waitForWebElementAndClick(customerBtn);
    }

    public void selectMySettings() {
        fluentWait(getDriver(), mySettingsBtn);
        waitForWebElementAndClick(mySettingsBtn);
    }

    public void selectMostPopular() {
        waitForVisibility(seeAllMostPopularBtn);
        fluentWait(getDriver(), seeAllMostPopularBtn);
        waitForWebElementAndClick(seeAllMostPopularBtn);
    }

    public void selectMyOrders() {
        waitForVisibility(seeAllMyOrdersBtn);
        waitForClickability(seeAllMyOrdersBtn);
        fluentWait(getDriver(), seeAllMyOrdersBtn);
        waitForWebElementAndClick(seeAllMyOrdersBtn);
    }

    public void selectMyCalendar() {
        fluentWait(getDriver(), goToMyCalendarBtn);
        waitForWebElementAndClick(goToMyCalendarBtn);
    }

    public void selectAllMessages() {
        fluentWait(getDriver(), seeAllMessagesBtn);
        waitForWebElementAndClick(seeAllMessagesBtn);
    }

    public void selectCreateAWant() {
        fluentWait(getDriver(), createAWantBtn);
        waitForWebElementAndClick(createAWantBtn);
    }

    //Provider
    public void selectProvider() {
        fluentWait(getDriver(), providerBtn);
        waitForWebElementAndClick(providerBtn);
    }

    public void selectLatestReviews() {
        fluentWait(getDriver(), seeAllLatestReviewsBtn);
        waitForWebElementAndClick(seeAllLatestReviewsBtn);
    }

    public void selectInvitePeople() {
        fluentWait(getDriver(), invitePeopleBtn);
        waitForWebElementAndClick(invitePeopleBtn);
    }

    public void selectMySales() {
        fluentWait(getDriver(), seeAllMySalesBtn);
        waitForWebElementAndClick(seeAllMySalesBtn);
    }

    public void selectNewListing() {
        fluentWait(getDriver(), createANewListingBtn);
        waitForWebElementAndClick(createANewListingBtn);
    }

    public void selectProviderMessages() {
        fluentWait(getDriver(), providerSeeAllMessagesBtn);
        waitForWebElementAndClick(providerSeeAllMessagesBtn);
    }

    public void selectGoToMyCalendar() {
        fluentWait(getDriver(), providerGoToMyCalendarBtn);
        waitForWebElementAndClick(providerGoToMyCalendarBtn);
    }

    //Verify
    public boolean customerValidate() {
        fluentWait(getDriver(), customerBtn);
        boolean result = customerBtn.isDisplayed();
        return result;
    }

    public boolean providerValidate() {
        fluentWait(getDriver(), providerBtn);
        boolean result = providerBtn.isDisplayed();
        return result;
    }
}