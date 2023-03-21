Feature: Services Onboarding

  @MMRS-909
  Scenario: SVC Create my marketplace builder account and go to admin panel
    Given SVC I go to "https://mtreborn-staging-products.azurewebsites.net/application/Onboarding/?TierCode=OPTIMIZE"
    When SVC I type on name field
    And SVC I type on e-mail field "email1"
    And SVC I type on Phone Number field
    And SVC I type on your Marketplace name field "Test3"
    And SVC I click the button Next
    And SVC I select Products
    And SVC I click the other button Next
    And SVC I complete the field Card number
    And SVC I complete the field name on card
    And SVC I complete the field Expiry Date
    And SVC I complete the field CVC Code
    And SVC I click the button Save payment
    And SVC I go to the admin panel
    Then SVC I create my marketplace products page

  @MMRS-910
  Scenario: SVC Complete a marketplace of products
    Given SVC I go to "https://mtreborn-staging-products.azurewebsites.net/application/Onboarding/?TierCode=OPTIMIZE"
    When SVC I type on name field
    And SVC I type on e-mail field "email2"
    And SVC I type on Phone Number field
    And SVC I type on your Marketplace name field "Test1"
    And SVC I check to accept 'Being contacted for Custom Features that will grow my marketplace 2x faster'
    And SVC I click the button Next
    And SVC I select Products
    And SVC I click the other button Next
    And SVC I complete the field Card number
    And SVC I complete the field name on card
    And SVC I complete the field Expiry Date
    And SVC I complete the field CVC Code
    And SVC I click the button Save payment
    Then SVC I create my marketplace products page

  @MMRS-911
  Scenario: SVC Complete a marketplace of service
    Given SVC I go to "https://mtreborn-staging-products.azurewebsites.net/application/Onboarding"
    When SVC I type on name field
    And SVC I type on e-mail field "email3"
    And SVC I type on Phone Number field
    And SVC I type on your Marketplace name field "Test2"
    And SVC I check to accept 'Being contacted for Custom Features that will grow my marketplace 2x faster'
    And SVC I click the button Next
    And SVC I select Service
    And SVC I click the other button Next
    And SVC I complete the field Full name
    And SVC I complete the field Email Address
    And SVC I complete the field Phone Number
    And SVC I complete the field Credit card number
    And SVC I complete the field expiry date card
    And SVC I complete the field CVC Code card
    And SVC I click the button Start My MarketPlace Now
    Then SVC I create my marketplace service page