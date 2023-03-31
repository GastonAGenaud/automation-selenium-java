package pages.addons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class ServicesAddonsPage extends BasePage {


    public ServicesAddonsPage() {
        super();
    }


    Actions action = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());
    //LOGIN
    @FindBy(how = How.CSS, using = "#e-mail")
    public WebElement emailLoginInput;
    @FindBy(how = How.CSS, using = "#password")
    public WebElement passwordLoginInput;
    @FindBy(how = How.CSS, using = "#login > div.d-flex.justify-content-end.mt-4 > button")
    public WebElement logInBtn;

    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li:nth-child(11) > a > span")
    public WebElement addonBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > div.col-auto.pr-2 > a")
    public WebElement addNewAddOnsBtn;
    @FindBy(how = How.CSS, using = "#addon-feature")
    public WebElement addonServiceBtn;
    @FindBy(how = How.CSS, using = "#addon-feature > option:nth-child(6)")
    public WebElement featuredUsersServiceBtn;
    @FindBy(how = How.CSS, using = "#addon-feature > option:nth-child(8)")
    public WebElement subscriptionsServiceBtn;
    @FindBy(how = How.CSS, using = "#addon-feature > option:nth-child(11)")
    public WebElement orderAutoApprovalBtn;
    @FindBy(how = How.CSS, using = "#addon-title")
    public WebElement titleTextField;
    @FindBy(how = How.CSS, using = "#addon-desc")
    public WebElement descriptionTextField;
    @FindBy(how = How.CSS, using = "#addon-stripe-product-id")
    public WebElement stripeProductIdTextField;
    @FindBy(how = How.CSS, using = "#addon-videoUrl")
    public WebElement videoURLTextField;
    @FindBy(how = How.CSS, using = "#IsProduct")
    public WebElement productsCheckBox;
    @FindBy(how = How.CSS, using = "#img-0")
    public WebElement uploadImageBtn;
    @FindBy(how = How.CSS, using = "#addon-form > button")
    public WebElement addonSaveBtn;
    @FindBy(how = How.CSS, using = "#listingAddon > div > div:nth-child(4) > div.d-flex.justify-content-around.mb-2 > a:nth-child(1)")
    public WebElement addOnsEditBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div/div[2]/div/div[5]/div[1]/a[2]")
    public WebElement addOnsDeleteBtn;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement acceptDeleteBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/header/div/h1")
    public WebElement addonsMainTitle;

    public void login() {
        getDriver().manage().window().maximize();
        waitForClickability(emailLoginInput);

        emailLoginInput.click();
        emailLoginInput.sendKeys("dev@mymarketplacebuilder.com");

        passwordLoginInput.click();
        passwordLoginInput.sendKeys("uX$Z2Z4^Ye3z,2&A");

        logInBtn.click();
    }

    public String addonsValidate() {
        String result = addonsMainTitle.getText();
        return result;
    }

    public void goToLoginPage() {
        getDriver().navigate().to(UrlSVC + "/Account/Login");
    }

    public void goToAddonsPage() {
        getDriver().navigate().to(UrlSVC + "/admin/feature/addons");
    }

    public void selectAddAddon() {
        fluentWait(getDriver(), addNewAddOnsBtn);
        waitForWebElementAndClick(addNewAddOnsBtn);
    }

    public void serviceType() {
        fluentWait(getDriver(), addonServiceBtn);
        waitForWebElementAndClick(addonServiceBtn);
    }

    public void titleText() {
        fluentWait(getDriver(), titleTextField);
        waitForWebElementAndClick(titleTextField);
        titleTextField.clear();
        fluentWait(getDriver(), titleTextField);
        waitForWebElementAndClick(titleTextField);
        titleTextField.sendKeys("Automation Test");
    }

    public void descriptionText() {
        fluentWait(getDriver(),descriptionTextField);
        waitForWebElementAndClick(descriptionTextField);
        descriptionTextField.clear();
        fluentWait(getDriver(), descriptionTextField);
        waitForWebElementAndClick(descriptionTextField);
        descriptionTextField.sendKeys("Automation Test");
    }

    public void stripeProductIdText() {
        fluentWait(getDriver(), stripeProductIdTextField);
        waitForWebElementAndClick(stripeProductIdTextField);
        stripeProductIdTextField.clear();
        fluentWait(getDriver(),stripeProductIdTextField);
        waitForWebElementAndClick(stripeProductIdTextField);
        stripeProductIdTextField.sendKeys("prod_L0ORJpYOlLTpqI");
    }

    public void videoURLText() {
        fluentWait(getDriver(), videoURLTextField);
        waitForWebElementAndClick(videoURLTextField);
        videoURLTextField.clear();
        fluentWait(getDriver(), videoURLTextField);
        waitForWebElementAndClick(videoURLTextField);
        videoURLTextField.sendKeys("https://www.youtube.com/watch?v=cRLhQRaxGj8&ab_channel=EpicMindStudio");
    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";

    public void loadAnImage() {
        uploadImageBtn.sendKeys(EV_RESULT_FILE_PATH);
    }

    public void addonsSaveBtn() {
        fluentWait(getDriver(), addonSaveBtn);
        waitForWebElementAndClick(addonSaveBtn);

    }

    public void editAddonBtn() {
        fluentWait(getDriver(), addOnsEditBtn);
        waitForWebElementAndClick(addOnsEditBtn);
    }

    public void otherTypeServices() {
        fluentWait(getDriver(), addonServiceBtn);
        waitForWebElementAndClick(addonServiceBtn);

        fluentWait(getDriver(), subscriptionsServiceBtn);
        waitForWebElementAndClick(subscriptionsServiceBtn);
    }

    public void deleteBtn() {
        fluentWait(getDriver(), addOnsDeleteBtn);
        waitForWebElementAndClick(addOnsDeleteBtn);

        fluentWait(getDriver(), acceptDeleteBtn);
        waitForWebElementAndClick(acceptDeleteBtn);
    }

    public void secondTypeService() {
        fluentWait(getDriver(), addonServiceBtn);
        waitForWebElementAndClick(addonServiceBtn);

        fluentWait(getDriver(), subscriptionsServiceBtn);
        waitForWebElementAndClick(subscriptionsServiceBtn);
    }

    public void thirdTypeService() {
        fluentWait(getDriver(), addonServiceBtn);
        waitForWebElementAndClick(addonServiceBtn);
        
        fluentWait(getDriver(), orderAutoApprovalBtn);
        waitForWebElementAndClick(orderAutoApprovalBtn);
    }
}

