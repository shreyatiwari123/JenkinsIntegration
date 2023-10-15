Feature: Login Feature

  # We can call it;
  # User story,User Jou,Behaviour,Scenario,Test case,Requirement;

  Scenario: User is able to login in the application
    Given User opened the browser
    And User navigated to the application url
    When User enter username as "John" and password as "Demo" and click on login button
    Then User is able to login in the application
