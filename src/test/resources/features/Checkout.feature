@Checkout
Feature: Sales
  As a user i want purchase one item from list product
  Scenario: User filter product list
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
    When User click button checkout
    And User input "Binti" as a first name "Nayla" as a last name "1234" As a zip
    And User click button continue
    And User Check "summary_subtotal_label" with price "15.99"
    And User Check "summary_tax_label" with price "1.28"
    And User Check "summary_info_label summary_total_label" with price "17.27"
    And User click button finish
    Then User see "Thank you for your order!" in the page
