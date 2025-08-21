Feature: Login Functionality

  @regression
  Scenario: Verify the login functionality for valid credentials
    Given User is on the login page
    When user enters the username
    And user enters the password
    And user clicks on the login button
    Then user is navigated to home page