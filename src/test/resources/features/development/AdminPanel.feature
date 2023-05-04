@devProducts @AdminDev
Feature: Development Admin Panel


  @testImpersonate1
  Scenario: Admin Panel - Users - Actions
    Given I login with Gaston User in development products using cookies
    And go to Admin Panel
    When I select Users tab
    And Select Action button
    And select Impersonate Button
    Then I validate action sector in Admin panel - Users

  @testSearchFilter
  Scenario: Admin Panel - Users - Search filter
    Given I login with Gaston User in development products using cookies
    And go to Admin Panel
    When I select Users tab
    And complete search filter
    And select Filter button
    Then I validate Filter sector in Admin panel - Users


  @testAdminSettings
  Scenario: Admin Panel - Settings
    Given I login with Gaston User in development products using cookies
    And go to Admin Panel
    Then I validate redirection to Site Wording
    And I validate elements in Site Wording
    And I validate redirection to Company Info
    And validate elements in Company Info
    And I validate redirection to Payment Info
    And validate elements in Payment Info
    And I validate redirection to Site MetaTags
    And validate elements in Site MetaTags
    And I validate redirection to Requests Setup
    And validate elements in Requests Setup
    And I validate redirection to Browse config
    And validate elements in Browse config
    And I validate redirection to SMS Settings
    And validate elements in SMS Settings
    And I validate redirection to Orders Setup
    And validate elements in Orders Setup

