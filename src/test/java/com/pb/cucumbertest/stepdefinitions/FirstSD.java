package com.pb.cucumbertest.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pb.cucumbertest.common.Base;
import com.pb.cucumbertest.pagemodules.FirstPOM;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class FirstSD  {
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
	
//	@Given("^I am on the homepage$")
//	public void homepage1() {
//	    driver.get("https://www.programsbuzz.com");
//	}
	

	

//	
//	@Given("I click on login link")
//	public void i_click_on_login_link() {
////		ExtentCucumberAdapter.addTestStepLog("****clicked on login***");
//
//	  firstPOM.clickLoginLnk();
//
//	}
	
//	@When("I click {string} button")
//	public void i_click_button(String string) {
//
//	}
	
	
	@Then("I should see {string} Heading")
	public void i_should_see_heading(String string) {

	}

	@Then("I should not see {string} Heading")
	public void i_should_not_see_heading(String string) {
	 
	}
	
	@When("I click on Ask Doubt link")
	public void i_click_on_ask_doubt_link() {
		driver.findElement(By.cssSelector("a[href='/ask-doubt']")).click();
		int a = 10/0;
	   
	}
}
