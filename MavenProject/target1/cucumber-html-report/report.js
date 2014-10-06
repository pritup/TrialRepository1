$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\test\\cucumberproject\\MavenProject\\FeatureFile.feature");
formatter.feature({
  "id": "this-is-a-feature-file",
  "description": "",
  "name": "This is a Feature file",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-is-a-feature-file;application-scenario",
  "description": "",
  "name": "Application Scenario",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "User is navigated to \"http://beta-qualitree.yapmo.com/\" application",
  "keyword": "Given ",
  "line": 4
});
formatter.match({
  "arguments": [
    {
      "val": "http://beta-qualitree.yapmo.com/",
      "offset": 22
    }
  ],
  "location": "Sample1.LaunchApp(String)"
});
formatter.result({
  "duration": 30516026094,
  "status": "passed"
});
formatter.step({
  "name": "Value \"pritup@qualitreeinc.com\" is entered in Username Text field",
  "keyword": "When ",
  "line": 5
});
formatter.match({
  "arguments": [
    {
      "val": "pritup@qualitreeinc.com",
      "offset": 7
    }
  ],
  "location": "Sample1.EnterCredentials_Email(String)"
});
formatter.result({
  "duration": 332707520,
  "status": "passed"
});
formatter.step({
  "name": "Value \"Test@1234\" is entered in Password Text field",
  "keyword": "When ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "Test@1234",
      "offset": 7
    }
  ],
  "location": "Sample1.EnterCredentials_Password(String)"
});
formatter.result({
  "duration": 118448457,
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When ",
  "line": 7
});
formatter.match({
  "location": "Sample1.ClickLoginButton()"
});
formatter.result({
  "duration": 5407117448,
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the application homepage",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "location": "Sample1.imessupwithit()"
});
formatter.result({
  "duration": 11133753006,
  "status": "passed"
});
});