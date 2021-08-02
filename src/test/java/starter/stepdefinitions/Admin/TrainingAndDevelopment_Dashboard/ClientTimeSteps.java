package starter.stepdefinitions.Admin.TrainingAndDevelopment_Dashboard;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import navigation.MWLNavigateTo;
import net.thucydides.core.annotations.Steps;
import pages.Admin.TrainingAndDevelopment_Dashboard.ClientTimePage;
import pages.Admin.TrainingAndDevelopment_Dashboard.TrainingAndDevelopment_DashboardPage;
import pages.Admin.TrainingAndDevelopment_Dashboard.WowChatPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyTimeOffPage;

import javax.swing.table.TableRowSorter;

public class ClientTimeSteps {
    @Steps
    MWLNavigateTo mwlNavigateTo;
    LoginPage loginpage;
    HomePage homepage;
    TrainingAndDevelopment_DashboardPage trainingAndDevelopment_dashboardPage;
    ClientTimePage clientTimePage;
    WowChatPage wowChatPage;

    @Given("an Admin logs into My Working Life")
    public void anAdminLogsIntoMyWorkingLife() throws InterruptedException {
        mwlNavigateTo.theMWLHomePage();
        loginpage.Login("Matthew Regis", "Myoldpass12!!");
//        loginpage.Login("Matthew Regis", "Myoldpass12!!");
        loginpage.ClickLogin();
        homepage.CheckAdminPage();
    }

    @When("the Admin goes to the Client Time screen")
    public void theAdminGoesToTheClientTimeScreen() {
        homepage.ClickTrainingAndDevBtn();
        trainingAndDevelopment_dashboardPage.ClickClientTimeBtn();
    }

    @And("enters Client Time Slot information")
    public void entersClientTimeSlotInformation() throws InterruptedException {
        clientTimePage.EnterClientTimeSlotInfo();
    }

    @And("edits a Client Time Slot")
    public void editsAClientTimeSlot() throws InterruptedException {
        clientTimePage.EditClientTimeSlot();
        clientTimePage.ClickSaveBtn();
    }

    @Then("delete a Client Time Slot")
    public void deleteAClientTimeSlot() {
        clientTimePage.ClickDeleteBtn();
    }

    @Then("books the Slot")
    public void booksTheSlot() throws InterruptedException {
//        wowChatPage.EditWowSlotSlot();
        clientTimePage.ClickSaveBtn();
    }
}
