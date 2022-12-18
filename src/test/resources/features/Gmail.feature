@gmail
Feature: Gmail
  Implementation of the fist flow proposed

  Scenario: Validate success login
    Given Navigate to "https://accounts.google.com/signin/v2/identifier?hl=en-US&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin" page
    When Login using "valid" credentials
    Then Verify success login by user profile icon

  Scenario: Validate wrong login with incorrect password
    Given Navigate to "https://accounts.google.com/signin/v2/identifier?hl=en-US&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin" page
    When Login using "invalid password" credentials
    Then Verify incorrect login message "Wrong password. Try again or click Forgot password to reset it."

  Scenario: Validate invalid gmail account
    Given Navigate to "https://accounts.google.com/signin/v2/identifier?hl=en-US&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin" page
    When Login using "invalid domain" credentials
    Then Verify incorrect login message "Enter a valid email or phone number"

  Scenario: Validate account not found message
    Given Navigate to "https://accounts.google.com/signin/v2/identifier?hl=en-US&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin" page
    When Login using "random" credentials
    Then Verify incorrect login message 'Couldn’t find your Google Account'
