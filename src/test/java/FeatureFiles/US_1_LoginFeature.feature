

Feature:As a user, I want to be able to log into the system as a student through the test environment "Campus ."
  So, I can successfully log in to the system, participate in classes, learn, and receive feedback.
  I should also be able to communicate with other students and teachers.


  Background:
    Given Access the Login screen


  Scenario: US-1 Login Feature - Positive Test Case
    And Enter valid username and valid password
    And Click on the Login button.
    Then Home page should be displayed

  Scenario: US-1 Login Feature - Negative Test Case
    And Enter invalid username and invalid password
    And Click on the Login button.
    Then Error message should be displayed


