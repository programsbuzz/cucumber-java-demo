Feature: Registration, Login and MyAccount

  @TEMP1
  Scenario: Verify Login Functionality
    Given I am on the homepage
    And I should see "Sign in" link
    When I follow "Sign in" link
    And I fill "email address" with "goswami.tarun77@gmail.com"
    And I fill "password" with "tarun@123"
    And I click "sign in" button
    Then I should see "My Account" Heading
    And I should see "my account" link
    But I should not see "Login" Heading

  #	not @regression and not @sanity
  @sanity
  Scenario: Test 1
    When I fill "email address textbox" with "goswami.tarun77@gmail.com"
    Then I fill "password textbox" with "Test1234"

  ####### this is my comment
  @regression
  Scenario: Test 2
    When I fill "registration email textbox" with "goswami.tarun77+1@gmail.com"
    #this is my step
    Then I click "create an account button"

  @sanity @regression
  Scenario: Test 3
    When I fill "email address textbox" with "goswami.tarun77@gmail.com"
    Then I fill "password textbox" with "Test1234"
    And I click on "Logout"

  @SmokeTest
  Scenario: Test 4

  #When I fill "email address textbox" with "goswami.tarun77@gmail.com"
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
