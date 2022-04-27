Feature: add to cart

  Scenario: user add product to cart

    Given user on login page
    When user input valid username
    And user input valid password
    And user click button login
    And user click add to cart
    Then user see cart list