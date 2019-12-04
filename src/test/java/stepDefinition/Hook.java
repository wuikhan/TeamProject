package stepDefinition;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.BaseClass;

public class Hook extends BaseClass {

	@Before
	public void start(Scenario scenario) {
		System.out.println("Scenario Name > :" + scenario.getName());
		
	}

	@After
	public void stop(Scenario scenario) throws IOException {
		htmlReporter = new ExtentHtmlReporter("extent-report.html");
		extent = new ExtentReports();
		extent.setSystemInfo("os", System.getProperty("os.name"));
		extent.setSystemInfo("user directory", System.getProperty("user.dir"));
		extent.setSystemInfo("user name", System.getProperty("user.name"));
		extent.attachReporter(htmlReporter);
		test = extent.createTest(scenario.getName(), "This test case will check the visibility of dashboard.");
		if (scenario.isFailed()) {
			String name = scenario.getName() + " - " + scenario.getStatus();
			test.fail(MarkupHelper.createLabel(scenario.getName(), ExtentColor.RED));
			takeScreen(name);
			test.addScreenCaptureFromPath("./Screenshots/" + name + ".png");
		} else {
			String name = scenario.getName() + " - " + scenario.getStatus();
			test.pass(MarkupHelper.createLabel(scenario.getName(), ExtentColor.GREEN));
			takeScreen(name);
			test.addScreenCaptureFromPath("./Screenshots/" + name + ".png");
		}
		extent.flush();
		driver.quit();
	}

}
