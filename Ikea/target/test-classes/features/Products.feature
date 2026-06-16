Feature: Product Search

  Scenario: Search bar returns relevant product results
    Given the user on the website "https://www.ikea.com/eg/en/"
    When the user enters a product keyword into the search bar
    And clicks the search icon
    Then the search results should display products related to the entered keyword