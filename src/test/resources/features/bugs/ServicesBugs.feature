Feature: Services Bugs

  @MMRSBugs1
  Scenario: Admin Panel - Create Custom Fields - Section "This field is used in the following Categories" doesn't show all the subcategories
    Given SVC Step 4: Create Categories
    And select Add Category
    And SVC I Create 5 Subcategories
    And I create 2 Items inside one Subcategory
    And I go to Custom Fields
    And select what you wnt to edit
    And select the category you created
    Then SVC I valid that the incorrect display of categories and Subcategories no longer occurs

  @MMRSBugs2
  Scenario: CS - Create Listing - Hourly offering toggle is inverted
    Given SVC I login
    And I validate the My Listings button
    When SVC I validate add new listing button
    And I validate listing name text field
    And I validate listing category
    And I validate listing description text field
    And I validate the listing Hourly price
    Then I valid that the Bug of Hourly no longer occurs.

  @MMRSBugs3
  Scenario: Marketplace calendar in listing details page is showing some time slots as unavailable that are actually available
    Given SVC I go to the listing details page on OHE
    When SVC I go to a class
    And select one day from the calendar
    Then I validate that the available schedules work correctly and the bug no longer occurs.

  @MMRSBugs4
  Scenario: CS - Request a quote - Inbox messages remain loaded indefinitely
    Given SVC I login
    When SVC I go to a class
    And select Request a Quote
    And complete form
    And SVC I select the Send Request Button

  @MMRSBugs5
  Scenario: Loader does not progress when viewing homepage
    Given I login with Gaston User
    When SVC I select browse services
    And I select the favicon from the top left
    Then I valid that the endless loading when selecting favicon no longer occurs