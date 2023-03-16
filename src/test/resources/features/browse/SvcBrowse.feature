Feature: Services Browse Page

#  @MMRS-315 @MMRSBrowse @MMRS
#  Scenario: SVC - Validate browse services category filters
#    Given SVC I go to browse services page
#    When SVC I select ages 12 to 14 category filter
#    And SVC I select ages 15 to 17 category filter
#    And SVC I select ages 5 to 8 category filter
#    And SVC I select ages 9 to 11 category filter
#    Then SVC I validate categories filters

  @MMRS-316 @MMRSBrowse @MMRS
  Scenario: SVC - Validate browse by price And SVC location
    Given SVC I go to browse services page
    When SVC I type in the minimum price text field
    And SVC I type in the maximum price text field
    And SVC I select the price button
    And SVC I type in the location text field
    Then SVC I validate the browse services price and location

  @MMRS-317 @MMRSBrowse @MMRS
  Scenario: SVC - Validate browse services search
    Given SVC I go to browse services page
    When SVC I type the browse search text field
    And SVC I select the browse search button
    Then SVC I validate the browse search

  @MMRS-319 @MMRSBrowse @MMRS
  Scenario: SVC - Validate browse services view
    Given SVC I go to browse services page
    When SVC I select block view
    And SVC I select list view
    And SVC I select map view
    Then SVC I validate the browse view

  @MMRS-318 @MMRSBrowse @MMRS
  Scenario: SVC - Validate browse services sort by
    Given SVC I go to browse services page
    #When SVC I select sort by most relevant
    And SVC I select sort by price: higher to lower
    And SVC I select sort by price: lower to higher
    And SVC I select sort by date: newer to older
    And SVC I select sort by date: older to newer
    And SVC I select sort by rating: higher to lower
    Then SVC I validate sort by section