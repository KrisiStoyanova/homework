Feature: Back button on product detailed page.
  User should be navigated to store page when click the back button on any product detailed page.

  @viewport
  Scenario Outline: Verify Back button Functionality on product detailed page.
    Given user navigates to store page on <width> x <height> viewport.
    When user click on first product link.
    Then user should be navigated to product detailed page.
    And back button is displayed.
    When user click the back button.
    Then user should be navigated back to store page.

    Examples:
      | width | height |
      | 1366  | 768    |
      | 360   | 640    |
      | 768   | 1024   |
      #| 947   | 669    |




