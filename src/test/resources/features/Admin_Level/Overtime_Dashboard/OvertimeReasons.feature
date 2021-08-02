Feature: Overtime
  As an Admin of Moneypenny
  I want to manage overtime reasons

  @Overtime @OvertimeReason @CreatingAOvertimeReason
  Scenario: Create an overtime reason
    Given an Admin logs into My Working Life
    When the Admin goes to the Overtime Reasons screen
    Then enters overtime reason information
    And save the overtime reason
    And log out of MWL