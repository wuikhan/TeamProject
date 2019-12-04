package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".", 
		glue="stepDefinition",
		dryRun=false,
		plugin= {
				"pretty",
				"html:report/cucumber",
				"json:report/cucumber.json",
				"rerun:rerun/failed_scenario.txt"
				},
		tags="@SmokeTest",
		monochrome=true)

public class TestRunner   {
	
}
