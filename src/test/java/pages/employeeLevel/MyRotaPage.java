package pages.employeeLevel;

import assets.bookDate;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.Color;
import java.util.List;

public class MyRotaPage extends UIInteractionSteps {
    @Managed
    WebDriver driver;

    @FindBy(how = How.ID, using = "RequestDaysOff")
    public WebElement RequestDaysOffBtn;

    @FindBy(how = How.ID, using = "Lieu")
    public WebElement LieuBtn;

    @FindBy(how = How.ID, using = "RequestLieuDaysOff")
    public WebElement RequestLieuDaysOffBtn;

    @FindBy(how = How.CSS, using = ".datepicker--nav-action:nth-child(3) path")
    public WebElement TurnToNextMonth;

    bookDate theDate = new bookDate();

    public void ClickRequestLieuDaysOffBtn() throws InterruptedException {
        RequestLieuDaysOffBtn.click();
    }

    public void ClickTodayAsWFHForEmployee() throws InterruptedException {
        getDriver().findElement(By.cssSelector("div#employee-rota-wrapper>div>div:nth-of-type("+ theDate.intDay() +")>div>div>a:nth-of-type(6)>img")).click();
    }

    public void ClickTodayAsWFHForAdmin() throws InterruptedException {
        getDriver().findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/div[3]/div[1]/div["+ theDate.intDay() +"]/div[1]/div[1]/a[7]/img[1]")).click();
    }

    public void CheckDayIsWorkingFromHome() throws InterruptedException {
        getDriver().findElement(By.xpath("//img[@src='images/house-teal.svg']"));
    }

    public void CheckDayIsWorkingFromOffice() throws InterruptedException {
//        getDriver().findElement(By.xpath("(//img[@src='images/house.svg'])[1]"));
//        getDriver().findElement(By.xpath("(//img[contains(@title,'Working from office')])[1]"));
//        getDriver().findElement(By.xpath("(//img[@title='Working from office'])[1]"));
        Thread.sleep(2000);
        getDriver().findElement(By.cssSelector("div:nth-of-type(4) > .cell.rota-requests > .action.rota-actions > a:nth-of-type(6) > img[title='Working from office']"));
    }


    public void ClickTurnToNextMonth() {
        TurnToNextMonth.click();
    }

    public void ClickPickCalendarDay() throws InterruptedException {
            try {
                WebElement date = getDriver().findElement(By.xpath("//div[@data-date='"+theDate.getDate()+"']"));
                date.click();
            }
            catch(org.openqa.selenium.StaleElementReferenceException ex)
            {
                WebElement date = getDriver().findElement(By.xpath("//div[@data-date='"+theDate.getDate()+"']"));
                date.click();
            }
        getDriver().findElement(By.xpath("//input[@value='Request']")).click();
    }

    public void SelectEmployee() throws InterruptedException {
        getDriver().findElement(By.name("Id")).click();
        new Select(getDriver().findElement(By.name("Id"))).selectByVisibleText("Naomi Lloyd (DO NOT USE)");
    }

    public void CheckForConflictWarning() throws InterruptedException {
        getDriver().findElement(By.id("validationWarning")).isDisplayed();
    }

    public void ClickCancelBtn() throws InterruptedException {
        getDriver().findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
        getDriver().findElement(By.linkText("Yes")).click();
    }
}
