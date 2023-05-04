@devServices
Feature: Home

  Scenario: Contact Us
    Given I login with Gaston User in production services using cookies
    And go to home Serv
    When select Contact Us
    And complete the form the Contact Us
    Then valid The complete form