package pages.productionServices;


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

    }

}
