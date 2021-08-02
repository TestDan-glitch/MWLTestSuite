package pages.employeeLevel;

import assets.bookDate;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class MyDetailsPage extends UIInteractionSteps {
    @Managed
    WebDriver driver;

    @FindBy(how = How.ID, using = "Person_Title")
    public WebElement TitleBtn;

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

    bookDate bookingDate = new bookDate();

    public void ChangeTitle() throws InterruptedException {
        TitleBtn.click();
        new Select(driver.findElement(By.id("Person_Title"))).selectByVisibleText("Mrs");
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
        TurnToNextMonth.click();
    }

    public void ClickPickCalendarDay() throws InterruptedException {
            try {
                WebElement date = getDriver().findElement(By.xpath("//div[@data-date='"+bookingDate.getDate()+"']"));
                date.click();
            }
            catch(StaleElementReferenceException ex)
            {
                WebElement date = getDriver().findElement(By.xpath("//div[@data-date='"+bookingDate.getDate()+"']"));
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
