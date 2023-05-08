package pages.developmentServices;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;


public class AdminPanelDevPage extends BasePage {
    public AdminPanelDevPage() {
        super();
    }

    Actions actions = new Actions(getDriver());

    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    //ADMIN PANEL
    @FindBy(how = How.CSS, using = "#menu-item-6447 > a")
    public WebElement pricingBtn;


    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(3)")
    public WebElement landingPageHeaderCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-header > div > form > div.col-12.py-2 > a")
    public WebElement landingPageCloseHeaderCustomizeBtn;
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(4)")
    public WebElement landingPageFooterCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-footer > div > form > div.col-12.py-2 > a")
    public WebElement landingPageCloseFooterCustomizeBtn;
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(5)")
    public WebElement landingPageSocialLinksCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-social-links > div > form > div.col-12.py-2 > a")
    public WebElement landingPageCloseSocialLinksCustomizeBtn;
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(6)")
    public WebElement landingPageFontsCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-fonts > div > form > div.col-12.py-2 > a")
    public WebElement landingPageCloseFontsCustomizeBtn;
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(7)")
    public WebElement landingPageColorsCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-colors > div > form > div.col-12.py-2 > a")
    public WebElement landingPageCloseColorsCustomizeBtn;
    @FindBy(how = How.CSS, using = "#sidebar-customize-template > div.container-customize-template.pt-4 > ul > li:nth-child(8)")
    public WebElement landingPageLogoAndFaviconCustomizeBtn;
    @FindBy(how = How.CSS, using = "#collapse-logo-favicon > div > div > div.col-12.py-2 > a")
    public WebElement landingPageCloseLogoAndFaviconCustomizeBtn;

    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > div > div > div > div.form-group.form-check.d-flex.justify-content-end > label.switch.mr-2.my-2")
    public WebElement customizeMenuOrderCheckBox;

    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(3) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeLoginPageFacebookBtn;
    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(4) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeLoginPageGoogleBtn;

    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(3) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeRegistrationPageFacebookBtn;
    @FindBy(how = How.CSS, using = "#form-login > div:nth-child(4) > label.switch.float-left.mb-0.mr-2.my-2")
    public WebElement customizeRegistrationPageGoogleBtn;

    @FindBy(how = How.CSS, using = "#infoTitle")
    public WebElement customizeTermsAndConditionsPageTitleTextBar;
    @FindBy(how = How.CSS, using = "#label-2")
    public WebElement customizeTermsAndConditionsPageAddNewFieldBtn;
    @FindBy(how = How.CSS, using = "#Title-static")
    public WebElement customizeTermsAndConditionsPageNewFieldTitleTextBar;
    @FindBy(how = How.CSS, using = "#Description-static")
    public WebElement customizeTermsAndConditionsPageDescriptionTextBar;


    @FindBy(how = How.CSS, using = "#li-settings > span")
    public WebElement settingsBtn;
    //Wording Site(Language)

    @FindBy(how = How.CSS, using = "#search")
    public WebElement siteWordingFilterTextBar;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > section > div.row.no-gutters.bg-white.border-b-gray > div > div > div.col-lg-9 > div > div > div.col-lg-2 > button")
    public WebElement siteWordingFilterBtn;
    @FindBy(how = How.CSS, using = "h1.mb-4")
    public WebElement faqText;


    @FindBy(how = How.CSS, using = "#search")
    public WebElement searchUserInput;

    @FindBy(how = How.CSS, using = "#display-name-7b1d49e4-942a-4a32-a976-ced874645f03")
    public WebElement userResultValidate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div.col-6.offset-lg-2")
    public WebElement siteWordingTxt;

    @FindBy(how = How.CSS, using = "#main-admin > section > div.row.no-gutters.bg-white.border-b-gray > div")
    public WebElement searchAndLenguage;

    @FindBy(how = How.CSS, using = "#main-admin > section > div.row.row-wordings.pt-4")
    public WebElement templateValidate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div")
    public WebElement settingsTitle;

