Feature: Overtime
  As an Admin of Moneypenny
  I want to manage overtime

  @Overtime @Availability @CreatingAvailability
  Scenario: Creating availability
    Given an Admin logs into My Working Life
    When the Admin goes to the Overtime screen
    Then enters overtime availability information
    And save the overtime availability
    And log out of MWL

  @Overtime @Availability @EditAvailability
  Scenario: Editing availability
    Given an Admin logs into My Working Life
    When the Admin goes to the Overtime screen
    Then edits overtime availability information
    And log out of MWL

  @Overtime @Availability @DeleteAvailability
  Scenario: Deleting availability
    Given an Admin logs into My Working Life
    When the Admin goes to the Overtime screen
    Then delete overtime availability
    And log out of MWL