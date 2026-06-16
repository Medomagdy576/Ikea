Feature: Payments

  Scenario: Verify Order Requires Payment details
    Given User is on Home page "https://www.ikea.com/eg/en/"
    When User Search for a random product and add it to the bag
    And the user clicks on Checkout
    And the user fills in the billing address with valid data
    And the user selects an available delivery date and time
    And the user chooses a payment method
    And the user stops before confirming payment
    Then the user should see that payment details are required to complete the order