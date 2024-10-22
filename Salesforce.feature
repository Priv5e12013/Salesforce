Feature: Login into Salesforce Application

Scenario Outline: Login into Positive data

Given Launch the browser and after load the url and after maximize the screen
And Enter into the username 'dilip@testleaf.com'
And Enter into the password 'leaf@2024'
When Click on into the login button
Then My page successfully click the login button 
And Click on toggle button
And Click on View AllApplication
And Click on Legal entities
And Click on new button
And Enter the name fielder <LegalEntityName>
Then Enter the save option
Then Verify the legalentity name 

Examples:
|LegalEntityName|Priyanka| 
