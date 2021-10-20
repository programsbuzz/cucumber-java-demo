@ContactT
Feature: Contact Us Functiality

Background: 
	Given I am on the home page 
	And I follow "Contact us" link 
	
Scenario Outline: Contact US 2 
	When I fill in "input[id='email']" with "<email>" 
	When I fill in "input[id='email']" with "<email>" 
	And I click on submit button 
	
	Examples: 
		| email               | password   |
		| goswami.tarun77.com | Test@12345 |
