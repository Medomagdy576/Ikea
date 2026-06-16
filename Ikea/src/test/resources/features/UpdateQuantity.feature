Feature: Update Quantity

  Scenario: Verify Adding and Updating Quantity in Cart
    Given open the URL "https://www.ikea.com/eg/en/"
    When The user Search for 'Chair'
    And Add one product to the cart
    And In cart, update quantity from 1 → 3
    Then Verify subtotal = unit price × 3