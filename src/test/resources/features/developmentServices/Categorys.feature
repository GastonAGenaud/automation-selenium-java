@devServices
Feature: Categorys


  Scenario: create category
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When Add new Category
    Then valid that new category was created


  Scenario: edit category
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When Edit Category
    Then valid that the category was edit


  Scenario: create Subcategory
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When Add new Subcategory
    Then Valid that the subcategory was created


  Scenario: edit Subcategory
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When Edit Subcategory
    Then valid that the Subcategory was edit


  Scenario: create Subcategory item
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When Add new Subcategory Item
    Then valid that new Subcategory Item was created


  Scenario: edit Subcategory  item
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When Edit Subcategory Item
    Then valid that the Subcategory Item was edit


  Scenario: delete Subcategory item
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When delete Subcategory Item
    Then valid that the Subcategory Item was erased


  Scenario: delete Subcategory
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When delete Subategory Serv
    Then valid that the Subcategory was erased


  Scenario: delete category
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create Categories Serv
    When delete Category Serv
    Then valid that the category was erased


  Scenario: create Custom Field
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Admin Panel Serv
    And Step 4: Create custom Field Serv
    When create custom Field
    Then valid that new custom Field was created

