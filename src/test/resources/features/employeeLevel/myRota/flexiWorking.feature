Feature: Flexi Working
  As a User of My Working Life
  I want to indicate an employee is working from home or the office

  @Rota @FlexiWorking @Employee
  Scenario: Employee picks a day they want to working from home
    Given an employee logs into My Working Life
    When they go to the My Rota screen
    And the Employee selects today's date as the day
    Then the day will be confirmed as a working from home
    And log out of MWL

  @Rota @FlexiWorking @Employee
  Scenario: Employee picks a day they want to working from the office
    Given an employee logs into My Working Life
    When they go to the My Rota screen
    And the Employee selects today's date as the day
    Then the day will be confirmed as a working from the office
    And log out of MWL

  @Rota @FlexiWorking @Admin
  Scenario: An Admin picks a day they want to working from home
    Given an Admin logs into My Working Life
    When they go to the My Rota screen
    And the Admin selects today's date as the day
    Then log out of MWL

  @Rota @FlexiWorking @Admin
  Scenario: An Admin picks a day they want to working from the office
    Given an Admin logs into My Working Life logs into My Working Life
    When they go to the My Rota screen
    And the Admin selects today's date as the day
    Then log out of MWL