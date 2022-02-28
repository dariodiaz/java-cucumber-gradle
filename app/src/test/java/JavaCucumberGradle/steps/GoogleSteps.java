package JavaCucumberGradle.steps;

import org.junit.After;
import org.junit.Assert;

import JavaCucumberGradle.pages.GooglePage;
import io.cucumber.java.en.*;

public class GoogleSteps {

    GooglePage google = new GooglePage();
    
    @Given("^I am on the Google search page$")
    public void navigateToGoogle() {
        google.navigateToGoogle();
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria() {
        google.enterSearchCriteria("Google");
    }

    @And("^click on the search button$")
    public void clickSearchButton() {
        google.clickGoogleSearch();
    }

    @Then("^the results match the criteria$")
    public void validateResults() {
        Assert.assertTrue(google.elementIsDisplayed("//*[@id='logo']"));
        // Assert.assertEquals("Google", google.firstResult());
    }

}
