Feature: Production Browse

  Scenario: Browse Listing, filters
    Given I login with Gaston User in production products using cookies
    And go to Listing Page
    When select Accessories
    And select Body Jewelry & Stuff
    And select Bracelets & Stuff
    And select Errings
    And select happy
    And select Rings
    And select Shoes