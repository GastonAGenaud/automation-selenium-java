Feature: Gmail
  Implementation of the fist flow proposed

  @gmail
  Scenario: Validate success login
    Given Navigate to "https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser&hl=en-US" page
    When Login using "valid" credentials
    Then Verify success login by user profile icon

  @gmail
  Scenario: Validate wrong login with incorrect password
    Given Navigate to "https://accounts.google.com/signin/v2/identifier?hl=en-US&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin" page
    When Login using "invalid password" credentials
    Then Verify incorrect login message "Wrong password. Try again or click Forgot password to reset it."

  @gmail
  Scenario: Validate invalid gmail account
    Given Navigate to "https://accounts.google.com/signin/v2/identifier?hl=en-US&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin" page
    When Login using "invalid domain" credentials
    Then Verify incorrect login message "Enter a valid email or phone number"

  @gmail
  Scenario: Validate account not found message
    Given Navigate to "https://accounts.google.com/signin/v2/identifier?hl=en-US&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin" page
    When Login using "random" credentials
    Then Verify incorrect login message 'Couldn’t find your Google Account'

  @gmail
  Scenario: Sign in to the Google home page
    Given I want to access the Google Home Page
    When I make a GET request to the URL "https://www.google.com"
    Then the status of the response should be 200 OK