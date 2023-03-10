/*package pages.addons;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;
public class OhAddonsPage extends BasePage {
    public OhAddonsPage() {
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
        sleep(2000);
        passwordLoginInput.click();
        passwordLoginInput.sendKeys("uX$Z2Z4^Ye3z,2&A");
        sleep(2000);
        logInBtn.click();
    }

    public String addonsValidate() {
        String result = addonsMainTitle.getText();
        return result;
    }

    public void goToLoginPage() {
        driver.navigate().to(baseUrlOHE + "/Account/Login");
    }

    public void goToAddonsPage() {
        driver.navigate().to(baseUrlOHE + "/admin/feature/addons");
    }

    public void selectAddAddon() {
        addNewAddOnsBtn.click();
    }

    public void serviceType() {
        addonServiceBtn.click();
        featuredUsersServiceBtn.click();
    }

    public void titleText() {
        titleTextField.click();
        titleTextField.clear();
        titleTextField.click();
        titleTextField.sendKeys("Automation Test");
    }

    public void descriptionText() {
        descriptionTextField.click();
        descriptionTextField.clear();
        descriptionTextField.click();
        descriptionTextField.sendKeys("Automation Test");
    }

    public void stripeProductIdText() {
        stripeProductIdTextField.click();
        stripeProductIdTextField.clear();
        stripeProductIdTextField.click();
        stripeProductIdTextField.sendKeys("prod_L0ORJpYOlLTpqI");
    }

    public void videoURLText() {
        videoURLTextField.click();
        videoURLTextField.clear();
        videoURLTextField.click();
        videoURLTextField.sendKeys("https://www.youtube.com/watch?v=cRLhQRaxGj8&ab_channel=EpicMindStudio");
    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";

    public void loadAnImage() {
        uploadImageBtn.sendKeys(EV_RESULT_FILE_PATH);
    }

    public void addonsSaveBtn() {
        sleep(2000);
        addonSaveBtn.click();
        sleep(2000);
    }

    public void editAddonBtn() {
        addOnsEditBtn.click();
    }

    public void otherTypeServices() {
        addonServiceBtn.click();
        subscriptionsServiceBtn.click();
    }

    public void deleteBtn() {
        addOnsDeleteBtn.click();
        sleep(2000);
        acceptDeleteBtn.click();
    }

    public void secondTypeService() {
        addonServiceBtn.click();
        subscriptionsServiceBtn.click();
    }

    public void thirdTypeService() {
        addonServiceBtn.click();
        orderAutoApprovalBtn.click();
    }
}

 */