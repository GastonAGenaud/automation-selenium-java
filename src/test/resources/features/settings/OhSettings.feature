Feature: Settings

  @OHE-350 @OHE  @OHsettings
  Scenario: OHE - Profile page
    Given I login and go to dashboard page
    When I select My Settings
    Then I validate the profile information

  #@OHE-351 @OHE  @OHsettings
  #Scenario: OHE - Social media page
   # Given I login and go to dashboard page
    #When I select My Settings
    #And I select social section
    #Then I see the social information

  @OHE-352 @OHE  @OHsettings
  Scenario: OHE - Payment
    Given I login and go to dashboard page
    When I select My Settings
    And I select payment section
    Then I see the payment information

  @OHE-353 @OHE  @OHsettings
  Scenario: OHE - CashOut
    Given I login and go to dashboard page
    When I select My Settings
    And I select CashOut section
    Then I see the cashout information

  @OHE-354 @OHE  @OHE @OHsettings
  Scenario: OHE - Password
    Given I login and go to dashboard page
    When I select My Settings
    And I select password section
    Then I see the password information

  @OHE-355 @OHE  @OHsettings
  Scenario: OHE - Experience
    Given I login and go to dashboard page
    When I select My Settings
    And I select experience section
    Then I see the experience information
