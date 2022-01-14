package com.pb.cucumbertest.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pb.cucumbertest.common.Base;

import io.cucumber.java.en.When;

public class SecondSD 
{
	WebDriver driver;
	Base base;
	
	public SecondSD(Base base)
	{
		this.base = base;
	}
	
	@When("I click on login link")
	public void i_click_on_login_link() {
	    base.getDriver().findElement(By.linkText("LOG IN")).click();
	}

}

