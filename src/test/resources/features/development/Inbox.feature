@ENV
Feature: Development Inbox

  @sendMessageMedia
  Scenario: Send messages to users, including media
    Given I login with Gaston User in development products using cookies
    And I select browse requests PROD
    When select an item
    And select Send Message
    And complete Message TextField
    And select Send Message Button
    And it redirects me to the Chat Page
    And select clip to send media
    And select send
    Then I validate Send Message to users, including media

  @ReadUnread
  Scenario: Unread
    Given I login with Gaston User in development products using cookies
    And go to dashboard
    When select Inbox
    And select Unread
    Then Validate Unread sector

  @ReadUnread
  Scenario: Read
    Given I login with Gaston User in development products using cookies
    And go to dashboard
    When select Inbox
    And select read
    Then Validate read sector

