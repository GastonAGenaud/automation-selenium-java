Feature: Services Bugs

  @MMRS-789 @MMRSBugs
  Scenario: Admin Panel - Create Custom Fields - Section "This field is used in the following Categories" doesn't show all the subcategories
    Given SVC Step 4: Create Categories
    And select Add Category
    And SVC I Create 5 Subcategories
    And I create 2 Items inside one Subcategory
    And I go to Custom Fields
    And select what you wnt to edit
    And select the category you created
    Then SVC I valid that the incorrect display of categories and Subcategories no longer occurs

  @MMRS-725 @MMRSBugs
  Scenario: CS - Create Listing - Hourly offering toggle is inverted
    Given SVC I login
    And I validate the My Listings button
    When SVC I validate add new listing button
    And I validate listing name text field
    And I validate listing category
    And I validate listing description text field
    And I validate the listing Hourly price
    Then I valid that the Bug of Hourly no longer occurs.

  @MMRS-714 @MMRSBugs
  Scenario: Marketplace calendar in listing details page is showing some time slots as unavailable that are actually available
    Given SVC I go to the listing details page on OHE
    When SVC I go to a class
    And select one day from the calendar
    Then I validate that the available schedules work correctly and the bug no longer occurs.

  @MMRS-695 @MMRSBugs
  Scenario: CS - Request a quote - Inbox messages remain loaded indefinitely
    Given SVC I login
    When SVC I go to a class
    And select Request a Quote
    And complete form
    And SVC I select the Send Request Button

  @MMRS-628 @MMRSBugs
  Scenario: Loader does not progress when viewing homepage
    Given I login with Gaston User
    When SVC I select browse services
    And I select the favicon from the top left
    Then I valid that the endless loading when selecting favicon no longer occurs

  @MMRS-625 @MMRSBugs
  Scenario:CS - Admin Panel - Categories & Filters - Create custom fields - Create - the modal is not displayed in full on the screen
    Given SVC Step 5: Create Custom Fields and Filters
    When I go to create Custom Fields button
    Then I validate that the modal is displaying correctly and the bug no longer occurs

  @MMRS-571 @MMRSBugs
  Scenario:Dashboard section of my Services is slow to load
    Given SVC I login and go to Dashboard
    When SVC I select My Listings button
    Then I validate that the my Services-listings sections is working correctly and the slow loading no longer occurs

  @MMRS-195 @MMRSBugs
  Scenario:CS - Create Service - I'm able to continue without adding an image
    Given SVC I login
    And SVC I validate the My Listings button
    When SVC I validate add new listing button
    And SVC I validate listing name text field
    And SVC I validate listing category
    And SVC I validate listing description text field
    And SVC I validate the listing Hourly price
    And SVC I select the go to details
    Then SVC I validate that the bug of being able to continue creating the listing without adding the image no longer occurs

  @MMRS-530 @MMRSBugs
  Scenario: CS - Browse - List View is broken
    Given SVC I login
    When SVC I select Browse Experts
    And SVC select Service from User in Listings
    And Go back to Listings
    And SVC I select list view BUG
    And Go back to Listings
    And SVC select Service from User in Listings
    And Go back to Listings
    Then I validate that the List View is displaying correctly and the bug no longer occurs

  @MMRS-526 @MMRSBugs
  Scenario: CS - Site Settings are not fetched correctly
    Given SVC I login and go to Dashboard
    When SVC I select dashboard provider section
    And SVC select Create a New Listing from Provider
    Then I valid that the Add Listing Section from Provider works correctly and the bug no longer occurs


  @TestingAddonsBug @MMRSBugs
  Scenario: Unable to deactivate free add ons
    Given SVC - I login and go to addons page
    When Deactivate Verify user
    And Deactivate Explainer Video
    And Deactivate Google Analytics
    Then I validate that the addons can be deactivated correctly and the bug no longer occurs.

#  Scenario: Unable to deactivate free add ons
#    Given SVC - I login and go to addons page
#    When Deactivate Verify user
#    And Deactivate Explainer Video
#    And Deactivate Google Analytics
#    Then I validate that the addons can be deactivated correctly and the bug no longer occurs.

  @MMRSBugs
  Scenario: CS - Add a listing - Can't publish listing, Connect with Stripe button is displayed while already connected to Stripe
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
#    Then I validate that the

  @MMRS-429 @MMRSBugs
  Scenario: CS - Landing Page - with Browse first layout selected, listings are not showing
    Given SVC Step 2: Select your homepage layout
    And SVC I validate the options
    And SVC select browse first option
    And SVC go to home
    And SVC I go to Admin page again
    And SVC I validate the options
    And SVC select Stylish layout
    Then I validate that the browse first layout is displayed correctly and the bug no longer occurs

  @MMRSBugs
  Scenario:CS - Monthly bookings toggle is visible by default
    Given SVC I login
    And SVC I validate the My Listings button
    When SVC I validate add new listing button
    And SVC I validate listing name text field
    And SVC I validate listing category
    And SVC I validate listing description text field
    Then I Valid that the monthly offering button is not shown and the bug no longer occurs

  @MMRS-855
  Scenario: CS - Settings - Error on Notifications Settings
    Given I login and go to dashboard page
    When SVC I select My Settings
    And I select Notifications section
    And select Email Notifications Checkbox
    And select the Save Changes button
    Then I validate that the error on Notifications Settings no longer occurs
