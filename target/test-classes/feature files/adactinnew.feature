 Scenario Outline: Verifying Adactin login with valid data
    Given User is on the Adactin hotel page
    When User should enter "<username>","<password>"
    And User should click login button
    And should enter "<Location>","<Hotels>","<Room Type>","<No of rooms>","<Check In Date>","<Check out date>","<Adults per room>","<Children per room>"
    And User should enter search button
    And User should click radio button
    And user should click continue
    And user should enter "<First Name>","<Last Name>","<Billing Address>","<Credit Card No.>","<Credit Card Type>","<Expiry Date>","<Expiry Year>","<CVV Number>"
    And user should click Book Now button
    And user should generate order id
    Examples: 
      | username  | password  | Location | Hotels      | Room Type | No Of Rooms | Check-in-Date | Check-out-Date | AdultsPerRoom | ChildrenPerRoom | First Name | Last Name | Billing Address | Credit Card No.  | Credit Card Type | Expiry Date | Expiry Year | CVV Number |
      | mvikas753 | vikas@123 | Sydney   | Hotel Creek | Deluxe    | 2-Two       | 02-11-2022    | 03-111-2022    | 2-Two         | 2-Two           | Vikas      | M         | Chennai         | 1234567887654321 | VISA             | May         |        2022 |        234 |
      | mvikas753 | vikas@123 | Sydney   | Hotel Creek | Deluxe    | 2-Two       | 02-11-2022    | 03-111-2022    | 2-Two         | 2-Two           | Vikas      | M         | Chennai         | 1234567887654321 | VISA             | May         |        2022 |        234 |
      | mvikas753 | vikas@123 | Sydney   | Hotel Creek | Deluxe    | 2-Two       | 02-11-2022    | 03-111-2022    | 2-Two         | 2-Two           | Vikas      | M         | Chennai         | 1234567887654321 | VISA             | May         |        2022 |        234 |
      | mvikas753 | vikas@123 | Sydney   | Hotel Creek | Deluxe    | 2-Two       | 02-11-2022    | 03-111-2022    | 2-Two         | 2-Two           | Vikas      | M         | Chennai         | 1234567887654321 | VISA             | May         |        2022 |        234 |
      | mvikas753 | vikas@123 | Sydney   | Hotel Creek | Deluxe    | 2-Two       | 02-11-2022    | 03-111-2022    | 2-Two         | 2-Two           | Vikas      | M         | Chennai         | 1234567887654321 | VISA             | May         |        2022 |        234 |
      | mvikas753 | vikas@123 | Sydney   | Hotel Creek | Deluxe    | 2-Two       | 02-11-2022    | 03-111-2022    | 2-Two         | 2-Two           | Vikas      | M         | Chennai         | 1234567887654321 | VISA             | May         |        2022 |        234 |
      | mvikas753 | vikas@123 | Sydney   | Hotel Creek | Deluxe    | 2-Two       | 02-11-2022    | 03-111-2022    | 2-Two         | 2-Two           | Vikas      | M         | Chennai         | 1234567887654321 | VISA             | May         |        2022 |        234 |
      | mvikas753 | vikas@123 | Sydney   | Hotel Creek | Deluxe    | 2-Two       | 02-11-2022    | 03-111-2022    | 2-Two         | 2-Two           | Vikas      | M         | Chennai         | 1234567887654321 | VISA             | May         |        2022 |        234 |
      | mvikas753 | vikas@123 | Sydney   | Hotel Creek | Deluxe    | 2-Two       | 02-11-2022    | 03-111-2022    | 2-Two         | 2-Two           | Vikas      | M         | Chennai         | 1234567887654321 | VISA             | May         |        2022 |        234 |
      | mvikas753 | vikas@123 | Sydney   | Hotel Creek | Deluxe    | 2-Two       | 02-11-2022    | 03-111-2022    | 2-Two         | 2-Two           | Vikas      | M         | Chennai         | 1234567887654321 | VISA             | May         |        2022 |        234 |