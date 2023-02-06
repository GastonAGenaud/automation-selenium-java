package pages.review;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class reviewsPage extends BasePage {


    public reviewsPage() {
        super();
    }
    Actions actions = new Actions(getDriver());



    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    @FindBy(how = How.CSS, using = "#listing-img-0")
    public WebElement listingItemBtn;
    @FindBy(xpath = "//*[ text() = 'Reviews' ]")
    public WebElement reviewsBtn;
    @FindBy(how = How.CSS, using = "#open-review")
    public WebElement leaveReviewBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div[41]/div/div/div/div[2]/div/div[4]/button")
    public WebElement leaveReviewCompleteSection;
    @FindBy(how = How.CSS, using = "#review-form > div.d-flex.justify-content-center > button")
    public WebElement reviewSendBtn;
    @FindBy(xpath = "/html/body/div[4]/main/div[8]/div/div/div/form/div[2]/div/div/div[1]/div[2]/div/label[2]")
    public WebElement rating4Btn;
    @FindBy(xpath = "/html/body/div[4]/main/div[8]/div/div/div/form/div[2]/div/div/div[2]/div[2]/div/label[1]")
    public WebElement rating5Btn;
    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div.d-flex.mb-4 > div > a")
    public WebElement userProfileBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div[1]/div/ul/li[2]/a/span")
    public WebElement reviewsProfileBtn;
    @FindBy(xpath = "/html/body/div[3]/main/div[1]/div/div[3]/div[2]/div/div[1]/button")
    public WebElement leaveAReviewInProfile;

    @FindBy(how = How.CSS, using = "#orders-tab > span > span:nth-child(1)")
    public WebElement ordersBtn;
    @FindBy(how = How.CSS, using = "#purchased-tab")
    public WebElement purchasedBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[4]/div/div/div/div[2]/div/div/div[1]/div[1]/div/label[1]")
    public WebElement starInPurchasedBtn;

    @FindBy(how = How.CSS, using = "#seller-review")
    public WebElement reviewSellerTextFieldBtn;
    @FindBy(how = How.CSS, using = "#review-seller-msg")
    public WebElement reviewPurchasedTextField;

    @FindBy(how = How.CSS, using = "#sold-tab > span > span:nth-child(1)")
    public WebElement soldBtn;
    @FindBy(how = How.CSS, using = "#expired-head > h5 > a")
    public WebElement closedBtn;
    @FindBy(how = How.CSS, using = "#transaction-126 > div > div > div:nth-child(2) > div > div.col.d-flex.justify-content-end.align-items-end > button")
    public WebElement askForReviewBtn;
    @FindBy(how = How.CSS, using = "#sidebar-listing > li.nav-item.ml-auto.my-auto > div > div > button > span")
    public WebElement showMenuBtn;
    @FindBy(how = How.CSS, using = "#sidebar-listing > li.nav-item.ml-auto.my-auto > div > div > div > a:nth-child(7)")
    public WebElement showCompletedBtn;
    @FindBy(how = How.CSS, using = "#review-form > div.mb-4.text-center > h4")
    public WebElement leaveAReviewText;
    @FindBy(how = How.CSS, using = "#leave-review > div > div > div > div.mb-4.text-center > h4")
    public WebElement purchasedLeaveAReviewText;

    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.cards-container.pt-0.pb-0 > div > div.overflow-hidden.banner-h-250.position-relative > button")
    public WebElement backBtn;


    public String reviewConfirm() {
        String result =
                leaveAReviewText.getText();
        return result;
    }

    public String purchasedReviewConfirm() {
        String result =
                purchasedLeaveAReviewText.getText();
        return result;
    }

    public boolean soldReviewConfirm() {
        boolean result = soldBtn.isDisplayed();
        return result;
    }

    public void setHomePage() {
        getDriver().navigate().to(url);
    }

    public void goToDashboardPage() {
        getDriver().navigate().to(url + "/dashboard");
    }

    public void goToListingPage() {
        getDriver().navigate().to(url + "/Listing/Browse");
    }

    public void goToLoginPage() {
        getDriver().navigate().to(url + "/Account/Login");
    }

    public void selectListingBtn() {
        fluentWait(getDriver(), listingItemBtn);
        waitForWebElementAndClick(listingItemBtn);
    }

    public void selectReviewBtn() {
        fluentWaitStrict(getDriver(), reviewsBtn);
        waitForWebElementAndClick(reviewsBtn);
    }

    public void selectLeaveReviewBtn() {
        waitForVisibility(leaveReviewBtn);
        waitForClickability(leaveReviewBtn);
        fluentWait(getDriver(), leaveReviewBtn);
        waitForWebElementAndClick(leaveReviewBtn);
    }

    public void selectLeaveAReviewInPurchased() {
        fluentWait(getDriver(), leaveReviewCompleteSection);
        waitForWebElementAndClick(leaveReviewCompleteSection);
    }

    public void selectLeaveReviewInProfile() {
        fluentWait(getDriver(), leaveAReviewInProfile);
        waitForWebElementAndClick(leaveAReviewInProfile);
    }

    public void selectSendReviewBtn() {
        fluentWait(getDriver(), reviewSendBtn);
        waitForWebElementAndClick(reviewSendBtn);
    }

    public void selectStarButton() {
        fluentWait(getDriver(), rating4Btn);
        waitForWebElementAndClick(rating4Btn);
    }

    public void selectRatingBtn() {
        fluentWait(getDriver(), rating5Btn);
        waitForWebElementAndClick(rating5Btn);
    }

    public void selectUserProfileBtn() {
        fluentWait(getDriver(), userProfileBtn);
        waitForWebElementAndClick(userProfileBtn);
    }

    public void selectReviewsProfileBtn() {
        fluentWait(getDriver(), backBtn);
        waitForWebElementAndClick(backBtn);
        fluentWait(getDriver(), reviewsProfileBtn);
        waitForWebElementAndClick(reviewsProfileBtn);
        fluentWait(getDriver(), backBtn);
        waitForWebElementAndClick(backBtn);
    }


    public void selectOrdersBtn() {
        fluentWait(getDriver(), ordersBtn);
        waitForWebElementAndClick(ordersBtn);
    }

    public void selectPurchasedBtn() {
        waitForVisibility(purchasedBtn);
        waitForClickability(purchasedBtn);
        fluentWait(getDriver(), purchasedBtn);
        waitForWebElementAndClick(purchasedBtn);
    }

    public void selectReviewPurchasedTextField() {
        fluentWait(getDriver(), reviewPurchasedTextField);
        waitForWebElementAndClick(reviewPurchasedTextField);
        reviewPurchasedTextField.sendKeys("Test");
    }

    public void selectStarInPurchased() {
        fluentWait(getDriver(), starInPurchasedBtn);
        waitForWebElementAndClick(starInPurchasedBtn);
    }

    public void selectSellerTextFieldBtn() {
        fluentWait(getDriver(), reviewSellerTextFieldBtn);
        waitForWebElementAndClick(reviewSellerTextFieldBtn);
        reviewSellerTextFieldBtn.sendKeys("Test");
    }


    public void selectSoldBtn() {
        fluentWait(getDriver(), soldBtn);
        waitForWebElementAndClick(soldBtn);
    }


    public void selectAskForReviewBtn() {
        fluentWait(getDriver(), askForReviewBtn);
        waitForWebElementAndClick(askForReviewBtn);
    }

    public void showMenuTab() {
        actions.moveToElement(showMenuBtn).perform();
    }

    public void showCompleted() {
        showMenuTab();
        fluentWait(getDriver(), showCompletedBtn);
        waitForWebElementAndClick(showCompletedBtn);
    }

}