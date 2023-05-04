@devServices
Feature: SignUp

  Scenario: Sign Up
    Given I go to Sign Up
    When Sign Up title valid
    And valid Login with Facebook
    And valid Login with Google
    And I Validate the E-mail text field
    And I validate the Username Text Field
    And I validate the Password Text Field
    And I Sign in with new account "email2"
    Then valid session Sign Up