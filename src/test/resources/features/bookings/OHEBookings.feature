Feature: OHE - Bookings

  @OHE @OHE-347  @Bookings @testingCalendar
  Scenario: OHE - Calendar
    Given I go to dashboard page
    When I select bookings
    And I select All calendars
    And I select Math Classes calendar
    And I select Test calendar
    And I select today button
    And I select the back button
    And I select the forward button
    Then I validate the bookings calendar section


  @OHE @Bookings @OHE-348
  Scenario: OHE - My bookings
    Given I go to dashboard page
    When I select bookings
    And I select My bookings
    Then I validate the My bookings section