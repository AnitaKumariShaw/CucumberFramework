Feature: Free CRM Application Test

@LoginTest 
Scenario: Validate Free CRM login and Home Page Test

Given User opens Browser
When User enters username and password
Then User clicks to login button
Then Validate user is on homePage
Then Validate logged in username
Then User clicks on Contacts link



@ContactCreation
Scenario Outline: Free CRM Create a new contact scenario

Given user is on contacts page
When user clicks on New Button
Then user moves to create new contact page
Then user enters "<firstname>" and "<lastname>" and "<position>"
Then user clicks on save button



Examples: 
	|firstname|lastname|position|
	|Tom|Peter|Manager|

