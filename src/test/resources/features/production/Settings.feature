@prod @prodSettings
Feature: Production Settings


  @prodSettingsChangePassword
  Scenario: Change Password
    Given I login with Gaston User in production products using cookies
    And go to dashboard
    When I select settings
    And select password tab
    And change password completing New Password TextField
    And select Save Changes
    Then I valid change password

  @prodSettingsAddUrls
  Scenario:Add social profile urls
    Given I login with Gaston User in production products using cookies
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

  @AddCreditCard
  Scenario: Add Credit card
    Given I login with Gaston User in production products using cookies
    And go to dashboard
    When I select settings
    And I select Payment
    And complete Name on card TextField
    And complete Card number TextField
    And complete Expiration Date TextField
    And complete Security Code TextField
    And select Add Credit Card button
    Then I validate Add credit card

  @ActivateNotifications @testingNotifications
  Scenario: Activate notifications
    Given I login with Gaston User in production products using cookies
    And go to dashboard
    When I select settings
    And select Notifications Tab
    And select Email Notifications checkbox
    And select SMS Notifications checkbox
    And complete Phone number TextField ONE
    And select WhatsApp Notifications checkbox
    And complete Phone number TextField TWO
    And select the Save Changes button
    Then I validate Activate Notifications

  @DeactivateNotifications @testingNotifications
  Scenario: Deactivate notifications
    Given I login with Gaston User in production products using cookies
    And go to dashboard
    When I select settings
    And select Notifications Tab
    And select SMS Notifications checkbox
    And select Email Notifications checkbox
    And select WhatsApp Notifications checkbox
    And select the Save Changes button
    Then I validate Deactivate Notifications

  @TestingAddAddress
  Scenario: Add Address
    Given I login with Gaston User in production products using cookies
    And go to dashboard
    When I select settings
    And select Shipping Tab
    And select Add New address
    And complete Full Name TextField
    And complete Phone Number TextField
    And complete Address Line
    And complete Country TextField
    And complete State-Province-Region TextField
    And complete City TextField
    And complete ZIP-Postal Code TextField
    And select Save Button
    Then I validate Add Address option


  @EditAddress @TestingAddAddress
  Scenario: Edit Address
    Given I login with Gaston User in production products using cookies
    And go to dashboard
    When I select settings
    And select Shipping Tab
    And select Edit Address button
    And Edit Zip Text
    And select Edit Save Button
    Then I validate Edit Address option

  @DeleteAddress @TestingAddAddress
  Scenario: Delete Address
    Given I login with Gaston User in production products using cookies
    And go to dashboard
    When I select settings
    And select Shipping Tab
    And select Delete Address
    And select Delete Confirm
    Then I validate delete Address


  @FillProfile
  Scenario: Fill in profile information and save
    Given I login with Gaston User in production products using cookies
    And go to dashboard
    When I select settings
    And see Personal Information
    And I complete First Name TextField
    And complete Last name TextField
    And complete User Name TextField
    And I complete E-Mail TextField
    And I complete Phone number TextField
    And complete Bio TextField
    And select Save Changes
    Then valid Fill in profile information