Feature: Checkout

  @OHE-378 @OhCheckout @OHE @smoke
  Scenario: OHE - Buyer able to book a class with flat fee service
    Given OHE I login
    When OHE I go to a class
    And OHE I select hire button
    And OHE I select flat fee option
    And OHE I type in message text field
    And OHE I select the hire accept button
    Then OHE I see the shopping cart

  @OHE-379 @OhCheckout @OHE @smoke
  Scenario: OHE Buyer able to book a class with hourly
    Given OHE I login
    When OHE I go to a class
    And OHE I select hire button
    And OHE I select hourly option
    And OHE I select the date time
    And OHE I select select the end time
    And OHE I type in message text field
    And OHE I select the hire accept button
    And OHE I go back to cart
    Then OHE I see the shopping cart

  @OHE-380 @OhCheckout @OHE @smoke
  Scenario: OHE Buyer able to add a new credit cart
    Given OHE I login
    When OHE I go to a class
    And OHE I select hire button
    And OHE I select hourly option
    And OHE I select the date time
    And OHE I select select the end time
    And OHE I type in message text field
    And OHE I select the hire accept button
    And OHE I type in card number text field
    And OHE I type in name on card text field
    And OHE I type in expiration date text field
    And OHE I type in CVVCode text field
    And OHE I select save checkbox
    Then OHE I validate the new credit card

  @OHE-402 @OhCheckout @OHE @smoke
  Scenario: OHE Buyer able to submit payment
    Given OHE I login
    When OHE I go to a class
    And OHE I select hire button
    And OHE I select hourly option
    And OHE I select the date time
    And OHE I select select the end time
    And OHE I type in message text field
    And OHE I select the hire accept button
    And OHE I type in card number text field
    And OHE I type in name on card text field
    And OHE I type in expiration date text field
    And OHE I type in CVVCode text field
    #And OHE I select save checkbox
    And OHE I select submit payment
    Then OHE I validate the submit payment