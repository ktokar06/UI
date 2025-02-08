Feature: Drag and drop within an IFrame

  Scenario: Dragging an element to a receiving element
    Given I have opened the page
    When I drag an element to a receiving element
    Then The text of the receiving element has changed