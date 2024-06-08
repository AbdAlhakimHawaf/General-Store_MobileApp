@smoke
  Feature: Valid Login
    Scenario: Verifying Successful Login after entering Name
      Given User Open the app and cchange Country to Egypt
      When Entering Name
      And Choosing Female
      And Clicking on Login BButton
      Then Home Page Will Open