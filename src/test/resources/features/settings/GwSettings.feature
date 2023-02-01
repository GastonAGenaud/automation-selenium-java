Feature: Settings

  @GwSettings @smoke @GOOD-973 @GW
  Scenario: GW - Profile page
    Given GW I login and go to dashboard
    When GW I select my settings
    Then GW I see the profile information

  @GwSettings @smoke @GOOD-974 @GW
  Scenario: GW - Social media page
    Given GW I login and go to dashboard
    When GW I select my settings
    And GW I select Social
    Then GW I see the Social information

#  @GwSettings @smoke @payment
#  Scenario: GW - Payment
#   Given GW I login and go to dashboard
#    When GW I select my settings
#    And GW I select Payment
#    Then GW I see the Payment information

  @GwSettings @smoke  @cashout @GOOD-977 @GW
  Scenario: GW - Cashout
    Given GW I login and go to dashboard
    When GW I select my settings
    And GW I select CashOut
    Then GW I see the CashOut information

  @GwSettings @smoke @GOOD-975 @GW
  Scenario: GW - Security
    Given GW I login and go to dashboard
    When GW I select my settings
    And GW I select Security
    Then GW I see the Security information

  @GwSettings @smoke @GOOD-976 @GW
  Scenario: GW - Addresses
    Given GW I login and go to dashboard
    When GW I select my settings
    And GW I select Addresses
    Then GW I see the Addresses information

  @GwSettings @smoke @GOOD-978 @GW
  Scenario: GW - Subscription
    Given GW I login and go to dashboard
    When GW I select my settings
    And GW I select Subscription
    Then GW I see the Subscription information