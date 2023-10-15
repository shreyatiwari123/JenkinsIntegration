Feature: Open New Account Feature


  @Open_New_Account
  Scenario: User is able to Open New Account
    Given User is Logged in
    And User clicked on link "Open New Account"
   # When User select account as "SAVING" and account number as "13344"
    When User select account as "SAVING" and any account number
    Then Account Openned Massage is Displayed
    Then a new account number is generated