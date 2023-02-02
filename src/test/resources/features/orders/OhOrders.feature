Feature: Orders

  @OHE-383 @OHE @smoke
  Scenario: OHE Orders - Sold Section
    Given OHE I login and go to orders page
    When OHE I select sold section
    Then OHE I validate sold section

  @OHE-384 @OHE @smoke
  Scenario: OHE Orders - Purchased Section
    Given OHE I login and go to orders page
    When OHE I select purchased section
    And OHE I validate open section in purchased
    And OHE I validate close section in purchased
    Then OHE I validate purchased section

  @OHE-385 @OHE @smoke
  Scenario: OHE Orders - Sort by
    Given OHE I login and go to orders page
    When OHE I select sort by all
    And OHE I select sort by Pending response
    And OHE I select sort by Shipment pending
    And OHE I select sort by pick up pending
    And OHE I select sort by shipped
    And OHE I select sort by delivered
    And OHE I select sort by completed
    And OHE I select sort by cancelled
    Then OHE I validate orders sort by