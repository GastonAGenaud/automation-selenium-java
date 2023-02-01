Feature: storefront

  User storefront Page

  @storefront @smoke @MTR  @MTR-1346
  Scenario: MTR - Validate that the users storefront is displayed
    Given I login with Gaston User
    When I select the profile button
    Then I see the user storefront

  @storefront @smoke @MTR  @MTR-1347
  Scenario: MTR - Change cover image
    Given I login with Gaston User
    When I select the profile button
    And I select the Change cover picture button
    Then I see the new cover image

  @storefront @smoke @MTR  @MTR-1348
  Scenario: MTR - Validate settings profile page
    Given I login with Gaston User
    When I validate the settings button
    And I validate the profile first name text field
    And I validate the profile last name text field
    And I validate the profile username text field
    And I validate the profile email text field
    And I validate the profile phone number text field
    And I validate the profile bio text field
    Then I validate user profile info

  @storefront @smoke @MTR  @MTR-1349
  Scenario: MTR - Validate profile social media
    Given I login with Gaston User
    When I select social button
    And I validate the web site text field
    And I validate the facebook text field
    And I validate the twitter text field
    And I validate the instagram text field
    And I validate the linkedin text field
    And I validate the youtube text field
    Then I validate the profile social media