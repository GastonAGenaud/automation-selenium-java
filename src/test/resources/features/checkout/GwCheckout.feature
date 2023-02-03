Feature: Checkout

  @GwCheckout @smoke @GOOD-919 @GW
  Scenario: GW- Buyer able to clear cart
    Given GW I login and i go to the Shopping Cart
    When GW I add an item to the Shopping Cart
    And GW I validate the clear cart button
    Then GW I see the shopping cart cleaned

  @GwCheckout @smoke @GOOD-920 @GW
  Scenario: GW- Buyer able to add or subtract quantity
    Given GW I login and i go to the Shopping Cart
    When GW I add an item to the Shopping Cart
    And GW I increase the quantity of the item
    And GW I subtract the quantity of the item
    Then GW I Validate quantity functioning

  @GwCheckout @smoke @GOOD-921 @GW
  Scenario: GW- Buyer able to add and save a shipping address
    Given GW I login and i go to the Shopping Cart
    When GW I clear the cart1
    #And GW I clear the cart2
    #And GW I clear the cart3
    And GW I add an item to the Shopping Cart for shipping
    And GW I select the add a Shipping Address button
    And GW I complete Address line 1
    And GW I complete City text field
    And GW I complete the State text field
    And GW I complete the Zip text field
    And GW I complete the Phone Number text field
    And GW I select the Save address button
    And GW I complete the Name text field
    And GW I select the Accept button
    Then GW I see the shipping address added and saved

  @GwCheckout @smoke  @test1 @GOOD-922 @GW
  Scenario: GW- Buyer able to select shipping method if USPS or Flat Rate option
    Given GW I login and i go to the Shopping Cart
    When GW I clear the cart
    And GW I add an item to the Shopping Cart for shipping
    And GW I add an Address
    And GW I select the Flat Rate option
    Then GW I validate the Flat Rate button

  @GwCheckout @smoke @GOOD-923 @GW
  Scenario: GW- Buyer able to click Go To Secure Checkout once shipping or pickup selected
    Given GW I login and i go to the Shopping Cart
    When GW I clear the cart
    And GW I add an item to the Shopping Cart for shipping
    And GW I add an Address
    And GW I select the Flat Rate option
    And GW I select the Go To Secure Checkout button
    Then GW I validate the Go To Secure Checkout button

  @GwCheckout @smoke @GOOD-924 @GW
  Scenario: GW- Buyer able to go back to cart
    Given GW I login and i go to the Shopping Cart
    When GW I clear the cart
    And GW I add an item to the Shopping Cart
    And GW I add an Address
    And GW I select the Flat Rate option
    And GW I select the Go To Secure Checkout button
    And GW I select the Back to my cart button
    Then GW I validate the Back to my cart button

#   @GwCheckout @smoke @GOOD-925
  #Scenario: GW- Buyer able to enter a message to seller
 #Given GW I login and i go to the Shopping Cart
 #When GW I clear the cart
 #And GW I add an item to the Shopping Cart
 #And GW I add an Address
 #And GW I select the Flat Rate option
 #And GW I select the Go To Secure Checkout button
 #And GW I type on the Send message to Seller text field
 #Then GW I validate the Send message to Seller

#   @GwCheckout @smoke @GOOD-926
  #Scenario: GW- Buyer able to add a new credit card and save it
# Given GW I login and i go to the Shopping Cart
 #When GW I clear the cart
# And GW I add an item to the Shopping Cart
# And GW I add an Address
# And GW I select the Flat Rate option
# And GW I select the Go To Secure Checkout button
 #And GW I complete the Card Number text field
 #And GW I complete the Name on Card text field
 #And GW I complete the Expiration Date text field
 #And i complete the CVV Code text field
 #And GW I select the Save Credit Card details button
 #Then GW I validate the Add new Credit Card section

  @GwCheckout @smoke @GOOD-927 @GW
  Scenario: GW- Buyer able to click Submit Payment button to complete checkout
    Given GW I login and i go to the Shopping Cart
    When GW I clear the cart
    And GW I add an item to the Shopping Cart
    And GW I select the add a Shipping Address button
    And GW I add an Address
    And GW I select the Flat Rate option
    And GW I select the Go To Secure Checkout button
 #And GW I select the preloaded Credit Card button
    #And GW I select the Submit Payment button
    Then GW I validate the Submit Payment

  @GwCheckout @smoke  @testing1 @GOOD-928 @GW
  Scenario: GW- Buyer able to select saved credit card if previously saved from past purchases made
    Given GW I login and i go to the Shopping Cart
    When GW I add an item to the Shopping Cart
    And GW I add an Address
    And GW I select the Flat Rate option
    And GW I select the Go To Secure Checkout button
 #And GW I select the preloaded Credit Card button
    Then GW I validate the preloaded Credit Card

  @GwCheckout @smoke  @testing1 @GOOD-929 @GW
  Scenario: GW- Buyer able to see Congratulations screen after submitting payment
    Given GW I login and i go to the Shopping Cart
    When GW I clear the cart
    And GW I add an item to the Shopping Cart
    And GW I add an Address
    And GW I select the Flat Rate option
    And GW I select the Go To Secure Checkout button
 #And GW I select the preloaded Credit Card button
    #And GW I select the Submit Payment button
    Then GW I see the Congratulations Screen

  @GwCheckout @smoke  @testing1 @GOOD-930 @GW
  Scenario: GW- Buyer able to share listing on Facebook, Twitter or WhatsApp
    Given GW I login and i go to the Shopping Cart
    When GW I add an item to the Shopping Cart
    And GW I add an Address
    And GW I select the Flat Rate option
    And GW I select the Go To Secure Checkout button
 #And GW I select the preloaded Credit Card button
    #And GW I select the Submit Payment button
    And GW I select Facebook icon
    And GW I select Twitter icon
    And GW I select the Whatsapp icon
    Then GW I validate sharing on Whatsapp, Facebook or Twitter

  @GwCheckout @smoke @GOOD-931 @GW
  Scenario: GW- Buyer able to click Your Orders link to go to Orders > Purchased
    Given GW I login and i go to the Shopping Cart
    When GW I add an item to the Shopping Cart
    And GW I add an Address
    And GW I select the Flat Rate option
    And GW I select the Go To Secure Checkout button
 #And GW I select the preloaded Credit Card button
    #And GW I select the Submit Payment button
    And GW I select Your Orders button
    And GW I select Purchased button
    Then GW I validate Purchased