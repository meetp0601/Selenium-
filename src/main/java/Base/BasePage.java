package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
    public WebDriver driver;

    @BeforeMethod
    public void initializeDriver(){
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.qa-practice.com/");
    }

    public void Wait() throws InterruptedException {
        Thread.sleep(2000);
    }
    @AfterMethod
    public void quitDriver(){
        if(driver != null){
            driver.quit();
        }
    }
}
