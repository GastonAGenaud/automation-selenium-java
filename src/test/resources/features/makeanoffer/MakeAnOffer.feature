@MTR-1589
Feature: Make an offer

  @MTR-1452 @makeAnOffer @MTR
  Scenario: MTR - Buyers able to fill out make an offer form
    Given I Sign in with new account "email2" and go to the listing page
    When I select an item to make an offer
    And I press the Make an Offer Button
    And I complete Make an Offer message TextField
    And I upload an example image in the Add Images section
    And I complete the Proposed TextField
    And I complete the Delivery Date TextField
    Then I validate the Make an offer message TextField

  #@MTR-1453 @makeAnOffer @MTR
  Scenario: MTR - Buyers able to see request in message view after submitting request
    Given I Sign in with new account "email3" and go to the listing page
    When I select an item to make an offer
    And I press the Make an Offer Button
    And I complete Make an Offer message TextField
    And I upload an example image in the Add Images section
    And I complete the Proposed TextField
    And I complete the Delivery Date TextField
    Then I see the request in message view after request

  @MTR-1454 @makeAnOffer @MTR
  Scenario: MTR - Seller able to view offer in inbox under Unread messages
    Given I login with Gaston User
    And I select the Inbox Icon
    When I go to the offer in inbox under Unread Messages
    Then I validate the viewing of offer in inbox under Unread messages