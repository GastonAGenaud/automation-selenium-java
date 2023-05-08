package pages.developmentServices;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;


public class CategoryDevPage extends BasePage {
    public CategoryDevPage() {
        super();
    }

    Actions actions = new Actions(getDriver());

    @FindBy(how = How.CSS, using = "#li-settings > span")
    public WebElement categoriesAndFilter;
    @FindBy(how = How.CSS, using = "#nose > div > a:nth-child(1)")
    public WebElement createCategories;
    @FindBy(how = How.CSS, using = "#addCategoryBtn")
    public WebElement addCategories;
    @FindBy(how = How.CSS, using = "#category-name")
    public WebElement addNewCategories;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topRight > div:nth-child(1) > div > div.iziToast-body > div.iziToast-texts > p")
    public WebElement SuccessSubcategory;
    @FindBy(xpath = "//label[contains(text(),'Kenpachi Edit')]")
    public WebElement EditKenpachiCat;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement confirmDeleteCat;
    @FindBy(how = How.CSS, using = "#field-name")
    public WebElement fieldName;
    @FindBy(how = How.CSS, using = "#field-description")
    public WebElement fieldDescription;
    @FindBy(how = How.CSS, using = "#text-tab")
    public WebElement textFieldType;
    @FindBy(how = How.CSS, using = "#checkbox-show-modal-category-756")
    public WebElement softwareField;
    @FindBy(how = How.CSS, using = "#submit-form")
    public WebElement saveBtn;
    @FindBy(how = How.CSS, using = "#nose > div > a:nth-child(2)")
    public WebElement createCustomField;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div/div[2]/div/div[2]/div[1]/a")
    public WebElement createCustomFieldBtn;

    public void selectCreateCategorySection() {
        try {
            actions.moveToElement(categoriesAndFilter).build().perform();
            fluentWait(getDriver(), createCategories);
            waitForWebElementAndClick(createCategories);
        } catch (Exception e) {
            wait(3);
            actions.moveToElement(categoriesAndFilter).build().perform();
            fluentWait(getDriver(), createCategories);
            waitForWebElementAndClick(createCategories);
        }
    }

