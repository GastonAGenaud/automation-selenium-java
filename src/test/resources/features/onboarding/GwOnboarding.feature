Feature: GW Onboarding flow

  As a new user
  I want to be able create my marketplace
  In order to start selling my products

  @GwOnboarding @smoke @GW @GOOD-886
  Scenario: GW - Create my marketplace builder account and go to admin panel
    Given I go to "https://mtreborn-staging-products.azurewebsites.net/application/Onboarding/?TierCode=OPTIMIZE"
    When I type on name field
    And I type on e-mail field "email1"
    And I type on Phone Number field
    And I type on your Marketplace name field "Test3"
    And I click the button Next
    And I select Products
    And I click the other button Next
    And I complete the field Card number
    And I complete the field name on card
    And I complete the field Expiry Date
    And I complete the field CVC Code
    And I click the button Save payment
    #And I go to the admin panel
    Then I create my marketplace products page


  @GwOnboarding @smoke @GW @GOOD-887
  Scenario: GW - Complete a marketplace of products
    Given I go to "https://mtreborn-staging-products.azurewebsites.net/application/Onboarding/?TierCode=OPTIMIZE"
    When I type on name field
    And I type on e-mail field "email2"
    And I type on Phone Number field
    And I type on your Marketplace name field "Test1"
    And i check to accept 'Being contacted for Custom Features that will grow my marketplace 2x faster'
    And I click the button Next
    And I select Products
    And I click the other button Next
    And I complete the field Card number
    And I complete the field name on card
    And I complete the field Expiry Date
    And I complete the field CVC Code
    And I click the button Save payment
    Then I create my marketplace products page


  @GwOnboarding @smoke #@GW @GWmarket #@GOOD-889
  Scenario: GW - Complete a marketplace of service
    Given I go to "https://mtreborn-staging-products.azurewebsites.net/application/Onboarding"
    When I type on name field
    And I type on e-mail field "email3"
    And I type on Phone Number field
    And I type on your Marketplace name field "Test2"
    And i check to accept 'Being contacted for Custom Features that will grow my marketplace 2x faster'
    And I click the button Next
    And I select Service
    And I click the other button Next
    And I complete the field Full name
    And I complete the field Email Address
    And GW I complete the field Phone Number
    And GW I complete the field Card number
    And GW I complete the field name on card
    And GW I complete the field Expiry Date
    And I complete the field CVC Code
    And I click the button Save payment
    Then I create my marketplace service page

  @GwOnboarding @smoke @GW @GOOD-889
  Scenario: GW - Select payment plan build
    Given I go to "https://mymarketplacebuilder.com/new-pricing/"
    When I choose Build
    Then It redirects me to 'What type of marketplace are you looking to build?'

  @GwOnboarding @smoke @GOOD-890
  Scenario: GW - Select payment plan launch
    Given I go to "https://mymarketplacebuilder.com/new-pricing/"
    When I choose launch
    Then It redirects me to 'What type of marketplace are you looking to build?'

  @GwOnboarding @smoke @GW @GOOD-891
  Scenario: GW - Select payment plan specialize
    Given I go to "https://mymarketplacebuilder.com/new-pricing/"
    When I choose specialize
    Then It redirects me to a calendar

  @GwOnboarding @smoke @GW @GOOD-892
  Scenario: GW - Select payment plan customize
    Given I go to "https://mymarketplacebuilder.com/new-pricing/"
    When I choose customize
    Then It redirects me to a calendar