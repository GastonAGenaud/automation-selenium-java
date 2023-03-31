@prod @prodSettings
Feature: Production Settings


  @prodSettingsChangePassword
  Scenario: Change Password
    Given I login with Gaston User PROD
    And go to dashboard
    When I select settings
    And select password tab
    And change password completing New Password TextField
    And select Save Changes
    Then I valid change password

  @prodSettingsAddUrls
  Scenario:Add social profile urls
    Given I login with Gaston User PROD
    And go to dashboard
    When I select settings
    And select Social tab
    And complete Website TextField
    And complete Facebook TextField
    And complete Twitter TextField
    And complete Instagram TextField
    And complete Linkedin TextField
    And complete Youtube TextField
    And select Save Changes
    Then I valid add social profile urls

  Scenario: Add Credit cards
    Given I login with Gaston User PROD
    And go to dashboard
    When I select settings
    And I select Payment
    And complete Name on card TextField
    And complete Card number TextField
    And complete Expiration Date TextField
    And complete Security Code TextField
    And select Add Credit Card button
    Then I validate Add credit card
