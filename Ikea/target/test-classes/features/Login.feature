Feature: User Login

  Scenario: Existing user can log in successfully
    Given the user has already created an account
    And the user opens the website "https://www.ikea.com/eg/en/"
    When the user clicks the "Login/Signup" button
    And enters a valid email and password (the same credentials used during registration)
    And clicks the login button
    Then the user should be logged in successfully