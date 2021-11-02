@mock
Feature: mock Functionality

  @JP
  Scenario Outline: Verify field validation on Mock page
    Given User is on exercise of the application
    When User navigates to Value page
    Then Verify right count of values appear on the screen
    Then Verify values on the screen are greater than 0
    Then Verify Total balance field value is sum of all the values
    Then Verify the values of all the fields are formatted as currency
    Examples:
      |  |  |
      |   |    |

















    #  @Test
#   Scenario Outline: Verify error message on invalid user user login
#     Given User is on Homepage of the application
#