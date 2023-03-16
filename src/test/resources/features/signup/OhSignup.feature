Feature: Sign Up

  @OHE-320 @OH3  @OHE  @OhSignUp
  Scenario: OHE - I Create an Account
    Given I Sign in with new account "email2"
#    When I type in the E-mail text field "Automation"
#    And I type in the Username text field "Automation"
#    And I type in the Password text field
    And I select sign up button
    Then I validate create an account