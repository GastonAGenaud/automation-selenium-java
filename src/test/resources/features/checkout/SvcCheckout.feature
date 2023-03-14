Feature: Services Checkout

  @MMRS-378 @MMRSCheckout @MMRS @smoke
  Scenario: SVC - Buyer able to book a class with flat fee service
    Given SVC I login
    When SVC I go to a class
    And SVC I select hire button
    And SVC I select flat fee option
    And SVC I type in message text field
    And SVC I select the hire accept button
    Then SVC I see the shopping cart

  @MMRS-379 @MMRSCheckout @MMRS @smoke
  Scenario: SVC Buyer able to book a class with hourly
    Given SVC I login
    When SVC I go to a class
    And SVC I select hire button
    And SVC I select the date time
    And SVC I select hourly option
    And SVC I select select the end time
    And SVC I type in message text field
    And SVC I select the hire accept button
    And SVC I go back to cart
    Then SVC I see the shopping cart

  @MMRS-380 @MMRSCheckout @MMRS @smoke
  Scenario: SVC Buyer able to add a new credit cart
    Given SVC I login
    When SVC I go to a class
    And SVC I select hire button
    And SVC I select the date time
    And SVC I select hourly option
    And SVC I select select the end time
    And SVC I type in message text field
    And SVC I select the hire accept button
    And SVC I type in card number text field
    And SVC I type in name on card text field
    And SVC I type in expiration date text field
    And SVC I type in CVVCode text field
    And SVC I select save checkbox
    Then SVC I validate the new credit card

  @MMRS-402 @MMRSCheckout @MMRS @smoke
  Scenario: SVC Buyer able to submit payment
    Given SVC I login
    When SVC I go to a class
    And SVC I select hire button
    And SVC I select the date time
    And SVC I select hourly option
    And SVC I select select the end time
    And SVC I type in message text field
    And SVC I select the hire accept button
    And SVC I type in card number text field
    And SVC I type in name on card text field
    And SVC I type in expiration date text field
    And SVC I type in CVVCode text field
    #And SVC I select save checkbox
    And SVC I select submit payment
    Then SVC I validate the submit payment