    public void addCategory() {
        try {
            fluentWait(getDriver(), addCategories);
            waitForWebElementAndClick(addCategories);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addCategories);
            waitForWebElementAndClick(addCategories);
        }
    }

    public void enterNewCategory() {
        try {
            fluentWait(getDriver(), addNewCategories);
            waitForWebElementAndClick(addNewCategories);
            addNewCategories.sendKeys("Kenpachi");
            addNewCategories.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), addNewCategories);
            waitForWebElementAndClick(addNewCategories);
            addNewCategories.sendKeys("Kenpachi");
            addNewCategories.sendKeys(Keys.ENTER);
        }
    }

    public String validationSuccesSubcategory() {
        try {
            fluentWait(getDriver(), SuccessSubcategory);
            String result = SuccessSubcategory.getText();
            return result;
        } catch (Exception e) {
            wait(2);
            String result = SuccessSubcategory.getText();
            return result;
        }
    }

    public void selectKenpachiCat() {
        WebElement subCategoryEdit = null;
        try {
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Kenpachi')]"));
            if (subCategoryEdit.isDisplayed()) {

            }
        } catch (Exception e) {
            wait(4);
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Kenpachi')]"));

        }
        String dataId = subCategoryEdit.getAttribute("data-id");
        WebElement editBtn = getDriver().findElement(By.xpath(String.format("//i[ @id= 'edit-%s']", dataId)));
        WebElement editField = getDriver().findElement(By.xpath(String.format("//input[ @id= 'name-%s']", dataId)));
        try {
            fluentWait(getDriver(), editBtn);
            waitForWebElementAndClick(editBtn);
            fluentWait(getDriver(), editField);
            waitForWebElementAndClick(editField);
            editField.sendKeys(" Edit");
            editField.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void selectKenpachiEditCat() {
        try {
            fluentWait(getDriver(), EditKenpachiCat);
            waitForWebElementAndClick(EditKenpachiCat);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), EditKenpachiCat);
            waitForWebElementAndClick(EditKenpachiCat);
        }
    }

    public void addSubcategory() {
        WebElement subCategoryEdit = null;
        try {
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Kenpachi Edit')]"));
            if (subCategoryEdit.isDisplayed()) {

            }
        } catch (Exception e) {
            wait(4);
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Kenpachi Edit')]"));

        }
        String dataId = subCategoryEdit.getAttribute("data-id");
        WebElement addBtn = getDriver().findElement(By.xpath(String.format("//button[ @data-id= '%s']", dataId)));
        WebElement addTextBtn = getDriver().findElement(By.xpath(String.format("//input[ @id= 'category-name-%s']", dataId)));

        try {
            fluentWait(getDriver(), addBtn);
            waitForWebElementAndClick(addBtn);
            fluentWait(getDriver(), addTextBtn);
            waitForWebElementAndClick(addTextBtn);
            addTextBtn.sendKeys("Computer");
            addTextBtn.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void selectTestSubCat() {
        WebElement subCategoryEdit = null;
        try {
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Computer')]"));
            if (subCategoryEdit.isDisplayed()) {

            }
        } catch (Exception e) {
            wait(4);
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Computer')]"));

        }
        String dataId = subCategoryEdit.getAttribute("data-id");
        WebElement editBtn = getDriver().findElement(By.xpath(String.format("//i[ @id= 'edit-%s']", dataId)));
        WebElement editField = getDriver().findElement(By.xpath(String.format("//input[ @id= 'name-%s']", dataId)));
        try {
            fluentWait(getDriver(), editBtn);
            waitForWebElementAndClick(editBtn);
            fluentWait(getDriver(), editField);
            waitForWebElementAndClick(editField);
            editField.sendKeys(" Edit");
            editField.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void addItemSubCat() {
        WebElement subCategoryEdit = null;
        try {
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Computer Edit')]"));
            if (subCategoryEdit.isDisplayed()) {

            }
        } catch (Exception e) {
            wait(4);
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Computer Edit')]"));

        }
        String dataId = subCategoryEdit.getAttribute("data-id");
        WebElement addBtn = getDriver().findElement(By.xpath(String.format("//button[ @data-id= '%s']", dataId)));
        WebElement addTextBtn = getDriver().findElement(By.xpath(String.format("//input[ @id= 'category-name-%s']", dataId)));

        try {
            fluentWait(getDriver(), addBtn);
            waitForWebElementAndClick(addBtn);
            fluentWait(getDriver(), addTextBtn);
            waitForWebElementAndClick(addTextBtn);
            addTextBtn.sendKeys("Hello");
            addTextBtn.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void selectHelloItemSubCat() {
        WebElement subCategoryEdit = null;
        try {
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Hello')]"));
            if (subCategoryEdit.isDisplayed()) {

            }
        } catch (Exception e) {
            wait(4);
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Hello')]"));

        }
        String dataId = subCategoryEdit.getAttribute("data-id");
        WebElement editBtn = getDriver().findElement(By.xpath(String.format("//i[ @id= 'edit-%s']", dataId)));
        WebElement editField = getDriver().findElement(By.xpath(String.format("//input[ @id= 'name-%s']", dataId)));
        try {
            fluentWait(getDriver(), editBtn);
            waitForWebElementAndClick(editBtn);
            fluentWait(getDriver(), editField);
            waitForWebElementAndClick(editField);
            editField.sendKeys(" Edit");
            editField.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void selectDeleteHelloItemSubCat() {
        WebElement subCategoryEdit = null;
        try {
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Hello Edit')]"));
            if (subCategoryEdit.isDisplayed()) {

            }
        } catch (Exception e) {
            wait(4);
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Hello Edit')]"));

        }
        String dataId = subCategoryEdit.getAttribute("data-id");
        WebElement editBtn = getDriver().findElement(By.xpath(String.format("//a[ @id= 'delete-%s']", dataId)));

        try {
            fluentWait(getDriver(), editBtn);
            waitForWebElementAndClick(editBtn);
            fluentWait(getDriver(), confirmDeleteCat);
            waitForWebElementAndClick(confirmDeleteCat);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void selectDeleteTestSubCat() {
        WebElement subCategoryEdit = null;
        try {
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Computer Edit')]"));
            if (subCategoryEdit.isDisplayed()) {

            }
        } catch (Exception e) {
            wait(4);
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Computer Edit')]"));

        }
        String dataId = subCategoryEdit.getAttribute("data-id");
        WebElement editBtn = getDriver().findElement(By.xpath(String.format("//a[ @id= 'delete-%s']", dataId)));

        try {
            fluentWait(getDriver(), editBtn);
            waitForWebElementAndClick(editBtn);
            fluentWait(getDriver(), confirmDeleteCat);
            waitForWebElementAndClick(confirmDeleteCat);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void selectDeleteKenpachiCat() {
        WebElement subCategoryEdit = null;
        try {
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Kenpachi Edit')]"));
            if (subCategoryEdit.isDisplayed()) {

            }
        } catch (Exception e) {
            wait(4);
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'Kenpachi Edit')]"));

        }
        String dataId = subCategoryEdit.getAttribute("data-id");
        WebElement editBtn = getDriver().findElement(By.xpath(String.format("//a[ @id= 'delete-%s']", dataId)));

        try {
            fluentWait(getDriver(), editBtn);
            waitForWebElementAndClick(editBtn);
            fluentWait(getDriver(), confirmDeleteCat);
            waitForWebElementAndClick(confirmDeleteCat);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void selectCreateCustomFieldsSection() {
        try {
            actions.moveToElement(categoriesAndFilter).build().perform();
            fluentWait(getDriver(), createCustomField);
            waitForWebElementAndClick(createCustomField);
        } catch (Exception e) {
            wait(3);
            actions.moveToElement(categoriesAndFilter).build().perform();
            fluentWait(getDriver(), createCustomField);
            waitForWebElementAndClick(createCustomField);
        }

    }

    public void selectCreateCustomFields() {
        try {
            fluentWait(getDriver(), createCustomFieldBtn);
            waitForWebElementAndClick(createCustomFieldBtn);
            //    retryingFindClick(createCustomFieldBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), createCustomFieldBtn);
            waitForWebElementAndClick(createCustomFieldBtn);
        } finally {
            fluentWait(getDriver(), fieldName);
        }
    }

    public void enterFieldName() {
        try {
            fluentWait(getDriver(), fieldName);
            waitForWebElementAndClick(fieldName);
            fieldName.sendKeys("Automation");
            fieldName.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), fieldName);
            waitForWebElementAndClick(fieldName);
            fieldName.sendKeys("Automation");
            fieldName.sendKeys(Keys.ENTER);
        }
    }

    public void enterFieldDescription() {
        try {
            fluentWait(getDriver(), fieldDescription);
            waitForWebElementAndClick(fieldDescription);
            fieldDescription.sendKeys("Automation Test");
            fieldDescription.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), fieldDescription);
            waitForWebElementAndClick(fieldDescription);
            fieldDescription.sendKeys("Automation Test");
            fieldDescription.sendKeys(Keys.ENTER);
        }
    }

    public void fieldType() {
        try {
            fluentWait(getDriver(), textFieldType);
            waitForWebElementAndClick(textFieldType);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), textFieldType);
            waitForWebElementAndClick(textFieldType);
        }
    }

    public void selectFieldCategories() {
        try {
            fluentWait(getDriver(), softwareField);
            waitForWebElementAndClick(softwareField);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), softwareField);
            waitForWebElementAndClick(softwareField);
        }
    }

    public void enterSaveCustomField() {
        try {
            fluentWait(getDriver(), saveBtn);
            waitForWebElementAndClick(saveBtn);
        } catch (Exception e) {
            wait(3);
            fluentWait(getDriver(), saveBtn);
            waitForWebElementAndClick(saveBtn);
        }
    }
}
