package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties Property;
    public static void loadProperties()  {
        String filePath = "src/test/resources/Config.Properties";
        try (FileInputStream file = new FileInputStream(filePath)){
            Property = new Properties();
            Property.load(file);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperties(String key){
        return Property.getProperty(key);
    }
}
