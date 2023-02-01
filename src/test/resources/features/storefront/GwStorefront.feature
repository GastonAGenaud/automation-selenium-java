Feature: storefront

  User storefront Page

  @GwStorefront @smoke @GOOD-984
  Scenario: GW - Validate that the users storefront is displayed
    Given GW I go to user profile 
    When GW I select the profile button
    Then GW I see the user storefront

  @GwStorefront @smoke @GOOD-985 @GW
  Scenario: GW - Change cover image
    Given GW I go to user profile 
    When GW I select the profile button
    And GW I select the Change cover picture button
    Then GW I see the new cover image

  @GwStorefront @smoke @GOOD-986 @GW
  Scenario: GW - Validate settings profile page
    Given GW I go to user profile 
    When GW I validate the settings button
    And GW I validate the profile first name text field
    And GW I validate the profile last name text field
    And GW I validate the profile username text field
    And GW I validate the profile email text field
    And GW I validate the profile phone number text field
    And GW I validate the profile bio text field
    Then GW I validate user profile info

  @GwStorefront @smoke @GOOD-987 @GW
  Scenario: GW - Validate profile social media
    Given GW I go to user profile 
    When GW I select social button
    And GW I validate the web site text field
    And GW I validate the facebook text field
    And GW I validate the twitter text field
    And GW I validate the instagram text field
    And GW I validate the linkedin text field
    And GW I validate the youtube text field
    Then GW I validate the profile social media