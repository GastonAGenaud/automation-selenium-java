@todos
Feature: Home

  Principal Page

  @home @smoke  @MTR-1436 @MTR
  Scenario: MTR - Validate the home header
    Given I go to home page
    When I validate the Browse button
    And I validate the Browse Request button
    And I validate the Log in button
    And I validate the sing up button
    And I validate the Browse by seller button
    Then I validate the main header

  @home @smoke  @MTR-1437 @MTR
  Scenario: MTR - Validate the home - Category Menu
    Given I go to home page
    When I validate the accessories section
    #And I validate the More Accessories Button
    And I validate the Men's button
    #And I validate the more Men's section
    And I validate the clothing section
    #And I validate the more clothing button
    #And I validate the Home & Living section
    #And I validate the More Home And Living Button
    And I validate the Jewelry section
    #And I validate the More Jewelry Button
    And I validate the Shoes section
    #And I validate the more Shoes button
    And I validate the outdoor staff section
    #And I validate the more outdoor staff section
    #And I validate the hottest items button
    #And I validate the more hottest items section
    And I validate the art and collectables section
    And I validate Rugs button
    #And I validate the more Rugs section
    #And I validate the More art and collectables button
    #And I validate the More section
    Then I validate the main header


  @home @smoke  @MTR-1438 @MTR
  Scenario: MTR - Validate the home - Body Section
    Given I go to home page
#    And I validate the Start Now button
    And I validate the For Buyers Header section
    And I validate the For Sellers section
    Then I validate the Body

  @home @smoke  @MTR-1439 @MTR
  Scenario: MTR - Validate the home - Footer Section
    Given I go to home page
    When I validate the Sing up now button
    And I validate the sell button
    And I validate the Browse Listing button
    And I validate the Browse Request
    And I validate the Log in button
    And I validate the sing up button
    And I validate the FAQ button
    And I validate the Terms and Service button
    And I validate the Privacy Policy button
    And I validate the About Us button
    And I validate the Contact Us button
    Then I validate the Footer Section

  #@home @smoke  @MTR-1440 @MTR
  # Scenario: MTR - Validate the home - social links
  #  Given I go to home page
  #  When I validate the Facebook icon
  #  And I validate the Instagram icon
  #  And I validate the Linkedin icon
  #  And I validate the Twitter icon
   # And I validate the Youtube icon
  #  Then I validate the social links

  @home @smoke  @MTR-1441 @MTR
  Scenario: MTR - Validate the home header with account
    Given I go to Home With Account
    When I validate the Browse button
    And I validate the Browse Request button
    And I validate the Browse by seller button
    Then I validate the main header

  @home @smoke  @MTR-1442 @MTR
  Scenario: MTR - Validate the home Header Section with account
    Given I go to Home With Account
    When I validate the accessories section
    And I validate the More Accessories Button
    #And I validate the clothing section
    #And I validate the more clothing button
    #And I validate the Home & Living section
    #And I validate the More Home And Living Button
    And I validate the Jewelry section
    And I validate the More Jewelry Button
    #And I validate the Shoes section
    #And I validate the more Shoes button
    And I validate the outdoor staff section
    And I validate the more outdoor staff section
    And I validate the art and collectables section
    And I validate the More art and collectables button
    #And I validate the More section
    Then I validate the Header Section with account

  @home @smoke  @MTR-1443 @MTR
  Scenario: MTR - Validate the home - body section with account
    Given I login with Gaston User
    #And I validate the Start Now button
    And I validate the For Buyers Header section
    And I validate the For Sellers section
    Then I validate the Body with account

  @home @smoke  @MTR-1444 @MTR
  Scenario: MTR - Validate the home Footer Section With Account
    Given I login with Gaston User
    When I validate the sell button
    And I validate the Browse Listing button
    And I validate the Browse Request
    And I validate the FAQ button
    And I validate the Terms and Service button
    And I validate the Privacy Policy button
    And I validate the About Us button
    And I validate the Contact Us button
    Then I validate the footer with accounts




  #@home @smoke  @MTR-1445 @MTR
  # Scenario: MTR - Validate the home Social Links with account
   # Given I go to Home With Account
  #  When I validate the Facebook icon
  #  And I validate the Instagram icon
   # And I validate the Linkedin icon
  #  And I validate the Twitter icon
  #  And I validate the Youtube icon
  #  Then I validate the social links section with account