Feature: Verify the login Funtionality.
Scenario Outline: Verify the given login functionality of username and password.
Given User is on facebook page.
When User enters"<Username>"and"<Password>" 
When User click the login button.
Then Error page is displayed.
Examples:
          |Username|Password|
					|User1|test123|
					
