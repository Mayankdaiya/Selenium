Feature: User Login Feature

  Background:
    Given User is on the login page

  @standard_user
  Scenario: Login with valid credentials - User1
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on login button
    Then User should be redirected to the dashboard

  @locked_out_user
  Scenario: Login with valid credentials - User2
    When User enters username "problem_user" and password "secret_sauce"
    And User clicks on login button
    Then User should be redirected to the dashboard

  @problem_user
  Scenario: Login with valid credentials - User3
    When User enters username "performance_glitch_user" and password "secret_sauce"
    And User clicks on login button
    Then User should be redirected to the dashboard

  @performance_glitch_user
  Scenario: Login with valid credentials - User4
    When User enters username "user4@example.com" and password "secret_sauce"
    And User clicks on login button
    Then User should be redirected to the dashboard