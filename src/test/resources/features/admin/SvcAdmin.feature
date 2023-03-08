Feature: Services Admin

  @SVC-392 @SvcAdmin @SVC
  Scenario: SVC - Login and validate the elements on Admin Panel
    Given SVC I go to Admin page
    When SVC I validate step 1 Create your marketplace
    And SVC I validate step 2 Select your homepage layout
    And SVC I validate step 3 design your homepage
    And SVC I validate step 4 create categories
    And SVC I validate step 5 create custom fields & filters
    And SVC I validate step 6 connect domain
    And SVC I validate step 7 Google Locations
    And SVC I validate step 8 emails
    And SVC I validate step 9 create a request or add a listing
    Then SVC I see all the functionalities in the administration panel for the user

  @SVC-393 @SvcAdmin @SVC
  Scenario: Validate Select your homepage layout
    Given SVC Step 2: Select your homepage layout
    When SVC I validate the options
    And SVC I validate the next button
    Then SVC I see the Step 3

  @SVC-394 @SvcAdmin @SVC
  Scenario: Validate Select design your homepage
    Given SVC Step 3: Design your homepage
    When SVC I validate the Header
    And SVC I validate the Footer
    And SVC I validate the social links
    And SVC I validate the Fonts
    And SVC I validate the Colors
    And SVC I validate the Logo And Favicon
    Then SVC I Validate the design homepage

  @SVC-395 @SvcAdmin @SVC
  Scenario: validate Create Categories
    Given SVC Step 4: Create Categories
    #When SVC I validate the Import data button
    And SVC I type on category name field
    #And SVC I validate the Add Category
    And SVC I validate the category name
    And SVC I validate the next button
    Then SVC I see that the add category button adds the category with the name set in the text bar

  @SVC-396 @SvcAdmin @SVC
  Scenario: validate Create Custom Fields and Filters page
    Given SVC Step 5: Create Custom Fields and Filters
    #When SVC I validate the hide button
    And SVC I validate the show button
    #And SVC I validate the listing page.jpg button
    #And SVC I validate the browse page.jpg button
    #And SVC I validate the upload a listing.jpg button
    And SVC I validate the table
    And SVC I validate the text button
    And SVC I validate the number button
    And SVC I validate the dropdown button
    And SVC I validate the checkbox button
    And SVC I validate the Tags button
    And SVC I validate the Color button
    And SVC I validate the Mandatory checkbox
    And SVC I validate the Show in Browse checkbox
    And SVC I validate the Allow to add tags checkbox
    And SVC I validate the is variant checkbox
    And SVC I validate the next button
    Then SVC I see that the next button redirect me to step 6

  @SVC-397 @SvcAdmin @SVC
  Scenario: Validate Step 6 Connect Domain
    Given SVC Step 6: Connect Domain
    #When SVC I validate SMTP Settings
    #And SVC I validate templates
    #And SVC I validate the watch video button
    #And SVC I validate the table
    #And SVC I validate the actions section
    #And SVC I validate the status section
    And SVC I validate the next button smtp
    Then SVC I see that the next button redirect me to step 7

  @1 @SvcAdmin @SVC
  Scenario: Admin design page
    Given SVC I go to Admin design
    When SVC I validate customize landing page option
    And SVC I validate customize menu option
    And SVC I validate customize login page option
    And SVC I validate customize sign up page option
    #And SVC I validate customize contact us page option
    #And SVC I validate customize about us page option
    #And SVC I validate customize FAQ page option
    And SVC I validate customize Terms & conditions page option
    #And SVC I validate customize Privacy Policy page option
    Then SVC I validate Admin Design

  @SVC-399 @SvcAdmin @SVC
  Scenario: Validate Admin settings
    Given SVC Admin settings
    When SVC I validate settings Site Wording
    #And SVC I validate settings Company Info
    #And SVC I validate settings Payment Info
    #And SVC I validate settings Orders Setup
    #And SVC I validate Request Setup
    #And SVC I validate Discount codes section
    Then SVC I validate Admin Settings

  @SVC-400 @SvcAdmin @SVC
  Scenario: Admin panel Reports validate page
    Given SVC Admin Reports
    When SVC I validate Contact Messages
    And SVC I validate User Reviews
    And SVC I validate Listing Reviews
    And SVC I validate User Transactions
    Then SVC I validate Admin Reports

  @SVC-401 @SvcAdmin @SVC
  Scenario: Admin panel Add-ons validate page
    Given SVC Admin Add-ons
    When SVC I validate Add-Ons Section
    #And SVC I validate Extensions
    Then SVC I validate add ons