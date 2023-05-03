Feature: Categorys


  @MTR-66
  Scenario: create category
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When Add new Category
    Then valid that new category was created


  @MTR-66
  Scenario: edit category
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When Edit Category
    Then valid that the category was edit

  @MTR-66
  Scenario: delete category
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When delete Category Serv
    Then valid that the category was erased



  @MTR-66
  Scenario: create Subcategory
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When Add new Subcategory
    Then Valid that the subcategory was created


  @MTR-66
  Scenario: edit Subcategory
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When Edit Subcategory
    Then valid that the Subcategory was edit

  @MTR-66
  Scenario: delete Subcategory
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When delete Subategory Serv
    Then valid that the Subcategory was erased



  @MTR-3195 @category @MTR
  Scenario: MTR - valid that you can add a subcategory in shoes
    Given I login with Gaston User
    And Step 4: Create Categories
    When Valid to be viewed Shoes categories
    And Add Subcategory Shoes
    Then Valid that the subcategory Shoes was created

  @MTR-3196 @category @MTR
  Scenario: MTR - valid that you can edit a subcategory in shoes
    Given I login with Gaston User
    And Step 4: Create Categories
    When Valid to be viewed Shoes categories
    And Edit Subcategory Shoes
    Then Valid that the subcategory Shoes was edit

  @MTR-3197 @category @MTR
  Scenario: MTR - valid that you can delete a subcategory in shoes
    Given I login with Gaston User
    And Step 4: Create Categories
    When Valid to be viewed Shoes categories
    And Delete Subcategory Shoes
    Then Valid that the subcategory Shoes was delete