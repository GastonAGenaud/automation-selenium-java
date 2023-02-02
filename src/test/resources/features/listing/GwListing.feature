Feature: Listing

  @GwListing @smoke @GOOD-971 @GW
  Scenario: GW - Buyer able to create a listing
    Given GW I login and go to listing page
    When GW I validate the add new listing button
    And GW I validate the listing name text field
    And GW I validate the listing category
    And GW I validate the listing description text field
    And GW I validate the listing price
    And GW I validate the listing quantity
    And GW I validate the listing image
    And GW I validate the listing video URL
    And GW I validate the shipping with USPS
    And GW I validate the shipping with FedEx
    And GW I validate the Flat Rate Shipping
    #And GW I validate the pick up option
    And GW I complete Custom Fields
    And GW I select Publish button STAGING
    Then GW I validate create a listing Staging

     #Crear un caso de prueba editando un listing

    #Crear un caso de pruebas dando click en share

    #Crear un caso de pruebas dando click en delete


#  @TestingListing
#  Scenario:GW User able to edit Item
#    Given GW I login and I go to Dashboard
#    And GW I validate the My Listings button
#    And GW I select Edit button
#    And GW I validate listing name text field
#    And GW I validate listing category
#    And GW I validate listing description text field
#    And GW I validate the listing Hourly price
#    And GW I validate listing image
#    And GW I validate listing video URL
#    And GW I select the go to details
#    And GW I complete Cancellation Text Field
#    And GW I select Go to Availability button
#    And GW I select Available Days tab
#    And GW I select Add Time Slot
#    And GW I select Publish button
#    Then GW I validate the Edit button
#
#  @TestingListing
#  Scenario: GW User able to share Item
#    Given GW I login and I go to Dashboard
#    And GW I validate the My Listings button
#    And GW I select tab dots
#    When GW I select Share button
#    Then GW I validate Share button
#
#  @TestingListing
#  Scenario: GW User able to delete Item
#    Given GW I login and I go to Dashboard
#    And GW I validate the My Listings button
#    And GW I select tab dots
#    When GW I select Delete button
#    Then GW I validate Delete button
