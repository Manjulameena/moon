Feature: verify the login functionality.
Scenario: verify the valid username and password.
Given User is on login page.
When User enter the valid username and password.
|username|password|
|arun@gmail.com|testing123|
|babu@gmail.com|testing234|
|balu@gmail.com|testing567|
|john@gmail.com|testing100|
And User enter click button.
Then Error page is displayed.