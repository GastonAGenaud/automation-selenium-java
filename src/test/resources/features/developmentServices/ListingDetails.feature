@devServices
Feature: ListingDetails

  Scenario: Browse Listings Details
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    When go to Listing Page Serv
    Then valid select Block
    And valid select List
    And valid select Map
    And valid select Search
