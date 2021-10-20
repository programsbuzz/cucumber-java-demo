Feature: Registration, Login and MyAccount
 
  Background: 
 	  Given I am on the home page
    And I follow "Sign in"	  
 	   
  @smoke
  Scenario: Verify Login Functionality
    When I fill "email address textbox" with "goswami.tarun77@gmail.com"
    Then I fill "password textbox" with "Test1234"  
   
 @regression
  Scenario: Create New User
    When I fill "registration email textbox" with "goswami.tarun77+1@gmail.com"
    Then I click "create an account button"
    
  @sanity @regression
  Scenario: Verify Logout Functionality
    When I fill "email address textbox" with "goswami.tarun77@gmail.com"
    Then I fill "password textbox" with "Test1234"
    
 @regression
  Scenario: Verify Ignore Test Case
    When I fill "email address textbox" with "goswami.tarun77@gmail.com"