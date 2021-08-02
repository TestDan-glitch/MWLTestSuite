package starter.stepdefinitions.Admin.Absence_Dashboard;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import navigation.MWLNavigateTo;
import net.thucydides.core.annotations.Steps;
import pages.Admin.Absence_Dashboard.AbsenceDashboardPage;
import pages.Admin.Absence_Dashboard.AbsencePage;
import pages.Admin.Absence_Dashboard.AbsenceReasonsPage;
import pages.Admin.TrainingAndDevelopment_Dashboard.ClientTimePage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyTimeOffPage;

public class AbsenceReasonsSteps {
    @Steps
    MWLNavigateTo mwlNavigateTo;
    LoginPage loginpage;
    HomePage homepage;
    MyTimeOffPage myTimeOffPage;
    ClientTimePage traininganddev;
    AbsenceDashboardPage absenceDashboardPage;
    AbsencePage absencePage;
    AbsenceReasonsPage absenceReasonsPage;

    @When("the Admin goes to the Absence Reasons screen")
    public void theAdminGoesToTheAbsenceReasonsScreen() throws InterruptedException {
        homepage.ClickAbsenceDashboardBtn();
        absenceDashboardPage.ClickAbsenceReasonsBtn();
    }

    @And("enters absence reason information")
    public void entersAbsenceReasonInformation() throws InterruptedException {
        absenceReasonsPage.ClickAddReasonBtn();
        absenceReasonsPage.SelectAbsenceType();
        absenceReasonsPage.EnterAbsenceReasonDetailsField();
        absenceReasonsPage.TickAllowPayForThisAbsenceIfThisIsTickedCheckBox();
        absenceReasonsPage.TickNoBFPointsAddedForThisAbsenceIfThisIsTickedCheckBox();
        absenceReasonsPage.TickStillGetTrophyIfThisIsTickedCheckBox();
        absenceReasonsPage.TickActiveCheckBox();
    }

    @And("save the absence reason")
    public void saveTheAbsenceReason() {
        absenceReasonsPage.ClickAddBtn();
//            homepage.LogOut();
    }

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

//    @Then("log out of MWL")
//    public void log_out_of_MWL() {
//        homepage.LogOut();
//    }
}

