Feature: Bugs

  @MTR @MTR-1927 @bugs
  Scenario: MTR - Orders - Purchased - Open Section
    Given I login with Gaston User
    And I go to orders page BUGS
    When I validate purchased orders details
    And I validate send message to seller
    Then I validate the purchased open section

  @MTR @MTR-1923 @bugs
  Scenario: MTR - Create my marketplace builder account and go to admin panel
    Given I go to "https://mtreborn-staging-products.azurewebsites.net/application/Onboarding/?TierCode=OPTIMIZE"
    When I type on name field
    And I type on e-mail field "email1"
    And I type on Phone Number field
    And I type on your Marketplace name field "Test3"
    And I click the button Next
    And I select Products
    And I click the other button Next
    And I complete the field Card number
    And I complete the field name on card
    And I complete the field Expiry Date
    And I complete the field CVC Code
    And I click the button Save payment
    #And I go to the admin panel
    Then I create my marketplace products page

  @MTR @MTR-1815 @bugs
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

  @MTR @MTR-1804 @bugs
  Scenario: MTR - Buyer able to click Submit Payment button to complete checkout
    Given I login with Gaston User
    And I add an item to the Shopping Cart BUG
    When I clear the cart
    And I add an item to the Shopping Cart BUG
    And I select the add a Shipping Address button
    And I add an Address BUGS
    And I select the Flat Rate button
    And I select the Go To Secure Checkout button
    And I select the preloaded Credit Card button
    And I select the Submit Payment button
    Then I validate the Submit Payment

  @MTR @MTR-1805 @bugs
  Scenario: MTR - Log in and Validate the Browse Section
    Given I go to Browse Page
    Then I validate the Browse Section

  @MTR @MTR-3261 @bugs
  Scenario: Create tracking number
    And I login with another account
    And I go to dashboard
    When buy the product
    And I select the add a Shipping Address button
    And I add an Address Fields
    And I select the Flat Rate button
    And I select the Go To Secure Checkout button
    And I select the preloaded Credit Card button
    And I select the Submit Payment button
    Then I validate the Submit Payment


  @MTR @MTR-1895 @bugs
  Scenario: Validate tracking number
    Given I login with Gaston User
    And I go to orders page BUGS
    When I select tracking number TextField
    And select Submit button
    Then I validate tracking number

  @MTR @MTR-1649 @bugs
  Scenario: User able to Feature Listing
    Given I login with Gaston User
    And select My Listings button
    And I validate the add new listing button
    And I validate the listing name text field
    And I validate the listing category
    And I validate the listing description text field
    And I validate the listing price
    And I validate the listing quantity
    #And I validate the listing image BUGS
    And I validate the listing video URL
    And select no Shipping Tab
        #And I validate the shipping with USPS
        #And I validate the shipping with FedEx
        #And I validate the Flat Rate Shipping
        #And I validate the pick up option
    #And I select go to details
    And I select Publish button BUG
    And select item tab
    And select Feature option
    And complete Start Date TextField
    And complete End Date TextField
    When select Feature Listing button
    Then I validate Feature Listing

  @MTR @MTR-1856 @bugs
  Scenario: Validate Admin settings
    Given I login with Gaston User
    And Admin settings
    Then I validate settings Company Info BUG

  @MTR @MTR-1807 @bugs
  Scenario: Validate Step 8 E-mails - templates
    Given I login with Gaston User
    And Step 8: E-mails
    When I validate templates
    And select Edit button
    Then I validate Templates and Edit


  @MTR @MTR-1654 @bugs
  Scenario: User able to Feature Listing
    Given I login with Gaston User
    And select My Listings button
    And I validate the add new listing button
    And I validate the listing name text field
    And I validate the listing category
    And I validate the listing description text field
    And I validate the listing price
    And I validate the listing quantity
    And I validate the listing image BUG
    And I validate the listing video URL
    And select no Shipping Tab
        #And I validate the shipping with USPS
        #And I validate the shipping with FedEx
        #And I validate the Flat Rate Shipping
        #And I validate the pick up option
    #And I select go to details
    When select Publish button BUG
    Then I validate Publish Listing

  @MTR @MTR-1711 @bugs
  Scenario: Download file in Orders Purchased
    Given I login with Gaston User
    And I go to orders page
    When select Download file
    Then I validate Download file

