Feature: Add To Cart Product

  Scenario: Verify that a product can be added to the shopping cart
    Given User is on Home Page
    When User click on the "Lighting" category
    And User navigate to "Lamps" subcategory
    And User select a random product and add it to the bag
    And User open the same product page
    And User add the product to the bag again
    And User open the shopping cart
    Then the quantity of the product in the cart should be 2