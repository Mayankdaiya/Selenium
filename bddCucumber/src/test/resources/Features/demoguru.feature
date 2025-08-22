Feature: Form Submission on DemoGuru99 Page

  Scenario: Submit the contact registration form with valid data
    Given the user is on the contact registration page
    When the user fills in contact information with:
      | First Name | Mayank     |
      | Last Name  | Kumar      |
      | Phone      | 1234567890 |
      | Email      | mayank@example.com |
    And the user fills in mailing information with:
      | Address       | 123 Main Street |
      | City          | Faridabad          |
      | State         | Haryana          |
      | Postal Code   | 121012            |
      | Country       | INDIA         |
    And the user fills in user information with:
      | User Name        | mayank123     |
      | Password         | Password@123   |
      | Confirm Password | Password@123   |
    And the user submits the form
    Then the form should be submitted successfully