Feature: Item Approve

  @smoke @ItemApprove @MTR

  Scenario: Valid if the "Item Approves" texts are displayed.
    Given I login
    When I go to dashboard page
    And I select Item Approve
    And I validate texts
    Then Valid that the texts are displayed correctly