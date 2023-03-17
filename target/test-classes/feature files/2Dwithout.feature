Feature: verify the login functionality.
Scenario: verify the valid username and password.
Given User is on login page.
When User enter the valid username and password.
|arun@gmail.com|test123|
|babu@gmail.com|test345|
And User enter click button.
Then Error page is displayed.
