package pages.employeeLevel;

import assets.bookDate;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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

    bookDate theDate = new bookDate();

    public void ClickRequestDaysOffBtn() throws InterruptedException {
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
        TurnToNextMonth.click();
    }

    public void ClickPickCalendarDay() throws InterruptedException {
            try {
                WebElement date = getDriver().findElement(By.xpath("//div[@data-date='"+theDate.getDate()+"']"));
                date.click();
            }
            catch(org.openqa.selenium.StaleElementReferenceException ex)
            {
                WebElement date = getDriver().findElement(By.xpath("//div[@data-date='"+theDate.getDate()+"']"));
                date.click();
            }
        getDriver().findElement(By.xpath("//input[@value='Request']")).click();
    }

    public void SelectEmployee() throws InterruptedException {
        getDriver().findElement(By.name("Id")).click();
        new Select(getDriver().findElement(By.name("Id"))).selectByVisibleText("Naomi Lloyd (DO NOT USE)");
    }

    public void CheckForConflictWarning() throws InterruptedException {
        getDriver().findElement(By.id("validationWarning")).isDisplayed();
    }

    public void ClickCancelBtn() throws InterruptedException {
        getDriver().findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
        getDriver().findElement(By.linkText("Yes")).click();
    }
}
