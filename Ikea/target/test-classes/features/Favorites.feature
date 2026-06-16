Feature: Favorites

  Scenario: Verify Favorites Persistence in Session
    Given The User is on home Page " https://www.ikea.com/eg/en/"
    When The user pick a product and Click on Add to Favorite.
    And Navigate to another page
    And Return to Favorite Page
    Then Verify that the previously added product is still displayed
    When Remove the product from favorites.
    Then Verify it no longer appears in the Favorites list.