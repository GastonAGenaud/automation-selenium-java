Feature: Request


  @request  @MTR-1455 @MTR
  Scenario: MTR - Create a request in browse page
    Given I login with Gaston User
    And I go to Browse Request Page
    When I select create a request button
    Then I validate the Create a Request in browse section

  #@request  @MTR  @MTR-1456
  #Scenario: MTR - Create a request in dashboard page
  #  Given I login with Gaston User
  #  And I go to dashboard
  #  When I select create a request button in dashboard
  #  Then I validate the Create a Request in dashboard

  @request  @MTR  @MTR-1457
  Scenario: MTR - Success pop up
    Given I login with Gaston User
    And I go to Browse Request Page
    When I select create a request
    And I select request URL
    And I validate the request social share
    Then I validate the request pop up
    And I select request details

#  @request  @MTR-1458 
  Scenario: MTR - Requests created by me
    Given I login with Make An offer
    And I go to Request Page from Dashboard
    When I validate created by me active requests
    And I select edit button
    And I validate pause the request button
    And I validate duplicate the request button
    And I validate share the request button
    And I validate delete the request button
    Then I validate the requests created by me section

  @request  @MTR  @MTR-1459
  Scenario: MTR - Requests matched
    Given I login with Gaston User
    And I go to dashboard
    And I go to Request Page
    When I validate open section details
    And I validate the apply button
    And I validate the close button
    And I validate the send message button
    And I validate the share button in open section
    Then I validate the request matched page

  @request  @MTR  @MTR-1460
  Scenario: MTR - Request Browse
    Given I login with Gaston User
    And I go to Browse Request Page
    When I validate search a request
    And I validate the category filters
    And I validate the price filter
    #And I validate the location filter
    And I validate the create a request button
    And I validate the sort section
    Then I validate the browse request page