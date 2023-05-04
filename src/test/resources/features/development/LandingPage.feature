@ENV
Feature: Development Landing Page

  @landingPageTest
  Scenario: Landing Page
    Given I login with Gaston User in development products using cookies
    And I go to home page
    And go to Landing Page
    When select Header
    And modify header text to "Test"
    And select Save
    And validate modified text
    And go to Landing Page
    And select Header
    And modify header text to Blog
    And select Save
    Then I validate Landing Page