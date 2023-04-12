Feature: Production Home

  Scenario: Contact us
    Given I go to home page
    And select Contact Us button
    When complete Name TextField
    And complete Email TextField
    And complete Message TextField


    Scenario: Landing Page
      Given I login with Gaston User in production products using cookies
      And I go to home page
      And go to Landing Page
      When select Header
      And modify header text to "Test"
      And select Save
      And validate modified text
      And go to Landing Page
      And select Header
      And modify header text to "Blog"
      And select Save
      Then I validate Landing Page
