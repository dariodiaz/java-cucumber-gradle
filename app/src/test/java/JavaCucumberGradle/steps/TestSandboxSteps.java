package JavaCucumberGradle.steps;

import JavaCucumberGradle.pages.TestSandbox;
import io.cucumber.java.en.*;

public class TestSandboxSteps {

    TestSandbox sandboxPage = new TestSandbox();

    @Given("^I navigate to the sandbox page$")
    public void navigateToTheSandboxSite() {
        sandboxPage.navigateToSandbox();
    }

    @And("^select a value from the dropdown$")
    public void selectState() {
        sandboxPage.selectCategory("Manual Testing");
    }
}
