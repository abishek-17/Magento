package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties config;
    private static Properties locators;

    static {
            try{
                config = new Properties();
                FileInputStream configStream = new FileInputStream("src/test/resources/properties/config.properties");
                config.load(configStream);

                locators = new Properties();
                FileInputStream locatorsStream = new FileInputStream("src/test/resources/properties/element.properties");
                locators.load(locatorsStream);


            } catch (IOException e) {
                    e.printStackTrace();
            }
    }

    public static String getLocatorValue(String key){
        return locators.getProperty(key);
    }

    public static String getConfigValues(String key) {
        return config.getProperty(key);
    }
}
