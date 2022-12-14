@ebay
Feature: Ebay
  Implementation of the second flow proposed


  Scenario: Open the fist result and output item price (to console)
    Given Navigate to "https://ebay.com" page
    When Search for "Electric Guitar"
    Then Open first result and output item price

