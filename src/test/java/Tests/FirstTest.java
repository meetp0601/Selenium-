package Tests;

import Base.BasePage;
import Pages.FirstPage;
import Pages.SecondPage;
import org.testng.annotations.Test;

public class FirstTest extends BasePage {
    @Test
    public void InputDetails() throws InterruptedException {
        FirstPage obj1 = new FirstPage(driver);
        obj1.enterText("Meet");
        obj1.enterEmail("meetp2684@gmail.com");
        obj1.enterPassword("12345");

        SecondPage obj2 = new SecondPage(driver);
        obj2.enterButton();
        obj2.enterButton2();
    }
}
