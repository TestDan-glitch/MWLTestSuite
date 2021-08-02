package starter.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import navigation.MWLNavigateTo;
import pages.HomePage;
import pages.LoginPage;

public class loginSteps {


    @Steps
    MWLNavigateTo mwlNavigateTo;

    @Steps
    LoginPage loginpage;

    @Steps
    HomePage homepage;

    @Given("I navigate to MWL")
    public void iNavigateToMWL() {
        mwlNavigateTo.theMWLHomePage();
    }

    @When("I enter my Admin User credentials")
    public void iEnterMyAdminUserCredentials() {
        loginpage.Login("Matthew Regis","Myoldpass12!!");
    }

    @When("I enter my Employee credentials")
    public void iEnterMyEmployeeCredentials() {
        loginpage.Login("Naomi Lloyd","Myoldpass12!!");
    }

    @Then("the Admin User will be logged in")
    public void theAdminUserWillBeLoggedIn() throws InterruptedException {
        loginpage.ClickLogin();
        homepage.CheckAdminPage();
    }

    @Then("the Employee will be logged in")
    public void theEmployeeWillBeLoggedIn() throws InterruptedException {
        loginpage.ClickLogin();
        homepage.CheckEmployeePage();
    }

    @And("log out of MWL")
    public void logOutOfMWL() throws InterruptedException {
        homepage.LogOut();
    }
}
