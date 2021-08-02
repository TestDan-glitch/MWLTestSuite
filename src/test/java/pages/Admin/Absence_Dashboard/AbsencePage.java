package pages.Admin.Absence_Dashboard;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public void ClickAddAbsenceBtn() {
        AddAbsenceBtn.click();
    }

    public void EnterAbsenceInformation() throws InterruptedException {
//        EmployeeNameDropdownBox.click();
        EmployeeNameDropdownBox.sendKeys(Keys.ARROW_DOWN);
        new Select(getDriver().findElement(By.id("PersonId"))).selectByVisibleText("Naomi Lloyd (DO NOT USE)");
        EmployeeNameDropdownBox.click();

        AbsenceReasonDropdownBox.click();
        new Select(getDriver().findElement(By.id("ReasonId"))).selectByVisibleText("Sickness/Illness - Sick/Illness");
        AbsenceReasonDropdownBox.click();

        AbsenceStartDateDropdownBox.click();
        getDriver().findElement(By.id("StartDate")).sendKeys("17-05-2021");

        AbsenceEndDateDropdownBox.click();
        getDriver().findElement(By.id("EndDate")).sendKeys("17-05-2021");

        NotesField.click();
        getDriver().findElement(By.id("Notes")).sendKeys("Testing the booking of an Absence");
//        Thread.sleep(5000);
    }

    public void SaveEnteredAbsenceInformation() throws InterruptedException {
//        withTimeoutOf(Duration.ofSeconds(30)).find(By.id("submitButton"));
//        Thread.sleep(3000);
        AddBtn.click();
//        Thread.sleep(3000);
//        new WebDriverWait(getDriver(), 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/button[@type='submit']")));

//        try {
//            WebElement date = getDriver().findElement(org.openqa.selenium.By.xpath("//button[@type='submit']"));
////            WebElement date = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
//            date.click();
//        }
//        catch(org.openqa.selenium.StaleElementReferenceException ex)
//        {
//            WebElement date = getDriver().findElement(org.openqa.selenium.By.xpath("//button[@type='submit']"));
////            WebElement date = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
//            date.click();
//        }

//        withTimeoutOf(Duration.ofSeconds(30)).find(By.cssSelector("form#logoutForm>button"));
//        getDriver().findElement(org.openqa.selenium.By.cssSelector("form#logoutForm>button"));

//        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("form#AddAbsenceForm>div:nth-of-type(4)")));
//        withTimeoutOf(Duration.ofSeconds(30)).find(By.cssSelector("form#logoutForm>button"));
//        try {
//            WebElement date = getDriver().findElement(org.openqa.selenium.By.cssSelector("form#logoutForm>button"));
//         //   date.click();
//        }
//        catch(org.openqa.selenium.StaleElementReferenceException ex)
//        {
//            WebElement date = getDriver().findElement(org.openqa.selenium.By.cssSelector("form#logoutForm>button"));
//          //  date.click();
//        }
//        Thread.sleep(5000);

    }

    public void EditABookedAbsence() throws InterruptedException {
        EditBtn.click();

        AbsenceReasonDropdownBox.click();
        new Select(getDriver().findElement(By.id("ReasonId"))).selectByVisibleText("Unpaid - Emergency Leave");
        AbsenceReasonDropdownBox.click();

        NotesField.click();
        getDriver().findElement(By.id("Notes")).sendKeys("EDITED Testing the booking of an Absence");

        ReturnToWorkCheckBox.click();
        RTWFormCompletedCheckBox.click();
        NoBFPointsAddedForThisAbsenceCheckBox.click();
        trophyCheckCheckBox.click();
        paidCheckCheckBox.click();

        AddBtn.click();

//        try {
//            WebElement date = getDriver().findElement(org.openqa.selenium.By.xpath("//button[@type='submit']"));
////            WebElement date = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
//            date.click();
//        }
//        catch(org.openqa.selenium.StaleElementReferenceException ex)
//        {
//            WebElement date = getDriver().findElement(org.openqa.selenium.By.xpath("//button[@type='submit']"));
////            WebElement date = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
//            date.click();
//        }
    }

    public void DeleteBookedAbsence() throws InterruptedException {
                try {
            WebElement date = getDriver().findElement(org.openqa.selenium.By.linkText("Delete"));
//            WebElement date = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
            date.click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            WebElement date = getDriver().findElement(org.openqa.selenium.By.linkText("Delete"));
//            WebElement date = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
            date.click();
        }
//        DeleteBtn.click();
        withTimeoutOf(Duration.ofSeconds(30)).find(By.xpath("//button[@type='button']")).click();
    }


}
