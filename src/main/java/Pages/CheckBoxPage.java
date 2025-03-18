package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage extends BasePage {
    public WebDriver driver;
    public CheckBoxPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    @FindBy(xpath = "//a[contains(text() , 'Checkbox')]")
    WebElement clickCheckBox;
    //id_checkbox_0
    @FindBy(id = "id_checkbox_0")
    WebElement clickCheckBox1;

    @FindBy(xpath = "//a[contains(text() , 'Checkboxes')]")
    WebElement clickCheckBox2;

    @FindBy(id = "id_checkboxes_0")
    WebElement clickCheckBox11;

    @FindBy(id = "id_checkboxes_1")
    WebElement clickCheckBox12;

    @FindBy(id = "submit-id-submit")
    WebElement clickSubmit;
    public void checkbox() throws InterruptedException {
        clickCheckBox.click();
        Wait();
        clickCheckBox1.click();
        Wait();
        clickSubmit.click();
        Wait();
        clickCheckBox2.click();
        Wait();
        clickCheckBox11.click();
        Wait();
        clickCheckBox12.click();
        Wait();
    }
}
