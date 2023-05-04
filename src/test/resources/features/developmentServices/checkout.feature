@devServices
Feature: Checkout

  @DownloadableFiles
  Scenario: Hire a Service - With all types of shipments
    Given I login with Gaston User in production services using cookies
    And go to Dashboard Serv
    When go to Browse Services
    And select the required service
    And contract the service
    And complete the form
#    And enter the new Credit Card  TODO: It is necessary to review the flow because it changes per addon.
#    And I select the Submit Payment Button SERV
#    Then valid that can hire the service