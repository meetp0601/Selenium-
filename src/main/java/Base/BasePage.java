package Base;

import Utility.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public SoftAssert sa;

    public BasePage(){
        sa = new SoftAssert();
    }

    @BeforeMethod
    public void initializeDriver(){
        ConfigReader.loadProperties();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperties("url2"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void Wait() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void assertTrueCondition(boolean condition, String message){
        sa = new SoftAssert();
        sa.assertTrue(condition , message);
    }

    public void assertEqualValues(String actualText , String ExpectedText , String message){
        sa.assertEquals(actualText, ExpectedText , message);
    }

    public void assertAll(){
        sa.assertAll();
    }

    @AfterMethod
    public void quitDriver(){
        if(driver != null){
            driver.quit();
        }
    }
}
