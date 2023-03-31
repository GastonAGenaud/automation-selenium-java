@MTR-1587
Feature: Sign Up

  Sign up

  @sign  @MTR @MTR-3397
  Scenario: MTR - I Create an Account
    Given I go to Sign Up Page
    When I validate the Sign Up with Facebook
    #And I validate the sign up with Google
    And I validate the E-mail Text Field with the email "automation"
    And I validate the Username Text Field with the username "automation"
    And I validate the Password Text Field "123456789Automation"
    And I validate the Sign Up button
    Then I validate the creation of an account