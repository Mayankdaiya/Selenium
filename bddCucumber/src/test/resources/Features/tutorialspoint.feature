Feature: Complete Form Submission with Multiple User Inputs

  Scenario Outline: Submit form with all required fields
    Given the user is on the form page
    When the user enters personal information:
      | Name  | <name>  |
      | Email       | <email>             |
      | Gender      | <gender>            |
      | Mobile      | <mobile>            |
      | DOB | <dob>             |
    And the user enters academic information:
      | Subjects     | <subjects>         |
      | Hobbies      | <hobbies>          |
    And the user uploads a picture "<picturePath>"
    And the user enters address and location:
      | Address      | <address>          |
      | State        | <state>            |
      | City         | <city>             |
    And the user submits the form
    Then the form should be submitted successfully

    Examples:
      | name  | email              | gender | mobile      | dob        | subjects        | hobbies       | picturePath           | address         | state   | city   |
      | Alice | alice@example.com  | Female | 9876543210  | 22-08-1995 | Math, English   | Sports, Music | C:\Users\Mayank\Downloads/logocss.gif       | 123 Main Street | NCR     | Agra   |
      | Bob   | bob@example.com    | Male   | 9123456789  | 10-01-1990 | Physics, History| Reading       | C:\Users\Mayank\Downloads/logocss.gif | 456 Elm Avenue  | Haryana | Meerut |
