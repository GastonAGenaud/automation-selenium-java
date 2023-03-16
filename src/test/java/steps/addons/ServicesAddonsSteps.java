package steps.addons;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.addons.ServicesAddonsPage;

public class ServicesAddonsSteps extends BasePage {

    private ServicesAddonsPage _page;

    public ServicesAddonsSteps() {

        this._page = new ServicesAddonsPage();
    }

    @Given("SVC - I login and go to addons page")
    public void iLoginAndGoToAddons(){
        _page.goToLoginPage();
        _page.loginWithGastonUserSVC();
        _page.goToAddonsPage();
    }

    @When("SVC - I select Add add on button")
    public void iSelectAddAddOnButton() {
        
        _page.selectAddAddon();
    }

    @And("SVC - I select the type of services")
    public void iSelectTheTypeOfServices() {
        _page.serviceType();
    }

    @And("SVC - I type in the Title text field")
    public void iTypeInTheTitleTextField() {
        _page.titleText();
    }

    @And("SVC - I type in the description text field")
    public void iTypeInTheDescriptionTextField() {
        _page.descriptionText();
    }

    @And("SVC - I type in the stripe productId text field")
    public void iTypeInTheStripeProductIdTextField() {
        _page.stripeProductIdText();
    }

    @And("SVC - I type video URL")
    public void iTypeVideoURL() {
        _page.videoURLText();
    }

    @And("SVC - I load an image")
    public void iLoadAnImage() {
        _page.loadAnImage();
    }

    @And("SVC - I select the save Button")
    public void iSelectTheSaveButton() {
        _page.addonsSaveBtn();
    }

    @Then("SVC - I validate create an addon")
    public void iValidateCreateAnAddon() {
        _page.goToAddonsPage();
        
        Assert.assertEquals(_page.addonsValidate(), "Add-Ons");
    }

    @Given("SVC - I  login and go to addons page")
    public void iLoginAndGoToAddonsPage() {
        _page.goToLoginPage();
    }

    @When("SVC - I select edit button in Addons")
    public void iSelectEditButtonInAddons() {
        _page.editAddonBtn();
    }

    @And("SVC - I select Other type of services")
    public void iSelectOtherTypeOfServices() {
        _page.otherTypeServices();
    }

    @And("SVC - I type in the edit Title text field")
    public void iTypeInTheEditTitleTextField() {
        _page.titleText();
    }

    @And("SVC - I type in the edit description text field")
    public void iTypeInTheEditDescriptionTextField() {
        _page.descriptionText();
    }

    @And("SVC - I type in the edit stripe productId")
    public void iTypeInTheEditStripeProductId() {
        _page.stripeProductIdText();
    }

    @And("SVC - I type in the edit video URl")
    public void iTypeInTheEditVideoURl() {
        _page.videoURLText();
    }

    @Then("SVC - I validate the Edit")
    public void iValidateTheEdit() {
        Assert.assertEquals(_page.addonsValidate(), "Add-Ons");
    }

    @When("SVC - I select delete Button")
    public void iSelectDeleteButton() {
        _page.goToAddonsPage();
        
        _page.deleteBtn();
    }

    @Then("SVC - I validate the Delete addon")
    public void iValidateTheDeleteAddon() {
        Assert.assertEquals(_page.addonsValidate(), "Add-Ons");
    }

    @And("SVC - I select the second type of services")    public void iSelectTheSecondTypeOfServices() {
        _page.secondTypeService();
    }

    @And("SVC - I select the third type of services")
    public void iSelectTheThirdTypeOfServices() {
        _page.thirdTypeService();
    }
}

