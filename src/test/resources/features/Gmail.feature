@gmail
Feature: Gmail
  Implementation of the fist flow proposed


  Scenario: Validate success login
    Given Navigate to "https://gmail.com" page
    When Login using "valid" credentials
    Then Verify success login by user profile icon

  Scenario: Validate success login
    Given Navigate to "https://gmail.com" page
    When Login using "invalid" credentials
    Then Verify incorrect login