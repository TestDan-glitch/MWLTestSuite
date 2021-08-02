package starter.stepdefinitions.Admin.Money_Dashboard;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import navigation.MWLNavigateTo;
import net.thucydides.core.annotations.Steps;
import pages.*;
import pages.Admin.Absence_Dashboard.AbsenceDashboardPage;
import pages.Admin.Absence_Dashboard.AbsencePage;
import pages.Admin.Money_Dashboard.LoanAgreementsPage;
import pages.Admin.Money_Dashboard.Money_DashboardPage;
import pages.Admin.TrainingAndDevelopment_Dashboard.ClientTimePage;

public class LoanAgreementsSteps {
    @Steps
    MWLNavigateTo mwlNavigateTo;
    LoginPage loginpage;
    HomePage homepage;
//    MyTimeOff myTimeOff;
    ClientTimePage traininganddev;
    AbsenceDashboardPage absenceDashboardPage;
    AbsencePage absencePage;
    Money_DashboardPage money_dashboardPage;

    LoanAgreementsPage loanAgreementsPage;

    @When("the Admin goes to the Loan Agreements screen")
    public void theAdminGoesToTheLoanAgreementsScreen() throws InterruptedException {
        homepage.ClickMoneyDashboardBtn();
        money_dashboardPage.ClickLoanAgreementsBtn();
    }

    @And("enters the loan agreements information")
    public void entersTheLoanAgreementsInformation() throws InterruptedException {
        loanAgreementsPage.ClickAddNewLoanAgreementBtn();
        loanAgreementsPage.SelectEmployeeName();
        loanAgreementsPage.EnterStartDate();
        loanAgreementsPage.EnterLoanAmount();
    }

    @And("save the loan agreement")
    public void saveTheLoanAgreement() throws InterruptedException {
        loanAgreementsPage.ClickSubmitBtn();
//        homepage.LogOut();
    }

//    @And("enters absence reason information")
//    public void entersAbsenceReasonInformation() throws InterruptedException {
//        absenceReasonsPage.ClickAddReasonBtn();
//        absenceReasonsPage.SelectAbsenceType();
//        absenceReasonsPage.EnterAbsenceReasonDetailsField();
//        absenceReasonsPage.TickAllowPayForThisAbsenceIfThisIsTickedCheckBox();
//        absenceReasonsPage.TickNoBFPointsAddedForThisAbsenceIfThisIsTickedCheckBox();
//        absenceReasonsPage.TickStillGetTrophyIfThisIsTickedCheckBox();
//        absenceReasonsPage.TickActiveCheckBox();
//    }

//    @Then("save the absence reason")
//    public void saveTheAbsenceReason() {
//        absenceReasonsPage.ClickAddBtn();
//    }



//
//
//    @And("enters absence information")
//    public void entersAbsenceInformation() throws InterruptedException {
//        absencePage.ClickAddAbsenceBtn();
//        absencePage.EnterAbsenceInformation();
//    }
//
//    @Then("book the absence")
//    public void bookTheAbsence() {
//        absencePage.SaveEnteredAbsenceInformation();
//    }
//
//    @Then("delete an absence")
//    public void deleteAnAbsence() throws InterruptedException {
//        absencePage.DeleteBookedAbsence();
//    }
//
//    @Then("edits an absence")
//    public void editsAnAbsence() throws InterruptedException {
//        absencePage.EditABookedAbsence();
//    }

//    @And("log out of MWL")
//    public void log_out_of_MWL() {
//        homepage.LogOut();
//    }

//    @And("log out of MWL")
//    public void logOutOfMWL() {
//        homepage.LogOut();
//    }

//    public void log out of_MWL() {
//        // Write code here that turns the phrase above into concrete actions
////        throw new cucumber.api.PendingException();
//        homepage.LogOut();
//    }
//    @Then("log out of MWL")
//    public void log_out_of_MWL() {
//        // Write code here that turns the phrase above into concrete actions
////        throw new cucumber.api.PendingException();
//        homepage.LogOut();
//    }
}
