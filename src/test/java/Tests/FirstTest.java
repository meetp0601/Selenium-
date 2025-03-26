package Tests;

import Base.BasePage;
import Pages.*;
import org.testng.annotations.Test;

import java.io.IOException;

public class FirstTest extends BasePage {
    InputPage obj1;
    ButtonsPage obj2;
    CheckBoxPage obj3;
    SelectPage obj4;
    NewTabPage obj5;
    @Test
    public void InputDetails() throws InterruptedException, IOException {
        First();
//        Second();
//        Third();
//        Forth();
//        Fifth();
    }
    public void First() throws InterruptedException, IOException {
        obj1 = new InputPage(driver);
        obj1.enterText();
        obj1.enterEmail();
        obj1.enterPassword();

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
    public void Forth() throws InterruptedException {
        obj4 = new SelectPage(driver);
        obj4.setClickDropdown();
        obj4.setClickDropdown2();
    }
    public void Fifth() throws InterruptedException {
        obj5 = new NewTabPage(driver);
        obj5.clickTab1();
//        obj5.clickTab2();
    }

}
