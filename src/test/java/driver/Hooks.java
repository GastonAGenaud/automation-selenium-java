package driver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks extends DriverFactory {


    @After(order = 2)
    public void takeScreenShotOnFailedScenario(Scenario scenario) throws IOException {
       final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        //byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
        scenario.attach(screenshot, "image/png", scenario.getName());
        getDriver().quit();
    }

    @After(order = 1)
    public static void tearDown(Scenario scenario) {
        try {
            cleanupDriver();
        } catch (Exception e) {
        } finally {
            System.out.println("Browser is closed!!!---------------------------------------------------------------");
        }
    }
}
