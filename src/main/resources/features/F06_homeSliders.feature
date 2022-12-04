@smoke
Feature: Home sliders are clickable
  Scenario: First slider is clickable on home page
    Given user clicks on first slider
    Then page "https://demo.nopcommerce.com/nokia-lumia-1020" should open

  Scenario: Second slider is clickable on home page
    Given user clicks on second slider
    Then page "https://demo.nopcommerce.com/iphone-6" should open