package starter.stepdefinitions.Admin.TrainingAndDevelopment_Dashboard;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import navigation.MWLNavigateTo;
import net.thucydides.core.annotations.Steps;
import pages.Admin.TrainingAndDevelopment_Dashboard.ClientTimePage;
import pages.Admin.TrainingAndDevelopment_Dashboard.TrainingAndDevelopment_DashboardPage;
import pages.Admin.TrainingAndDevelopment_Dashboard.TrainingPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyTimeOffPage;

public class TrainingSteps {
    @Steps
    MWLNavigateTo mwlNavigateTo;
    LoginPage loginpage;
    HomePage homepage;
    MyTimeOffPage myTimeOffPage;
    TrainingAndDevelopment_DashboardPage trainingAndDevelopment_dashboardPage;
    ClientTimePage clientTimePage;
    TrainingPage trainingPage;

//    @Given("an Admin logs into My Working Life")
//    public void anAdminLogsIntoMyWorkingLife() throws InterruptedException {
//        mwlNavigateTo.theMWLHomePage();
//        loginpage.Login("Matthew Regis", "Myoldpass12!!");
//        loginpage.ClickLogin();
//        homepage.CheckAdminPage();
//    }

    @When("the Admin goes to the Training screen")
    public void theAdminGoesToTheTrainingScreen() {
        homepage.ClickTrainingAndDevBtn();
        trainingAndDevelopment_dashboardPage.ClickTrainingBtnBtn();
    }

    @And("enters Training Slot information")
    public void entersTrainingSlotInformation() throws InterruptedException {
        clientTimePage.EnterClientTimeSlotInfo();
    }

    @And("edits a Training Slot")
    public void editsATrainingSlot() throws InterruptedException {
        clientTimePage.EditClientTimeSlot();
        clientTimePage.ClickSaveBtn();
    }

    @Then("delete a Training Slot")
    public void deleteATrainingSlot() {
        trainingPage.ClickDeleteBtn();
    }
}
