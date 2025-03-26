package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectPage {
    public WebDriver driver;
    public SelectPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    @FindBy(xpath = "//a[contains(text() , 'Select' )]")
    WebElement SelectPage;

    @FindBy(id = "id_choose_language")
    WebElement clickDropdown;

    @FindBy(id = "submit-id-submit")
    WebElement clickSubmit;

    @FindBy(linkText = "Multiple selects")
    WebElement clickDropdown2;

    @FindBy(id = "id_choose_the_place_you_want_to_go")
    WebElement clickDropdown21;

    @FindBy(id = "id_choose_how_you_want_to_get_there")
    WebElement clickDropdown22;

    @FindBy(id = "id_choose_when_you_want_to_go")
    WebElement clickDropdown23;

    public void setClickDropdown(){
        SelectPage.click();
        clickDropdown.click();
        Select sl1 = new Select(clickDropdown);
        sl1.selectByIndex(3);
        clickSubmit.click();
    }
    public void setClickDropdown2(){
        clickDropdown2.click();
        Select sl21 = new Select(clickDropdown21);
        sl21.selectByIndex(1);
        Select sl22 = new Select(clickDropdown22);
        sl22.selectByIndex(2);
        Select sl23 = new Select(clickDropdown23);
        sl23.selectByIndex(3);
        clickSubmit.click();
    }
}
