@MMRS-923
Feature: Services Sign Up

  @MMRS-924 @MMRSSignup
  Scenario: SVC - I Create an Account
    Given SVC I Sign in with new account "email2"
#    When I type in the E-mail text field "Automation"
#    And I type in the Username text field "Automation"
#    And I type in the Password text field
    And SVC I select sign up button
    Then SVC I validate create an account