Feature: add and then remove

  Scenario: user add and remove product to cart

    Given user on login page
    When user input valid username
    And user input valid password
    And user click button login
    And user click add to cart
    And user click remove
    Then user don't see in cart list