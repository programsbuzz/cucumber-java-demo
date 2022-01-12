package com.pb.cucumbertest.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.pb.cucumbertest.common.Base;

import io.cucumber.java.en.Then;

public class FirstSD {
	
	private WebDriver driver;
	Base base;
	
	public FirstSD(Base base)
	{
		this.base = base;
	}
	
	@Then("I visit the homepage")
	public void increment()
	{
		base.getDriver().get("https://www.programsbuzz.com");
	}

}
