Feature: feature to test DsAlgo logim page

  @SmokeTest
  Scenario: Check login is successful with valid credentials.
    Given when the browser is open
    And user is on login page
    When user enters the username and password
    And Clicks on login button
    Then user is navigated to the home page
