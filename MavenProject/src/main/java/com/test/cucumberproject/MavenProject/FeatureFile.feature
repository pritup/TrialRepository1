Feature:This is a Feature file

Scenario: Application Scenario
Given User is navigated to "http://beta-qualitree.yapmo.com/" application
When Value "pritup@qualitreeinc.com" is entered in Username Text field
When Value "Test@1234" is entered in Password Text field
When Click on Login button
Then User is navigated to the application homepage

