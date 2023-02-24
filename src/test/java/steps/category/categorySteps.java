package steps.category;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.category.categoryPage;

import java.io.IOException;

public class categorySteps extends BasePage {

    private categoryPage _page;

    public categorySteps() {

        this._page = new categoryPage();
    }


    @When("Valid to be viewed Shoes categories")
    public void validToBeViewedShoesCategories() {
        _page.getCloseChat();
        Assert.assertEquals("Shoes", _page.shoesCategory());
    }


    @And("Add Subcategory Shoes")
    public void addSubcategoryShoes() {
        _page.addShoesSubcategory();
    }

    @Then("Valid that the subcategory Shoes was created")
    public void validThatTheSubcategoryShoesWasCreated() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("Edit Subcategory Shoes")
    public void editSubcategoryShoes() {
        _page.editShoesSubcategory();
    }

    @Then("Valid that the subcategory Shoes was edit")
    public void validThatTheSubcategoryWasEditShoes() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("Delete Subcategory Shoes")
    public void deleteSubcategoryShoes() {
        _page.deleteShoesSubcategory();
    }

    @Then("Valid that the subcategory Shoes was delete")
    public void validThatTheSubcategoryShoesWasDelete() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @When("Valid to be viewed Outdoor Staff categories")
    public void validToBeViewedOutdoorStaffCategories() {
        _page.getCloseChat();
        Assert.assertEquals("Outdoor Staff", _page.outdoorStaffCategory());
    }

    @And("Add Subcategory Outdoor Staff")
    public void addSubcategoryOutdoorStaff() {
        _page.addOutdoorStaffSubcategory();
    }

    @Then("Valid that the subcategory Outdoor Staff was created")
    public void validThatTheSubcategoryOutdoorStaffWasCreated() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("edit Subcategory Outdoor Staff")
    public void editSubcategoryOutdoorStaff() {
        _page.editOutdoorStaffSubcategory();
    }

    @Then("Valid that the subcategory Outdoor Staff was edit")
    public void validThatTheSubcategoryOutdoorStaffWasEdit() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("delete Subcategory Outdoor Staff")
    public void deleteSubcategoryOutdoorStaff() {
        _page.deleteOutdoorStaffSubcategory();
    }

    @Then("Valid that the subcategory Outdoor Staff was delete")
    public void validThatTheSubcategoryOutdoorStaffWasDelete() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @When("Valid to be viewed Rugs categories")
    public void validToBeViewedRugsCategories() {
        _page.getCloseChat();
        Assert.assertEquals("Rugs", _page.rugsCategory());
    }

    @And("Add Subcategory Rugs")
    public void addSubcategoryRugs() {
        _page.addRugsSubcategory();
    }

    @Then("Valid that the subcategory Rugs was created")
    public void validThatTheSubcategoryRugsWasCreated() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("edit Subcategory Rugs")
    public void editSubcategoryRugs() {
        _page.editRugsSubcategory();
    }

    @Then("Valid that the subcategory Rugs was edit")
    public void validThatTheSubcategoryRugsWasEdit() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("delete Subcategory Rugs")
    public void deleteSubcategoryRugs() {
        _page.deleteRugsSubcategory();
    }

    @Then("Valid that the subcategory Rugs was delete")
    public void validThatTheSubcategoryRugsWasDelete() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @When("Valid to be viewed Clothing categories")
    public void validToBeViewedClothingCategories() {
        _page.getCloseChat();
        Assert.assertEquals("Clothing", _page.clothingCategory());
    }

    @And("Add Subcategory Clothing")
    public void addSubcategoryClothing() {
        _page.addClothingSubcategory();
    }

    @Then("Valid that the subcategory Clothing was created")
    public void validThatTheSubcategoryClothingWasCreated() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("edit Subcategory Clothing")
    public void editSubcategoryClothing() {
        _page.editClothingSubcategory();
    }

    @Then("Valid that the subcategory Clothing was edit")
    public void validThatTheSubcategoryClothingWasEdit() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("delete Subcategory Clothing")
    public void deleteSubcategoryClothing() {
        _page.deleteClothingSubcategory();
    }

    @Then("Valid that the subcategory Clothing was delete")
    public void validThatTheSubcategoryClothingWasDelete() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @When("Valid to be viewed Skin Care categories")
    public void validToBeViewedSkinCareCategories() {
        _page.getCloseChat();
        Assert.assertEquals("Skin Care", _page.skinCareCategory());
    }

    @And("Add Subcategory Skin Care")
    public void addSubcategorySkinCare() {
        _page.addSkinCareSubcategory();

    }

    @Then("Valid that the subcategory Skin Care was created")
    public void validThatTheSubcategorySkinCareWasCreated() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("edit Subcategory Skin Care")
    public void editSubcategorySkinCare() {
        _page.editSkinCareSubcategory();
    }

