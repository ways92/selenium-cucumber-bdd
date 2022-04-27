Feature: check out product

  Scenario: user check out product

    Given user on login page
    When user input valid username
    When user input valid password
    When user click button login
    When user click add to cart
    Then user see cart list
    When user click checkout
    When user input first name , last name, and postal code
    When user click continue
    Then user see product will checkout
    When user click finish
    Then user see pony express