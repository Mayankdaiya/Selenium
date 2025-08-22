Feature: Login Functionality

#  @regression
#  Scenario: Verify the login functionality for valid credentials
#    Given User is on the login page
#    When user enters the username
#    And user enters the password
#    And user clicks on the login button
#    Then user is navigated to home page

  @regression
  Scenario Outline: Verify the login functionality for multiple credentials
    Given User is on the login page
    When user enters the username "<username>"
    When user enters the password "<password>"
    And user clicks on the login button
    Then user is navigated to home page

    Examples:
      | username | password  |
      | admin    | admin123  |
      | user1    | pass1     |
      | user2    | pass2     |


