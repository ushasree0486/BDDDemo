Feature: Login functionality

  Scenario: User logs in successfully

    Given User is on login page
    When user enters username and password
    And click on login button
    Then User is navigated to the home page
