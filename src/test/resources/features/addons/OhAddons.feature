Feature: addons

  @OHE-342 @OHE @smoke @AddonsOHE
  Scenario: OHE - Create an Add-on
    Given OHE - I login and go to addons page
    When OHE - I select Add add on button
    And OHE - I select the type of services
    And OHE - I type in the Title text field
    And OHE - I type in the description text field
    And OHE - I type in the stripe productId text field
    And OHE - I type video URL
    And OHE - I load an image
    And OHE - I select the save Button
    Then OHE - I validate create an addon

  @OHE-343 @OHE @AddonsOHE
  Scenario: Edit an Add-on
    Given OHE - I login and go to addons page
    When OHE - I select edit button in Addons
    And OHE - I select Other type of services
    And OHE - I type in the edit Title text field
    And OHE - I type in the edit description text field
    And OHE - I type in the edit stripe productId
    And OHE - I type in the edit video URl
    And OHE - I load an image
    And OHE - I select the save Button
    Then OHE - I validate the Edit

  @OHE-344 @OHE @AddonsOHE
  Scenario: Eliminate an Add-on
    Given OHE - I login and go to addons page
    When OHE - I select delete Button
    Then OHE - I validate the Delete addon

  @OHE-345 @OHE @AddonsOHE
  Scenario: Create a second Add-On
    Given OHE - I login and go to addons page
    When OHE - I select Add add on button
    And OHE - I select the second type of services
    And OHE - I type in the Title text field
    And OHE - I type in the description text field
    And OHE - I type in the stripe productId text field
    And OHE - I type video URL
    And OHE - I load an image
    And OHE - I select the save Button
    And OHE - I select delete Button
    Then OHE - I validate create an addon

  @OHE-346 @OHE @AddonsOHE
  Scenario: Create a third Add-On
    Given OHE - I login and go to addons page
    When OHE - I select Add add on button
    And OHE - I select the third type of services
    And OHE - I type in the Title text field
    And OHE - I type in the description text field
    And OHE - I type in the stripe productId text field
    And OHE - I type video URL
    And OHE - I load an image
    And OHE - I select the save Button
    And OHE - I select delete Button
    Then OHE - I validate create an addon