Feature: OHE Admin

  @OHE-392 @OhAdmin @OHE
  Scenario: OHE - Login and validate the elements on Admin Panel
    Given OHE I go to Admin page
    When OHE I validate step 1 Create your marketplace
    And OHE I validate step 2 Select your homepage layout
    And OHE I validate step 3 design your homepage
    And OHE I validate step 4 create categories
    And OHE I validate step 5 create custom fields & filters
    And OHE I validate step 6 connect domain
    And OHE I validate step 7 Google Locations
    And OHE I validate step 8 emails
    And OHE I validate step 9 create a request or add a listing
    Then OHE I see all the functionalities in the administration panel for the user

  @OHE-393 @OhAdmin @OHE
  Scenario: Validate Select your homepage layout
    Given OHE Step 2: Select your homepage layout
    When OHE I validate the options
    And OHE I validate the next button
    Then OHE I see the Step 3

  @OHE-394 @OhAdmin @OHE
  Scenario: Validate Select design your homepage
    Given OHE Step 3: Design your homepage
    When OHE I validate the Header
    And OHE I validate the Footer
    And OHE I validate the social links
    And OHE I validate the Fonts
    And OHE I validate the Colors
    And OHE I validate the Logo And Favicon
    Then OHE I Validate the design homepage

  @OHE-395 @OhAdmin @OHE
  Scenario: validate Create Categories
    Given OHE Step 4: Create Categories
    #When OHE I validate the Import data button
    And OHE I type on category name field
    #And OHE I validate the Add Category
    And OHE I validate the category name
    And OHE I validate the next button
    Then OHE I see that the add category button adds the category with the name set in the text bar

  @OHE-396 @OhAdmin @OHE
  Scenario: validate Create Custom Fields and Filters page
    Given OHE Step 5: Create Custom Fields and Filters
    #When OHE I validate the hide button
    And OHE I validate the show button
    #And OHE I validate the listing page.jpg button
    #And OHE I validate the browse page.jpg button
    #And OHE I validate the upload a listing.jpg button
    And OHE I validate the table
    And OHE I validate the text button
    And OHE I validate the number button
    And OHE I validate the dropdown button
    And OHE I validate the checkbox button
    And OHE I validate the Tags button
    And OHE I validate the Color button
    And OHE I validate the Mandatory checkbox
    And OHE I validate the Show in Browse checkbox
    And OHE I validate the Allow to add tags checkbox
    And OHE I validate the is variant checkbox
    And OHE I validate the next button
    Then OHE I see that the next button redirect me to step 6

  @OHE-397 @OhAdmin @OHE
  Scenario: Validate Step 6 Connect Domain
    Given OHE Step 6: Connect Domain
    #When OHE I validate SMTP Settings
    #And OHE I validate templates
    #And OHE I validate the watch video button
    #And OHE I validate the table
    #And OHE I validate the actions section
    #And OHE I validate the status section
    And OHE I validate the next button smtp
    Then OHE I see that the next button redirect me to step 7

  @1 @OhAdmin @OHE
  Scenario: Admin design page
    Given OHE I go to Admin design
    When OHE I validate customize landing page option
    And OHE I validate customize menu option
    And OHE I validate customize login page option
    And OHE I validate customize sign up page option
    #And OHE I validate customize contact us page option
    #And OHE I validate customize about us page option
    #And OHE I validate customize FAQ page option
    And OHE I validate customize Terms & conditions page option
    #And OHE I validate customize Privacy Policy page option
    Then OHE I validate Admin Design

  @OHE-399 @OhAdmin @OHE
  Scenario: Validate Admin settings
    Given OHE Admin settings
    When OHE I validate settings Site Wording
    #And OHE I validate settings Company Info
    #And OHE I validate settings Payment Info
    #And OHE I validate settings Orders Setup
    #And OHE I validate Request Setup
    #And OHE I validate Discount codes section
    Then OHE I validate Admin Settings

  @OHE-400 @OhAdmin @OHE
  Scenario: Admin panel Reports validate page
    Given OHE Admin Reports
    When OHE I validate Contact Messages
    And OHE I validate User Reviews
    And OHE I validate Listing Reviews
    And OHE I validate User Transactions
    Then OHE I validate Admin Reports

  @OHE-401 @OhAdmin @OHE
  Scenario: Admin panel Add-ons validate page
    Given OHE Admin Add-ons
    When OHE I validate Add-Ons Section
    #And OHE I validate Extensions
    Then OHE I validate add ons