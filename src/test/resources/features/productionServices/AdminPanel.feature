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

  @MTR-6666
  Scenario: Request a quote/Make an Offer
    Given I login with Gaston User in production services using cookies
    And go to Dashboard ServProd
    When go to Browse Request ServProd
    And i select the request
    And i select apply
    And complete the form ServProd
    Then valid Request a quote


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




