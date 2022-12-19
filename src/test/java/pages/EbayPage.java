package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static io.restassured.RestAssured.given;

public class EbayPage extends BasePage {
    public EbayPage() {
        super();
    }
    Actions actions = new Actions(getDriver());

    //selectors/locators
    @FindBy(how = How.ID, using = "gh-ac")
    public WebElement searchField;
   // @FindBy(how = How.CSS, using = ".s-item.s-item__pl-on-bottom:nth-child(1)")
   @FindBy(css = "ul > [class*=\"s-item\"] [class=\"s-item__link\"]")
   private List<WebElement> listOfProducts;
    @FindBy(css = "span[itemprop=\"price\"]")
    private WebElement price;
    private String priceText;
    public void testSearch(String search) {
        searchField.sendKeys(search);
        searchField.submit();
    }

    public void clickOnFistResult(){
        String originalWindow = getDriver().getWindowHandle();
        waitForWebElementAndClick(listOfProducts.get(0));

        getWait().until(numberOfWindowsToBe(2));
        for (String windowHandle : getDriver().getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                getDriver().switchTo().window(windowHandle);
                break;
            }
        }
    }
    public void showFirstPrice(){
        priceText = price.getText();
        System.out.println("Price: " + priceText);
    }

    public void testSearchElectricGuitar() {
        given()
                .queryParam("q", "Electric Guitar")
                .when()
                .get("https://www.ebay.com/api/v1/search")
                .then()
                .statusCode(200)
                .assertThat()
                .body("items[0].name", containsString("Electric Guitar"));
    }

}
