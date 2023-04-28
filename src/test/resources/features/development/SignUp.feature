@ENV
Feature: Development Signup

  @prodSignup
  Scenario: ENV - I Create an Account
    Given I go to Sign Up Page
    When I validate the Sign Up with Facebook
    And I validate the E-mail Text Field with the email "automation2"
    And I validate the Username Text Field with the username "automation2"
    And I validate the Password Text Field "#NcUzbusYqu667gq"
    And I validate the Sign Up button
    Then I validate the creation of an account