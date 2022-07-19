package com.StepDefinition;

import org.testng.Assert;

import com.Test.CucumberProject.UtilityTest;

import io.cucumber.java.en.Then;

public class Adminsteps extends UtilityTest {
	
	@Then("Page should contains {string}")
	public void page_should_contains(String expectedErrorMessage) {
		String actualErrorMessage = driver.getPageSource();
		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));

	}
}
