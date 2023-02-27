package pages.category;

import lombok.extern.java.Log;
import net.bytebuddy.asm.Advice;
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

public class categoryPage extends BasePage {


    public categoryPage() {
        super();
    }


    Actions actions = new Actions(getDriver());

    String rdm = Long.toString(System.currentTimeMillis());

    //LOGIN
    @FindBy(how = How.CSS, using = "#category-574 > div.d-flex.align-items-center.br-sm.bg-white.px-4.py-3 > label")
    public WebElement ShoesCategory;
    @FindBy(how = How.CSS, using = "#category-576 > div.d-flex.align-items-center.br-sm.bg-white.px-4.py-3 > label")
    public WebElement OutdoorStaffCategory;
    @FindBy(how = How.CSS, using = "#category-577 > div.d-flex.align-items-center.br-sm.bg-white.px-4.py-3 > label")
    public WebElement RugsCategory;
    @FindBy(how = How.CSS, using = "#category-578 > div.d-flex.align-items-center.br-sm.bg-white.px-4.py-3 > label")
    public WebElement ClothingCategory;
    @FindBy(how = How.CSS, using = "#category-579 > div.d-flex.align-items-center.br-sm.bg-white.px-4.py-3 > label")
    public WebElement SkinCareCategory;
    @FindBy(how = How.CSS, using = "#category-580 > div.d-flex.align-items-center.br-sm.bg-white.px-4.py-3 > label")
    public WebElement AccessoriesCategory;
    @FindBy(how = How.CSS, using = "#category-316 > div.d-flex.align-items-center.br-sm.bg-white.px-4.py-3 > label")
    public WebElement ArtAndCollectablesCategory;
    @FindBy(how = How.CSS, using = "#category-320 > div.d-flex.align-items-center.br-sm.bg-white.px-4.py-3 > label")
    public WebElement HottestItemsCategory;
    @FindBy(how = How.CSS, using = "#category-573 > div.d-flex.align-items-center.br-sm.bg-white.px-4.py-3 > label")
    public WebElement JewelryCategory;
    @FindBy(how = How.CSS, using = "#category-name-574")
    public WebElement addShoesSubcategory;
    @FindBy(how = How.CSS, using = "#collapse-574 > button")
    public WebElement addSubcategory;
    @FindBy(how = How.CSS, using = "#collapse-576 > button")
    public WebElement addOutdoorStaffSubcategoryBtn;
    @FindBy(how = How.CSS, using = "#collapse-577 > button")
    public WebElement addRugsSubcategoryBtn;
    @FindBy(how = How.CSS, using = "#collapse-578 > button")
    public WebElement addClothingSubcategoryBtn;
    @FindBy(how = How.CSS, using = "#collapse-579 > button")
    public WebElement addSkinCareSubcategoryBtn;
    @FindBy(how = How.CSS, using = "#collapse-580 > button")
    public WebElement addAccessoriesSubcategoryBtn;
    @FindBy(how = How.CSS, using = "#collapse-316 > button")
    public WebElement addArtAndCollectablesSubcategoryBtn;
    @FindBy(how = How.CSS, using = "#collapse-320 > button")
    public WebElement addHottestItemsSubcategoryBtn;
    @FindBy(how = How.CSS, using = "#collapse-573 > button")
    public WebElement addJewelrySubcategoryBtn;
    @FindBy(how = How.CSS, using = "#category-name-576")
    public WebElement addOutdoorStaffSubcategory;
    @FindBy(how = How.CSS, using = "#category-name-577")
    public WebElement addRugsSubcategory;
    @FindBy(how = How.CSS, using = "#category-name-578")
    public WebElement addClothingSubcategory;
    @FindBy(how = How.CSS, using = "#category-name-579")
    public WebElement addSkinCareSubcategory;
    @FindBy(how = How.CSS, using = "#category-name-580")
    public WebElement addAccessoriesSubcategory;
    @FindBy(how = How.CSS, using = "#category-name-316")
    public WebElement addArtAndCollectablesSubcategory;
    @FindBy(how = How.CSS, using = "#category-name-320")
    public WebElement addHottestItemsSubcategory;
    @FindBy(how = How.CSS, using = "#category-name-573")
    public WebElement addJewelrySubcategory;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topRight > div:nth-child(1) > div > div.iziToast-body > div.iziToast-texts > p")
    public WebElement SuccessSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[1]/i[2]")
    public WebElement editShoesSubcategoryBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div/div[1]/i[2]")
    public WebElement editOutdoorStaffSubcategoryBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div/div[1]/i[2]")
    public WebElement editRugsSubcategoryBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div/div[1]/i[2]")
    public WebElement editClothingSubcategoryBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div/div[1]/i[2]")
    public WebElement editSkinCareSubcategoryBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div/div[1]/i[2]")
    public WebElement editAccessoriesSubcategoryBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div/div[1]/i[2]")
    public WebElement editArtAndCollectablesSubcategoryBtn;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[1]/input")
    public WebElement editShoesSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div/div[1]/input")
    public WebElement editOutdoorStaffSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div/div[1]/input")
    public WebElement editRugsSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div/div[1]/input")
    public WebElement editClothingSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div/div[1]/input")
    public WebElement editSkinCareSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div/div[1]/input")
    public WebElement editAccessoriesSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div/div[1]/input")
    public WebElement editArtAndCollectablesSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[1]/a")
    public WebElement deleteShoesSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div/div[1]/a")
    public WebElement deleteOutdoorStaffSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div/div[1]/a")
    public WebElement deleteRugsSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div/div[1]/a")
    public WebElement deleteClothingSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div/div[1]/a")
    public WebElement deleteSkinCareSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div/div[1]/a")
    public WebElement deleteAccessoriesSubcategory;
    @FindBy(xpath = "/html/body/div[2]/div/main/section/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div/div[1]/a")
    public WebElement deleteArtAndCollectablesSubcategory;
    @FindBy(xpath = "//a[text()='Delete'][@data-name='test Hottest Items Edit']")
    public WebElement deleteHottestItemsSubcategory;
    @FindBy(xpath = "//a[text()='Delete'][@data-name='algo Jewelry Edit']")
    public WebElement deleteJewelrySubcategory;
    @FindBy(how = How.CSS, using = "body > div.iziToast-wrapper.iziToast-wrapper-topCenter > div > div > div > div.iziToast-buttons > button.btn.mt-2.btn-action.iziToast-buttons-child.revealIn")
    public WebElement deleteSubcategory;


