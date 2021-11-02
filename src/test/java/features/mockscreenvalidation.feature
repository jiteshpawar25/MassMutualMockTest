Feature: Mock screen Validation

  @Test
  Scenario Outline: Multiple field Validation on Mock screen

    Given User is on exercise of the application
    When User navigates to Value page
    Then Verify right count of values appear on the screen
    Then Verify values on the screen are greater than 0
    Then verify Total balance field value is sum of all the values
    Then verify the values of all the fields are formatted as currency.
    Examples:
      |  |
