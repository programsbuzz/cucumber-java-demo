Feature: Registration, Login and MyAccount
 
  Background: 
 	  Given I am on the home page
    And I follow "Sign in"	  
 	   
 #	not @regression and not @sanity   
  @sanity
  Scenario: Test 1
    When I fill "email address textbox" with "goswami.tarun77@gmail.com"
    Then I fill "password textbox" with "Test1234"  
   
 @regression
  Scenario: Test 2
    When I fill "registration email textbox" with "goswami.tarun77+1@gmail.com"
    Then I click "create an account button"
    
  @sanity @regression
  Scenario: Test 3
    When I fill "email address textbox" with "goswami.tarun77@gmail.com"
    Then I fill "password textbox" with "Test1234"
    And I click on "Logout"      
    
   @smoke
  Scenario: Test 4
    When I fill "email address textbox" with "goswami.tarun77@gmail.com"
    
  @datatable
	Scenario: Verify user details
  #Given When I request "ah.programsbuzz.com/users"
  Then I gets following response
    | Username | Email                     |
    | tgoswami | goswami.tarun77@gmail.com |
    | mahuja   | manish.ahuja@gmail.com    |
    | ssharma  | simran.sharma@gmail.com    |  