/*package com.trickgames.reborn.automation.steps.addons;

import com.trickgames.reborn.automation.cucumber.TestContext;
import com.trickgames.reborn.automation.pages.addons.OhAddonsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OhAddonsSteps {
    private final OhAddonsPage _page;
    private final WebDriver _driver;
    private final TestContext _context;

    public OhAddonsSteps(TestContext context) {
        _context = context;
        _driver = _context.driver;
        _page = new OhAddonsPage(_driver);
    }

    public OhAddonsSteps(OhAddonsPage page, WebDriver driver, TestContext context) {
        _page = page;
        _driver = driver;
        _context = context;
    }

    @Given("OHE - I login and go to addons page")
    public void iLoginAndGoToAddons(){
        _page.goToLoginPage();
        _page.goToLoginPage();
        _page.login();
        _page.goToAddonsPage();
    }

    @When("OHE - I select Add add on button")
    public void iSelectAddAddOnButton() {
        _page.sleep(4000);
        _page.selectAddAddon();
    }

    @And("OHE - I select the type of services")
    public void iSelectTheTypeOfServices() {
        _page.serviceType();
    }

    @And("OHE - I type in the Title text field")
    public void iTypeInTheTitleTextField() {
        _page.titleText();
    }

    @And("OHE - I type in the description text field")
    public void iTypeInTheDescriptionTextField() {
        _page.descriptionText();
    }

    @And("OHE - I type in the stripe productId text field")
    public void iTypeInTheStripeProductIdTextField() {
        _page.stripeProductIdText();
    }

    @And("OHE - I type video URL")
    public void iTypeVideoURL() {
        _page.videoURLText();
    }

    @And("OHE - I load an image")
    public void iLoadAnImage() {
        _page.loadAnImage();
    }

    @And("OHE - I select the save Button")
    public void iSelectTheSaveButton() {
        _page.addonsSaveBtn();
    }

    @Then("OHE - I validate create an addon")
    public void iValidateCreateAnAddon() {
        _page.goToAddonsPage();
        _page.sleep(2000);
        Assert.assertEquals(_page.addonsValidate(), "Add-Ons");
    }

    @Given("OHE - I  login and go to addons page")
    public void iLoginAndGoToAddonsPage() {
        _page.goToLoginPage();
    }

    @When("OHE - I select edit button in Addons")
    public void iSelectEditButtonInAddons() {
        _page.editAddonBtn();
    }

    @And("OHE - I select Other type of services")
    public void iSelectOtherTypeOfServices() {
        _page.otherTypeServices();
    }

    @And("OHE - I type in the edit Title text field")
    public void iTypeInTheEditTitleTextField() {
        _page.titleText();
    }

    @And("OHE - I type in the edit description text field")
    public void iTypeInTheEditDescriptionTextField() {
        _page.descriptionText();
    }

    @And("OHE - I type in the edit stripe productId")
    public void iTypeInTheEditStripeProductId() {
        _page.stripeProductIdText();
    }

    @And("OHE - I type in the edit video URl")
    public void iTypeInTheEditVideoURl() {
        _page.videoURLText();
    }

    @Then("OHE - I validate the Edit")
    public void iValidateTheEdit() {
        Assert.assertEquals(_page.addonsValidate(), "Add-Ons");
    }

    @When("OHE - I select delete Button")
    public void iSelectDeleteButton() {
        _page.goToAddonsPage();
        _page.sleep(5000);
        _page.deleteBtn();
    }

    @Then("OHE - I validate the Delete addon")
    public void iValidateTheDeleteAddon() {
        Assert.assertEquals(_page.addonsValidate(), "Add-Ons");
    }

    @And("OHE - I select the second type of services")    public void iSelectTheSecondTypeOfServices() {
        _page.secondTypeService();
    }

    @And("OHE - I select the third type of services")
    public void iSelectTheThirdTypeOfServices() {
        _page.thirdTypeService();
    }
}

 */