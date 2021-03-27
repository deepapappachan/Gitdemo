Feature: Application login

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login to application with "jin" and "1234"
    Then Home page is populated
    And Cards displayed are "true"

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login to application with "test" and "trtr"
    Then Home page is populated
    And Cards displayed are "false"