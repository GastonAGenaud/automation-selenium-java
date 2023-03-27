@MMRS-890
Feature:Services Listing details

  @MMRSdetails @MMRS-891 @MMRS
  Scenario: SVC - Validate listing details page
    Given SVC I go to the listing details page on OHE
    When  SVC select the seller name
    Then  SVC see the seller storefront profile

  @MMRSdetails @MMRS-892 @MMRS
  Scenario: SVC - Send message to seller
    Given SVC I go to the listing details page on OHE
    When  SVC select the send message button
    Then  SVC see that it redirects me to the chat page

  @MMRSdetails @MMRS-893 @MMRS
  Scenario: SVC - Validate Hire Button
    Given SVC I go to the listing details page on OHE
    When SVC I select the Hire Button
    Then SVC I validate Hire Button

  @MMRSdetails @MMRS-894 @MMRS
  Scenario: SVC - Validate Service information sector
    Given SVC I go to the listing details page on OHE
    When SVC I select the Service information button
    Then SVC I validate Service information sector

  @MMRSdetails @MMRS-895 @MMRS
  Scenario: SVC - Validate Availability sector
    Given SVC I go to the listing details page on OHE
    When SVC I select the Availability button
    Then SVC I validate Availability sector

  @MMRSdetails @MMRS-897 @MMRS
  Scenario: SVC - Validate Flat rate services sector
    Given SVC I go to the listing details page on OHE
    When SVC I select the Flat rate services button
    Then SVC I validate Flat rate services sector

  @MMRSdetails @MMRS-898 @MMRS
  Scenario: SVC - Validate Media sector
    Given SVC I go to the listing details page on OHE
    When SVC I select the Media button
    Then SVC I validate Media sector

  @MMRSdetails @MMRS-899 @MMRS
  Scenario: SVC - Validate Review sector
    Given SVC I go to the listing details page on OHE
    When SVC I select the Review button
    Then SVC I validate Review sector


  @MMRSdetails @MMRS-900 @MMRS
  Scenario: SVC - Validate Work sector
    Given SVC I go to the listing details page on OHE
    Then SVC I validate Work sector

  @MMRSdetails @MMRS-901 @MMRS
  Scenario: SVC - Validate Education sector
    Given SVC I go to the listing details page on OHE
    Then SVC I validate Education sector

  @MMRSdetails @MMRS-902 @MMRS
  Scenario: SVC - Validate Bio sector
    Given SVC I go to the listing details page on OHE
    Then SVC I validate Bio sector

