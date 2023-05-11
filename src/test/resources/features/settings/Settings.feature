@MTR-1583
Feature: Settings

  @MTR @MTR-1393
  Scenario: MTR - Profile page
    Given I login with Dev user
    And I go to dashboard
    When I select my settings
    Then I see the profile information

  @settings  @MTR @MTR-1394
  Scenario: MTR - Social media page
    Given I login with Gaston User
    And I go to dashboard
    When I select my settings
    And I select Social
    Then I see the Social information

  @settings  @MTR @MTR-1395
  #Scenario: MTR - Payment
   #Given I login and go to dashboard
    #When I select my settings
    #And I select Payment
    #Then I see the Payment information

  @settings  @MTR @MTR-1396
  #Scenario: MTR - CashOut
   # Given I login and go to dashboard
    #When I select my settings
    #And I select CashOut
    #Then I see the CashOut information

  @settings  @MTR @MTR-1397
  Scenario: MTR - Security
    Given I login with Gaston User
    And I go to dashboard
    When I select my settings
    And I select Security
    Then I see the Security information

  @settings  @MTR @MTR-1398
  Scenario: MTR - Addresses
    Given I login with Gaston User
    And I go to dashboard
    When I select my settings
    And I select Addresses
    Then I see the Addresses information