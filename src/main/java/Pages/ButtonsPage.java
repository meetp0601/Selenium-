package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage extends BasePage {
    public WebDriver driver;
    public ButtonsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    //Button 1
    @FindBy(xpath = "//a[contains(text() , 'Buttons' )]")
    WebElement ButtonPage;

    @FindBy(id = "submit-id-submit")
    WebElement clickBtn1;

    //Button 2
    @FindBy(xpath = "//a[contains(text() , 'Looks like a button' )]")
    WebElement btn2;

    @FindBy(xpath = "//*[@id='button-form']/a")
    WebElement clickBtn2;

    //Button 3
    @FindBy(xpath = "//a[contains(text() , 'Disabled' )]")
    WebElement btn3;

    @FindBy(id = "id_select_state")
    WebElement clickDropdown;

    @FindBy(xpath = "//option[contains(text() , 'Enabled')]")
    WebElement clickEnabled;

    @FindBy(xpath = "//*[@id='submit-id-submit']")
    WebElement clickBtn3;

    public void enterButton() throws InterruptedException {
        ButtonPage.click();
        Wait();
        clickBtn1.click();
        Wait();
        btn2.click();
        Wait();
        clickBtn2.click();
        Wait();
    }
    public void enterButton2() throws InterruptedException {
        btn3.click();
        Wait();
        clickDropdown.click();
        Wait();
        clickEnabled.click();
        Wait();
        clickBtn3.click();
        Wait();
    }
}
