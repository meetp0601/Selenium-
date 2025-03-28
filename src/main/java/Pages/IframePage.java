package Pages;

import Base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePage  extends BasePage  {
        public WebDriver driver;
        public IframePage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver , this);
        }

        @FindBy(xpath = "//html/body/div/main/div/div/div/div[9]/div/div")
        WebElement IframePage;

        @FindBy(xpath = "//a[contains(text() , 'Iframes')]")
        WebElement ScrollToElement;

        public void iframes() throws InterruptedException {
            IframePage.click();
            wait();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();" , new Object[] {ScrollToElement});
            wait();
        }
}
