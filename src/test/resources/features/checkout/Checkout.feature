Feature: Checkout

  @checkout  @MTR-1421 @smoke @MTR
  Scenario: Buyer able to clear cart
    Given I login with Gaston User
    And I go to the Shopping Cart
    When I add an item to the Shopping Cart
    And I validate the clear cart button
    Then I see the shopping cart cleaned

  @checkout  @MTR-1420 @smoke @MTR
  Scenario: MTR - Buyer able to add or subtract quantity
    Given I login with Gaston User
    And I go to the Shopping Cart
    When I add an item to the Shopping Cart
    And I increase the quantity of the item
    And I subtract the quantity of the item
    Then I Validate quantity functioning

  @checkout  @MTR-1423 @smoke @MTR
  Scenario: MTR - Buyer able to add and save a shipping address
    Given I login with Gaston User
    And I go to the Shopping Cart
    When I clear the cart1
    And I clear the cart2
    And I clear the cart3
    And I add an item to the Shopping Cart for shipping
    And I select the add a Shipping Address button
    And I complete Address line 1
    And I complete City text field
    And I complete the State text field
    And I complete the Zip text field
    And I complete the Phone Number text field
    And I select the Save address button
    And I complete the Name text field
    And I select the Accept button
    Then I see the shipping address added and saved

  @checkout  @MTR-1424  @smoke @MTR @test1
  Scenario: MTR - Buyer able to select shipping method if USPS or Flat Rate option
    Given I login with Gaston User
    And I go to the Shopping Cart
    When I clear the cart
    And I add an item to the Shopping Cart for shipping
    And I add an Address
    And I select the Flat Rate option
    Then I validate the Flat Rate button

  @checkout  @MTR-1425 @smoke @MTR
  Scenario: MTR - Buyer able to click Go To Secure Checkout once shipping or pickup selected
    Given I login with Gaston User
    And I go to the Shopping Cart
    #When I clear the cart
    And I add an item to the Shopping Cart for shipping
    And I add an Address
    And I select the Flat Rate option
    And I select the Go To Secure Checkout button
    Then I validate the Go To Secure Checkout button

  @checkout  @MTR-1426 @smoke @MTR
  Scenario: MTR - Buyer able to go back to cart
    Given I login with Gaston User
    And I go to the Shopping Cart
    #When I clear the cart
    And I add an item to the Shopping Cart
    And I add an Address
    And I select the Flat Rate option
    And I select the Go To Secure Checkout button
    And I select the Back to my cart button
    Then I validate the Back to my cart button

  @checkout  @MTR-1427 @smoke @MTR
  Scenario: MTR - Buyer able to enter a message to seller
    Given I login with Gaston User
    And I go to the Shopping Cart
    #When I clear the cart
    And I add an item to the Shopping Cart
    And I add an Address
    And I select the Flat Rate option
    And I select the Go To Secure Checkout button
#    And I type on the Send message to Seller text field
#    Then I validate the Send message to Seller

  @checkout  @MTR-1428 @smoke @MTR
  Scenario: MTR - Buyer able to add a new credit card and save it
    Given I login with Gaston User
    And I go to the Shopping Cart
    #When I clear the cart
    And I add an item to the Shopping Cart
    And I add an Address
    And I select the Flat Rate option
    And I select the Go To Secure Checkout button
    And I complete the Card Number text field
    And I complete the Name on Card text field
    And I complete the Expiration Date text field
    And i complete the CVV Code text field
    And I select the Save Credit Card details button
    Then I validate the Add new Credit Card section

  @checkout  @MTR-1429 @smoke @MTR
  Scenario: MTR - Buyer able to click Submit Payment button to complete checkout
    Given I login with Gaston User
    And I go to the Shopping Cart
    #When I clear the cart
    And I add an item to the Shopping Cart
    And I select the add a Shipping Address button
    And I add an Address
    And I select the Flat Rate option
    And I select the Go To Secure Checkout button
    And I select the preloaded Credit Card button
    And I select the Submit Payment button
    Then I validate the Submit Payment

  @checkout  @MTR-1430 @smoke @MTR @testing1
  Scenario: MTR - Buyer able to select saved credit card if previously saved from past purchases made
    Given I login with Gaston User
    And I go to the Shopping Cart
    When I add an item to the Shopping Cart
    And I add an Address
    And I select the Flat Rate option
    And I select the Go To Secure Checkout button
    And I select the preloaded Credit Card button
    Then I validate the preloaded Credit Card

  @checkout  @MTR-1431 @smoke @MTR @testing1
  Scenario: MTR - Buyer able to see Congratulations screen after submitting payment
    Given I login with Gaston User
    And I go to the Shopping Cart
    When I clear the cart
    And I add an item to the Shopping Cart
    And I add an Address
    And I select the Flat Rate option
    And I select the Go To Secure Checkout button
    And I select the preloaded Credit Card button
    And I select the Submit Payment button
    Then I see the Congratulations Screen

  @checkout  @MTR-1432 @smoke @MTR @testing1
  Scenario: MTR - Buyer able to share listing on Facebook, Twitter or WhatsApp
    Given I login with Gaston User
    And I go to the Shopping Cart
    When I add an item to the Shopping Cart
    And I add an Address
    And I select the Flat Rate option
    And I select the Go To Secure Checkout button
    And I select the preloaded Credit Card button
    And I select the Submit Payment button
    And I select Facebook icon
    And I select Twitter icon
    And I select the Whatsapp icon
    Then I validate sharing on Whatsapp, Facebook or Twitter

  @checkout  @MTR-1433 @smoke @MTR
  Scenario: MTR - Buyer able to click Your Orders link to go to Orders > Purchased
    Given I login with Gaston User
    And I go to the Shopping Cart
    When I add an item to the Shopping Cart
    And I add an Address
    And I select the Flat Rate option
    And I select the Go To Secure Checkout button
    And I select the preloaded Credit Card button
    And I select the Submit Payment button
    And I select Your Orders button
    And I select Purchased button
    Then I validate Purchased