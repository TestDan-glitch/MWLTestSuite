Feature: Client Time slot
  As an Admin of Moneypenny
  I want to manage a Client Time slot

  @TrainingAndDevelopment @ClientTime @BookingClientTime
  Scenario: Booking a Client Time Slot
    Given an Admin logs into My Working Life
    When the Admin goes to the Client Time screen
    And enters Client Time Slot information
    Then books the Slot
    And log out of MWL

  @TrainingAndDevelopment @ClientTime @EditingClientTime
  Scenario: Editing a booked Client Time Slot
    Given an Admin logs into My Working Life
    When the Admin goes to the Client Time screen
    And edits a Client Time Slot
    And log out of MWL

  @TrainingAndDevelopment @ClientTime @DeletingClientTime
  Scenario: Deleting a booked Client Time Slot
    Given an Admin logs into My Working Life
    When the Admin goes to the Client Time screen
    Then delete a Client Time Slot
    And log out of MWL