    @Then("Valid that the subcategory Skin Care was edit")
    public void validThatTheSubcategorySkinCareWasEdit() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("delete Subcategory Skin Care")
    public void deleteSubcategorySkinCare() {
        _page.deleteSkinCareSubcategory();
    }

    @Then("Valid that the subcategory Skin Care was delete")
    public void validThatTheSubcategorySkinCareWasDelete() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @When("Valid to be viewed Accessories categories")
    public void validToBeViewedAccessoriesCategories() {
        _page.getCloseChat();
        Assert.assertEquals("Accessories", _page.accessoriesCategory());
    }

    @And("Add Subcategory Accessories")
    public void addSubcategoryAccessories() {
        _page.addAccessoriesSubcategory();
    }

    @Then("Valid that the subcategory Accessories was created")
    public void validThatTheSubcategoryAccessoriesWasCreated() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("edit Subcategory Accessories")
    public void editSubcategoryAccessories() {
        _page.editAccessoriesSubcategory();
    }

    @Then("Valid that the subcategory Accessories was edit")
    public void validThatTheSubcategoryAccessoriesWasEdit() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("delete Subcategory Accessories")
    public void deleteSubcategoryAccessories() {
        _page.deleteAccessoriesSubcategory();
    }

    @Then("Valid that the subcategory Accessories was delete")
    public void validThatTheSubcategoryAccessoriesWasDelete() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @When("Valid to be viewed Art & Collectables categories")
    public void validToBeViewedArtCollectablesCategories() {
        _page.getCloseChat();
        Assert.assertEquals("Art & Collectables", _page.artAndCollectablesCategory());
    }

    @And("Add Subcategory Art & Collectables")
    public void addSubcategoryArtCollectables() {
        _page.addArtAndCollectablesSubcategory();
    }

    @Then("Valid that the subcategory Art & Collectables was created")
    public void validThatTheSubcategoryArtCollectablesWasCreated() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("edit Subcategory Art & Collectables")
    public void editSubcategoryArtCollectables() {
        _page.editArtAndCollectablesSubcategory();
    }

    @Then("Valid that the subcategory Art & Collectables was edit")
    public void validThatTheSubcategoryArtCollectablesWasEdit() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("delete Subcategory Art & Collectables")
    public void deleteSubcategoryArtCollectables() {
        _page.deleteArtAndCollectablesSubcategory();
    }

    @Then("Valid that the subcategory Art & Collectables was delete")
    public void validThatTheSubcategoryArtCollectablesWasDelete() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @When("Valid to be viewed Hottest Items categories")
    public void validToBeViewedHottestItemsCategories() {
        _page.getCloseChat();
        Assert.assertEquals("Hottest Items", _page.hottestItemsCategory());
    }

    @And("Add Subcategory Hottest Items")
    public void addSubcategoryHottestItems() {
        _page.addHottestItemsSubcategory();
    }

    @Then("Valid that the subcategory Hottest Items was created")
    public void validThatTheSubcategoryHottestItemsWasCreated() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("edit Subcategory Hottest Items")
    public void editSubcategoryHottestItems() {
        _page.editHottestItemsSubcategory();
    }

    @Then("Valid that the subcategory Hottest Items was edit")
    public void validThatTheSubcategoryHottestItemsWasEdit() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("delete Subcategory Hottest Items")
    public void deleteSubcategoryHottestItems() {
        _page.deleteHottestItemsSubcategory();
    }

    @Then("Valid that the subcategory Hottest Items was delete")
    public void validThatTheSubcategoryHottestItemsWasDelete() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @When("Valid to be viewed Jewelry categories")
    public void validToBeViewedJewelryCategories() {
        _page.getCloseChat();
        Assert.assertEquals("Jewelry", _page.jewelryCategory());
    }

    @And("Add Subcategory Jewelry")
    public void addSubcategoryJewelry() {
        _page.addJewelrySubcategory();
    }

    @Then("Valid that the subcategory Jewelry was created")
    public void validThatTheSubcategoryJewelryWasCreated() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("edit Subcategory Jewelry")
    public void editSubcategoryJewelry() {
        _page.editJewelrySubcategory();
    }

    @Then("Valid that the subcategory Jewelry was edit")
    public void validThatTheSubcategoryJewelryWasEdit() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }

    @And("delete Subcategory Jewelry")
    public void deleteSubcategoryJewelry() {
        _page.deleteJewelrySubcategory();
    }

    @Then("Valid that the subcategory Jewelry was delete")
    public void validThatTheSubcategoryJewelryWasDelete() {
        Assert.assertEquals("Awesome!", _page.validationSuccesSubcategory());
    }
}