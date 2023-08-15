Feature: all add user related scenarios

  Background: login scenario
    Given I am on login page
   # When I enter correct username and password
    When I enter "admin" and "admin"
    And I click on login button
    Then I should reach to the dashboard

    @AddClient
    Scenario: to test the add button on add client page
      Given I am on add client page
      When I enter details on the page
      And I click on add button
      Then user should be added

  @AddClientParam
  Scenario Outline: to test the add button on add client page
    Given I am on add client page
    When I enter <name> , <address> , <contact1> , <contact2>
    And I click on add button
    Then user should be added
    Examples:
      | name          | address | contact1 | contact2 |
      | Amol555       | abcd1   | 123456   | 9876543  |
      | Avinash555    | abcd2   | 2345678  | 8765432  |
      | sundarmala555 | abcd3   | 676767   | 76676    |