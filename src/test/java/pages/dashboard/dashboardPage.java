package pages.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class dashboardPage extends BasePage {


    public dashboardPage() {
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
    //Buyer
    @FindBy(how = How.CSS, using = "#buyer > div > div:nth-child(1) > div.card.card-dashboard.min-h-16.mb-3 > div > div.flex-column.text-center > a")
    public WebElement mySettingsBtn;
    @FindBy(how = How.CSS, using = "#products-carousel > a.carousel-control-next.cl-primary")
    public WebElement carouselNextBtn;
    @FindBy(how = How.CSS, using = "#products-carousel > a.carousel-control-prev.cl-primary")
    public WebElement carouselPreviousBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[2]/div/div/div[2]/a[1]/div/div/div[2]/div/h5")
    public WebElement myOrdersBtn;
    @FindBy(how = How.CSS, using = "#dashboard-messages > a:nth-child(2) > div")
    public WebElement buyersMessagesBtn;
    @FindBy(how = How.CSS, using = "#buyer > div > div:nth-child(3) > div.card.card-dashboard.mb-3.mb-lg-0.min-h-12 > div > div > a")
    public WebElement createARequestBtn;
    //Seller
    @FindBy(how = How.CSS, using = "#details-tab > span")
    public WebElement sellerBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div[4]/div[1]/div[1]/div/div[1]/div/button")
    public WebElement lastDaysBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(1) > div.card.card-dashboard.min-h-12.mb-3 > div > div.d-flex.justify-content-between.align-items-center.mb-2 > div > div > a:nth-child(1)")
    public WebElement last7DaysBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(1) > div.card.card-dashboard.min-h-12.mb-3 > div > div.d-flex.justify-content-between.align-items-center.mb-2 > div > div > a:nth-child(2)")
    public WebElement last30DaysBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(1) > div.card.card-dashboard.min-h-12.mb-3 > div > div.d-flex.justify-content-between.align-items-center.mb-2 > div > div > a:nth-child(3)")
    public WebElement last90DaysBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(1) > div.card.card-dashboard.mb-3.mb-xl-0.min-h-16 > div > div.d-flex.justify-content-between.align-items-center.mb-2 > span:nth-child(2) > a")
    public WebElement seeAllReviewsBtn;
    @FindBy(how = How.CSS, using = "#solds-container > a:nth-child(1)")
    public WebElement mySalesBtn;
    @FindBy(how = How.CSS, using = "#seller > div:nth-child(4) > div:nth-child(2) > div > div > div.d-flex.justify-content-between.align-items-center.mb-2 > span:nth-child(2) > a")
    public WebElement seeAllMySalesBtn;
    @FindBy(how = How.CSS, using = "#dashboard-seller-messages > a:nth-child(2)")
    public WebElement sellerMessageBtn;
    @FindBy(how = How.CSS, using = "#dashboard-seller-messages > div > span:nth-child(2) > a")
    public WebElement seeAllSellersMessages;

    @FindBy(how = How.CSS, using = "#matches-container > div > div.d-flex.justify-content-between.align-items-center.mb-2 > span:nth-child(2) > a")
    public WebElement seeAllRequestCarouselBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/ul/li[2]/a")
    public WebElement sellerDashboard;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/ul/li[1]/a/span/span[1]")
    public WebElement buyersDashboard;

    @FindBy(how = How.CSS, using = "#buyer > div > div:nth-child(3) > div.card.card-dashboard.mb-3.mb-lg-0.min-h-12 > div > div > a")
    public WebElement createRequestTxt;


    public void setHomePage() {
        getDriver().navigate().to(url);
    }

    public void goToDashboard() {
        getDriver().navigate().to(url + "/dashboard");
    }

    public void mySettings() {
        waitForWebElementAndClick(mySettingsBtn);
    }

    public void buyersCarousel() {
        waitForWebElementAndClick(carouselNextBtn);
        waitForWebElementAndClick(carouselPreviousBtn);
    }

    public void buyersMyOrders() {
        try {
            waitForWebElementAndClick(myOrdersBtn);
        } catch (Exception e) {
            wait(2);
            fluentWait(getDriver(), myOrdersBtn);
            waitForWebElementAndClick(myOrdersBtn);
        }

    }

    public void buyersMessage() {
        waitForWebElementAndClick(buyersMessagesBtn);
    }

    public void createARequest() {
        waitForWebElementAndClick(createRequestTxt);
    }

    public void sellerOption() {
        waitForWebElementAndClick(sellerBtn);
    }

    public void lastDays() {
        waitForVisibility(lastDaysBtn);
        action.moveToElement(lastDaysBtn).perform();
    }

    public void last7Days() {
        lastDays();
        waitForWebElementAndClick(last7DaysBtn);
    }

    public void last30Days() {
        lastDays();
        waitForWebElementAndClick(last30DaysBtn);
    }

    public void last90Days() {
        lastDays();
        waitForWebElementAndClick(last90DaysBtn);

    }

    public void seeAllReviews() {
        waitForWebElementAndClick(seeAllMySalesBtn);

    }

    public void mySales() {
        waitForWebElementAndClick(mySalesBtn);
    }

    public void seeAllMySales() {
        waitForWebElementAndClick(seeAllMySalesBtn);
    }

    public void sellerMessage() {
        waitForWebElementAndClick(sellerMessageBtn);
    }

    public void seeAllSellerMessages() {
        waitForWebElementAndClick(seeAllSellersMessages);
    }

    public void requestCarousel() {
        waitForWebElementAndClick(seeAllRequestCarouselBtn);
    }


}