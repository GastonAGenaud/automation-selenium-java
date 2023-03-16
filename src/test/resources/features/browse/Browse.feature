Feature: browse

  Validate Browse & Browse Requests Pages

  @browse  @MTR-1309 @MTR
  Scenario: MTR - Log in and Validate the Browse Section
    Given I login with Gaston User
    And I go to Browse Page
    When I validate the Search text Bar
    And I validate the Categories Filter Section
    And I validate the Price Filter Section
    And I validate the Location Filter
    And I validate the Sort By options
    And I validate the visual style
    Then I validate the Browse Section

  @browse   @MTR-1310 @MTR
  Scenario: MTR - Log in and Validate the Browse Request Section
    Given I login with Gaston User
    And I go to Browse Request Page
    And I select create a request button
    And I validate the Category
    And I validate the Skills
    And I validate the Text bar
    And I validate the next button to create a request
    Then I validate the Create a Request