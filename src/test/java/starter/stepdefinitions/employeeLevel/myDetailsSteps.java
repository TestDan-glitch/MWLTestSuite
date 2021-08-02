package starter.stepdefinitions.employeeLevel;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import navigation.MWLNavigateTo;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import pages.LoginPage;
import pages.employeeLevel.MyDetailsPage;

public class myDetailsSteps {
    @Steps
    MWLNavigateTo mwlNavigateTo;
    LoginPage loginpage;
    HomePage homepage;
    MyDetailsPage myDetailsPage;

    @When("the employee goes to the My Details screen")
    public void theEmployeeGoesToTheMyDetailsScreen() {
        homepage.ClickMyDetailsBtn();
    }

    @Then("edit employee's details")
    public void editEmployeeSDetails() throws InterruptedException {
        myDetailsPage.ChangeTitle();
    }
}
