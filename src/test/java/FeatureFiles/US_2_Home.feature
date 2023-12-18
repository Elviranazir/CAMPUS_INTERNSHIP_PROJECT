#Description

# As a user I need to make sure that all the main feature buttons at the top of the home page (Top Nav) are working correctly. So, I will have a smoother navigation in the campus application.

#AC_H02:
#The user should be logged into the system as a student.
#The user should be able to see all the main menu items above the home page (Logo, Courses, Calendar, Attant, Assignments, Grading, Hamburger Menu, Chat MSG., Message, Profile).
#The right action should take place when clicking on any of the main menu elements (the relevant page should be opened or the relevant menu should be opened)

Feature:


  Background:
    Given Access the Login screen
    And Enter valid username and valid password
    And Click on the Login button.
    And Home page should be displayed


  Scenario:US-3 Home - Positive Test Case
#    Verify the presence of all main menu items
#    (Logo, Courses, Calendar, Attendance, Assignments, Grading, Hamburger Menu, Chat MSG., Message, Profile) at the top of the home page.
    And Verify Presence and Clickability of Logo
    And Verify Presence and Clickability of Courses
    And Verify Presence and Clickability of Calendar
    And Verify Presence and Clickability of Attendance
    And Verify Presence and Clickability of Assignments
    And Verify Presence and Clickability of Grading
    And Verify Presence and Clickability of Hamburger Menu
    And Verify Presence and Clickability of Chat MSG
    And Verify Presence and Clickability of Message
    And Verify Presence and Clickability of Profile



  Scenario:US-3 Home Negative Test Case
    And
    And
    Then
