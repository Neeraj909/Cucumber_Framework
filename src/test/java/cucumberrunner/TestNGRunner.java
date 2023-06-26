package cucumberrunner;

import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;

@CucumberOptions(
        features = "src/test/java/features/",
        glue = "stepDefination", monochrome = true, tags = "@product",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
    @AfterSuite
    public void close() {

    }
}
