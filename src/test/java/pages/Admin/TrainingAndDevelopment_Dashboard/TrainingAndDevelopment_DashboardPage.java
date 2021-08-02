package pages.Admin.TrainingAndDevelopment_Dashboard;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TrainingAndDevelopment_DashboardPage extends UIInteractionSteps{
    @Managed
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//p[text()='This is where you can book in Client Time with Clients, and view scheduled slots.']")
    public WebElement ClientTimeBtn;

    @FindBy(how = How.XPATH, using = "//p[text()='This is where you can book in Training slots and view scheduled slots.']")
    public WebElement TrainingBtn;

    @FindBy(how = How.XPATH, using = "//p[text()='This is where you can book in WOW Chat slots and view scheduled slots.']")
    public WebElement WowChatBtn;

    public void ClickClientTimeBtn() {
        ClientTimeBtn.click();
    }

    public void ClickTrainingBtnBtn() {
        TrainingBtn.click();
    }

    public void ClickWowChatBtn() {
        WowChatBtn.click();
    }

}
