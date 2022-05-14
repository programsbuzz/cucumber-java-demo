@ParTest @Search
Feature: Search Feature

  Background: 
    Given I am on the home page

  @Group1
  Scenario: I want to search the website
    When I fill in search query one text with "T-Shirt"
    And this step will fail

  @Group1
  Scenario: Verify the search functionality
    And I click on Search icon

  @Group1
  Scenario Outline: Search Keywords
    When I fill in "input[id='search']" with "<search keyword>"
    And I click on submit button

    Examples: 
      | search keyword |
      | a3433          |
      | hello##$       |
