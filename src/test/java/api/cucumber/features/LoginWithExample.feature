Feature: Login action

  Scenario Outline: Successful Login with Valid Credentials

    Given Use is on Home page
    When User Navigate to Login Page
    And User enters "<username>" and "<password>":
    Then Message displayed Login Successfully
    Examples:
      | username               | password     |
      | standard_user          | secret_sauce |
      | lockedout_user         | secret_sauce |
      | problem_user           | secret_sauce |
      | performanceglitch_user |secret_sauce  |