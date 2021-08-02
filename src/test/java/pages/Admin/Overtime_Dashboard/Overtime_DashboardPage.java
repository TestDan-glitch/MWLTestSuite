package pages.Admin.Overtime_Dashboard;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Overtime_DashboardPage extends UIInteractionSteps{
    @Managed
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//p[text()='This is where you can view and approve overtime.']")
    public WebElement OvertimeBtn;

    @FindBy(how = How.XPATH, using = "//p[text()='This is where you can amend Overtime Reasons.']")
    public WebElement OvertimeReasonsBtn;

    public void ClickOvertimeBtn() {
        OvertimeBtn.click();
    }

    public void ClickOvertimeReasonsBtn() {
        OvertimeReasonsBtn.click();
    }






}
