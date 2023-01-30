package runner;

import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = {"classpath:features"}, glue = {"steps"},
        tags = "(@Bypass)", monochrome = true, dryRun = false,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runner extends AbstractTestNGCucumberTests {
    private static ExtentReports extent = ExtentManager.createInstance();

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                TakesScreenshot takesScreenshot = (TakesScreenshot) driver.DriverFactory.getDriver();
                byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName() + "_screenshot");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        extent.flush();
    }

    @AfterClass
    public static void teardown() {
        driver.DriverFactory.getDriver().close();
        driver.DriverFactory.getDriver().quit();
    }
}
