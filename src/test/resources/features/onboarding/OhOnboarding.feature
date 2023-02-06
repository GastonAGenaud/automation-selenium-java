Feature: OHE OnBoarding

  @OHE-362 @smoke
  Scenario: OHE Create my marketplace builder account and go to admin panel
    Given OHE I go to "https://mtreborn-staging-products.azurewebsites.net/application/Onboarding/?TierCode=OPTIMIZE"
    When OHE I type on name field
    And OHE I type on e-mail field "email1"
    And OHE I type on Phone Number field
    And OHE I type on your Marketplace name field "Test3"
    And OHE I click the button Next
    And OHE I select Products
    And OHE I click the other button Next
    And OHE I complete the field Card number
    And OHE I complete the field name on card
    And OHE I complete the field Expiry Date
    And OHE I complete the field CVC Code
    And OHE I click the button Save payment
    And OHE I go to the admin panel
    Then OHE I create my marketplace products page

  @OHE-363 @smoke
  Scenario: OHE Complete a marketplace of products
    Given OHE I go to "https://mtreborn-staging-products.azurewebsites.net/application/Onboarding/?TierCode=OPTIMIZE"
    When OHE I type on name field
    And OHE I type on e-mail field "email2"
    And OHE I type on Phone Number field
    And OHE I type on your Marketplace name field "Test1"
    And OHE I check to accept 'Being contacted for Custom Features that will grow my marketplace 2x faster'
    And OHE I click the button Next
    And OHE I select Products
    And OHE I click the other button Next
    And OHE I complete the field Card number
    And OHE I complete the field name on card
    And OHE I complete the field Expiry Date
    And OHE I complete the field CVC Code
    And OHE I click the button Save payment
    Then OHE I create my marketplace products page

  @OHE-364  @smoke
  Scenario: OHE Complete a marketplace of service
    Given OHE I go to "https://mtreborn-staging-products.azurewebsites.net/application/Onboarding"
    When OHE I type on name field
    And OHE I type on e-mail field "email3"
    And OHE I type on Phone Number field
    And OHE I type on your Marketplace name field "Test2"
    And OHE I check to accept 'Being contacted for Custom Features that will grow my marketplace 2x faster'
    And OHE I click the button Next
    And OHE I select Service
    And OHE I click the other button Next
    And OHE I complete the field Full name
    And OHE I complete the field Email Address
    And OHE I complete the field Phone Number
    And OHE I complete the field Credit card number
    And OHE I complete the field expiry date card
    And OHE I complete the field CVC Code card
    And OHE I click the button Start My MarketPlace Now
    Then OHE I create my marketplace service page