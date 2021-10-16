Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the username as "admin" and password as "password"
    And I click on the login button
    Then I should see the userform page

  Scenario: Login with incorrect username and password
    Given I navigate to the login page
    And I enter the username as "admin" and password as "password"
    And I click on the login button
    Then I should see the userform page
    But It should display error message

