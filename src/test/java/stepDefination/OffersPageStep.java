package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobject.OfferPage;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

public class OffersPageStep {
    TestContextSetup testContextSetup;
    OfferPage offerPage;

    public OffersPageStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        offerPage = new OfferPage(testContextSetup.driver);
    }

    @And("User click top deals")
    public void userClickTopDeals() {
        offerPage.clickTopDeals();
        testContextSetup.genericUtils.switchWindowToChild();
    }

    @And("^User Search product on offer page ([^\"]*)$")
    public void userSearchProductOnOfferPage(String product) {
        offerPage.searchProductName(product);
    }

    @And("Validate  search product")
    public void validateSearchProduct() {
        offerPage.getProductName();
        Assert.assertEquals(testContextSetup.productName, offerPage.getProductName());
        testContextSetup.driver.close();
        testContextSetup.driver.switchTo().window(testContextSetup.parentWindow);
        System.out.println(testContextSetup.driver.getTitle());
    }
}
