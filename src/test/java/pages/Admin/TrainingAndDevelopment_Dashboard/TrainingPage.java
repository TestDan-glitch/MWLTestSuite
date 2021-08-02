package pages.Admin.TrainingAndDevelopment_Dashboard;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TrainingPage extends UIInteractionSteps {
    @Managed
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//p[text()='This is where you can book in Training slots and view scheduled slots.']")
    public WebElement TrainingBtn;

    @FindBy(how = How.LINK_TEXT, using = "Add For User")
    public WebElement AddForUserBtn;

    @FindBy(how = How.LINK_TEXT, using = "Edit")
    public WebElement EditBtn;

    @FindBy(how = How.LINK_TEXT, using = "Delete")
    public WebElement DeleteBtn;

    @FindBy(how = How.ID, using = "UserId")
    public WebElement EmployeeNameDropdownBox;

    @FindBy(how = How.ID, using = "StartTime_Hours")
    public WebElement StartTimeHoursDropdownBox;

    @FindBy(how = How.ID, using = "StartTime_Minutes")
    public WebElement StartTimeMinutesDropdownBox;

    @FindBy(how = How.ID, using = "EndTime_Hours")
    public WebElement EndTimeHoursDropdownBox;

    @FindBy(how = How.ID, using = "EndTime_Minutes")
    public WebElement EndTimeMinutesDropdownBox;

    @FindBy(how = How.ID, using = "AdditionalInformation")
    public WebElement AdditionalInformationField;

    @FindBy(how = How.ID, using = "submitButton")
    public WebElement SaveBtn;

    public void ClickTrainingBtn() {
        TrainingBtn.click();
    }

    public void EnterClientTimeSlotInfo() throws InterruptedException {
        EmployeeNameDropdownBox.click();
        new Select(getDriver().findElement(By.id("UserId"))).selectByVisibleText("Naomi Lloyd (DO NOT USE)");
        EmployeeNameDropdownBox.click();

        StartTimeHoursDropdownBox.click();
        new Select(getDriver().findElement(By.id("StartTime_Hours"))).selectByVisibleText("13");
        StartTimeHoursDropdownBox.click();

        StartTimeMinutesDropdownBox.click();
        new Select(getDriver().findElement(By.id("StartTime_Minutes"))).selectByVisibleText("15");
        StartTimeMinutesDropdownBox.click();

        EndTimeHoursDropdownBox.click();
        new Select(getDriver().findElement(By.id("EndTime_Hours"))).selectByVisibleText("14");
        EndTimeHoursDropdownBox.click();

        EndTimeMinutesDropdownBox.click();
        new Select(getDriver().findElement(By.id("EndTime_Minutes"))).selectByVisibleText("25");
        EndTimeMinutesDropdownBox.click();
    }

    public void EditClientTimeSlot() throws InterruptedException {
        EditBtn.click();
        EmployeeNameDropdownBox.click();
        new Select(getDriver().findElement(By.id("UserId"))).selectByVisibleText("Naomi Lloyd (DO NOT USE)");
        EmployeeNameDropdownBox.click();

        StartTimeHoursDropdownBox.click();
        new Select(getDriver().findElement(By.id("StartTime_Hours"))).selectByVisibleText("14");
        StartTimeHoursDropdownBox.click();

        StartTimeMinutesDropdownBox.click();
        new Select(getDriver().findElement(By.id("StartTime_Minutes"))).selectByVisibleText("35");
        StartTimeMinutesDropdownBox.click();

        EndTimeHoursDropdownBox.click();
        new Select(getDriver().findElement(By.id("EndTime_Hours"))).selectByVisibleText("15");
        EndTimeHoursDropdownBox.click();

        EndTimeMinutesDropdownBox.click();
        new Select(getDriver().findElement(By.id("EndTime_Minutes"))).selectByVisibleText("5");
        EndTimeMinutesDropdownBox.click();
    }

    public void EnterAdditionalInformation() {
        AdditionalInformationField.click();
        AdditionalInformationField.sendKeys("Test Additional Information");
    }

    public void EditAdditionalInformation() {
        AdditionalInformationField.click();
        AdditionalInformationField.clear();
        AdditionalInformationField.sendKeys("EDITED Test Additional Information");
    }

    public void ClickDeleteBtn() {
        DeleteBtn.click();
        withTimeoutOf(Duration.ofSeconds(30)).find(By.xpath("//button[@type='button']")).click();
    }

    public void ClickSaveBtn() {
        SaveBtn.click();
    }
}
