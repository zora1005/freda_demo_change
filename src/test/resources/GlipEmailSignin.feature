Feature: glipemailsignin

 @p0
  Scenario: Sign In with email Account

    /*Given User switch to correctly Env "Glip"*/
    Given User has valid email and Password
    When User inputs email "8882420001" and Password "Test!123"
    Then User can sign in app

