package Pages;

import Base.BasePage;
import Utility.ExcelUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class InputPage extends BasePage {
    public WebDriver driver;
    public InputPage(WebDriver driver){
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

    public void enterText() throws InterruptedException, IOException {
        System.out.println(" Before clicked");
        for (int i = 0; i <= 4; i++) {
            InputText.click();
            String Text = ExcelUtils.getData(i ,0);
            InputText2.sendKeys(Text);
            InputText2.sendKeys(Keys.ENTER);
        }
    }
    public void enterEmail() throws InterruptedException, IOException {

        for (int i = 0; i <= 4 ; i++) {
            InputEmail.click();
            String email = ExcelUtils.getData(i,1);
            InputEmail2.sendKeys(email);
            InputEmail2.sendKeys(Keys.ENTER);
        }
    }
    public void enterPassword() throws InterruptedException, IOException {
        InputPassword.click();
        for (int i = 0; i <= 4 ; i++) {
            String password = ExcelUtils.getData(i,2);
            InputPassword2.sendKeys(password);
            InputPassword2.sendKeys(Keys.ENTER);
        }
    }
}