    public String shoesCategory() {
        String result = ShoesCategory.getText();
        return result;
    }

    public void addShoesSubcategory() {
        try {
            fluentWait(getDriver(), ShoesCategory);
            waitForWebElementAndClick(ShoesCategory);
            fluentWait(getDriver(), addSubcategory);
            waitForWebElementAndClick(addSubcategory);
            fluentWait(getDriver(), addShoesSubcategory);
            waitForWebElementAndClick(addShoesSubcategory);
            addShoesSubcategory.sendKeys("Test Shoes");
            addShoesSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }

    }

    public String validationSuccesSubcategory() {
       try {
           String result = SuccessSubcategory.getText();
           return result;
       }catch (Exception e){
          wait(2);
           String result = SuccessSubcategory.getText();
           return result;
       }


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

    public void editShoesSubcategory() {
        try {
            fluentWait(getDriver(), ShoesCategory);
            waitForWebElementAndClick(ShoesCategory);
            fluentWait(getDriver(), editShoesSubcategoryBtn);
            waitForWebElementAndClick(editShoesSubcategoryBtn);
            fluentWait(getDriver(), editShoesSubcategory);
            waitForWebElementAndClick(editShoesSubcategory);
            editShoesSubcategory.sendKeys(" Edit");
            editShoesSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }

    }

    public void deleteShoesSubcategory() {
        try {
            fluentWait(getDriver(), ShoesCategory);
            waitForWebElementAndClick(ShoesCategory);
            fluentWait(getDriver(), deleteShoesSubcategory);
            waitForWebElementAndClick(deleteShoesSubcategory);
            fluentWait(getDriver(), deleteSubcategory);
            waitForWebElementAndClick(deleteSubcategory);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public String outdoorStaffCategory() {
        String result = OutdoorStaffCategory.getText();
        return result;
    }

    public void addOutdoorStaffSubcategory() {
        try {
            fluentWait(getDriver(), OutdoorStaffCategory);
            waitForWebElementAndClick(OutdoorStaffCategory);
            fluentWait(getDriver(), addOutdoorStaffSubcategoryBtn);
            waitForWebElementAndClick(addOutdoorStaffSubcategoryBtn);
            fluentWait(getDriver(), addOutdoorStaffSubcategory);
            waitForWebElementAndClick(addOutdoorStaffSubcategory);
            addOutdoorStaffSubcategory.sendKeys("Test Outdoor Staff");
            addOutdoorStaffSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }

    }

    public void editOutdoorStaffSubcategory() {
        try {
            fluentWait(getDriver(), OutdoorStaffCategory);
            waitForWebElementAndClick(OutdoorStaffCategory);
            fluentWait(getDriver(), editOutdoorStaffSubcategoryBtn);
            waitForWebElementAndClick(editOutdoorStaffSubcategoryBtn);
            fluentWait(getDriver(), editOutdoorStaffSubcategory);
            waitForWebElementAndClick(editOutdoorStaffSubcategory);
            editOutdoorStaffSubcategory.sendKeys(" Edit");
            editOutdoorStaffSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }

    }

    public void deleteOutdoorStaffSubcategory() {
        try {
            fluentWait(getDriver(), OutdoorStaffCategory);
            waitForWebElementAndClick(OutdoorStaffCategory);
            fluentWait(getDriver(), deleteOutdoorStaffSubcategory);
            waitForWebElementAndClick(deleteOutdoorStaffSubcategory);
            fluentWait(getDriver(), deleteSubcategory);
            waitForWebElementAndClick(deleteSubcategory);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public String rugsCategory() {
        String result = RugsCategory.getText();
        return result;
    }

    public void addRugsSubcategory() {
        try {
            fluentWait(getDriver(), RugsCategory);
            waitForWebElementAndClick(RugsCategory);
            fluentWait(getDriver(), addRugsSubcategoryBtn);
            waitForWebElementAndClick(addRugsSubcategoryBtn);
            fluentWait(getDriver(), addRugsSubcategory);
            waitForWebElementAndClick(addRugsSubcategory);
            addRugsSubcategory.sendKeys("Test Rugs");
            addRugsSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void editRugsSubcategory() {
        try {
            fluentWait(getDriver(), RugsCategory);
            waitForWebElementAndClick(RugsCategory);
            fluentWait(getDriver(), editRugsSubcategoryBtn);
            waitForWebElementAndClick(editRugsSubcategoryBtn);
            fluentWait(getDriver(), editRugsSubcategory);
            waitForWebElementAndClick(editRugsSubcategory);
            editRugsSubcategory.sendKeys(" Edit");
            editRugsSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }

    }

    public void deleteRugsSubcategory() {
        try {
            fluentWait(getDriver(), RugsCategory);
            waitForWebElementAndClick(RugsCategory);
            fluentWait(getDriver(), deleteRugsSubcategory);
            waitForWebElementAndClick(deleteRugsSubcategory);
            fluentWait(getDriver(), deleteSubcategory);
            waitForWebElementAndClick(deleteSubcategory);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public String clothingCategory() {
        String result = ClothingCategory.getText();
        return result;
    }

    public void addClothingSubcategory() {
        try {
            fluentWait(getDriver(), ClothingCategory);
            waitForWebElementAndClick(ClothingCategory);
            fluentWait(getDriver(), addClothingSubcategoryBtn);
            waitForWebElementAndClick(addClothingSubcategoryBtn);
            fluentWait(getDriver(), addClothingSubcategory);
            waitForWebElementAndClick(addClothingSubcategory);
            addClothingSubcategory.sendKeys("Test Clothing");
            addClothingSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void editClothingSubcategory() {
        try {
            fluentWait(getDriver(), ClothingCategory);
            waitForWebElementAndClick(ClothingCategory);
            fluentWait(getDriver(), editClothingSubcategoryBtn);
            waitForWebElementAndClick(editClothingSubcategoryBtn);
            fluentWait(getDriver(), editClothingSubcategory);
            waitForWebElementAndClick(editClothingSubcategory);
            editClothingSubcategory.sendKeys(" Edit");
            editClothingSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }

    }

    public void deleteClothingSubcategory() {
        try {
            fluentWait(getDriver(), ClothingCategory);
            waitForWebElementAndClick(ClothingCategory);
            fluentWait(getDriver(), deleteClothingSubcategory);
            waitForWebElementAndClick(deleteClothingSubcategory);
            fluentWait(getDriver(), deleteSubcategory);
            waitForWebElementAndClick(deleteSubcategory);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public String skinCareCategory() {
        String result = SkinCareCategory.getText();
        return result;
    }

    public void addSkinCareSubcategory() {
        try {
            fluentWait(getDriver(), SkinCareCategory);
            waitForWebElementAndClick(SkinCareCategory);
            fluentWait(getDriver(), addSkinCareSubcategoryBtn);
            waitForWebElementAndClick(addSkinCareSubcategoryBtn);
            fluentWait(getDriver(), addSkinCareSubcategory);
            waitForWebElementAndClick(addSkinCareSubcategory);
            addSkinCareSubcategory.sendKeys("Test Skin Care");
            addSkinCareSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void editSkinCareSubcategory() {
        try {
            fluentWait(getDriver(), SkinCareCategory);
            waitForWebElementAndClick(SkinCareCategory);
            fluentWait(getDriver(), editSkinCareSubcategoryBtn);
            waitForWebElementAndClick(editSkinCareSubcategoryBtn);
            fluentWait(getDriver(), editSkinCareSubcategory);
            waitForWebElementAndClick(editSkinCareSubcategory);
            editSkinCareSubcategory.sendKeys(" Edit");
            editSkinCareSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void deleteSkinCareSubcategory() {
        try {
            fluentWait(getDriver(), SkinCareCategory);
            waitForWebElementAndClick(SkinCareCategory);
            fluentWait(getDriver(), deleteSkinCareSubcategory);
            waitForWebElementAndClick(deleteSkinCareSubcategory);
            fluentWait(getDriver(), deleteSubcategory);
            waitForWebElementAndClick(deleteSubcategory);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public String accessoriesCategory() {
        String result = AccessoriesCategory.getText();
        return result;
    }

    public void addAccessoriesSubcategory() {
        try {
            fluentWait(getDriver(), AccessoriesCategory);
            waitForWebElementAndClick(AccessoriesCategory);
            fluentWait(getDriver(), addAccessoriesSubcategoryBtn);
            waitForWebElementAndClick(addAccessoriesSubcategoryBtn);
            fluentWait(getDriver(), addAccessoriesSubcategory);
            waitForWebElementAndClick(addAccessoriesSubcategory);
            addAccessoriesSubcategory.sendKeys("Test Accessories");
            addAccessoriesSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void editAccessoriesSubcategory() {
        try {
            fluentWait(getDriver(), AccessoriesCategory);
            waitForWebElementAndClick(AccessoriesCategory);
            fluentWait(getDriver(), editAccessoriesSubcategoryBtn);
            waitForWebElementAndClick(editAccessoriesSubcategoryBtn);
            fluentWait(getDriver(), editAccessoriesSubcategory);
            waitForWebElementAndClick(editAccessoriesSubcategory);
            editAccessoriesSubcategory.sendKeys(" Edit");
            editAccessoriesSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void deleteAccessoriesSubcategory() {
        try {
            fluentWait(getDriver(), AccessoriesCategory);
            waitForWebElementAndClick(AccessoriesCategory);
            fluentWait(getDriver(), deleteAccessoriesSubcategory);
            waitForWebElementAndClick(deleteAccessoriesSubcategory);
            fluentWait(getDriver(), deleteSubcategory);
            waitForWebElementAndClick(deleteSubcategory);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public String artAndCollectablesCategory() {
        String result = ArtAndCollectablesCategory.getText();
        return result;
    }

    public void addArtAndCollectablesSubcategory() {
        try {
            fluentWait(getDriver(), ArtAndCollectablesCategory);
            waitForWebElementAndClick(ArtAndCollectablesCategory);
            fluentWait(getDriver(), addArtAndCollectablesSubcategoryBtn);
            waitForWebElementAndClick(addArtAndCollectablesSubcategoryBtn);
            fluentWait(getDriver(), addArtAndCollectablesSubcategory);
            waitForWebElementAndClick(addArtAndCollectablesSubcategory);
            addArtAndCollectablesSubcategory.sendKeys("Test Art");
            addArtAndCollectablesSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void editArtAndCollectablesSubcategory() {

        try {
            fluentWait(getDriver(), ArtAndCollectablesCategory);
            waitForWebElementAndClick(ArtAndCollectablesCategory);

            wait(3);
            WebElement editSubcategory = getDriver().findElement(By.xpath("//label[contains(text(), 'edit')]"));
            wait(3);
            String subCategoryId = editSubcategory.getAttribute("data-id");
            String editId = "edit-" + subCategoryId;
            String nameId = "name-" + subCategoryId;
            String xpathSubCategory = "//i[@id=" + "\"" + editId + "\"" + "]";
            WebElement editButtonFromSubCategory = getDriver().findElement(By.xpath(xpathSubCategory));

            String xpathSubCategoryName = "//input[@id=" + "\"" + nameId  + "\"" + "]";
            WebElement editNameButton = getDriver().findElement(By.xpath(xpathSubCategoryName));

            fluentWaitStrict(getDriver(), editButtonFromSubCategory);
            waitForWebElementAndClick(editButtonFromSubCategory);
            fluentWait(getDriver(), editNameButton);
            waitForWebElementAndClick(editNameButton);
            editNameButton.sendKeys(" Edit");
            editNameButton.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
            WebElement editSubcategory = getDriver().findElement(By.xpath("//label[contains(text(), 'edit')]"));
            wait(3);
            String subCategoryId = editSubcategory.getAttribute("data-id");
            String editId = "edit-" + subCategoryId;
            String nameId = "name-" + subCategoryId;
            String xpathSubCategory = "//i[@id=" + "\"" + editId + "\"" + "]";
            WebElement editButtonFromSubCategory = getDriver().findElement(By.xpath(xpathSubCategory));

            String xpathSubCategoryName = "//input[@id=" + "\"" + nameId  + "\"" + "]";
            WebElement editNameButton = getDriver().findElement(By.xpath(xpathSubCategoryName));

            fluentWaitStrict(getDriver(), editButtonFromSubCategory);
            waitForWebElementAndClick(editButtonFromSubCategory);
            fluentWait(getDriver(), editNameButton);
            waitForWebElementAndClick(editNameButton);
            editNameButton.sendKeys(" Edit");
            editNameButton.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        }
    }


    public void deleteArtAndCollectablesSubcategory() {
        try {
            fluentWait(getDriver(), ArtAndCollectablesCategory);
            waitForWebElementAndClick(ArtAndCollectablesCategory);
            fluentWait(getDriver(), deleteArtAndCollectablesSubcategory);
            waitForWebElementAndClick(deleteArtAndCollectablesSubcategory);
            fluentWait(getDriver(), deleteSubcategory);
            waitForWebElementAndClick(deleteSubcategory);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public String hottestItemsCategory() {
        String result = HottestItemsCategory.getText();
        return result;
    }

    public void addHottestItemsSubcategory() {
        try {
            fluentWait(getDriver(), HottestItemsCategory);
            waitForWebElementAndClick(HottestItemsCategory);
            fluentWait(getDriver(), addHottestItemsSubcategoryBtn);
            waitForWebElementAndClick(addHottestItemsSubcategoryBtn);
            fluentWait(getDriver(), addHottestItemsSubcategory);
            waitForWebElementAndClick(addHottestItemsSubcategory);
            addHottestItemsSubcategory.sendKeys("test Hottest Items");
            addHottestItemsSubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public void editHottestItemsSubcategory() {
        fluentWait(getDriver(), HottestItemsCategory);
        waitForWebElementAndClick(HottestItemsCategory);
        WebElement subCategoryEdit = null;
        try {
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'test Hottest Items')]"));
            if (subCategoryEdit.isDisplayed()){

            }
        } catch (Exception e) {
            wait(4);
            subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'test Hottest Items')]"));

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

    public void deleteHottestItemsSubcategory() {
        try {
            fluentWait(getDriver(), HottestItemsCategory);
            waitForWebElementAndClick(HottestItemsCategory);
            fluentWait(getDriver(), deleteHottestItemsSubcategory);
            waitForWebElementAndClick(deleteHottestItemsSubcategory);
            fluentWait(getDriver(), deleteSubcategory);
            waitForWebElementAndClick(deleteSubcategory);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }

    public String jewelryCategory() {
        String result = JewelryCategory.getText();
        return result;
    }

    public void addJewelrySubcategory() {
        try {
            fluentWait(getDriver(), addJewelrySubcategoryBtn);
            waitForWebElementAndClick(addJewelrySubcategoryBtn);
            fluentWait(getDriver(), addJewelrySubcategory);
            waitForWebElementAndClick(addJewelrySubcategory);
            addJewelrySubcategory.sendKeys("algo Jewelry");
            addJewelrySubcategory.sendKeys(Keys.ENTER);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (
                Exception e) {
            wait(3);
        }

    }

    public void editJewelrySubcategory() {
        WebElement subCategoryEdit = getDriver().findElement(By.xpath("//*[contains(text(), 'algo Jewelry')]"));
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

    public void deleteJewelrySubcategory() {
        try {
            fluentWait(getDriver(), deleteJewelrySubcategory);
            waitForWebElementAndClick(deleteJewelrySubcategory);
            fluentWait(getDriver(), deleteSubcategory);
            waitForWebElementAndClick(deleteSubcategory);
            fluentWait(getDriver(), SuccessSubcategory);
        } catch (Exception e) {
            wait(3);
        }
    }
}