package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewTabPage {
    public WebDriver driver;
    public NewTabPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);

    }

    @FindBy(xpath = "//a[contains(text() , 'New tab')]")
    WebElement NewTabPage;

    @FindBy(id = "new-page-link")
    WebElement clicknewtab1;

    @FindBy(id="result-text")
    WebElement result;

    @FindBy(linkText = "New tab button")
    WebElement Tab2;

    @FindBy(id="new-page-button")
    WebElement clicknewtab2;

    @FindBy(id="req_header")
    WebElement req;

    public void clickTab1() throws InterruptedException {
        String OriginalWindow = driver.getWindowHandle();
        NewTabPage.click();
        clicknewtab1.click();
        System.out.println("1");
    driver.close();
//        for (String newWindow : driver.getWindowHandles()){
//            if( !newWindow.equals(OriginalWindow || OriginalWindow) ){
//                driver.switchTo().window(newWindow);
//                req.click();
//                Assert.assertEquals(result.getText() ,"I am a new page in a new tab");
//                System.out.println("done");
//                wait();
////                driver.close();
//                driver.switchTo().window(OriginalWindow);
//                wait();
//                System.out.println("check");
//            }
//        }

    }
    public void clickTab2(){
        String OriginalWindow = driver.getWindowHandle();
        Tab2.click();
        clicknewtab2.click();
        for (String newWindow : driver.getWindowHandles()){
            if(newWindow != OriginalWindow){
                driver.switchTo().window(newWindow);
                Assert.assertEquals(result.getText() ,"I am a new page in a new tab");
                driver.close();
            }
        }
    }
}
