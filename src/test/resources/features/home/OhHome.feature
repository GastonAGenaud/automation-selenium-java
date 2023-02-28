Feature: HomeEducation

  @OHE-309 @OHE @smoke @OhHome
  Scenario: OHE - Validate home main header without account
    Given I go to owl home page
    When I select browse services
    And I select login
    And I select browse requests
    And I select sign up
    Then I validate the home main header

  @OHE-310 @OHE @smoke @OhHome
  Scenario: OHE - Validate the home menu
    Given I go to owl home page
    When I select ages 5 to 8 option
    And I select ages 9 to 11 option
    And I select ages 12 to 14 option
    And I select ages 15 to 17 option
    #And I select More option
    Then I validate the home menu

  @OHE-311 @OHE @smoke @OhHome
  Scenario: OHE - Validate the body without account
    Given I go to owl home page
    When I select Provide button
    And I select start now button
    And I select Hire button
    And I type in the search field
    And I select the search button
   #And I select the advance search button
    And I select see all in the browse by category section
    And I select see all in the newest providers section
    And I select for providers button
    And I select for seekers button
    And I select sign up now button
    Then I validate the home body

  @OHE-312 @OHE @smoke @OhHome
  Scenario: OHE - Validate the footer without account
    Given I go to owl home page
    When I select footer browse request button
    And I select footer log in button
    And I select footer sign up button
    And I select footer browse classes button
    And I select footer FAQ button
    And I select footer terms and service button
    And I select footer privacy policy button
    And I select footer about us button
    And I select footer contact button
    Then I validate the home footer section

  @OHE-313 @OHE @smoke @OhHome
  Scenario: OHE - Validate the main header with account
    Given I login
    And I go to owl home page
    When I select browse services
    And I select browse requests
    And I select inbox icon button
    And I select cart icon button
    Then I validate the main header with account

  @OHE-314 @OHE @smoke @OhHome
  Scenario: OHE - Validate the footer with account
    Given I login
    And I go to owl home page
    When I select footer browse requests button
    And I select footer browse classes button
    And I select footer FAQ button
    And I select footer terms and service button
    And I select footer privacy policy button
    And I select footer about us button
    And I select footer contact button
    Then I validate the home footer section with account

  @OHE-315  @OHE @smoke @OhHome
  Scenario: OHE - Validate the home - social links
    Given I go to owl home page
    When I validate the owl Facebook icon
    And I validate the owl Instagram icon
    And I validate the owl Linkedin icon
    And I validate the owl Twitter icon
    And I validate the owl Youtube icon
    Then I validate the owl social links