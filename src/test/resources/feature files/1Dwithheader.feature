Feature: verify the login functionality.
Scenario: verify the valid username and password.
Given User is on login page.
When User enter the valid username and password.
|username|arun@gmail.com|
|password|testing123|
And User enter click button.
Then Error page is displayed.