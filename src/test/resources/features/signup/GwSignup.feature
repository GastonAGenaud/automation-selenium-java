Feature: Sign Up

  Sign up

  @GwSign @smoke @GOOD-980 @GW
  Scenario: GW - I Create an Account
    Given GW I go to Sign Up Page
    When GW I validate the Sign Up with Facebook
    #And GW I validate the sign up with Google
    And GW I validate the E-mail Text Field with the email "automation"
    And GW I validate the Username Text Field with the username "automation"
    And GW I validate the Password Text Field
    And GW I validate the Sign Up button
    Then GW I validate the creation of an account