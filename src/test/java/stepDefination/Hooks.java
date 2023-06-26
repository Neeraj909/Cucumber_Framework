package stepDefination;


import com.aventstack.extentreports.reporter.FileUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Hooks {
    @Before("@MobileTest")
    public void beforeValidation() {
        System.out.println("Run this MobileTest tag");
    }

    @After("@MobileTest")
    public void afterCloseObject() {
        System.out.println("after MobileTest tag");
    }

    @Before("@Desktop")
    public void beforeDesktop() {
        System.out.println("Run this Desktop tag");
    }

    @After("@Desktop")
    public void afterDesktop() {
        System.out.println("after Desktop tag");
    }

    @After
    public void close() {
     System.out.println("Close Driver");
    }
    @AfterStep
    public void takeScreenShot(Scenario scenario) throws IOException {
        WebDriver driver = null;
        if(scenario.isFailed()) {
           File sourcPath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent=FileUtils.readFileToByteArray(sourcPath);
            scenario.attach(fileContent,"image/png","png");
        }
    }
}
