Feature: AdminPanel

#Given I login with Gaston User Prod
  @MTR-1111
  Scenario: Login
    Given I go login page PROD
    When Login title valid
    And valid Login with Facebook
    And valid Login with Google
    And I login with Gaston User Prod
    Then valid session login

  @MTR-2222
  Scenario: Sign Up
    Given I go to Sign Up PROD
    When Sign Up title valid
    And valid Login with Facebook
    And valid Login with Google
    And I Validate the E-mail text field
    And I validate the Username Text Field
    And I validate the Password Text Field
    And I Sign in with new account "email2" PROD
    Then valid session Sign Up