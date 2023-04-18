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
    @FindBy(how = How.CSS, using = "#adsText")
    public WebElement adsTextSector;
    @FindBy(how = How.CSS, using = "#adsLink")
    public WebElement adsLinkSector;
    @FindBy(how = How.CSS, using = "#img-0")
    public WebElement addImageBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div[3]/div/div/form/div/div[4]/div/label/img")
    public WebElement addImageSponsoredAdsBtn;
    @FindBy(how = How.CSS, using = "#start-date")
    public WebElement startDateSelector;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(5) > div > div > div.col-7.col-md-8.col-lg-9.card-body.pr-4.py-2.py-sm-3 > div.row.mt-2 > div > span")
    public WebElement startDateView;
    @FindBy(how = How.CSS, using = "#end-date")
    public WebElement endDateSelector;
    @FindBy(how = How.CSS, using = "#ads-publish > span")
    public WebElement publishAddBtn;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9.card-body.pr-4.py-2.py-sm-3 > div:nth-child(1) > div > div > button")
    public WebElement tabDotBtnTWO;
    @FindBy(how = How.CSS, using = "#inactive > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9.card-body.pr-4.py-2.py-sm-3 > div:nth-child(1) > div > div > div > a:nth-child(2)")
    public WebElement reactivateBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/div/a[2]")
    public WebElement deactivateBtn;
    @FindBy(how = How.CSS, using = "#inactive > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9.card-body.pr-4.py-2.py-sm-3 > div:nth-child(1) > div > div > div > a.dropdown-item.pending-pay")
    public WebElement payBtn;
    @FindBy(xpath = "//*[contains(text(), 'Pay')]")
    public WebElement pendingPayBtn;
    @FindBy(xpath = "/html/body/div[4]/main/div[2]/form/div/div[2]/div/div/div[2]/input")
    public WebElement cardNumberTextField;
    @FindBy(xpath = "/html/body/div[4]/main/div[2]/form/div/div[2]/div/div/div[3]/div[1]/div/input")
    public WebElement cardNameTextField;
    @FindBy(xpath = "/html/body/div[4]/main/div[2]/form/div/div[2]/div/div/div[3]/div[2]/div/input")
    public WebElement expirationDateTextField;
    @FindBy(xpath = "/html/body/div[4]/main/div[2]/form/div/div[2]/div/div/div[3]/div[3]/div/input")
    public WebElement cvvCodeTextField;
    @FindBy(how = How.CSS, using = ".btn > span:nth-child(2)")
    public WebElement submitPaymentBtn;
    @FindBy(how = How.CSS, using = "#ads-containter > div > div.row.mt-2 > div > div > div")
    public WebElement sortByBtn;
    @FindBy(how = How.CSS, using = "#ads-containter > div > div.row.mt-2 > div > div > div > div > a:nth-child(2)")
    public WebElement expireSLastBtn;
    @FindBy(xpath = "//*[contains(text(), 'Expires last')]")
    public WebElement expiresLastBtn;
    @FindBy(xpath = "//a[contains(text(), 'Edit') and not(ancestor::div[contains(@style,'display: none')])]")
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

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/div/a[1]")
    public WebElement tabEdit;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/button")
    public WebElement tabDelete;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement deleteConfirm;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body > div.iziToast-texts > strong")
    public WebElement successPublishAdTxt;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body")
    public WebElement validateReactivateMessage;
    @FindBy(how = How.CSS, using = "#ads-form > div > div.col-auto.pt-5 > span")
    public WebElement priceAds;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9.card-body.pr-4.py-2.py-sm-3 > div:nth-child(1) > div > span")
    public WebElement activeFields;
    @FindBy(how = How.CSS, using = "#userPreview > span.user")
    public WebElement userNameView;
    @FindBy(how = How.CSS, using = "#textPreview")
    public WebElement numberOfCharacters;
    @FindBy(how = How.CSS, using = "#active > div:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9.card-body.pr-4.py-2.py-sm-3 > div.row.mt-2 > span")
    public WebElement validatePrice;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/button")
    public WebElement tabReactivate;

    @FindBy(xpath = "//span[ text() = 'PROFILE' ]")
    public WebElement profileTextValidate;

    public boolean validateProfileText() {
        boolean result = profileTextValidate.isDisplayed();
        return result;
    }

    public boolean validateReactivateTextMessage() {
        fluentWait(getDriver(), validateReactivateMessage);
        boolean result = validateReactivateMessage.isDisplayed();
        return result;
    }

    public boolean successPublishAdText() {
        fluentWait(getDriver(), successPublishAdTxt);
        boolean result = successPublishAdTxt.isDisplayed();
        return result;

    }

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
        fluentWait(getDriver(), sponsoredAdsBtn);
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
        try {
            fluentWait(getDriver(), addImageBtn);
            addImageBtn.sendKeys(EV_RESULT_FILE_PATH);
        } catch (Exception e) {
            wait(3);
            addImageBtn.sendKeys(EV_RESULT_FILE_PATH);
        }

    }


    public void cropButton() {
        fluentWait(getDriver(), cropBtn);
        waitForWebElementAndClick(cropBtn);
    }

    String startDate = "04-25-2023";

    public void adStartDateTextField() {
        fluentWait(getDriver(), startDateSelector);
        waitForWebElementAndClick(startDateSelector);

        startDateSelector.sendKeys(Keys.ARROW_LEFT);
        startDateSelector.sendKeys(startDate);
        waitForWebElementAndClick(startDateSelector);
    }

    String endDate = "04-25-2025";

    public void adEndDateTextField() {
        fluentWait(getDriver(), endDateSelector);
        waitForWebElementAndClick(endDateSelector);
        endDateSelector.sendKeys(Keys.ARROW_LEFT);
        endDateSelector.sendKeys(endDate);
        waitForWebElementAndClick(endDateSelector);
    }

    public void iSelectPublish() {
        waitForVisibility(publishAddBtn);
        waitForClickability(publishAddBtn);
        fluentWait(getDriver(), publishAddBtn);
        waitForWebElementAndClick(publishAddBtn);
    }


