Feature: Reviews

  @OHE-569 @OHE
  Scenario: I validate Ask for Reviews
    Given OHE I login and go to a class
    When OHE I select review section
#    And OHE I select ask for reviews button
#    Then OHE I validate Ask for Reviews

    @OHE-999
    Scenario: Validate invite people to leave you a review
      Given OHE I login and go to a class
      When OHE I select review section
      And OHE I select ask for reviews button
      And complete Email and Message TextField
      And OHE select Send button
      Then OHE I validate Invite People

      @OHE-998
      Scenario: import contacts for Review
        Given OHE I login and go to a class
        When OHE I select review section
        And OHE I select ask for reviews button
        And complete Email with Import
        And OHE select Send button
        Then OHE I validate Invite People