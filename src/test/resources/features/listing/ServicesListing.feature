Feature: Listing


  @MMRSlisting @MMRS-578 @MMRS

  Scenario: SVC - Buyer able to create a listing
    Given SVC I login
    And SVC I validate the My Listings button
    When SVC I validate add new listing button
    And SVC I validate listing name text field
    And SVC I validate listing category
    And SVC I validate listing description text field
    And SVC I validate the listing Hourly price
    And SVC I validate listing image
    And SVC I validate listing video URL
    And SVC I select the go to details
    And SVC I select Work Model checkbox
    And SVC I select Languages checkbox
    And SVC I select Speciality checkbox
    And SVC I complete Cancellation Text Field
    And SVC I select Go to Availability button
    And SVC I select Available Days tab
    And SVC I select Add Time Slot
    And SVC I select Publish button
    Then SVC I validate create a listing


      #@MMRSlisting

  #Crear un caso de prueba editando un listing

  #Crear un caso de pruebas dando click en share

  #Crear un caso de pruebas dando click en delete


  @testingEdit
  Scenario: SVC - User able to edit classes
    Given SVC I login and I go to Dashboard
    And SVC I validate the My Listings button
    And SVC I select Edit button
    And SVC I validate listing name text field
    And SVC I validate listing category
    And SVC I validate listing description text field
    And SVC I validate the listing Hourly price
    And SVC I validate listing image
    And SVC I validate listing video URL
    And SVC I select the go to details
    And SVC I complete Cancellation Text Field
    And SVC I select Go to Availability button
    And SVC I select Available Days tab
    And SVC I select Add Time Slot
    And SVC I select Publish button
    Then SVC I validate the Edit button

  @testingShare
  Scenario: SVC - User able to share class
    Given I login And SVC I go to Dashboard
    And SVC I validate the My Listings button
    And SVC I select tab dots
    When SVC I select Share button
    Then SVC I validate Share button

  @testingDelete
  Scenario: SVC - User able to delete class
    Given I login And SVC I go to Dashboard
    And SVC I validate the My Listings button
    And SVC I select tab dots
    When SVC I select Delete button
    Then SVC I validate Delete button