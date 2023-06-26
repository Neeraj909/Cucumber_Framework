package pageobject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LandingPage getLandingPageObject() {
        return new LandingPage(driver);
    }

    public OfferPage getOfferPageObject() {
        return new OfferPage(driver);
    }
}
