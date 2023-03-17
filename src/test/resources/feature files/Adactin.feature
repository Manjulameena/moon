Feature: Verify the Adactin hotel application.
  Scenario: Verify the Adactin Hotel Booking.
    Given User is on Adactin login page.
    When User enter the valid username and password.
    When User enter the valid date in Search Hotel page.
    And User is on select hotel page and given a valid data.
    And User is on book a hotel page and given a valid data.
    And User is on cancel page.
    Then User will logout.


 