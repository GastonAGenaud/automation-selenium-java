package runner;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports createInstance() {
        String reportFileName = "target/extent.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(reportFileName);
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        return extent;
    }
}
