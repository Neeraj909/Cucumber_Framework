package utils;

import org.openqa.selenium.WebDriver;
import pageobject.PageObjectManager;

public class TestContextSetup {
    public WebDriver driver;
    public String productName;
    public String parentWindow;
    public PageObjectManager pageObjectManager;
    public GenericUtils genericUtils;

    public TestContextSetup() {
        TestBase testBase = new TestBase();
        this.pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
        genericUtils = new GenericUtils(testBase.WebDriverManager());
    }
}
