@ParTest
@Search
Feature: Search Feature 

Background:
 When I visit the homepage

Scenario: I want to search the website 
	Given I am on the home page 
	When I fill in search query one text with "T-Shirt" 
	And this step will fail

	@Demo
  Scenario: Verify the search functionality
 	And I click on Search icon