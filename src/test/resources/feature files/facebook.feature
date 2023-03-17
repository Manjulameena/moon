Feature: Verify facebook login functionality.
Scenario: Verify Login functionality for valid username and invalid password.
Given User is on facebook login page
When User enters valid username and invalid password.
When User clicks the login button.
Then Error page is displayed.










