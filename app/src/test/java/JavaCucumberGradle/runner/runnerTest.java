package JavaCucumberGradle.runner;

import io.cucumber.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import JavaCucumberGradle.pages.BasePage;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "JavaCucumberGradle.steps",
    monochrome = true,
    // plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"}
    plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "summary"}
    // tags = {"@Cart"}
)

public class runnerTest {
    @AfterClass
    public static void closeDriver() {
        BasePage.closeBrowser();
    }
}