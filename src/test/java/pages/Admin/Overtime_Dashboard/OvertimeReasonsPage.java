package pages.Admin.Overtime_Dashboard;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class OvertimeReasonsPage extends UIInteractionSteps{
    @Managed
    WebDriver driver;

    @FindBy(how = How.LINK_TEXT, using = "Add Overtime Reason")
    public WebElement CreatePaymentBtn;

    @FindBy(how = How.ID, using = "OvertimeReason")
    public WebElement OvertimeReasonField;

    @FindBy(how = How.ID, using = "OvertimeRate")
    public WebElement OvertimeRateField;

    @FindBy(how = How.ID, using = "returnedCheck")
    public WebElement ActiveCheckBox;

    @FindBy(how = How.ID, using = "submitButton")
    public WebElement SaveBtn;

    public void EnterOvertimeReaon() {
        CreatePaymentBtn.click();
        OvertimeReasonField.click();
        OvertimeReasonField.sendKeys("OvertimeReasonField");
        OvertimeRateField.click();
        OvertimeRateField.sendKeys("1.5");
//        ActiveCheckBox.click();
    }

    public void ClickSaveBtn() {
        SaveBtn.click();
    }


    public void ClickSubmitBtn() throws InterruptedException {
//        SubmitBtn.click();
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
