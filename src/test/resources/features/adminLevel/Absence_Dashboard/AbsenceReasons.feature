Feature: Absence Reasons
  As an Admin of Moneypenny
  I want to create absence reasons

  @AbsenceDashboard @AbsenceReason @CreatingAnAbsenceReason
  Scenario: Create an absence reason
    Given an Admin logs into My Working Life
    When the Admin goes to the Absence Reasons screen
    And enters absence reason information
    Then save the absence reason
    And log out of MWL