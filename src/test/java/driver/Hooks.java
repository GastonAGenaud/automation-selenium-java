package driver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {


//    @After
//    public void takeScreenShotOnFailedScenario(Scenario scenario) throws IOException {
//
//        getDriver().quit();
//    }

    @After
    public static void tearDown(Scenario scenario) {
        try {
            final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        } catch (Exception e) {
        } finally {
            cleanupDriver();
            System.out.println("Browser is closed!!!---------------------------------------------------------------");
        }
    }
}
