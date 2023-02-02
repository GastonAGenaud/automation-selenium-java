package pages.orders;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.random;

public class ordersPage extends BasePage {


    public ordersPage() {
        super();
    }
    Actions actions = new Actions(getDriver());

    Actions action = new Actions(getDriver());
    //action.moveToElement("#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li.dropright.show > a");

    //LOGIN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div[2]/a")
    public WebElement ordersSoldDetailsBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div[3]/div/div/a")
    public WebElement ordersSoldMessageBtn;
    @FindBy(how = How.CSS, using = "#chat-message")
    public WebElement ordersSoldMessageTextField;
    @FindBy(how = How.CSS, using = "#sendmessage-btn")
    public WebElement ordersSoldSendMessageBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div[1]/div[2]/div/button")
    public WebElement ordersSoldOpenMenuTabBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/a")
    public WebElement ordersSoldOpenCancelBtn;
    @FindBy(how = How.CSS, using = "#purchased-tab")
    public WebElement ordersPurchasedBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[3]/div/div/a")
    public WebElement ordersPurchasedMessageBtn;
    @FindBy(xpath = "//*[@id=\"closed-purchased\"]/div[14]/div/div/div/div[2]/div/div[4]/button")
    public WebElement ordersPurchasedTrackBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/button")
    public WebElement ordersPurchasedMenuTabButton;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/a[1]")
    public WebElement ordersBuyAgainBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/a[2]")
    public WebElement ordersPurchasedShareBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[18]/div[1]/div/div/div[1]/div[2]/div/div/a[3]")
    public WebElement ordersPurchasedRequestRefundBtn;
    @FindBy(how = How.CSS, using = "#transaction-521 > div > div > div:nth-child(2) > div > div.col.d-flex.justify-content-end.align-items-end > button")
    public WebElement ordersConfirmPickUpBtn;
    @FindBy(how = How.CSS, using = "#closed-purchased > div:nth-child(1) > div > div > div > div:nth-child(2) > div > div.col.d-flex.justify-content-end.align-items-end > button")
    public WebElement ordersLeaveAReviewBtn;
    @FindBy(how = How.CSS, using = "#sidebar-listing > li.nav-item.ml-auto.my-auto > div > div")
    public WebElement ordersShowBtn;


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

    @FindBy(how = How.CSS, using = "#purchased-tab > span > span:nth-child(1)")
    public WebElement purchasedPickupSection;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/ul/li[2]/a/span")
    public WebElement purchasedOpenSection;

    @FindBy(how = How.CSS, using = "#btn-cancel")
    public WebElement shippingOrderSection;

    @FindBy(how = How.CSS, using = "#inbox-container")
    public WebElement soldOpenSection;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div[2]/div/button")
    public WebElement ordersPurchasedTab2Button;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[18]/div[1]/div/div/div[1]/div[2]/div/button")
    public WebElement requestTabButton;

    @FindBy(how = How.CSS, using = "#chat-message")
    public WebElement messageBeforeChat;

    @FindBy(how = How.CSS, using = "#sendmessage-btn")
    public WebElement sendBeforeChat;

    @FindBy(how = How.CSS, using = "#sold-tab > span > span:nth-child(1)")
    public WebElement soldBtn;

    @FindBy(how = How.CSS, using = "#cancel-message")
    public WebElement cancelMessage;


    public void setCancelMessage() {
        cancelMessage.sendKeys("I dont want it");
    }


    public void setHomePage() {
        getDriver().navigate().to(url);
    }

    public void goToDashboard() {
        getDriver().navigate().to(url + "/dashboard");
    }

    public void goToOrders() {
        getDriver().navigate().to(url + "/order/MyOrders?");
    }


    public void selectSoldBtn() {
        fluentWait(getDriver(),soldBtn);
        waitForWebElementAndClick(soldBtn);
    }

    public void ordersSoldDetails() {
        waitForVisibility(ordersSoldDetailsBtn);
        waitForClickability(ordersSoldDetailsBtn);
        fluentWait(getDriver(), ordersSoldDetailsBtn);
        waitForWebElementAndClick(ordersSoldDetailsBtn);
        ordersSoldDetailsBtn.click();
    }

