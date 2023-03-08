Feature: Settings

  @SVC-350 @SVC @smoke @SvcSettings
  Scenario: SVC - Profile page
    Given I login and go to dashboard page
    When I select My Settings
    Then I validate the profile information

  #@SVC-351 @SVC @smoke @SvcSettings
  #Scenario: SVC - Social media page
   # Given I login and go to dashboard page
    #When I select My Settings
    #And I select social section
    #Then I see the social information

  @SVC-352 @SVC @smoke @SvcSettings
  Scenario: SVC - Payment
    Given I login and go to dashboard page
    When I select My Settings
    And I select payment section
    Then I see the payment information

  @SVC-353 @SVC @smoke @SvcSettings
  Scenario: SVC - CashOut
    Given I login and go to dashboard page
    When I select My Settings
    And I select CashOut section
    Then I see the cashout information

  @SVC-354 @SVC @smoke @SVC @SvcSettings
  Scenario: SVC - Password
    Given I login and go to dashboard page
    When I select My Settings
    And I select password section
    Then I see the password information

  @SVC-355 @SVC @smoke @SvcSettings
  Scenario: SVC - Experience
    Given I login and go to dashboard page
    When I select My Settings
    And I select experience section
    Then I see the experience information
