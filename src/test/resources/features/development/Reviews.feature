@prodProducts

Feature: Production Reviews

  @ProdReviews
  Scenario: Reviews
    Given I login with Gaston User in production products using cookies
    And PROD I go to the listing details page
    And select an item
    And select Review button
    Then Validate the Review sector

  @ReviewStorefront
  Scenario: Validate settings profile page
    Given I login with Gaston User in production products using cookies
    When I validate the settings button
    And I validate the profile first name text field
    And I validate the profile last name text field
    And I validate the profile username text field
    And I validate the profile email text field
    And I validate the profile phone number text field
    And I validate the profile bio text field
    Then I validate user profile info

  @ReviewStorefront
  Scenario: Validate profile social media
    Given I login with Gaston User in production products using cookies
    When I select social button
    And I validate the web site text field
    And I validate the facebook text field
    And I validate the twitter text field
    And I validate the instagram text field
    And I validate the linkedin text field
    And I validate the youtube text field
    Then I validate the profile social media


    @TestingLeaveAReview
    Scenario: Leave a review
      Given PROD I Sign in with new account "email2"
      And PROD I go to the listing details page
      When select an item
      And select Reviews tab
      And select Leave a review button
      And select five stars
      And complete the two reviews TextFields
      And select Send button
      And Validate that the review is displayed
      Then I validate Leave a review