@devServices
Feature: Login

  Scenario: Login
    Given I go login page PROD
    When Login title valid
    And valid Login with Facebook
    And valid Login with Google
    And I login with Gaston User in production services using cookies
    Then valid session login

  Scenario: Forgot Password
    Given I go login page PROD
    When go to forgot your Password
    And enter the e-mail to recover the password
    Then Valid that An email has been sent to reset the password.