@devServices
Feature: RequestAQuote

   #no se puede crear el request
  Scenario: Request a quote/Make an Offer
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    When go to Browse Request Serv
    And i select the request
    And i select apply
    And complete the form Serv
    Then valid Request a quote