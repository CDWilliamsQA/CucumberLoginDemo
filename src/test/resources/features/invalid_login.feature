Feature: Invalid Login Attempts

  Scenario Outline: User cannot log in with invalid credentials
    Given the user is on the login page
    When the user enters username "<username>" and password "<password>"
    And clicks the login button
    Then an error message "<message>" should be displayed

    Examples:
      | username   | password   | message                  |
      | wrongUser  | pass123    | Invalid username or password |
      | admin      | wrongPass  | Invalid username or password |
      | blankUser  | blankPass  | Please enter credentials     |
