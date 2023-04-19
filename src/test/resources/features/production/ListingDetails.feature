@prodProducts

Feature: Production Listing details

  @ProductionDetails
  Scenario:Validate listing details page
    Given I login with Gaston User in production products using cookies
    And PROD I go to the listing details page
    When PROD I select the seller name
    Then PROD I see the seller storefront profile

  @ProductionDetails
  Scenario: Send message to seller
    Given I login with Gaston User in production products using cookies
    And PROD I go to the listing details page
    When PROD I select the send message button
    Then PROD I see that it redirects me to the chat page

  #  @ProductionDetails
   # Scenario: Select variants
    # Given PROD I go to the listing details page|
    # When PROD  I select the variant colors
   # Then PROD I validate the variants

  @ProductionDetails
  Scenario: Select item quantity
    Given I login with Gaston User in production products using cookies
    And PROD I go to the listing details page
    When PROD I change the quantity of the item
    Then PROD I see that the price adjusts to the quantity

  @ProductionDetails
  Scenario: Buying item
    Given I login with Gaston User in production products using cookies
    And PROD I go to the listing details page
    When PROD I select the buy now button
    Then PROD I see that it redirects me to the shopping cart page

  @ProductionDetails
  Scenario: Adding to cart
    Given I login with Gaston User in production products using cookies
    And PROD I go to the listing details page
    When PROD I select the add to cart button
    Then PROD I see that it redirects me to the shopping cart page

#  @ProductionDetails
#  Scenario: Making an offer
#    Given PROD I Sign in with new account "email2" and go to the listing page
#    When PROD I select an item to make an offer
#    And PROD I press the Make an Offer Button
#    And PROD I complete Make an Offer message TextField
#    And PROD I upload an example image in the Add Images section
#    And PROD I complete the Proposed TextField
#    And PROD I complete the Delivery Date TextField
#    Then PROD I validate the Make an offer message TextField

  @ProductionDetails
  Scenario: Viewing listing tabs
    Given I login with Gaston User in production products using cookies
    And PROD I go to the listing details page
#    When PROD I select the product Information button
    Then PROD I validate the listing tabs

  @ProductionDetails
  #Scenario: Related listing items
   # Given PROD I go to the listing details page
   # When PROD I select the related item
   # Then PROD I see that it redirects me to the item page

  @ProductionDetails
  Scenario: Viewing all items
    Given I login with Gaston User in production products using cookies
    And PROD I go to the listing details page
    When PROD I select the see all button
    Then PROD I see that redirects me to the browse page

  @ProductionDetails
  Scenario: Viewing related tags
    Given I login with Gaston User in production products using cookies
    And PROD I go to the listing details page
    When PROD I select related tags
    Then PROD I see that redirects me to the browse page

  @ProductionDetails
  #Scenario: Viewing more from this seller section
   #Given PROD I go to the listing details page
    #When PROD I select more item from seller
    #Then PROD I see that it redirects me to the item page

  @ProductionDetails
  Scenario: Viewing more from this seller section (2)
    Given I login with Gaston User in production products using cookies
    And PROD I go to the listing details page
    When PROD I select see all redirect button
    Then PROD I see that redirects me to the seller profile

  @ProductionDetails
  Scenario: Viewing the category and subcategory
    Given I login with Gaston User in production products using cookies
    And select My Listings button
    When PROD valid to show the product category and select it
    And PROD valid if the category is shown on the product page
    And PROD select the category
    Then PROD valid if the category is selected


    @SeenCount
  Scenario:Seen count
    Given I login with Gaston User in production products using cookies
    When PROD I go to the listing details page
    Then I validate Seen count