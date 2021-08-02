package pages.adminLevel.Absence_Dashboard;

import assets.bookDate;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AbsencePage extends UIInteractionSteps{
    @Managed
    WebDriver driver;

    @FindBy(how = How.LINK_TEXT, using = "Add Absence")
    public WebElement AddAbsenceBtn;

    @FindBy(how = How.ID, using = "PersonId")
    public WebElement EmployeeNameDropdownBox;

    @FindBy(how = How.ID, using = "ReasonId")
    public WebElement AbsenceReasonDropdownBox;

    @FindBy(how = How.ID, using = "StartDate")
    public WebElement AbsenceStartDateDropdownBox;

    @FindBy(how = How.ID, using = "EndDate")
    public WebElement AbsenceEndDateDropdownBox;

    @FindBy(how = How.ID, using = "Notes")
    public WebElement NotesField;

    @FindBy(how = How.ID, using = "submitButton")
    public WebElement AddBtn;

    @FindBy(how = How.LINK_TEXT, using = "Delete")
    public WebElement DeleteBtn;

    @FindBy(how = How.LINK_TEXT, using = "Edit")
    public WebElement EditBtn;

    @FindBy(how = How.ID, using = "returnedCheck")
    public WebElement ReturnToWorkCheckBox;

    @FindBy(how = How.ID, using = "rtwForm")
    public WebElement RTWFormCompletedCheckBox;

    @FindBy(how = How.ID, using = "bradfordCheck")
    public WebElement NoBFPointsAddedForThisAbsenceCheckBox;

    @FindBy(how = How.ID, using = "trophyCheck")
    public WebElement trophyCheckCheckBox;

    @FindBy(how = How.ID, using = "paidCheck")
    public WebElement paidCheckCheckBox;

    bookDate bookingDate = new bookDate();

    public void ClickAddAbsenceBtn() {
        AddAbsenceBtn.click();
    }

    public void EnterAbsenceInformation() throws InterruptedException {
        EmployeeNameDropdownBox.sendKeys(Keys.ARROW_DOWN);
        new Select(getDriver().findElement(By.id("PersonId"))).selectByVisibleText("Naomi Lloyd (DO NOT USE)");
        EmployeeNameDropdownBox.click();

        AbsenceReasonDropdownBox.click();
        new Select(getDriver().findElement(By.id("ReasonId"))).selectByVisibleText("Sickness/Illness - Sick/Illness");
        AbsenceReasonDropdownBox.click();

        AbsenceStartDateDropdownBox.click();
        String day = bookingDate.getDay();
        String month = bookingDate.getMonth();

        getDriver().findElement(By.id("StartDate")).sendKeys(""+day+"-"+month+"-2021");

        AbsenceEndDateDropdownBox.click();
        getDriver().findElement(By.id("EndDate")).sendKeys(""+day+"-"+month+"-2021");

        NotesField.click();
        getDriver().findElement(By.id("Notes")).sendKeys("Testing the booking of an Absence");
    }

    public void SaveEnteredAbsenceInformation() throws InterruptedException {
        AddBtn.click();
//        Thread.sleep(5000);
    }

    public void EditABookedAbsence() throws InterruptedException {
        EditBtn.click();

        AbsenceReasonDropdownBox.click();
        new Select(getDriver().findElement(By.id("ReasonId"))).selectByVisibleText("Unpaid - Emergency Leave");
        AbsenceReasonDropdownBox.click();

        NotesField.click();
        getDriver().findElement(By.id("Notes")).clear();
        getDriver().findElement(By.id("Notes")).sendKeys("EDITED Testing the booking of an Absence");

        ReturnToWorkCheckBox.click();
        RTWFormCompletedCheckBox.click();
        NoBFPointsAddedForThisAbsenceCheckBox.click();
        trophyCheckCheckBox.click();
        paidCheckCheckBox.click();

        AddBtn.submit();
    }

    public void DeleteBookedAbsence() throws InterruptedException {
    try {
            WebElement date = getDriver().findElement(org.openqa.selenium.By.linkText("Delete"));
            date.click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            WebElement date = getDriver().findElement(org.openqa.selenium.By.linkText("Delete"));
            date.click();
        }
        withTimeoutOf(Duration.ofSeconds(30)).find(By.xpath("//button[@type='button']")).click();
    }
}
