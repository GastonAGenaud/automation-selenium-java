Feature: GW Request

  @GW @GwRequest @smoke @GOOD-880
  Scenario: GW - Create a request in browse page
    Given GW - I go to Request Page
    When GW I select create a request button
    Then GW I validate the Create a Request in browse section

  @GW @GwRequest @smoke @GOOD-881
  Scenario: GW - Create a request in dashboard page
    Given GW I go to Dashboard Page
    When GW I select create a request button in dashboard
    Then GW I validate the Create a Request in dashboard

  @GW @GwRequest @smoke @GOOD-882
  Scenario: GW - Success pop up
    Given GW - I go to Request Page
    When GW I select create a request
    And GW I select request URL
    And GW I validate the request social share
    Then GW I validate the request pop up
    And GW I select request details

  @GW @GwRequest @smoke @GOOD-883
  Scenario: GW - Requests created by me
    Given GW - I go to Request Page 2
    When GW I validate created by me active requests
    And GW I select edit button
    And GW I validate pause the request button
    And GW I validate duplicate the request button
    And GW I validate share the request button
    And GW I validate delete the request button
    Then GW I validate the requests created by me section

  @GW @GwRequest @smoke @GOOD-884
  Scenario: GW - Requests matched
    Given GW - I go to Request Page 2
    When GW I validate open section details
    And GW I validate the apply button
    And GW I validate the close button
    And GW I validate the send message button
    And GW I validate the share button in open section
    Then GW I validate the request matched page

  @GW @GwRequest @smoke @GOOD-885
  Scenario: GW - Request Browse
    Given GW - I go to Request Page
    When GW I validate search a request
    And GW I validate the category filters
    And GW I validate the price filter
    #And I validate the location filter
    And I validate the create a request button
    And GW I validate the sort section
    Then GW I validate the browse request page