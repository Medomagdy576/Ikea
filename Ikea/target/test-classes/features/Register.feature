Feature: User Registration

  Scenario: Verify that a new user can register successfully.
    Given User is on home page
    And the user navigates to the "Create Account" page
    When the user enters valid registration data
    And clicks the "Register" button
    Then the user account should be created successfully


