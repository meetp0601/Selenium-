package Pages;

import Base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage extends BasePage {
    public WebDriver driver;
    public FirstPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    @FindBy(xpath = "//a[contains(text() , 'Text input')]")
    WebElement InputText;

    @FindBy(id = "id_text_string")
    WebElement InputText2;

    @FindBy(xpath = "//a[contains(text() , 'Email field')]")
    WebElement InputEmail;

    @FindBy(id = "id_email")
    WebElement InputEmail2;

    @FindBy(xpath = "//a[contains(text() , 'Password field')]")
    WebElement InputPassword;

    @FindBy(id = "id_password")
    WebElement InputPassword2;

    public void enterText(String Text) throws InterruptedException {
        InputText.click();
        Wait();
        InputText2.sendKeys(Text);
        Wait();
        InputText2.sendKeys(Keys.ENTER);
        Wait();
    }
    public void enterEmail(String email) throws InterruptedException {
        InputEmail.click();
        Wait();
        InputEmail2.sendKeys(email);
        Wait();
        InputEmail2.sendKeys(Keys.ENTER);
        Wait();
    }
    public void enterPassword(String password) throws InterruptedException {
        InputPassword.click();
        Wait();
        InputPassword2.sendKeys(password);
        Wait();
        InputPassword2.sendKeys(Keys.ENTER);
        Wait();
    }
}
