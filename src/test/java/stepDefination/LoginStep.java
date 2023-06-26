package stepDefination;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

public class LoginStep {
    public LoginStep() {

    }

    @Given("^open url$")
    public void openUrl() {
        System.out.println("openUrl");
    }

    @When("^user enter username and password$")
    public void enterCredential() {
        System.out.println("enterCredential");
    }

    @And("^Click on submit button$")
    public void clickOnSumbitButton() {
        System.out.println("clickOnSumbitButton");
    }

    @Then("Verify the dashBord page")
    public void verifyTheDashBordPage() {
        System.out.println("verifyTheDashBordPage");
    }

    @Then("^Verify the dashBord not displayed page$")
    public void verifyTheDashBordNotDisplayedPage() {
        System.out.println("verifyTheDashBordNotDisplayedPage");
    }

    @When("^user enter username ([^\"]*) and password ([^\"]*)$")
    public void userEnterUsernameAndPassword(String user, String pass) {
        System.out.println("User-->" + user + "--" + "Password" + pass);
    }

    @When("^User sign up with following details$")
    public void userSignUpWithFollowingDetails(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        rows.forEach(System.out::println);
    }

    @When("^User login to with multiple data set \"(.*)\" and \"(.*)\"$")
    public void userLoginToWithMultipleDataSetUserAndPass(String user, String pass) {
        System.out.println("User-->" + user + "--" + "Password" + pass);
        Assert.assertEquals(user, "Sharma");

    }

    @Given("^open Web driver$")
    public void openWebDriver() {
        System.out.println("openWebDriver");
    }
}
