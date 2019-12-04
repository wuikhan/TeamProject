package utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-mac");
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("window-size=1400,800");
//		option.addArguments("headless");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	public static void takeScreen(String fileName) throws IOException {
		// Step 1: Create an object of TakesScreenshot Interface
		TakesScreenshot takeShot = ((TakesScreenshot) driver);

		// Step 2: Use getScreenshotAs method
		File srcFile = takeShot.getScreenshotAs(OutputType.FILE);

		// Step 3: Specify the location of our Destination folder
		File destFile = new File("./Screenshots/" + fileName + ".png");

		// Step 4: Copy the source file to the destination location
		FileUtils.copyFile(srcFile, destFile);
	}


}
