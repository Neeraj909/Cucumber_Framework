package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LandingPage;
import utils.TestBase;
import utils.TestContextSetup;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LandingPageStep extends TestBase {
    LandingPage landingPage;
    TestContextSetup testContextSetup;

    public LandingPageStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Given("^User navigate to greenCart landing page$")
    public void navigateToUrl() {
        //System.setProperty("webdriver.chrome.driver","/Users/neeraj.b.sharma/Desktop/Cucumber_Framework/src/test/java/driver/chromedriver");
        testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("^user search product ([^\"]*)$")
    public void userSearchProduct(String product) {
        landingPage = testContextSetup.pageObjectManager.getLandingPageObject();
        landingPage.searchItem(product);
        testContextSetup.productName = landingPage.getProductName().split("-")[0].trim();
        System.out.println(testContextSetup.productName);
    }
}
