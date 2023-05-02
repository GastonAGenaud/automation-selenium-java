Feature: AdminPanel

#Given I login with Gaston User in production products using cookies











  @MTR-6
  Scenario: Hire a Service - With all types of shipments
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    When go to Browse Services
    And select the required service
    And contract the service
    And complete the form
    And enter the new Credit Card
    And I select the Submit Payment Button SERV
    Then valid that can hire the service


  @MTR-66
  Scenario: Create a Want


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


  @MTR-6666
  Scenario: Emails
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    When go to Admin Panel Serv
    And
















