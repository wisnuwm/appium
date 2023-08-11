Feature: Login feature
  Scenario: Login with invalid account
    Given Input email "email@email.com"
    And Input password "p@ssw0rd"
    When Click login button
    Then Displayed error messages