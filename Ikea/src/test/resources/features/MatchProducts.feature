Feature: Match Products

  Scenario: Verify Product Details Match in Category Page & Product Page
    Given The User is on home page " https://www.ikea.com/eg/en/"
    When The user navigate to any category
    And Note the title and price of a product from the category listing page.
    And Click on the same product to open its details page
    Then Compare the product title and price with the listing page values