    public void ordersSoldMessage() {
        waitForVisibility(ordersSoldMessageBtn);
        waitForClickability(ordersSoldMessageBtn);
        action.moveToElement(ordersSoldMessageBtn).build();
        ordersSoldMessageBtn.click();
        ordersSoldMessageTextField.click();
        ordersSoldMessageTextField.sendKeys("Test Automation");
        ordersSoldSendMessageBtn.click();
    }

    public void ordersSoldOpenMenuTab() {
        ordersSoldOpenMenuTabBtn.click();
    }

    public void ordersSoldCancelBtn() {
        ordersSoldOpenMenuTab();
        waitForVisibility(ordersSoldOpenCancelBtn);
        waitForClickability(ordersSoldOpenCancelBtn);
        ordersSoldOpenCancelBtn.click();

    }

    public void ordersPurchasedButton() {
        goToOrders();

        ordersPurchasedBtn.click();
        ordersPurchasedBtn.click();

    }

    public void ordersPurchasedMessage() {
        waitForVisibility(ordersPurchasedMessageBtn);
        waitForClickability(ordersPurchasedMessageBtn);
        ordersPurchasedMessageBtn.click();
        messageBeforeChat.click();
        messageBeforeChat.sendKeys("Testing");
        sendBeforeChat.click();
        goToOrders();

        ordersPurchasedBtn.click();
    }

    public void ordersPurchasedTrack() {
        ordersPurchasedTrackBtn.click();
        String window = getDriver().getWindowHandle();
        getDriver().switchTo().window(window);
    }


    public void ordersPurchasedTab2Button() {

        action.moveToElement(ordersPurchasedTab2Button);
        ordersPurchasedTab2Button.click();
    }

    public void ordersBuyAgain() {
        ordersPurchasedTab2Button.click();

        waitForVisibility(ordersBuyAgainBtn);
        waitForClickability(ordersBuyAgainBtn);
        ordersBuyAgainBtn.click();
    }

    public void ordersShare() {
        ordersPurchasedMenuTabButton.click();

        waitForVisibility(ordersPurchasedShareBtn);
        waitForClickability(ordersPurchasedShareBtn);
        action.moveToElement(ordersPurchasedShareBtn);
        ordersPurchasedShareBtn.click();

        action.moveToElement(ordersPurchasedShareBtn);
    }

    public void ordersRequestRefund() {

        action.moveToElement(requestTabButton).build();
        requestTabButton.click();
        action.moveToElement(ordersPurchasedRequestRefundBtn).build();
        ordersPurchasedRequestRefundBtn.click();
    }

    public void ordersConfirmPickUp() {
        ordersConfirmPickUpBtn.click();
    }

    public void ordersLeaveAReview() {
        ordersLeaveAReviewBtn.click();
    }

    public void ordersShowMenu() {

        var element = getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/ul/li[3]/div/div"));
        Actions action  = new Actions(getDriver());
        action.moveToElement(ordersShowBtn).perform();


    }

    public void ordersShowAll() {
        ordersShowMenu();

    }


    public void ordersShowShipmentPending() {
        ordersShowMenu();
        ordersShowShipmentPendingBtn.click();

        goToOrders();
    }

    public void ordersShowShipped() {
        ordersShowMenu();
        ordersShowShippedBtn.click();
    }

    public void ordersShowDelivered() {
        ordersShowMenu();
        ordersShowDeliveredBtn.click();
    }

    public void ordersShowCompleted() {
        System.out.println("Antes");
        ordersShowMenu();
        System.out.println("Despues");
        ordersShowCompletedBtn.click();
    }

    public void ordersCancelled() {
        ordersShowMenu();
        ordersShowCancelledBtn.click();
    }

    public String showMenu() {
        String result = showMenu.getText();
        return result;
    }

    public boolean purchasedPickupSection() {
        boolean result = purchasedPickupSection.isDisplayed();
        return result;
    }

    public boolean purchasedOpenSection() {
        boolean result = purchasedOpenSection.isDisplayed();
        return result;

    }

    public boolean shippingOrderSection() {
        boolean result = shippingOrderSection.isDisplayed();
        return result;
    }

    public boolean soldOpenSection() {
        boolean result = soldOpenSection.isDisplayed();
        return result;
    }

    public boolean requestTabBtn() {
        boolean result = requestTabButton.isDisplayed();
        return result;
    }

}