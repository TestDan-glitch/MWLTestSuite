package pages.Admin.Absence_Dashboard;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AbsenceDashboardPage extends UIInteractionSteps{
    @Managed
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//p[text()='This is where you can manage absence.']")
    public WebElement AbsenceBtn;

    @FindBy(how = How.XPATH, using = "//p[text()='This is where you can manage Absence Reasons.']")
    public WebElement AbsenceReasonsBtn;

    public void ClickAbsenceBtn() {
        AbsenceBtn.click();
    }

    public void ClickAbsenceReasonsBtn() throws InterruptedException {
        AbsenceReasonsBtn.click();

    }



}
