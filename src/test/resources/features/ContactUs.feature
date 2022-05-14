@ParTest
Feature: Contact Us Functiality

	
@doc
Scenario: demo doc string
Given I follow url "http://autopract.com/selenium/form4/"
When I fill in your message with
"""
Hello,

      How are you! This text will be displayed
      in the same format.

Thanks,
Tarun
"""

	
Scenario Outline: Contact US 2 
	Given I am on the home page 
	And I follow "Contact us" link 
	When I fill in "input[id='email']" with "<email>" 
	When I fill in "input[id='email']" with "<email>" 
	And I click on submit button 
	
	Examples: 
		| email               | password   |
		| goswami.tarun77.com | Test@12345 |

		