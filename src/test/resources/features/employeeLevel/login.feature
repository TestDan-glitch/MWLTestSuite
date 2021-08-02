Feature: Logging in and out
  I want to log into MWL

  @firefox @driver:firefox
  @Smoke
  Scenario: Log as an Admin User
    Given I navigate to MWL
    When I enter my Admin User credentials
    Then the Admin User will be logged in
    And log out of MWL

#  @Smoke
#  Scenario: Log as an Employee
#    Given I navigate to MWL
#    When I enter my Employee credentials
#    Then the Employee will be logged in
#    And log out of MWL