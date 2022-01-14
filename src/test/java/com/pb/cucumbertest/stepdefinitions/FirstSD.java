package com.pb.cucumbertest.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.pb.cucumbertest.common.Base;

import io.cucumber.java.en.When;

public class FirstSD 
{
	WebDriver driver;
	Base base;
	
	public FirstSD(Base base)
	{
		this.base = base;
	}
	
	@When("I visit the homepage")
	public void i_visit_the_homepage() {
	    base.getDriver().get("https://www.programsbuzz.com");
	}
	
}


