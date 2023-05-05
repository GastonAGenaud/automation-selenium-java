@devServices

Feature: Dashboard

  @testItemApprove
  Scenario: Dashboard - Item Approval
    Given I login with Gaston User in production services using cookies
    When go to Dashboard Serv
    And I select Item Approve
    And I validate texts
    Then Valid that the texts are displayed correctly