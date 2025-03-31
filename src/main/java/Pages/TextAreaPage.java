package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextAreaPage {
    public WebDriver driver;
    public TextAreaPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
    @FindBy(xpath = "//a[contains(text() , 'Text area')]")
    WebElement TextAreaPage;

    @FindBy(id="id_text_area")
    WebElement TextArea1;

    @FindBy(id="submit-id-submit")
    WebElement submit;

    @FindBy(xpath = "//a[contains(text() , 'Multiple textareas')]")
    WebElement TextAreaPage2;

    @FindBy(id="id_first_chapter")
    WebElement TextArea21;

    @FindBy(id="id_second_chapter")
    WebElement TextArea22;

    @FindBy(id="id_third_chapter")
    WebElement TextArea23;

    public void setTextArea1() {
        TextAreaPage.click();
        TextArea1.sendKeys("TC");
        TextArea1.sendKeys(Keys.ENTER);
        submit.click();
    }
    public void setTextArea2() throws InterruptedException {
        TextAreaPage2.click();
        TextArea21.sendKeys("TC1");
        TextArea22.sendKeys("TC2");
        TextArea23.sendKeys("TC3");
        Thread.sleep(3000);
//        submit.click();
    }
}
