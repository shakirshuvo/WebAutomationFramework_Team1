Feature: Amazon Search Box




  Scenario: search box functionality check
    Given I am at Amazon HomePage
    And I enter Hand Sanitizer in search box
    When I click search button
    Then I verify Hand Sanitizer
    And I verify page title as Hand Sanitizer


#  Scenario: search box functionality check
#    Given I am at Amazon HomePage
#    And I enter Hand Sanitizer in search box
#    When I click search button
#    Then I verify Hand Sanitizer
#    And I verify page title as Hand Sanitizer

