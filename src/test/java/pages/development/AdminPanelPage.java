package pages.development;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;

public class AdminPanelPage extends BasePage {


    public AdminPanelPage() {
        super();
    }

    Actions actions = new Actions(getDriver());

    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div/div/div/div[1]/div/table/tbody/tr[1]/td[7]/select")
    public WebElement selectActionBtn;

    @FindBy(how = How.CSS, using = "#selecte991c557-2c61-4711-8752-f49138529bec > option:nth-child(4)")
    public WebElement impersonateBtn;

    @FindBy(how = How.CSS, using = "#navbar-nav > ul > li.dropdown.hidden-mobile > a")
    public WebElement impersonateValidate;

    @FindBy(how = How.CSS, using = "#search")
    public WebElement searchUserInput;

    @FindBy(how = How.CSS, using = "#display-name-3c5a88fb-a0b2-4ca5-a5ae-59f790fafbe6")
    public WebElement userResultValidate;

    @FindBy(how = How.CSS, using = "#filter")
    public WebElement filterBtn;

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

    public void ordersTitleText(){
        fluentWait(getDriver(), ordersTitle);
        Assert.assertTrue(ordersTitle.isDisplayed());
    }

    public void smsTemplateSector(){
        fluentWait(getDriver(), smsTemplate);
        Assert.assertTrue(smsTemplate.isDisplayed());
    }

    public void smsTitleText(){
        fluentWait(getDriver(), smsTitle);
        Assert.assertTrue(smsTitle.isDisplayed());
    }



    public void  browseConfigTemplateSector(){
        fluentWait(getDriver(), browseConfigTemplate);
        Assert.assertTrue(browseConfigTemplate.isDisplayed());
    }

    public void BrowseConfigTxt(){
        fluentWait(getDriver(), browseConfigTitle);
        Assert.assertTrue(browseConfigTitle.isDisplayed());
    }


    public void requestsTemplateSector() {
        fluentWait(getDriver(), requestsTemplate);
        Assert.assertTrue(requestsTemplate.isDisplayed());
    }


    public void requestTitleText() {
        fluentWait(getDriver(), requestsTitle);
        Assert.assertTrue(requestsTitle.isDisplayed());
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

    public void stripeTemplateSector() {
        fluentWait(getDriver(), stripeTemplate);
        Assert.assertTrue(stripeTemplate.isDisplayed());
    }

    public void stripeSettingsSector() {
        fluentWait(getDriver(), stripeSettings);
        Assert.assertTrue(stripeSettings.isDisplayed());
    }

    public void companyInfoSubscriptionSector() {
        fluentWait(getDriver(), companyInfoSubscriptionInfo);
        Assert.assertTrue(companyInfoSubscriptionInfo.isDisplayed());
    }

    public void settingsTitleSector() {
        fluentWait(getDriver(), settingsTitle);
        Assert.assertTrue(settingsTitle.isDisplayed());
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


    public void filterButton() {
        fluentWait(getDriver(), filterBtn);
        waitForWebElementAndClick(filterBtn);
    }

    public void userResult() {
        fluentWait(getDriver(), userResultValidate);
        Assert.assertTrue(userResultValidate.isDisplayed());
    }

    public void searchUser() {
        fluentWait(getDriver(), searchUserInput);
        searchUserInput.sendKeys("gastontrick");
    }

    public void impersonateValidation() {
        fluentWait(getDriver(), impersonateValidate);
        Assert.assertTrue(impersonateValidate.isDisplayed());
    }

    public void impersonateOption() {
        fluentWait(getDriver(), impersonateBtn);
        waitForWebElementAndClick(impersonateBtn);
    }

    public void selectActionButton() {
        fluentWait(getDriver(), selectActionBtn);
        waitForWebElementAndClick(selectActionBtn);
    }

    public void setUsersBtn() {
        getDriver().navigate().to(UrlProd + "/Admin/User");
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

        }
    }

    public void siteWording() {
        Assert.assertEquals(UrlProd + "admin/application/GlobalSettings", getDriver().getCurrentUrl());
    }

    public void companyInfo() {
        Assert.assertEquals(UrlProd + "admin/application/companyinfo", getDriver().getCurrentUrl());
    }

    public void paymentInfo() {
        Assert.assertEquals(UrlProd + "admin/application/StripeSettings", getDriver().getCurrentUrl());
    }

    public void siteMetaTags() {
        Assert.assertEquals(UrlProd + "admin/application/MetaTags", getDriver().getCurrentUrl());
    }

    public void requestsSetup() {
        Assert.assertEquals(UrlProd + "admin/application/RequestsSetup", getDriver().getCurrentUrl());
    }

    public void browseConfig() {
        Assert.assertEquals(UrlProd + "admin/application/BrowseConfig", getDriver().getCurrentUrl());
    }

    public void smsSettings() {
        Assert.assertEquals(UrlProd + "admin/application/SmsSettings", getDriver().getCurrentUrl());
    }

    public void ordersSetup() {
        Assert.assertEquals(UrlProd + "admin/application/OrdersSetup", getDriver().getCurrentUrl());
    }


}
