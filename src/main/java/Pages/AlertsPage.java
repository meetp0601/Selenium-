package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {
    public WebDriver driver;
    public AlertsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
    @FindBy(xpath = "//a[contains(text() , 'Alerts')]")
    WebElement AlertPage;

    @FindBy(linkText = "Click")
    WebElement alertbtn;

    @FindBy(xpath = "//a[contains(text() , 'Confirmation box')]")
    WebElement AlertPage2;

    @FindBy(xpath = "//a[contains(text() , 'Prompt box')]")
    WebElement AlertPage3;

    public void setAlert1() {
        AlertPage.click();
        alertbtn.click();
        driver.switchTo().alert().accept();
    }
    public void setAlert2() throws InterruptedException {
        AlertPage2.click();
        alertbtn.click();
        driver.switchTo().alert().accept();
    }
    //AlertPage3
    public void setAlert3() throws InterruptedException {
        AlertPage3.click();
        alertbtn.click();
        driver.switchTo().alert().sendKeys("Meet");
    }
}
