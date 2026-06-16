Feature: Contact Us

  Scenario: Verify Contact Us Page
    Given Open the URL "https://www.ikea.com/eg/en/"
    When The user Scroll to footer
    And Click on 'Contact Us'
    Then Verify Contact Us page loads with contact options