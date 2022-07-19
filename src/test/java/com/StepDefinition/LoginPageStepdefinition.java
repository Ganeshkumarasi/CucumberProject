package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Test.CucumberProject.UtilityTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepdefinition extends UtilityTest {

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String appURL) {
		driver.get(appURL);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String pwd) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys(pwd);
	}

	@When("Click on Login")
	public void click_on_login() {
		driver.findElement(By.tagName("button")).click();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) throws Exception {
		Thread.sleep(2000);
		Assert.assertEquals(expectedTitle, driver.getTitle());
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws Exception {
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() throws Exception {
		Thread.sleep(4000);
		driver.close();
	}

}
