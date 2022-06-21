@Feature1
Feature: Feature 1

  Background: 
    Given I am on the homepage

  @Smoke
  Scenario Outline: Scenario 1
    Then I click on "Ask Doubt"

    Examples: 
      | link       |
      | Ask Doubt  |
      | Contact Us |
