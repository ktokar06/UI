Feature: Navigation between pages via the navigation menu

  @success
  Scenario: Navigation to the "Lifetime Membership Club" page
    Given I open the homepage of the website
    When I click on the All Courses block
    And I select the Lifetime Membership option in this block
    And The page title contains