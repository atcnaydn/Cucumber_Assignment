@NewAccount 
Feature: Validate Techfios new account functionality 

Background: 
	Given User is on the Techfios dashboard page
	
Scenario Outline: 
	When User enters the "<username>" and "<password>" 
	And User clicks submit 
	Then User should log in to dashboard page
	When User clicks on bank and cash
	When User clicks on new account
	When User fills up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" and clicks on submit 
	Then User should be able to validate new account created
	
	Examples:
	|username			|	password| accountTitle	|	description	|	initialBalance	|	accountNumber	|	contactPerson	|	phone	|	internetBankingUrl	|
	|demo@techfios.com	|	abc123	|		mike	|	checking	| 		75000		|	1138			|	me				|	6522	|	asdasdasd.com		|