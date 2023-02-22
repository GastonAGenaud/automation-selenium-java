Feature: Admin

  Admin Account

  @admin  @MTR-1297 @MTR
  Scenario: MTR - Login and validate the elements on Admin Panel
    Given I login with Gaston User
    And Get started steps
    When I validate step 1 Create your marketplace
    And I validate step 2 Select your landing page layout
    And I see that the step 2 redirect me to How do you want to make money on your site?
    And I validate step 3 design your homepage
    And I see that the step 3 redirect me to Select template options
    And I validate step 4 create categories
    And I see that the step 4 redirect me to Categories creation and editing
    And I validate step 5 create custom fields & filters
    And I see that the step 5 redirect me to Create Custom Fields and Filters
    And I validate step 8 emails
    And I see that the step 8 redirect me to Set up the marketplace email
    And I validate step 6 connect domain
    And I see that the step 6 redirect me to Connect Domain
    And I validate step 7 Google Locations and Social Login
    And I see that the step 7 redirect me to Google Locations and Social Login
    And I validate step 9 create a request or add a user
    And I validate step 10 monetization
    And I validate step 11 create test users
    And I validate step 12 invite users
    And I validate step 13 marking tips
    Then I see all the functionalities in the administration panel for the user

  @admin  @MTR-1298 @MTR
  Scenario: Validate Monetization Step - transaction fee%
    Given I login with Gaston User
    And Step 10: Monetization
    When I validate the Contact us button
    And I validate the transaction fee% option
    Then I see that the contact us button redirect me to a calendar
    And I see that the next button send me to step 3

  @admin  @MTR-1299 @MTR
  Scenario: Validate Monetization Step - No payments
    Given I login with Gaston User
    And Step 10: Monetization
    When I validate the Contact us button
    And I validate the No payments option
    Then I see that the contact us button redirect me to a calendar
    And I see that the next button send me to step 3

  @admin  @MTR-1300
  Scenario: Validate Select your landing page layout
    Given I login with Gaston User
    And Step 3: Select your landing page layout
    When I validate the options
    And I validate the next button
    Then I see the Step 4

  @admin  @MTR-1301  @MTR
  Scenario: validate Create Categories
    Given I login with Gaston User
    And Step 4: Create Categories
    When I validate the Import data button
    And I type on category name field
    And I validate the Add Category
    And I validate the category name
    And I validate the next button
    Then I see that the add category button adds the category with the name set in the text bar

  @admin  @MTR-1302  @MTR
  Scenario: validate Create Custom Fields and Filters page
    Given I login with Gaston User
    And Step 5: Create Custom Fields and Filters
    When I validate the hide button
    And I validate the show button
  #  And I validate the listing page.jpg button
  #  And I validate the browse page.jpg button
   # And I validate the upload a listing.jpg button
  #  And I validate the table
   # And I validate the text button
  #  And I validate the number button
  #  And I validate the dropdown button
  #  And I validate the checkbox button
  #  And I validate the Tags button
  #  And I validate the Color button
  #  And I validate the Mandatory checkbox
  #  And I validate the Show in Browse checkbox
  #  And I validate the Allow to add tags checkbox
  #  And I validate the is variant checkbox
  #  And I validate the next button
  #  Then I see that the next button redirect me to step 6
    And I go to create Custom Fields button
    And I validate the Field Name
    And I validate the Field Description
    And I validate the Field Type
    Then I validate Save Button


  @admin  @MTR-1303 @MTR
  Scenario: Validate Step 8 E-mails - SMTP Settings
    Given I login with Gaston User
    And Step 8: E-mails
    When I validate SMTP Settings
    And I validate here button
    #And I type on Email
     #And I type on Password
     #And I validate verify credentials
     #And I validate the next button smtp
     #Then I see that the verify credentials button verify the mail & I see that the next button redirect me to step 7

  @admin  @MTR-1304 @MTR
  Scenario: Validate Step 8 E-mails - templates
    Given I login with Gaston User
    And Step 8: E-mails
    When I validate templates
    And I validate the watch video button
    And I validate the table
    And I validate the actions section
    And I validate the status section
    Then I see that the verify credentials button verify the mail & I see that the next button redirect me to step 7

  @admin  @MTR-1305 @MTR
  Scenario: Admin design page
    Given I login with Gaston User
    And Admin design
    When I validate customize landing page option
    And I validate customize menu option
    And I validate customize login page option
    And I validate customize sign up page option
    And I validate customize contact us page option
    And I validate customize about us page option
    And I validate customize FAQ page option
    And I validate customize Terms & conditions page option
    And I validate customize Privacy Policy page option
    Then I validate Admin Design

  @admin  @MTR-1306 @MTR
  Scenario: Validate Admin settings
    Given I login with Gaston User
    And Admin settings
    When I validate settings Site Wording
    And I validate settings Company Info
#    And I validate settings Payment Info
    And I validate settings Orders Setup
    And I validate Request Setup
#    And I validate Discount codes section
    Then I validate Admin Settings

  @admin  @MTR-1307 @MTR
  Scenario: Admin panel Reports validate page
    Given I login with Gaston User
    And Admin Reports
    When I validate Contact Messages
    And I validate User Reviews
    And I validate Listing Reviews
    And I validate User Transactions
    Then I validate Admin Reports

  @admin  @MTR-1308 @MTR
  Scenario: Admin panel Add-ons validate page
    Given I login with Gaston User
    And Admin Add-ons
    When I validate Add-Ons Section
   # And I validate Extensions
   Then I validate add ons

  @admin @MTR-2072 @MTR
  Scenario: Delete user in Admin Page
    Given I login with Gaston User
    And Get started steps
    When I select Users
    And search name
    And click Select Action button
    And select Delete button
    Then I validate Delete user