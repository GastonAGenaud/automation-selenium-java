Feature: Listing details

  listing details page

  @smoke  @details @MTR-1372 @MTR
  Scenario: MTR - Validate listing details page
    Given I login with Gaston User
    And I go to the listing details page
    When I select the seller name
    Then I see the seller storefront profile

  @smoke  @details @MTR-1373 @MTR
  Scenario: MTR - Send message to seller
    Given I login with Gaston User
    And I go to the listing details page
    When I select the send message button
    Then I see that it redirects me to the chat page

  #@smoke  @details @MTR-1374 @MTR
   # Scenario: MTR - Select variants
    # Given I go to the listing details page|
    # When  I select the variant colors
   # Then I validate the variants

  @smoke  @details @MTR-1375 @MTR
  Scenario: MTR - Select item quantity
    Given I login with Gaston User
    And I go to the listing details page
    When I change the quantity of the item
    Then I see that the price adjusts to the quantity

  @details @MTR-1376 @MTR
  Scenario: MTR - Buying item
    Given I login with Gaston User
    And I go to the listing details page
    When I select the buy now button
    Then I see that it redirects me to the shopping cart page

  @details @MTR-1377 @MTR
  Scenario: MTR - Adding to cart
    Given I login with Gaston User
    And I go to the listing details page
    When I select the add to cart button
    Then I see that it redirects me to the shopping cart page

  @smoke  @details @MTR-1378 @MTR
  Scenario: MTR - Making an offer
    Given I create an account and go to Make an offer "email1"
    When I select the make an offer button
    And I type on the Describe what you expect from the seller text field
    Then I see that it redirects me to the chat page again

  @smoke  @details @MTR-1379 @MTR
  Scenario: MTR - Viewing listing tabs
    Given I login with Gaston User
    And I go to the listing details page
    When I select the product Information button
    Then I validate the listing tabs

  @smoke  @details @MTR-1380 @MTR
  #Scenario: MTR - Related listing items
   # Given I go to the listing details page
   # When I select the related item
   # Then I see that it redirects me to the item page

  @smoke  @details @MTR-1381
  Scenario: MTR - Viewing all items
    Given I login with Gaston User
    And I go to the listing details page
    When I select the see all button
    Then I see that redirects me to the browse page

  @smoke  @details @MTR-1382 @MTR
  Scenario: MTR - Viewing related tags
    Given I login with Gaston User
    And I go to the listing details page
    When I select related tags
    Then I see that redirects me to the browse page

  @smoke  @details @MTR-1383 @MTR
  #Scenario: MTR - Viewing more from this seller section
   #Given I go to the listing details page
    #When I select more item from seller
    #Then I see that it redirects me to the item page

  @smoke  @details @MTR-1384 @MTR
  Scenario: MTR - Viewing more from this seller section (2)
    Given I login with Gaston User
    And I go to the listing details page
    When I select see all redirect button
    Then I see that redirects me to the seller profile