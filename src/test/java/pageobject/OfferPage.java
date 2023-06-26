package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
    WebDriver driver;

    public OfferPage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchProduct = By.id("search-field");
    private By topDeals = By.linkText("Top Deals");

    By productName = By.cssSelector(".table.table-bordered tr td:nth-child(1)");

    public void searchProductName(String name) {
        driver.findElement(searchProduct).sendKeys(name);
    }

    public void clickTopDeals() {
        driver.findElement(topDeals).click();
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }

}
