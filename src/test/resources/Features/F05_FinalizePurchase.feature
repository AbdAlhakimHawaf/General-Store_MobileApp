@smoke
  Feature: Finalizing Purchase
    Scenario: Reading Terms and Conditions and Finish th Purchase
      Given User Is in Cart Tab
      When  Start To read Condition
      And Choose to Send Me Emails
      Then  User Is Redirected to Browser