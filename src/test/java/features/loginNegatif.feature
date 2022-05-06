Feature: login negative feature
    @DDT
  Scenario Outline: user login negative with scenario

    Given user on login page
    When user enter username invalid <Username>
    And user enter password invalid <Password>
    And user click button login
    Then appear error message <msg>

    Examples:
    | Username      | Password     |          msg                                               |
    |               | secret_sauce |Epic sadface: Username is required                                        |
    |standard_user  |              |Epic sadface: Password is required                                        |
    |               |              |Epic sadface: Username is required                                        |
    |123            |123           |Epic sadface: Username and password do not match any user in this service |
