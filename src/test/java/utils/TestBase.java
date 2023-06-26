package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;

    public WebDriver WebDriverManager() {
        Properties properties = null;
        try {
            properties = new Properties();
            properties.load(Files.newInputStream(Paths.get(System.getProperty("User.dir") + "/src/test/resources/global.properties")));

        } catch (Exception e) {

        }
        assert properties != null;
        String url = properties.getProperty("QAurl");

        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(url);
        }
        return driver;
    }


}
