Feature: Update Employee's Details
  As an Employee of Moneypenny
  I want to update and Employee's Details

  @UpdateUserDetails
  Scenario: Update Employee's Details
    Given an employee logs into My Working Life
    When the employee goes to the My Details screen
    Then edit employee's details
#    And selects a day to book off
#    Then books the Time Off
#    And log out of MWL