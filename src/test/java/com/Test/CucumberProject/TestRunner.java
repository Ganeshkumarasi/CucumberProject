package com.Test.CucumberProject;

/**
 * Unit test for simple App.
 */
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "./Features/admin.feature", 
		monochrome = true, 
		plugin = { "pretty","html: test-output" }, 
		dryRun = false, 
		tags = "@InValidCred",
		glue = "com.StepDefinition"

)
public class TestRunner {
}
