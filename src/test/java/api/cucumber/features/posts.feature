Feature: Post feature of facebook
  This will test the post functionality at the user wall

  Scenario:Post a message on user wall
    Given User should be logged in and should be present on his wall
    When I type the message in the box
    And Click on post button
    Then the message should get posted

  Scenario: Post video on user wall
    Given User should be logged in and should be present on his wall
    When User supply the youtube link in the text box
    And Click on post button
    Then Then video should get posted on the user wall
    And the video should have proper thumbnail