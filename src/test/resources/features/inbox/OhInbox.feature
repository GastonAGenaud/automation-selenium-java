
 Feature: OhInbox

   @testingInbox
   Scenario: User able to enter a chat
     Given I login and I go to Dashboard
     And I select Inbox sector
     When I select a chat
     And I type in the chat Text Field
     And Select Send button
     Then I validate enter a chat

   @testingInbox
   Scenario: User able to search a chat
     Given I login and I go to Dashboard
     And I select Inbox sector
     When I type in the search TextField
     And I select a chat
     Then I validate search a chat