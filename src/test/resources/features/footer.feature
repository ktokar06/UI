Feature: Footer Verification

  Scenario: Display of contact information in the footer
    Given I open the homepage of the website URL https://www.way2automation.com/
    Then The footer is displayed
    And It contains the following contact details:
      | Address           | CDR Complex, 3rd Floor, Naya Bans Market, Sector 15, Noida, Near sec-16 Metro Station|
      | Phone Number      | +91 97111-11-558                                                                     |
      |                   | +91 97111-91-558                                                                     |
      | Email             | trainer@way2automation.com                                                           |
      |                   | seleniumcoaching@gmail.com                                                           |