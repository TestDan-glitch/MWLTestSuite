package starter.stepdefinitions.employeeLevel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import navigation.MWLNavigateTo;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import pages.LoginPage;
import pages.employeeLevel.MyRotaPage;
import pages.employeeLevel.MyTimeOffPage;

public class myRotaSteps {
    @Steps
    MWLNavigateTo mwlNavigateTo;
    LoginPage loginpage;
    HomePage homepage;
    MyTimeOffPage myTimeOffPage;
    MyRotaPage myRotaPage;

    @Given("an Admin logs into My Working Life logs into My Working Life")
    public void anAdminLogsIntoMyWorkingLifeLogsIntoMyWorkingLife() throws InterruptedException {
        mwlNavigateTo.theMWLHomePage();
        loginpage.Login("Matthew Regis", "Myoldpass12!!");
        loginpage.ClickLogin();
        homepage.CheckAdminPage();
    }

    @When("they go to the My Rota screen")
    public void theEmployeeGoesToTheMyRotaScreen() {
        homepage.ClickMyRotaBtn();
    }

    @And("the Employee selects today's date as the day")
    public void selectsTodaySAsADayToWorkFromHome() throws InterruptedException {
        myRotaPage.ClickTodayAsWFHForEmployee();
    }

    @And("the Admin selects today's date as the day")
    public void theAdminSelectsTodaySDateAsTheDay() throws InterruptedException {
        myRotaPage.ClickTodayAsWFHForAdmin();
    }

    @Then("the day will be confirmed as a working from home")
    public void theDayWillBeConfirmedAsAWorkingFromHome() throws InterruptedException {
        myRotaPage.CheckDayIsWorkingFromHome();
    }

    @Then("the day will be confirmed as a working from the office")
    public void theDayWillBeConfirmedAsAWorkingFromTheOffice() throws InterruptedException {
        myRotaPage.CheckDayIsWorkingFromOffice();
    }
}
