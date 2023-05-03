Feature: AdminPanel

#Given I login with Gaston User in production products using cookies



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


  @MTR-6
  Scenario: Emails
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    When go to Admin Panel Serv
    And select step 8
    Then validate step 8
    And select Automated Emails section
    And validate Automated Emails section



  @MTR-6
  Scenario: Contact Us
    Given I login with Gaston User in production services using cookies
    And go to home Serv
    When select Contact Us
    And complete the form the Contact Us
    Then valid The complete form