    @FindBy(how = How.CSS, using = "#main-admin > section")
    public WebElement companyInfoSubscriptionInfo;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div")
    public WebElement stripeSettings;

    @FindBy(how = How.CSS, using = "#main-admin > section > div")
    public WebElement stripeTemplate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div")
    public WebElement seoSetupText;

    @FindBy(how = How.CSS, using = "#tabs")
    public WebElement tabs;

    @FindBy(how = How.CSS, using = "#landing-page > section")
    public WebElement siteMetaTagsTemplate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div.col-lg-6.offset-lg-2 > h1")
    public WebElement requestsTitle;

    @FindBy(how = How.CSS, using = "#main-admin > section > div.row.mb-lg-5")
    public WebElement requestsTemplate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div > h1")
    public WebElement browseConfigTitle;

    @FindBy(how = How.CSS, using = "#main-admin > section > div")
    public WebElement browseConfigTemplate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div.col-lg-6.offset-lg-2 > div > h1")
    public WebElement smsTitle;

    @FindBy(how = How.CSS, using = "#main-admin > div.py-4.b-top > div")
    public WebElement smsTemplate;

    @FindBy(how = How.CSS, using = "#main-admin > header > div > div.col-lg-6.offset-lg-2 > h1")
    public WebElement ordersTitle;
    @FindBy(how = How.CSS, using = "#main-admin > div.container-fluid.bg-white.pb-5 > div:nth-child(4) > div > ul > li:nth-child(3) > a")
    public WebElement stepEightBtn;
    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li:nth-child(5) > a")
    public WebElement automatedEmailsBtn;
    @FindBy(how = How.CSS, using = "#templates-tab")
    public WebElement templatesBtn;
    @FindBy(how = How.CSS, using = "#smtp-tab")
    public WebElement sMPTSettingsBtn;
    @FindBy(how = How.CSS, using = "#contact-footer-text-customize")
    public WebElement contactUsBtn;
    @FindBy(how = How.CSS, using = "#name-contactmessage")
    public WebElement nameTextField;
    @FindBy(how = How.CSS, using = "#email-contactmessage")
    public WebElement emailTextField;
    @FindBy(how = How.CSS, using = "#msg-contactmessage")
    public WebElement messageTextField;
    @FindBy(how = How.CSS, using = "#contactmessage > div.form-group.d-flex.justify-content-between.mt-5 > button")
    public WebElement sendBtn;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-bottomRight > div > div > div.iziToast-body > div.iziToast-texts > strong")
    public WebElement successText;

    public void setHomePage() {
        getDriver().navigate().to(UrlSVC);
    }

    public void goToAdminPanel() {
        getDriver().navigate().to(UrlSVC + "/admin/application/GetStarted");

//        getDriver().switchTo().frame(2);
//
//        getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div/header/div/button[1]")).click();
//        getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/header/div[1]/button")).click();
    }

    public void setUsersBtn() {
        getDriver().navigate().to(UrlSVC + "/Admin/User");
    }

    public void getCloseChat() {
        try {

            try {
                fluentWaitStrict(getDriver(), getDriver().findElement(By.xpath("//*[@id='webWidget']")));
                getDriver().switchTo().frame("webWidget");
                getDriver().findElement(By.xpath("//*[@aria-label='Minimizar widget']")).click();
            } catch (Exception e) {
                wait(6);
                getDriver().switchTo().frame("webWidget");
                getDriver().findElement(By.xpath("//*[@aria-label='Minimizar widget']")).click();
            }
        } catch (Exception e) {

        } finally {
            getDriver().switchTo().defaultContent();
        }

    }

    public void settings() {
        fluentWaitStrict(getDriver(), settingsBtn);
        actions.moveToElement(settingsBtn).build().perform();
    }

