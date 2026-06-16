Feature: Multiple Favorites

  Scenario: Verify Adding Multiple Favorites in Session
    Given The User Opens the URL "https://www.ikea.com/eg/en/"
    When The user Add 3 random products to favorites
    And Navigate to Favorites page
    Then Verify all 3 products are listed
    When Remove 1 product from favorites
    Then Verify remaining 2 are still listed
