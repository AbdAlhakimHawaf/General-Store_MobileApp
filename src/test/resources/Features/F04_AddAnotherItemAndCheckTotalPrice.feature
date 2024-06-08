@smoke
  Feature: Check Total Price
    Scenario: Adding New Item To Check Total Price
      Given User Return To Home Tab
      When  Add Another Item
      And User go To Cart Tab the New Item Is There
      Then  Total Price is the Sum of to Items
