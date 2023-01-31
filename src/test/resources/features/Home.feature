Feature: Home

  Principal Page

  @home @smoke  @MTR-1441 @MTR @Bypass
  Scenario: MTR - Validate the home header with account
    Given I login with Make An offer
    When I validate the Browse button
    And I validate the Browse Request button
    And I validate the Browse by seller button
    Then I validate the main header

  @home @smoke  @MTR-1442 @MTR @Bypass
  Scenario: MTR - Validate the home Header Section with account
    Given I login with Gaston User
    When I validate the accessories section
    And I validate the More Accessories Button
    And I validate the Jewelry section
    And I validate the More Jewelry Button
    And I validate the outdoor staff section
    And I validate the more outdoor staff section
    And I validate the art and collectables section
    And I validate the More art and collectables button
    Then I validate the Header Section with account

  @home @smoke  @MTR-1443 @MTR @Bypass
  Scenario: MTR - Validate the home - body section with account
    Given I login with Dev user
    #And I validate the Start Now button
    And I validate the For Buyers Header section
    And I validate the For Sellers section
    Then I validate the Body with account