Feature: Listing

  @listing @smoke @MTR-1345 @MTR
  Scenario: MTR - Buyer able to create a listing STAGING
    Given I login with Gaston User
    And I go to dashboard
    And select My Listings button
    When I validate the add new listing button
    And I validate the listing name text field
    And I validate the listing category
    And I validate the listing description text field
    And I validate the listing price
    And I validate the listing quantity
    And I validate the listing image
    And I validate the listing video URL
    And I validate the shipping with USPS
    And I validate the shipping with FedEx
    And I validate the Flat Rate Shipping
    And I validate the pick up option
    #And I complete Custom Fields
    And I select Publish button STAGING
    Then I validate create a listing Staging

     #Crear un caso de prueba editando un listing

    #Crear un caso de pruebas dando click en share

    #Crear un caso de pruebas dando click en delete

  @listing @smoke @MTR-3230 @MTR
  Scenario: MTR - Buyer able to create a listing with subcategory
    Given I login with Gaston User
    And I go to dashboard
    And select My Listings button
    When I validate the add new listing button
    And I validate the listing name text field
    And I validate the listing category and Subcategory
    And I validate the listing description text field
    And I validate the listing price
    And I validate the listing quantity
    And I validate the listing image
    And I validate the listing video URL
    And I validate the shipping with USPS
    And I validate the shipping with FedEx
    And I validate the Flat Rate Shipping
    And I validate the pick up option
    And I complete Custom Fields
    And I select Publish button STAGING
    Then I validate create a listing Staging