Feature: Working with alerts

  Scenario: Entering text into an alert
    Given I have opened the page
    When I enter text into the alert
    Then The alert's text has changed