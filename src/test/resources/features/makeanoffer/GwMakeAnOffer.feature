Feature: Make an offer

   @GwMakeAnOffer @smoke @GOOD-946 @GW
  Scenario: GW - Buyers able to fill out make an offer form
    Given GW I Sign in with new account "email2" and go to the listing page
    When GW I select an item to make an offer
    And GW I press the Make an Offer Button
    And GW I complete Make an Offer message TextField
    #And GW I upload an example image in the Add Images section
    And GW I complete the Proposed TextField
    And GW I complete the Delivery Date TextField
    Then GW I validate the Make an offer message TextField

   @GwMakeAnOffer @smoke @GOOD-947 @GW
  Scenario: GW - Buyers able to see request in message view after submitting request
    Given GW I Sign in with new account "email3" and go to the listing page
    When GW I select an item to make an offer
    And GW I press the Make an Offer Button
    And GW I complete Make an Offer message TextField
    #And GW I upload an example image in the Add Images section
    And GW I complete the Proposed TextField
    And GW I complete the Delivery Date TextField
    Then GW I see the request in message view after request

 @GwMakeAnOffer @smoke @GOOD-948 @GW
  Scenario: GW - Seller able to view offer in inbox under Unread messages
    Given GW I login and i select the Inbox Icon
    When GW I go to the offer in inbox under Unread Messages
    Then GW I validate the viewing of offer in inbox under Unread messages