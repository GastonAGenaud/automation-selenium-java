Feature:Services Listing details

  @SVCdetails @SVC-460 @SVC
  Scenario: SVC - Validate listing details page
    Given I go to the listing details page on OHE
    When  select the seller name
    Then  see the seller storefront profile

  @SVCdetails @SVC-461 @SVC
  Scenario: SVC - Send message to seller
    Given I go to the listing details page on OHE
    When  select the send message button
    Then  see that it redirects me to the chat page

  @SVCdetails @SVC-462 @SVC
  Scenario: SVC - Validate Hire Button
    Given I go to the listing details page on OHE
    When I select the Hire Button
    Then I validate Hire Button

  @SVCdetails @SVC-463 @SVC
  Scenario: SVC - Validate Service information sector
    Given I go to the listing details page on OHE
    When I select the Service information button
#    Then SVC I validate Service information sector      MISSING

  @SVCdetails @SVC-464 @SVC
  Scenario: SVC - Validate Availability sector
    Given I go to the listing details page on OHE
    When I select the Availability button
    #Then SVC I validate Availability sector      MISSING

  @SVCdetails @SVC-467 @SVC
  Scenario: SVC - Validate Flat rate services sector
    Given I go to the listing details page on OHE
    When I select the Flat rate services button
    #Then SVC I validate Flat rate services sector      MISSING

  @SVCdetails @SVC-468 @SVC
  Scenario: SVC - Validate Media sector
    Given I go to the listing details page on OHE
    When I select the Media button
    #Then I validate Media sector      MISSING

  @SVCdetails @SVC-469 @SVC
  Scenario: SVC - Validate Review sector
    Given I go to the listing details page on OHE
    When I select the Review button
    Then I validate Review sector


  @SVCdetails @SVC-471 @SVC
  Scenario: SVC - Validate Work sector
    Given I go to the listing details page on OHE
#    Then I validate Work sector      MISSING

  @SVCdetails @SVC-472 @SVC
  Scenario: SVC - Validate Education sector
    Given I go to the listing details page on OHE
#    Then I validate Education sector      MISSING

  @SVCdetails @SVC-473 @SVC
  Scenario: SVC - Validate Bio sector
    Given I go to the listing details page on OHE
#    Then I validate Bio sector      MISSING

