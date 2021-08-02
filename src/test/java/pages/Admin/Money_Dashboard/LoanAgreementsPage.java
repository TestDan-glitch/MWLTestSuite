package pages.Admin.Money_Dashboard;

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

import java.time.Duration;

public class LoanAgreementsPage extends UIInteractionSteps{
    @Managed
    WebDriver driver;

    @FindBy(how = How.LINK_TEXT, using = "Add New Loan Agreement")
    public WebElement AddNewLoanAgreementBtn;

    @FindBy(how = How.ID, using = "PersonId")
    public WebElement EmployeeNameDropdownBox;

    @FindBy(how = How.ID, using = "StartDate")
    public WebElement StartDateDropdownBox;

    @FindBy(how = How.ID, using = "LoanAmount")
    public WebElement LoanAmountDropdownBox;

    @FindBy(how = How.ID, using = "DurationMonths")
    public WebElement DurationMonthsField;

    @FindBy(how = How.XPATH, using = "//input[@value='Submit']")
    public WebElement SubmitBtn;

    public void ClickAddNewLoanAgreementBtn() {
        AddNewLoanAgreementBtn.click();
    }

    public void SelectEmployeeName() throws InterruptedException {
        EmployeeNameDropdownBox.sendKeys(Keys.ARROW_DOWN);
        new Select(getDriver().findElement(By.id("PersonId"))).selectByVisibleText("Naomi Lloyd (DO NOT USE)");
    }

    public void EnterStartDate() throws InterruptedException {
        StartDateDropdownBox.click();
        StartDateDropdownBox.sendKeys("14-05-2021");
    }

    public void EnterLoanAmount() throws InterruptedException {
        LoanAmountDropdownBox.click();
        LoanAmountDropdownBox.sendKeys("500");
    }

    public void EnterLoanDurationInMonths() throws InterruptedException {
        DurationMonthsField.click();
        DurationMonthsField.sendKeys("24");
    }

    public void ClickSubmitBtn() throws InterruptedException {
        SubmitBtn.click();
//        try {
//            WebElement date = getDriver().findElement(org.openqa.selenium.By.cssSelector("form#logoutForm>button"));
//            date.click();
//        }
//        catch(org.openqa.selenium.StaleElementReferenceException ex)
//        {
//            WebElement date = getDriver().findElement(org.openqa.selenium.By.cssSelector("form#logoutForm>button"));
//            date.click();
//        }

    }

//
//    public void DeleteBookedAbsence() throws InterruptedException {
//        DeleteBtn.click();
//        withTimeoutOf(Duration.ofSeconds(30)).find(By.xpath("//button[@type='button']")).click();
//    }


}
