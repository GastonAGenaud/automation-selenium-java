@MTR-1581
Feature: Orders

  Orders page

  @orders  @MTR @MTR-1446
  Scenario: MTR - Orders - Sold - Open Section
    Given I login with Gaston User
    And I go to orders page
    When I validate sold orders details
    And I validate send message to buyer
    Then I validate the sold open section

  @orders  @MTR  @MTR-1447
  Scenario: MTR - Orders - Sold - shipped orders
    Given I login with Gaston User
    And I go to orders page
    When I validate the cancel button
    Then I validate the shipping orders section

#  @orders  @MTR  @MTR-1448
#  Scenario: MTR - Orders - Purchased - Open Section
#    Given I go to orders page
#    When I validate purchased orders details
#    And I validate send message to seller
#    Then I validate the purchased open section

  @orders  @MTR  @MTR-1449
  Scenario: MTR - Orders - Purchased - shipped orders
    And I login with another account
    And I go to dashboard
    And I go to orders page BUGS
    When I validate the track button
    And I validate the buy again button
    And I validate the share button
    And I validate the request refund button
    Then I validate the purchased shipped orders section

  @orders  @MTR  @MTR-1450
  Scenario: MTR - Orders - Purchased - pickup orders
    And I login with another account
    And I go to dashboard
    And I go to orders page BUGS
    #And I validate the confirm pick up button
    And I validate the leave a review button
    And I validate the buy again button in completed status
    And I validate the share button in complete status
    And I validate the request refund button in complete status
    Then I validate the purchased shipped orders section

  @orders  @MTR  @MTR-1451
  Scenario: MTR - Orders - Show Menu
    Given I login with Gaston User
    And I go to orders page
    And I select the show menu button
    Then I validate the show menu