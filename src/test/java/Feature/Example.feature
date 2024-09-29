@SmokeTest
Feature: Parallel browser execution

  Scenario Outline: Launch multiple browsers and perform an action
    Given I launch "<browser>" browser
    When I navigate to the home page
    Then I verify the page title is displayed
    Then user click order online now
    And user click enter address and enter pinCode and select first suggestion
    And user goes to veg pizza section to add "primavera Gourmet Pizza" as quantity 2
    And user want to add 2 "Margherita" and 2 "Peppy Paneer" pizzas to my cart
    And user goes to beverages section and select "pepsi 475ml" with quantity 12
    Then user verifies the Sum of Each Product quantities and their amount
    And user goes to the veg section in  removing "Margherita" pizza with quantity 1
    And user goes to the beverages section and removing "pepsi 475ml" with quantity 6
    Then user verifies Cart Subtotal Value with Sum of Each Product Value and quantity after removing products
    And user Get Sub Total Value & Click Check Out
    Then user verifies the Subtotal Checkout With Subtotal Place Order Price Details

    Examples:
      | browser |
      | chrome  |
      | firefox |
      | Edge    |
