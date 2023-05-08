@devServices
Feature: BrowseWants

  Scenario: Browse Listings/Browse Request (category)
    Given I login with Gaston User in production services using cookies
    And go to Browse Request Serv
    When select Graphics & Design
    And select Marketing
    And select Programming & Tech
    And select Testing Category
    And select Software
    And select Technology
    And select Photography
    And select Business
    And select Show more
    Then I validate Filters Serv

  Scenario: Browse Listings/Browse Request (Price)
    Given I login with Gaston User in production services using cookies
    And go to Browse Request Serv
    When complete price numbers TextFields in Set up Manually ServProd
    And select Apply Serv
    Then I validate Price filter in section Browse Request ServProd

  Scenario: Browse Listings/Browse Request (Location)
    Given I login with Gaston User in production services using cookies
    And go to Browse Request Serv
    When  complete Location TextField Serv
    Then I validate Location Serv