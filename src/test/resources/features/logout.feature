Feature: Logout functionality

  Scenario: Successful logout after login
    Given the user is logged into the application
    When the user clicks the logout button
    Then the user should be redirected to the login page
    And a logout confirmation message should be displayed
