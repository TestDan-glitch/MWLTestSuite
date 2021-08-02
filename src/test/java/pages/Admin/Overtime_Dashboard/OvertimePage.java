package pages.Admin.Overtime_Dashboard;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class OvertimePage extends UIInteractionSteps{
    @Managed
    WebDriver driver;

    @FindBy(how = How.LINK_TEXT, using = "Add Availability")
    public WebElement AddAvailabilityBtn;

    @FindBy(how = How.LINK_TEXT, using = "Edit")
    public WebElement EditBtn;

    @FindBy(how = How.ID, using = "AddModel_StartTime_Hours")
    public WebElement StartTimeHoursDowndropBox;

    @FindBy(how = How.ID, using = "AddModel_StartTime_Minutes")
    public WebElement StartTimeMinutesDowndropBox;

    @FindBy(how = How.ID, using = "AddModel_EndTime_Hours")
    public WebElement EndTimeHoursDowndropBox;

    @FindBy(how = How.ID, using = "AddModel_EndTime_Minutes")
    public WebElement EndTimeMinutesDowndropBox;

    @FindBy(how = How.ID, using = "AddModel_ShiftsRequired")
    public WebElement ShiftsRequiredField;

    @FindBy(how = How.ID, using = "EditModel_StartTime_Hours")
    public WebElement EditStartTimeHoursDowndropBox;

    @FindBy(how = How.ID, using = "EditModel_StartTime_Minutes")
    public WebElement EditStartTimeMinutesDowndropBox;

    @FindBy(how = How.ID, using = "EditModel_EndTime_Hours")
    public WebElement EditEndTimeHoursDowndropBox;

    @FindBy(how = How.ID, using = "EditModel_EndTime_Minutes")
    public WebElement EditEndTimeMinutesDowndropBox;

    @FindBy(how = How.ID, using = "EditModel_ShiftsRequired")
    public WebElement EditShiftsRequiredField;

    @FindBy(how = How.ID, using = "EditModel_TypeId")
    public WebElement EditTypeDrowndownBox;

    @FindBy(how = How.ID, using = "EditModel_LunchId")
    public WebElement EditLunchDrowndownBox;

    @FindBy(how = How.ID, using = "AddModel_TypeId")
    public WebElement TypeDrowndownBox;

    @FindBy(how = How.ID, using = "AddModel_LunchId")
    public WebElement LunchDrowndownBox;

    @FindBy(how = How.XPATH, using = "//input[@value='Add']")
    public WebElement AddBtn;

    @FindBy(how = How.XPATH, using = "//input[@value='Save']")
    public WebElement SaveBtn;

    @FindBy(how = How.LINK_TEXT, using = "Delete")
    public WebElement DeleteBtn;

    public void EnterOvertimeAvailability() {
        AddAvailabilityBtn.click();
        StartTimeHoursDowndropBox.click();
        new Select(getDriver().findElement(By.id("AddModel_StartTime_Hours"))).selectByVisibleText("17");
        StartTimeMinutesDowndropBox.click();
        new Select(getDriver().findElement(By.id("AddModel_StartTime_Minutes"))).selectByVisibleText("30");
        EndTimeHoursDowndropBox.click();
        new Select(getDriver().findElement(By.id("AddModel_EndTime_Hours"))).selectByVisibleText("22");
        EndTimeMinutesDowndropBox.click();
        new Select(getDriver().findElement(By.id("AddModel_EndTime_Minutes"))).selectByVisibleText("30");
        ShiftsRequiredField.click();
        ShiftsRequiredField.sendKeys("1");
        TypeDrowndownBox.click();
        new Select(getDriver().findElement(By.id("AddModel_TypeId"))).selectByVisibleText("Overtime Reason Test");
        LunchDrowndownBox.click();
        new Select(getDriver().findElement(By.id("AddModel_LunchId"))).selectByVisibleText("18:00 (45 mins + 15 mins break)");
    }

    public void EditOvertimeAvailability() throws InterruptedException {
        EditBtn.click();
        EditStartTimeHoursDowndropBox.click();
        new Select(getDriver().findElement(By.id("EditModel_StartTime_Hours"))).selectByVisibleText("18");
        EditStartTimeMinutesDowndropBox.click();
        new Select(getDriver().findElement(By.id("EditModel_StartTime_Minutes"))).selectByVisibleText("45");
        EditEndTimeHoursDowndropBox.click();
        new Select(getDriver().findElement(By.id("EditModel_EndTime_Hours"))).selectByVisibleText("23");
        EditEndTimeMinutesDowndropBox.click();
        new Select(getDriver().findElement(By.id("EditModel_EndTime_Minutes"))).selectByVisibleText("15");
        EditShiftsRequiredField.click();
        EditShiftsRequiredField.clear();
        EditShiftsRequiredField.sendKeys("2");
        EditTypeDrowndownBox.click();
        new Select(getDriver().findElement(By.id("EditModel_TypeId"))).selectByVisibleText("This is a test overtime reason");
        EditTypeDrowndownBox.click();
        EditLunchDrowndownBox.click();
        new Select(getDriver().findElement(By.id("EditModel_LunchId"))).selectByVisibleText("18:00 (45 mins)");
        EditLunchDrowndownBox.click();
        SaveBtn.click();
    }

    public void ClickAddBtn() throws InterruptedException {
        AddBtn.click();
    }

    public void ClickDeleteBtn() throws InterruptedException {
        DeleteBtn.click();
    }




//    public void DeleteBookedAbsence() throws InterruptedException {
//        DeleteBtn.click();
//        withTimeoutOf(Duration.ofSeconds(30)).find(By.xpath("//button[@type='button']")).click();
//    }


}
