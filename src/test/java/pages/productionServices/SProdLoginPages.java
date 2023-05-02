package pages.productionServices;


import freemarker.core._ArrayEnumeration;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;

import static java.lang.Math.random;


public class SProdLoginPages extends BasePage {
    public SProdLoginPages() {
        super();
    }

    Actions actions = new Actions(getDriver());
    String rdm = Long.toString(System.currentTimeMillis());
    String randomEmail = rdm + Long.toString((int) random() * 1200);
    String randomStr = RandomStringUtils.randomAlphabetic(20);
    @FindBy(how = How.CSS, using = "#login-content > div.d-flex.justify-content-between.mb-4 > h3")
    public WebElement loginTxt;
    @FindBy(how = How.CSS, using = "#facebook")
    public WebElement facebookText;
    @FindBy(how = How.CSS, using = "#container > div")
    public WebElement GoogleText;
    @FindBy(how = How.CSS, using = "body > header > nav > div > a > img")
    public WebElement logoQA;
    @FindBy(how = How.CSS, using = "#no-footer > div.d-flex.justify-content-between.mb-4 > h3")
    public WebElement SignUpText;
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailField;
    @FindBy(how = How.CSS, using = "#username")
    public WebElement usernameField;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordField;
    @FindBy(how = How.CSS, using = "#RXJyb3JQbGVhc2UlMjByZW1vdmUlMjBhbnklMjBzcGVjaWFsJTIwY2hhcmFjdGVycyUyMGZyb20lMjB5b3VyJTIwdXNlcm5hbWUucmVk > div.iziToast-body > div.iziToast-texts")
    public WebElement lastErrorValidate;
    @FindBy(how = How.CSS, using = "#seller-buyer-section > p")
    public WebElement validateText;
    @FindBy(xpath = "//div[@class='iziToast-texts']")
    public WebElement errorMessageSignUp;
    @FindBy(how = How.CSS, using = "#imSellerSelector > div > label > div > div")
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
    public WebElement submitBtn;
    @FindBy(xpath = "//h2[contains(text(), 'You haven’t created any listings yet')]")
    public WebElement validateFirstText;
    @FindBy(how = How.CSS, using = "#welcome > div > div > div > button > span")
    public WebElement closeBtnWindow;
    @FindBy(how = How.CSS, using = "#forgot-tab")
    public WebElement forgotYourPassword;
    @FindBy(how = How.CSS, using = "#e-mail-forgot")
    public WebElement forgotEmailField;
    @FindBy(how = How.CSS, using = "#email-sent > h3")
    public WebElement messageResetPassword;
    @FindBy(how = How.CSS, using = "#add-new-btn")
    public WebElement newListing;
    @FindBy(how = How.CSS, using = "#name")
    public WebElement listingName;
    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement categoryServ;
    @FindBy(how = How.CSS, using = "#\\32 5761")
    public WebElement relaxCategory;
    @FindBy(how = How.CSS, using = "#description")
    public WebElement descriptionServ;
    @FindBy(how = How.CSS, using = "#hourlyPrice")
    public WebElement hourlyPrice;
    @FindBy(how = How.CSS, using = "#img-0")
    public WebElement listingImageUpload;
    @FindBy(how = How.CSS, using = "#btn-crop")
    public WebElement cropBtn;
    @FindBy(how = How.CSS, using = "#go-detail-button")
    public WebElement goToDetailsBtn;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(1) > input")
    public WebElement textField;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(2) > div > input")
    public WebElement numberField;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(3) > div > select")
    public WebElement dropdownField;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(3) > div > select > option:nth-child(2)")
    public WebElement indoorOption;
    @FindBy(how = How.CSS, using = "#checkbox-3-0")
    public WebElement fatOption;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(5) > div.form-group > div > div > div:nth-child(2) > span > label > span")
    public WebElement blackOption;
    @FindBy(how = How.CSS, using = "#go-availability-button")
    public WebElement goToAvailabilityBtn;
    @FindBy(how = How.CSS, using = "#availability-tab-pane > div.d-flex.justify-content-between.align-items-center > div > button")
    public WebElement publishBtn;
    @FindBy(how = How.CSS, using = "#listings-tab")
    public WebElement myListingProd;
    @FindBy(how = How.CSS, using = "#settings-tab > span > span:nth-child(1)")
    public WebElement mySettingsProd;
    @FindBy(how = How.CSS, using = "#cashout-tab > span")
    public WebElement cashoutProd;
    @FindBy(how = How.CSS, using = "#container-stripe > div > a > span")
    public WebElement pendingProd;
    @FindBy(how = How.CSS, using = "#FirstName")
    public WebElement firstNameProd;
    @FindBy(how = How.CSS, using = "#LastName")
    public WebElement LastNameProd;
    @FindBy(how = How.CSS, using = "#DisplayName")
    public WebElement userNameProd;
    @FindBy(how = How.CSS, using = "#Email")
    public WebElement emailProd;
    @FindBy(how = How.CSS, using = "#PhoneNumber")
    public WebElement phoneNumberProd;
    @FindBy(how = How.CSS, using = "#saveChangesBtn")
    public WebElement SaveChangesBtnProd;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body > div.iziToast-texts > strong")
    public WebElement successText;
    @FindBy(how = How.CSS, using = "#browse-header-text-customize")
    public WebElement BrowseServicesBtn;
    @FindBy(how = How.CSS, using = "#hire-btn")
    public WebElement hireBtn;
    @FindBy(how = How.CSS, using = "#flatfee-deadline")
    public WebElement DeadlineField;
    @FindBy(how = How.CSS, using = "#form-hire > div:nth-child(7) > textarea")
    public WebElement descriptionField;
    @FindBy(how = How.CSS, using = "#modal-hire-btn")
    public WebElement hireSubmitBtn;
    @FindBy(how = How.CSS, using = "body > div > div.card.card-vertical.mb-3 > div > div.text-center > h3")
    public WebElement validateHireText;
    @FindBy(how = How.CSS, using = "#card-number")
    public WebElement cardNumberTextField;
    @FindBy(how = How.CSS, using = "#card-name")
    public WebElement cardNameTextField;
    @FindBy(how = How.CSS, using = "#expiry-date")
    public WebElement expirationDateTextField;
    @FindBy(how = How.CSS, using = "#card-cvc")
    public WebElement cvvCodeTextField;
    @FindBy(how = How.CSS, using = "#prepare-checkout")
    public WebElement submitPaymentBtn;
    @FindBy(how = How.CSS, using = "#dashboard-messages > a > div > div > div.col-lg-10.read-msg.pl-2")
    public WebElement messageSection;
    @FindBy(how = How.CSS, using = "#chat-message")
    public WebElement chatField;
    @FindBy(how = How.CSS, using = "#files")
    public WebElement messageImageUpload;
    @FindBy(how = How.CSS, using = "#sendmessage-btn")
    public WebElement sendMessageBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/section[1]/section[1]/section[1]/div/div[5]/div[1]/div/div/img")
    public WebElement validateSendMessage;
    @FindBy(how = How.CSS, using = "#want-container > a:nth-child(1) > div > div > div.col-7.col-md-8.col-lg-9 > div > p")
    public WebElement selectRequest;
    @FindBy(how = How.CSS, using = "#btn-apply")
    public WebElement selectApply;
    @FindBy(how = How.CSS, using = "#supply-apply-form > div:nth-child(6) > textarea")
    public WebElement messageField;
    @FindBy(how = How.CSS, using = "#supply-date")
    public WebElement startDateField;
    @FindBy(how = How.CSS, using = "#btn-supply-apply")
    public WebElement applyBtn;
    @FindBy(how = How.CSS, using = "#supply-endtime")
    public WebElement endTimeField;
    @FindBy(how = How.CSS, using = "#supply-endtime > option:nth-child(3)")
    public WebElement endTimeOption;
    @FindBy(xpath = "//a[contains(text(), 'Graphics & Design')]")
    public WebElement graphicsDesignBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(2) > span > label")
    public WebElement marketingBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(3) > span > label")
    public WebElement programmingTechBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(4) > span > label")
    public WebElement testingCategoryBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(5) > span > label")
    public WebElement softwareBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(6) > span > label")
    public WebElement techonologyBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(7) > span > label")
    public WebElement photographyBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > ul > li:nth-child(8) > span > label")
    public WebElement businessBtn;
    @FindBy(how = How.CSS, using = "#category-holder > div.mb-4.pt-3.level-0 > h3")
    public WebElement categoryText;
    @FindBy(xpath = "//*[contains(text(), 'Show more')]")
    public WebElement showMoreText;
    @FindBy(how = How.CSS, using = "#work-model-filters > li:nth-child(1) > span > label")
    public WebElement videoConferenceBtn;
    @FindBy(how = How.CSS, using = "#work-model-filters > li:nth-child(2) > span > label")
    public WebElement inPersonBtn;
    @FindBy(how = How.CSS, using = "#work-model-holder > div")
    public WebElement workModelText;
    @FindBy(how = How.CSS, using = "#manual-max")
    public WebElement maxPriceField;
    @FindBy(how = How.CSS, using = "#manual-min")
    public WebElement minPriceField;
    @FindBy(how = How.CSS, using = "#set-up-manually-btn")
    public WebElement applyFilterPriceBtn;
    @FindBy(how = How.CSS, using = "#filters-container > div:nth-child(4) > div.mb-4.mt-3.browse-price-manual-component > div > a")
    public WebElement applyFilterPriceButton;
    @FindBy(how = How.CSS, using = "#filters-container > div:nth-child(6)")
    public WebElement validatePriceSection;
    @FindBy(how = How.CSS, using = "#filters-container > div:nth-child(4)")
    public WebElement validatePriceSectionRequest;
    @FindBy(how = How.CSS, using = "#location")
    public WebElement locationField;
    @FindBy(how = How.CSS, using = "#filters-container > div.mb-4.location-cont.pt-3")
    public WebElement locationSection;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(1) > label > span")
    public WebElement purpleBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(2) > label > span")
    public WebElement lightBlueBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(3) > label > span")
    public WebElement blackBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(4) > label > span")
    public WebElement redBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(5) > label > span")
    public WebElement blueBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(6) > label > span")
    public WebElement greenBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(7) > label > span")
    public WebElement yellowBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(8) > label > span")
    public WebElement pinkBtn;
    @FindBy(how = How.CSS, using = "#colors-container > span:nth-child(9) > label > span")
    public WebElement brownBtn;
    @FindBy(how = How.CSS, using = "#colors-wrapper")
    public WebElement colorFilter;
    @FindBy(how = How.CSS, using = "#name")
    public WebElement nameField;
    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement categoryField;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div/div/div[3]/div[1]/div/div[1]/div[1]/div/div[2]/div/select/option[3]")
    public WebElement businesBtn;
    @FindBy(how = How.CSS, using = "#description")
    public WebElement listingDescriptionField;
    @FindBy(how = How.CSS, using = "#hourlyPrice")
    public WebElement priceField;
    @FindBy(how = How.CSS, using = "#url-0")
    public WebElement listingVideosField;
    @FindBy(how = How.CSS, using = "#videos-container > div > div > div.col.mr-2.p-0.d-flex.align-items-center.justify-content-start > a.cursor-pointer.add-video.ml-2")
    public WebElement addListingVideos;
    @FindBy(how = How.CSS, using = "#checkbox-0-3")
    public WebElement englishCheckout;
    @FindBy(how = How.CSS, using = "#checkbox-1-0")
    public WebElement remoteCheckout;
    @FindBy(how = How.CSS, using = "#checkbox-2-1")
    public WebElement financeCheckout;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(4) > div > select")
    public WebElement techSpecialtiesField;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(4) > div > select > option:nth-child(2)")
    public WebElement qAOption;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(5) > div > select")
    public WebElement testDropdownField;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(5) > div > select > option:nth-child(2)")
    public WebElement option1;
    @FindBy(how = How.CSS, using = "#customfield-container > div:nth-child(5) > div.form-group > div > div > div:nth-child(3) > span > label > span")
    public WebElement blackButton;
    @FindBy(how = How.CSS, using = "#multi-select-button")
    public WebElement weekdayField;
    @FindBy(how = How.CSS, using = "#weekday-options-container > li:nth-child(1) > a")
    public WebElement sundayOption;
    @FindBy(how = How.CSS, using = "#availableTimeFrom")
    public WebElement fromField;
    @FindBy(how = How.CSS, using = "#availableTimeFrom > option:nth-child(3)")
    public WebElement timeOption;
    @FindBy(how = How.CSS, using = "#availableTimeTo")
    public WebElement timeToField;
    @FindBy(how = How.CSS, using = "#availableTimeTo > option:nth-child(6)")
    public WebElement timeToOption;
    @FindBy(how = How.CSS, using = "#dates-form > div.col-4.mb-3.d-flex.justify-content-end.align-items-center > a > img")
    public WebElement addAvailable;
    @FindBy(xpath = "//h3[contains(text(), 'Great job! Your listing is under review and will be published soon.')]")
    public WebElement greatJobText;
    @FindBy(how = How.CSS, using = "#work-model-selector")
    public WebElement workModelField;
    @FindBy(how = How.CSS, using = "#work-model-selector > option:nth-child(2)")
    public WebElement videoConferenceOption;
    @FindBy(how = How.CSS, using = "#block-tab")
    public WebElement blockFilter;
    @FindBy(how = How.CSS, using = "#list-tab")
    public WebElement listFilter;
    @FindBy(how = How.CSS, using = "#map-tab")
    public WebElement mapFilter;
    @FindBy(how = How.CSS, using = "#search")
    public WebElement searchField;
    @FindBy(how = How.CSS, using = "#search-button")
    public WebElement searchBtn;
    @FindBy(how = How.CSS, using = "#NameOnCard")
    public WebElement nameOnCardTextField;
    @FindBy(how = How.CSS, using = "#payment-tab > span > span:nth-child(1)")
    public WebElement paymentSection;
    @FindBy(how = How.CSS, using = "#CardNumber")
    public WebElement cardOnNumberTextField;
    @FindBy(how = How.CSS, using = "#ExpirationDate")
    public WebElement expDateTextField;
    @FindBy(how = How.CSS, using = "#CVV")
    public WebElement securityCodeTextField;
    @FindBy(how = How.CSS, using = "#payment-tab-content > div:nth-child(2) > div > div:nth-child(3) > div.col-lg-6.d-flex.align-items-center > a > span")
    public WebElement addCreditCardBtn;
    @FindBy(how = How.CSS, using = "#creditCards > div > div > div.d-flex.justify-content-between.align-content-center.w-100 > div > a")
    public WebElement deleteBtn;
    @FindBy(how = How.CSS, using = "#security-tab > span > span:nth-child(1)")
    public WebElement passwordSection;
    @FindBy(how = How.CSS, using = "#Password")
    public WebElement newPasswordTextField;
    @FindBy(how = How.CSS, using = "#notifications-tab > span > span:nth-child(1)")
    public WebElement notificationsSection;
    @FindBy(how = How.CSS, using = "#container-sms-notifications > div > div:nth-child(1) > div > div > label.switch.switch-settings.ml-auto > span")
    public WebElement onSMSNotification;
    @FindBy(how = How.CSS, using = "#country-code")
    public WebElement countryCodeTextField;
    @FindBy(how = How.CSS, using = "#area-code")
    public WebElement areaCodeTextField;
    @FindBy(how = How.CSS, using = "#phone-number")
    public WebElement phoneNumberTextField;
    @FindBy(how = How.CSS, using = "#chk-terms-conditions")
    public WebElement checkoutAcceptTyC;
    @FindBy(how = How.CSS, using = "#save-info-notifications")
    public WebElement saveChangesBtnServProd;
    @FindBy(how = How.CSS, using = "#addresses-tab > span > span:nth-child(1)")
    public WebElement addressesSection;
    @FindBy(how = How.CSS, using = "#location-address")
    public WebElement addresLineTexField;
    @FindBy(how = How.CSS, using = "#locality-location-address")
    public WebElement cityTexField;
    @FindBy(how = How.CSS, using = "#StateNameLong-location-address")
    public WebElement stateTexField;
    @FindBy(how = How.CSS, using = "#ZipCode-location-address")
    public WebElement zIPTexField;
    @FindBy(how = How.CSS, using = "#Name")
    public WebElement nameAddressTexField;
    @FindBy(how = How.CSS, using = "#editName")
    public WebElement editNameAddressTexField;
    @FindBy(how = How.CSS, using = "#addresses-tab-content > div.card.card-settings.mt-4.work-experience.px-3.px-sm-3.px-md-4.px-lg-5 > div > div:nth-child(3) > div.col-lg-4.d-flex.align-items-center > a > span")
    public WebElement addAddressBtn;
    @FindBy(how = How.CSS, using = "#address > div > div > div > div:nth-child(2) > a.cl-primary.mr-3")
    public WebElement editAddressBtn;
    @FindBy(how = How.CSS, using = "#edit-address > div > div > div > div:nth-child(3) > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement acceptEditBtn;
    @FindBy(how = How.CSS, using = "#address > div > div > div > div:nth-child(2) > a:nth-child(2)")
    public WebElement deleteAddressBtn;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement acceptDeleteBtn;

    public void goToLogin() {
        getHomePageProd();
        getLoginPageProd();
    }

    public String validateLoginText() {
        try {
            fluentWait(getDriver(), loginTxt);
            String result = loginTxt.getText();
            return result;
        } catch (Exception e) {
            wait(5);
            String result = loginTxt.getText();
            return result;
        }
    }

    public String validateLoginFacebookText() {
        try {
            fluentWait(getDriver(), facebookText);
            String result = facebookText.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            String result = facebookText.getText();
            return result;
        }
    }

    public boolean validateLoginGoogleText() {
        getDriver().switchTo().frame(0);
        try {
            fluentWait(getDriver(), GoogleText);
            boolean result = GoogleText.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = GoogleText.isDisplayed();
            return result;
        } finally {
            getDriver().switchTo().defaultContent();
        }
    }

    public boolean logoQAProductionSite() {
        try {
            boolean result = logoQA.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = logoQA.isDisplayed();
            return result;
        }
    }

    public void goToSignUp() {
        getHomePageProd();
        getSignUpPageProd();
    }

    public String validateSignUpText() {
        try {
            fluentWait(getDriver(), SignUpText);
            String result = SignUpText.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            String result = SignUpText.getText();
            return result;
        }

    }

    public boolean validateEmail() {
        try {
            boolean result = emailField.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = emailField.isDisplayed();
            return result;
        }
    }

    public boolean usernameTextField() {
        try {
            boolean result = usernameField.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = usernameField.isDisplayed();
            return result;
        }
    }

    public boolean passwordTextField() {
        try {
            boolean result = passwordField.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(3);
            boolean result = passwordField.isDisplayed();
            return result;
        }
    }

    public void CreateAnAccountListingDetailsPROD(String text) {
        getDriver().navigate().to(urlServicesProd);

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
        newPasswordBtn.clear();
        newPasswordBtn.sendKeys("asdasdasq21231@A");

        fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), signUpBtn);
        fluentWait(getDriver(), signUpBtn);
        waitForWebElementAndClick(signUpBtn);

