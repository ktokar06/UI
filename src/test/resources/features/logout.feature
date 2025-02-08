Feature: Logout

  Scenario: User logs out successfully
    Given I am logged into the application on the page
    When I click on the "Logout" button
    Then I should see the login fields