package JavaCucumberGradle.steps;

import org.junit.Assert;

import JavaCucumberGradle.pages.GridPage;
import io.cucumber.java.en.*;

public class GridTestSteps {
    
    GridPage grid = new GridPage();

    @Given("^I navigate to the static table$")
    public void navigateToGridPage() {
        grid.navigateToGrid();
    }

    @Then("^I can return the value I wanted$")
    public void returnValue() {
        String value = grid.getValueFromGrid(3, 2);
        Assert.assertEquals("r: 2, c: 1", value);
    }

    @Then("^I can validate the table is displayed$")
    public void theTableIsThere() {
        Assert.assertTrue("The element is being displayed", grid.cellStatus());
    }
}
