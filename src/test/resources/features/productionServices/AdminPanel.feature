Feature: AdminPanel

#Given I login with Gaston User in production products using cookies
  @MTR-1111
  Scenario: Login
    Given I go login page PROD
    When Login title valid
    And valid Login with Facebook
    And valid Login with Google
    And I login with Gaston User in production services using cookies
    Then valid session login

  @MTR-2222
  Scenario: Sign Up
    Given I go to Sign Up PROD
    When Sign Up title valid
    And valid Login with Facebook
    And valid Login with Google
    And I Validate the E-mail text field
    And I validate the Username Text Field
    And I validate the Password Text Field
    And I Sign in with new account "email2" PROD
    Then valid session Sign Up

  @MTR-6
  Scenario: Forgot Password
    Given I go login page PROD
    When go to forgot your Password
    And enter the e-mail to recover the password
    Then Valid that An email has been sent to reset the password.

  @MTR-6
  Scenario: Create a Service
    Given I login with Gaston User in production services using cookies
    And go to Dashboard ServProd
    When select My Listings button Serv Prod
    And add New Listing
    Then I validate create a listing Staging

  @MTR-6
  Scenario: Settings/ Connect to Stripe
    Given I login with Gaston User in production services using cookies
    And go to Dashboard ServProd
    When go to Settings Serv Prod
    And go to Cashout
    Then valid than connect to Stripe

  @MTR-6
  Scenario: Settings/ Fill in profile information and save
    Given I login with Gaston User in production services using cookies
    And go to Dashboard ServProd
    When go to Settings Serv Prod
    And enter profile information
    Then valid to save profile information


  @MTR-6
  Scenario: Hire a Service - With all types of shipments
    Given I login with Gaston User in production services using cookies
    And go to Dashboard ServProd
    When go to Browse Services
    And select the required service
    And contract the service
    And complete the form
    And enter the new Credit Card
    And I select the Submit Payment Button SERV
    Then valid that can hire the service

  @MTR-66
  Scenario: Orders view: Accept an order/ Reject an order/ Refund an order

  @MTR-66
  Scenario: Send messages to users, including media (photos)
    Given I login with Gaston10 User Verified in production services using cookies
    And go to Dashboard ServProd
    When go to the message section
    And I send message
    Then valid that send messages

  @MTR-66 #no se puede crear el request
  Scenario: Request a quote/Make an Offer
    Given I login with Gaston User in production services using cookies
    And go to Dashboard ServProd
    When go to Browse Request ServProd
    And i select the request
    And i select apply
    And complete the form ServProd
    Then valid Request a quote

  @MTR-66
  Scenario: Create a Want


  @MTR-5
  Scenario: Browse Listings/Browse Expert (Category)
    Given I login with Gaston User in production services using cookies
    And go to Listing Page ServProd
    When select Graphics & Design
    And select Marketing
    And select Programming & Tech
    And select Testing Category
    And select Software
    And select Techonology
    And select Photography
    And select Business
    And select Show more
    Then I validate Filters ServProd

  @MTR-66
  Scenario: Browse Listings/Browse Expert (Category)
    Given I login with Gaston User in production services using cookies
    And go to Listing Page ServProd
    When select filter colors
    Then valid color filter


    @AdminDesignTestProd
  Scenario: Admin design page
    Given PSVC I go to Admin design
    When PSVC I validate customize landing page option
    And PSVC I validate customize menu option
    And PSVC I validate customize login page option
    And PSVC I validate customize sign up page option
    #And PSVC I validate customize contact us page option
    #And PSVC I validate customize about us page option
    #And PSVC I validate customize FAQ page option
    And PSVC I validate customize Terms & conditions page option
    #And PSVC I validate customize Privacy Policy page option
    Then PSVC I validate Admin Design
  @MTR-66
  Scenario: Browse Listings/Browse Expert (Work Model)
    Given I login with Gaston User in production services using cookies
    And go to Listing Page ServProd
    When select Video Conference
    And select in-Person
    Then I validate Work Model Section


  @MTR-66
  Scenario: Browse Listings/Browse Expert (Price)
    Given I login with Gaston User in production services using cookies
    And go to Listing Page ServProd
    When complete price numbers TextFields in Set up Manually ServProd
    And select Apply button ServProd
    Then I validate Price filter ServProd

  @MTR-66
  Scenario: Browse Listings/Browse Expert (Location)
    Given I login with Gaston User in production services using cookies
    And go to Listing Page ServProd
    When  complete Location TextField ServProd
    Then I validate Location ServProd

  @MTR-6
  Scenario: Browse Listings/Browse Request (category)
    Given I login with Gaston User in production services using cookies
    And go to Browse Request ServProd
    When select Graphics & Design
    And select Marketing
    And select Programming & Tech
    And select Testing Category
    And select Software
    And select Techonology
    And select Photography
    And select Business
    And select Show more
    Then I validate Filters ServProd


  @MTR-6
  Scenario: Browse Listings/Browse Request (Price)
    Given I login with Gaston User in production services using cookies
    And go to Browse Request ServProd
    When complete price numbers TextFields in Set up Manually ServProd
    And select Apply ServProd
    Then I validate Price filter in section Browse Request ServProd

  @MTR-6
  Scenario: Browse Listings/Browse Request (Location)
    Given I login with Gaston User in production services using cookies
    And go to Browse Request ServProd
    When  complete Location TextField ServProd
    Then I validate Location ServProd

  @MTR-6
  Scenario: Browse Listings/Browse by Seller (Category)
    Given I login with Gaston User in production services using cookies
    And go to Browse by Seller ServProd
    When select Graphics & Design
    And select Marketing
    And select Programming & Tech
    And select Testing Category
    And select Software
    And select Techonology
    And select Photography
    And select Business
    And select Show more
    Then I validate Filters ServProd


  @MTR-66
  Scenario: Browse Listings/Browse by Seller (Location)
    Given I login with Gaston User in production services using cookies
    And go to Browse by Seller ServProd
    When  complete Location TextField ServProd
    Then I validate Location ServProd

  @MTR-6
  Scenario: Listing/Service Details
    Given I login with Gaston User in production services using cookies
    And go to Dashboard ServProd
    And DEV I validate the My Listings button
    When DEV I validate add new listing button
    And I validate listing name text field ServProd
    And I validate listing category ServProd
    And I validate listing Work ModelServProd
    And I validate listing description text field ServProd
    And I validate the listing Price ServProd
    And I validate listing image ServProd
    And I validate listing video URL ServProd
    And Go to details Section ServProd
    And I validate Custom fields
    And Go to Availability ServProd
    And I validate Set available days
    Then I validate Create a Listing ServProd

  @MTR-6666
  Scenario: Browse Listings Details
    Given I login with Gaston User in production services using cookies
    And go to Dashboard ServProd
    When go to Listing Page ServProd
    Then valid select Block
    And valid select List
    And valid select Map
    And valid select Search
