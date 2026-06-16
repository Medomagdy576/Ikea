Feature: Home Page Logo

  Scenario: Verify Homepage Logo Navigation
    Given User open the URL "https://www.ikea.com/eg/en/"
    When The user Navigate to “Decoration”
    And Click on the Logo of the website
    Then Verify user is redirected to HomePage .
