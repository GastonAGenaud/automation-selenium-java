Feature: Browse Page

  @OHE-315 @OH2 @OHE @smoke
  Scenario: OHE - Validate browse services category filters
    Given I go to browse services page
    When I select ages 12 to 14 category filter
    And I select ages 15 to 17 category filter
    And I select ages 5 to 8 category filter
    And I select ages 9 to 11 category filter
    Then I validate categories filters

  @OHE-316 @OH2 @OHE @smoke
  Scenario: OHE - Validate browse by price and location
    Given I go to browse services page
    When I type in the minimum price text field
    And I type in the maximum price text field
    And I select the price button
    And I type in the location text field
    Then I validate the browse services price and location

  @OHE-317 @OH2 @OHE @smoke
  Scenario: OHE - Validate browse services search
    Given I go to browse services page
    When I type the browse search text field
    And I select the browse search button
    Then I validate the browse search

  @OHE-319 @OH2 @OHE @smoke
  Scenario: OHE - Validate browse services view
    Given I go to browse services page
    When I select block view
    And I select list view
    And I select map view
    Then I validate the browse view

  @OHE-318 @OH2 @OHE @smoke
  Scenario: OHE - Validate browse services sort by
    Given I go to browse services page
    When I select sort by most relevant
    And I select sort by price: higher to lower
    And I select sort by price: lower to higher
    And I select sort by date: newer to older
    And I select sort by date: older to newer
    And I select sort by rating: higher to lower
    Then I validate sort by section