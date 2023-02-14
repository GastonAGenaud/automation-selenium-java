Feature: Sponsored Ads

  @sponsoredAds @smoke @MTR  @MTR-1600
  Scenario: MTR - User able to create an Ad
    Given I login with Make An offer
    And I go to dashboard
    When I select Sponsored Ads section
    And I select the Add New button
    And I complete the Ad information TextField
    And I complete the URL TextField
    And I add an image
    And I complete the Start Date TextField
    And I complete the End Date TextField
    And I select the Publish button
    Then I validate Create an Ad

  @sponsoredAds @smoke @MTR  @MTR-1601
  Scenario: MTR - User able to change status to Active
    Given I login with Dev user
    And I go to dashboard
    When I select Sponsored Ads section
    And I select the tab dots
    And I select the Reactivate option
    Then I validate the change status to Active

  @sponsoredAds @smoke @MTR  @MTR-1602
  Scenario: MTR - User able to change status to Inactive
    Given I login with Make An offer
    And I go to dashboard
    When I select Sponsored Ads section
    And I select the tab dots DEACTIVATE
    And I select the Deactivate option
    Then I validate the change status to Inactive

  @sponsoredAds @smoke @MTR  @MTR-1603
  Scenario: MTR - User able to pay an ad
    Given I login with another account
    And I go to dashboard
    When I select Sponsored Ads section
    And I create a new Ad for PENDING PAY
    And I select the tab dots PENDING PAY
    #And I select the Pay option
    And I complete the Card Number TextField
    And I complete the Name on Card TextField
    And I complete the Expiration Date TextField
    And I complete the CVV Code TextField
    And I select the Submit Payment Button
    Then I validate Pay an ad

  @sponsoredAds @smoke @MTR  @MTR-1604
  Scenario: MTR - User able to sort ads
    Given I login with Gaston User
    And I go to dashboard
    When I select Sponsored Ads section
    And I select the Sort By option
    And I select the Expires Last option
    Then I validate sort ads

  @sponsoredAds @smoke @MTR  @MTR-1605
  Scenario: MTR - User able to Edit ads
    Given I login with Gaston User
    And I go to dashboard
    When I select the Sponsored Ads section
    And I select the tab dots EDIT
    And I select the Edit option
    And i click the Publish button
    Then I validate the Edit ads

  @sponsoredAds @smoke @MTR  @MTR-1606
  Scenario: MTR - User able to Delete ads
    Given I login with Gaston User
    And I go to dashboard
    When I select the Sponsored Ads section
    And I select the tab dots DELETE
    And I select the Delete option
    Then I validate the Delete ads
