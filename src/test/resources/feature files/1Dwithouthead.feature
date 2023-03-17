Feature: verify the login functionality of facebook.
Scenario: verify the valid username and password.
Given User is on facebook page.
When User enter the valid username and password.
|arun@gmail.com|test123|
When User clicks the login button.
Then Error page is displayed.