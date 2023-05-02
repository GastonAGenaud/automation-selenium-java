Feature: Messages


  @MTR-66
  Scenario: Send messages to users, including media (photos)
    Given I login with Gaston10 User Verified in production services using cookies
    And go to Dashboard Serv
    When go to the message section
    And I send message
    Then valid that send messages