@smoke
Feature: user can add item to wishlist and check if add

  Scenario: add item to wishlist
    Given user clicks on wishlist icon
    Then The product has been added to your wishlist message appear with green background color

  Scenario: check wishlist items
    Given user clicks on wishlist icon
    Then The product has been added to your wishlist message appear with green background color
    When user go to wishlist page
    Then Qty value should be greater than 0

