package EnvironmentManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environment {
    private static Properties properties;

    static {
        String env = System.getProperty("env");
        if (env == null) {
            env = "config";
        }
        try {
            properties = new Properties();
            properties.load(new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/" + env + ".properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}