@prodProducts


@ProdStorefront

Feature: Production Storefront

#  @StorefrontDisplayed
#  Scenario: Validate that the users storefront is displayed
#    Given I login with Gaston User in production products using cookies
#    When I select the profile button
#    Then I see the user storefront
#
#
#  Scenario: Change cover image
#    Given I login with Gaston User in production products using cookies
#    When I select the profile button
#    And I select the Change cover picture button
#    Then I see the new cover image


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