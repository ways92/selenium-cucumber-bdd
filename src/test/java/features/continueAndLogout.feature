Feature: continue and logout

  Scenario: user continue shopping and logout

    Given user on login page
    When user input valid username
    And user input valid password
    And user click button login
    And user click add to cart
    And user click continue on cart page
    Then user on inventory page
    When user click button logout
    Then user navigated login page