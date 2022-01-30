package com.pb.cucumbertest.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.pb.cucumbertest.common.Base;
import com.pb.cucumbertest.pagemodules.FirstPOM;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class FirstSD {
	Base base;
	FirstPOM firstPOM;
	WebDriver driver;
	Scenario scenario;

	
	public FirstSD(Base base)
	{
		this.base = base;
		this.driver = base.getDriver();
		this.scenario = base.getScenario();
		firstPOM = new FirstPOM(base);
	}
	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
	    driver.get("https://www.programsbuzz.com");
	}

	@Given("I click on login link")
	public void i_click_on_login_link() {
		ExtentCucumberAdapter.addTestStepLog("****clicked on login***");
		scenario.log("scenario abababababa ");

	  firstPOM.clickLoginLnk();

	}
}
