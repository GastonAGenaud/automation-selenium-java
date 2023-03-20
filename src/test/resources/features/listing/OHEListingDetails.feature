@OHE-562
Feature: Listing details

    @OHEdetails @OHE-460 @OHE
    Scenario: OHE - Validate listing details page
        Given I go to the listing details page on OHE
        When  select the seller name
        Then  see the seller storefront profile

    @OHEdetails @OHE-461 @OHE
    Scenario: OHE - Send message to seller
        Given I go to the listing details page on OHE
        When  select the send message button
        Then  see that it redirects me to the chat page

    @OHEdetails @OHE-462 @OHE
    Scenario: OHE - Validate Hire Button
        Given I go to the listing details page on OHE
        When I select the Hire Button
        Then I validate Hire Button

    @OHEdetails @OHE-463 @OHE
    Scenario: OHE - Validate Service information sector
        Given I go to the listing details page on OHE
        When I select the Service information button
        Then I validate Service information sector

    @OHEdetails @OHE-464 @OHE
    Scenario: OHE - Validate Availability sector
        Given I go to the listing details page on OHE
        When I select the Availability button
        Then I validate Availability sector

    @OHEdetails @OHE-467 @OHE
    Scenario: OHE - Validate Flat rate services sector
        Given I go to the listing details page on OHE
        When I select the Flat rate services button
        Then I validate Flat rate services sector

    @OHEdetails @OHE-468 @OHE
    Scenario: OHE - Validate Media sector
        Given I go to the listing details page on OHE
        When I select the Media button
        Then I validate Media sector

    @OHEdetails @OHE-469 @OHE
    Scenario: OHE - Validate Review sector
        Given I go to the listing details page on OHE
        When I select the Review button
        Then I validate Review sector


    @OHEdetails @OHE-471 @OHE
    Scenario: OHE - Validate Work sector
        Given I go to the listing details page on OHE
        Then I validate Work sector

    @OHEdetails @OHE-472 @OHE
    Scenario: OHE - Validate Education sector
        Given I go to the listing details page on OHE
        Then I validate Education sector

    @OHEdetails @OHE-473 @OHE
    Scenario: OHE - Validate Bio sector
        Given I go to the listing details page on OHE
        Then I validate Bio sector

