package utilities;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

   static Properties properties;

    static String dosyaYolu = "src/ConfigReader.properties";

    static {


        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("properties dosyası bulunamadı");
        }
    }

    public static String getProperty (String key){
        return properties.getProperty(key);
    }

}
