@Cart
Feature: Cart
  As a user i want open a filter cart
  Scenario: User filter filter cart
    Given User open the website sauce demo
    When User input "standard_user" as a userName "secret_sauce" as a password
    Then User already on home page
    When User filter list  product by "Name (Z to A)"
    And User click item "Sauce Labs Onesie"
    And User click item "Test.allTheThings() T-Shirt (Red)"
    And User click filter cart
    And User see "Sauce Labs Onesie" in the cart
    And User see "Test.allTheThings() T-Shirt (Red)" in the cart
    Then User remove "Sauce Labs Onesie" in the cart
