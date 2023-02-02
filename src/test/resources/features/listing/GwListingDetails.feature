Feature:GW Listing details

  GW listing details page

  @smoke  @GW @GOOD-899 @GwListingDetails
  Scenario: GW- Validate listing details page
    Given GW I go to the listing details page
    When GW I select the seller name
    Then GW I see the seller storefront profile

  @smoke @GW @GOOD-900 @GwListingDetails
  Scenario: GW- Send message to seller
    Given GW I go to the listing details page
    When GW I select the send message button
    Then GW I see that it redirects me to the chat page

  #@smoke   @GW-1374 @GW
   # Scenario: GW- Select variants
    # Given I go to the listing details page|
    # When GW  I select the variant colors
   # Then GW  I validate the variants

  @smoke  @GW  @quantity @GOOD-901 @GwListingDetails
  Scenario: GW- Select item quantity
    Given GW I go to the listing details page
    When GW I change the quantity of the item
    Then GW I see that the price adjusts to the quantity

    @GW @GOOD-902 @GwListingDetails
  Scenario: GW- Buying item
    Given GW I go to the listing details page
    When GW I select the buy now button
    Then GW I see that it redirects me to the shopping cart page

    @GW @GOOD-903 @GwListingDetails
  Scenario: GW- Adding to cart
    Given GW I go to the listing details page
    When GW I select the add to cart button
    Then GW I see that it redirects me to the shopping cart page

  @smoke @GW @testingsignup @GOOD-904 @GwListingDetails
  Scenario: GW- Making an offer
    Given GW I create an account and go to Make an offer "email1"
    When GW I select the make an offer button
    And GW I type on the Describe what you expect from the seller text field
    Then GW I see that it redirects me to the chat page again

  @smoke  @GW @GOOD-905 @GwListingDetails
  Scenario: GW- Viewing listing tabs
    Given GW I go to the listing details page
    When GW I select the product Information button
    Then GW I validate the listing tabs

  @smoke @GW @GwListingDetails
  #Scenario: GW- Related listing items
   # Given I go to the listing details page
   # When GW I select the related item
   # Then GW  I see that it redirects me to the item page

  @smoke @GOOD-906 @GwListingDetails
  Scenario: GW- Viewing all items
    Given GW I go to the listing details page
    When GW I select the see all button
    Then GW I see that redirects me to the browse page

  @smoke  @GW @GOOD-907 @GwListingDetails
  Scenario: GW- Viewing related tags
    Given GW I go to the listing details page
    When GW I select related tags
    Then GW I see that redirects me to the browse page

  @smoke @GW
  #Scenario: GW- Viewing more from this seller section
   #Given I go to the listing details page
    #When GW I select more item from seller
    #Then GW  I see that it redirects me to the item page

  @smoke  @GW @GOOD-908 @GwListingDetails
  Scenario: GW- Viewing more from this seller section (2)
    Given GW I go to the listing details page
    When GW I select see all redirect button
    Then GW I see that redirects me to the seller profile