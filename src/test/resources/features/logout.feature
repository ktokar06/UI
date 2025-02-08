Feature: Logout

  @success
  Scenario: Successful logout after logging in
    Given I have opened the page Login
    When I enter my credentials and log in
    And I click on the Logout button
    Then I should see the login fields