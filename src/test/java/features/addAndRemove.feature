Feature: add and then remove

  Scenario: user add and remove product on inventory page

    Given user on login page
    When user input valid username
    And user input valid password
    And user click button login
    And user click add to cart
    And user click remove
    Then user don't see button remove on product