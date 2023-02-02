Feature: Listing


  @OHElisting @OHE-474 @OHE

  Scenario: OHE - Buyer able to create a listing
    Given I login and I go to Dashboard
    And I validate the My Listings button
    When I validate add new listing button
    And I validate listing name text field
    And I validate listing category
    And I validate listing description text field
    And I validate the listing Hourly price
    And I validate listing image
    And I validate listing video URL
    And I select the go to details
    And I select Subject Tag
    And I select Work Model checkbox
    And I select Languages checkbox
    And I complete Cancellation Text Field
    And I select Go to Availability button
    And I select Available Days tab
    And I select Add Time Slot
    And I select Publish button
    Then I validate create a listing


      #@OHElisting

  #Crear un caso de prueba editando un listing

  #Crear un caso de pruebas dando click en share

  #Crear un caso de pruebas dando click en delete


  @testingEdit
  Scenario: OHE - User able to edit classes
    Given I login and I go to Dashboard
    And I validate the My Listings button
    And I select Edit button
    And I validate listing name text field
    And I validate listing category
    And I validate listing description text field
    And I validate the listing Hourly price
    And I validate listing image
    And I validate listing video URL
    And I select the go to details
    And I complete Cancellation Text Field
    And I select Go to Availability button
    And I select Available Days tab
    And I select Add Time Slot
    And I select Publish button
    Then I validate the Edit button

  @testingShare
  Scenario: OHE - User able to share class
    Given I login and I go to Dashboard
    And I validate the My Listings button
    And I select tab dots
    When I select Share button
    Then I validate Share button

  @testingDelete
  Scenario: OHE - User able to delete class
    Given I login and I go to Dashboard
    And I validate the My Listings button
    And I select tab dots
    When I select Delete button
    Then I validate Delete button