@devServices
Feature: AdminPanel

#Given I login with Gaston User in production products using cookies

  Scenario: Create a Want


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

  Scenario: Emails
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    When go to Admin Panel Serv
    And select step 8
    Then validate step 8
    And select Automated Emails section
    And validate Automated Emails section

  Scenario: Contact Us
    Given I login with Gaston User in production services using cookies
    And go to home Serv
    When select Contact Us
    And complete the form the Contact Us
    Then valid The complete form



  Scenario: Admin Panel - Users - Actions
    Given I login with Gaston User in production services using cookies
    And go to Admin Panel Serv
    When I select Users tab Serv
    And Select Action button
    And select Impersonate Button
    Then I validate action sector in Admin panel - Users


  Scenario: Admin Panel - Users - Search filter
    Given I login with Gaston User in production services using cookies
    And go to Admin Panel Serv
    When I select Users tab Serv
    And complete search filter Serv
    And select Filter button
    Then I validate Filter sector in Admin panel - Users Serv

    @testAdminPanelSettings
  Scenario: Admin Panel - Settings
    Given I login with Gaston User in production services using cookies
    And go to Admin Panel Serv
    Then I validate redirection to Site Wording Serv
    And I validate elements in Site Wording Serv
    And I validate redirection to Company Info Serv
    And validate elements in Company Info Serv
    And I validate redirection to Payment Info Serv
    And validate elements in Payment Info Serv
    And I validate redirection to Site MetaTags Serv
    And validate elements in Site MetaTags Serv
    And I validate redirection to Requests Setup Serv
    And validate elements in Requests Setup Serv
    And I validate redirection to Browse config Serv
    And validate elements in Browse config Serv
    And I validate redirection to SMS Settings Serv
    And validate elements in SMS Settings Serv
    And I validate redirection to Orders Setup Serv
    And validate elements in Orders Setup Serv







