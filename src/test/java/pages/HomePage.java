package pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends UIInteractionSteps{

    @FindBy(how = How.XPATH, using = "//h2[text()[normalize-space()='Matthew Regis, welcome to My Working Life']]")
    public WebElement adminPageCheck;

    @FindBy(how = How.XPATH, using = "//h2[text()[normalize-space()='Naomi Lloyd, welcome to My Working Life']]")
    public WebElement employeePageCheck;

    @FindBy(how = How.XPATH, using = "//p[text()='This is where you can view your information.']")
    public WebElement MyDetailsBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='card card-my-rota']//div[1]")
    public WebElement MyRotaBtn;

    @FindBy(how = How.ID, using = "MyTimeOff")
    public WebElement MyTimeOffBtn;

    @FindBy(how = How.CSS, using = "html>body>div:nth-of-type(3)>div:nth-of-type(3)>div:nth-of-type(7)>div>p")
    public WebElement TrainingAndDevBtn;

    @FindBy(how = How.XPATH, using = "//p[text()='Absence Dashboard']")
    public WebElement AbsenceDashboardBtn;

    @FindBy(how = How.XPATH, using = "//p[text()='Money Dashboard']")
    public WebElement MoneyDashboardBtn;

    @FindBy(how = How.XPATH, using = "//p[text()='Overtime Dashboard']")
    public WebElement OvertimeDashboardBtn;

    @FindBy(how = How.XPATH, using = "//button[text()[normalize-space()='Log out']]")
    public WebElement logOut;

    public void CheckAdminPage() {
        adminPageCheck.isDisplayed();
    }

    public void CheckEmployeePage() {
        employeePageCheck.isDisplayed();
    }

    public void ClickMyDetailsBtn() {
        MyDetailsBtn.click();
    }

    public void ClickMyRotaBtn() {
        MyRotaBtn.click();
    }

    public void ClickMyTimeOffBtn() {
        MyTimeOffBtn.click();
    }

    public void ClickTrainingAndDevBtn() {
        TrainingAndDevBtn.click();
    }

    public void ClickAbsenceDashboardBtn() {
        AbsenceDashboardBtn.click();
    }

    public void ClickMoneyDashboardBtn() {
        MoneyDashboardBtn.click();
    }

    public void ClickOvertimeDashboardBtn() {
        OvertimeDashboardBtn.click();
    }

    public void LogOut() throws InterruptedException {
//        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
//        Thread.sleep(3000);
//        WebElement LogOutBtn = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
//        LogOutBtn.click();
//        WebElement LogOutBtn2 = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
//        LogOutBtn2.click();

        //        WebElement element = getDriver().findElement(By.xpath("//button[@type='submit']"));
//        Actions actions = new Actions(getDriver());
//        actions.moveToElement(element).click().build().perform();

        try {
            WebElement date = getDriver().findElement(By.xpath("//button[@type='submit']"));
//            WebElement date = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
            date.click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            WebElement date = getDriver().findElement(By.xpath("//button[@type='submit']"));
//            WebElement date = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
            date.click();
        }

        //Activate modal dialogue
//            Actions action = new Actions(getDriver());
//            action.moveToElement(hoverButton).perform();
//            wait.until(ExpectedConditions.visibilityOf(linkOne));
//            action.moveToElement(linkOne).click().perform();

//        getDriver().close();
//        getDriver().quit();


//                getDriver().close();
//        getDriver().quit();

//        boolean staleElement = true;
//        while(staleElement){
//            try{
//                getDriver().findElement(By.cssSelector("form#logoutForm>button"),10).click();
//                staleElement = false;
//
//            } catch(StaleElementReferenceException e){
//                staleElement = true;
//            }
//        }



//        getDriver().findElement(By.cssSelector(".btn")).click();
//Thread.sleep(3000);

//        Thread.sleep(3000);
//        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
//        withTimeoutOf(Duration.ofSeconds(30))
//                .find(By.xpath("//button[@type='submit']"));

//        Thread.sleep(3000);
//        withTimeoutOf(Duration.ofSeconds(30))
//                .find(By.xpath("//button[@type='submit']"))
//                .click();
//        try {
//            Thread.sleep(3000);
////            withTimeoutOf(Duration.ofSeconds(30))
////                    .find(By.xpath("//button[@type='submit']"))
////                    .click();
//
////            WebElement LogOutBtn = getDriver().findElement(By.xpath("//button[@type='submit']"));
////            WebElement LogOutBtn = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
////            WebElement LogOutBtn = getDriver().findElement(By.cssSelector("button[type='submit']"));
////            WebElement LogOutBtn = getDriver().findElement(By.className("btn btn-logout"));
//            WebElement LogOutBtn = getDriver().findElement(By.linkText("Log out"));
//
//            LogOutBtn.click();
//
//        }
//        catch(org.openqa.selenium.StaleElementReferenceException ex)
//        {
////            withTimeoutOf(Duration.ofSeconds(30))
////                    .find(By.xpath("//button[@type='submit']"))
////                    .click();
//            Thread.sleep(3000);
////            WebElement LogOutBtn = getDriver().findElement(By.xpath("//button[@type='submit']"));
////            WebElement LogOutBtn = getDriver().findElement(By.cssSelector("form#logoutForm>button"));
////            WebElement LogOutBtn = getDriver().findElement(By.cssSelector("button[type='submit']"));
////            WebElement LogOutBtn = getDriver().findElement(By.className("btn btn-logout"));
//            WebElement LogOutBtn = getDriver().findElement(By.linkText("Log out"));
//            LogOutBtn.click();
//        }
    }
}
