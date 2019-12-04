package stepDefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseClass;

public class LoginTest extends BaseClass {

	@Given("^I open chrome browser$")
	public void i_open_chrome_browser() throws IOException {
		openBrowser();
	}

	@Given("^I go to salesforce home page$")
	public void i_go_to_salesforce_home_page() {
		driver.get("https://login.salesforce.com");
	}

	@Given("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String password) throws IOException {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^I click the login button$")
	public void i_click_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}

	@Then("^I see the dashboard$")
	public void i_see_the_dashboard() throws IOException {
		boolean isPresent = driver.findElement(By.id("phHeaderLogoImage")).isDisplayed();
		Assert.assertTrue(isPresent);
	}

	@Then("^I click the \"([^\"]*)\" tab$")
	public void i_click_the_tab(String tabName) {
		driver.findElement(By.linkText(tabName)).click();
	}

	@Then("^I click the \"([^\"]*)\" button$")
	public void i_click_the_button(String btn) {
		driver.findElement(By.xpath("//input[@value=' " + btn + " ']")).click();
	}

	@Then("^I should see an error message$")
	public void i_should_see_an_error_message() throws Throwable {
		String expectedError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String actualError = driver.findElement(By.id("error")).getText();
		Assert.assertEquals(expectedError, actualError);
	}

	@Then("^I quit the browser$")
	public void i_quit_the_browser() {
		driver.quit();
	}

}
