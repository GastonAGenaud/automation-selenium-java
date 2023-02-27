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
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("Edit Subcategory Shoes")
    public void editSubcategoryShoes() {
        _page.editShoesSubcategory();
    }

    @Then("Valid that the subcategory Shoes was edit")
    public void validThatTheSubcategoryWasEditShoes() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("Delete Subcategory Shoes")
    public void deleteSubcategoryShoes() {
        _page.deleteShoesSubcategory();
    }

    @Then("Valid that the subcategory Shoes was delete")
    public void validThatTheSubcategoryShoesWasDelete() {
        _page.validationSuccesSubcategory().contains("Awesome!");
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
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("edit Subcategory Outdoor Staff")
    public void editSubcategoryOutdoorStaff() {
        _page.editOutdoorStaffSubcategory();
    }

    @Then("Valid that the subcategory Outdoor Staff was edit")
    public void validThatTheSubcategoryOutdoorStaffWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("delete Subcategory Outdoor Staff")
    public void deleteSubcategoryOutdoorStaff() {
        _page.deleteOutdoorStaffSubcategory();
    }

    @Then("Valid that the subcategory Outdoor Staff was delete")
    public void validThatTheSubcategoryOutdoorStaffWasDelete() {
        _page.validationSuccesSubcategory().contains("Awesome!");
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
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("edit Subcategory Rugs")
    public void editSubcategoryRugs() {
        _page.editRugsSubcategory();
    }

    @Then("Valid that the subcategory Rugs was edit")
    public void validThatTheSubcategoryRugsWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("delete Subcategory Rugs")
    public void deleteSubcategoryRugs() {
        _page.deleteRugsSubcategory();
    }

    @Then("Valid that the subcategory Rugs was delete")
    public void validThatTheSubcategoryRugsWasDelete() {
        _page.validationSuccesSubcategory().contains("Awesome!");
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
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("edit Subcategory Clothing")
    public void editSubcategoryClothing() {
        _page.editClothingSubcategory();
    }

    @Then("Valid that the subcategory Clothing was edit")
    public void validThatTheSubcategoryClothingWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("delete Subcategory Clothing")
    public void deleteSubcategoryClothing() {
        _page.deleteClothingSubcategory();
    }

    @Then("Valid that the subcategory Clothing was delete")
    public void validThatTheSubcategoryClothingWasDelete() {
        _page.validationSuccesSubcategory().contains("Awesome!");
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
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("edit Subcategory Skin Care")
    public void editSubcategorySkinCare() {
        _page.editSkinCareSubcategory();
    }

    @Then("Valid that the subcategory Skin Care was edit")
    public void validThatTheSubcategorySkinCareWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("delete Subcategory Skin Care")
    public void deleteSubcategorySkinCare() {
        _page.deleteSkinCareSubcategory();
    }

    @Then("Valid that the subcategory Skin Care was delete")
    public void validThatTheSubcategorySkinCareWasDelete() {
        _page.validationSuccesSubcategory().contains("Awesome!");
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
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("edit Subcategory Accessories")
    public void editSubcategoryAccessories() {
        _page.editAccessoriesSubcategory();
    }

    @Then("Valid that the subcategory Accessories was edit")
    public void validThatTheSubcategoryAccessoriesWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("delete Subcategory Accessories")
    public void deleteSubcategoryAccessories() {
        _page.deleteAccessoriesSubcategory();
    }

    @Then("Valid that the subcategory Accessories was delete")
    public void validThatTheSubcategoryAccessoriesWasDelete() {
        _page.validationSuccesSubcategory().contains("Awesome!");
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
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("edit Subcategory Art & Collectables")
    public void editSubcategoryArtCollectables() {
        _page.editArtAndCollectablesSubcategory();
    }

    @Then("Valid that the subcategory Art & Collectables was edit")
    public void validThatTheSubcategoryArtCollectablesWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("delete Subcategory Art & Collectables")
    public void deleteSubcategoryArtCollectables() {
        _page.deleteArtAndCollectablesSubcategory();
    }

    @Then("Valid that the subcategory Art & Collectables was delete")
    public void validThatTheSubcategoryArtCollectablesWasDelete() {
        _page.validationSuccesSubcategory().contains("Awesome!");
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
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("edit Subcategory Hottest Items")
    public void editSubcategoryHottestItems() {
        _page.editHottestItemsSubcategory();
    }

    @Then("Valid that the subcategory Hottest Items was edit")
    public void validThatTheSubcategoryHottestItemsWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("delete Subcategory Hottest Items")
    public void deleteSubcategoryHottestItems() {
        _page.deleteHottestItemsSubcategory();
    }

    @Then("Valid that the subcategory Hottest Items was delete")
    public void validThatTheSubcategoryHottestItemsWasDelete() {
        _page.validationSuccesSubcategory().contains("Awesome!");
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
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("edit Subcategory Jewelry")
    public void editSubcategoryJewelry() {
        _page.editJewelrySubcategory();
    }

    @Then("Valid that the subcategory Jewelry was edit")
    public void validThatTheSubcategoryJewelryWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("delete Subcategory Jewelry")
    public void deleteSubcategoryJewelry() {
        _page.deleteJewelrySubcategory();
    }

    @Then("Valid that the subcategory Jewelry was delete")
    public void validThatTheSubcategoryJewelryWasDelete() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }
}