//    public void iSelectTabDotsONE() {
//        List<WebElement> tabDotsBtns = getDriver().findElements(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/button"));
//        for (WebElement dot : tabDotsBtns) {
//            try {
//                fluentWait(getDriver(), dot);
//                waitForWebElementAndClick(dot);
//            } catch (Exception e) {
//                wait(4);
//                actions.moveToElement(dot).click().build().perform();
//                wait(4);
//            }
//            if (reactivateBtn.getText() == "Reactivate") {
//                waitForWebElementAndClick(reactivateBtn);
//                break;
//            }
//            dot.sendKeys(Keys.ESCAPE);
//
//        }
//    }

    public void iSelectTabDotsONE() {
        fluentWait(getDriver(), tabReactivate);
        waitForWebElementAndClick(tabReactivate);

        fluentWait(getDriver(), reactivateBtn);
        waitForWebElementAndClick(reactivateBtn);
    }

    public void tabButton() {
        fluentWait(getDriver(), tabReactivate);
        waitForWebElementAndClick(tabReactivate);

        fluentWait(getDriver(), pendingPayBtn);
        waitForWebElementAndClick(pendingPayBtn);
//        List<WebElement> PendingPay = getDriver().findElements(By.xpath("//a[contains(text(), 'Pay')]"));
//        try {
//            if (PendingPay.size() == 0) {
//                throw new Exception("the size is 0");
//            }
//        } catch (Exception e) {
//            wait(3);
//            PendingPay = getDriver().findElements(By.xpath("//a[contains(text(), 'Pay')]"));
//        }
//
//        for (WebElement pay : PendingPay) {
//            String id = pay.getDomAttribute("id");
//            String replace = id.replace("-cat", "");
//            getDriver().navigate().to(url + "/listing/detail/" + replace);
//
//            getDriver().navigate().refresh();
//        }
    }


    public void iSelectTabDotsEdit() {
        List<WebElement> tabDotsBtns = getDriver().findElements(By.xpath("//*[@class='btn dropdown-icon pt-0']"));
        try {
            if (tabDotsBtns.size() == 0) {
                throw new Exception("the size is 0");
            }
        } catch (Exception e) {
            wait(3);
            tabDotsBtns = getDriver().findElements(By.xpath("//*[@class='btn dropdown-icon pt-0']"));
        }
        for (WebElement dot : tabDotsBtns) {
            try {
                waitForWebElementAndClick(dot);
                //waitForWebElementAndClick(tabEdit);
            } catch (Exception e) {
                wait(3);
                waitForWebElementAndClick(dot);
                //waitForWebElementAndClick(tabEdit);
            } finally {
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
        try {
            fluentWait(getDriver(), cardNumberTextField);
            waitForWebElementAndClick(cardNumberTextField);
            cardNumberTextField.sendKeys("4242 4242 4242 4242");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), cardNumberTextField);
            waitForWebElementAndClick(cardNumberTextField);
            cardNumberTextField.sendKeys("4242 4242 4242 4242");
        }

    }

    public void nameOnCardTXT() {
        try {
            fluentWait(getDriver(), cardNameTextField);
            waitForWebElementAndClick(cardNameTextField);
            cardNameTextField.sendKeys("Automation");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), cardNameTextField);
            waitForWebElementAndClick(cardNameTextField);
            cardNameTextField.sendKeys("Automation");
        }

    }

    public void expirationDateTXT() {
        try {
            fluentWait(getDriver(), expirationDateTextField);
            waitForWebElementAndClick(expirationDateTextField);
            expirationDateTextField.sendKeys(Keys.ARROW_LEFT);
            expirationDateTextField.sendKeys("01/25");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), expirationDateTextField);
            waitForWebElementAndClick(expirationDateTextField);
            expirationDateTextField.sendKeys(Keys.ARROW_LEFT);
            expirationDateTextField.sendKeys("01/25");
        }

    }

    public void cvvCodeTXT() {
        try {
            fluentWait(getDriver(), cvvCodeTextField);
            waitForWebElementAndClick(cvvCodeTextField);
            cvvCodeTextField.sendKeys("111");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), cvvCodeTextField);
            waitForWebElementAndClick(cvvCodeTextField);
            cvvCodeTextField.sendKeys("111");
        }

    }

    public void iSubmitPendingPayment() {
        try {
            fluentWait(getDriver(), submitPaymentBtn);
            waitForWebElementAndClick(submitPaymentBtn);
            fluentWait(getDriver(), payingErrorMSG);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), submitPaymentBtn);
            waitForWebElementAndClick(submitPaymentBtn);
        } finally {
            fluentWait(getDriver(), payingErrorMSG);
        }
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
        try {
            ScortBy();
            fluentWait(getDriver(), expireSLastBtn);
            waitForWebElementAndClick(expireSLastBtn);
        } catch (Exception e) {
            wait(3);
            ScortBy();
            fluentWait(getDriver(), expireSLastBtn);
            waitForWebElementAndClick(expireSLastBtn);
        }
        // actions.moveToElement(sortByBtn).perform();
        //waitForWebElementAndClick(expiresLastBtn);
    }

    public void editAd() {
        actions.moveToElement(editBtn);
        fluentWait(getDriver(), editBtn);
        waitForWebElementAndClick(editBtn);
    }

    public void deleteAd() {

        try {
            fluentWait(getDriver(), getDriver().findElement(By.id("inactive")));
            WebElement activeDiv = getDriver().findElement(By.id("inactive"));
            List<WebElement> elements = activeDiv.findElements(By.cssSelector("div.card.card-horizontal.listing-card-border"));
            WebElement lastElement = elements.get(elements.size() - 1);
            WebElement spanElement = lastElement.findElement(By.xpath("//a[contains(text(), 'Delete')]"));
            waitForClickability(spanElement);
            fluentWait(getDriver(), spanElement);
            waitForWebElementAndClick(spanElement);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), getDriver().findElement(By.id("inactive")));
            WebElement activeDiv = getDriver().findElement(By.id("inactive"));
            wait(2);
            List<WebElement> elements = activeDiv.findElements(By.cssSelector("div.card.card-horizontal.listing-card-border"));
            WebElement lastElement = elements.get(elements.size() - 1);
            wait(2);
            fluentWait(getDriver(), lastElement);
            WebElement spanElement = lastElement.findElement(By.xpath("//a[contains(text(), 'Delete')]"));
            waitForClickability(spanElement);
            fluentWait(getDriver(), spanElement);
            waitForWebElementAndClick(spanElement);
        }
    }

    public boolean payingErrorMSG() {
        try {
            boolean result = payingErrorMSG.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = payingErrorMSG.isDisplayed();
            return result;
        }
    }


    public void endDateField2() {
        fluentWait(getDriver(), endDate2);
        waitForWebElementAndClick(endDate2);
        endDate2.sendKeys(Keys.ARROW_LEFT);
        endDate2.sendKeys("12-26-2024");
    }

    public void validateStartDateField() {
        String startDateConvert = null;
        String startDateEdit = null;
        try {
            startDateConvert = startDate.replace("-", "/");
            fluentWait(getDriver(), getDriver().findElement(By.id("active")));
            WebElement activeDiv = getDriver().findElement(By.id("active"));
            List<WebElement> elements = activeDiv.findElements(By.cssSelector("div.card.card-horizontal.listing-card-border"));
            WebElement lastElement = elements.get(elements.size() - 1);
            WebElement spanElement = lastElement.findElement(By.cssSelector("span.cl-grey-dark.align-icon-text.fz-14"));
            String spanText = spanElement.getText();
            startDateEdit = spanText.replace("Start Date: ", "");
        } catch (Exception e) {
            wait(3);
            startDateConvert = startDate.replace("-", "/");
            fluentWait(getDriver(), getDriver().findElement(By.id("active")));
            WebElement activeDiv = getDriver().findElement(By.id("active"));
            wait(3);
            List<WebElement> elements = activeDiv.findElements(By.cssSelector("div.card.card-horizontal.listing-card-border"));
            WebElement lastElement = elements.get(elements.size() - 1);
            wait(3);
            WebElement spanElement = lastElement.findElement(By.cssSelector("span.cl-grey-dark.align-icon-text.fz-14"));
            String spanText = spanElement.getText();
            startDateEdit = spanText.replace("Start Date: ", "");
        }

        try {
            Assert.assertEquals(startDateConvert, startDateEdit);
        } catch (Exception e) {
            wait(3);
            Assert.assertEquals(startDateConvert, startDateEdit);
        }
    }


    public boolean validateThePriceOfAnAdvertisement() {
        try {
            boolean result = priceAds.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = priceAds.isDisplayed();
            return result;
        }

    }

    public String activeAds() {
        String result = activeFields.getText();
        return result;
    }

    public String validateUserName() {
        String result = userNameView.getText();
        return result;
    }

    public void completeTextField() {
        try {
            actions.moveToElement(adsTextSector);
            fluentWait(getDriver(), adsTextSector);
            waitForWebElementAndClick(adsTextSector);
            adsTextSector.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            adsTextSector.clear();
            adsTextSector.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), adsTextSector);
            adsTextSector.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            adsTextSector.clear();
            adsTextSector.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        }

    }

    public void validNumberOfCharacters() {
        Assert.assertEquals(numberOfCharacters.getText().length(), 100);
    }

    public void textItIsDisplayedInThePreview() {

        try {
            Assert.assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", numberOfCharacters.getText());
        } catch (Exception e) {
            wait(3);
            Assert.assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", numberOfCharacters.getText());
        }
    }
}





