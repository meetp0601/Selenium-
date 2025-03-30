package listeners;

import Base.BasePage;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Utility.ScreenshotUtil;

public class TestListener extends BasePage implements ITestListener {
    public void onTestFailure(ITestResult result) {
        ScreenshotUtil.captureScreenshot(driver, result.getName());
        System.out.println("Screenshot captured for failed test: " + result.getName());
    }
}
