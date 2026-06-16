Feature: Add Product To Favourite

  Scenario: Verify Add to Favorite Functionality
    Given User is on home page "https://www.ikea.com/eg/en/"
    When User Add random product to favorite
    And Click 'View' to open Favorite page
    Then Ensure product is displayed
    And Remove product from favorites