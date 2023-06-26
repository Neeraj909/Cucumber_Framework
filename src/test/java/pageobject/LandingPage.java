package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestContextSetup;

public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    private By search = By.cssSelector("input.search-keyword");
    private By productName = By.cssSelector("h4.product-name");

    public void searchItem(String name) {
        driver.findElement(search).sendKeys(name);
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }
}
