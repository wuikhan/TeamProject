package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"@rerun/failed_scenario.txt"}, 
		glue="stepDefinition",
		dryRun=false,
		plugin= {
				"pretty",
				"rerun:rerun/failed_scenario.txt"
				},
		monochrome=true)

public class FailedRunner {

}
