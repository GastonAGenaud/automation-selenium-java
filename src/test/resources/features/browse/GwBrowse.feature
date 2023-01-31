Feature: GwBrowse

  Validate Browse & Browse Requests Pages

  @GWbrowse @smoke @GW @GOOD-943
  Scenario: GW - Log in and Validate the Browse Section
    Given GW I go to Browse Page
    When GW I validate the Search text Bar
    And GW I validate the Categories Filter Section
    And GW I validate the Price Filter Section
    And GW I validate the Location Filter
    And GW I validate the Sort By options
    And GW I validate the visual style
    Then GW I validate the Browse Section

  @GWbrowse @smoke @GW @GOOD-944
  Scenario: GW - Log in and Validate the Browse Request Section
    Given GW I go to Browse Request Page
    And GW I validate the Category
    And GW I validate the Skills
    And GW I validate the Text bar
    And GW I validate the next button to create a request
    Then GW I validate the Create a Request