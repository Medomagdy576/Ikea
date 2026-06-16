Feature: Sort from Low To High

  Scenario: Verify Filtering by Category
    Given User is on Home Page "https://www.ikea.com/eg/en/"
    When User Search for 'Living room'
    And User get first product price before sort
    And Apply filter 'Price: Low to High'
    And User get first product price after sort
    Then Verify products sorted correctly
