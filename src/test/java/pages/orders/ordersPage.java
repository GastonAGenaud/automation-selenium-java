package pages.orders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import java.util.ArrayList;

public class ordersPage extends BasePage {


    public ordersPage() {
        super();
    }

    String windowHandle = getDriver().getWindowHandle();


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
    @FindBy(xpath = "//button[contains(text(), 'Track')]")
    public WebElement ordersPurchasedTrackBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div[2]/div/button")
    public WebElement ordersPurchasedMenuTabButton;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/a[1]")
    public WebElement ordersBuyAgainBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/a[2]")
    public WebElement ordersPurchasedShareBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[43]/div/div/div/div[1]/div[2]/div/div/a[3]")
    public WebElement ordersPurchasedRequestRefundBtn;
    @FindBy(how = How.CSS, using = "#transaction-521 > div > div > div:nth-child(2) > div > div.col.d-flex.justify-content-end.align-items-end > button")
    public WebElement ordersConfirmPickUpBtn;
    @FindBy(xpath = "//button[contains(text(), 'Leave a review')]")
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

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[43]/div/div/div/div[1]/div[2]/div/button ")
    public WebElement requestTabButton;

    @FindBy(how = How.CSS, using = "#chat-message")
    public WebElement messageBeforeChat;

    @FindBy(how = How.CSS, using = "#sendmessage-btn")
    public WebElement sendBeforeChat;

    @FindBy(how = How.CSS, using = "#sold-tab > span > span:nth-child(1)")
    public WebElement soldBtn;

    @FindBy(how = How.CSS, using = "#cancel-message")
    public WebElement cancelMessage;

    @FindBy(xpath = "//p[contains(text(), 'Shipping Address')]")
    public WebElement shippingAddressText;

    @FindBy(xpath = "//a[contains(text(), 'See details')]")
    public WebElement seeDetailsText;

    @FindBy(xpath = "//span[contains(text(), 'Shipment pending')]")
    public WebElement shipmentValidateText;

