Feature: Loan Agreements
  As an Admin of Moneypenny
  I want to create a loan agreement

  @MoneyDashboard @LoanAgreement @CreatingALoanAgreement
  Scenario: Create an loan agreement
    Given an Admin logs into My Working Life
    When the Admin goes to the Loan Agreements screen
    And enters the loan agreements information
    Then save the loan agreement
    And log out of MWL
