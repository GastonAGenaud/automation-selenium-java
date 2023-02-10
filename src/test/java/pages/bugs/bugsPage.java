package pages.bugs;

import lombok.extern.java.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.random;

public class bugsPage extends BasePage {


    public bugsPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());

    //LOGIN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[4]/div/input[1]")
    public WebElement trackingTextField;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[4]/div/a")
    public WebElement submitBtn;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body > div.iziToast-texts > strong")
    public WebElement successMessage;

    @FindBy(xpath = "/html/body/div[3]/main/div/div/div/div[2]/form/div/div/div[2]/div[2]/table/tbody/tr[1]/th")
    public WebElement flatRateButton;

    @FindBy(how = How.CSS, using = "#listings-tab > span > span:nth-child(1)")
    public WebElement myListingsBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div/button/i")
    public WebElement itemDots;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/a[5]")
    public WebElement featureBtn;

    @FindBy(how = How.CSS, using = "#start-date")
    public WebElement startDateTextField;

    @FindBy(how = How.CSS, using = "#end-date")
    public WebElement endDateTextField;

    @FindBy(how = How.CSS, using = "#approved-tab > span")
    public WebElement ApprovedTab;

    @FindBy(how = How.CSS, using = "#row-main > div.col-lg-5.card-component > div > div > button")
    public WebElement featureListingsBtn;

    @FindBy(how = How.CSS, using = "#dashboard > div.row > div > div.row > div.col-lg-6.text-right > div > div.col-auto.ml-auto > a")
    public WebElement addListingsBtn;

    @FindBy(how = How.CSS, using = "#basic > div.d-flex.justify-content-between.align-items-center > button > span")
    public WebElement goToDetailsBtn;

    @FindBy(how = How.CSS, using = "#no-ship-tab > span > span:nth-child(1) > span")
    public WebElement noShippingTab;

    @FindBy(how = How.CSS, using = "#details > div.d-flex.justify-content-between.align-items-center > div")
    public WebElement publishButton;

    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > l" +
            "i.dropright.show > div > a:nth-child(2)")
    public WebElement settingsCompanyInfoBtn;

    @FindBy(how = How.CSS, using = "#template-219043 > td:nth-child(4) > div > a")
    public WebElement editTemplateBtn;

    @FindBy(how = How.CSS, using = "#templates-tab")
    public WebElement templatesEmails;

    @FindBy(how = How.CSS, using = "#googleLoginBtn")
    public WebElement loginGoogle;

    @FindBy(how = How.CSS, using = "#googleBtn")
    public WebElement googleBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/div[1]/div[1]/div[1]/div")
    public WebElement listingActive;

    @FindBy(how = How.CSS, using = "#btn-crop")
    public WebElement cropBtn;

    @FindBy(how = How.CSS, using = "#img-0")
    public WebElement listingImageUpload;

    @FindBy(how = How.CSS, using = "#closed-purchased > div:nth-child(1) > div > div > div > div.d-flex.flex-row.flex-wrap-reverse.align-items-center > div.d-flex.align-items-center.ml-auto.mb-2.justify-content-end > a:nth-child(1)")
    public WebElement downloadFileBtn;

    @FindBy(how = How.CSS, using = "body")
    public WebElement imageValidate;

    @FindBy(how = How.CSS, using = "#purchased-tab")
    public WebElement ordersPurchasedBtn;

    @FindBy(how = How.CSS, using = "#whole-container > main > div.px-sm-3.px-md-4.px-lg-5.py-4.pt-lg-5 > div > div > div.col-12.col-lg-5.pl-lg-3.pr-lg-0 > div.d-flex.flex-wrap.align-items-center.justify-content-start > button.own-btn.own-btn-md.btn-outline-primary.fz-16.font-weight-bold.mr-2.secondary-font.mb-3.btnAddToCart")
    public WebElement addToCartBtn;

    @FindBy(xpath = "/html/body/div[3]/main/div/div/div/div[2]/form/div[1]/div/div[2]/div[2]/div/div[1]/a")
    public WebElement addShippingAddressBtn;

    @FindBy(how = How.CSS, using = "#readed-holder > div:nth-child(1)")
    public WebElement userMessage;

    @FindBy(how = How.CSS, using = "#address-2087")
    public WebElement reUseAddressBtn;

    @FindBy(how = How.CSS, using = "#inbox-container")
    public WebElement inboxAboutText;

    @FindBy(how = How.CSS, using = "#navbar-nav > ul > li:nth-child(5) > a")
    public WebElement headerInboxIconBtn;

    @FindBy(how = How.CSS, using = "#settings-tab > span")
    public WebElement settingsTabButton;

    @FindBy(how = How.CSS, using = "#DisplayName")
    public WebElement firstNameTextField;

    @FindBy(how = How.CSS, using = "#saveChangesBtn")
    public WebElement saveChangesButton;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body > div.iziToast-texts > p")
    public WebElement successSavePopUp;

    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > h1")
    public WebElement userTransactionsText;

    @FindBy(how = How.CSS, using = "#profile-tab-content > div.card.card-settings.mt-4.location.px-3.px-sm-3.px-md-4.px-lg-5 > div > div.col-12.col-lg-8 > h5")
    public WebElement locationSectorText;

    @FindBy(how = How.CSS, using = "#location")
    public WebElement locationTextField;


    @FindBy(how = How.CSS, using = "#listing-img-8")
    public WebElement itemBug;

    @FindBy(how = How.CSS, using = "#reviews-tab > span")
    public WebElement reviewsTab;

    @FindBy(how = How.CSS, using = "#open-review")
    public WebElement leaveReviewBtn;

    @FindBy(how = How.CSS, using = "#seller-review")
    public WebElement yourReviewONE;

    @FindBy(how = How.CSS, using = "#listing-review")
    public WebElement yourReviewTWO;

    @FindBy(how = How.CSS, using = "#review-form > div.d-flex.justify-content-center > button")
    public WebElement sendBtn;

    @FindBy(how = How.CSS, using = "#review-form > div.card.border-0 > div > div > div.col-lg-6.mb-2.pr-lg-2 > div.d-flex.align-items-baseline > div > label:nth-child(2)")
    public WebElement fiveStars;

    @FindBy(how = How.CSS, using = "#review-form > div.card.border-0 > div > div > div.col-lg-6.mb-2.pl-lg-2 > div.d-flex.align-items-baseline > div > label:nth-child(2)")
    public WebElement fiveStarsTWO;

    @FindBy(xpath = "/html/body/div[3]/main/div[1]/div/div/div[2]/div[1]/div/div/a")
    public WebElement greatCarTxt;

    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[3]/div/div[1]/button")
    public WebElement coolTxt;

    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailTextField;

    @FindBy(how = How.CSS, using = "#signup-button")
    public WebElement signupBtn;

    @FindBy(how = How.CSS, using = "#username")
    public WebElement newUsernameBtn;

    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(8)")
    public WebElement logoAndFavicon;

    @FindBy(how = How.CSS, using = "#imgInp1")
    public WebElement uploadLogo;

    @FindBy(how = How.CSS, using = "#collapse-logo-favicon > div > div > div.col > h5.mt-4.fw-400.mb-0.fz-16")
    public WebElement desktopVersionTxt;

    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div.row.py-4 > div > div > h1")
    public WebElement connectDomainTxt;

    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div.container-fluid.bg-white.pb-5 > div:nth-child(4) > div > ul > li.d-flex.align-items-center.done > a > strong")
    public WebElement connectDomain;

    @FindBy(how = How.CSS, using = "#search")
    public WebElement filterSearchTextField;

    @FindBy(xpath = "/html/body/div[2]/div/main/section/div/div/div/div[1]/div/table/tbody/tr[1]/td[7]/select")
    public WebElement selectActionBtn;

    @FindBy(xpath = "/html/body/div[2]/div/main/section/div/div/div/div[1]/div/table/tbody/tr[1]/td[7]/select/option[6]")
    public WebElement deleteBtn;

    @FindBy(how = How.CSS, using = "#delete-user-modal > div > div > div > div.modal-footer > button.btn.btn-lg.btn-primary")
    public WebElement greenDeleteBtn;

    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div.col-6.offset-lg-2.text-left > h1")
    public WebElement usersText;

    @FindBy(how = How.CSS, using = "#basic > div:nth-child(2) > div.card-header.pb-0 > div.form-group.d-flex.align-items-center > label.switch.mr-2 > span")
    public WebElement variantsBtn;

    @FindBy(how = How.CSS, using = "#option-0 > div > div:nth-child(1) > div")
    public WebElement option1Tab;

    @FindBy(how = How.CSS, using = "#select-type-0 > option:nth-child(4)")
    public WebElement helloTest14Btn;

    @FindBy(how = How.CSS, using = "#option-0 > div > div.col-12.col-lg-6.col-xl-7.mb-3.mb-lg-0 > span > span.selection > span")
    public WebElement variantsTextField;

    @FindBy(how = How.CSS, using = "#variant-price-0")
    public WebElement variantsPriceTxt;

    @FindBy(how = How.CSS, using = "#variant-quantity-0")
    public WebElement variantsQuantityTxt;

    @FindBy(how = How.CSS, using = "#select2-variantselect-0-result-caak-141")
    public WebElement doesTxt;

    @FindBy(how = How.CSS, using = "#dashboard > div > div > div.card.py-4.secondary-font > div > img")
    public WebElement myListingsIcon;

    @FindBy(xpath = "/html/body/div[2]/div/aside/nav[2]/div[1]/ul/li[5]")
    public WebElement socialLinksButton;

    @FindBy(how = How.CSS, using = "#facebook-text")
    public WebElement facebookText;

    @FindBy(how = How.CSS, using = "#twitter-text")
    public WebElement twitterText;

    @FindBy(how = How.CSS, using = "#instagram-text")
    public WebElement instagramText;

    @FindBy(how = How.CSS, using = "#linkedin-text")
    public WebElement linkedinText;

    @FindBy(how = How.CSS, using = "#youtube-text")
    public WebElement youtubeText;

    @FindBy(how = How.CSS, using = "#collapse-social-links > div > form > div:nth-child(2) > h4")
    public WebElement socialLinksText;

    @FindBy(how = How.CSS, using = "#basic > div:nth-child(3) > div.card-body > p.title.requiredField")
    public WebElement mediaText;

    @FindBy(how = How.CSS, using = "#custom-0")
    public WebElement conditionOfItemTextField;

    @FindBy(how = How.CSS, using = "#customfield-holder > div:nth-child(2) > div")
    public WebElement departmentTab;

    @FindBy(how = How.CSS, using = "#custom-1 > option:nth-child(3)")
    public WebElement departmentMenOption;

    @FindBy(how = How.CSS, using = "#checkbox-2-0")
    public WebElement wouldOption;

    @FindBy(how = How.CSS, using = "#customfield-holder > div:nth-child(10) > div")
    public WebElement hello14Tab;

    @FindBy(how = How.CSS, using = "#custom-8 > option:nth-child(2)")
    public WebElement doesOption;

    @FindBy(how = How.CSS, using = "#custom-3")
    public WebElement ashTestTextField;

    @FindBy(how = How.CSS, using = "#custom-4")
    public WebElement ashNumberTextField;

    @FindBy(how = How.CSS, using = "#customfield-holder > div:nth-child(6) > div")
    public WebElement ashDropDownTab;

    @FindBy(how = How.CSS, using = "#custom-5 > option:nth-child(3)")
    public WebElement thisOption;

    @FindBy(how = How.CSS, using = "#checkbox-6-0")
    public WebElement ashCheckBoxWill;

    @FindBy(how = How.CSS, using = "#customfield-holder > div:nth-child(8) > div > div:nth-child(1) > span > label")
    public WebElement AshTagThis;

    @FindBy(how = How.CSS, using = "#customfield-holder > div:nth-child(9) > div > input[type=text]")
    public WebElement freeTaggingText;

    @FindBy(how = How.CSS, using = "#customfield-holder > div:nth-child(11) > div")
    public WebElement hello14TestTab;

    @FindBy(how = How.CSS, using = "#custom-9 > option:nth-child(2)")
    public WebElement hello14OptionsHello;

    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div:nth-child(1) > div > div.iziToast-body > div.iziToast-texts > p")
    public WebElement errorTextPublish;

    @FindBy(how = How.CSS, using = "#modal-cropper > div > div > div.modal-body")
    public WebElement cropAreaSector;
    @FindBy(how = How.CSS, using = "#imSellerSelector > div > label > div > div > p")
    public WebElement imSellerBtn;

    @FindBy(how = How.CSS, using = "#seller-buyer-button")
    public WebElement nextBtn;

    @FindBy(how = How.CSS, using = "#\\35 4")
    public WebElement howOld;

    @FindBy(how = How.CSS, using = "#\\35 5")
    public WebElement howMuch;

    @FindBy(how = How.CSS, using = "#\\35 6")
    public WebElement agreeTerms;

    @FindBy(how = How.CSS, using = "#\\35 7")
    public WebElement whereAreYou;

    @FindBy(how = How.CSS, using = "#submit-button")
    public WebElement submitBtn2;

    @FindBy(how = How.CSS, using = "#navbar-nav > ul > li:nth-child(5) > a > svg")
    public WebElement inboxBtn;

    @FindBy(how = How.CSS, using = "#openReadMessages > span")
    public WebElement readBtn;

    @FindBy(how = How.CSS, using = "#openReadMessages > span")
    public WebElement validateRead;

    @FindBy(how = How.CSS, using = "#container-block > div:nth-child(2) > a > div > div.card-body.position-relative > span.badge.badge-warning.badge-absolute-card.position-absolute")
    public WebElement seenTimesTxt;

    @FindBy(how = How.CSS, using = "#facebook")
    public WebElement loginFacebookBtn;

    @FindBy(how = How.CSS, using = "#welcomeUsername")
    public WebElement welcomeText;

    @FindBy(how = How.CSS, using = "#creditCards > h5")
    public WebElement validatePaymentText;

    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordTextField;

    @FindBy(how = How.CSS, using = "#register > div:nth-child(4) > div:nth-child(1) > span")
    public WebElement minimumPasswordTxt;

    @FindBy(how = How.CSS, using = "#sortby-select")
    public WebElement browseSortByBtn;

    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > button:nth-child(4)")
    public WebElement browseSortByDateNewerToOlderBtn;

    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > span")
    public WebElement validateNotBlurred;

    @FindBy(how = How.CSS, using = "#whole-container > main > div.bg-white.py-3.py-lg-5.px-lg-5 > div > div > div.col-12.col-sm-8.col-lg-9 > div.d-flex.justify-content-between.align-items-center.mb-3 > div.d-flex.align-items-center.justify-content-end.flex-wrap > div > div > div > a:nth-child(3)")
    public WebElement newerToOlderBtn;

    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > div.d-none.col-auto > a")
    public WebElement visualEditorHidden;

    @FindBy(how = How.CSS, using = "#listing-price")
    public WebElement validatePrice;

    @FindBy(how = How.CSS, using = "#main-admin > div.container-fluid.bg-white.pb-5 > div:nth-child(4) > div > ul > li:nth-child(3) > a")
    public WebElement emailStep;


    LogEntries logEntries = getDriver().manage().logs().get("browser");

    public boolean validateErrorConsole() {
        boolean result = true;
        for (LogEntry entry : logEntries) {
            String errorLogType = entry.getLevel().toString();
            String errorLog = entry.getMessage().toString();
            if (errorLog.contains("404")) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public void setTemplatesEmails() {
        fluentWait(getDriver(), templatesEmails);
        waitForWebElementAndClick(templatesEmails);
    }

    public void emailStep() {
        fluentWait(getDriver(), emailStep);
        waitForWebElementAndClick(emailStep);
    }

    public boolean validatePriceShowing() {
        return validatePrice.isDisplayed();
    }


    public void goToLoginPage() {
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/Account/Login");
    }

    public boolean validateVisualEditor() {
        return visualEditorHidden.isDisplayed();
    }

    public void newerToOlderButton() {
        fluentWait(getDriver(), newerToOlderBtn);
        waitForWebElementAndClick(newerToOlderBtn);
    }

    public String notBlurredText() {
        String result = validateNotBlurred.getText();
        return result;
    }

    public void browseSortByBtn() {
        actions.moveToElement(browseSortByBtn).perform();
    }

    public void sortByDateNewerToOlder() {
        browseSortByBtn();
    }

    public String minimumPasswordText() {
        String result = minimumPasswordTxt.getText();
        return result;
    }

    public void passwordTxt() {
        fluentWait(getDriver(), passwordTextField);
        waitForWebElementAndClick(passwordTextField);
        passwordTextField.sendKeys("Automation@321");
    }

    public String validatePaymentTxt() {
        String result = validatePaymentText.getText();
        return result;
    }

    public String welcomeTxt() {
        String result = welcomeText.getText();
        return result;
    }

    public void loginFacebookButton() {
        loginFacebookBtn.click();
    }

    public String seenTimesText() {
        String result = seenTimesTxt.getText();
        return result;

    }

    public String validateReadText() {
        String result = validateRead.getText();
        return result;
    }

    public void readSector() {
        fluentWait(getDriver(), readBtn);
        waitForWebElementAndClick(readBtn);
    }

    public void inboxButton() {
        fluentWait(getDriver(), inboxBtn);
        waitForWebElementAndClick(inboxBtn);
    }


    public void submitButton() {
        fluentWait(getDriver(), submitBtn2);
        waitForWebElementAndClick(submitBtn2);
        submitBtn2.click();

    }

    public void whereAreYouFrom() {
        fluentWait(getDriver(), whereAreYou);
        waitForWebElementAndClick(whereAreYou);
        whereAreYou.sendKeys("test");
    }

    public void termsAndConditions() {
        fluentWait(getDriver(), agreeTerms);
        waitForWebElementAndClick(agreeTerms);
        agreeTerms.sendKeys("Yes");
    }

    public void howMuchSell() {
        fluentWait(getDriver(), howMuch);
        waitForWebElementAndClick(howMuch);
        howMuch.sendKeys("test");
    }

    public void howOldAreYou() {
        fluentWait(getDriver(), howOld);
        waitForWebElementAndClick(howOld);
        howOld.sendKeys("18");
    }

    public void nextButton() {
        fluentWait(getDriver(), nextBtn);
        waitForWebElementAndClick(nextBtn);
    }

    public void imSellerButton() {
        fluentWait(getDriver(), imSellerBtn);
        waitForWebElementAndClick(imSellerBtn);
    }

    public void cropButton() {
        fluentWait(getDriver(), cropBtn);
        waitForWebElementAndClick(cropBtn);
    }


    public boolean cropArea() {
        return cropAreaSector.isDisplayed();
    }

    public String getErrorTextPublish() {
        String result = errorTextPublish.getText();
        return result;
    }

    public void setDoesOption() {
        fluentWait(getDriver(), doesOption);
        waitForWebElementAndClick(doesOption);
    }

    public void setHello14Tab() {
        fluentWait(getDriver(), hello14Tab);
        waitForWebElementAndClick(hello14Tab);
    }

    public void setWouldOption() {
        fluentWait(getDriver(), wouldOption);
        waitForWebElementAndClick(wouldOption);
    }

    public void setDepartmentMenOption() {
        fluentWait(getDriver(), departmentMenOption);
        waitForWebElementAndClick(departmentMenOption);
    }

    public void setDepartmentTab() {
        fluentWait(getDriver(), departmentTab);
        waitForWebElementAndClick(departmentTab);
        departmentTab.click();
    }


    public String getMediaText() {
        String result = mediaText.getText();
        return result;
    }

    public String setSocialLinksText() {
        String result = socialLinksText.getText();
        return result;
    }


    public String setYoutube() {
        String result = youtubeText.getText();
        return result;
    }

    public String setLinkedInText() {
        String result = linkedinText.getText();
        return result;
    }

    public String setInstagramText() {
        String result = instagramText.getText();
        return result;
    }

    public String setTwitterText() {
        String result = twitterText.getText();
        return result;
    }

    public String setFacebookText() {
        String result = facebookText.getText();
        return result;
    }

    public void setSocialLinksButton() {
        getDriver().navigate().to(url + "/Admin/application/LandingCustomize");
        fluentWait(getDriver(), socialLinksButton);
        waitForWebElementAndClick(socialLinksButton);
    }

    public boolean setMyListingsIcon() {
        boolean result = myListingsIcon.isDisplayed();
        return result;
    }

    public void setVariantsQuantityTxt() {
        fluentWait(getDriver(), variantsQuantityTxt);
        waitForWebElementAndClick(variantsQuantityTxt);
        variantsQuantityTxt.sendKeys("10");
    }

    public void setVariantsPriceTxt() {
        fluentWait(getDriver(), variantsPriceTxt);
        waitForWebElementAndClick(variantsPriceTxt);
        variantsPriceTxt.sendKeys("20");
    }

    public void setVariantsTextField() {
        fluentWait(getDriver(), variantsTextField);
        waitForWebElementAndClick(variantsTextField);
        variantsTextField.sendKeys("does");
        variantsTextField.sendKeys(Keys.ENTER);
    }

    public void setHelloTest14Btn() {
        fluentWait(getDriver(), helloTest14Btn);
        waitForWebElementAndClick(helloTest14Btn);
    }

    public void setOption1Tab() {
        fluentWait(getDriver(), option1Tab);
        waitForWebElementAndClick(option1Tab);
    }

    public void setVariantsBtn() {
        fluentWait(getDriver(), variantsBtn);
        waitForWebElementAndClick(variantsBtn);
    }

    public String usersText() {
        String result = usersText.getText();
        return result;
    }

    public void setGreenDeleteBtn() {
        fluentWait(getDriver(), greenDeleteBtn);
        waitForWebElementAndClick(greenDeleteBtn);
    }

    public void setDeleteBtn() {
        fluentWait(getDriver(), deleteBtn);
        waitForWebElementAndClick(deleteBtn);
    }

    public void setSelectActionBtn() {
        fluentWait(getDriver(), selectActionBtn);
        waitForWebElementAndClick(selectActionBtn);
    }

    public void getCloseChat() {
        try {
            getDriver().switchTo().frame(2);
            getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div/header/div/button[1]")).click();
            getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/header/div[1]/button")).click();
        } catch (ElementNotInteractableException e) {
            System.out.println("The support chat trow the next error: " + e);
        }
    }

    public void setFilterSearchTextField() {
        fluentWait(getDriver(), filterSearchTextField);
        waitForWebElementAndClick(filterSearchTextField);
        filterSearchTextField.sendKeys("Automation");
        filterSearchTextField.sendKeys(Keys.ENTER);

    }

    public void setUsersBtn() {
        getDriver().navigate().to(url + "/Admin/User");
    }

    public void connectDomain() {
        fluentWait(getDriver(), connectDomain);
        waitForWebElementAndClick(connectDomain);
    }

    public void goToAdminPanel() {
        getDriver().navigate().to(url + "/admin/application/GetStarted");
    }

    public String getConnectDomainTxt() {
        String result = connectDomainTxt.getText();
        return result;
    }

    public void refreshCache() {
        getDriver().manage().deleteAllCookies();
    }

    public String desktopVersionTxt() {
        String result = desktopVersionTxt.getText();
        return result;
    }

    public void setUploadLogo() {
        uploadLogo.sendKeys(EV_RESULT_FILE_PATH);
    }

    public void setLogoAndFavicon() {
        fluentWait(getDriver(), logoAndFavicon);
        waitForWebElementAndClick(logoAndFavicon);
    }

    public String randomEmail() {
        String id = rdm + Long.toString((int) random() * 1200);
        String email = (id + "automation@7r1ck.com");
        return email;
    }

    public void createAndLogin() {
        getDriver().navigate().to(url + "/Account/Register");

        String email = randomEmail();
        String id = rdm + Long.toString((int) random() * 1200);
        fluentWait(getDriver(), emailTextField);
        waitForWebElementAndClick(emailTextField);
        emailTextField.sendKeys(email);

        fluentWait(getDriver(), passwordLoginInput);
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("123456A!");

        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(id);

        fluentWait(getDriver(), signupBtn);
        waitForWebElementAndClick(signupBtn);


        goToListingPage();
    }

    public String setGreatCarTxt() {
        String result = greatCarTxt.getText();
        return result;
    }

    public String setCoolTxt() {
        String result = coolTxt.getText();
        return result;
    }

    public void setFiveStarsTWO() {
        fluentWait(getDriver(), fiveStarsTWO);
        waitForWebElementAndClick(fiveStarsTWO);

    }

    public void setFiveStars() {
        fluentWait(getDriver(), fiveStars);
        waitForWebElementAndClick(fiveStars);
    }

    public void setSendBtn() {
        fluentWait(getDriver(), sendBtn);
        waitForWebElementAndClick(sendBtn);
    }

    public void setYourReviewONE() {
        fluentWait(getDriver(), yourReviewONE);
        waitForWebElementAndClick(yourReviewONE);
        yourReviewONE.sendKeys("Great");
    }

    public void setYourReviewTWO() {
        fluentWait(getDriver(), yourReviewTWO);
        waitForWebElementAndClick(yourReviewTWO);
        yourReviewTWO.sendKeys("Cool");
    }

    public void setLeaveReviewBtn() {
        fluentWait(getDriver(), leaveReviewBtn);
        waitForWebElementAndClick(leaveReviewBtn);
    }

    public void setReviewsTab() {
        fluentWait(getDriver(), reviewsTab);
        waitForWebElementAndClick(reviewsTab);
    }

    public void setItemBug() {
        fluentWait(getDriver(), itemBug);
        waitForWebElementAndClick(itemBug);
    }


    public void goToListingPage() {
        getDriver().navigate().to(url + "/Listing/Browse");
    }

    public void setAdminButton() {
        getDriver().navigate().to(url + "/admin/application/GetStarted");
    }

    public void setLocationTextField() {
        fluentWait(getDriver(), locationTextField);
        waitForWebElementAndClick(locationTextField);
        locationTextField.sendKeys("32 Washington Street, Charleston, SC, USA");
    }

    public String setLocationSectorText() {
        String result = locationSectorText.getText();
        return result;
    }

    public String setSuccessSavePopUp() {
        String result = successSavePopUp.getText();
        return result;
    }

    public void setSaveChangesButton() {
        fluentWait(getDriver(), saveChangesButton);
        waitForWebElementAndClick(saveChangesButton);

    }

    public String userTransactionsConfirm() {
        String result = userTransactionsText.getText();
        return result;
    }

    public void setFirstNameTextField() {
        fluentWait(getDriver(), firstNameTextField);
        waitForWebElementAndClick(firstNameTextField);
        firstNameTextField.clear();
        waitForWebElementAndClick(firstNameTextField);
        firstNameTextField.sendKeys("Automationautomation4");
    }

    public void setSettingsTabButton() {
        fluentWait(getDriver(), settingsTabButton);
        waitForWebElementAndClick(settingsTabButton);
    }

    public boolean setInboxAboutText() {
        boolean result = inboxAboutText.isDisplayed();
        return result;
    }

    public void headerInbox() {
        fluentWait(getDriver(), headerInboxIconBtn);
        waitForWebElementAndClick(headerInboxIconBtn);

    }

    public void selectingUserMessage() {
        fluentWait(getDriver(), userMessage);
        waitForWebElementAndClick(userMessage);
    }

    public void setHomePage() {
        getDriver().navigate().to(url);
    }


//    public void setHomePageOhe() {
//        getDriver().navigate().to(base + "/Account/Login");
//    }


    public void selectPreviousAddress() {

        waitForVisibility(reUseAddressBtn);
        waitForClickability(reUseAddressBtn);
        fluentWait(getDriver(), reUseAddressBtn);
        waitForWebElementAndClick(reUseAddressBtn);
    }

    public void selectAddShippingAddress() {
        getDriver().get(url + "/order/ShoppingCart");
        waitForVisibility(addShippingAddressBtn);
        waitForClickability(addShippingAddressBtn);
        fluentWait(getDriver(), addShippingAddressBtn);
        waitForWebElementAndClick(addShippingAddressBtn);
    }

    public void goToItemBUG() {
        getDriver().navigate().to(url + "/listing/detail/531");
    }

    public void selectAddToCartBUG() {
        waitForVisibility(addToCartBtn);
        waitForClickability(addToCartBtn);

        fluentWait(getDriver(), addToCartBtn);
        waitForWebElementAndClick(addToCartBtn);
    }

    public void selectCartIconBUG() {
        getDriver().navigate().to(url + "/order/ShoppingCart");

        getDriver().navigate().to(url + "/order/ShoppingCart");
    }

    public boolean setImageValidate() {
        boolean result = imageValidate.isDisplayed();
        return result;
    }

    public void ordersPurchasedButton() {
        goToOrders();

        fluentWait(getDriver(), ordersPurchasedBtn);
        waitForWebElementAndClick(ordersPurchasedBtn);
    }

    public void downloadFileButton() {
        waitForVisibility(downloadFileBtn);
        waitForClickability(downloadFileBtn);
        fluentWait(getDriver(), downloadFileBtn);
        waitForWebElementAndClick(downloadFileBtn);
    }


    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/listing.jpeg";

    public void listingImageLoad() {

        listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
    }

    public void goToSignUp() {
        getDriver().navigate().to(url + "/Account/Register");
    }


    public void signUpWithGoogle() {
        waitForVisibility(googleBtn);
        waitForClickability(googleBtn);
        fluentWait(getDriver(), googleBtn);
        waitForWebElementAndClick(googleBtn);
    }

    public void setEditTemplateBtn() {
        fluentWait(getDriver(), editTemplateBtn);
        waitForWebElementAndClick(editTemplateBtn);
    }

    public boolean setGoogleLoginText() {
        boolean result = loginGoogle.isDisplayed();
        return result;
    }

    public boolean SetTemplateTab() {
        boolean result = templatesEmails.isDisplayed();
        return result;
    }

    public void setPublishButton() {
        fluentWait(getDriver(), publishButton);
        waitForWebElementAndClick(publishButton);
    }

    public void setNoShippingTab() {
        fluentWait(getDriver(), noShippingTab);
        waitForWebElementAndClick(noShippingTab);
    }

    public void setGoToDetailsBtn() {
        fluentWait(getDriver(), goToDetailsBtn);
        waitForWebElementAndClick(goToDetailsBtn);
    }

    public void setFeatureListingsBtn() {
        fluentWait(getDriver(), featureListingsBtn);
        waitForWebElementAndClick(featureListingsBtn);
    }

    public void setEndDateTextField() {
        fluentWait(getDriver(), endDateTextField);
        waitForWebElementAndClick(endDateTextField);
        endDateTextField.sendKeys("09/17/2023");
    }

    public void setStartDateTextField() {
        fluentWait(getDriver(), startDateTextField);
        waitForWebElementAndClick(startDateTextField);
        startDateTextField.sendKeys("09/17/2022");
    }

    public void setMyListingsBtn() {
        fluentWait(getDriver(), myListingsBtn);
        waitForWebElementAndClick(myListingsBtn);
    }

    public void setItemDots() {
        fluentWait(getDriver(), itemDots);
        waitForWebElementAndClick(itemDots);
    }

    public void setFeatureBtn() {
        fluentWait(getDriver(), featureBtn);
        waitForWebElementAndClick(featureBtn);
    }

    public void setTrackingTextField() {
        fluentWait(getDriver(), trackingTextField);
        trackingTextField.sendKeys("1234");
    }

    public void setSubmitBtn() {
        fluentWait(getDriver(), submitBtn);
        waitForWebElementAndClick(submitBtn);
    }

    public boolean setApprovedText() {
        boolean result = ApprovedTab.isDisplayed();
        return result;
    }

    public boolean setSuccessPopUp() {
        boolean result = successMessage.isDisplayed();
        return result;
    }

    public void setFlatButton() {
        fluentWait(getDriver(), flatRateButton);
        waitForWebElementAndClick(flatRateButton);
    }

    public void goBackToDashboard() {
        getDriver().navigate().to(url + "/dashboard/MyListings");

        //getDriver().navigate().to(url + "/Listing/Detail/619");
    }

    public void loginButton() {
        //getDriver().manage().window().maximize();

        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);


        waitForWebElementAndClick(emailLoginInput);
        waitForClickability(emailLoginInput);

        fluentWait(getDriver(), emailLoginInput);
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("gastongenaud@7r1ck.com");

        fluentWait(getDriver(), passwordLoginInput);
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("#NcUzbusYqu667gq");

        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
    }

    public void settingsCompanyInfo() {
        fluentWait(getDriver(), settingsCompanyInfoBtn);
        waitForWebElementAndClick(settingsCompanyInfoBtn);
    }

    public void addNewListing() {
        fluentWait(getDriver(), addListingsBtn);
        waitForWebElementAndClick(addListingsBtn);
    }

    public void setHomePageBUG() {
        getDriver().navigate().to(url);
        getDriver().navigate().to(url + "/Account/Login");
    }

    public void goToDashboard() {
        getDriver().navigate().to(url + "/dashboard");
    }

    public void goToOrders() {
        getDriver().navigate().to(url + "/order/MyOrders?");
    }

    public boolean listingActiveTab() {
        boolean result = listingActive.isDisplayed();
        return result;
    }

    @FindBy(xpath = "//a[text()='Download file']")
    public WebElement downloadFileXpathBtn;

    @FindBy(how = How.CSS, using = "#purchased-tab")
    public WebElement purchasedXpathBtn;

    @FindBy(how = How.CSS, using = "#settings-tab > span > span:nth-child(1)")
    public WebElement SelectSettings;

    @FindBy(how = How.CSS, using = "#cashout-tab > span > span:nth-child(1)")
    public WebElement SelectCaShout;

    @FindBy(how = How.CSS, using = "#container-stripe > div > a > span")
    public WebElement SelectPending;
    @FindBy(how = How.CSS, using = "#hv-root > div > div > main > div.db-ConsumerUIWrapper-left > div.db-ConsumerUIWrapper-left--sidebarCopy > span")
    public WebElement VerificationForm;

    @FindBy(xpath = "//*[@href='/order/detail?id=3689&tab=purchased']")
    public WebElement SeeDetails;

    @FindBy(how = How.CSS, using = "#inbox-container")
    public WebElement RespectivePage;

    @FindBy(how = How.CSS, using = "#product-0 > div.d-flex.align-items-center > div > a")
    public WebElement SeeMesSages;

    @FindBy(how = How.CSS, using = "#text-22")
    public WebElement SIGNUP_WELCOME_TITLE;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[2]/div/div/div[2]/section[40]/div/div/div/div[3]/button")
    public WebElement SaveBtn;
    @FindBy(how = How.CSS, using = "#text-23")
    public WebElement SIGNUP_WELCOME_DESCRIPTION;
    @FindBy(how = How.CSS, using = "#text-24")
    public WebElement SIGNUP_WELCOME_BUTTON_SELLER_TITLE;

    @FindBy(how = How.CSS, using = "#text-25")
    public WebElement SIGNUP_WELCOME_BUTTON_SELLER_DESCRIPTION;

    @FindBy(how = How.CSS, using = "#text-26")
    public WebElement SIGNUP_WELCOME_BUTTON_BUYER_TITLE;

    @FindBy(how = How.CSS, using = "#text-27")
    public WebElement SIGNUP_WELCOME_BUTTON_BUYER_DESCRIPTION;

    @FindBy(how = How.CSS, using = "#profile-img-loginbar")
    public WebElement LogOut;
    @FindBy(how = How.CSS, using = "#primary-nav-user > li.dropdown.mr-2.show > div > div:nth-child(7) > a")
    public WebElement LogOutBtn;
    @FindBy(how = How.CSS, using = "#welcomeUsername")
    public WebElement valideWelcomeText;

    @FindBy(how = How.CSS, using = "#text-8")
    public WebElement siteWordingContent;

    @FindBy(how = How.CSS, using = "#text-15")
    public WebElement siteWordingContentTwo;


    public void downloadFileXpath() {
        fluentWait(getDriver(), downloadFileXpathBtn);
        waitForWebElementAndClick(downloadFileXpathBtn);
    }


    public void validateDownloadFile() {

        getDriver().getWindowHandles().forEach(tab -> getDriver().switchTo().window(tab));
        String CurrentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(CurrentUrl, "https://rebornstorage.blob.core.windows.net/uploads/07b6bdb1-1ff0-4bf8-ae2f-79cd011f9846high-GC-702_HQ_2-300x400.webp");
    }

    public void loginPendingStripeUser() {
        getDriver().manage().window().maximize();
        getDriver().navigate().to(url + "/Account/Login");

        //setCloseLoginPopUp();

        waitForClickability(emailLoginInput);
        fluentWait(getDriver(), emailLoginInput);
        waitForWebElementAndClick(emailLoginInput);
        emailLoginInput.sendKeys("email316742189640390auto@trick.com");

        fluentWait(getDriver(), passwordLoginInput);
        waitForWebElementAndClick(passwordLoginInput);
        passwordLoginInput.sendKeys("#NcUzbusYqu667gq");

        fluentWait(getDriver(), logInBtn);
        waitForWebElementAndClick(logInBtn);
    }

    public void SelectSettings() {
        fluentWait(getDriver(), SelectSettings);
        waitForWebElementAndClick(SelectSettings);
    }

    public void SelectCaShout() {
        fluentWait(getDriver(), SelectCaShout);
        waitForWebElementAndClick(SelectCaShout);
    }

    public void SelectPending() {
        fluentWait(getDriver(), SelectPending);
        waitForWebElementAndClick(SelectPending);
    }

    public void VerificationForm() {
        actions.moveToElement(VerificationForm).build().perform();
        VerificationForm.isDisplayed();
    }

    public void SeeDetails() {
        //actions.moveToElement(SeeDetails).build().perform();
        fluentWait(getDriver(), SeeDetails);
        waitForWebElementAndClick(SeeDetails);
    }

    public void SeeMesSages() {
        actions.moveToElement(SeeMesSages).build().perform();
        fluentWait(getDriver(), SeeMesSages);
        waitForWebElementAndClick(SeeMesSages);
        SeeMesSages.click();
    }

    public void RespectivePage() {
        actions.moveToElement(RespectivePage).build().perform();
        RespectivePage.isDisplayed();
    }

    public void goToSiteWording() {
        getDriver().navigate().to("https://mtreborn-staging-auto-products.azurewebsites.net/admin/application/GlobalSettings");
        try {
            getDriver().switchTo().frame(2);

            getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div/header/div/button[1]")).click();
            getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/header/div[1]/button")).click();
        } catch (ElementNotInteractableException e) {
            System.out.println("The support chat trow the next error: " + e);
        }
    }

    public void SIGNUP_WELCOME_TITLE() {
        getDriver().manage().window().maximize();

        //setCloseLoginPopUp();

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,2000)");
        actions.moveToElement(siteWordingContent, 20, 20).click().build().perform();
        actions.moveToElement(siteWordingContent).click().build().perform();
        siteWordingContent.click();
        js.executeScript("arguments[0].scrollIntoView(true);", siteWordingContent);
        js.executeScript("window.scrollBy(0,10000)");

        js.executeScript("window.scrollBy(0,10000)");
        actions.moveToElement(siteWordingContentTwo).click().build().perform();
        siteWordingContentTwo.click();
        js.executeScript("arguments[0].scrollIntoView(true);", siteWordingContentTwo);
        js.executeScript("window.scrollBy(0,10000)");

        js.executeScript("window.scrollBy(0,10000)");
        String hidden = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
        ((JavascriptExecutor) getDriver()).executeScript(hidden, SIGNUP_WELCOME_TITLE);
        actions.moveToElement(SIGNUP_WELCOME_TITLE).build().perform();
        SIGNUP_WELCOME_TITLE.click();
        SIGNUP_WELCOME_TITLE.clear();
        SIGNUP_WELCOME_TITLE.sendKeys("Welcome!!!");

        SaveBtn.click();
    }

    public void SIGNUP_WELCOME_DESCRIPTION() {
        getDriver().manage().window().maximize();

        //setCloseLoginPopUp();

        waitForClickability(SIGNUP_WELCOME_DESCRIPTION);
        fluentWait(getDriver(), SIGNUP_WELCOME_DESCRIPTION);
        waitForWebElementAndClick(SIGNUP_WELCOME_DESCRIPTION);
        SIGNUP_WELCOME_DESCRIPTION.clear();
        SIGNUP_WELCOME_DESCRIPTION.sendKeys("Hi, What type of user do you want to be?");

        //SaveBtn.click();
    }

    public void SIGNUP_WELCOME_BUTTON_SELLER_TITLE() {
        getDriver().manage().window().maximize();

        //setCloseLoginPopUp();

        waitForClickability(SIGNUP_WELCOME_BUTTON_SELLER_TITLE);
        fluentWait(getDriver(), SIGNUP_WELCOME_BUTTON_SELLER_TITLE);
        waitForWebElementAndClick(SIGNUP_WELCOME_DESCRIPTION);
        SIGNUP_WELCOME_BUTTON_SELLER_TITLE.clear();
        SIGNUP_WELCOME_BUTTON_SELLER_TITLE.sendKeys("hi, I'm seller");

        //SaveBtn.click();
    }

    public void SIGNUP_WELCOME_BUTTON_SELLER_DESCRIPTION() {
        getDriver().manage().window().maximize();

        //setCloseLoginPopUp();

        waitForClickability(SIGNUP_WELCOME_BUTTON_SELLER_DESCRIPTION);
        fluentWait(getDriver(), SIGNUP_WELCOME_BUTTON_SELLER_DESCRIPTION);
        waitForWebElementAndClick(SIGNUP_WELCOME_BUTTON_SELLER_DESCRIPTION);
        SIGNUP_WELCOME_BUTTON_SELLER_DESCRIPTION.clear();
        SIGNUP_WELCOME_BUTTON_SELLER_DESCRIPTION.sendKeys("hi, Sellers can create listings and also buy from other sellers");

        //SaveBtn.click();
    }

    public void SIGNUP_WELCOME_BUTTON_BUYER_TITLE() {
        getDriver().manage().window().maximize();

        //setCloseLoginPopUp();

        waitForClickability(SIGNUP_WELCOME_BUTTON_BUYER_TITLE);

        fluentWait(getDriver(), SIGNUP_WELCOME_BUTTON_BUYER_TITLE);
        waitForWebElementAndClick(SIGNUP_WELCOME_BUTTON_BUYER_TITLE);
        SIGNUP_WELCOME_BUTTON_BUYER_TITLE.clear();
        SIGNUP_WELCOME_BUTTON_BUYER_TITLE.sendKeys("Hi, I'm buyer");

        //SaveBtn.click();
    }

    public void SIGNUP_WELCOME_BUTTON_BUYER_DESCRIPTION() {
        getDriver().manage().window().maximize();

        //setCloseLoginPopUp();

        waitForClickability(SIGNUP_WELCOME_BUTTON_BUYER_DESCRIPTION);
        SIGNUP_WELCOME_BUTTON_BUYER_DESCRIPTION.click();
        SIGNUP_WELCOME_BUTTON_BUYER_DESCRIPTION.clear();
        SIGNUP_WELCOME_BUTTON_BUYER_DESCRIPTION.sendKeys("Hi, Buyers can purchase listings and also create them");

        //SaveBtn.click();
    }

    public void LogOut() {
        actions.moveToElement(LogOut).build().perform();
        fluentWait(getDriver(), LogOut);
        waitForWebElementAndClick(LogOut);

    }

    public void valideWelcomeText() {
        String result = valideWelcomeText.getText();
        Assert.assertEquals(result, "Welcome!!!");
    }

}