#  @OHE-445 @MMRSheckout @OHE  @bugs
#  Scenario: OHE Buyer able to submit payment
#    Given OHE I login
#    When OHE I go to a class
#    And OHE I select hire button
#    And OHE I select hourly option
#    And OHE I select the date time
#    And OHE I select select the end time
#    And OHE I type in message text field
#    And OHE I select the hire accept button
#    And OHE I type in card number text field
#    And OHE I type in name on card text field
#    And OHE I type in expiration date text field
#    And OHE I type in CVVCode text field
#    #And OHE I select save checkbox
#    And OHE I select submit payment
#    Then OHE I validate the submit payment
#
#
#  @OHElisting @OHE-446 @OHE
#  Scenario: OHE - Buyer able to create a listing
#    Given I login and I go to Dashboard
#    And I validate the My Listings button
#    When I validate add new listing button
#    And I validate listing name text field
#    And I validate listing category
#    And I validate listing description text field
#    And I validate the listing Hourly price
#    And I validate listing image
#    And I validate listing video URL
#    And I select the go to details
#    And I select Subject Tag
#    And I select Work Model checkbox
#    And I select Languages checkbox
#    And I complete Cancellation Text Field
#    And I select Go to Availability button
#    And I select Available Days tab
#    And I select Add Time Slot
#    And I select Publish button
#    Then I validate create a listing
#
#  @OHEdetails @OHE-422 @OHE @bugs
#  Scenario: OHE - Validate Review sector
#    Given I go to the listing details page on OHE
#    When I select the Review button
#    Then I validate Review sector
#
#  @OHE-419 @OHE  @bugs
#  Scenario: OHE - Validate dashboard Customer
#    Given I login and go to Dashboard
#    When I select dashboard customer section
#   #And I select my settings button
#    And I select the see all most popular button
#    Then I validate the Most Popular sector
#
#  @OHE-410 @OHE  @bugs
#  Scenario: OHE - Validate Inbox Messages
#    Given I login
#    When I go to owl home page
#    And I select inbox icon button OHE
#    And I select user message
#    Then I validate inbox sector
#
#  @OHE-454 @OHE  @bugs
#  Scenario: Validate mail in Profile Edit
#    Given I login and go to Dashboard
#    And select Settings button
#    When complete First Name TextField
#    And select Save Changes button
#    Then I validate mail in Profile Edit
#
#  @OHE @OHE-423 @bugs
#  Scenario: Contact Messages BUG
#    Given Admin Reports OHE
#    When I validate Contact Messages
#    Then I validate Contact Messages
#
#  @OHE @OHE-330 @bugs
#  Scenario: OHE - Location MAP
#    Given I login and go to dashboard page
#    When I select My Settings
#    And validate Location sector
#    And complete Enter a Location TextField
#    Then I validate the Location sector MAP

  @MTR @MTR  @bugs @MTR  @MTR-1942
  Scenario: MTR - Item Reviews
    Given I Sign in with new account "email2" and go to the listing page
    When I select an item BUG
    And I select the Reviews button
    And I select Leave a Review Button
    And complete Both Reviews TextFields
    And I go to listing page
    And I select an item BUG
    And I select Reviews sector
    Then I validate Reviews in item page

  @MTR @MTR  @bugs @MTR @MTR-1987
  Scenario: MTR - Browse Listing without Login
    Given I go to listing page
    When I select an item BUG
    Then I validate Browse Listing without Login

  @adminBug  @test @MTR @MTR-2055 @bugs
  Scenario: Admin design page PNG
    Given I login with Gaston User
    And Admin design
    When I validate customize landing page option
    And I select Logo and Favicon
    And I upload PNG example
    Then I validate upload PNG

  @bugs @MTR @MTR-2052
  Scenario: Refresh Cache in Step 6
    Given I login with Gaston User
    And Get started steps
    When I validate step 6 connect domain BUG
    And I see that the step 6 redirect me to Connect Domain
    Then I validate Refresh Cache in Step 6

  @bugs @MTR @MTR-2046
  Scenario: Delete user in Admin Page
    Given I login with Gaston User
    And Get started steps
    When I select Users
    And search name
    And click Select Action button
    And select Delete button
    Then I validate Delete user

  @bugs @MTR @MTR-2029
  Scenario: Validate Listing Price
    Given I login with Gaston User
    And select My Listings button
    And I validate the add new listing button
    And I validate the listing name text field
    And I validate the listing category
    And I validate the listing description text field
    And I validate the listing price
    #And I select Variants button
    #And I select Option 1 tab
   # And select Hello 14
    #And complete Variants TextField
    #And complete Price TextField
    And complete Quantity TextField
    #And I validate the listing quantity
    And I validate the listing image BUG
    And I validate the listing video URL
    And select no Shipping Tab
        #And I validate the shipping with USPS
        #And I validate the shipping with FedEx
        #And I validate the Flat Rate Shipping
        #And I validate the pick up option
    #And I select go to details
    When select Publish button BUG
    And I go to Item
    Then I validate Listing Price

  @bugs @MTR @MTR-2098
  Scenario: User able to see My Listings message
    Given I Sign in with new account "email3" and go to dashboard
    When select My Listings button BUG
    Then I validate My Listings text

  @bugs @MTR @MTR-1887
  Scenario: Validate Social Links
    Given I login with Gaston User
    And Admin design
    When I validate customize landing page option
    And select Social Links sector
    And validate Facebook text
    And validate Twitter text
    And validate Instagram text
    And validate Linkedin text
    And validate Youtube
    Then validate Social Links

  @bugs @MTR @MTR-2147
  Scenario: Validate Image Upload
    Given I login with Gaston User
    And select My Listings button
    And I validate the add new listing button
    And I validate the listing name text field
    And I validate the listing category
    And I validate the listing description text field
    And I validate the listing price
    #And I select Variants button
    #And I select Option 1 tab
    #And select Hello 14
    #And complete Variants TextField
    #And complete Price TextField
    And complete Quantity TextField
    #And I validate the listing quantity
    And I validate the listing image BUG IMAGE
    Then I validate Image Upload

  @bugs @MTR @MTR-2131
  Scenario: MTR - Buyer able to create a listing STAGING BUG
    Given I login with Gaston User
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


  @bugs @ServicesBug
  Scenario: Modify the site from services to product
    Given I go to "https://mtreborn-staging-products.azurewebsites.net/application/Onboarding"
    When I type on name field
    And I type on e-mail field "email3"
    And I type on Phone Number field
    And I type on your Marketplace name field "Test2"
    And i check to accept 'Being contacted for Custom Features that will grow my marketplace 2x faster'
    And I click the button Next
    And I select Service
    And I click the other button Next
