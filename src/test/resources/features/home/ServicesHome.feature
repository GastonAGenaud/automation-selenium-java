@MMRS-883
Feature: Services Home

  @MMRS-884 @MMRS  @MMRSHome
  Scenario: SVC - Validate home main header without account
    Given SVC I go to owl Svc page
    When SVC I select browse services
    And  SVC I select login
    And  SVC I select browse requests
    And  SVC I select sign up
    Then SVC I validate the home main header

#  @MMRS @MMRS  @MMRSHome
  Scenario: SVC - Validate the home menu
    Given SVC I go to owl Svc page
#    When SVC I select ages 5 to 8 option
#    And  SVC I select ages 9 to 11 option
#    And  SVC I select ages 12 to 14 option
#    And  SVC I select ages 15 to 17 option
#    And  SVC I select More option
    Then SVC I validate the home menu

  @MMRS-885
  Scenario: SVC - Validate the body without account
    Given SVC I go to owl Svc page
    When SVC I select Provide button
    And  SVC I select start now button
    And  SVC I select Hire button
    And  SVC I type in the search field
    And  SVC I select the search button
   #And  SVC I select the advance search button
    And  SVC I select see all in the browse by category section
    And  SVC I select see all in the newest providers section
    And  SVC I select for providers button
    And  SVC I select for seekers button
    And  SVC I select sign up now button
    Then SVC I validate the home body

  @MMRS-886 @MMRS  @MMRSHome
  Scenario: SVC - Validate the footer without account
    Given SVC I go to owl Svc page
#    When SVC I select footer browse request button
    And  SVC I select footer log in button
    And  SVC I select footer sign up button
    And  SVC I select footer browse classes button
    And  SVC I select footer FAQ button
    And  SVC I select footer terms and service button
    And  SVC I select footer privacy policy button
    And  SVC I select footer about us button
    And  SVC I select footer contact button
    Then SVC I validate the home footer section

  @MMRS-887 @MMRS  @MMRSHome
  Scenario: SVC - Validate the main header with account
    Given SVC I login
    And  SVC I go to owl Svc page
    When SVC I select browse services
    And  SVC I select browse requests
    And  SVC I select inbox icon button
    And  SVC I select cart icon button
    Then SVC I validate the main header with account

  @MMRS-888 @MMRS  @MMRSHome
  Scenario: SVC - Validate the footer with account
    Given SVC I login
    And  SVC I go to owl Svc page
    When SVC I select footer browse requests button
    And  SVC I select footer browse classes button
    And  SVC I select footer FAQ button
    And  SVC I select footer terms and service button
    And  SVC I select footer privacy policy button
    And  SVC I select footer about us button
    And  SVC I select footer contact button
    Then SVC I validate the home footer section with account

  @MMRS-889  @MMRS  @MMRSHome
  Scenario: SVC - Validate the home - social links
    Given SVC I go to owl Svc page
    When SVC I validate the owl Facebook icon
    And  SVC I validate the owl Instagram icon
    And  SVC I validate the owl Linkedin icon
    And  SVC I validate the owl Twitter icon
    And  SVC I validate the owl Youtube icon
    Then SVC I validate the owl social links