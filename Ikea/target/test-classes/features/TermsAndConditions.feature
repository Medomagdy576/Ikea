Feature: Terms and conditions

  Scenario: Verify Footer Links Navigation
    Given User is on home Page "https://www.ikea.com/eg/en/"
    When User Scroll to footer section
    And Click on 'Terms and conditions' link
    Then Verify page title contains 'Terms and conditions'
