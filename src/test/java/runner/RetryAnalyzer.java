package runner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;
    private final int maxRetryCount;

    public RetryAnalyzer() {
        this.maxRetryCount = 1;
    }

    public RetryAnalyzer(int maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }

    @Override
    public boolean retry(ITestResult result) {
        Object[] parameters = result.getParameters();
        if (parameters.length > 0 && parameters[0] instanceof io.cucumber.testng.PickleWrapper) {
            io.cucumber.testng.PickleWrapper pickleWrapper = (io.cucumber.testng.PickleWrapper) parameters[0];
            if (!pickleWrapper.getPickle().getTags().contains("@retry")) {
                return false;
            }
        }

        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}