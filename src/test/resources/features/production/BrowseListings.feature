@categoriesProduction
Feature: Production Browse

  Scenario: Browse Listing, Category
    Given I login with Gaston User in production products using cookies
    And go to Listing Page
    When select Accessories
    And select Body Jewelry & Stuff
    And select Bracelets & Stuff
    And select Earrings
    And select happy
    And select Rings
    And select Shoes
    Then I validate Filters

  Scenario: Browse Listing, Price
    Given I login with Gaston User in production products using cookies
    And go to Listing Page
    When complete price numbers TextFields in Set up Manually
    And select Apply button
    Then I validate Price filter

  Scenario: Browse Listing, Colors
    Given I login with Gaston User in production products using cookies
    And go to Listing Page
    When select Dark Green color
    Then I validate colors filter

  Scenario: Browse Listing, Location
    Given I login with Gaston User in production products using cookies
    And go to Listing Page
    When complete Location TextField
    Then I validate Location