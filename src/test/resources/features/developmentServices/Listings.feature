@devServices
Feature: Listings


  Scenario: Listing/Service Details
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And DEV I validate the My Listings button
    When DEV I validate add new listing button
    And go to Dashboard ServI validate listing name text field Serv
    And I validate listing category Serv
    And I validate listing Work ModelServ
    And I validate listing description text field Serv
    And I validate the listing Price Serv
    And I validate listing image Serv
    And I validate listing video URL Serv
    And Go to details Section Serv
    And I validate Custom fields
    And Go to Availability Serv
    And I validate Set available days
    Then I validate Create a Listing Serv

  Scenario: Create a Service
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    When select My Listings button Serv
    And add New Listing
    Then I validate create a listing Staging