#    And I complete the field Full name
#    And I complete the field Email Address
#    And I complete the field Phone Number
    And I complete the field Card number
    And I complete the field name on card
    And I complete the field Expiry Date
    And I complete the field CVC Code
    And I click the button Save payment
    Then I validate that the Services page is created

  @bugs @MTR @MTR-2649
  Scenario: Create Listing - Can't finish listing creation because cropper doesn't pop up
    Given I login with Gaston User
    And select My Listings button
    When I select Add New
    And I validate the listing name text field
    And I validate the listing category
    And I validate the listing description text field
    And I validate the listing price
    And I validate the listing quantity
    And I validate the listing image
    Then I validate Can finish listing creation

  @bugs @MTR @MTR-2650
  Scenario: No Payments - Price not appearing on Listing Details
    Given I login and go to listing page
    When I select an item BUG
    Then I validate Price appearing on Listing Details

  @bugs @MTR @MTR-2384
  Scenario: Inbox - Unable to see messages in Read
    Given I login with Gaston User
    And Select Inbox
    When Select Read section
    Then Validate messages in Read

  @bugs @MTR @MTR-2386
  Scenario: Browse - Listings only show "Seen 0 times"
    Given I login BUG
    When I go to listing page BUG
    Then I validate Seen times

  @bugs @MTR @MTR-2387
  Scenario: Facebook Signup doesn't work
    Given I go to Sign Up Page
    When Select Signup With Facebook
    Then I validate Signup With Facebook

  @bugs @MTR @MTR-2651
  Scenario: No Payments - "Payment" information still showing
    Given I login with Gaston User
    And go to Dashboard
    And select Settings button
    When I select Payment
    Then I validate Payment Information

  @bugs @MTR @MTR-2388
  Scenario: Sign up page - Password shows "Minimum 6 characters" even if it has them
    Given I go to Sign Up Page
    When I type password "Automation@321"
    Then I validate "Minimum 6 characters" message does appear

  @bugs @MTR @MTR-2647
  Scenario: Landing page -Validate Newest Listings images are not blurred
    Given I login BUG
    When I go to listing page BUG
    Then I validate Newest Listings images are not blurred

  @bugs @MTR @MTR-2645
  Scenario: LandingPage - Validate Visual Editor feature is visible
    Given I login with Gaston User
    And I go to Landing Page
    Then I validate the Visual Editor Button is hidden

  @bugs @MTR @MTR-2409
  Scenario: Chrome issue- Templates throws error 404
    Given I login with Gaston User
    Given  go to Admin
    When I select Step 8 Emails
    And select Template Tab
    Then I validate that the 404 error does not exist.

  @MTR @MTR-2858 @bugs
  Scenario: Unable to download purchased downloadable files - blocked by firewall
    Given I login with Gaston User
    And I go to orders page BUGS
    When I select Purchased button in orders
    And I select Download file button
    Then I validate that I can download the file


  @MTR @MTR-2898 @bugs
  Scenario: Error when users try to complete connecting to stripe
    Given I login with another account
    And go to Dashboard
    When I select Settings button
    And I select CaShout button
    And I select Pending button
    Then valid verification form is displayed


  @MTR @MTR-2899 @bugs
  Scenario: It should redirect on respective page as redirects when clicking from another place
    Given I login with Gaston User
    And I go to orders page BUGS
    When I select Purchased button in orders
    And I select See Details button
    And I select See messages button
    Then valid to redirect to the respective page


  @MTR @MTR-3279 @bugs
  Scenario: Browse by Seller/Downloadable Files as Products - Not showing any seller profiles
    Given I login with Gaston User
    And I go to dashboard
    And select My Listings button
    When I validate the add new listing button
    And I add a name text field
    And I validate the listing category
    And I validate the listing description text field
    And I validate the listing price
    And I validate the listing quantity
    And Activate option and add pdf
    And I validate the listing image
    And I select Publish button STAGING
    And I validate create a listing Staging
    And I go to my Listing
    And select my newly created product
    And I log out
    And I login with another account
    And I go to dashboard
    And I will purchase the digital product
    And I select the Go To Secure Checkout button
    And I select the preloaded Credit Card button
    And I select the Submit Payment button
    Then I validate the Submit Payment
    And I go to dashboard
    And I log out
    Given I login with Gaston User
    And I go to orders page BUGS
    And Sold the product
    And Valid that sold the product
    And I log out
    And I login with another account
    And I go to dashboard
    And I go to orders page
    And file selection or download file






