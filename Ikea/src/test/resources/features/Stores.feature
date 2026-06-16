Feature: Stores

  Scenario: Verify Store Locator
    Given The user is on Home page "https://www.ikea.com/eg/en/"
    When The user Click 'Stores' from top menu
    And Select any store from list
    Then Verify store details displayed