   /*     fluentWaitStrict(getDriver(), newUsernameBtn);
        fluentWait(getDriver(), newUsernameBtn);
        waitForWebElementAndClick(newUsernameBtn);
        newUsernameBtn.clear();
        newUsernameBtn.sendKeys(randomStr);

        fluentWaitStrict(getDriver(), signUpBtn);
        fluentWait(getDriver(), signUpBtn);
        waitForWebElementAndClick(signUpBtn);


        wait(4);
        //welcomeClose.click();

    */

    }

    public void CloseWindow() {
        try {
            fluentWait(getDriver(), closeBtnWindow);
            waitForWebElementAndClick(closeBtnWindow);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), closeBtnWindow);
            waitForWebElementAndClick(closeBtnWindow);
        }
    }

    public boolean validateLastError() {
        try {
            fluentWaitElementDisappears(getDriver(), lastErrorValidate);
            boolean result = lastErrorValidate.isDisplayed();
            return result;
        } catch (Exception e) {
            wait(4);
            fluentWait(getDriver(), validateText);
            boolean result = lastErrorValidate.isDisplayed();
            return result;
        } finally {
            fluentWait(getDriver(), validateText);
        }

    }

    public void imSellerButton() {
        try {
            actions.moveToElement(errorMessageSignUp).build().perform();
            fluentWaitElementDisappears(getDriver(), errorMessageSignUp);
            fluentWait(getDriver(), imSellerBtn);
            waitForWebElementAndClick(imSellerBtn);
            fluentWaitStrict(getDriver(), nextBtn);
        } catch (Exception e) {
            wait(4);
            fluentWait(getDriver(), imSellerBtn);
            waitForWebElementAndClick(imSellerBtn);
            retryingFindClick(imSellerBtn);
        } finally {
            fluentWaitStrict(getDriver(), nextBtn);
        }
    }

    public void nextButton() {
        fluentWaitStrict(getDriver(), nextBtn);
        waitForWebElementAndClick(nextBtn);
    }

    public boolean validateTextFirst() {
        fluentWait(getDriver(), validateFirstText);
        boolean result = validateFirstText.isDisplayed();
        return result;
    }

    public void completeFormSignUp() {
        try {
            fluentWait(getDriver(), howOld);
            waitForWebElementAndClick(howOld);
            //fluentWaitElementDisappears(getDriver(),errorMessageSignUp);
            howOld.sendKeys("18");
            howMuch.sendKeys("test");
            agreeTerms.sendKeys("Yes");
            whereAreYou.sendKeys("test");
            fluentWait(getDriver(), submitBtn);
            waitForWebElementAndClick(submitBtn);
//        retryingFindClick(submitBtn);
            validateTextFirst();
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), howOld);
            waitForWebElementAndClick(howOld);
            //fluentWaitElementDisappears(getDriver(),errorMessageSignUp);
            howOld.sendKeys("18");
            howMuch.sendKeys("test");
            agreeTerms.sendKeys("Yes");
            whereAreYou.sendKeys("test");
            fluentWait(getDriver(), submitBtn);
            waitForWebElementAndClick(submitBtn);
            validateTextFirst();
        }
    }

    public void forgotYourPassword() {
        try {
            fluentWait(getDriver(), forgotYourPassword);
            waitForWebElementAndClick(forgotYourPassword);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), forgotYourPassword);
            waitForWebElementAndClick(forgotYourPassword);
        }
    }

    public void enterTheEmail() {
        fluentWait(getDriver(), forgotEmailField);
        waitForWebElementAndClick(forgotEmailField);
        forgotEmailField.sendKeys("gastongenaud@7r1ck.com");
        forgotEmailField.sendKeys(Keys.ENTER);
    }

    public String validMessageToResetThePassword() {
        fluentWait(getDriver(), messageResetPassword);
        String result = messageResetPassword.getText();
        return result;
    }

    public void createNewListing() {
        try {
            fluentWait(getDriver(), newListing);
            waitForWebElementAndClick(newListing);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), newListing);
            waitForWebElementAndClick(newListing);
        }
    }

    public void enterTheName() {
        fluentWait(getDriver(), listingName);
        waitForWebElementAndClick(listingName);
        listingName.sendKeys("Test 1");
        listingName.sendKeys(Keys.ENTER);
    }

    public void enterCategory() {
        try {
            fluentWait(getDriver(), categoryServ);
            waitForWebElementAndClick(categoryServ);
            fluentWait(getDriver(), relaxCategory);
            waitForWebElementAndClick(relaxCategory);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), categoryServ);
            waitForWebElementAndClick(categoryServ);
            fluentWait(getDriver(), relaxCategory);
            waitForWebElementAndClick(relaxCategory);
        }
    }

    public void descriptionSection() {
        try {
            fluentWait(getDriver(), descriptionServ);
            waitForWebElementAndClick(descriptionServ);
            descriptionServ.sendKeys("Test 1");
            descriptionServ.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), descriptionServ);
            waitForWebElementAndClick(descriptionServ);
            descriptionServ.sendKeys("Test 1");
            descriptionServ.sendKeys(Keys.ENTER);
        }
    }

    public void hourlyPriceSection() {
        fluentWait(getDriver(), hourlyPrice);
        waitForWebElementAndClick(hourlyPrice);
        hourlyPrice.sendKeys("10");
        hourlyPrice.sendKeys(Keys.ENTER);
    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/listing.jpeg";

    public void listingImageLoad() {
        try {
            listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
            fluentWait(getDriver(), cropBtn);
        } catch (Exception e) {
            wait(3);
            listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
        }
    }

    public void cropButton() {
        fluentWaitStrict(getDriver(), cropBtn);
        waitForWebElementAndClick(cropBtn);
    }

    public void goToDetails() {
        try {
            fluentWait(getDriver(), goToDetailsBtn);
            waitForWebElementAndClick(goToDetailsBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), goToDetailsBtn);
            waitForWebElementAndClick(goToDetailsBtn);
        }
    }

    public void textCustomField() {
        fluentWait(getDriver(), textField);
        waitForWebElementAndClick(textField);
        textField.sendKeys("text 1");
        textField.sendKeys(Keys.ENTER);
    }

    public void numberCustomField() {
        fluentWait(getDriver(), numberField);
        waitForWebElementAndClick(numberField);
        numberField.sendKeys("1");
        numberField.sendKeys(Keys.ENTER);
    }

    public void dropdownCustomField() {
        try {
            fluentWait(getDriver(), dropdownField);
            waitForWebElementAndClick(dropdownField);
            fluentWait(getDriver(), indoorOption);
            waitForWebElementAndClick(indoorOption);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), dropdownField);
            waitForWebElementAndClick(dropdownField);
            fluentWait(getDriver(), indoorOption);
            waitForWebElementAndClick(indoorOption);
        }
    }

    public void checkboxCustomField() {
        try {
            fluentWait(getDriver(), fatOption);
            waitForWebElementAndClick(fatOption);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), fatOption);
            waitForWebElementAndClick(fatOption);
        }
    }

    public void colorPicker() {
        try {
            fluentWait(getDriver(), blackOption);
            waitForWebElementAndClick(blackOption);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), blackOption);
            waitForWebElementAndClick(blackOption);
        }
    }

    public void goToAvailability() {
        try {
            fluentWait(getDriver(), goToAvailabilityBtn);
            waitForWebElementAndClick(goToAvailabilityBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), goToAvailabilityBtn);
            waitForWebElementAndClick(goToAvailabilityBtn);
        }
    }

    public void publish() {
        try {
            fluentWait(getDriver(), publishBtn);
            waitForWebElementAndClick(publishBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), publishBtn);
            waitForWebElementAndClick(publishBtn);
        }
    }

    public void goToDashboardServ() {
        getDriver().navigate().to(urlServicesProd + "/dashboard");

    }

    public void selectMyListingsServProd() {
        try {
            fluentWait(getDriver(), myListingProd);
            waitForWebElementAndClick(myListingProd);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), myListingProd);
            waitForWebElementAndClick(myListingProd);
        }
    }

    public void goToSettingServ() {
        try {
            fluentWait(getDriver(), mySettingsProd);
            waitForWebElementAndClick(mySettingsProd);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), mySettingsProd);
            waitForWebElementAndClick(mySettingsProd);
        }
    }

    public void goToCashoutServ() {
        try {
            fluentWait(getDriver(), cashoutProd);
            waitForWebElementAndClick(cashoutProd);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), cashoutProd);
            waitForWebElementAndClick(cashoutProd);
        }
    }

    public String validConnectStipe() {
        fluentWait(getDriver(), pendingProd);
        String result = pendingProd.getText();
        return result;
    }

    public void enterFirstName() {
        try {
            fluentWait(getDriver(), firstNameProd);
            waitForWebElementAndClick(firstNameProd);
            firstNameProd.clear();
            firstNameProd.sendKeys("Gaston");
            firstNameProd.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), firstNameProd);
            waitForWebElementAndClick(firstNameProd);
            firstNameProd.clear();
            firstNameProd.sendKeys("Gaston");
            firstNameProd.sendKeys(Keys.ENTER);
        }

    }

    public void enterLastName() {
        try {
            fluentWait(getDriver(), LastNameProd);
            waitForWebElementAndClick(LastNameProd);
            LastNameProd.clear();
            LastNameProd.sendKeys("Genaud");
            LastNameProd.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), LastNameProd);
            waitForWebElementAndClick(LastNameProd);
            LastNameProd.clear();
            LastNameProd.sendKeys("Genaud");
            LastNameProd.sendKeys(Keys.ENTER);
        }
    }

    public void enterPhoneNumber() {
        try {
            fluentWait(getDriver(), phoneNumberProd);
            waitForWebElementAndClick(phoneNumberProd);
            phoneNumberProd.clear();
            phoneNumberProd.sendKeys("123456789");
            phoneNumberProd.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), phoneNumberProd);
            waitForWebElementAndClick(phoneNumberProd);
            phoneNumberProd.clear();
            phoneNumberProd.sendKeys("123456789");
            phoneNumberProd.sendKeys(Keys.ENTER);
        }
    }

    public void enterUsername() {
        try {
            fluentWait(getDriver(), userNameProd);
            waitForWebElementAndClick(userNameProd);
            userNameProd.clear();
            userNameProd.sendKeys("GastonUserProd");
            userNameProd.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), userNameProd);
            waitForWebElementAndClick(userNameProd);
            userNameProd.clear();
            userNameProd.sendKeys("GastonUserProd");
            userNameProd.sendKeys(Keys.ENTER);
        }
    }

    public void enterEmail() {
        try {
            fluentWait(getDriver(), emailProd);
            waitForWebElementAndClick(emailProd);
            emailProd.clear();
            emailProd.sendKeys("gastongenaud@7r1ck.com");
            emailProd.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), emailProd);
            waitForWebElementAndClick(emailProd);
            emailProd.clear();
            emailProd.sendKeys("gastongenaud@7r1ck.com");
            emailProd.sendKeys(Keys.ENTER);
        }
    }


    public void saveChanges() {
        try {
            fluentWait(getDriver(), SaveChangesBtnProd);
            waitForWebElementAndClick(SaveChangesBtnProd);
            retryingFindClick(SaveChangesBtnProd);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), SaveChangesBtnProd);
            waitForWebElementAndClick(SaveChangesBtnProd);
        }

    }

    public String validSaveProfile() {
        try {
            fluentWait(getDriver(), successText);
            String result = successText.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), successText);
            String result = successText.getText();
            return result;
        }

    }

    public void goToBrowseService() {
        try {
            fluentWait(getDriver(), BrowseServicesBtn);
            waitForWebElementAndClick(BrowseServicesBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), BrowseServicesBtn);
            waitForWebElementAndClick(BrowseServicesBtn);
        }
    }

    public void enterClassesValet() {
        getDriver().navigate().to(urlServicesProd + "Listing/DetailService/2163");
    }

    public void hireTheService() {
        try {
            fluentWait(getDriver(), hireBtn);
            waitForWebElementAndClick(hireBtn);
            fluentWait(getDriver(), DeadlineField);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), hireBtn);
            waitForWebElementAndClick(hireBtn);
        }
    }

    public void enterDeadline() {
        try {
            fluentWait(getDriver(), DeadlineField);
            waitForWebElementAndClick(DeadlineField);
            DeadlineField.sendKeys("10/12/2023");
            DeadlineField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), DeadlineField);
            waitForWebElementAndClick(DeadlineField);
            DeadlineField.sendKeys("10/12/2023");
            DeadlineField.sendKeys(Keys.ENTER);
        }
    }

    public void enterDescription() {
        try {
            fluentWait(getDriver(), descriptionField);
            waitForWebElementAndClick(descriptionField);
            descriptionField.sendKeys("text");
            descriptionField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), descriptionField);
            waitForWebElementAndClick(descriptionField);
            descriptionField.sendKeys("text");
            descriptionField.sendKeys(Keys.ENTER);
        }
    }

    public void enterHire() {
        try {
            fluentWait(getDriver(), hireSubmitBtn);
            waitForWebElementAndClick(hireSubmitBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), hireSubmitBtn);
            waitForWebElementAndClick(hireSubmitBtn);
        }
    }

    public String validateHireServices() {
        try {
            String result = validateHireText.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), validateHireText);
            String result = validateHireText.getText();
            return result;
        }


    }

    public void enterCardNumberServ() {
        try {
            fluentWait(getDriver(), cardNumberTextField);
            waitForWebElementAndClick(cardNumberTextField);
            cardNumberTextField.sendKeys("4242424242424242");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), cardNumberTextField);
            waitForWebElementAndClick(cardNumberTextField);
            cardNumberTextField.sendKeys("4242424242424242");
        }
    }

    public void enterNameOnCardServ() {
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

    public void enterExpirationDateServ() {
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

    public void enterCVVCodeServ() {
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

    public void iSubmitPendingPaymentServ() {
        try {
            fluentWait(getDriver(), submitPaymentBtn);
            waitForWebElementAndClick(submitPaymentBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), submitPaymentBtn);
            waitForWebElementAndClick(submitPaymentBtn);
        }
    }

    public void messageSection() {
        try {
            fluentWait(getDriver(), messageSection);
            waitForWebElementAndClick(messageSection);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), messageSection);
            waitForWebElementAndClick(messageSection);
        }
    }

    public void sendMessage() {
        try {
            fluentWait(getDriver(), chatField);
            waitForWebElementAndClick(chatField);
            chatField.clear();
            chatField.sendKeys("hi test");
            chatField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), chatField);
            waitForWebElementAndClick(chatField);
            chatField.clear();
            chatField.sendKeys("hi test");
            chatField.sendKeys(Keys.ENTER);
        }

    }

    public void sendMediaMessage() {
        try {
            fluentWait(getDriver(), messageImageUpload);
            messageImageUpload.sendKeys(EV_RESULT_FILE_PATH);
            fluentWait(getDriver(), cropBtn);

        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), messageImageUpload);
            messageImageUpload.sendKeys(EV_RESULT_FILE_PATH);
        }
    }

    public void sendMediaMessageAppendix() {
        try {
            fluentWait(getDriver(), chatField);
            waitForWebElementAndClick(chatField);
            chatField.clear();
            chatField.sendKeys("hi test");
            chatField.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), sendMessageBtn);
            waitForWebElementAndClick(sendMessageBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), chatField);
            waitForWebElementAndClick(chatField);
            chatField.clear();
            chatField.sendKeys("hi test");
            chatField.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), sendMessageBtn);
            waitForWebElementAndClick(sendMessageBtn);
        }
    }

    public boolean validateSendMessageIncludingMedia() {
        fluentWait(getDriver(), validateSendMessage);
        boolean result = validateSendMessage.isDisplayed();
        return result;
    }

    public void goToBrowseRequestServ() {
        getDriver().navigate().to(urlServicesProd + "Want/browse");
    }

    public void selectTheRequest() {
        try {
            fluentWait(getDriver(), selectRequest);
            waitForWebElementAndClick(selectRequest);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), selectRequest);
            waitForWebElementAndClick(selectRequest);
        }
    }

    public void selectApply() {
        try {
            fluentWait(getDriver(), selectApply);
            waitForWebElementAndClick(selectApply);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), selectApply);
            waitForWebElementAndClick(selectApply);
        }
    }

    public void enterMessage() {
        try {
            fluentWait(getDriver(), messageField);
            waitForWebElementAndClick(messageField);
            messageField.clear();
            messageField.sendKeys("Test");
            messageField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), messageField);
            waitForWebElementAndClick(messageField);
            messageField.clear();
            messageField.sendKeys("Test");
            messageField.sendKeys(Keys.ENTER);
        }
    }

    public void enterStartDate() {
        try {
            fluentWait(getDriver(), startDateField);
            waitForWebElementAndClick(startDateField);
            startDateField.clear();
            startDateField.sendKeys("05/29/2023");
            startDateField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), startDateField);
            waitForWebElementAndClick(startDateField);
            startDateField.clear();
            startDateField.sendKeys("05/29/2023");
            startDateField.sendKeys(Keys.ENTER);
        }
    }

    public void endTimeField() {
        try {
            fluentWait(getDriver(), endTimeField);
            waitForWebElementAndClick(endTimeField);
            fluentWait(getDriver(), endTimeOption);
            waitForWebElementAndClick(endTimeOption);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), endTimeField);
            waitForWebElementAndClick(endTimeField);
            fluentWait(getDriver(), endTimeOption);
            waitForWebElementAndClick(endTimeOption);
        }
    }

    public void applyField() {
        try {
            fluentWait(getDriver(), applyBtn);
            waitForWebElementAndClick(applyBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), applyBtn);
            waitForWebElementAndClick(applyBtn);
        }
    }

    public void graphicsDesignFilter() {
        try {
            fluentWait(getDriver(), graphicsDesignBtn);
            waitForWebElementAndClick(graphicsDesignBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), graphicsDesignBtn);
            waitForWebElementAndClick(graphicsDesignBtn);
        }

    }

    public void marketingFilter() {
        fluentWait(getDriver(), marketingBtn);
        waitForWebElementAndClick(marketingBtn);
    }

    public void programmingTechFilter() {
        fluentWait(getDriver(), programmingTechBtn);
        waitForWebElementAndClick(programmingTechBtn);
    }

    public void testingCategoryFilter() {
        fluentWait(getDriver(), testingCategoryBtn);
        waitForWebElementAndClick(testingCategoryBtn);
    }

    public void softwareFilter() {
        fluentWait(getDriver(), softwareBtn);
        waitForWebElementAndClick(softwareBtn);
    }

    public void techonologyFilter() {
        fluentWait(getDriver(), techonologyBtn);
        waitForWebElementAndClick(techonologyBtn);
    }

    public void businessFilter() {
        fluentWait(getDriver(), businessBtn);
        waitForWebElementAndClick(businessBtn);
    }

    public void photographyFilter() {
        fluentWait(getDriver(), photographyBtn);
        waitForWebElementAndClick(photographyBtn);
    }

    public String validateFilterSector() {
        fluentWait(getDriver(), categoryText);
        String result = categoryText.getText();
        return result;
    }


    public void shoreMoreSection() {
        try {
            fluentWait(getDriver(), showMoreText);
            waitForWebElementAndClick(showMoreText);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), showMoreText);
            waitForWebElementAndClick(showMoreText);
        }
    }

    public void VideoConferenceFilter() {
        fluentWait(getDriver(), videoConferenceBtn);
        waitForWebElementAndClick(videoConferenceBtn);
    }

    public void inPersonFilter() {
        fluentWait(getDriver(), inPersonBtn);
        waitForWebElementAndClick(inPersonBtn);
    }

    public String validateWorkModelSector() {
        fluentWait(getDriver(), workModelText);
        String result = workModelText.getText();
        return result;
    }

    public void maxPriceFilter() {
        fluentWait(getDriver(), maxPriceField);
        waitForWebElementAndClick(maxPriceField);
        maxPriceField.clear();
        maxPriceField.sendKeys("1000");

    }

    public void minPriceFilter() {
        fluentWait(getDriver(), minPriceField);
        waitForWebElementAndClick(minPriceField);
        minPriceField.clear();
        minPriceField.sendKeys("1");

    }

    public void applyFilterPrice() {
        fluentWait(getDriver(), applyFilterPriceBtn);
        waitForWebElementAndClick(applyFilterPriceBtn);
    }

    public void validatePriceFilter() {
        fluentWait(getDriver(), validatePriceSection);
        Assert.assertTrue(validatePriceSection.isDisplayed());

    }

    public void locationText() {
        fluentWait(getDriver(), locationField);
        locationField.sendKeys("2405 Montopolis Drive, Austin, TX, USA");
        locationField.sendKeys(Keys.ARROW_DOWN);
        locationField.sendKeys(Keys.ENTER);
    }

    public void validateLocationSection() {
        fluentWait(getDriver(), locationSection);
        Assert.assertTrue(locationSection.isDisplayed());
    }

    public void selectApplyButton() {
        fluentWait(getDriver(), applyFilterPriceButton);
        waitForWebElementAndClick(applyFilterPriceButton);
    }

    public void validatePriceFilterSectionRequest() {
        fluentWait(getDriver(), validatePriceSectionRequest);
        Assert.assertTrue(validatePriceSectionRequest.isDisplayed());
    }

    public void selectPurple() {
        fluentWait(getDriver(), purpleBtn);
        waitForWebElementAndClick(purpleBtn);
    }

    public void selectLightBlue() {
        fluentWait(getDriver(), lightBlueBtn);
        waitForWebElementAndClick(lightBlueBtn);
    }

    public void selectBlack() {
        fluentWait(getDriver(), blackBtn);
        waitForWebElementAndClick(blackBtn);
    }

    public void selectRed() {
        fluentWait(getDriver(), redBtn);
        waitForWebElementAndClick(redBtn);
    }

    public void selectBlue() {
        fluentWait(getDriver(), blueBtn);
        waitForWebElementAndClick(blueBtn);
    }

    public void selectGreen() {
        fluentWait(getDriver(), greenBtn);
        waitForWebElementAndClick(greenBtn);
    }

    public void selectYellow() {
        fluentWait(getDriver(), yellowBtn);
        waitForWebElementAndClick(yellowBtn);
    }

    public void selectPink() {
        fluentWait(getDriver(), pinkBtn);
        waitForWebElementAndClick(pinkBtn);
    }

    public void selectBrown() {
        fluentWait(getDriver(), brownBtn);
        waitForWebElementAndClick(brownBtn);
    }

    public void validColorFilterSection() {
        fluentWait(getDriver(), colorFilter);
        Assert.assertTrue(colorFilter.isDisplayed());
    }

    public void goToBrowseBySeller() {
        getDriver().navigate().to(urlServicesProd + "Listing/BrowseBySeller");
    }

    public void listingNameField() {
        fluentWait(getDriver(), nameField);
        waitForWebElementAndClick(nameField);
        nameField.sendKeys("Kenpachi");
        nameField.sendKeys(Keys.ENTER);
    }

    public void selectCategory() {
        try {
            fluentWait(getDriver(), categoryField);
            waitForWebElementAndClick(categoryField);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), categoryField);
            waitForWebElementAndClick(categoryField);
        }

    }

    public void businessCategory() {
        try {
            fluentWait(getDriver(), businesBtn);
            waitForWebElementAndClick(businesBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), businesBtn);
            waitForWebElementAndClick(businesBtn);
        }

    }

    public void listingDescriptionField() {
        fluentWait(getDriver(), listingDescriptionField);
        waitForWebElementAndClick(listingDescriptionField);
        listingDescriptionField.sendKeys("test");
        listingDescriptionField.sendKeys(Keys.ENTER);
    }

    public void listingPricePerHour() {
        fluentWait(getDriver(), priceField);
        waitForWebElementAndClick(priceField);
        priceField.sendKeys("10");
        priceField.sendKeys(Keys.ENTER);

    }

    public void listingAddImage() {
        try {
            listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
            fluentWait(getDriver(), cropBtn);
        } catch (Exception e) {
            wait(3);
            listingImageUpload.sendKeys(EV_RESULT_FILE_PATH);
        }
    }

    public void listingVideoURLField() {
        try {
            fluentWait(getDriver(), listingVideosField);
            waitForWebElementAndClick(listingVideosField);
            listingVideosField.sendKeys("https://www.youtube.com/watch?v=59_usZm0HRg&ab_channel=PatrickFarrington");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), listingVideosField);
            waitForWebElementAndClick(listingVideosField);
            listingVideosField.sendKeys("https://www.youtube.com/watch?v=59_usZm0HRg&ab_channel=PatrickFarrington");
        }

    }

    public void addVideoURL() {
        fluentWait(getDriver(), addListingVideos);
        waitForWebElementAndClick(addListingVideos);
    }

    public void listingLanguages() {
        fluentWait(getDriver(), englishCheckout);
        waitForWebElementAndClick(englishCheckout);
    }

    public void listingWorkModel() {
        fluentWait(getDriver(), remoteCheckout);
        waitForWebElementAndClick(remoteCheckout);

    }

    public void listingBusinessSpecialties() {
        fluentWait(getDriver(), financeCheckout);
        waitForWebElementAndClick(financeCheckout);

    }

    public void listingTechSpecialties() {
        fluentWait(getDriver(), techSpecialtiesField);
        waitForWebElementAndClick(techSpecialtiesField);
    }

    public void listingTechSpecialtiesOption() {
        try {
            fluentWaitStrict(getDriver(), qAOption);
            waitForWebElementAndClick(qAOption);
            qAOption.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWaitStrict(getDriver(), qAOption);
            waitForWebElementAndClick(qAOption);
        } finally {
            fluentWaitStrict(getDriver(), qAOption);
        }

    }

    public void listingDropdownFilter() {
        try {
            fluentWait(getDriver(), testDropdownField);
            waitForWebElementAndClick(testDropdownField);
            fluentWaitStrict(getDriver(), option1);
            waitForWebElementAndClick(option1);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), testDropdownField);
            waitForWebElementAndClick(testDropdownField);
            fluentWaitStrict(getDriver(), option1);
            waitForWebElementAndClick(option1);
        }

    }

    public void listingColorPicker() {
        fluentWait(getDriver(), blackButton);
        waitForWebElementAndClick(blackButton);
    }

    public void selectWeekday() {
        fluentWait(getDriver(), weekdayField);
        waitForWebElementAndClick(weekdayField);
        fluentWait(getDriver(), sundayOption);
        waitForWebElementAndClick(sundayOption);
    }

    public void selectFrom() {
        fluentWait(getDriver(), fromField);
        waitForWebElementAndClick(fromField);
        fluentWait(getDriver(), timeOption);
        waitForWebElementAndClick(timeOption);
    }

    public void selectTimeTo() {
        fluentWait(getDriver(), timeToField);
        waitForWebElementAndClick(timeToField);
        fluentWait(getDriver(), timeToOption);
        waitForWebElementAndClick(timeToOption);
    }

    public void selectAddTimeslot() {
        fluentWait(getDriver(), addAvailable);
        waitForWebElementAndClick(addAvailable);
    }

    public String GreatText() {
        try {
            fluentWaitStrict(getDriver(), greatJobText);
            String result = greatJobText.getText();
            return result;
        } catch (Exception e) {
            wait(6);
            fluentWaitStrict(getDriver(), greatJobText);
            String result = greatJobText.getText();
            return result;
        }
    }

    public void workModelSection() {
        fluentWait(getDriver(), workModelField);
        waitForWebElementAndClick(workModelField);
    }

    public void selectVideoConference() {
        fluentWait(getDriver(), videoConferenceOption);
        waitForWebElementAndClick(videoConferenceOption);
    }

    public void selectBlock() {
        fluentWait(getDriver(), blockFilter);
        waitForWebElementAndClick(blockFilter);
    }

    public void selectList() {
        fluentWait(getDriver(), listFilter);
        waitForWebElementAndClick(listFilter);

    }

    public void selectMap() {
        fluentWait(getDriver(), mapFilter);
        waitForWebElementAndClick(mapFilter);

    }

    public void serviceIncome() {
        fluentWait(getDriver(), searchField);
        waitForWebElementAndClick(searchField);
        searchField.sendKeys("Blouse");
    }

    public void selectSearch() {
        fluentWait(getDriver(), searchBtn);
        waitForWebElementAndClick(searchBtn);

    }

    public void selectPayment() {
        try {
            fluentWait(getDriver(), paymentSection);
            waitForWebElementAndClick(paymentSection);


        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), paymentSection);
            waitForWebElementAndClick(paymentSection);

        }

    }

    public void nameOnCardField() {
        try {
            fluentWait(getDriver(), nameOnCardTextField);
            waitForWebElementAndClick(nameOnCardTextField);
            nameOnCardTextField.sendKeys("Automation");
            nameOnCardTextField.sendKeys(Keys.ENTER);

        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), nameOnCardTextField);
            waitForWebElementAndClick(nameOnCardTextField);
            nameOnCardTextField.sendKeys("Automation");
            nameOnCardTextField.sendKeys(Keys.ENTER);
        }
    }

    public void cardNumberField() {
        try {
            fluentWait(getDriver(), cardOnNumberTextField);
            waitForWebElementAndClick(cardOnNumberTextField);
            cardOnNumberTextField.sendKeys("4242424242424242");
            cardOnNumberTextField.sendKeys(Keys.ENTER);

        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), cardOnNumberTextField);
            waitForWebElementAndClick(cardOnNumberTextField);
            cardOnNumberTextField.sendKeys("4242424242424242");
            cardOnNumberTextField.sendKeys(Keys.ENTER);
        }
    }

    public void expDateField() {
        try {
            fluentWait(getDriver(), expDateTextField);
            waitForWebElementAndClick(expDateTextField);
            expDateTextField.sendKeys("01/25");
            expDateTextField.sendKeys(Keys.ENTER);

        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), expDateTextField);
            waitForWebElementAndClick(expDateTextField);
            expDateTextField.sendKeys("01/25");
            expDateTextField.sendKeys(Keys.ENTER);
        }
    }

    public void securityCode() {
        try {
            fluentWait(getDriver(), securityCodeTextField);
            waitForWebElementAndClick(securityCodeTextField);
            securityCodeTextField.sendKeys("111");
            securityCodeTextField.sendKeys(Keys.ENTER);

        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), securityCodeTextField);
            waitForWebElementAndClick(securityCodeTextField);
            securityCodeTextField.sendKeys("111");
            securityCodeTextField.sendKeys(Keys.ENTER);
        }
    }

    public void addCreditCard() {
        try {
            fluentWait(getDriver(), addCreditCardBtn);
            waitForWebElementAndClick(addCreditCardBtn);


        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addCreditCardBtn);
            waitForWebElementAndClick(addCreditCardBtn);

        }
    }

    public void deleteCreditCard() {
        try {
            fluentWait(getDriver(), deleteBtn);
            waitForWebElementAndClick(deleteBtn);


        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), deleteBtn);
            waitForWebElementAndClick(deleteBtn);

        }
    }

    public void selectPassword() {
        try {
            fluentWait(getDriver(), passwordSection);
            waitForWebElementAndClick(passwordSection);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), passwordSection);
            waitForWebElementAndClick(passwordSection);
        }
    }

    public void newPasswordField() {
        try {
            fluentWait(getDriver(), newPasswordTextField);
            waitForWebElementAndClick(newPasswordTextField);
            newPasswordTextField.sendKeys("#NcUzbusYqu667gq");
            newPasswordTextField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), newPasswordTextField);
            waitForWebElementAndClick(newPasswordTextField);
            newPasswordTextField.sendKeys("#NcUzbusYqu667gq");
            newPasswordTextField.sendKeys(Keys.ENTER);
        }

    }

    public void selectNotifications() {
        try {
            fluentWait(getDriver(), notificationsSection);
            waitForWebElementAndClick(notificationsSection);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), notificationsSection);
            waitForWebElementAndClick(notificationsSection);
        }
    }

    public void activateSMSNotifications() {
        try {
            fluentWait(getDriver(), onSMSNotification);
            waitForWebElementAndClick(onSMSNotification);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), onSMSNotification);
            waitForWebElementAndClick(onSMSNotification);
        }
    }

    public void countryCodeField() {
        try {
            fluentWait(getDriver(), countryCodeTextField);
            waitForWebElementAndClick(countryCodeTextField);
            countryCodeTextField.sendKeys("+54");
            countryCodeTextField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), countryCodeTextField);
            waitForWebElementAndClick(countryCodeTextField);
            countryCodeTextField.sendKeys("+54");
            countryCodeTextField.sendKeys(Keys.ENTER);
        }
    }

    public void areaCode() {
        try {
            fluentWait(getDriver(), areaCodeTextField);
            waitForWebElementAndClick(areaCodeTextField);
            areaCodeTextField.sendKeys("351");
            areaCodeTextField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), areaCodeTextField);
            waitForWebElementAndClick(areaCodeTextField);
            areaCodeTextField.sendKeys("351");
            areaCodeTextField.sendKeys(Keys.ENTER);
        }
    }

    public void phoneNumberField() {
        try {
            fluentWait(getDriver(), phoneNumberTextField);
            waitForWebElementAndClick(phoneNumberTextField);
            phoneNumberTextField.sendKeys("2286803");
            phoneNumberTextField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), phoneNumberTextField);
            waitForWebElementAndClick(phoneNumberTextField);
            phoneNumberTextField.sendKeys("2286803");
            phoneNumberTextField.sendKeys(Keys.ENTER);
        }
    }

    public void acceptTermsAndConditions() {
        try {
            fluentWait(getDriver(), checkoutAcceptTyC);
            waitForWebElementAndClick(checkoutAcceptTyC);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), checkoutAcceptTyC);
            waitForWebElementAndClick(checkoutAcceptTyC);
        }

    }

    public void desactiveNotificationCheckout() {
        try {
            fluentWait(getDriver(), onSMSNotification);
            waitForWebElementAndClick(onSMSNotification);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), onSMSNotification);
            waitForWebElementAndClick(onSMSNotification);
        }
    }

    public void saveChangesNotifications() {
        try {
            fluentWait(getDriver(), saveChangesBtnServProd);
            waitForWebElementAndClick(saveChangesBtnServProd);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), saveChangesBtnServProd);
            waitForWebElementAndClick(saveChangesBtnServProd);
        }
    }

    public void selectAddressesSections() {
        try {
            fluentWait(getDriver(), addressesSection);
            waitForWebElementAndClick(addressesSection);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addressesSection);
            waitForWebElementAndClick(addressesSection);
        }
    }

    public void addressLineField() {
        try {
            fluentWait(getDriver(), addresLineTexField);
            waitForWebElementAndClick(addresLineTexField);
            addresLineTexField.sendKeys("723 Felspar Street");
            addresLineTexField.sendKeys(Keys.ESCAPE);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addresLineTexField);
            waitForWebElementAndClick(addresLineTexField);
            addresLineTexField.sendKeys("723 Felspar Street");
        }
    }

    public void cityField() {
        try {
            fluentWait(getDriver(), cityTexField);
            waitForWebElementAndClick(cityTexField);
            cityTexField.sendKeys("San Diego");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), cityTexField);
            waitForWebElementAndClick(cityTexField);
            cityTexField.sendKeys("San Diego");
        }
    }

    public void stateField() {
        try {
            fluentWait(getDriver(), stateTexField);
            waitForWebElementAndClick(stateTexField);
            stateTexField.sendKeys("California");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), stateTexField);
            waitForWebElementAndClick(stateTexField);
            stateTexField.sendKeys("California");
        }
    }

    public void zIPField() {
        try {
            fluentWait(getDriver(), zIPTexField);
            waitForWebElementAndClick(zIPTexField);
            zIPTexField.sendKeys("92109");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), zIPTexField);
            waitForWebElementAndClick(zIPTexField);
            zIPTexField.sendKeys("92109");

        }
    }

    public void nameThisAddress() {
        try {
            fluentWait(getDriver(), nameAddressTexField);
            waitForWebElementAndClick(nameAddressTexField);
            nameAddressTexField.sendKeys("Automation");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), nameAddressTexField);
            waitForWebElementAndClick(nameAddressTexField);
            nameAddressTexField.sendKeys("Automation");
        }
    }

    public void addAddress() {
        try {
            fluentWait(getDriver(), addAddressBtn);
            waitForWebElementAndClick(addAddressBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addAddressBtn);
            waitForWebElementAndClick(addAddressBtn);
        }
    }

    public void selectEdit() {
        try {
            fluentWait(getDriver(), editAddressBtn);
            waitForWebElementAndClick(editAddressBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), editAddressBtn);
            waitForWebElementAndClick(editAddressBtn);
        }
    }

    public void editAddress() {
        try {
            fluentWait(getDriver(), editNameAddressTexField);
            waitForWebElementAndClick(editNameAddressTexField);
            editNameAddressTexField.sendKeys(" Edit");
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), editNameAddressTexField);
            waitForWebElementAndClick(editNameAddressTexField);
            editNameAddressTexField.sendKeys(" Edit");
        }
    }

    public void acceptEditAddress() {
        try {
            fluentWait(getDriver(), acceptEditBtn);
            waitForWebElementAndClick(acceptEditBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), acceptEditBtn);
            waitForWebElementAndClick(acceptEditBtn);
        }
    }

    public void deleteSavedAddress() {
        try {
            fluentWait(getDriver(), deleteAddressBtn);
            waitForWebElementAndClick(deleteAddressBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), deleteAddressBtn);
            waitForWebElementAndClick(deleteAddressBtn);
        }
    }

    public void confirmDeleteAddress() {
        try {
            fluentWait(getDriver(), acceptDeleteBtn);
            waitForWebElementAndClick(acceptDeleteBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), acceptDeleteBtn);
            waitForWebElementAndClick(acceptDeleteBtn);
        }
    }
}
