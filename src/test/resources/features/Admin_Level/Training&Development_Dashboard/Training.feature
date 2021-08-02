Feature: Training slot
  As an Admin of Moneypenny
  I want to manage a Training slot

  @TrainingAndDevelopment @Training @BookingTraining
  Scenario: Booking a Training Slot
    Given an Admin logs into My Working Life
    When the Admin goes to the Training screen
    And enters Training Slot information
    Then books the Slot
    And log out of MWL

  @TrainingAndDevelopment @Training @EditingTraining
  Scenario: Editing a booked Training Slot
    Given an Admin logs into My Working Life
    When the Admin goes to the Training screen
    And edits a Training Slot
    And log out of MWL

  @TrainingAndDevelopment @Training @DeletingTraining
  Scenario: Deleting a booked Training Slot
    Given an Admin logs into My Working Life
    When the Admin goes to the Training screen
    Then delete a Training Slot
    And log out of MWL
