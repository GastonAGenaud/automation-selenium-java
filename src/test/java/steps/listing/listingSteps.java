package steps.listing;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;
import pages.listing.listingPage;


public class listingSteps extends BasePage {

    private listingPage _page;

    public listingSteps() {

        this._page = new listingPage();
    }

    @And("I login and go to listing page")
    public void iLoginAndGoToListingPage() {
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.goToLoginPageStaging();
        _page.goToListingPageStaging();
    }

    @Given("I login and go to listing page (RELEASE)")
    public void iLoginAndGoToListingPageRelease() {
        //_driver.manage().window().setSize(new Dimension(2560, 1440));
        _page.setHomePageRelease();
        _page.goToLoginPage();
        //_page.login();
        _page.goToListingPage();

    }

    @When("I validate the add new listing button")
    public void iValidateTheAddNewListingButton() {
        _page.addListingBtn();
    }

    @And("I validate the listing name text field")
    public void iValidateTheListingNameTextField() {
        _page.listingName();
    }

    @And("I validate the listing category")
    public void iValidateTheListingCategory() {
        _page.categoryBtn();
        _page.categoryJewelryBtn();
    }

    @And("I validate the listing description text field")
    public void iValidateTheListingDescriptionTextField() {
        _page.listingDescription();
    }

    @And("I validate the listing price")
    public void iValidateTheListingPrice() {
        _page.listingPrice();

    }

    @And("I validate the listing quantity")
    public void iValidateTheListingQuantity() {
        _page.listingQuantity();
    }

    @And("I validate the listing image")
    public void iValidateTheListingImage() {
        _page.listingImageLoad();
        _page.cropButton();
    }

    @And("I validate the listing image (RELEASE)")
    public void iValidateTheListingImageRelease() {
        _page.listingImageLoad();
    }


    @And("I validate the listing video URL")
    public void iValidateTheListingVideoURL() {
        _page.listingVideo();
    }

    @And("I validate the shipping with USPS")
    public void iValidateTheShippingWithUSPS() {
        _page.USPSOption();
        _page.USPSAddress1();
        _page.USPSCity();
        _page.USPSState();
        _page.USPSZip();
        _page.USPSCountry();
        _page.USPSWeight();
        _page.USPSLength();
        _page.USPSWidth();
        _page.USPSHeight();

    }

    @And("I validate the shipping with FedEx")
    public void iValidateTheShippingWithFedEx() {
        _page.fedExOption();
        _page.fedExAddress1();
        _page.fedExCity();
        _page.fedExState();
        _page.fedExZip();
        _page.fedExCountry();
        _page.fedExWeight();
        _page.fedExLength();
        _page.fedExWidth();
        _page.fedExHeight();
        _page.fedExPhoneNumber();
    }

    @And("I validate the Flat Rate Shipping")
    public void iValidateTheFlatRateShipping() {
        _page.flatRateOption();
        _page.flatRateAddress1();
        _page.flatRateCity();
        _page.flatRateState();
        _page.flatRateZip();
        _page.flatRateCountry();

        _page.flatRatePrice();

    }

    @And("I validate the pick up option")
    public void iValidateThePickUpOption() {
        _page.noShipping();

        _page.pickUpCheckbox();
        _page.pickUpAddress1();
        _page.pickUpCity();
        _page.pickUpState();
        _page.pickUpZip();
        _page.pickUpCountry();

        //_page.setSameAddressPickupBtn();
    }

    @Then("I validate the go to details")
    public void iValidateTheGoToDetails() {
        Assert.assertEquals(true, _page.listingConfirm());
    }

    @Then("I validate create a listing (RELEASE)")
    public void iValidateCreateAListingRELEASE() {
        Assert.assertEquals(true, _page.GreatText());
    }

    @Then("I validate create a listing (Staging)")
    public void iValidateCreateAListingStaging() {
        Assert.assertEquals(_page.GreatText(), "Great job! Your listing is under review and will be published soon.");
    }

    @And("I select Publish button STAGING")
    public void iSelectPublishButtonSTAGING() {
        _page.setListingPublishBtn();
        Assert.assertFalse(_page.validatePickupError());
        _page.setListingPublishBtn();
    }

    @And("I validate the pick up option RELEASE")
    public void iValidateThePickUpOptionRELEASE() {
        _page.noShipping();

        _page.pickUpCheckbox();
        _page.pickUpAddress1();
        _page.pickUpCity();
        _page.pickUpState();
        _page.pickUpZip();
        _page.pickUpCountry();

        //_page.setSameAddressPickupBtn();
    }

    @And("I select go to details RELEASE")
    public void iSelectGoToDetailsRELEASE() {
        _page.setGotoDetailsButton();
    }

    @And("I complete Custom Fields")
    public void iCompleteCustomFields() {
        //_page.setConditionOfItemTextField();
        _page.setDepartmentTab();
        //_page.setDepartmentMenOption();
        _page.goldCheckbox();
        _page.getMandatoryTextfield();
        _page.sizeTextField();
    }
}