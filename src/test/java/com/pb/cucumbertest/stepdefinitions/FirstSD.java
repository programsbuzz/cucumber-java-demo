package com.pb.cucumbertest.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.pb.cucumbertest.common.Base;
import com.pb.cucumbertest.pagemodules.FirstPOM;

import io.cucumber.java.en.Given;

public class FirstSD {
	Base base;
	FirstPOM firstPOM;
	WebDriver driver;
	
	public FirstSD(Base base)
	{
		this.base = base;
		this.driver = base.getDriver();
		firstPOM = new FirstPOM(base);
	}
	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
	    driver.get("https://www.programsbuzz.com");
	}

	@Given("I click on login link")
	public void i_click_on_login_link() {
	  firstPOM.clickLoginLnk();
	}
}
