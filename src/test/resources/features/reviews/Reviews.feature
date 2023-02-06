Feature: Reviews

  @reviews @smoke @MTR  @MTR-1409
  Scenario: MTR - Logged users post Review to Both seller & Listing clicking "Leave a Review" when viewing Reviews tab in listing details view
    Given I login with Gaston User
    And I go to listing page
    When I select an item
    And I select the Reviews button
    And I select the Leave a Review button
    And I select the star button
    And I type in the seller review TextField
    And I select the Send Button
    Then I validate the Reviews section

  #@reviews @smoke @MTR  @MTR-1410
  Scenario: MTR - Logged in users able to post a review to both seller and listing by clicking Leave a Review button when viewing Reviews tab in seller storefront profile
    Given I login with Gaston User
    And I go to listing page
    When I select an item
    And I select the user profile name
    And I select the Reviews button
    And I select the Leave a Review button in profile
    And I select the second star button
    And I type in the both Your review TextField
    #And I select the Send Button
    Then I validate the Leave a review Button in the seller profile

  @reviews @smoke @MTR  @MTR-1411
  #Scenario: MTR - Buyers able to post review for both sellers in leave a review button in Orders > Purchased when order is in Closed section in Delivered or Completed status
   # Given I login and i go to Dashboard
   # When I select the Orders button
   # And I select the Purchased button
   # And I select the Leave a review button in purchased section
   # And I type in the seller review TextField and I type in the item review TextField
   # And I select the star button in purchased
   # Then I validate the reviews in Purchased section

  @reviews @smoke @MTR  @MTR-1412
  Scenario: MTR - Sellers able to request buyer review by clicking Ask for review button in Orders > Sold when order is in Closed section in Delivered or Completed status
    Given I login with Gaston User
    And I go to dashboard
    When I select the Orders button
    And I select the Sold button
    #And I select the Ask for a review button in sold section
    Then I validate the Ask for a review button in Sold section