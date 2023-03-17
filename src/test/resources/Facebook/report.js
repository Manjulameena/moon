$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Admin/Desktop/New folder/cucuminstall/src/test/resources/feature files/face.feature");
formatter.feature({
  "name": "Verify the login Funtionality.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify the given login functionality of username and password.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on facebook page.",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters\"\u003cUsername\u003e\"and\"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click the login button.",
  "keyword": "When "
});
formatter.step({
  "name": "Error page is displayed.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "User1",
        "test123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the given login functionality of username and password.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on facebook page.",
  "keyword": "Given "
});
formatter.match({
  "location": "Optionstepdefinition.user_is_on_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters\"User1\"and\"test123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Optionstepdefinition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button.",
  "keyword": "When "
});
formatter.match({
  "location": "Optionstepdefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error page is displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "Optionstepdefinition.error_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});