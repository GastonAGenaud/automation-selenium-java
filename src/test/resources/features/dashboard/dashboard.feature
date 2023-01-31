Feature: Dashboard

  Dashboard Page

  @dashboard @smoke  @MTR
  Scenario: MTR - Buyers Dashboard
    Given I login with Gaston User
    And I go to dashboard
    When I validate my settings button
    And I validate the most popular carousel section
    And I validate the my orders section
    And I validate the messages section
    And I validate the create a request button
    Then I validate buyers dashboard

  @dashboard @smoke  @MTR-1386 @MTR
  Scenario: MTR - Sellers dashboard
    Given I login with Gaston User
    And I go to dashboard
    When I validate the seller section
    And I validate the option to view last days section
    And I validate the latest reviews section
    And I validate my sales link
    And I validate see more messages link
    And I validate the request matched carousel
    Then I validate sellers dashboard