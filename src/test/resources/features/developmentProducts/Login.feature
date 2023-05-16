@devProducts @devLogin
Feature: Development Login

  @devLogin
  Scenario: Login
    Given I go to Products
    And I select Header Login
    When complete E-Mail TextField
    And complete Password TextFields
    And select Log in Button
    Then I validate Login

  @devForgotPassword
  Scenario: Forgot password
    Given I go to Products
    And I select Header Login
    When select Forgot your password?
    And complete Forgot Email TexField
    And select Send e-mail button
    Then see reset password message


