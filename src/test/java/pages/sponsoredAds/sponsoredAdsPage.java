package pages.sponsoredAds;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;

public class sponsoredAdsPage extends BasePage {


    public sponsoredAdsPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());


    //LOG IN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;

    @FindBy(how = How.CSS, using = "#sponsored-tab > span")
    public WebElement sponsoredAdsBtn;
    @FindBy(xpath = "//*[ text() = 'Add New' ]")
    public WebElement addNewBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div[3]/div/div/form/div/div[2]/div/input")
    public WebElement adsTextSector;
    @FindBy(how = How.CSS, using = "#adsLink")
    public WebElement adsLinkSector;
    @FindBy(how = How.CSS, using = "#img-0")
    public WebElement addImageBtn;
    @FindBy(how = How.CSS, using = "#start-date")
    public WebElement startDateSector;
    @FindBy(how = How.CSS, using = "#end-date")
    public WebElement endDateSector;
    @FindBy(how = How.CSS, using = "#ads-publish > span")
    public WebElement publishAddBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9.card-body.pr-4.py-2.py-sm-3 > div:nth-child(1) > div > div > button")
    public WebElement tabDotBtnTWO;
    @FindBy(how = How.CSS, using = "#inactive > div:nth-child(3) > div > div > div.col-7.col-md-8.col-lg-9.card-body.pr-4.py-2.py-sm-3 > div:nth-child(1) > div > div > div > a:nth-child(2)")
    public WebElement reactivateBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/div/a[2]")
    public WebElement deactivateBtn;
    @FindBy(how = How.CSS, using = "#inactive > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9.card-body.pr-4.py-2.py-sm-3 > div:nth-child(1) > div > div > div > a.dropdown-item.pending-pay")
    public WebElement payBtn;
    @FindBy(xpath = "//*[contains(text(), 'Pay')]")
    public WebElement pendingPayBtn;
    @FindBy(how = How.CSS, using = "#card-number")
    public WebElement cardNumberTextField;
    @FindBy(how = How.CSS, using = "#card-name")
    public WebElement cardNameTextField;
    @FindBy(how = How.CSS, using = "#expiry-date")
    public WebElement expirationDateTextField;
    @FindBy(how = How.CSS, using = "#\\#card-cvc")
    public WebElement cvvCodeTextField;
    @FindBy(how = How.CSS, using = ".btn > span:nth-child(2)")
    public WebElement submitPaymentBtn;
    @FindBy(how = How.CSS, using = "#ads-containter > div > div.row.mt-2 > div > div > div")
    public WebElement sortByBtn;
    @FindBy(how = How.CSS, using = "#ads-containter > div > div.row.mt-2 > div > div > div > div > a:nth-child(2)")
    public WebElement expireSLastBtn;
    @FindBy(xpath = "//*[contains(text(), 'Expires last')]")
    public WebElement expiresLastBtn;
    @FindBy(xpath = "//a[contains(text(), 'Edit')]")
    public WebElement editBtn;
    @FindBy(xpath = "//a[contains(text(), 'Delete')]")
    public WebElement deleteBtn;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight")
    public WebElement payingErrorMSG;

    @FindBy(how = How.CSS, using = "#ads-containter > div > div.row.mt-2 > div > div > div > div > a:nth-child(1)")
    public WebElement expiresFirstBtn;

    @FindBy(how = How.CSS, using = "#end-date")
    public WebElement endDate2;

    @FindBy(how = How.CSS, using = "#btn-crop")
    public WebElement cropBtn;

    @FindBy(xpath = "//*[@id='dropdown-item pending-pay']")
    public WebElement tabBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[1]/div[1]/h5/a/i")
    public WebElement activeTab;

    @FindBy(xpath = "/html/body/div[3]/main/div[2]/form/div/div[3]/div[1]/div[1]/div/span")
    public WebElement validationPrice;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/button")
    public WebElement tabEdit;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/button")
    public WebElement tabDelete;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement deleteConfirm;

    public void deleteConfirmButton() {
        fluentWait(getDriver(), deleteConfirm);
        waitForWebElementAndClick(deleteConfirm);
    }

    public void login2() {
        getDriver().navigate().to(url + "Account/Login");
        wait(4);
        actions.moveToElement(emailLoginInput);
        fluentWaitStrict(getDriver(), emailLoginInput);
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("makeanoffer@automation.com");
        fluentWait(getDriver(), passwordLoginInput);
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("Automation123@");
        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
    }

    public void setHomePage() {
        getDriver().navigate().to(url);
    }

    public void goToLoginPage() {
        getDriver().navigate().to(url + "/Account/Login");
    }


    public void goToDashboard() {
        getDriver().navigate().to(url + "/dashboard");
    }

    public void goToSponsoredAds() {
        fluentWait(getDriver(), sponsoredAdsBtn);
        waitForWebElementAndClick(sponsoredAdsBtn);
    }

    public boolean validateSponsoredPage() {
        boolean result = sponsoredAdsBtn.isDisplayed();
        return result;
    }

    public void addNewButton() {
        wait(4);
        fluentWaitStrict(getDriver(), addNewBtn);
        waitForWebElementAndClick(addNewBtn);
    }

    public void adInformationTextField() {
        actions.moveToElement(adsTextSector);
        fluentWait(getDriver(), adsTextSector);
        waitForWebElementAndClick(adsTextSector);
        adsTextSector.sendKeys("Automation");
        adsTextSector.clear();
        adsTextSector.sendKeys("Automation");
    }

    public void urlTextField() {
        fluentWait(getDriver(), adsLinkSector);
        waitForWebElementAndClick(adsLinkSector);
        adsLinkSector.sendKeys("https://www.webpagetest.org");
    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";

    public void addAnImage() {
        addImageBtn.sendKeys(EV_RESULT_FILE_PATH);
    }


    public void cropButton() {
        fluentWait(getDriver(), cropBtn);
        waitForWebElementAndClick(cropBtn);
    }

    public void adStartDateTextField() {
        fluentWait(getDriver(), startDateSector);
        waitForWebElementAndClick(startDateSector);
        startDateSector.sendKeys(Keys.ARROW_LEFT);
        startDateSector.sendKeys("12-25-2023");
        waitForWebElementAndClick(startDateSector);
    }

    public void adEndDateTextField() {
        fluentWait(getDriver(), endDateSector);
        waitForWebElementAndClick(endDateSector);
        startDateSector.sendKeys(Keys.ARROW_LEFT);
        startDateSector.sendKeys("09252025");
        waitForWebElementAndClick(startDateSector);
    }

    public void iSelectPublish() {
        waitForVisibility(publishAddBtn);
        waitForClickability(publishAddBtn);
        fluentWait(getDriver(), publishAddBtn);
        waitForWebElementAndClick(publishAddBtn);
    }


    public void iSelectTabDotsONE() {
        List<WebElement> tabDotsBtns = getDriver().findElements(By.xpath("//*[@class='btn dropdown-icon pt-0']"));
        for (WebElement dot : tabDotsBtns) {
            try {
                waitForWebElementAndClick(dot);
            } catch (Exception e) {
                wait(4);
                actions.moveToElement(dot).click().build().perform();
            }
            if (reactivateBtn.getText() == "Reactivate") {
                waitForWebElementAndClick(reactivateBtn);
                break;
            }
            dot.sendKeys(Keys.ESCAPE);

        }
    }

    public void tabButton() {
        List<WebElement> PendingPay = getDriver().findElements(By.xpath("//a[contains(text(), 'Pay')]"));
        try {
            if (PendingPay.size() == 0) {
                throw new Exception("the size is 0");
            }
        } catch (Exception e) {
            wait(3);
            PendingPay = getDriver().findElements(By.xpath("//a[contains(text(), 'Pay')]"));
        }

        for (WebElement pay : PendingPay) {
            getDriver().navigate().to(url + pay.getDomAttribute("href"));
            if (getDriver().getCurrentUrl().contains("/ad/checkout/")) {
                fluentWaitStrict(getDriver(), validationPrice);
                break;
            }
            getDriver().navigate().refresh();
        }
    }


    public void iSelectTabDotsEdit() {
        List<WebElement> tabDotsBtns = getDriver().findElements(By.xpath("//*[@class='btn dropdown-icon pt-0']"));
         fluentWait(getDriver(), tabEdit);
        waitForWebElementAndClick(tabEdit);
        for (WebElement dot : tabDotsBtns) {
            waitForWebElementAndClick(dot);

            if (editBtn.getText() == "Edit") {
                waitForWebElementAndClick(editBtn);
                break;
            }
        }
    }

    public void iSelectTabDotsDelete() {
        List<WebElement> tabDotsDelete = getDriver().findElements(By.xpath("//*[@class='btn dropdown-icon pt-0']"));
        fluentWait(getDriver(), tabDelete);
        waitForWebElementAndClick(tabDelete);
        for (WebElement dot : tabDotsDelete) {
            waitForWebElementAndClick(dot);

            if (tabDelete.getText() == "Delete") {
                waitForWebElementAndClick(tabDelete);
                break;
            }
        }
    }


    public void iSelectTabDotsTWO() {
        fluentWait(getDriver(), tabDotBtnTWO);
        waitForWebElementAndClick(tabDotBtnTWO);
    }

    public void deactivateAd() {
        waitForClickability(deactivateBtn);
        fluentWait(getDriver(), deactivateBtn);
        waitForWebElementAndClick(deactivateBtn);
    }

    public void payOption() {
        fluentWait(getDriver(), pendingPayBtn);
        waitForWebElementAndClick(pendingPayBtn);
    }


    public void cardNumberTXT() {
        fluentWait(getDriver(), cardNumberTextField);
        waitForWebElementAndClick(cardNumberTextField);
        cardNumberTextField.sendKeys("1111111111111111");
    }

    public void nameOnCardTXT() {
        fluentWait(getDriver(), cardNameTextField);
        waitForWebElementAndClick(cardNameTextField);
        cardNameTextField.sendKeys("Automation");
    }

    public void expirationDateTXT() {
        fluentWait(getDriver(), expirationDateTextField);
        waitForWebElementAndClick(expirationDateTextField);
        expirationDateTextField.sendKeys(Keys.ARROW_LEFT);
        expirationDateTextField.sendKeys("01/25");
    }

    public void cvvCodeTXT() {
        fluentWait(getDriver(), cvvCodeTextField);
        waitForWebElementAndClick(cvvCodeTextField);
        cvvCodeTextField.sendKeys("111");
    }

    public void iSubmitPendingPayment() {
        fluentWait(getDriver(), submitPaymentBtn);
        waitForWebElementAndClick(submitPaymentBtn);
    }

    public void ScortBy() {
        actions.moveToElement(sortByBtn).perform();
    }

    public void sortByButton() {
        fluentWait(getDriver(), sortByBtn);
        waitForWebElementAndClick(sortByBtn);
        waitForWebElementAndClick(sortByBtn);
    }


    public void expiresLastOption() {
        ScortBy();
        fluentWait(getDriver(), expireSLastBtn);
        waitForWebElementAndClick(expireSLastBtn);
       // actions.moveToElement(sortByBtn).perform();
        //waitForWebElementAndClick(expiresLastBtn);
    }

    public void editAd() {
        actions.moveToElement(editBtn);
        fluentWait(getDriver(), editBtn);
        waitForWebElementAndClick(editBtn);
    }

    public void deleteAd() {
        fluentWait(getDriver(), deleteBtn);
        waitForWebElementAndClick(deleteBtn);
    }

    public boolean payingErrorMSG() {
        boolean result = payingErrorMSG.isDisplayed();
        return result;
    }


    public void endDateField2() {
        fluentWait(getDriver(), endDate2);
        waitForWebElementAndClick(endDate2);
        endDate2.sendKeys(Keys.ARROW_LEFT);
        endDate2.sendKeys("12-26-2024");
    }
}

