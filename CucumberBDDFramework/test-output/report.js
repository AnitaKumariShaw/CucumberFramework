$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/PhotonWS/CucumberBDDFramework/src/test/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate Free CRM login and Home Page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-login-and-home-page-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User opens Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks to login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate user is on homePage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Validate logged in username",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Contacts link",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginToHomePageSteps.user_opens_Browser()"
});
formatter.result({
  "duration": 17802063700,
  "status": "passed"
});
formatter.match({
  "location": "LoginToHomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1997887700,
  "status": "passed"
});
formatter.match({
  "location": "LoginToHomePageSteps.user_clicks_to_login_button()"
});
formatter.result({
  "duration": 105936700,
  "status": "passed"
});
formatter.match({
  "location": "LoginToHomePageSteps.validate_user_is_on_homePage()"
});
formatter.result({
  "duration": 617211700,
  "status": "passed"
});
formatter.match({
  "location": "LoginToHomePageSteps.validate_logged_in_username()"
});
formatter.result({
  "duration": 2614404400,
  "status": "passed"
});
formatter.match({
  "location": "LoginToHomePageSteps.User_clicks_on_Contacts_link()"
});
formatter.result({
  "duration": 354748300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-application-test;free-crm-create-a-new-contact-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@ContactCreation"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user is on contacts page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user clicks on New Button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user moves to create new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user enters \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cposition\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "free-crm-application-test;free-crm-create-a-new-contact-scenario;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "position"
      ],
      "line": 27,
      "id": "free-crm-application-test;free-crm-create-a-new-contact-scenario;;1"
    },
    {
      "cells": [
        "Tom",
        "Peter",
        "Manager"
      ],
      "line": 28,
      "id": "free-crm-application-test;free-crm-create-a-new-contact-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 28,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-application-test;free-crm-create-a-new-contact-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@ContactCreation"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user is on contacts page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user clicks on New Button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user moves to create new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user enters \"Tom\" and \"Peter\" and \"Manager\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsPageSteps.user_is_on_contacts_page()"
});
formatter.result({
  "duration": 5083501300,
  "status": "passed"
});
formatter.match({
  "location": "ContactsPageSteps.user_clicks_on_New_Button()"
});
formatter.result({
  "duration": 5733708000,
  "status": "passed"
});
formatter.match({
  "location": "ContactsPageSteps.user_moves_to_create_new_contact_page()"
});
formatter.result({
  "duration": 5105693500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tom",
      "offset": 13
    },
    {
      "val": "Peter",
      "offset": 23
    },
    {
      "val": "Manager",
      "offset": 35
    }
  ],
  "location": "ContactsPageSteps.user_enters_and_and(String,String,String)"
});
formatter.result({
  "duration": 6872453100,
  "status": "passed"
});
formatter.match({
  "location": "ContactsPageSteps.user_clicks_on_save_button()"
});
formatter.result({
  "duration": 185292000,
  "status": "passed"
});
});