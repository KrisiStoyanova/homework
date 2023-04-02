Feature: Back button on product detailed page.
  User should be navigated to store page when click the back button on any product detailed page.

  @desktop @mobile @tablet
  Scenario Outline: Verify Back button Functionality on product detailed page.
    Given user navigates to store page on <viewport>.
    When user click on first product link.
    Then user should be navigated to product detailed page.
    And back button is displayed.
    When user click the back button.
    Then user should be navigated back to store page.

  @desktop
    Examples:
      | viewport |
      | desktop  |

  @mobile
    Examples:
      | viewport |
      | mobile   |

  @tablet
    Examples:
      | viewport |
      | tablet   |


