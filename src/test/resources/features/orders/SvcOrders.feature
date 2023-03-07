Feature: Services Orders

  @SVC-383 @SVC @SvcOrders
  Scenario: SVC Orders - Sold Section
    Given SVC I login and go to orders page
    When SVC I select sold section
    Then SVC I validate sold section

  @SVC-384 @SVC @SvcOrders
  Scenario: SVC Orders - Purchased Section
    Given SVC I login and go to orders page
    When SVC I select purchased section
    And SVC I validate open section in purchased
    And SVC I validate close section in purchased
    Then SVC I validate purchased section

  @SVC-385 @SVC @SvcOrders
  Scenario: SVC Orders - Sort by
    Given SVC I login and go to orders page
    When SVC I select sort by all
    And SVC I select sort by Pending response
    And SVC I select sort by Shipment pending
    And SVC I select sort by pick up pending
    And SVC I select sort by shipped
    And SVC I select sort by delivered
    And SVC I select sort by completed
    And SVC I select sort by cancelled
    Then SVC I validate orders sort by