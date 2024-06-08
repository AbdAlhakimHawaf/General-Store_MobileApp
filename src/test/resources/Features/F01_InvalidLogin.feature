@smoke
Feature: invalid Login

  Scenario: Verifying to login without any name
    Given User Open the app and change Country to Egypt
    When Clicking on Login Button
    Then Error Message Will Appear
