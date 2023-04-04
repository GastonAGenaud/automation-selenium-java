@MTR-2056
Feature: Sponsored Ads

  @sponsoredAds  @MTR  @MTR-1600
  Scenario: MTR - User able to create an Ad
    Given I login with Gaston User
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

  @sponsoredAds  @MTR  @MTR-1601
  Scenario: MTR - User able to change status to Active
    Given I login with Gaston User
    And I go to dashboard
    When I select Sponsored Ads section
    And I select the tab dots
    And I select the Reactivate option
    Then I validate the change status to Active

  @sponsoredAds  @MTR  @MTR-1602
  Scenario: MTR - User able to change status to Inactive
    Given I login with Gaston User
    And I go to dashboard
    When I select Sponsored Ads section
    And I select the tab dots DEACTIVATE
    And I select the Deactivate option
    Then I validate the change status to Inactive

  @sponsoredAds  @MTR  @MTR-1603
  Scenario: MTR - User able to pay an ad
    Given I login with Gaston No Borrar
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

  @sponsoredAds  @MTR  @MTR-1604
  Scenario: MTR - User able to sort ads
    Given I login with Gaston User
    And I go to dashboard
    When I select Sponsored Ads section
    And I select the Sort By option
    And I select the Expires Last option
    Then I validate sort ads

  @sponsoredAds  @MTR  @MTR-1605
  Scenario: MTR - User able to Edit ads
    Given I login with Gaston User
    And I go to dashboard
    When I select the Sponsored Ads section
    And I select the tab dots EDIT
    And I select the Edit option
    And i click the Publish button
    Then I validate the Edit ads

  @sponsoredAds  @MTR  @MTR-1606
  Scenario: MTR - User able to Delete ads
    Given I login with Gaston User
    And I go to dashboard
    When I select the Sponsored Ads section
    And I select the tab dots DELETE
    And I select the Delete option
    Then I validate the Delete ads


  @sponsoredAds  @MTR  @MTR-3297
  Scenario: MTR - validate texts within the sponsored ads section
    Given I login with Gaston User
    And I go to dashboard
    When I select Sponsored Ads section
    And I select the Add New button
    And I complete the Ad information Text
    And valid that only one hundred characters can be entered in the text field
    And I complete the URL TextField
    And I add an image
    And I complete the Start Date TextField
    And I complete the End Date TextField
    Then validate the user name in the preview screen
    And Valid that when adding the text in Text it is displayed in the preview section
    And validating the display of the price of an aggregated advertisement
    And I select the Publish button
    And I go to dashboard
    And I select Sponsored Ads section
    And I validate Start Date
    And valid to display the Active text of the created ad

