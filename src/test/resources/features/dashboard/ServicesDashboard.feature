Feature:Services Dashboard

  @MMRS-347 @MMRS  @MMRSDashboard
  Scenario: SVC - Validate dashboard Customer
    Given  SVC I login and go to Dashboard
    When SVC I select dashboard customer section
    #And I select my settings button
    And SVC I select the see all most popular button
    And SVC I select the see all my orders button
    And SVC I select the go to my calendar button
    And SVC I select the see all messages button
#    And SVC I select create a want button
    Then SVC I validate the customer dashboard

  @MMRS-348 @MMRS  @MMRSDashboard
  Scenario: SVC - Validate dashboard Provider
    Given SVC I login and go to Dashboard
    When SVC I select dashboard provider section
    And SVC I select see all latest reviews button
    #And I select invite people button
    And SVC I select see all my sales button
    And SVC I select create a new listing button
    And SVC I select see all messages button
    And SVC I select go to my calendar button in provider
    Then SVC I validate provider dashboard