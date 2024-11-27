@RegressionTest 
Feature: Homepage fuctionality 

Background: 
Given user is on login page
And user provide "Admin" and "admin123" a valid credentials to sucessful login


Scenario: Verifying  general information about the oraganization in Admin tab

When user click on Admin tab 
And user click on Orgnzation dropdown 
And user click on general information
Then validates all the general information displayed
