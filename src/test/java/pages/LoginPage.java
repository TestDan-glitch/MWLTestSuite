package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends UIInteractionSteps{

    @FindBy(how = How.ID, using = "UsernameOrEmail")
    public WebElement txtUserName;

    @FindBy(how = How.ID, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement btnLogin;

    public void Login(String userName, String password) {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public void ClickLogin() throws InterruptedException {
        btnLogin.click();
    }
}