    public void siteWording() {
        settings();

        try {
            getCloseChat();
        } catch (Exception e) {
        }

        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/admin/application/GlobalSettings");
//        fluentWait(getDriver(), siteWordingBtn);
//        waitForWebElementAndClick(siteWordingBtn);

        settings();

        try {
            getCloseChat();
        } catch (Exception e) {
        }

        fluentWait(getDriver(), siteWordingFilterTextBar);
        waitForWebElementAndClick(siteWordingFilterTextBar);
        siteWordingFilterTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), siteWordingFilterBtn);
        waitForWebElementAndClick(siteWordingFilterBtn);
    }

    public void searchUser() {
        fluentWait(getDriver(), searchUserInput);
        searchUserInput.sendKeys("gastongenaud");
    }

    public void userResult() {
        fluentWait(getDriver(), userResultValidate);
        Assert.assertTrue(userResultValidate.isDisplayed());
    }

    public void goToDashboardServ() {
        getDriver().navigate().to(UrlDevServices + "/dashboard");

    }

    public void templateSector() {
        fluentWait(getDriver(), templateValidate);
        Assert.assertTrue(templateValidate.isDisplayed());
    }

    public void searchAndLanguageSection() {
        fluentWait(getDriver(), searchAndLenguage);
        Assert.assertTrue((searchAndLenguage.isDisplayed()));
    }

    public void siteWordingText() {
        fluentWait(getDriver(), siteWordingTxt);
        Assert.assertTrue(siteWordingTxt.isDisplayed());
    }

    public void companyInfo() {
        Assert.assertEquals(UrlDevServices + "admin/application/companyinfo", getDriver().getCurrentUrl());
    }

    public void selectStepEight() {
        try {
            fluentWait(getDriver(), stepEightBtn);
            waitForWebElementAndClick(stepEightBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), stepEightBtn);
            waitForWebElementAndClick(stepEightBtn);
        }
    }

    public void companyInfoSubscriptionSector() {
        fluentWait(getDriver(), companyInfoSubscriptionInfo);
        Assert.assertTrue(companyInfoSubscriptionInfo.isDisplayed());
    }

    public void settingsTitleSector() {
        fluentWait(getDriver(), settingsTitle);
        Assert.assertTrue(settingsTitle.isDisplayed());
    }

    public void stripeTemplateSector() {
        fluentWait(getDriver(), stripeTemplate);
        Assert.assertTrue(stripeTemplate.isDisplayed());
    }

    public void siteMetaTags() {
        Assert.assertEquals(UrlDevServices + "admin/application/MetaTags", getDriver().getCurrentUrl());
    }

    public void stripeSettingsSector() {
        fluentWait(getDriver(), stripeSettings);
        Assert.assertTrue(stripeSettings.isDisplayed());
    }

    public void siteTagsTemplate() {
        fluentWait(getDriver(), siteMetaTagsTemplate);
        Assert.assertTrue(siteMetaTagsTemplate.isDisplayed());
    }

    public void tabsSector() {
        fluentWait(getDriver(), tabs);
        Assert.assertTrue(tabs.isDisplayed());
    }

    public void seoSetupTxt() {
        fluentWait(getDriver(), seoSetupText);
        Assert.assertTrue(seoSetupText.isDisplayed());
    }

    public void requestsTemplateSector() {
        fluentWait(getDriver(), requestsTemplate);
        Assert.assertTrue(requestsTemplate.isDisplayed());
    }

    public void browseConfig() {
        Assert.assertEquals(UrlDevServices + "admin/application/BrowseConfig", getDriver().getCurrentUrl());
    }

    public void requestTitleText() {
        fluentWait(getDriver(), requestsTitle);
        Assert.assertTrue(requestsTitle.isDisplayed());
    }

    public void browseConfigTemplateSector() {
        fluentWait(getDriver(), browseConfigTemplate);
        Assert.assertTrue(browseConfigTemplate.isDisplayed());
    }

    public void BrowseConfigTxt() {
        fluentWait(getDriver(), browseConfigTitle);
        Assert.assertTrue(browseConfigTitle.isDisplayed());
    }

    public void smsSettings() {
        Assert.assertEquals(UrlDevServices + "admin/application/SmsSettings", getDriver().getCurrentUrl());
    }

    public void ordersSetup() {
        Assert.assertEquals(UrlDevServices + "admin/application/OrdersSetup", getDriver().getCurrentUrl());
    }

    public void ordersTitleText() {
        fluentWait(getDriver(), ordersTitle);
        Assert.assertTrue(ordersTitle.isDisplayed());
    }

    public void requestsSetup() {
        Assert.assertEquals(UrlDevProducts + "admin/application/RequestsSetup", getDriver().getCurrentUrl());
    }

    public void paymentInfo() {
        settings();

        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/admin/application/StripeSettings");

//        fluentWait(getDriver(), settingsPaymentInfoBtn);
//        waitForWebElementAndClick(settingsPaymentInfoBtn);
//
//        fluentWait(getDriver(), selectPaymentInfoBtn);
//        waitForWebElementAndClick(selectPaymentInfoBtn);
//
//        fluentWait(getDriver(), selectSitePaymentService);
//        waitForWebElementAndClick(selectSitePaymentService);
//
//        fluentWait(getDriver(), paymentInfoStripeSecretApiKeyTextField);
//        waitForWebElementAndClick(paymentInfoStripeSecretApiKeyTextField);
//        paymentInfoStripeSecretApiKeyTextField.sendKeys("Test Automation");
//
//        fluentWait(getDriver(), paymentInfoStripePublishableApiKeyTextField);
//        waitForWebElementAndClick(paymentInfoStripePublishableApiKeyTextField);
//        paymentInfoStripePublishableApiKeyTextField.sendKeys("Test Automation");
//
//        fluentWait(getDriver(), paymentInfoStripeConnectClientIdTextField);
//        waitForWebElementAndClick(paymentInfoStripeConnectClientIdTextField);
//        paymentInfoStripeConnectClientIdTextField.sendKeys("Test Automation");
    }

    public String validatetTemplates() {
        fluentWait(getDriver(), templatesBtn);
        String result = templatesBtn.getText();
        return result;
    }

    public String validateSMTPSettings() {
        fluentWait(getDriver(), sMPTSettingsBtn);
        String result = sMPTSettingsBtn.getText();
        return result;
    }

    public void selectNameField() {
        fluentWait(getDriver(), nameTextField);
        waitForWebElementAndClick(nameTextField);
        nameTextField.sendKeys("Automation");
    }

    public void selectEmailField() {
        fluentWait(getDriver(), emailTextField);
        waitForWebElementAndClick(emailTextField);
        emailTextField.sendKeys("gastongenaud@7r1ck.com");
    }

    public void selectMessage() {
        fluentWait(getDriver(), messageTextField);
        waitForWebElementAndClick(messageTextField);
        messageTextField.sendKeys("Automation test");
    }

    public void selectSend() {
        fluentWait(getDriver(), sendBtn);
        waitForWebElementAndClick(sendBtn);

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

    public void goToHomePage() {
        getDriver().navigate().to(UrlDevServices + "home");
    }

    public void selectContactUsSection() {
        try {
            fluentWait(getDriver(), contactUsBtn);
            waitForWebElementAndClick(contactUsBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), contactUsBtn);
            waitForWebElementAndClick(contactUsBtn);
        }

    }

    public void automatedEmailsSection() {
        try {
            fluentWait(getDriver(), automatedEmailsBtn);
            waitForWebElementAndClick(automatedEmailsBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), automatedEmailsBtn);
            waitForWebElementAndClick(automatedEmailsBtn);
        }
    }

    public void customizeLandingPage() {
        //designSection();
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/application/LandingCustomize#!");
    }

    public void customizeLandingPageHeader() {
        fluentWait(getDriver(), landingPageHeaderCustomizeBtn);
        waitForWebElementAndClick(landingPageHeaderCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseHeaderCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseHeaderCustomizeBtn);
    }

    public void customizeLandingPageFooter() {
        fluentWait(getDriver(), landingPageFooterCustomizeBtn);
        waitForWebElementAndClick(landingPageFooterCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseFooterCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseFooterCustomizeBtn);
    }

    public void customizeLandingPageSocialLinks() {
        fluentWait(getDriver(), landingPageSocialLinksCustomizeBtn);
        waitForWebElementAndClick(landingPageSocialLinksCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseSocialLinksCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseSocialLinksCustomizeBtn);
    }

    public void customizeLandingPageFonts() {
        fluentWait(getDriver(), landingPageFontsCustomizeBtn);
        waitForWebElementAndClick(landingPageFontsCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseFontsCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseFontsCustomizeBtn);
    }

    public void customizeLandingPageColors() {
        fluentWait(getDriver(), landingPageColorsCustomizeBtn);
        waitForWebElementAndClick(landingPageColorsCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseColorsCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseColorsCustomizeBtn);
    }

    public void customizeLandingPageLogo() {
        fluentWait(getDriver(), landingPageLogoAndFaviconCustomizeBtn);
        waitForWebElementAndClick(landingPageLogoAndFaviconCustomizeBtn);

        fluentWait(getDriver(), landingPageCloseLogoAndFaviconCustomizeBtn);
        waitForWebElementAndClick(landingPageCloseLogoAndFaviconCustomizeBtn);
        //closeLandingPage.click();
    }

    public void customizeMenu() {
        //designSection();
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Menu/Customize");
        fluentWait(getDriver(), customizeMenuOrderCheckBox);
        waitForWebElementAndClick(customizeMenuOrderCheckBox);
    }

    public void designSection() {
        //actions.moveToElement(designSectionBtn).build().perform();
    }

    public void smsTemplateSector() {
        fluentWait(getDriver(), smsTemplate);
        Assert.assertTrue(smsTemplate.isDisplayed());
    }

    public void smsTitleText() {
        fluentWait(getDriver(), smsTitle);
        Assert.assertTrue(smsTitle.isDisplayed());
    }

    public void customizeLogIn() {
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/application/LoginCustomize");

        fluentWait(getDriver(), customizeLoginPageFacebookBtn);
        waitForWebElementAndClick(customizeLoginPageFacebookBtn);

        fluentWait(getDriver(), customizeLoginPageGoogleBtn);
        waitForWebElementAndClick(customizeLoginPageGoogleBtn);
    }

    public void customizeSignUp() {
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/application/SignupCustomize");
        // customizeSignUpBtn.click();
        fluentWait(getDriver(), customizeRegistrationPageFacebookBtn);
        waitForWebElementAndClick(customizeRegistrationPageFacebookBtn);

        fluentWait(getDriver(), customizeRegistrationPageGoogleBtn);
        waitForWebElementAndClick(customizeRegistrationPageGoogleBtn);
    }

    public void customizeTermsAndConditions() {
        getDriver().navigate().to("https://mtreborn-dev-services.azurewebsites.net/Admin/application/TermsOfUseCustomize");
        //customizeTermsAndConditionsBtn.click();

        fluentWait(getDriver(), customizeTermsAndConditionsPageTitleTextBar);
        waitForWebElementAndClick(customizeTermsAndConditionsPageTitleTextBar);
        customizeTermsAndConditionsPageTitleTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeTermsAndConditionsPageAddNewFieldBtn);
        waitForWebElementAndClick(customizeTermsAndConditionsPageAddNewFieldBtn);

        fluentWait(getDriver(), customizeTermsAndConditionsPageNewFieldTitleTextBar);
        waitForWebElementAndClick(customizeTermsAndConditionsPageNewFieldTitleTextBar);
        customizeTermsAndConditionsPageNewFieldTitleTextBar.sendKeys("Test Automation");

        fluentWait(getDriver(), customizeTermsAndConditionsPageDescriptionTextBar);
        waitForWebElementAndClick(customizeTermsAndConditionsPageDescriptionTextBar);
        customizeTermsAndConditionsPageDescriptionTextBar.sendKeys("Test Automation");
    }

    public String faqConfirm() {
        String result = faqText.getText();
        return result;
    }
}
