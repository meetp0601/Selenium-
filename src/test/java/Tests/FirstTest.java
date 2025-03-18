package Tests;

import Base.BasePage;
import Pages.CheckBoxPage;
import Pages.InputPage;
import Pages.ButtonsPage;
import org.testng.annotations.Test;

public class FirstTest extends BasePage {
    InputPage obj1;
    ButtonsPage obj2;
    CheckBoxPage obj3;
    @Test
    public void InputDetails() throws InterruptedException {
//        First();
//        Second();
        Third();
    }
    public void First() throws InterruptedException {
        obj1 = new InputPage(driver);
        obj1.enterText("Meet");
        obj1.enterEmail("meetp2684@gmail.com");
        obj1.enterPassword("12345");
    }
    public void Second() throws InterruptedException {
        obj2 = new ButtonsPage(driver);
        obj2.enterButton();
        obj2.enterButton2();
    }
    public void Third() throws InterruptedException {
        obj3 = new CheckBoxPage(driver);
        obj3.checkbox();
    }
}
