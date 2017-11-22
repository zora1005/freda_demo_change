Feature: glipemailsignin

  Scenario: Sign In with email Account

    Given User has valid email and Password
    When User switch to correctly Env "Glip"
    When User inputs email "freda.song15@gmail.com" and Password "test!123"
    Then User can sign in app
