Feature: OhOnlineClasses


  Scenario: User able to suscribe to online classes
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
    And OHE I select submit payment
    And Go to dashboard
    And Select Online Classes