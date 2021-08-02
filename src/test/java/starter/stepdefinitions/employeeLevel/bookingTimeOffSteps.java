package starter.stepdefinitions.employeeLevel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import navigation.MWLNavigateTo;
import pages.employeeLevel.MyTimeOffPage;
import pages.HomePage;
import pages.LoginPage;

public class bookingTimeOffSteps{
    @Steps
    MWLNavigateTo mwlNavigateTo;
    LoginPage loginpage;
    HomePage homepage;
    MyTimeOffPage myTimeOffPage;

    @Given("an employee logs into My Working Life")
    public void an_employee_logs_into_My_Working_Life() throws InterruptedException {
        mwlNavigateTo.theMWLHomePage();
        loginpage.Login("Naomi Lloyd", "Myoldpass12!!");
        loginpage.ClickLogin();
        homepage.CheckEmployeePage();
    }

    @When("the employee goes to the holiday request screen")
    public void the_employee_goes_to_the_holiday_request_screen() {
        homepage.ClickMyTimeOffBtn();
    }

    @When("the employee goes to the Lieu request screen")
    public void theEmployeeGoesToTheLieuRequestScreen() throws InterruptedException {
        homepage.ClickMyTimeOffBtn();
        myTimeOffPage.ClickLieuBtn();
        myTimeOffPage.ClickRequestLieuDaysOffBtn();
    }

    @When("selects a day to book off")
    public void selects_a_day_to_book_off() throws InterruptedException {
        myTimeOffPage.ClickRequestDaysOffBtn();
    }

    @Then("books the Time Off")
    public void books_the_Time_Off() throws InterruptedException {
        myTimeOffPage.ClickPickCalendarDay();
    }

    @Then("the employee fails to book the same day again")
    public void the_employee_fails_to_book_the_same_day_again() throws InterruptedException {
        myTimeOffPage.ClickPickCalendarDay();
        myTimeOffPage.CheckForConflictWarning();
    }

    @Then("cancels a booked holiday")
    public void cancelsABookedHoliday() throws InterruptedException {
        myTimeOffPage.ClickCancelBtn();
    }

    @When("the employee goes to the Appointment request screen")
    public void theEmployeeGoesToTheAppointmentRequestScreen() {
        homepage.ClickMyTimeOffBtn();
        myTimeOffPage.ClickAppointmentBtn();
        myTimeOffPage.ClickRequestAppointmentBtn();
    }

    @Then("cancels the booked Time In Lieu")
    public void cancelsTheBookedTimeInLieu() throws InterruptedException {
        myTimeOffPage.ClickCancelBtn();
    }

    @And("enters Reason for the Appointment")
    public void entersReasonForTheAppointment() {
        myTimeOffPage.EnterAReasonForAnAppointment();
    }

    @And("enters Notes about the Appointment")
    public void entersNotesAboutTheAppointment() {
        myTimeOffPage.EnterANote();
    }

    @Then("cancels the booked Appointment")
    public void cancelsTheBookedAppointment() throws InterruptedException {
        myTimeOffPage.ClickCancelBtn();
    }

    @And("select an employee")
    public void selectAnEmployee() throws InterruptedException {
        myTimeOffPage.SelectEmployee();
    }
}
