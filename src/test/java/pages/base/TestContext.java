package pages.base;

import base.DriverManager;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class TestContext {

    public WebDriver driver;
    private Map<String, Object> scenarioContext  = new HashMap<>();
    public DriverManager driverManager;
    public Scenario scenario;

	public void setAttribute(String key, Object value) {
    	if(isContains(key)){
    		scenarioContext.remove(key);
    	}
        scenarioContext.put(key, value);
    }

    public Object getAttribute(String key){
        return scenarioContext.get(key);
    }

	public String getString(String key){
        return (String) scenarioContext.get(key);
    }

	public void log(String text, Object... args) {
		scenario.log(format(text, args));
	}

	public void logDivider() {
		scenario.log("##########################################");
	}

    public Boolean isContains(String key){
        return scenarioContext.containsKey(key);
    }

    public DriverManager getDriverManager() {
    	return driverManager;
    }
}
