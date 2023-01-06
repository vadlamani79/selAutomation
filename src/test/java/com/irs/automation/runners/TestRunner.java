package com.irs.automation.runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue = {"com.irs.automation.steps"},
		features = {"."},
		dryRun = false,
		plugin = {"json:target/cucumber.json"}
		)

public class TestRunner {

}