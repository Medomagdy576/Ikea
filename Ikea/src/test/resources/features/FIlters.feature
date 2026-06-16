Feature: Filters

  Scenario: Verify Multiple Filter Combination
    Given The User is on Home Page "https://www.ikea.com/eg/en/"
    When The user Navigate to ' Beds ' category
    And Apply filter "Material: Wood" and "Price: 10,000 - 19,999 EGP"
    Then Verify displayed products match both filters