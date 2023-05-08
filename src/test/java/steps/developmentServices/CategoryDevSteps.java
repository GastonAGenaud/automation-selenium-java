package steps.developmentServices;

import io.cucumber.java.Before;
import pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.developmentServices.CategoryDevPage;

import java.io.IOException;

public class CategoryDevSteps extends BasePage {
    private CategoryDevPage _page;

    public CategoryDevSteps() {

        this._page = new CategoryDevPage();
    }

    @And("Step {int}: Create Categories Serv")
    public void stepCreateCategoriesServ(int arg0) {
        _page.selectCreateCategorySection();
    }

    @When("Add new Category")
    public void addNewCategory() {
        _page.addCategory();
        _page.enterNewCategory();
    }

    @Then("valid that new category was created")
    public void validThatNewCategoryWasCreated() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("Edit Category")
    public void editCategory() {
        _page.selectKenpachiCat();
        //  _page.editKenpachiCat();

    }

    @Then("valid that the category was edit")
    public void validThatTheCategoryWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("Add new Subcategory")
    public void addNewSubcategory() {
        _page.selectKenpachiEditCat();
        _page.addSubcategory();
    }

    @Then("Valid that the subcategory was created")
    public void validThatTheSubcategoryWasCreated() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("Edit Subcategory")
    public void editSubcategory() {
        _page.selectKenpachiEditCat();
        _page.selectTestSubCat();
    }

    @Then("valid that the Subcategory was edit")
    public void validThatTheSubcategoryWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("Add new Subcategory Item")
    public void addNewSubcategoryItem() {
        _page.selectKenpachiEditCat();
        _page.addItemSubCat();
    }

    @Then("valid that new Subcategory Item was created")
    public void validThatNewSubcategoryItemWasCreated() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("Edit Subcategory Item")
    public void editSubcategoryItem() {
        _page.selectKenpachiEditCat();
        _page.selectHelloItemSubCat();

    }

    @Then("valid that the Subcategory Item was edit")
    public void validThatTheSubcategoryItemWasEdit() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("delete Subcategory Item")
    public void deleteSubcategoryItem() {
        _page.selectKenpachiEditCat();
        _page.selectDeleteHelloItemSubCat();
    }

    @Then("valid that the Subcategory Item was erased")
    public void validThatTheSubcategoryItemWasErased() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("delete Subategory Serv")
    public void deleteSubategoryServ() {
        _page.selectKenpachiEditCat();
        _page.selectDeleteTestSubCat();
    }

    @Then("valid that the Subcategory was erased")
    public void validThatTheSubcategoryWasErased() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @When("delete Category Serv")
    public void deleteCategoryServ() {
        _page.selectDeleteKenpachiCat();
    }

    @Then("valid that the category was erased")
    public void validThatTheCategoryWasErased() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

    @And("Step {int}: Create custom Field Serv")
    public void stepCreateCustomFieldServ(int arg0) {
        _page.selectCreateCustomFieldsSection();
        _page.selectCreateCustomFields();
    }

    @When("create custom Field")
    public void createCustomField() {
        _page.enterFieldName();
        _page.enterFieldDescription();
        _page.fieldType();
        _page.selectFieldCategories();
        _page.enterSaveCustomField();
    }

    @Then("valid that new custom Field was created")
    public void validThatNewCustomFieldWasCreated() {
        _page.validationSuccesSubcategory().contains("Awesome!");
    }

}
