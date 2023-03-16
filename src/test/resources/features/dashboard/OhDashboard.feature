Feature: Dashboard

  @OHE-347 @OHE  @dashboardOHE
  Scenario: OHE - Validate dashboard Customer
    Given I login and go to Dashboard
    When I select dashboard customer section
    #And I select my settings button
    And I select the see all most popular button
    And I select the see all my orders button
    And I select the go to my calendar button
    And I select the see all messages button
    And I select create a want button
    Then I validate the customer dashboard

  @OHE-348 @OHE  @dashboardOHE
  Scenario: OHE - Validate dashboard Provider
    Given I login and go to Dashboard
    When I select dashboard provider section
    And I select see all latest reviews button
    #And I select invite people button
    And I select see all my sales button
    And I select create a new listing button
    And I select see all messages button
    And I select go to my calendar button in provider
    Then I validate provider dashboard