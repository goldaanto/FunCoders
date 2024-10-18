Feature: feature to test DsAlgo logim page


Scenario: Test the Registration Page
  
    Given I go to the Registration page
    When user enters the username, password and confirm password
    And Clicks on Submit button
    Then user is navigated to the home page


 Scenario: Check login  with invalid credentials.
    Given I go to the login page

    When user enters the username and password
    And Clicks on login button
    Then user is navigated to the home page



  Scenario: Check login is successful with valid credentials.
    Given I go to the login page

    When user enters the username and password
    And Clicks on login button
    Then user is navigated to the home page
