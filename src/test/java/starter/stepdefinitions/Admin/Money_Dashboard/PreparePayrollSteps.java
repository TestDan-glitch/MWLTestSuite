package starter.stepdefinitions.Admin.Money_Dashboard;

import cucumber.api.java.en.When;
import navigation.MWLNavigateTo;
import net.thucydides.core.annotations.Steps;
import pages.Admin.Absence_Dashboard.AbsenceDashboardPage;
import pages.Admin.Absence_Dashboard.AbsencePage;
import pages.Admin.Money_Dashboard.Money_DashboardPage;
import pages.Admin.Money_Dashboard.PreparePayrollPage;
import pages.Admin.TrainingAndDevelopment_Dashboard.ClientTimePage;
import pages.HomePage;
import pages.LoginPage;

public class PreparePayrollSteps {
    @Steps
    MWLNavigateTo mwlNavigateTo;
    LoginPage loginpage;
    HomePage homepage;
    ClientTimePage traininganddev;
    AbsenceDashboardPage absenceDashboardPage;
    AbsencePage absencePage;
    Money_DashboardPage money_dashboardPage;

    PreparePayrollPage preparePayrollPage;

//    @And("enters the loan agreements information")
//    public void entersTheLoanAgreementsInformation() throws InterruptedException {
//        loanAgreementsPage.ClickAddNewLoanAgreementBtn();
//        loanAgreementsPage.SelectEmployeeName();
//        loanAgreementsPage.EnterStartDate();
//        loanAgreementsPage.EnterLoanAmount();
//    }
//
//    @Then("save the loan agreement")
//    public void saveTheLoanAgreement() throws InterruptedException {
//        loanAgreementsPage.ClickSubmitBtn();
//    }

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

//    @And("log out of My Working Life")
//    public void logOutOfMyWorkingLife() {
//        homepage.LogOut();
//    }

    @When("the Admin goes to the Prepare Payroll screen")
    public void theAdminGoesToThePreparePayrollScreen() {
        homepage.ClickMoneyDashboardBtn();
        money_dashboardPage.ClickPreparePayrollBtn();
    }


}
