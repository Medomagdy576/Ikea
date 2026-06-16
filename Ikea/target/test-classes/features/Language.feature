Feature: Transfer Language

  Scenario: Verify Language Switch
    Given The User is on Home page "https://www.ikea.com/eg/en/"
    When User Locate language selector
    And Switch from English to Arabic
    Then verify page content is in Arabic