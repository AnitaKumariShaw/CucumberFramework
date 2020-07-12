Feature: Free CRM Create Contacts

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