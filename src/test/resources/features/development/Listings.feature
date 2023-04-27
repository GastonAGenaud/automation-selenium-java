@ENV
Feature: Development Listing

  @DevListing
  Scenario: DEV - Buyer able to create a listing
    Given I login with Gaston User in production products using cookies
    And go to dashboard
    And DEV I validate the My Listings button
    When DEV I validate add new listing button
    And DEV I validate listing name text field
    And DEV I validate listing category
    And DEV I validate listing description text field
    And DEV I validate the listing Price
    And DEV I validate the listing quantity
    And DEV I validate listing image
    And DEV I validate listing video URL
    And DEV I select a Color
    And DEV I click Select the status Tab
    And DEV I select Good
    And DEV I select Publish button
    Then DEV I validate Create a Listing