Feature: login Functionality
@Smoke1Test
Scenario: User enters details in the form

  Given the user is on the registration page
  When the user enters the following details:
    | Field         | Value           |
    | First Name    | John            |
    | Last Name     | Doe             |
    | Email         | john.doe@test.com |
    
    And user click on sign up button
    
    Then user get error message 
 