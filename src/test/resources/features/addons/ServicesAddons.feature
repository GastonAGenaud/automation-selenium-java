#Feature: addons
#
#  @MMRS-342 @MMRS  @AddonsSVC
#  Scenario: SVC - Create an Add-on
#    Given SVC - I login and go to addons page
#    When SVC - I select Add add on button
#    And SVC - I select the type of services
#    And SVC - I type in the Title text field
#    And SVC - I type in the description text field
#    And SVC - I type in the stripe productId text field
#    And SVC - I type video URL
#    And SVC - I load an image
#    And SVC - I select the save Button
#    Then SVC - I validate create an addon
#
#  @MMRS-343 @MMRS @AddonsSVC
#  Scenario: Edit an Add-on
#    Given SVC - I login and go to addons page
#    When SVC - I select edit button in Addons
#    And SVC - I select Other type of services
#    And SVC - I type in the edit Title text field
#    And SVC - I type in the edit description text field
#    And SVC - I type in the edit stripe productId
#    And SVC - I type in the edit video URl
#    And SVC - I load an image
#    And SVC - I select the save Button
#    Then SVC - I validate the Edit
#
#  @MMRS-344 @MMRS @AddonsSVC
#  Scenario: Eliminate an Add-on
#    Given SVC - I login and go to addons page
#    When SVC - I select delete Button
#    Then SVC - I validate the Delete addon
#
#  @MMRS-345 @MMRS @AddonsSVC
#  Scenario: Create a second Add-On
#    Given SVC - I login and go to addons page
#    When SVC - I select Add add on button
#    And SVC - I select the second type of services
#    And SVC - I type in the Title text field
#    And SVC - I type in the description text field
#    And SVC - I type in the stripe productId text field
#    And SVC - I type video URL
#    And SVC - I load an image
#    And SVC - I select the save Button
#    And SVC - I select delete Button
#    Then SVC - I validate create an addon
#
#  @MMRS-346 @MMRS @AddonsSVC
#  Scenario: Create a third Add-On
#    Given SVC - I login and go to addons page
#    When SVC - I select Add add on button
#    And SVC - I select the third type of services
#    And SVC - I type in the Title text field
#    And SVC - I type in the description text field
#    And SVC - I type in the stripe productId text field
#    And SVC - I type video URL
#    And SVC - I load an image
#    And SVC - I select the save Button
#    And SVC - I select delete Button
#    Then SVC - I validate create an addon