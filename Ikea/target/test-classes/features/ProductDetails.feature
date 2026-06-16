Feature: Product Details Page

  Scenario: Verify that clicking on a product opens the product details page.
    Given the user open the website "https://www.ikea.com/eg/en/"
    When the user clicks on a random product displayed on the home page
    Then the product details page should be opened
    And the product details on the product page should match the product details displayed on the home page