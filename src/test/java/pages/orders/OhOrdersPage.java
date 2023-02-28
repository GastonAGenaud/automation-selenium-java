package pages.orders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import java.util.ArrayList;

public class OhOrdersPage extends BasePage {


    public OhOrdersPage() {
        super();
    }

    String windowHandle = getDriver().getWindowHandle();


    Actions actions = new Actions(getDriver());

    Actions action = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());
    //LOGIN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    @FindBy(how = How.CSS, using = "#orders-tab")
    public WebElement ordersBtn;
    @FindBy(how = How.CSS, using = "#sold-tab")
    public WebElement soldOptionBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div[1]/div[2]/a")
    public WebElement ordersSoldDetailsBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[3]/div/div/a")
    public WebElement ordersSoldMessageBtn;
    @FindBy(how = How.CSS, using = "#chat-message")
    public WebElement ordersSoldMessageTextField;
    @FindBy(how = How.CSS, using = "#sendmessage-btn")
    public WebElement ordersSoldSendMessageBtn;
    @FindBy(how = How.CSS, using = "#dropdown-705 > button")
    public WebElement ordersSoldOpenMenuTabBtn;
    @FindBy(how = How.CSS, using = "#dropdown-705 > div > a")
    public WebElement ordersSoldOpenCancelBtn;
    @FindBy(how = How.CSS, using = "#purchased-tab > span > span:nth-child(1)")
    public WebElement ordersPurchasedBtn;
    @FindBy(how = How.CSS, using = "#transaction-540 > div > div > div.d-flex.flex-row.flex-wrap-reverse.align-items-center > div.align-items-center.ml-auto.mb-2.justify-content-end.see__details > a")
    public WebElement ordersPurchasedDetailsBtn;
    @FindBy(how = How.CSS, using = "#transaction-540 > div > div > div:nth-child(2) > div > div:nth-child(3) > div > div > a")
    public WebElement ordersPurchasedMessageBtn;
    @FindBy(how = How.CSS, using = "#chat-message")
    public WebElement ordersPurchasedMessageTextField;
    @FindBy(how = How.CSS, using = "#sendmessage-btn")
    public WebElement ordersPurchasedSendMessageBtn;
    @FindBy(how = How.CSS, using = "#closed-purchased > div:nth-child(4) > div:nth-child(1) > div > div > div:nth-child(2) > div > div.col.d-flex.justify-content-end.align-items-end > button")
    public WebElement ordersPurchasedTrackBtn;
    @FindBy(how = How.CSS, using = "#closed-purchased > div:nth-child(2) > div > div > div > div.d-flex.flex-row.flex-wrap-reverse.align-items-center > div.d-flex.align-items-center.ml-auto.mb-2.justify-content-end > div > button > svg")
    public WebElement ordersPurchasedMenuTabButton;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/a[1]")
    public WebElement ordersBuyAgainBtn;
    @FindBy(how = How.CSS, using = "#closed-purchased > div:nth-child(1) > div > div > div > div.d-flex.flex-row.flex-wrap-reverse.align-items-center > div.d-flex.align-items-center.ml-auto.mb-2.justify-content-end > div > div > a:nth-child(2)")
    public WebElement ordersPurchasedShareBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/a[3]")
    public WebElement ordersPurchasedRequestRefundBtn;
    @FindBy(how = How.CSS, using = "#transaction-521 > div > div > div:nth-child(2) > div > div.col.d-flex.justify-content-end.align-items-end > button")
    public WebElement ordersConfirmPickUpBtn;
    @FindBy(how = How.CSS, using = "#closed-purchased > div:nth-child(1) > div > div > div > div:nth-child(2) > div > div.col.d-flex.justify-content-end.align-items-end > button")
    public WebElement ordersLeaveAReviewBtn;
    @FindBy(how = How.CSS, using = "#sidebar-listing > li.nav-item.ml-auto.my-auto > div > div > button > span")
    public WebElement ordersShowBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/ul/li[3]/div/div/div/a[1]")
    public WebElement ordersShowAllBtn;
    @FindBy(how = How.CSS, using = "#sidebar-listing > li.nav-item.ml-auto.my-auto > div > div > div > a:nth-child(1)")
    public WebElement ordersPendingResponseBtn;
    @FindBy(how = How.CSS, using = "#sidebar-listing > li.nav-item.ml-auto.my-auto > div > div > div > a:nth-child(3)")
    public WebElement ordersShowShipmentPendingBtn;
    @FindBy(how = How.CSS, using = "#sidebar-listing > li.nav-item.ml-auto.my-auto > div > div > div > a:nth-child(5)")
    public WebElement ordersShowShippedBtn;
    @FindBy(how = How.CSS, using = "#sidebar-listing > li.nav-item.ml-auto.my-auto > div > div > div > a:nth-child(6)")
    public WebElement ordersShowDeliveredBtn;
    @FindBy(how = How.CSS, using = "#sidebar-listing > li.nav-item.ml-auto.my-auto > div > div > div > a:nth-child(7)")
    public WebElement ordersShowCompletedBtn;
    @FindBy(how = How.CSS, using = "#sidebar-listing > li.nav-item.ml-auto.my-auto > div > div > div > a:nth-child(8)")
    public WebElement ordersShowCancelledBtn;

    @FindBy(how = How.CSS, using = "#sidebar-listing > li.nav-item.ml-auto.my-auto > div > span")
    public WebElement showMenu;

    @FindBy(how = How.CSS, using = "#request-refund")
    public WebElement purchasedPickupSection;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div/div[1]/section[1]/div/div[10]/div[1]/div[2]")
    public WebElement purchasedOpenSection;

    @FindBy(how = How.CSS, using = "#btn-cancel")
    public WebElement shippingOrderSection;

    @FindBy(how = How.CSS, using = "#inbox-container")
    public WebElement soldOpenSection;

    public void goToOWLPage() {
        getDriver().navigate().to(baseUrlOHE);
    }

    public void goToDashboard() {
        getDriver().navigate().to(baseUrlOHE + "/dashboard");
    }

    public void goToOrders() {
        getDriver().navigate().to(baseUrlOHE + "/order/MyOrders?");
    }

    public void soldOption() {
        fluentWait(getDriver(), soldOptionBtn);
        waitForWebElementAndClick(soldOptionBtn);
    }

    public void ordersButton() {
        fluentWait(getDriver(), ordersBtn);
        waitForWebElementAndClick(ordersBtn);
    }

    public void ordersSoldDetails() {
        waitForVisibility(ordersSoldDetailsBtn);
        waitForClickability(ordersSoldDetailsBtn);
        fluentWait(getDriver(), ordersSoldDetailsBtn);
        waitForWebElementAndClick(ordersSoldDetailsBtn);
    }

    public void ordersSoldMessage() {
        waitForVisibility(ordersSoldMessageBtn);
        waitForClickability(ordersSoldMessageBtn);
        fluentWait(getDriver(), ordersSoldMessageBtn);
        waitForWebElementAndClick(ordersSoldMessageBtn);
        ordersSoldMessageTextField.sendKeys("Test Automation");
        fluentWait(getDriver(), ordersSoldMessageBtn);
        waitForWebElementAndClick(ordersSoldMessageBtn);
    }

    public void ordersSoldOpenMenuTab() {
        fluentWait(getDriver(), ordersSoldOpenMenuTabBtn);
        waitForWebElementAndClick(ordersSoldOpenMenuTabBtn);
    }

    public void ordersSoldCancelBtn() {
        ordersSoldOpenMenuTab();
        waitForVisibility(ordersSoldOpenCancelBtn);
        waitForClickability(ordersSoldOpenCancelBtn);
        fluentWait(getDriver(), ordersSoldOpenCancelBtn);
        waitForWebElementAndClick(ordersSoldOpenCancelBtn);

    }

    public void ordersPurchasedButton() {
        goToOrders();
        fluentWait(getDriver(), ordersPurchasedBtn);
        waitForWebElementAndClick(ordersPurchasedBtn);
    }

    public void ordersPurchasedDetails() {
        fluentWait(getDriver(), ordersPurchasedDetailsBtn);
        waitForWebElementAndClick(ordersPurchasedDetailsBtn);
    }

    public void ordersPurchasedMessage() {
        waitForVisibility(ordersPurchasedMessageBtn);
        waitForClickability(ordersPurchasedMessageBtn);
        fluentWait(getDriver(), ordersPurchasedMessageBtn);
        waitForWebElementAndClick(ordersPurchasedMessageBtn);
        ordersPurchasedMessageTextField.sendKeys("Test Automation");
        fluentWait(getDriver(), ordersPurchasedSendMessageBtn);
        waitForWebElementAndClick(ordersPurchasedSendMessageBtn);
    }

    public void ordersPurchasedTrack() {
        fluentWait(getDriver(), ordersPurchasedTrackBtn);
        waitForWebElementAndClick(ordersPurchasedTrackBtn);
    }

    public void ordersPurchasedMenu() {
        waitForVisibility(ordersPurchasedMenuTabButton);
        waitForClickability(ordersPurchasedMenuTabButton);
        fluentWait(getDriver(), ordersPurchasedMenuTabButton);
        waitForWebElementAndClick(ordersPurchasedMenuTabButton);
    }

    public void ordersBuyAgain() {
        ordersPurchasedMenu();
        fluentWait(getDriver(), ordersBuyAgainBtn);
        waitForWebElementAndClick(ordersBuyAgainBtn);
    }

    public void ordersShare() {
        ordersPurchasedMenu();
        waitForVisibility(ordersPurchasedShareBtn);
        waitForClickability(ordersPurchasedShareBtn);
        fluentWait(getDriver(), ordersPurchasedShareBtn);
        waitForWebElementAndClick(ordersPurchasedShareBtn);
    }

    public void ordersRequestRefund() {
        ordersPurchasedMenu();
        fluentWait(getDriver(), ordersPurchasedRequestRefundBtn);
        waitForWebElementAndClick(ordersPurchasedRequestRefundBtn);
    }

    public void ordersConfirmPickUp() {
        fluentWait(getDriver(),ordersConfirmPickUpBtn);
        waitForWebElementAndClick(ordersConfirmPickUpBtn);
    }

    public void ordersLeaveAReview() {
        fluentWait(getDriver(), ordersLeaveAReviewBtn);
        waitForWebElementAndClick(ordersLeaveAReviewBtn);
    }

    public void ordersShowMenu() {
        action.moveToElement(ordersShowBtn).build().perform();
    }

    public void ordersShowAll() {
        ordersShowMenu();
        fluentWait(getDriver(), ordersPendingResponseBtn);
        waitForWebElementAndClick(ordersPendingResponseBtn);
    }

    public void ordersPendingResponse() {
        ordersShowMenu();
        fluentWait(getDriver(), ordersPendingResponseBtn);
        waitForWebElementAndClick(ordersPendingResponseBtn);
    }

    public void ordersShowShipmentPending() {
        ordersShowMenu();
        fluentWait(getDriver(), ordersShowShipmentPendingBtn);
        waitForWebElementAndClick(ordersShowShipmentPendingBtn);
    }

    public void ordersShowShipped() {
        ordersShowMenu();
        fluentWait(getDriver(), ordersShowShippedBtn);
        waitForWebElementAndClick(ordersShowShippedBtn);
    }

    public void ordersShowDelivered() {
        ordersShowMenu();
        fluentWait(getDriver(), ordersShowDeliveredBtn);
        waitForWebElementAndClick(ordersShowDeliveredBtn);
    }

    public void ordersShowCompleted() {
        ordersShowMenu();
        fluentWait(getDriver(), ordersShowCompletedBtn);
        waitForWebElementAndClick(ordersShowCompletedBtn);
    }

    public void ordersCancelled() {
        ordersShowMenu();
        fluentWait(getDriver(),ordersShowCancelledBtn);
        waitForWebElementAndClick(ordersShowCancelledBtn);
    }

    public String showMenu() {
        fluentWait(getDriver(), showMenu);
        String result = showMenu.getText();
        return result;
    }

    public boolean purchasedPickupSection() {
        fluentWait(getDriver(), purchasedOpenSection);
        boolean result = purchasedPickupSection.isDisplayed();
        return result;
    }

    public boolean purchasedOpenSection() {
        fluentWait(getDriver(), purchasedOpenSection);
        boolean result = purchasedOpenSection.isDisplayed();
        return result;

    }

    public boolean shippingOrderSection() {
        fluentWait(getDriver(), shippingOrderSection);
        boolean result = shippingOrderSection.isDisplayed();
        return result;
    }

    public boolean soldOpenSection() {
        fluentWait(getDriver(), soldOpenSection);
        boolean result = soldOpenSection.isDisplayed();
        return result;
    }

}