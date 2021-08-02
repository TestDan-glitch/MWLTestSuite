Feature: Wow Chat slot
  As an Admin of Moneypenny
  I want to manage a Wow Chat slot

  @TrainingAndDevelopment @WowChat @BookingWowChat
  Scenario: Booking a WOW Chat Slot
    Given an Admin logs into My Working Life
    When the Admin goes to the WOW Chat screen
    And enters WOW Chat information
    Then books the Slot
    And log out of MWL

  @TrainingAndDevelopment @WowChat @EditingWowChat
  Scenario: Editing a booked WOW Chat Slot
    Given an Admin logs into My Working Life
    When the Admin goes to the WOW Chat screen
    And edits a WOW Chat Slot
    And log out of MWL

  @TrainingAndDevelopment @WowChat @DeletingWowChat
  Scenario: Deleting a booked WOW Chat Slot
    Given an Admin logs into My Working Life
    When the Admin goes to the WOW Chat screen
    Then delete a WOW Chat Slot
    And log out of MWL