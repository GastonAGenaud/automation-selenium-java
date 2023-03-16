Feature: OHE Request

  @OHE-386 @OHERequest @OHE
  Scenario: OHE - Create a request in browse page
    Given OHE I go to Request Page
    When OHE I select create a request button
    Then OHE I validate the Create a Request in browse section

  @OHE-387 @OHERequest @OHE
  Scenario: OHE - Create a request in dashboard page
    Given OHE I go to Dashboard Page
    When OHE I select create a request button in dashboard
    Then OHE I validate the Create a Request in dashboard

  @OHE-388 @OHERequest @OHE
  Scenario: OHE - Success pop up
    Given OHE I go to Request Page
    When OHE I select create a request
    And OHE I select request URL
    And OHE I validate the request social share
    #And OHE I select request details
    And OHE I validate the back to home button
    Then OHE I validate the request pop up

  @OHE-389 @OHERequest @OHE
  Scenario: OHE - Requests created by me
    Given OHE I go to requests page
    When OHE I validate created by me active requests
    And OHE I select edit button
    And OHE I validate pause the request button
    And OHE I validate duplicate the request button
    And OHE I validate share the request button
    And OHE I validate delete the request button
    Then OHE I validate the requests created by me section

  @OHE-390 @OHERequest @OHE
  Scenario: OHE - Requests matched
    Given OHE I go to requests page
    #When OHE I validate open section details
    #And OHE I validate the apply button
    #And OHE I validate the close button
    #And OHE I validate the send message button
    #And OHE I validate the share button in open section
    Then OHE I validate the request matched page

  @OHE-391 @OHERequest @OHE
  Scenario: OHE - Request Browse
    Given OHE I go to Request Page
    When OHE I validate search a request
    And OHE I validate the category filters
    And OHE I validate the price filter
    And OHE I validate the location filter
    And OHE I validate the create a request button
    And OHE I validate the sort section
    Then OHE I validate the browse request page