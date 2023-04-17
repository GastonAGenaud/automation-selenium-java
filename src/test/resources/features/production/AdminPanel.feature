Feature: Production Admin Panel


  @testImpersonate
  Scenario: Admin Panel - Users - Actions
    Given I login with Gaston User in production products using cookies
    And go to Admin Panel
    When I select Users tab
    And Select Action button
    And select Impersonate Button
    Then I validate action sector in Admin panel - Users

  @testSearchFilter
  Scenario: Admin Panel - Users - Search filter
    Given I login with Gaston User in production products using cookies
    And go to Admin Panel
    When I select Users tab
    And complete search filter
    And select Filter button
    Then I validate Filter sector in Admin panel - Users