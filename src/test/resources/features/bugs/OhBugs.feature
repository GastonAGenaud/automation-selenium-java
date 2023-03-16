Feature: Owl Home Education Bugs


  @OHE-445 @OhCheckout @OHE  @oheBugs
  Scenario: OHE Buyer able to submit payment
    Given I login with Matias Owl
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
    And OHE I select submit payment
    Then OHE I validate the submit payment


  @OHElisting @OHE-446 @OHE
  Scenario: OHE - Buyer able to create a listing
    Given I login with Matias Owl
    And I validate the My Listings button
    When I validate add new listing button
    And I validate listing name text field
    And I validate listing category
    And I validate listing description text field
    And I validate the listing Hourly price
    And I validate listing image
    And I validate listing video URL
    And I select the go to details
    And I select Subject Tag
    And I select Work Model checkbox
    And I select Languages checkbox
    And I complete Cancellation Text Field
    And I select Go to Availability button
    And I select Available Days tab
    And I select Add Time Slot
    And I select Publish button
    Then I validate create a listing

  @OHEdetails @OHE-422 @OHE @oheBugs
  Scenario: OHE - Validate Review sector
    Given I go to the listing details page on OHE
    When I select the Review button
    Then I validate Review sector

  @OHE-419 @OHE  @oheBugs
  Scenario: OHE - Validate dashboard Customer
    Given I login with Dev User Owl
    When I select dashboard customer section
    And I select my settings button
    And I select the see all most popular button
    Then I validate the Most Popular sector

  @OHE-410 @OHE  @oheBugs
  Scenario: OHE - Validate Inbox Messages
    Given I login
    When I go to owl home page
    And I select inbox icon button OHE
    And I select user message
    Then I validate inbox sector

  @OHE-454 @OHE  @oheBugs
  Scenario: Validate mail in Profile Edit
    Given I login with Dev User Owl
    And select Settings button
    When complete First Name TextField
    And select Save Changes button
    Then I validate mail in Profile Edit

  @OHE @OHE-423 @oheBugs
  Scenario: Contact Messages BUG
    Given Admin Reports OHE
    When I validate Contact Messages
    Then I validate Contact Messages

  @OHE @OHE-330 @oheBugs
  Scenario: OHE - Location MAP
    Given I login with Dev User Owl
    When I select my settings
    And validate Location sector
    And complete Enter a Location TextField
    Then I validate the Location sector MAP