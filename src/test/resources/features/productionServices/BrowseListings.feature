Feature: BrowseListings

  @MTR-5
  Scenario: Browse Listings/Browse Expert (Category)
    Given I login with Gaston User in production services using cookies
    And go to Listing Page Serv
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
  Scenario: Browse Listings/Browse Expert (Category)
    Given I login with Gaston User in production services using cookies
    And go to Listing Page Serv
    When select filter colors
    Then valid color filter

  @MTR-66
  Scenario: Browse Listings/Browse Expert (Work Model)
    Given I login with Gaston User in production services using cookies
    And go to Listing Page Serv
    When select Video Conference
    And select in-Person
    Then I validate Work Model Section


  @MTR-66
  Scenario: Browse Listings/Browse Expert (Price)
    Given I login with Gaston User in production services using cookies
    And go to Listing Page Serv
    When complete price numbers TextFields in Set up Manually ServProd
    And select Apply button Serv
    Then I validate Price filter Serv

  @MTR-66
  Scenario: Browse Listings/Browse Expert (Location)
    Given I login with Gaston User in production services using cookies
    And go to Listing Page Serv
    When  complete Location TextField Serv
    Then I validate Location Serv
