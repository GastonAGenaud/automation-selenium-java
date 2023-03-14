Feature: addons

  @addons @smoke @MTR-3307 @MTR
  Scenario: MTR - Addons-FedEx- Validate the shipping with FedEx
    Given I login with Gaston User
    And I go to dashboard
    And select My Listings button
    When I validate the add new listing button
    Then Validate the shipping with FedEx

  @addons @smoke @MTR-3308 @MTR
  Scenario: MTR - Validating a FedEx Product Shipment
    Given I login with Gaston User
    And I go to dashboard
    And select My Listings button
    When I validate the add new listing button
    And validate the listing name text field
    And I validate the listing category
    And I validate the listing description text field
    And I validate the listing price
    And I validate the listing quantity
    And I validate the listing image
    And I validate the listing video URL
    And I validate the shipping with FedEx
    And I validate the pick up option
    And I select Publish button STAGING
    And I validate create a listing Staging
    And I go to my Listing
    And select my newly created product ADDONS
    And I log out
    And I login with another account
    And I go to dashboard
    And I will purchase the product
    And I select the Go To Secure Checkout button
    And I select the preloaded Credit Card button
    And I select the Submit Payment button
    Then I validate the Submit Payment

  @addons @MTR-1542 @MTR
  Scenario: MTR - Create an Add-On
    Given I login with Dev user
    And Admin Add-ons
    And I go to addons
    When I select add add on button
    And I select the type of service
    And I complete the Title text field
    And I complete the description text field
    And I complete the stripe productId text field
    And I complete video URL
    And I load a image
    And I select the save button
    Then I validate the created addon


  @addons  @MTR-1543 @MTR
  Scenario: Edit an Add-on
    Given I login with Dev user
    And Admin Add-ons
    And I go to addons
    When I select edit button in addons
    And I select other type of service
    And I complete the edit Title text field
    And I complete the edit description text field
    #And I complete the edit stripe productId text field
    And I select the save button
    Then I validate the edit

  @addons  @MTR-1544 @MTR
  Scenario: Eliminate an Add-on
    Given I login with Dev user
    And Admin Add-ons
    And I go to addons
    When I select delete button
    Then I validate the delete addon

  @addons  @MTR-1545 @MTR
  Scenario: Create a second Add-On
    Given I login with Dev user
    And Admin Add-ons
    And I go to addons
    When I select add add on button
    And I select the second type of service
    And I complete the Title text field
    And I complete the description text field
    And I complete the stripe productId text field
    And I complete video URL
    And I load a image
    And I select the save button
    And I select delete button
    Then I validate the created addon

  @addons  @MTR-1546 @MTR
  Scenario: Create a third Add-On
    Given I login with Dev user
    And Admin Add-ons
    And I go to addons
    When I select add add on button
    And I select the third type of service
    And I complete the Title text field
    And I complete the description text field
    And I complete the stripe productId text field
    And I complete video URL
    And I load a image
    And I select the save button
    And I select delete button
    Then I validate the created addon