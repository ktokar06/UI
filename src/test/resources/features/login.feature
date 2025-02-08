Feature: Login

  Scenario: User logs in with valid credentials
    Given I am on the login page
    When I enter valid username and password
    And I click on the "Login" button
    Then I should see the message "You are logged in!!"
