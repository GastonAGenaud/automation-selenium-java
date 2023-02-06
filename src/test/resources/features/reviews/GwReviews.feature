Feature: Reviews

  #@GwReviews @smoke @GOOD-964 @GW
  Scenario:GW - Logged users post Review to Both seller & Listing clicking "Leave a Review" when viewing Reviews tab in listing details view
    Given GW I login and i go to listing page
    When GW I select an item
    And GW I select the Reviews button
    And GW I select the Leave a Review button
    And GW I select the star button
    And GW I type in the seller review TextField
    And GW I select the Send Button
    Then GW I validate the Reviews section

  #@GwReviews @smoke  @GOOD-965
  Scenario:GW - Logged in users able to post a review to both seller and listing by clicking Leave a Review button when viewing Reviews tab in seller storefront profile
    Given GW I login and i go to listing page
    When GW I select an item
    And GW I select the user profile name
    And GW I select the Reviews button
    And GW I select the Leave a Review button in profile
    And GW I select the second star button
    And GW I type in the both Your review TextField
    #And GW I select the Send Button
    Then GW I validate the Leave a review Button in the seller profile

  @GwReviews @smoke 
  #Scenario: MTR - Buyers able to post review for both sellers in leave a review button in Orders > Purchased when order is in Closed section in Delivered or Completed status
   # Given GW I login and i go to Dashboard
   # When GW I select the Orders button
   # And GW I select the Purchased button
   # And GW I select the Leave a review button in purchased section
   # And GW I type in the seller review TextField and GW I type in the item review TextField
   # And GW I select the star button in purchased
   # Then GW I validate the reviews in Purchased section

  @GwReviews @smoke @GOOD-966 @GW
  Scenario: GW - Sellers able to request buyer review by clicking Ask for review button in Orders > Sold when order is in Closed section in Delivered or Completed status
    Given GW I login and i go to Dashboard
    When GW I select the Orders button
    And GW I select the Sold button
    #And GW I select the Ask for a review button in sold section
    Then GW I validate the Ask for a review button in Sold section