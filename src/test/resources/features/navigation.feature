Feature: Navigation between pages via the navigation menu

  Scenario: Navigation to the "Lifetime Membership Club" page
    Given I open the homepage of the website
    When I click on the "All Courses" block
    And I select the "Lifetime Membership" option in this block
    Then I verify that I am redirected to the URL "https://way2automation.com/lifetime-membership-club/"
    And The page title contains the text "Lifetime Membership Club"