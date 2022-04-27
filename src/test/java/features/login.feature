Feature: login feature

  Scenario: user login valid credentials

    Given user on login page
    When user input valid username
    And user input valid password
    And user click button login
    Then user is navigated in homepage

    @DDT
  Scenario Outline: user login with scenario

    Given user on login page
    When user enter <Username> username
    And user enter <Password> password
    And user click button login
    Then user is navigated in homepage

    Examples:
    | Username               | Password     |
    | standard_user          | secret_sauce |
##    | locked_out_user        | secret_sauce |
##    | problem_user           | secret_sauce |