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
