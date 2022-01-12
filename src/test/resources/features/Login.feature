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
  Scenario: comparison
    Then I get following response
      | username | email |
      | U1       | E1    |
      | U2       | E2    |
      | U3       | E3    |
      
  Scenario: Test 1
  Then I set numbers  
  Then I read number one
  And I read number two  
