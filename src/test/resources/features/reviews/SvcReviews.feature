Feature: Services Reviews

  @MMRS-569 @MMRS @MMRSReviews
  Scenario: I validate Ask for Reviews
    Given SVC I login and go to a class
    When SVC I select review section
#    And SVC I select ask for reviews button
#    Then SVC I validate Ask for Reviews

#  @MMRS-999
#  Scenario: Validate invite people to leave you a review
#    Given SVC I login and go to a class
#    When SVC I select review section
#    And SVC I select ask for reviews button
#    And complete Email and Message TextField
#    And SVC select Send button
#    Then SVC I validate Invite People
#
#  @MMRS-998
#  Scenario: import contacts for Review
#    Given SVC I login and go to a class
#    When SVC I select review section
#    And SVC I select ask for reviews button
#    And complete Email with Import
#    And SVC select Send button
#    Then SVC I validate Invite People