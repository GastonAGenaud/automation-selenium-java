package pages.production;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    public void filterButton(){
        fluentWait(getDriver(), filterBtn);
        waitForWebElementAndClick(filterBtn);
    }

    public void userResult(){
        fluentWait(getDriver(), userResultValidate);
        Assert.assertTrue(userResultValidate.isDisplayed());
    }

    public void searchUser(){
        fluentWait(getDriver(), searchUserInput);
        searchUserInput.sendKeys("gastontrick");
    }

    public void impersonateValidation(){
        fluentWait(getDriver(), impersonateValidate);
        Assert.assertTrue(impersonateValidate.isDisplayed());
    }

    public void impersonateOption(){
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
}
