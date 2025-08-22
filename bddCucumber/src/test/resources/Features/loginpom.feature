Feature: User Login Feature

  @sanity
  Scenario: Login with multiple users
    Given User is on the login page
    When user enters credentials
      | username | password  |
      | Admin    | admin123  |
    And user clicks on the login button
    Then user is navigated to home page

#Feature: Login functionality
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters username "admin" and password "admin123"
    Then the user should be navigated to the home page