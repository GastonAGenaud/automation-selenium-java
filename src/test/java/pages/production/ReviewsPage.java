package pages.production;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;

import static java.lang.Math.random;

public class ReviewsPage extends BasePage {


    public ReviewsPage() {
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

    @FindBy(how = How.CSS, using = "#review-form > div.card.border-0 > div > div > div.col-lg-6.mb-2.pr-lg-2 > div.d-flex.align-items-baseline > div > label:nth-child(2)")
    public WebElement fiveStarsBtnONE;

    @FindBy(how = How.CSS, using = "#review-form > div.card.border-0 > div > div > div.col-lg-6.mb-2.pl-lg-2 > div.d-flex.align-items-baseline > div > label:nth-child(2)")
    public WebElement fiveStarsBtnTWO;

    @FindBy(how = How.CSS, using = "#seller-review")
    public WebElement reviewOneTextFieldInput;

    @FindBy(how = How.CSS, using = "#listing-review")
    public WebElement reviewTwoTextFieldInput;

    @FindBy(how = How.CSS, using = "#review-form > div.d-flex.justify-content-center > button")
    public WebElement sendReviewBtn;

    @FindBy(how = How.CSS, using = "#reviews-tab")
    public WebElement reviewsTab;

    @FindBy(how = How.CSS, using = "#reviews")
    public WebElement reviewsDisplayed;

    @FindBy(how = How.CSS, using = "#U3VjY2Vzc1Jldmlld3MlMjB3ZXJlJTIwc2VudCUyMHN1Y2Nlc2Z1bGx5LmdyZWVu > div.iziToast-body > div.iziToast-texts > p")
    public WebElement reviewCorrectSend;

    @FindBy(how = How.CSS, using = "#welcome > div > div > div")
    public WebElement validateWelcome;


    public void reviewSendCorrectly(){
        fluentWait(getDriver(), reviewCorrectSend);
        Assert.assertTrue(reviewCorrectSend.isDisplayed());
    }

    public void reviewsSectionDisplayed(){
        fluentWait(getDriver(), reviewsDisplayed);
        Assert.assertTrue(reviewsDisplayed.isDisplayed());
    }


    public void itemReviewsTab() {
        fluentWait(getDriver(), reviewsTab);
        waitForWebElementAndClick(reviewsTab);
    }

    public void sendReview() {
        fluentWait(getDriver(), sendReviewBtn);
        waitForWebElementAndClick(sendReviewBtn);
    }

    public void reviewTwoTxt() {
        fluentWait(getDriver(), reviewTwoTextFieldInput);
        waitForWebElementAndClick(reviewTwoTextFieldInput);

        reviewTwoTextFieldInput.sendKeys("Test Review 2");
    }

    public void reviewOneTxt() {
        fluentWait(getDriver(), reviewOneTextFieldInput);
        waitForWebElementAndClick(reviewOneTextFieldInput);

        reviewOneTextFieldInput.sendKeys("Test Review 1");
    }

    public void fiveStarsSelectTWO() {
        fluentWait(getDriver(), fiveStarsBtnTWO);
        waitForWebElementAndClick(fiveStarsBtnTWO);

    }

    public void fiveStarsSelectONE() {
        fluentWait(getDriver(), fiveStarsBtnONE);
        waitForWebElementAndClick(fiveStarsBtnONE);
    }

    public void loginWithMakeAnOffer() {

    }

    public void selectLeaveReviewBtn() {
        fluentWait(getDriver(), leaveReviewBtn);
        waitForWebElementAndClick(leaveReviewBtn);
    }
    String randomStr = RandomStringUtils.randomAlphabetic(20);

    String randomEmail = rdm + Long.toString((int) random() * 1200);
    public void CreateAnAccountListingDetailsPROD(String text) {
        getDriver().navigate().to(UrlProd);

        waitForVisibility(signUpNowBtn);
        fluentWaitStrict(getDriver(), signUpNowBtn);
        fluentWait(getDriver(), signUpNowBtn);
        waitForWebElementAndClick(signUpNowBtn);

        fluentWaitStrict(getDriver(), newEmailBtn);
        fluentWait(getDriver(), newEmailBtn);
        waitForWebElementAndClick(newEmailBtn);

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), newEmailBtn);
        waitForWebElementAndClick(newEmailBtn);
        newEmailBtn.sendKeys(text + randomEmail + "auto@trick.com");

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.clear();
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), newPasswordBtn);
        fluentWait(getDriver(), newPasswordBtn);
        waitForWebElementAndClick(newPasswordBtn);
        newPasswordBtn.click();

        fluentWaitStrict(getDriver(), newPasswordBtn);
        fluentWait(getDriver(), newPasswordBtn);
        waitForWebElementAndClick(newPasswordBtn);
        newPasswordBtn.sendKeys("asdasdasq21231@A");

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), signUpBtn);
        fluentWait(getDriver(), signUpBtn);
        waitForWebElementAndClick(signUpBtn);

        fluentWait(getDriver(),validateWelcome);
        Assert.assertTrue(validateWelcome.isDisplayed());

    }

}