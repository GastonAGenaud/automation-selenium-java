Feature: storefront

  @OH5  @OHE
  #Scenario: OHE - Validate that the users storefront is displayed
   # Given I go to user profile
    #When I select the profile button
    #Then I see the user storefront

  @OH5 @OHE
  #Scenario: OHE - Change cover image
   # Given I go to user profile
    #When I select the Change cover picture button
    #Then I see the new cover image

  @OH6 @OHE @OHE-356
  Scenario: OHE - Validate settings profile page
    Given I login
    When I validate the settings button OHE
    And I validate the profile first name text field
    And I validate the profile last name text field
    And I validate the profile username text field
    And I validate the profile email text field
    And I validate the profile phone number text field
    And I validate the profile bio text field
    Then I validate user profile info