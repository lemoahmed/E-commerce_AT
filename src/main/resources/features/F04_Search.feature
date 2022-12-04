@smoke
Feature: user can search by item name or sku
  Scenario Outline: user can search by name
    Given user enter "<keyword>" in search
    And press enter
    Then  items with the "<keyword>" appear
    Examples:
      | keyword |
      | book |
      | laptop |
      | nike |


  Scenario: user can search by sku
      Given user enter "SCI_FAITH" in search
      And press enter
      And clicks on the item
      Then  item should have the same "SCI_FAITH"

