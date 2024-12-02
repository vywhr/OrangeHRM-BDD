
Feature: Login feature 

Background:
Given user is on login page

Scenario: Login with valid credentials  
When user provide valid credentials "Admin" and "admin123"
Then user land on home page


Scenario Outline: Login with different data set

When user provide credentials "<username>" and "<password>"
Then user land on home page

Examples:
|username|password|
|Admin|admin123|
|Admin|admin123|
|Admin|admin123|
|Admin|admin123|
|Admin|admin123|


@InvalidLogin
Scenario Outline: login with different set of invalid credentials 

When User provide  invalid "<username>" and "<password>"
Then system should display proper "<error msg>"

Examples:
|username|password|error msg|
|admin|Admin123|Invalid credentials|
|Admin|Admin123|Invalid credentials|
|Admin|admin@123|Invalid credentials|
|null|admin123|Invalid credentials|
|null|null|Invalid credentials|
|null1|null1|Invalid credentials|