@browseBySellerCategories
Feature: Production Browse By Seller


  @browseBySellerCategories1
  Scenario: Browse by Seller, Category
    Given I login with Gaston User in production products using cookies
    And go to Browse By Seller
    When select Accessories BBS
    And select Department
    And select Mens option
    And select Art Deco checkbox
    And complete Size TextField
    And select Article License
    And select Medium License
    And select Body Jewelry & Stuff BBS
    And select Bracelets & Stuff BBS
    And select Earrings BBS
    And select happy BBS
    And select Rings BBS
    And select Shoes BBS
    Then I validate Filters BBS

  @browseBySellerCategories2
  Scenario: Browse by Seller, Location
    Given I login with Gaston User in production products using cookies
    And go to Browse By Seller
    When complete Location TextField BBS
    Then I validate Location BBS
