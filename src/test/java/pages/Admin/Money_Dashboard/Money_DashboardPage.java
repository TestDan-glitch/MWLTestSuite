package pages.Admin.Money_Dashboard;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Money_DashboardPage extends UIInteractionSteps{
    @Managed
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//p[text()='Add and manage Loan Applications for an employee.']")
    public WebElement LoanAgreementsBtn;

    @FindBy(how = How.XPATH, using = "//div[4]/div")
    public WebElement PreparePayrollBtn;



    public void ClickLoanAgreementsBtn() {
        LoanAgreementsBtn.click();
    }

    public void ClickPreparePayrollBtn() {
        PreparePayrollBtn.click();
    }





}
