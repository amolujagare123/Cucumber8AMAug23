Feature: all login page scenarios

  Scenario: to test the functionality of login button for valid input
    Given I am on login page
   # When I enter correct username and password
    When I enter "admin" and "admin"
    And I click on login button
    Then I should reach to the dashboard


  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
    #When I enter incorrect username and password
    When I enter "5454" and "45454"
    And I click on login button
    Then I should get an error


  Scenario: to test the functionality of login button for blank input
    Given I am on login page
   # When I enter blank username and password
    When I enter "" and ""
    And I click on login button
    Then I should get an Another error error

    @userReg
    Scenario: to test the user registration form
      Given I am on user registration form
      When I enter below data
        | Avinash | avinash@gmail.com |  avinash 123 |
      And I click on submit button
      Then User should be added