package pages.addons;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.WebElement;

import pages.BasePage;


public class AddonsPage extends BasePage {
    public AddonsPage() {
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

    @FindBy(how = How.CSS, using = "#admin-sidebar > ul.items.list-unstyled.my-4.px-3 > li:nth-child(10) > a > span")
    public WebElement addonBtn;
    @FindBy(how = How.CSS, using = "body > div.container-fluid.full-height > div > main > header > div > div > div.col-auto.pr-2 > a")
    public WebElement addNewAddOnsBtn;
    @FindBy(how = How.CSS, using = "#addon-feature")
    public WebElement addonServiceBtn;
    @FindBy(how = How.CSS, using = "#addon-feature > option:nth-child(5)")
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
    @FindBy(how = How.CSS, using = "#btn-crop")
    public WebElement cropBtn;
    @FindBy(how = How.CSS, using = "#addon-form > button")
    public WebElement addonSaveBtn;
    @FindBy(how = How.CSS, using = "#listingAddon > div > div:nth-child(17) > div.d-flex.justify-content-around.mb-2 > a:nth-child(1)")
    public WebElement addOnsEditBtn;
    @FindBy(how = How.CSS, using = "#listingAddon > div > div:nth-child(17) > div.d-flex.justify-content-around.mb-2 > a.text-danger.font-weight-bold")
    public WebElement addOnsDeleteBtn;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement acceptDeleteBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/header/div/h1")
    public WebElement addonsMainTitle;


    @FindBy(how = How.CSS, using = "#fedex-tab")
    public WebElement listingFedExBtn;
    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(2) > div:nth-child(1) > div > label")
    public WebElement fedExAddress1;
    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(2) > div:nth-child(2) > div > label")
    public WebElement fedExAddress2;

    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(3) > div.col-6.col-md-4 > div > label")
    public WebElement fedExCity;

    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(3) > div:nth-child(2) > div > label")
    public WebElement fedExState;
    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(3) > div.col-6.col-md-2 > div > label")
    public WebElement fedExZip;
    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(3) > div:nth-child(4) > div > label")
    public WebElement fedExCountry;
    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(4) > div:nth-child(1) > div > label")
    public WebElement fedExWeightLbs;
    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(4) > div:nth-child(2) > div > label")
    public WebElement fedExWeightOz;
    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(4) > div:nth-child(3) > div > label")
    public WebElement fedExLength;
    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(4) > div:nth-child(4) > div > label")
    public WebElement fedExWidth;
    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(4) > div:nth-child(5) > div > label")
    public WebElement fedExHeight;
    @FindBy(how = How.CSS, using = "#fedex > div:nth-child(5) > div > div > label")
    public WebElement fedExPhoneNumber;
    @FindBy(how = How.CSS, using = "#listing-name")
    public WebElement listingNameTextField;
    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement listingCategoryBtn;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[1]/div[1]/div[1]/div[1]/div/div/div[2]/div/a/h5")
    public WebElement NewProduct;
    @FindBy(xpath = "//button[contains(text(),'Buy Now')]")
    public WebElement buyProductDigitalBtn;
    @FindBy(xpath = "/html/body/div[4]/main/div/div/div/div[3]/button")
    public WebElement goToSecureCheckoutBtn;
    @FindBy(how = How.CSS, using = "#category-selector")
    public WebElement dashboardPageBtn;

    String newProductUrl = null;
    String windowHandle = getDriver().getWindowHandle();

    public void saveTheUrlProduct() {
        getDriver().getWindowHandles().forEach(tab -> getDriver().switchTo().window(tab));
        newProductUrl = getDriver().getCurrentUrl();
    }

    public void selectMyNewlyProduct() {
        try {
            fluentWait(getDriver(), NewProduct);
            waitForWebElementAndClick(NewProduct);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), NewProduct);
            waitForWebElementAndClick(NewProduct);
        }
    }


    public void goToProductDownloadFile() {
        getDriver().navigate().to(newProductUrl);
    }

    public void fedExOption() {
        fluentWait(getDriver(), listingFedExBtn);
        waitForWebElementAndClick(listingFedExBtn);
    }

    public String validateFedExAddress1() {
        fluentWait(getDriver(), fedExAddress1);
        String result = fedExAddress1.getText();
        return result;
    }

    public String validateFedExAddress2() {
        fluentWait(getDriver(), fedExAddress2);
        String result = fedExAddress2.getText();
        return result;
    }

    public String valiateFedExCity() {
        fluentWait(getDriver(), fedExCity);
        String result = fedExCity.getText();
        return result;
    }

    public String validateFedExState() {
        fluentWait(getDriver(), fedExState);
        String result = fedExState.getText();
        return result;
    }

    public String validateFedExZip() {
        fluentWait(getDriver(), fedExZip);
        String result = fedExZip.getText();
        return result;
    }

    public String validateFedExCountry() {
        fluentWait(getDriver(), fedExCountry);
        String result = fedExCountry.getText();
        return result;
    }

    public String validateFedExWeightLbs() {
        fluentWait(getDriver(), fedExWeightLbs);
        String result = fedExWeightLbs.getText();
        return result;
    }

    public String validateFedExWeightOz() {
        fluentWait(getDriver(), fedExWeightOz);
        String result = fedExWeightOz.getText();
        return result;
    }

    public String validateFedExLength() {
        fluentWait(getDriver(), fedExLength);
        String result = fedExLength.getText();
        return result;
    }

    public String validateFedExWidth() {
        fluentWait(getDriver(), fedExWidth);
        String result = fedExWidth.getText();
        return result;
    }

    public String validateFedExHeight() {
        fluentWait(getDriver(), fedExHeight);
        String result = fedExHeight.getText();
        return result;
    }

    public String validateFedExPhoneNumber() {
        fluentWait(getDriver(), fedExPhoneNumber);
        String result = fedExPhoneNumber.getText();
        return result;
    }

    public void listingNameTextField() {
        fluentWait(getDriver(), listingCategoryBtn);
        waitForWebElementAndClick(listingNameTextField);
        listingNameTextField.sendKeys("Fedex Example 1");
    }

    public void buyProductDigital() {
        try {
            fluentWait(getDriver(), buyProductDigitalBtn);
            waitForWebElementAndClick(buyProductDigitalBtn);
            //retryingFindClick(buyProductDigitalBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), buyProductDigitalBtn);
            waitForWebElementAndClick(buyProductDigitalBtn);
        } finally {
            fluentWaitStrict(getDriver(), goToSecureCheckoutBtn);
        }
    }


    public String addonsConfirm() {
        try {
            fluentWait(getDriver(), addonsMainTitle);
            String result = addonsMainTitle.getText();
            return result;
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addonsMainTitle);
            String result = addonsMainTitle.getText();
            return result;
        }
    }


    public void addonBtnFromPanel() {
        fluentWait(getDriver(), addonBtn);
        waitForWebElementAndClick(addonBtn);
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

    public void addNewAddOns() {
        try {
            fluentWait(getDriver(), addNewAddOnsBtn);
            waitForWebElementAndClick(addNewAddOnsBtn);
            fluentWait(getDriver(), addonServiceBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addNewAddOnsBtn);
            waitForWebElementAndClick(addNewAddOnsBtn);
        }
        finally {
            fluentWait(getDriver(), addonServiceBtn);
        }

    }

    public void addonService() {
        fluentWait(getDriver(), addonServiceBtn);
        waitForWebElementAndClick(addonServiceBtn);
    }

    public void addonServiceFeaturedUsers() {
        addonService();
        fluentWait(getDriver(), featuredUsersServiceBtn);
        waitForWebElementAndClick(featuredUsersServiceBtn);
    }

    public void addonServiceSubscription() {
        try {
            addonService();
            fluentWait(getDriver(), subscriptionsServiceBtn);
            waitForWebElementAndClick(subscriptionsServiceBtn);
        } catch (Exception e) {
            wait(3);
            addonService();
            fluentWait(getDriver(), subscriptionsServiceBtn);
            waitForWebElementAndClick(subscriptionsServiceBtn);
        }

    }

    public void addonServiceOrderAutoApproval() {
        addonService();
        fluentWait(getDriver(), orderAutoApprovalBtn);
        waitForWebElementAndClick(orderAutoApprovalBtn);
    }

    public void addonTitle() {
        fluentWait(getDriver(), titleTextField);
        waitForWebElementAndClick(titleTextField);
        titleTextField.sendKeys("Automation Test");
    }

    public void addonEditTitle() {
        fluentWait(getDriver(), titleTextField);
        waitForWebElementAndClick(titleTextField);
        titleTextField.clear();
        waitForWebElementAndClick(titleTextField);
        titleTextField.sendKeys("Automation Test");
    }

    public void addonDescription() {
        fluentWait(getDriver(), descriptionTextField);
        waitForWebElementAndClick(descriptionTextField);
        descriptionTextField.sendKeys("Automation Test");
    }

    public void addonEditDescription() {
        fluentWait(getDriver(), descriptionTextField);
        waitForWebElementAndClick(descriptionTextField);
        descriptionTextField.clear();
        waitForWebElementAndClick(descriptionTextField);
        descriptionTextField.sendKeys("Automation Test");
    }

    public void addonStripeId() {
        fluentWait(getDriver(), stripeProductIdTextField);
        waitForWebElementAndClick(stripeProductIdTextField);
        stripeProductIdTextField.sendKeys("prod_L0ORJpYOlLTpqI");
    }

    public void addonEditStripeId() {
        wait(8);
        fluentWait(getDriver(), stripeProductIdTextField);
        waitForWebElementAndClick(stripeProductIdTextField);
        stripeProductIdTextField.clear();
        waitForWebElementAndClick(stripeProductIdTextField);
        stripeProductIdTextField.sendKeys("prod_L0ORJpYOlLTpqI");
    }

    public void addonVideoURL() {
        fluentWait(getDriver(), videoURLTextField);
        waitForWebElementAndClick(videoURLTextField);
        videoURLTextField.sendKeys("https://www.youtube.com/watch?v=cRLhQRaxGj8&ab_channel=EpicMindStudio");
    }

    public void addonCheckbox() {
        fluentWait(getDriver(), productsCheckBox);
        waitForWebElementAndClick(productsCheckBox);
    }

    public static final String EV_RESULT_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/media/addons.png";

    public void addonImage() {
        uploadImageBtn.sendKeys(EV_RESULT_FILE_PATH);
    }

    public void cropButton() {
        fluentWaitStrict(getDriver(), cropBtn);
        waitForWebElementAndClick(cropBtn);
    }

    public void addonSave() {
        try {
            fluentWait(getDriver(), addonSaveBtn);
            waitForWebElementAndClick(addonSaveBtn);
            fluentWait(getDriver(), addonsMainTitle);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addonSaveBtn);
            waitForWebElementAndClick(addonSaveBtn);
        } finally {
            wait(1);
        }

    }

    public void addonEdit() {
        fluentWait(getDriver(), addOnsEditBtn);
        waitForWebElementAndClick(addOnsEditBtn);
    }

    public void addonDelete() {
        fluentWait(getDriver(), addOnsDeleteBtn);
        waitForWebElementAndClick(addOnsDeleteBtn);
        fluentWait(getDriver(), acceptDeleteBtn);
        waitForVisibility(acceptDeleteBtn);
        waitForWebElementAndClick(acceptDeleteBtn);
    }
public void clickDashboard(){

}
}



