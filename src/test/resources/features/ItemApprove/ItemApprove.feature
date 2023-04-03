Feature: Item Approve

   @ItemApprove @MTR @MTR-3458

  Scenario: Valid if the "Item Approves" texts are displayed.
    Given I login with Gaston User
    When I go to dashboard
    And I select Item Approve
    And I validate texts
    Then Valid that the texts are displayed correctly