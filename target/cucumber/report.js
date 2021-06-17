$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TF_New_Account.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Techfios new account functionality",
  "description": "",
  "id": "validate-techfios-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NewAccount"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "",
  "description": "",
  "id": "validate-techfios-new-account-functionality;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks submit",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should log in to dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fills up the form entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"and \"\u003cinternetBankingUrl\u003e\" and clicks on submit",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to validate new account created",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "validate-techfios-new-account-functionality;;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 17,
      "id": "validate-techfios-new-account-functionality;;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "mike",
        "checking",
        "75000",
        "1138",
        "me",
        "6522",
        "asdasdasd.com"
      ],
      "line": 18,
      "id": "validate-techfios-new-account-functionality;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Techfios dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_is_on_the_Techfios_dashboard_page()"
});
formatter.result({
  "duration": 3936662100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "",
  "id": "validate-techfios-new-account-functionality;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@NewAccount"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enters the \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks submit",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should log in to dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fills up the form entering \"mike\"and \"checking\"and \"75000\"and \"1138\"and \"me\"and \"6522\"and \"asdasdasd.com\" and clicks on submit",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to validate new account created",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "abc123",
      "offset": 41
    }
  ],
  "location": "Steps.user_enters_and(String,String)"
});
formatter.result({
  "duration": 389512400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_submit()"
});
formatter.result({
  "duration": 1819844400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_log_in_to_dashboard_page()"
});
formatter.result({
  "duration": 22412600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_bank_and_cash()"
});
formatter.result({
  "duration": 93264200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 707039600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mike",
      "offset": 33
    },
    {
      "val": "checking",
      "offset": 43
    },
    {
      "val": "75000",
      "offset": 57
    },
    {
      "val": "1138",
      "offset": 68
    },
    {
      "val": "me",
      "offset": 78
    },
    {
      "val": "6522",
      "offset": 86
    },
    {
      "val": "asdasdasd.com",
      "offset": 96
    }
  ],
  "location": "Steps.user_fills_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1779412300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_be_able_to_validate_new_account_created()"
});
formatter.result({
  "duration": 604391900,
  "status": "passed"
});
formatter.after({
  "duration": 1009900300,
  "status": "passed"
});
});