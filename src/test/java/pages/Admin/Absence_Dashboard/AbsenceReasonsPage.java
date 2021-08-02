package pages.Admin.Absence_Dashboard;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AbsenceReasonsPage extends UIInteractionSteps{
    @Managed
    WebDriver driver;

    @FindBy(how = How.LINK_TEXT, using = "Add Reason")
    public WebElement AddReasonBtn;

    @FindBy(how = How.ID, using = "TypeId")
    public WebElement AbsenceTypeDropdownBox;

    @FindBy(how = How.ID, using = "Detail")
    public WebElement AbsenceReasonDetailField;

    @FindBy(how = How.ID, using = "paidCheck")
    public WebElement AllowPayForThisAbsenceIfThisIsTickedCheckBox;

    @FindBy(how = How.ID, using = "ExcludeBradford")
    public WebElement NoBFPointsAddedForThisAbsenceIfThisIsTickedCheckBox;

    @FindBy(how = How.ID, using = "ExcludeTrophies")
    public WebElement StillGetTrophyIfThisIsTickedCheckBox;

    @FindBy(how = How.ID, using = "Active")
    public WebElement ActiveCheckBox;

    @FindBy(how = How.ID, using = "submitButton")
    public WebElement AddBtn;

    public void ClickAddReasonBtn() {
        AddReasonBtn.click();
    }

    public void SelectAbsenceType() throws InterruptedException {
        AbsenceTypeDropdownBox.click();
        new Select(getDriver().findElement(By.id("TypeId"))).selectByVisibleText("Unpaid");
        AbsenceTypeDropdownBox.click();
    }

    public void EnterAbsenceReasonDetailsField() throws InterruptedException {
        AbsenceReasonDetailField.click();
        AbsenceReasonDetailField.sendKeys("Test Absence Reason Details");
        Thread.sleep(5000);
    }

    public void TickAllowPayForThisAbsenceIfThisIsTickedCheckBox() {
        AllowPayForThisAbsenceIfThisIsTickedCheckBox.click();
    }

    public void TickNoBFPointsAddedForThisAbsenceIfThisIsTickedCheckBox() {
        NoBFPointsAddedForThisAbsenceIfThisIsTickedCheckBox.click();
    }

    public void TickStillGetTrophyIfThisIsTickedCheckBox() {
        StillGetTrophyIfThisIsTickedCheckBox.click();
    }

    public void TickActiveCheckBox() {
        ActiveCheckBox.click();
    }

    public void ClickAddBtn() {
        AddBtn.click();
    }

//
//    public void DeleteBookedAbsence() throws InterruptedException {
//        DeleteBtn.click();
//        withTimeoutOf(Duration.ofSeconds(30)).find(By.xpath("//button[@type='button']")).click();
//    }


}
