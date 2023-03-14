Feature:Services Listing details

  @MMRSdetails @MMRS-460 @MMRS
  Scenario: SVC - Validate listing details page
    Given SVC I go to the listing details page on OHE
    When  SVC select the seller name
    Then  SVC see the seller storefront profile

  @MMRSdetails @MMRS-461 @MMRS
  Scenario: SVC - Send message to seller
    Given SVC I go to the listing details page on OHE
    When  SVC select the send message button
    Then  SVC see that it redirects me to the chat page

  @MMRSdetails @MMRS-462 @MMRS
  Scenario: SVC - Validate Hire Button
    Given SVC I go to the listing details page on OHE
    When SVC I select the Hire Button
    Then SVC I validate Hire Button

  @MMRSdetails @MMRS-463 @MMRS
  Scenario: SVC - Validate Service information sector
    Given SVC I go to the listing details page on OHE
    When SVC I select the Service information button
    Then SVC I validate Service information sector

  @MMRSdetails @MMRS-464 @MMRS
  Scenario: SVC - Validate Availability sector
    Given SVC I go to the listing details page on OHE
    When SVC I select the Availability button
    Then SVC I validate Availability sector

  @MMRSdetails @MMRS-467 @MMRS
  Scenario: SVC - Validate Flat rate services sector
    Given SVC I go to the listing details page on OHE
    When SVC I select the Flat rate services button
    Then SVC I validate Flat rate services sector

  @MMRSdetails @MMRS-468 @MMRS
  Scenario: SVC - Validate Media sector
    Given SVC I go to the listing details page on OHE
    When SVC I select the Media button
    Then SVC I validate Media sector

  @MMRSdetails @MMRS-469 @MMRS
  Scenario: SVC - Validate Review sector
    Given SVC I go to the listing details page on OHE
    When SVC I select the Review button
    Then SVC I validate Review sector


  @MMRSdetails @MMRS-471 @MMRS
  Scenario: SVC - Validate Work sector
    Given SVC I go to the listing details page on OHE
    Then SVC I validate Work sector

  @MMRSdetails @MMRS-472 @MMRS
  Scenario: SVC - Validate Education sector
    Given SVC I go to the listing details page on OHE
    Then SVC I validate Education sector

  @MMRSdetails @MMRS-473 @MMRS
  Scenario: SVC - Validate Bio sector
    Given SVC I go to the listing details page on OHE
    Then SVC I validate Bio sector

