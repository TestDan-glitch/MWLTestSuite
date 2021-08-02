Feature: Absences
  As an Admin of Moneypenny
  I want to manage absences

  @Absences @Absence @ManagingAbsences
  Scenario: Booking managing absences
    Given an Admin logs into My Working Life
    When the Admin goes to the Absence screen
    And enters absence information
    Then book the absence
    And edits an absence
    And delete an absence
    And log out of MWL