Feature: BrowseBySeller


  @MTR-6
  Scenario: Browse Listings/Browse by Seller (Category)
    Given I login with Gaston User in production services using cookies
    And go to Browse by Seller ServProd
    When select Graphics & Design
    And select Marketing
    And select Programming & Tech
    And select Testing Category
    And select Software
    And select Techonology
    And select Photography
    And select Business
    And select Show more
    Then I validate Filters Serv


  @MTR-66
  Scenario: Browse Listings/Browse by Seller (Location)
    Given I login with Gaston User in production services using cookies
    And go to Browse by Seller ServProd
    When  complete Location TextField Serv
    Then I validate Location Serv