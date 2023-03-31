Feature: Settings

  @MMRS-917 @MMRS  @MMRSSettings
  Scenario: SVC - Profile page
    Given I login and go to dashboard page
    When SVC I select My Settings
    Then I validate the profile information

  #@MMRS-351 @MMRS  @MMRSSettings
  #Scenario: SVC - Social media page
   # Given I login and go to dashboard page
    #When SVC I select My Settings
    #And I select social section
    #Then I see the social information

  @MMRS-918 @MMRS  @MMRSSettings
  Scenario: SVC - Payment
    Given I login and go to dashboard page
    When SVC I select My Settings
    And I select payment section
    Then I see the payment information

  @MMRS-919 @MMRS  @MMRSSettings
  Scenario: SVC - CashOut
    Given I login and go to dashboard page
    When SVC I select My Settings
    And I select CashOut section
    Then I see the cashout information

  @MMRS-920 @MMRS  @MMRS @MMRSSettings
  Scenario: SVC - Password
    Given I login and go to dashboard page
    When SVC I select My Settings
    And I select password section
    Then I see the password information

  @MMRS-921 @MMRS  @MMRSSettings
  Scenario: SVC - Addresses
    Given I login and go to dashboard page
    When SVC I select My Settings
    And SVC I select Addresses section
    Then SVC I see the Addresses information

  @MMRS-922 @MMRS  @MMRSSettings
  Scenario: SVC - Notifications
    Given I login and go to dashboard page
    When SVC I select My Settings
    And I select Notifications section
    Then I see the Notifications information

