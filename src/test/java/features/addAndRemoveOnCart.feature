Feature: add and then remove on cart page

  Scenario: user add and remove product on cart page

    Given user on login page
    When user input valid username
    And user input valid password
    And user click button login
    And user click add to cart
    And user click remove on cart page
    Then user don't see product on cart page