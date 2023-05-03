@ENV @search
Feature: Development Search

  @homeSearch
  Scenario: Search in home
    Given I login with Gaston User in development products using cookies
    And select Home button
    When complete search TextField
    And select update
    Then I validate Search in home

  @homeSearch2
  Scenario: Search in home 2
    Given I login with Gaston User in development products using cookies
    And select Browse Listings
    When complete search TextField Browse
    And select search
    Then I validate Search in Listings