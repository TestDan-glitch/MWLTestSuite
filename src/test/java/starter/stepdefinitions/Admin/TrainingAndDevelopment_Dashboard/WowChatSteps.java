package starter.stepdefinitions.Admin.TrainingAndDevelopment_Dashboard;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import navigation.MWLNavigateTo;
import net.thucydides.core.annotations.Steps;
import pages.Admin.TrainingAndDevelopment_Dashboard.TrainingAndDevelopment_DashboardPage;
import pages.Admin.TrainingAndDevelopment_Dashboard.WowChatPage;
import pages.MyTimeOffPage;
import pages.Admin.TrainingAndDevelopment_Dashboard.ClientTimePage;
import pages.HomePage;
import pages.LoginPage;

public class WowChatSteps {
    @Steps
    MWLNavigateTo mwlNavigateTo;
    LoginPage loginpage;
    HomePage homepage;
    MyTimeOffPage myTimeOffPage;
    TrainingAndDevelopment_DashboardPage trainingAndDevelopment_dashboardPage;
    ClientTimePage clientTimePage;
    WowChatPage wowChatPage;

    @When("the Admin goes to the WOW Chat screen")
    public void theAdminGoesToTheWOWChatScreen() {
        homepage.ClickTrainingAndDevBtn();
        trainingAndDevelopment_dashboardPage.ClickWowChatBtn();
    }

    @And("enters WOW Chat information")
    public void entersWOWChatInformation() throws InterruptedException {
        clientTimePage.EnterClientTimeSlotInfo();
    }

    @And("edits a WOW Chat Slot")
    public void editsAWOWChatSlot() throws InterruptedException {
        wowChatPage.EditWowSlotSlot();
        clientTimePage.ClickSaveBtn();
    }

    @Then("delete a WOW Chat Slot")
    public void deleteAWOWChatSlot() {
        wowChatPage.ClickDeleteBtn();
    }
}
