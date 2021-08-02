package starter.stepdefinitions.Admin.Absence_Dashboard;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import navigation.MWLNavigateTo;
import net.thucydides.core.annotations.Steps;
import pages.*;
import pages.Admin.Absence_Dashboard.AbsenceDashboardPage;
import pages.Admin.Absence_Dashboard.AbsencePage;
import pages.Admin.TrainingAndDevelopment_Dashboard.ClientTimePage;

public class AbsenceSteps {
    @Steps
    MWLNavigateTo mwlNavigateTo;
    LoginPage loginpage;
    HomePage homepage;
    MyTimeOffPage myTimeOffPage;
    ClientTimePage traininganddev;
    AbsenceDashboardPage absenceDashboardPage;
    AbsencePage absencePage;

    @When("the Admin goes to the Absence screen")
    public void the_Admin_goes_to_the_Absence_screen() throws InterruptedException {
        homepage.ClickAbsenceDashboardBtn();
        absenceDashboardPage.ClickAbsenceBtn();
    }

    @And("enters absence information")
    public void entersAbsenceInformation() throws InterruptedException {
        absencePage.ClickAddAbsenceBtn();
        absencePage.EnterAbsenceInformation();
    }

    @Then("book the absence")
    public void bookTheAbsence() throws InterruptedException {
        absencePage.SaveEnteredAbsenceInformation();
    }

    @And("delete an absence")
    public void deleteAnAbsence() throws InterruptedException {
        absencePage.DeleteBookedAbsence();
    }

    @And("edits an absence")
    public void editsAnAbsence() throws InterruptedException {
        absencePage.EditABookedAbsence();
    }
}
