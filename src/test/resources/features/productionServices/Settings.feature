Feature: Settings

  @MTR-6
  Scenario: Settings/ Connect to Stripe
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    When go to Settings Serv
    And go to Cashout
    Then valid than connect to Stripe

  @MTR-6
  Scenario: Settings/ Fill in profile information and save
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    When go to Settings Serv
    And enter profile information Serv
    Then valid to save profile information

  @MTR-6
  Scenario: Settings/ add and delete credit cards
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Settings Serv
    Then select Payment Section
    And Add new Credit Card
    When valid that the new credit card has been created
    And delete Credit Card
    And valid that the credit card has been erased

  @MTR-6
  Scenario: Settings/ Change password
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Settings Serv
    Then select Password section
    And add New password
    When valid if the password has been changed

  @MTR-66
  Scenario: Settings/ activate or deactivate notifications
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Settings Serv
    Then select Notifications Section
    And activate notifications
    When valid to activate notifications
    And desactive notifications
    And valid to desactive notofications

  @MTR-6
  Scenario: Settings/ Add-edit or delete addresses
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    And go to Settings Serv
    Then select Addresses Section
    And add New Address
    When valid that the new address has been created
    And select Edit Addresses
    And valid that the address has been edited
    And select Delete Address saved
    And valid that the address has been erased