    public boolean shipmentValidatingTxt() {
        try {
            fluentWait(getDriver(), shipmentValidateText);
            boolean result = shipmentValidateText.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), shipmentValidateText);
            boolean result = shipmentValidateText.isDisplayed();
            return result;
        }

    }


    public boolean seeDetailsValidateText() {
        boolean result = false;

        try {
            fluentWaitStrict(getDriver(), seeDetailsText);
        } catch (Exception e) {
            getDriver().navigate().refresh();
            fluentWaitStrict(getDriver(), seeDetailsText);
        } finally {
            result = seeDetailsText.isDisplayed();
        }
        return result;
    }

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
        fluentWait(getDriver(), soldBtn);
        waitForWebElementAndClick(soldBtn);
    }

    public void ordersSoldDetails() {
//        waitForVisibility(ordersSoldDetailsBtn);
//        waitForClickability(ordersSoldDetailsBtn);
        fluentWait(getDriver(), ordersSoldDetailsBtn);
        waitForWebElementAndClick(ordersSoldDetailsBtn);
    }

    public void ordersSoldMessage() {
        fluentWaitStrict(getDriver(), ordersSoldMessageBtn);
        waitForWebElementAndClick(ordersSoldMessageBtn);

        fluentWaitStrict(getDriver(), ordersSoldMessageTextField);
        waitForWebElementAndClick(ordersSoldMessageTextField);
        ordersSoldMessageTextField.sendKeys("Test Automation");

        fluentWaitStrict(getDriver(), ordersSoldSendMessageBtn);
        waitForWebElementAndClick(ordersSoldSendMessageBtn);

    }

    public void ordersSoldOpenMenuTab() {
        fluentWait(getDriver(), ordersSoldOpenMenuTabBtn);
        waitForWebElementAndClick(ordersSoldOpenMenuTabBtn);
    }

    public void ordersSoldCancelBtn() {
        try {
            ordersSoldOpenMenuTab();
            fluentWait(getDriver(), ordersSoldOpenCancelBtn);
            waitForWebElementAndClick(ordersSoldOpenCancelBtn);
            fluentWait(getDriver(), cancelMessage);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void ordersPurchasedButton() {
        getDriver().navigate().refresh();
        fluentWaitStrict(getDriver(), ordersPurchasedBtn);
        waitForWebElementAndClick(ordersPurchasedBtn);
        retryingFindClick(ordersPurchasedBtn);
//        retryingFindClick(ordersPurchasedBtn);
    }

    public void ordersPurchasedMessage() {
        fluentWait(getDriver(), ordersPurchasedMessageBtn);
        waitForWebElementAndClick(ordersPurchasedMessageBtn);

        fluentWait(getDriver(), messageBeforeChat);
        waitForWebElementAndClick(messageBeforeChat);

        messageBeforeChat.sendKeys("Testing");

        fluentWait(getDriver(), sendBeforeChat);
        waitForWebElementAndClick(sendBeforeChat);

        goToOrders();

        fluentWait(getDriver(), ordersPurchasedBtn);
        waitForWebElementAndClick(ordersPurchasedBtn);
    }

    public void ordersPurchasedTrack() {
        try {
            fluentWait(getDriver(), ordersPurchasedTrackBtn);
            waitForWebElementAndClick(ordersPurchasedTrackBtn);
            String window = getDriver().getWindowHandle();
            getDriver().switchTo().window(window);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), ordersPurchasedTrackBtn);
            waitForWebElementAndClick(ordersPurchasedTrackBtn);
            String window = getDriver().getWindowHandle();
            getDriver().switchTo().window(window);
        }

    }


    public void ordersPurchasedTab2Button() {
        fluentWaitStrict(getDriver(), ordersPurchasedTab2Button);
        waitForWebElementAndClick(ordersPurchasedTab2Button);
    }

    public void ordersBuyAgain() {
        fluentWaitStrict(getDriver(), ordersPurchasedMenuTabButton);
        waitForWebElementAndClick(ordersPurchasedMenuTabButton);


        fluentWait(getDriver(), ordersBuyAgainBtn);
        waitForWebElementAndClick(ordersBuyAgainBtn);
    }


    public boolean shippingAddressTextValidate() {
        fluentWait(getDriver(), shippingAddressText);
        boolean result = shippingAddressText.isDisplayed();
        return result;
    }

    public void ordersShare() {
        fluentWait(getDriver(), ordersPurchasedMenuTabButton);
        waitForWebElementAndClick(ordersPurchasedMenuTabButton);

        fluentWait(getDriver(), ordersPurchasedShareBtn);
        waitForWebElementAndClick(ordersPurchasedShareBtn);

        action.moveToElement(ordersPurchasedShareBtn);
    }

    public void ordersRequestRefund() {
        action.moveToElement(requestTabButton).build();
        fluentWait(getDriver(), requestTabButton);
        waitForWebElementAndClick(requestTabButton);


//        action.moveToElement(ordersPurchasedRequestRefundBtn).build();
        fluentWait(getDriver(), ordersPurchasedRequestRefundBtn);
        waitForWebElementAndClick(ordersPurchasedRequestRefundBtn);

    }

    public void ordersConfirmPickUp() {
        fluentWait(getDriver(), ordersConfirmPickUpBtn);
        waitForWebElementAndClick(ordersConfirmPickUpBtn);
    }

    public void ordersLeaveAReview() {

        fluentWaitStrict(getDriver(), ordersLeaveAReviewBtn);
        waitForWebElementAndClick(ordersLeaveAReviewBtn);
        ArrayList tabs = new ArrayList(getDriver().getWindowHandles());
        System.out.println(tabs.size());
        getDriver().switchTo().window(windowHandle);
        getDriver().navigate().refresh();
    }

    public void ordersShowMenu() {

        try {


            try {
                WebElement element = getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/ul/li[3]/div/div"));
                Actions action = new Actions(getDriver());
                fluentWaitStrict(getDriver(), ordersShowBtn);
                action.moveToElement(ordersShowBtn).perform();
            } catch (Exception e) {
                actions.moveToElement(ordersShowBtn);
                WebElement element = getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/ul/li[3]/div/div"));
                Actions action = new Actions(getDriver());
                fluentWaitStrict(getDriver(), ordersShowBtn);
                action.moveToElement(ordersShowBtn).perform();
            }

        } catch (Exception e) {
            fluentWait(getDriver(), ordersShowBtn);
            waitForWebElementAndClick(ordersShowBtn);
            waitForWebElementAndClick(ordersShowBtn);
        }
    }

    public void ordersShowAll() {
        ordersShowMenu();

    }


    public void ordersShowShipmentPending() {
        ordersShowMenu();
        fluentWait(getDriver(), ordersShowShipmentPendingBtn);
        waitForWebElementAndClick(ordersShowShipmentPendingBtn);

//        fluentWait(getDriver(), ordersShowShipmentPendingBtn);
//        waitForWebElementAndClick(ordersShowShipmentPendingBtn);

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
        System.out.println("Antes");
        ordersShowMenu();
        System.out.println("Despues");

        fluentWait(getDriver(), ordersShowCompletedBtn);
        waitForWebElementAndClick(ordersShowCompletedBtn);

    }

    public void ordersCancelled() {
        getDriver().navigate().refresh();
        ordersShowAll();
//        fluentWait(getDriver(), ordersShowBtn);
//        action.moveToElement(ordersShowBtn);
        fluentWait(getDriver(), ordersShowCancelledBtn);
        waitForWebElementAndClick(ordersShowCancelledBtn);
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
        fluentWait(getDriver(), purchasedOpenSection);
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
        fluentWait(getDriver(), requestTabButton);
        boolean result = requestTabButton.isDisplayed();
        return result;
    }

}