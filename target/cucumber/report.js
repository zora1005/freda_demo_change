$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GlipEmailSignin.feature");
formatter.feature({
  "line": 1,
  "name": "glipemailsignin",
  "description": "",
  "id": "glipemailsignin",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Sign In with email Account",
  "description": "\n/*Given User switch to correctly Env \"Glip\"*/",
  "id": "glipemailsignin;sign-in-with-email-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@p0"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User has valid email and Password",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User inputs email \"8882420001\" and Password \"Test!123\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User can sign in app",
  "keyword": "Then "
});
formatter.match({
  "location": "GlipEmailSignin.userHasValidEmailAndPassword()"
});
formatter.result({
  "duration": 28505027039,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8882420001",
      "offset": 19
    },
    {
      "val": "Test!123",
      "offset": 45
    }
  ],
  "location": "GlipEmailSignin.userInputsEmailAndPassword(String,String)"
});
formatter.result({
  "duration": 11813734114,
  "status": "passed"
});
formatter.match({
  "location": "GlipEmailSignin.userCanSignInApp()"
});
formatter.result({
  "duration": 127427,
  "status": "passed"
});
});