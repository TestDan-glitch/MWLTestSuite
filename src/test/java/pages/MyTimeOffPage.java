package pages;

import io.cucumber.stepexpression.DataTableArgument;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.eclipse.jetty.util.component.Container;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class MyTimeOffPage extends UIInteractionSteps {
    @Managed
    WebDriver driver;

    @FindBy(how = How.ID, using = "RequestDaysOff")
    public WebElement RequestDaysOffBtn;

    @FindBy(how = How.ID, using = "Lieu")
    public WebElement LieuBtn;

    @FindBy(how = How.ID, using = "RequestLieuDaysOff")
    public WebElement RequestLieuDaysOffBtn;

    @FindBy(how = How.XPATH, using = "(xpath=//div[@data-date='3']")
    public WebElement PickCalendarDay;

    @FindBy(how = How.CSS, using = ".datepicker--nav-action:nth-child(3) path")
    public WebElement TurnToNextMonth;

    @FindBy(how = How.ID, using = "Appointment")
    public WebElement AppointmentBtn;

    @FindBy(how = How.ID, using = "RequestAppointment")
    public WebElement RequestAppointmentBtn;

    @FindBy(how = How.ID, using = "ReasonId")
    public WebElement ReasonIdDropdownBox;

    @FindBy(how = How.ID, using = "Notes")
    public WebElement NotesField;

    public void ClickRequestDaysOffBtn() throws InterruptedException {
//        Thread.sleep(5000);
        RequestDaysOffBtn.click();
    }

    public void ClickLieuBtn() {
        LieuBtn.click();
    }

    public void ClickRequestLieuDaysOffBtn() throws InterruptedException {
        RequestLieuDaysOffBtn.click();
    }

    public void ClickAppointmentBtn() {
        AppointmentBtn.click();
    }

    public void ClickRequestAppointmentBtn() {
        RequestAppointmentBtn.click();
    }

    public void EnterAReasonForAnAppointment() {
        ReasonIdDropdownBox.click();
        new Select(getDriver().findElement(By.id("ReasonId"))).selectByVisibleText("Doctor");
    }

    public void EnterANote() {
        NotesField.click();
        NotesField.clear();
        NotesField.sendKeys("Test Appointment");
    }

    public void ClickTurnToNextMonth() {
//        webDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        TurnToNextMonth.click();
    }

    public void ClickPickCalendarDay() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-date='20']")));
            try {
                WebElement date = getDriver().findElement(By.xpath("//div[@data-date='20']"));
                date.click();
            }
            catch(org.openqa.selenium.StaleElementReferenceException ex)
            {
                WebElement date = getDriver().findElement(By.xpath("//div[@data-date='20']"));
                date.click();
            }
        getDriver().findElement(By.xpath("//input[@value='Request']")).click();
    }

    public void CheckForConflictWarning() throws InterruptedException {
        getDriver().findElement(By.id("validationWarning")).isDisplayed();
    }

    public void ClickCancelBtn() throws InterruptedException {
        getDriver().findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
        getDriver().findElement(By.linkText("Yes")).click();
    }
}
