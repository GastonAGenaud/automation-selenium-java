package steps.addons;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.addons.AddonsPage;

public class AddonsSteps extends BasePage {

    private AddonsPage _page;

    public AddonsSteps() {

        this._page = new AddonsPage();
    }


    @When("I select add add on button")
    public void iSelectAddAddOnButton() {
        _page.addNewAddOns();
    }

    @And("I select the type of service")
    public void iSelectTheTypeOfService() {
        _page.addonServiceFeaturedUsers();
    }

    @And("I complete the Title text field")
    public void iCompleteTheTitleTextField() {
        _page.addonTitle();
    }

    @And("I complete the description text field")
    public void iCompleteTheDescriptionTextField() {
        _page.addonDescription();
    }

    @And("I complete the stripe productId text field")
    public void iCompleteTheStripeProductIdTextField() {
        _page.addonStripeId();
    }

    @And("I complete video URL")
    public void iCompleteVideoURL() {
        _page.addonVideoURL();
    }

    @And("I load a image")
    public void iLoadAImage() {
        _page.addonCheckbox();
        _page.addonImage();
        //_page.cropButton();
    }

    @And("I select the save button")
    public void iSelectTheSaveButton() {
        _page.addonSave();
    }

    @Then("I validate the created addon")
    public void iValidateTheCreatedAddon() {
        Assert.assertEquals("Add-Ons", _page.addonsConfirm());
    }

    @When("I select edit button in addons")
    public void iSelectEditButtonInAddons() {
        _page.addonEdit();
    }

    @And("I select other type of service")
    public void iSelectOtherTypeOfService() {
        _page.addonServiceSubscriptionEdit();
    }

    @And("I complete the edit Title text field")
    public void iCompleteTheEditTitleTextField() {
        _page.addonEditTitle();
    }

    @And("I complete the edit description text field")
    public void iCompleteTheEditDescriptionTextField() {
        _page.addonEditDescription();
    }

    @And("I complete the edit stripe productId text field")
    public void iCompleteTheEditStripeProductIdTextField() {
        _page.addonEditStripeId();
    }

    @Then("I validate the edit")
    public void iValidateTheEdit() {
        Assert.assertEquals("Add-Ons", _page.addonsConfirm());
    }

    @When("I select delete button")
    public void iSelectDeleteButton() {
        try {
            _page.addonDelete();
        } catch (Exception e) {
            wait(3);
            _page.addonDelete();
        } finally {
            _page.addonDelete();
        }
    }

    @Then("I validate the delete addon")
    public void iValidateTheDeleteAddon() {
        Assert.assertEquals("Add-Ons", _page.addonsConfirm());
    }

    @And("I select the second type of service")
    public void iSelectTheSecondTypeOfService() {
        _page.addonServiceSubscription();
    }

    @And("I select the third type of service")
    public void iSelectTheThirdTypeOfService() {
        _page.addonServiceOrderAutoApproval();
    }


    @Then("Validate the shipping with FedEx")
    public void validateTheShippingWithFedEx() {
        _page.fedExOption();
        Assert.assertEquals("Address line 1", _page.validateFedExAddress1());
        Assert.assertEquals("Address line 2", _page.validateFedExAddress2());
        Assert.assertEquals("City", _page.valiateFedExCity());
        Assert.assertEquals("State", _page.validateFedExState());
        Assert.assertEquals("ZIP", _page.validateFedExZip());
        Assert.assertEquals("Country", _page.validateFedExCountry());
        Assert.assertEquals("Weight (lbs)", _page.validateFedExWeightLbs());
        //    Assert.assertEquals("Weight (oz)", _page.validateFedExWeightOz());
        //    Assert.assertEquals("Length (in)", _page.validateFedExLength());
        //    Assert.assertEquals("Width (in)", _page.validateFedExWidth());
        //    Assert.assertEquals("Height (in)", _page.validateFedExHeight());
        Assert.assertEquals("Phone number", _page.validateFedExPhoneNumber());
    }


    @And("validate the listing name text field")
    public void validateTheListingNameTextField() {
        _page.listingNameTextField();
    }

    @And("select my newly created product ADDONS")
    public void selectMyNewlyCreatedProductADDONS() {
        _page.selectMyNewlyProduct();
        _page.saveTheUrlDevuct();
    }

    @And("I will purchase the product")
    public void iWillPurchaseTheProduct() {
        _page.goToProductDownloadFile();
        _page.buyProductDigital();
    }


    @And("I go to addons")
    public void iGoToAddons() {
        _page.addonBtnFromPanel();
        _page.getCloseChat();
    }


    @And("I validate the listing category Shoes")
    public void iValidateTheListingCategoryShoes() {
        _page.categoryBtn();
        _page.categoryShoesBtn();
    }

    @And("I search and select the addons")
    public void iSearchAndSelectTheAddons() {
        _page.searchAddons();
    }
}
