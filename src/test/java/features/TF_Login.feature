@Login
Feature: Validate Techfios login functionality 

Background: 
	Given User is on the Techfios login page 
	
Scenario Outline: 
	When User enters the "<username>" and "<password>"
	And User clicks submit
	Then User should log in to dashboard page
	
	Examples:
	
	|	username		|	password	|
	|demo@techfios.com	|	abc123		|